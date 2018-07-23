public class Ass5 {
    public int[] plusTwo(int[] a,int[] b){
        int pass =a.length+b.length;
        int[] c=new int[pass];
        for(int i=0;i<2;i++)
        {
            c[i]=a[i];
            c[i+2]=b[i];

        }
        return c;

    }

    public static void main(String[] args) {

        int[] a={1,2};
        int[] b={3,4};
        Ass5 a1=new Ass5();
        int[] d=a1.plusTwo(a, b);
        for(int i=0;i<d.length;i++){
            System.out.println(d[i]);

        }
    }

}
