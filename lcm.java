import java.util.Scanner;
class lcm{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first vnumber");
int n=sc.nextInt();
System.out.println("Enter second number");
int m=sc.nextInt();
int max =(n>m)? n:m;
while(true){
if(max%n==0 && max%m==0){
System.out.println(max);
break;
}
max++;
}
}}