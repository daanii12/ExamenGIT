
/**
 * 
 * @author garci
 *
 */

public class vocales {
	/*
	 * Metodo main donde creo el array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] personas={"ANA", "LUIS", "ANTONIO", "MANUEL"};
		
		git(personas);
		
	}//fin main

/**
 * metodo que con el array personas cuenta las vocales
 * @param personas
 */
public static void git(String [] personas) {
	
	int a=0;
	int e=0;
	int i=0;
	int o=0;
	int u=0;
			
	//ee

	
			
	for(int j=0; j<personas.length; j++) {
		
			
			
			
			for(int x=0; x<personas[j].length(); x++) {
				
				String letras=String.valueOf(personas[j].charAt(x));
				if(letras.equals("A")) {
					a++;
				}
				
				if(letras.equals("E")) {
					e++;
				}
				if(letras.equals("I")) {
					i++;
				}
				if(letras.equals("O")) {
					o++;
				}
				if(letras.equals("U")) {
					u++;
				}
			}
			
			
		
	
		
		
	}
	
	System.out.println("Numero de vocales a: " + a);
	System.out.println("Numero de vocales e: " + e);
	System.out.println("Numero de vocales i: " + i);
	System.out.println("Numero de vocales o: " + o);
	System.out.println("Numero de vocales u: " + u);
	
}//metodo

}//fin class
