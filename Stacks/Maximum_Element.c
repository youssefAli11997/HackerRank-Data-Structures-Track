#include <stdio.h>

int top=-1;
int stack[100000];

int topElement(){
	return stack[top];
}

void push(int num){
	if(top<100000)
		stack[++top] = num;
}

void pop(){
	if(top>-1)
		 top--;
}

int getMax(){
	int max;
	if(top!=-1){
		max = stack[0];
		for(int i=0; i<=top; i++)
			if(stack[i]>max)
				max = stack[i];
	}else
		max = -1;
	return max;
}

int main(){

	int q,i,max=-1;
	scanf("%d",&q);
	for(i=0; i<q; i++){
		int x;
		scanf("%d",&x);
		if(x==1){
			scanf("%d",&x);
			push(x);
			if(x>max)
				max = x;
		}else if(x==2){
			int y = topElement();
			pop();
			if(y==max)
				max = getMax();
		}else if(x==3){
			printf("%d\n",max);
		}
	}
	
	return 0;
}
