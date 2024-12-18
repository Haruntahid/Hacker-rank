import java.util.Scanner;

public class HourGls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] array = new int[3][4];
        int rows = array.length;
        int columns = array[0].length;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                array[i][j] = input.nextInt();
            }
        }

        int sum = Integer.MIN_VALUE;

        try{
            for(int i = 0; i < array.length-2; i++){
                for(int j = 0; j < array.length-2; j++){
                    int temp = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];
                    if(temp > sum){
                        sum = temp;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("You can't calculate "+ rows+"x"+columns + " matrix");
        }

        System.out.println(sum);
    }
}
