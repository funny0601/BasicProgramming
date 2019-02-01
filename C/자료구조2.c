void Insert(Tree *tree, int data){
    Node *temp=(Node *)malloc(sizeof(Node));

    if(tree->root ==NULL){
	    tree->root=temp;
	    temp->left=NULL;
	    temp->right=NULL;
	    temp->data=data;
	    return;
    }

    temp->left = NULL;
    temp->right=NULL;
    temp->data=data;
    Node* cur=tree->root;

    while(1){
        if(cur->data <= data){
            if(cur->right==NULL){
                cur->right=temp;
                return;
            }
            cur=cur->right;
        }
        else if (cur->data > data){
            if (cur->left==NULL){
                cur->left=temp;
                return;
            }
            cur=cur->left;
        }
    }
}
void PrintReverse(Node *node){
  if (node==NULL)
      return;
  PrintReverse(node->right);
  printf("%d ", node->data);
  PrintReverse(node->left);

}
