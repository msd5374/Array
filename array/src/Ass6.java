public class Ass6 {
    public int[] altMerge(int[] a,int[] b ){
        int[] temp=new int[6];
        for(int i=0;i<temp.length;i++){
            temp[i]=0;
        }

        for( int i=0,j=0;i<temp.length;i=i+2,j++){
            temp[i]=a[j];
            temp[i+1]=b[j];
        }


        return temp;
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        Ass6 a1=new Ass6();
        //int[] d=new d[6];
        int[] d=a1.altMerge(a, b);
        for(int i=0;i<d.length;i++){
            System.out.println(d[i]);

        }

    }

}
