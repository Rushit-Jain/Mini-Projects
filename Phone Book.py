def addEntry():
    name=input("Enter the name to be added:")
    name=name.lower()
    phbk[name]=input("Enter the Phone Number:")
    print("Entry added successfully")
    global count
    count+=1
    
def deleteEntry():
    namedel=input("Enter the entry to be deleted:")
    delcount=0
    for key in phbk:
        if(key==namedel):
            phbk[namedel]=''
            phbk['']=phbk.pop(namedel)
            print("Entry deleted successfully")
            global count
            count-=1
        else:
            delcount+=1
    if(delcount>=count):
        print("Entry does not exist, no deletion done")
        
def searchEntry():
    namesearch=input("Enter the name to be searched:")
    seacount=0
    namesearch=namesearch.lower()
    for key in phbk:
        if(key==namesearch and namesearch!=''):
            print("Entry found")
            print(namesearch,':',phbk[namesearch])
        else:
            seacount+=1
    if(seacount>=count):
        print("Entry does not exist")
        
def printPhbk():
    print("The phone-book is:")
    for key in phbk:
        if(key!=''):
            print(key,':',phbk[key])
    
count=0
phbk={}
print("This is a phone-book program")
c='Y'
while(c=='Y' or c=='y'):
    print("Press 1 to add an entry")
    print("Press 2 to delete an entry")
    print("Press 3 to search an entry")
    print("Press 4 to display the phone-book")
    print("Press 0 to end the program")
    ch=int(input("Enter Your Choice:"))
    if(ch==1):
        addEntry()
    elif(ch==2):
        deleteEntry()
    elif(ch==3):
        searchEntry()
    elif(ch==4):
        printPhbk()
    elif(ch==0):
        break
    else:
        print("Invalid Choice")
    print("Do you want to continue ?")
    c=input("Enter Y to continue or any other character to terminate:")
    if(c=='y' or c=='Y'):
        continue
    else:
        break
print("Thank You")


    


       

        
        
