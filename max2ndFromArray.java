import java.util.Scanner;

public class max2ndFromArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE;
        int n = sc.nextInt();
        int[] nik = new int[n];
        for(int i=0; i<n; i++){
            nik[i] = sc.nextInt();
            if(nik[i]>m1){
                m2 = m1;
                m1 = nik[i];
            }else if(nik[i]<m1 && nik[i]>m2){
                m2 = nik[i];
            }
        }System.out.println(m2);
    }
}
