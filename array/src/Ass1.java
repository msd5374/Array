public class Ass1 {
    public boolean commonEnd(int[] a,int[] b){
        if(a[0]==b[0]||a[a.length-1]==b[b.length-1]){
            return true;
        }
        else{
            return false;
        }



    }
    public static void main(String args[]){

        Ass1 a=new Ass1();
        int[] a1={1,2,3};
        int[] b1={7,3};


        System.out.println(a.commonEnd( a1, b1));




    }
}
