package aula.aula191012;

public class Figuras{

	public static void main(String[] args){
		Figuras f = new Figuras();
		f.exercicio1();
		f.exercicio2();
		f.exercicio3();
		f.exercicio4();
		f.exercicio5();
	}

	public void exercicio1(){
		System.out.println("Figura 01\n");
		for(int i = 0; i<10; i++){
			for(int j=0; j<10;j++){
			     if(i>=j){	
				System.out.print("*");
			     }
			}
		    System.out.println("");			
		}	
	}

	public void exercicio2(){
		System.out.println("Figura 02\n");
		for(int i = 0; i<10; i++){
			for(int j=0; j<10;j++){
			     if(i<=j){	
				System.out.print("*");
			     }
			}
		    System.out.println("");			
		}	
	}

	public void exercicio3(){
		System.out.println("Figura 03\n");
		for(int i = 0; i<10; i++){
			for(int j=0; j<10;j++){
			     if(i>j){	
				System.out.print(" ");
			     }else{
				System.out.print("*");
			     }
			}
		    System.out.println("");			
		}	
	}

	public void exercicio4(){
		System.out.println("Figura 04\n");
		for(int i = 0; i<10; i++){
			for(int j=9; j>=0;j--){
			     if(i>=j){	
				System.out.print("*");
			     }else{
				System.out.print(" ");
			     }
			}
		    System.out.println("");			
		}
			
	}
	public void exercicio5(){
		System.out.println("Figura 05\n");
		for(int i = 0; i<11; i++){
			for(int j=10; j>=0;j--){
			     if(i>=j){	
				System.out.print("*");
			     }else{
				System.out.print(" ");
			     }
			}
			for(int j=11; j<21;j++){
			     if(i>=j-10){	
				System.out.print("*");
			     }else{
				System.out.print(" ");
			     }
			}
		    System.out.println("");			
		}
		for(int i = 0; i<10; i++){
			for(int j=0; j<10;j++){
			     if(i>j-1){	
				System.out.print(" ");
			     }else{
				System.out.print("*");
			     }
			}
			for(int j=20; j>=10;j--){
			     if(i>j-11){	
				System.out.print(" ");
			     }else{
				System.out.print("*");
			     }
			}
		    System.out.println("");			
		}				
			
		System.out.println("");				
			
	}
}
