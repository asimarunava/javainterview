package inter.module;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("hello");
        new Example1().createTree2();
    }

    public void createTree()
    {
        System.out.println("Tree is created");
    }
    public void createTree2()
    {
        this.createTree();
    }
}
