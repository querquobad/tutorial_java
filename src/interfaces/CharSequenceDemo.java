package interfaces;

public class CharSequenceDemo implements CharSequence {
	private char[] chararray;

	public CharSequenceDemo(char[] sequence) {
		chararray = new char[sequence.length];
		System.arraycopy(sequence, 0, chararray, 0, sequence.length);
	}

	public static void main(String[] args) {
		String datos = "Select one of the sentences from this book to use as the data.";
		CharSequenceDemo prueba = new CharSequenceDemo(datos.toCharArray());
		
		prueba.imprimeValores();
		System.out.println("Vamos a hacer todo menos dos caracteres...");
		CharSequenceDemo prueba2 = new CharSequenceDemo(prueba.subSequence(1, (prueba.length()-1)).toString().toCharArray());
		prueba2.imprimeValores();
		
		

	}
	
	public void imprimeValores() {
		
		System.out.print("El caracter en la posición 10 es: ");
		System.out.println(charAt(9));
		
		System.out.print("El largo de la secuencia es: ");
		System.out.println(length());
		
		System.out.print("El arreglo como cadena es: ");
		System.out.println(toString());
		
		System.out.print("El arreglo como cadena inversa es: ");
		System.out.println(toStringB());


	}
	
	public char charAt(int index) {
		return chararray[index];
	}
	
	public int length() {
		return chararray.length;
	}
	
	public String toString() {
		String retval = "";
		for (char c : chararray) {
			retval += c;
		}
		return retval;
	}
	
	public String toStringB() {
		String retval = "";
		for (int i = chararray.length;i>0;i--) {
			retval += charAt(i-1);
		}
		return retval;
	}
	
	public CharSequence subSequence(int start, int end) {
		char[] retorno = new char[end - start];
		for (int i = 0;i < (end - start);i++) {
			retorno[i] = charAt(start + i);
		}
		CharSequence retval = new CharSequenceDemo(retorno);
		return retval;
	}

}
