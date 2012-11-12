import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Exercicio4URL {

	//Exercicio 4 da ultima lista Finalizado
	public static void main(String[] args) throws IOException {
	
	URL url;
	try {
		url = new URL("http://www.google.com");
		URLConnection conexao = url.openConnection();
		Map<String, List<String>> headers = conexao.getHeaderFields();
		
		Set<String> set = headers.keySet();

		for(String key : set) {
			List<String> valores = headers.get(key);
			System.out.print("Chave: " + key);
			for(String valor : valores) {
				System.out.println(valores);
			}
		}
		
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
	
	
	}
}
