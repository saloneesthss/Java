public class App {
    public static void main(String[] args) throws Exception {
        int arr[][]={{1,2,3},{2,3,4},{7,8,9}};
        int sum=0;
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.println("Sum of row "+(i+1)+": "+sum);
            sum=0;
        }
    }
}
