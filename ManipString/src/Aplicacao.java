
public class Aplicacao {

	public static void main(String[] args) {
			
		System.out.println(processar(null));
		System.out.println(processar("ab"));
		System.out.println(processar("abcdefghi"));
	} 
		
	public static String processar(String s) {
		
		/* 
		 * Caso a String passada como par�metro n�o tiver nada, 
		 * retornar� "null".
		 */
		if (s == null) {
			return null;
		}
		
		// Coloca a String passa como par�metro toda em mai�sculo.
		s = s.toUpperCase();
		
		/* 
		 * Se o tamanho da String for menor ou igual a 3, 
		 * retornar� toda a String sem altera��es.
		 */
		if (s.length() <= 3) {
			return s;		
		}
		
		/* 
		 * Caso o tamanho da String � maior que 3, 
		 * somente os tr�s primeiros caracteres da String em ma�sculo s�o invertidos.
		 */
		String s2 = s.substring(0, 3);
		StringBuffer sb = new StringBuffer(s2);
		sb.reverse();
		return sb.toString() + s.substring(3);
	}
		
	}


