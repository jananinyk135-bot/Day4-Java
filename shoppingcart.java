import java.util.Arrays;
import java.util.Scanner;
class shoppingcart{
public static void main(String[] args){
Scanner sc= new Scanner (System.in);
System.out.println("Enter no.of items:");
int m=sc.nextInt();
Integer[] prices=new Integer[m];
for(int i =0;i<prices.length;i++){
System.out.println("Enter the items prices:");
prices[i]=sc.nextInt();
}
int sum=0;
int highest=prices[0];
int count =0;
for(int n:prices){
sum+=n;
if(n>highest){
highest=n;
}
}
System.out.println("Total bill:"+sum);
System.out.println("Highest Price:"+highest);
for (int k:prices){
if(k>1000){
count++;
}
}
System.out.println("No .of products above 1000 rupees:"+count);
}}