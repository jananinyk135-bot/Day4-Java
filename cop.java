import java.util.Arrays;
class cop{
public static void main(String[] args){
int[] arr = {1,2,3};
int[] arr1 = {2,3,4};
int[] copy=new int[arr.length];
for(int i=0;i<arr.length;i++){
copy[i] = arr[i];
}
System.out.println("copied array:");
for(int i=0;i<copy.length;i++){
System.out.println(copy[i]);
}
System.out.println(Arrays.equals(arr,arr1));
}}