public class Ass2 {
    public int [] reverse3(int[] nums ){

        int limit=nums.length;
        int[] temp=new int[limit];
        for(int i=0;i<temp.length;i++){
            temp[i]=0;
        }

        for(int i=0;i<nums.length;i++){
            temp[temp.length-1-i]=nums[i];

        }
        return temp;

    }
    public static void main(String args[]){
        int[] nums={1,2,3};
        Ass2 a1=new Ass2();
        int[]b=a1.reverse3(nums);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }


    }

}
