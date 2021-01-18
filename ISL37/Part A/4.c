/*
Implement the following using recursion
a) Tower of Hanoi
b) Binary search
c) GCD
*/

#include <stdio.h>

void tower(int n, char f, char t, char aux) {
    if(n == 1) {
        printf("\nmove %d from %c to %c", n, f, t);
        return;
    }
    tower(n, f, aux, t);
    printf("\nmove %d from %c to %c", n, f, t);
    tower(n, aux, t, f);
}

int gcd(int n1, int n2) {
    if(n2 == 0 || n2 == 1) return n1;
    else return(n2, n1%n2);
}

int search(int array[], int size, int key) {
    int location;
    if (array[size] == key) return size;
    else if (size == -1) return -1;
    else
        return (location = search(array, size - 1, key));
}

int main(){
    int ch;
    while(1) {
        printf("\n1. tower of hanoi");
        printf("\n2. binary search");
        printf("\n3. gcd");
        printf("\n4. exit");
        scanf("%d", &ch);
        if(ch == 4) break;
        switch (ch) {
        case 1:
            int n;
            printf("\nenter no: of disks");
            scanf("%d", &n);
            tower(n, 'a', 'c', 'b');
            break;
        
        case 2:
            int a[100];
            printf("Enter search ele");
            int key;
            scanf("%d", &key);
            search(a, 100, key);
            break;

        case 3:
            int n1, n2;
            printf("enter n1 and n2");
            scanf("%d%d", &n1, &n2);
            gcd(n1, n2);
            break;
            
        default:
            break;
        }
    }
}