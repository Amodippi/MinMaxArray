import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] num = new int[10];
        int min = 100;
        int max = 0;
        for(int i = 0; i < num.length; i++ ){
            Random rn = new Random();

            num[i] = rn.nextInt(100) + 1;
            System.out.println(num[i]);
            if (num[i] > max ){
                max = num[i];
            } else if (num[i] < min){
                min = num[i];

            }

        }
        System.out.println("Min -- " + min + " Max -- " + max);
    }
}