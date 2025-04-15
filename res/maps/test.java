class A{
public void doA() {
B b = new B();
b.dobB();
System.out.print("doA");
}
}
class B{
public void dobB() {
C c = new C();
c.doc();
System.out.print("doB");
}
}
class C{
public void doc() {
if (true)
throw new NullPointerException();
System.out.print("doc");
}
}
public class Test{
public static void main(String args[]) {
try {
A a = new A();
a.doA();
} catch (Exception ex) {

System.out.print("error");
}
}
}