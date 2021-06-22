
public class Example {


public void method1() {
System.out.println("First execution");
}

public void method2() {
System.out.println("second execution");
}

static class Runtimepoly1 extends Example {

public void method1() {
System.out.println("Third execution");
}

public void method2() {
System.out.println("Fourth execution");
}
}
public static void main(String[] args) {

Example ref= new Runtimepoly1();
ref.method1();
ref.method2();
}

}
