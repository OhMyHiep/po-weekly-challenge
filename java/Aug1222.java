import java.util.ArrayList;

public class Aug1222 {
    public static void main (String[] args){
        Aug1222 hw =new Aug1222();
        // long qua= hw.quadraticEquation(1,-1,0);
        // System.out.println(qua);

        System.out.println(hw.checkPerfect(97));
    }

    //computes only the + of the quadratic equation
    public long quadraticEquation(double a, double b, double c){
        // x=(-b+-(b^2-4ac)^(1/2))/2a
        double negB=-1*b;
        double deter=Math.sqrt(b*b-(4*a*c));
        double detnom=2*a;
        return Math.round((negB+deter)/detnom);
    } 
    

    //check if factors of a number add to that number, includes 1 but exclude the number
    public Boolean checkPerfect(Integer num){
        double sqrt=Math.sqrt(num);
        ArrayList<Integer> factors=new ArrayList<>();
        factors.add(1);
        for(int i=2;i<sqrt;i++){
            if(num % i==0){
                factors.add(num/i);
                factors.add(num/(num/i));
            }
        }
        Integer otherNum=factors.stream()
            .mapToInt(Integer::valueOf)
            .sum();
        System.out.println(otherNum);
        return otherNum.compareTo(num)==0;
    }

}


