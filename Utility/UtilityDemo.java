import java.util.Scanner;

public class UtilityDemo {

	public static void main(String[] args) {
		BinarySearch bSearch=new BinarySearch();
		InsertionSort a=new InsertionSort();
		BubbleSort b=new BubbleSort();
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("1.BinarySearch for integer value");
		System.out.println("2.BinarySearch for String value");
		System.out.println("3.BubbleSort for integer value");
		System.out.println("4.BubbleSort for String value");
		System.out.println("5.InsertionSort for integer value");
		System.out.println("6.InsertionSort for String value");
		int n;
		System.out.print("Enter your choice:");
		n=sc.nextInt();
		switch(n){
		
		case 1:

			System.out.println("Enter length of integer array");
			int length=sc.nextInt();
			int [] str=new int[length];
			System.out.println("Enter integer elememt:");
			
			for(int i=0;i<length;i++){
				
				str[i]=sc.nextInt();
				
			}
		/*	
			for(int i=0;i<length;i++){
				
				System.out.println(str[i]+" ");
			}
			System.out.println();*/
			System.out.print("Enter Your Key Value for search:");
			int key=sc.nextInt();
			bSearch.binarySearch(key,str);
		
		break;
		case 2:
			
			System.out.println("Enter length of string array");
			int length1=sc.nextInt();
			String [] str1=new String[length1];
			System.out.println("Enter string elememt:");
			
			for(int i=0;i<length1;i++){
				
				str1[i]=sc.next();
				
			}
			a.sort(str1);
		/*	for(int i=0;i<length1;i++){
				
				System.out.println(str1[i]+" ");
			}
			System.out.println();*/
			System.out.print("Enter Your Key Value for search:");
			String key1=sc.next();
			bSearch.binarySearch(key1,str1);
		
		break;
		case 3:
			
			System.out.println("Enter length of integer array");
			int length4=sc.nextInt();
			int [] str4=new int[length4];
			System.out.println("Enter integer elememt:");
			
			for(int i=0;i<length4;i++){
				
				str4[i]=sc.nextInt();
				
			}
			b.sort(str4);
			System.out.println("this is your sorted integer array:");
			for(int i=0;i<length4;i++){
				
				System.out.println(str4[i]+" ");
			}
			System.out.println();
			
		break;
		case 4:
			
			System.out.println("Enter length of string array");
			int length5=sc.nextInt();
			String [] str5=new String[length5];
			System.out.println("Enter string elememt:");
			
			for(int i=0;i<length5;i++){
				
				str5[i]=sc.next();
				
			}
			b.sort(str5);
			System.out.println("this is your sorted integer array:");
			for(int i=0;i<length5;i++){
				
				System.out.println(str5[i]+" ");
			}
			System.out.println();
		
		break;
		case 5:
			
			System.out.println("Enter length of integer array");
			int length3=sc.nextInt();
			int [] str3=new int[length3];
			System.out.println("Enter integer elememt:");
			
			for(int i=0;i<length3;i++){
				
				str3[i]=sc.nextInt();
				
			}
			a.sort(str3);
			System.out.println("this is your sorted integer array:");
			for(int i=0;i<length3;i++){
				
				System.out.println(str3[i]+" ");
			}
			System.out.println();
			
		
		break;
		case 6:
			
			System.out.println("Enter length of string array");
			int length2=sc.nextInt();
			String [] str2=new String[length2];
			System.out.println("Enter string elememt:");
			
			for(int i=0;i<length2;i++){
				
				str2[i]=sc.next();
				
			}
			a.sort(str2);
			System.out.println("this is your sorted string array:");
			for(int i=0;i<length2;i++){
				
				System.out.println(str2[i]+" ");
			}
			System.out.println();
		break;
		
		
		}
	}	
}
