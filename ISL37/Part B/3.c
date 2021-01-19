/*
Singly Linked List with the following operations:
a. Inserting a node( Any desired position)
b. Deleting a node (Any desired position)
c. Display
*/

#include <stdio.h>
#include <stdlib.h>

/* Structure of a node */
struct node
{
    int data;          // Data
    struct node *next; // Address
} * head;

void createList(int n);
void insertNodeAtMiddle(int data, int position);
void deleteMiddleNode(int position);
void displayList();

int main()
{
    int n, data, position;
    printf("Enter the total number of nodes: ");
    scanf("%d", &n);
    createList(n);

    printf("\nData in the list \n");
    displayList();

    printf("nEnter data to insert at middle of the list: ");
    scanf("%d", &data);
    printf("Enter the position to insert new node: ");
    scanf("%d", &position);
    insertNodeAtMiddle(data, position);

    printf("\nData in the list \n");
    displayList();

    printf("\nEnter the node position you want to delete: ");
    scanf("%d", &position);

    /* Delete middle node from list */
    deleteMiddleNode(position);
    printf("\nData in the list \n");
    displayList();

    return 0;
}

void deleteMiddleNode(int position)
{
    int i;
    struct node *toDelete, *prevNode;

    if (head == NULL)
    {
        printf("List is already empty.");
    }
    else
    {
        toDelete = head;
        prevNode = head;

        for (i = 2; i <= position; i++)
        {
            prevNode = toDelete;
            toDelete = toDelete->next;

            if (toDelete == NULL)
                break;
        }

        if (toDelete != NULL)
        {
            if (toDelete == head)
                head = head->next;

            prevNode->next = toDelete->next;
            toDelete->next = NULL;

            /* Delete nth node */
            free(toDelete);

            printf("SUCCESSFULLY DELETED NODE FROM MIDDLE OF LIST\n");
        }
        else
        {
            printf("Invalid position unable to delete.");
        }
    }
}

void createList(int n)
{
    struct node *newNode, *temp;
    int data, i;

    head = (struct node *)malloc(sizeof(struct node));

    /*
     * If unable to allocate memory for head node
     */
    if (head == NULL)
    {
        printf("Unable to allocate memory.");
    }
    else
    {
        /*
         * Input data of node from the user
         */
        printf("Enter the data of node 1: ");
        scanf("%d", &data);

        head->data = data; // Link the data field with data
        head->next = NULL; // Link the address field to NULL

        temp = head;

        /*
         * Creates n nodes and adds to linked list
         */
        for (i = 2; i <= n; i++)
        {
            newNode = (struct node *)malloc(sizeof(struct node));

            /* If memory is not allocated for newNode */
            if (newNode == NULL)
            {
                printf("Unable to allocate memory.");
                break;
            }
            else
            {
                printf("Enter the data of node %d: ", i);
                scanf("%d", &data);

                newNode->data = data; // Link the data field of newNode with data
                newNode->next = NULL; // Link the address field of newNode with NULL

                temp->next = newNode; // Link previous node i.e. temp to the newNode
                temp = temp->next;
            }
        }

        printf("SINGLY LINKED LIST CREATED SUCCESSFULLY\n");
    }
}

void insertNodeAtMiddle(int data, int position)
{
    int i;
    struct node *newNode, *temp;

    newNode = (struct node *)malloc(sizeof(struct node));

    if (newNode == NULL)
    {
        printf("Unable to allocate memory.");
    }
    else
    {
        newNode->data = data; // Link data part
        newNode->next = NULL;

        temp = head;
        for (i = 2; i <= position - 1; i++)
        {
            temp = temp->next;

            if (temp == NULL)
                break;
        }

        if (temp != NULL)
        {
            /* Link address part of new node */
            newNode->next = temp->next;

            /* Link address part of n-1 node */
            temp->next = newNode;

            printf("DATA INSERTED SUCCESSFULLY\n");
        }
        else
        {
            printf("UNABLE TO INSERT DATA AT THE GIVEN POSITION\n");
        }
    }
}

void displayList()
{
    struct node *temp;

    if (head == NULL)
    {
        printf("List is empty.");
    }
    else
    {
        temp = head;
        while (temp != NULL)
        {
            printf("Data = %d\n", temp->data); 
            temp = temp->next;
        }
    }
}