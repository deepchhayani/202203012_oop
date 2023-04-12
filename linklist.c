#include <stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
void printList(struct Node *ptl)
{
    while(ptl!=NULL)
    {
        
        printf("%d ",ptl->data);
        ptl=ptl->next;
    }
    printf("\n");
}
struct Node *insertAtIndex(struct Node *head,int data,int index)
{
    struct Node *ptl=(struct Node*)malloc(sizeof(struct Node));
    struct Node *p=head;
    int i=0;
    while(i!=index-1)
    {
        p=p->next;
        i++;
    }
    ptl->data=data;
    ptl->next=p->next;
    p->next=ptl;
    return head;
}
struct Node * insertAtFirst(struct Node *head, int data){
    struct Node * ptl = (struct Node *) malloc(sizeof(struct Node));
    ptl->data = data;
    ptl->next = head;
    return ptl; 
}
struct Node * insertAtEnd(struct Node *head, int data){
    struct Node * ptl = (struct Node *) malloc(sizeof(struct Node));
    ptl->data = data;
    struct Node * p = head;
 
    while(p->next!=NULL){
        p = p->next;
    }
    p->next = ptl;
    ptl->next = NULL;
    return head;
}
struct Node *deleteAtIndex(struct Node *head,int index)
{
    struct Node *p=head;
    struct Node *q=head->next;
    for(int i=0;i<index-1;i++)
    {
        p=p->next;
        q=q->next;
    }
    p->next=q->next;
    free(q);
    return head;
}

struct Node *deleteAtFirst(struct Node *head){
    head=head->next;
    return head;
}
struct Node *deleteAtLast(struct Node *head){
    struct Node * p =head;
    struct Node *q=head->next;
    while(q->next!=NULL)
    {
        p=q;
        q=q->next;
    }
    p->next=NULL;
}
int main()
{
    struct Node *head;
    struct Node *second;
    struct Node *third;
    head=(struct Node *)malloc(sizeof(struct Node));
    second=(struct Node *)malloc(sizeof(struct Node));
    third=(struct Node *)malloc(sizeof(struct Node));
    head->data=20;
    head->next=second;
    second->data=30;
    second->next=third;
    third->data=40;
    third->next=NULL;
    printList(head);
    insertAtIndex(head,50,1);
    printList(head);
    deleteAtLast(head);
    head=insertAtFirst(head,4);
    printList(head);
    return 0;
}