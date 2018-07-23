public class Ass10 {
    public static void main(String[] args) {
        int[] arr={25,8,30,4};
        int temp=0;
        int smallest=0;
        int bigger=0;



        for(int a:arr){
            for(int b:arr){
                if(a>=b)
                {
                    temp=a;
                    a=b;
                    b=temp;

                }else
                {
                    bigger=b;
                }
                smallest=a;
            }


        }
        System.out.println(smallest);
        System.out.println(bigger);
    }
}
