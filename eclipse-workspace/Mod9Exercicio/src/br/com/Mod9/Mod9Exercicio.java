package br.com.Mod9;

public class Mod9Exercicio {
	public static void main (String[]args){
        valorNumerico();
        valorCasting();
}
public static void valorNumerico(){
        int primitivo1 = 50; 

        Integer wrapper1 = (Integer) primitivo1;
        Integer wrapper2 = (Integer) primitivo1;
                  Integer wrapper3 =  primitivo1;

                  System.out.println("Valor Wrapper: "+ wrapper3);
                  
        
        //*Não sei se dá época em que o vídeo foi gravado mudou algo, mas eu pesquisei e vi que a agora a conversão é assim */
        
}    
     //**Essa é a parte do casting, esse eu botei da "caixa maior pra menor" */
        
     
     public static void valorCasting(){
        int valor1 = 50;

        short valor2 = (short) valor1;

        long valor3 = 215815481;

        int valor4 = (int)valor3;

  System.out.println("Casting: " + valor3 );
}


}
