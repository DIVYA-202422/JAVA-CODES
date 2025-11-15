import java.util.Scanner;
class BaseException extends Exception {
    BaseException(String msg) {
        super(msg);
    }
}
class LevelTwoException extends BaseException {
    LevelTwoException(String msg) {
        super(msg);
    }
}
class LevelThreeException extends LevelTwoException {
    LevelThreeException(String msg) {
        super(msg);
    }
}
class A {
    void show() throws BaseException {
        throw new BaseException("Exception from class A (Base Level).");
    }
}
class B extends A {
        void show() throws LevelTwoException {
        throw new LevelTwoException("Exception from class B (Level Two).");
    }
}
class C extends B {
    void show() throws LevelThreeException {
        throw new LevelThreeException("Exception from class C (Level Three).");
    }
}
class ExceptionHierarchyDemo {
    public static void main(String[] args) {
    System.out.println("DIVYA 24CSU357");
        A obj = new C();         try {
            obj.show();
        } catch (BaseException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}