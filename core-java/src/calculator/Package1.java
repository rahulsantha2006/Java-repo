package calculator;


public class Package1 {

    public int add(int a, int b){
        return a+b;
    }

    public static void main(String []args){
        Package1 obj = new Package1();
        System.out.println(obj.add(100,200));
    }
}
