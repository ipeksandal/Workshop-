import java.util.Stack;
public class Soru2 {
    public static void main(String[] args) {
       Stack<Integer> yigin = new Stack<>();
       yigin.push(3);
       yigin.push(23);
       yigin.push(27);
       yigin.push(73);
       yigin.push(2);
       yigin.push(9);
       if (!yigin.isEmpty()){
           int min = minimumBul(yigin);
           int maks =  maksimumBul(yigin);
           System.out.println("Yığının minimum elemanı : " + min);
           System.out.println("Yığının maksimum elemanı : " + maks);
       }else
           System.out.println("Yığında eleman yoktur.");
    }
    public static int minimumBul(Stack<Integer> yigin){
        int minimum = yigin.peek();
        for (int e : yigin){
            if(e < minimum)
                minimum = e;
        }return minimum;
    }
    public static int maksimumBul(Stack<Integer> yigin){
        int maksimum = yigin.peek();
        for (int e : yigin){
            if (e > maksimum)
                maksimum = e;
        }return maksimum;
    }
}
