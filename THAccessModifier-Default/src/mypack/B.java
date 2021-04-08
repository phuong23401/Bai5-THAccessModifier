package mypack;

import pack.*;

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.msg(); //phạm vi của lớp A và phương thức msg() là default để nó không thể được truy cập từ bên ngoài Package.
    }
}
