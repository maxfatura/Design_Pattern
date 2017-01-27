package Pattern;

public class EmissorCreateFactory {
	
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2; 
	
	public Emissor create(int tipoDeMensagem) {
		if(tipoDeMensagem == EmissorCreateFactory.SMS) {
			return new EmissorSMS();
		} else if(tipoDeMensagem == EmissorCreateFactory.EMAIL) {
			return new EmissorEmail();
		} else if(tipoDeMensagem == EmissorCreateFactory.JMS) {
			return new EmissorJMS();
		} else {
			throw new IllegalArgumentException("Emissor Desconhecido");
		}
	}
}