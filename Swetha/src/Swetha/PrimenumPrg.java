package Swetha;

 class PrimenumPrg {

	public static void main(String[] args) {
		
		int i=0;
		String primeNumbers = "";
		System.out.println("Prime nos between 50 to 100 are ");
		int totalCount=0;
		for (i=50;i<=100;i++) {
		
			int flag =1;
			
			for (int num =2; num<=i/2;num++) {
				
				if (i%num ==0) {
					
					flag=0;
					break;
				}
				
			}
			if(flag ==1) {
				totalCount++;
				System.out.println(i + "");
			}
			
		}
		System.out.println("Total count of prime nos from 50 to 100 are "+totalCount);
		

	}

}
