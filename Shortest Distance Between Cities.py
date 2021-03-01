from tkinter import *
from math import *
from time import *

def drawGraph(cities,d,pre,src,dst,srctodst):
    screen=Tk()
    screen.geometry("640x480")
    screen.title("Floyd Warshall Algorithm Graphical Representation")
    c=Canvas(screen,height=480,width=640,bg="light blue")
    c.pack()
    noc=len(cities)
    angle=2*3.142/noc
    ver=[]
    for i in range(1,noc+1):
        ver.append([])
        x=320+200*sin(i*angle)
        ver[i-1].append(x)
        y=240+200*cos(i*angle)
        ver[i-1].append(y)
        if(i==src):
            l=Label(text=cities[i],bg='red')
        elif(i==dst):
            l=Label(text=cities[i],bg='yellow')
        else:
            l=Label(text=cities[i],bg='light blue')
        if(y>=240):
            l.place(x=x-len(cities[i])*4,y=y+15)
        else:
            l.place(x=x-len(cities[i])*4,y=y-25)
    l=Label(text='  ',bg='red')
    l.place(x=560,y=400)
    l=Label(text='Source',bg='light blue')
    l.place(x=570,y=400)
    l=Label(text='  ',bg='yellow')
    l.place(x=560,y=430)
    l=Label(text='Destination',bg='light blue')
    l.place(x=570,y=430)
    for i in range(noc):
        for j in range(noc):
            if(d[i][j]!=infi):
                if(d[j][i]==infi):
                    l=Label(text=str(d[i][j]),bg='light blue')
                else:
                    l=Label(text=str(d[i][j])+'A , '+str(d[j][i])+'C',bg='light blue')
                if((i+1) in srctodst and (i+1) not in srctodst[len(srctodst)-1::]):
                    if((j+1)==srctodst[srctodst.index(i+1)+1]):
                        continue
                o=c.create_line(ver[i][0],ver[i][1],ver[j][0],ver[j][1],arrow='first')
                if(str(d[i][j])+'A , '+str(d[j][i])+'C'!='0A , 0C'):
                    l.place(x=(ver[i][0]+ver[j][0])/2,y=(ver[i][1]+ver[j][1])/2)
    for i in range(len(srctodst)-1):
        o=c.create_line(ver[srctodst[i]-1][0],ver[srctodst[i]-1][1],ver[srctodst[i+1]-1][0],ver[srctodst[i+1]-1][1],arrow='last',fill='red')

def floydWarshall(cities,d,pre,n):
    s1=input("Enter the source city. Enter X if no particular source\n")
    d1=input("Enter the destination city. Enter X if no particular destination\n")
    kl=list(cities.keys())
    vl=list(cities.values())
    if(s1 in cities.values()):
        src=kl[vl.index(s1)]
    else:
        print("Invalid Source City Encountered")
        src=0
    if(d1 in cities.values()):
        dst=kl[vl.index(d1)]
    else:
        print("Invalid Destination City Encountered")
        dst=0
    d1=[[infi for i in range(n)]for j in range(n)]
    pre1=[[infi for i in range(n)]for j in range(n)]
    for k in range(n-1):
        for i in range(n):
            for j in range(n):
                d1[i][j]=0
                pre1[i][j]=0
        for i in range(n):
            for j in range(n):
                if(d[i][k]+d[k][j]<=d[i][j]):
                    d1[i][j]=d[i][k]+d[k][j]
                    if(pre[i][k]!=infi and pre[k][j]!=infi):
                        pre1[i][j]=pre[k][j]
                    else:
                        pre1[i][j]=pre[i][j]
                else:
                    d1[i][j]=d[i][j]
                    pre1[i][j]=pre[i][j]
        for i in range(n):
            for j in range(n):
                d[i][j]=d1[i][j]
                pre[i][j]=pre1[i][j]
    srctodst=printPath(cities,pre,n,src,dst)
    drawGraph(cities,d,pre,src,dst,srctodst)

def printPath(cities,pre,n,src,dst):
    srctodst=[]
    revpath=[[inf for i in range(n)]for j in range(n)]
    for i in range(n):
        for j in range(n):
            if(i!=j):
                if(pre[i][j]==infi):
                    print("{} is not reachable from {}".format(cities[j+1],cities[i+1]))
                else:
                    k=pre[i][j]
                    c=0
                    print("Minimum Cost Path from {} to {}   ".format(cities[i+1],cities[j+1]),end='')
                    revpath[c]=j
                    c=c+1
                    while(k!=i):
                        revpath[c]=k
                        c=c+1
                        k=pre[i][k]
                    revpath[c]=i
                    c=c+1
                    for m in range(c-1,-1,-1):
                        print(' -',cities[revpath[m]+1],end='')
                        if(src==i+1 and dst==j+1):
                            srctodst.append(revpath[m]+1)
                    print()
    return srctodst

def initialize(cities,d,pre,n):
    for i in range(n):
        cities[i+1]=input("Enter the name of city "+str(i+1)+"\n")
    for i in range(n):
        for j in range(n):
            if(i!=j):
                d[i][j]=input("Enter the cost from "+cities[i+1]+" to "+cities[j+1]+". Enter X if not reachable\n")
                if(d[i][j].isnumeric()):
                    d[i][j]=int(d[i][j])
                elif(d[i][j]=='X'):
                    d[i][j]=infi
                else:
                    print("Invalid Character Encountered. Please Enter Numbers As Costs")
            else:
                d[i][j]=0
    for i in range(0,n):
        for j in range(0,n):
            if(d[i][j]==infi or d[i][j]==0):
                pre[i][j]=infi
            else:
                pre[i][j]=i

infi=float('inf')
n=int(input("Enter the number of cities\n"))
cities={}
d=[[infi for i in range(n)]for j in range(n)]
pre=[[infi for i in range(n)]for j in range(n)]
initialize(cities,d,pre,n)
floydWarshall(cities,d,pre,n)
