
public class BubbleSort {
	
	public void sort(int [] str){
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str.length;j++){
				if(str[i]<str[j]){
					int temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
			}
		}
	}
	
	public void sort(String[] str){
		
		for(int i=0;i<str.length;i++){
			
			for(int j=0;j<str.length;j++){
				
				if(str[i].compareTo(str[j])<0){
					
				 String temp=str[i];
				 str[i]=str[j];
				 str[j]=temp;
				
				}
			}
		}
	}
}
