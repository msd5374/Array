public class Ass13 {
    //shift
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5 };
        int temp;
        for(int i=0;i<arr.length-1;i++){


            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;



        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
