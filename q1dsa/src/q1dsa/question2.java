package q1dsa;
import java.util.ArrayList;
import java.util.List;
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        int n,i,r,arm,sum;
        List<Integer> in = new ArrayList<>();
        for(i=min;i<=max;i++){
            n=i;
            arm = n;sum=0;
            while(n!=0){
                r = n%10;
                n = n/10;
                sum = sum + r*r*r;
            }
            if(sum==arm){
                in.add(sum);
            }
        }
        System.out.println(in);
        return new int[0];
    }
}

public class question2 {

	public static void main(String[] args) {
		int min = 100;int max = 999;
        ArmstrongNumBetweenRange arm = new ArmstrongNumBetweenRange();
        arm.armstrongNumbersInRange(min,max);
	}

}
