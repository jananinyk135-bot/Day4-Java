import java.util.Scanner;
class hcfex{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first vnumber");
int n=sc.nextInt();
System.out.println("Enter second number");
int m=sc.nextInt();
int hcf =1;
for(int i =1;i<=n && i<=m;i++){
if(n%i ==0 && m%i==0){
hcf=i;
}
}
System.out.println(hcf);
}}