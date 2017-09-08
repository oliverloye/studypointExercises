package calc;

public class Calculator {
   public int add(int i1, int i2){
     return i1+i2;
   }
   public int sub(int i1, int i2){
     return i1-i2;
   }
   public int mul(int i1, int i2){
     return i1*i2;
   }
   public int div(int i1, int i2){
     return i1/i2;
   }
   
   public static void main(String[] args) {
     System.out.println("Add: "+new Calculator().add(10, 10));
  }
}