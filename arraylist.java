package OPPSinJAVA1;

import java.util.Arrays;

public class arraylist {

    public static class Arraylist{
        int[] arr=new int[5];
        int idx=0;
        int size=0;
        public void add(int element){
             if(size==arr.length){
                 int[] brr=Arrays.copyOf(arr, arr.length*2);
                 arr=brr;//new array ko naam diya h arr ka ye arr mei add nhi hua brr
             }
            arr[idx]=element;
            idx++;
            size++;
        }
        public void set(int idx,int val){
            arr[idx]=val;
        }

    }
    public static void main(String[] args) {
        Arraylist arr=new Arraylist();
        arr.add(1);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        System.out.println(arr.size);
        arr.set(2, 7);
        System.out.println(arr.size);
        
        
        

    }
    
    
}
