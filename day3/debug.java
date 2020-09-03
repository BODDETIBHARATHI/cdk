class Stack {
    int top;
    String[] s = new String[10];
    
    public void push(String i){
  	  s[++top] = i;
    }
    
    public String pop(){
  	  return s[top--];
    }
    
    public String top1(){
  	  return s[top];
    }
    
    public boolean isEmpty(){
  	  return (top == -1);
    }
    
}
public class Lab2 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("Is empty = " + stack.isEmpty());
		stack.push("aaa");
		System.out.println("Pop = " + stack.pop());
		System.out.println("Is empty = " + stack.isEmpty());

	}

}
