public class FizzBuzz {
  public static void main(String args[]) {

    String replace = "";
    boolean r = false;

    for(int i=0; i<=100; i++){
        replace = "";
        if(i%3==0){
            replace="Fizz";
            r= true;
        }
        if(i%5==0){
            replace=replace+"Buzz";
            r= true;
        }
        
        if(replace==""){
            System.out.println(i);
        } else {
            System.out.println(replace);
        }
        
    }

  }
}