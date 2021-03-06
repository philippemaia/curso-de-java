import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;
//Exercicio 5 Finalizado
public class Exercicio5URL {

	public static void main(String[] args) throws IOException {

		String recebeDoUsuario = JOptionPane.showInputDialog("Digite o site");
		URL url;
		try {
			url = new URL(recebeDoUsuario);
			URLConnection conexao = url.openConnection();
			Map<String, List<String>> headers = conexao.getHeaderFields();

			Set<String> set = headers.keySet();
			String concatena = "";
			for (String key : set) {
				List<String> valores = headers.get(key);
				JOptionPane.showMessageDialog(null, key);

				for (String valor : valores) {
					concatena = valor + "\n";
				}
				JOptionPane.showMessageDialog(null, concatena);

			}

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
