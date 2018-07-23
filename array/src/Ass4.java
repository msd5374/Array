public class Ass4 {
    public  boolean unlucky(int[] a) {
        for(int i=0;i<a.length;i++){
            if(a[i]==1&&a[i+1]==3){
                return true;

            }



        }
        return false;

    }
    public static void main(String[] args) {
        int[] a={1,3,2};
        Ass4 e=new Ass4();
        System.out.println(e.unlucky(a));

    }
}
