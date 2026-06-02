class sumarr{
public static void main(String[] args){
int[] arr={90,20,100,40,50};
int sum=0;
int max=arr[0];
/*for (int i =1;i<=arr.length-1;i++){
if(arr[i]>max){
max=arr[i];
}
}
System.out.println("Maximum no:"+max);
*/
for(int n:arr){
sum+=n;
if(n>max){
max=n;
}
}
System.out.println(sum);
System.out.println("Maximum no:"+max);

}}