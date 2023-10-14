public class myStack<T> {
    int top;
    T[] arr;

    myStack(){
        top=-1;
        arr=(T[]) new Object[1000];
    }

    public void addEle(T num){
        top=top+1;
        if(top==1000){
            throw new ArrayIndexOutOfBoundsException("Stack is Full! Pop few elements!!");
        }
        else{
            arr[top]=num;
        }

    }
    public void popEle(){
        if(top==-1){
            throw new ArrayIndexOutOfBoundsException("Stack is Empty! Add new elements!!");
        }
        else{
            top=top-1;
        }
    }
    public T peek(){
        if(top==-1){
            throw new IndexOutOfBoundsException("Stack is Empty! Add new elements!!");
        }
        else{
            return arr[top];
        }
    }
    public boolean isEMPTY(){
        return top==-1;
    }
    public int siz(){
        return top+1;
    }


}
