
public class AparelhoTelefonico {
	String numero = "1191234567";
	
	void ligar(String numero) {
		System.out.println("Ligando para " + numero);
	}
	void atender() {
		System.out.println("Atendido.");
	}
	void iniciarCorreioDeVoz(String mensagem) {
		System.out.println("Reproduzindo mensagem...\n" + mensagem + "\nFim da mensagem.");
	}
}
