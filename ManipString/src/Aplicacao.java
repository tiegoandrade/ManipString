
public class Aplicacao {

	public static void main(String[] args) {
			
		System.out.println(processar(null));
		System.out.println(processar("ab"));
		System.out.println(processar("abcdefghi"));
	} 
		
	public static String processar(String s) {
		
		/* 
		 * Caso a String passada como parâmetro não tiver nada, 
		 * retornará "null".
		 */
		if (s == null) {
			return null;
		}
		
		// Coloca a String passa como parâmetro toda em maiúsculo.
		s = s.toUpperCase();
		
		/* 
		 * Se o tamanho da String for menor ou igual a 3, 
		 * retornará toda a String sem alterações.
		 */
		if (s.length() <= 3) {
			return s;		
		}
		
		/* 
		 * Caso o tamanho da String é maior que 3, 
		 * somente os três primeiros caracteres da String em maísculo são invertidos.
		 */
		String s2 = s.substring(0, 3);
		StringBuffer sb = new StringBuffer(s2);
		sb.reverse();
		return sb.toString() + s.substring(3);
	}
		
	}


