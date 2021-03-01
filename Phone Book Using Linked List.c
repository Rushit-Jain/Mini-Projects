#include <stdio.h>
#include <string.h>
#include <malloc.h>
#include <stdlib.h>

struct node
{
    char fn[30],ln[30],ph[10];
    struct node* next;
};
struct node* start=NULL;

void addEntry()
{
    struct node *ptr,*preptr;
    struct node* add=(struct node*)malloc(sizeof(struct node));
    printf("Enter first name\n");
    scanf("%s",add->fn);
    printf("Enter last name\n");
    scanf("%s",add->ln);
    printf("Enter telephone number\n");
    scanf("%s",add->ph);
    add->next=NULL;
    if(start==NULL)
        start=add;
    else
    {
        ptr=start;
        preptr=ptr;
        while(strcmp(add->fn,ptr->fn)>0)
        {
            preptr=ptr;
            ptr=ptr->next;
            if(ptr==NULL)
                break;
        }
        if(ptr==start)
        {
            add->next=start;
            start=add;
        }
        else if(ptr==NULL)
            preptr->next=add;
        else
        {
            add->next=ptr;
            preptr->next=add;
        }
    }
    printf("Entry added successfully\n\n");
}

void deleteEntry()
{
    char sd[30];
    struct node *ptr,*preptr;
    ptr=start;
    preptr=ptr;
    printf("Enter the first name of the entry to be deleted\n");
    scanf("%s",sd);
    while(strcmp(sd,ptr->fn)!=0)
    {
        preptr=ptr;
        ptr=ptr->next;
        if(ptr==NULL)
            break;
    }
    if(ptr==NULL)
        printf("Entry not found in directory\n\n");
    else if(ptr==start)
    {
        start=NULL;
        free(ptr);
    }
    else
    {
        preptr->next=ptr->next;
        free(ptr);
        printf("Entry deleted successfully\n\n");
    }
}

void editEntry()
{
    int c;
    char se[30];
    struct node *ptr;
    ptr=start;
    printf("Enter the first name of the entry to be edited\n");
    scanf("%s",&se);
    while(strcmp(se,ptr->fn)!=0)
    {
        ptr=ptr->next;
        if(ptr==NULL)
            break;
    }
    if(ptr==NULL)
        printf("Entry does not exist\n\n");
    else
    {
        edit : printf("Enter 1 to edit first name\n");
        printf("Enter 2 to edit last name\n");
        printf("Enter 3 to edit the telephone number\n");
        scanf("%d",&c);
        switch(c)
        {
            case 1:
                printf("Enter the edited first name\n");
                scanf("%s",ptr->fn);
                printf("Entry edited successfully\n\n");
                break;
            case 2:
                printf("Enter the edited last name\n");
                scanf("%s",ptr->ln);
                printf("Entry edited successfully\n\n");
                break;
            case 3:
                printf("Enter the edited telephone number\n");
                scanf("%s",ptr->ph);
                printf("Entry edited successfully\n\n");
                break;
            default:
                printf("Invalid Choice. Please Retry\n");
                goto edit;
        }
    }
}

void searchEntry()
{
    int c;
    char sn[30];
    struct node *ptr;
    ptr=start;
    invalid : printf("Enter 1 to search by name or 2 to search by number\n");
    scanf("%d",&c);
    if(c==1)
    {
        printf("Enter the first name\n");
        scanf("%s",sn);
        while(strcmp(sn,ptr->fn)!=0)
        {
            ptr=ptr->next;
            if(ptr==NULL)
            {
                printf("Entry Not Found\n\n");
                break;
            }
        }
        if(ptr!=NULL)
        {
            printf("Entry found\n");
            printf("First Name: %s\n",ptr->fn);
            printf("Last Name: %s\n",ptr->ln);
            printf("Telephone Number: %s\n\n",ptr->ph);
        }
    }
    else if(c==2)
    {
        printf("Enter the phone number\n");
        scanf("%s",sn);
        while(strcmp(sn,ptr->ph)!=0)
        {
            ptr=ptr->next;
            if(ptr==NULL)
            {
                printf("Entry Not Found\n\n");
                break;
            }
        }
        if(ptr!=NULL)
        {
            printf("Entry found\n");
            printf("First Name: %s\n",ptr->fn);
            printf("Last Name: %s\n",ptr->ln);
            printf("Telephone Number: %s\n\n",ptr->ph);
        }
    }
    else
    {
        printf("Invalid Choice. Please Retry\n");
        goto invalid;
    }
}

void displayDirectory()
{
    struct node *ptr;
    ptr=start;
    if(ptr==NULL)
        printf("Directory is empty\n\n");
    else
    {
        printf("FIRST NAME\t\tLAST NAME\t\tPHONE NUMBER\n");
        while(ptr!=NULL)
        {
            printf("%s\t\t\t",ptr->fn);
            printf("%s\t\t\t",ptr->ln);
            printf("%s\n\n",ptr->ph);
            ptr=ptr->next;
        }
    }
}

void main()
{
    printf("PHONE DIRECTORY\n\n");
    int c;
    do
    {
        printf("Enter a choice\n");
        printf("1. Add an entry\n");
        printf("2. Delete an entry\n");
        printf("3. Edit an entry\n");
        printf("4. Search the directory\n");
        printf("5. Display the directory\n");
        printf("0. Exit\n");
        scanf("%d",&c);
        switch(c)
        {
            case 1:
                addEntry();
                break;
            case 2:
                deleteEntry();
                break;
            case 3:
                editEntry();
                break;
            case 4:
                searchEntry();
                break;
            case 5:
                displayDirectory();
                break;
            default:
                if(c!=0)
                    printf("Invalid Choice. Please Retry\n\n");
        }
    } while(c!=0);
    printf("Thank You\n");
}
