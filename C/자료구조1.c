typedef struct _node {
    int data;
    struct _node * next;
    struct _node * prev;
} Node;

typedef struct _list {
    Node * head;
    Node * tail;
    int count;
} List;

int IsEmpty(List *lst) {
    if (lst->count==0)
        return 1;
    else
        return 0;
}
void InsertTail(List *lst, int data) {  // 주어진 list의 가장 마지막에 새로운 data를 추가
    Node * newNode=(Node*)malloc(sizeof(Node));
    newNode->data=data;
    if (IsEmpty(lst)==1)
    {
        newNode->next=NULL;
        newNode->prev=NULL;
        lst->head=newNode;
        lst->tail=newNode;
        
    }
    else
    {
        lst->tail->next=newNode;
        
        newNode->next=NULL;
        newNode->prev=lst->tail;
        lst->tail=newNode;
    }
    (lst->count)++;
}
void InsertHead(List *lst, int data){  // 주어진 list의 가장 처음에 새로운 data를 추가
    Node * newNode=(Node*)malloc(sizeof(Node));
    newNode->data=data;
    
    if(IsEmpty(lst)==1)
    {
        newNode->next=NULL;
        newNode->prev=NULL;
        lst->head=newNode;
        lst->tail=newNode;
       
    }
    else
    {
       lst->head->prev=newNode;
       
       newNode->prev=NULL;
       newNode->next=lst->head;
      
       lst->head=newNode;
    }    
    (lst->count)++;
}

 


void PrintListBackward(List *lst) {	// 주어진 List에 대해서 마지막 항목부터 역순으로 출력
    Node * cur=(Node*)malloc(sizeof(Node));

    cur=lst->tail;

    
    while(IsEmpty(lst)!=1){ 
        printf("%d ",(cur->data));
        cur=cur->prev;
        (lst->count)--;
    }
 
    free(cur);
    
}




void InsertAt(List *lst, int data, int index){
    
    if(index < 0 || index > (lst->count) ){
        printf("error\n");
        return;
    }
    
    Node * at=(Node*)malloc(sizeof(Node));
    at->data=data;
    
    int i=0;
    
    //when index ==0, deal with a head node. 
    
    if(index==0){   
        InsertHead(lst, data);
        return;
    }
    else if (index==(lst->count)){
       InsertTail(lst, data);
       return;
    }
    
    else{
        Node * now=(Node*)malloc(sizeof(Node));
        now=lst->head->next;
        
        for (i=1; i<(lst->count); i++){
            
            if(i==index){
                at->prev=now->prev;
                
                now->prev=at;
                at->next=now;
                
                at->prev->next=at;
                (lst->count)++;
                return;
            }
            else now=now->next;
        }
        free(now);
    }
    
    free(at);
}
