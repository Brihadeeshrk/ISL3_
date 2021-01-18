/*
Primitive operations on Linear Queue using arrays.
*/
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

#define CAPACITY 100

int queue[CAPACITY];
unsigned int size = 0;
unsigned int rear = CAPACITY - 1; 
unsigned int front = 0;

int enqueue(int data);
int dequeue();
int getRear();
int getFront();

int main() {
    int ch, data;
    while (1) {
        printf("1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Size\n");
        printf("4. Get Rear\n");
        printf("5. Get Front\n");
        printf("0. Exit\n");
        scanf("%d", &ch);
        switch (ch) {
        case 1:
            printf("\nEnter data to enqueue: ");
            scanf("%d", &data);
            if (enqueue(data))
                printf("Element added to queue.");
            else
                printf("Queue is full.");

            break;

        case 2:
            data = dequeue();
            if (data == INT_MIN)
                printf("Queue is empty.");
            else
                printf("Data => %d", data);

            break;

        case 3:
            if (size == 0)
                printf("Queue is empty.");
            else
                printf("Queue size => %d", size);

            break;

        case 4:

            if (size == 0)
                printf("Queue is empty.");
            else
                printf("Rear => %d", getRear());

            break;

        case 5:

            if (size == 0)
                printf("Queue is empty.");
            else
                printf("Front => %d", getFront());

            break;

        case 0:
            printf("Exiting from app.\n");
            exit(0);

        default:
            printf("Invalid choice, please input number between (0-5).");
            break;
        }

        printf("\n\n");
    }
}

int enqueue(int data) {
    if (size == CAPACITY) return 0;

    rear = (rear + 1) % CAPACITY;
    size++;

    queue[rear] = data;
    return 1;
}

int dequeue() {
    int data = INT_MIN;

    if (size == 0) return INT_MIN;

    data = queue[front];
    front = (front + 1) % CAPACITY;
    size--;
    return data;
}

int getFront() {
    return (size == 0)
               ? INT_MIN
               : queue[front];
}


int getRear() {
    return (size == 0)
               ? INT_MIN
               : queue[rear];
}