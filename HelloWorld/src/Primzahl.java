
public class Primzahl {

	
	static int number= 0;
	
	
	public static void main(String[] args) {

		for(int i=number; i<=10000000; i++){
			number=i;
			if(isPrime(number)==true){
				System.out.print(number+" ");
			}
		System.out.println(number+" ist eine Primzahl= "+isPrime(number));
		}
	}

	
		public static boolean isPrime(int number){
		
			if(number<2){return false;}		
				for (int i=2; i<=number/2; i++){
					if(number%i==0){
						return false;}
						}
				return true;
				}
		}


