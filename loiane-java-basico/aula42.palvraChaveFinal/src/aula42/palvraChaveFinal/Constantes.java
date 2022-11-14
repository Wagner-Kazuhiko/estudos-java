package aula42.palvraChaveFinal;

public final class Constantes {
//adicionado final
	
	public static String URL_BLOG = "httpd://loiane.com";
	public static final String URL_CURSO_COMPLETO = "http://loiane.training";
	public static final int quatro = 4;
	//palavra final combina com o método static
	//constantes são escritas em caixa alta com underscore (_) para separar
	
	public static void main(String[] args) {
		
		//com final não é possível modificar, sem final é possível
		System.out.println(Constantes.URL_BLOG);
		Constantes.URL_BLOG = "ndkdkdfk";
		
		System.out.println(Constantes.URL_BLOG);
		
		System.out.println(Constantes.URL_CURSO_COMPLETO);
		
		System.out.println(quatro + 2);

	}

}
