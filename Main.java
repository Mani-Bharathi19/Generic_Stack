public class Main {
    public static void main(String[] args) {
        myStack<Integer>ms=new myStack<>();
        ms.addEle(5);
        ms.addEle(32);
        ms.addEle(47);
        System.out.println(ms.peek());
        ms.popEle();
        System.out.println(ms.peek());
        System.out.println(ms.siz());
        System.out.println(ms.isEMPTY());
    }
}