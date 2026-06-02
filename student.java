import java.util.Arrays;
import java.util.Scanner;
class student{
public static void main(String[] args){
Scanner sc= new Scanner (System.in);
System.out.println("Enter no.of students:");
int m=sc.nextInt();
Integer[] marks=new Integer[m];
for(int i =0;i<marks.length;i++){
System.out.println("Enter number:");
marks[i]=sc.nextInt();
}
int sum=0;
int max=marks[0];
int count =0;
for(int n:marks){
sum+=n;
if(n>max){
max=n;
}
}
System.out.println(sum);
System.out.println("Maximum no:"+max);
int Average=sum/marks.length;
System.out.println("Average:"+Average);
for (int k:marks){
if(k<35){
count++;
}
}
System.out.println("no.of students failed:"+count);
}}