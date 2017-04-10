 class InsertionSort {
	
	public void sort(String[] str){
		
		for(int i=1;i<str.length;i++){
			
			int j=i;
			String str1=str[i];
			
			while(j>0 && str1.compareTo(str[j-1])<0){
				
				str[j]=str[j-1];
				j--;
				
			}
			str[j]=str1;
		}
	}

	public void sort(int[] str){
		
		for(int i=1;i<str.length;i++){
			
			int j=i;
			int str1=str[i];
			
			while(j>0 && str1<str[j-1]){
				str[j]=str[j-1];
				j--;	
				
			}
			str[j]=str1;
		}
			
	}
}
