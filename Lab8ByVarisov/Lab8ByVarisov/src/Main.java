public class Main {
    public static void main(String[] args) {
        MyIntStack myIntStack = new MyIntArrayStack(10);

        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.push(3);

        System.out.println(myIntStack.peek());
        System.out.println(myIntStack.pop());
        System.out.println(myIntStack.peek());
    }
}