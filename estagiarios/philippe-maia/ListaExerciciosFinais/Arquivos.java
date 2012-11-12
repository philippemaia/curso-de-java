import java.io.*;

//Exercicio 3 da lista de exercicios finais Finalizado

public class Arquivos {

	public static void main(String[] args) throws IOException {

		OutputStream os = new FileOutputStream("series.tv");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("24 Horas");
		bw.write("\nLost");
		bw.write("\nThe Simpsons");
		bw.write("\nThe Walking Dead");
		bw.write("\nGame of Thrones");

		bw.close();

		InputStream is = new FileInputStream("series.tv");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linha;
		try {
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			br.close();
		}
	}
}
