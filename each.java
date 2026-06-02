import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class each {
public static void main(String[] args) {
Scanner sc=new 	Scanner (System.in);
Integer[] numbers=new Integer[5];
for(int i =0;i<numbers.length;i++){
System.out.println("Enter number:");
numbers[i]=sc.nextInt();
}
Arrays.sort(numbers);
System.out.println("Array elements are:");
for(int j: numbers){
System.out.println(j);
}
Arrays.sort(numbers,Collections.reverseOrder());
System.out.println("Descending Order:");
for(int j: numbers){
System.out.println(j);
}
System.out.println("reversed:");
for(int i=numbers.length-1;i>=0;i--){
System.out.println(numbers[i]);
}}}