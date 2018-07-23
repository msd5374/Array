public class Ass7 {
    public int sum67(int[] a){
        int temp=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==6){
                for(int j=i;a[j]!=7;j++){
                    a[j]=0;
                    temp=j;
                }
                a[temp+1]=0;

            }else{
                sum=sum+a[i];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] a={1,2,6,8,2,7,2};
        Ass7 a1=new Ass7();
        int ans=a1.sum67(a);
        System.out.println("sum is:"+ans);
    }

}
