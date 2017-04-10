
public class BinarySearch {
	
	public int[] binarySearch(int key,int[] integer){
		
		int low=0;
		int heigh=(integer.length)-1;
		int mid=(low+heigh)/2;
		 
		while(low<=heigh){
			
			if(integer[mid]==key){
				
				System.out.println("Your element is found at "+mid+" position");
				break;
			}
			else if(integer[mid]>key){
				
				heigh=mid-1;
				mid=(low+heigh)/2;
			}
			else if(integer[mid]<key){
				
				low=mid+1;
				mid=(low+heigh)/2;
			}
			
		}
		if(low>heigh){
			System.out.print("Element is not found in array");
		}
		
		
		
		return integer;
	}
	
	public String[] binarySearch(String key1,String[] str1){
		
		int low=0;
		int heigh=(str1.length)-1;
		int mid=(low+heigh)/2;
		
		while(low<=heigh){
			
			if(key1.compareTo(str1[mid])==0){
				
				System.out.println("Element is found at "+mid+" position");
				break;
			}
			else if(key1.compareTo(str1[mid])<0){
				
				heigh=mid-1;
				mid=(low+heigh)/2;
				
				
			}
			
			else if(key1.compareTo(str1[mid])>0){
				
				low=mid+1;
				mid=(low+heigh)/2;
				
				
			}
			
		}	
		if(low>heigh){
			System.out.println("Element is not found");
		}
		return str1;
	}
}


