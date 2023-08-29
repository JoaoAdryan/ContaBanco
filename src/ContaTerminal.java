import java.util.Scanner;
public class ContaTerminal {
 private int numero = 223;
 private String agencia = "itau";
 private String nomeCliente = "joao";
 private double saldo = 232.1;
/**
 * @return the numero
 */
public int getNumero() {
	return numero;
}
/**
 * @param numero the numero to set
 */
public void setNumero(int numero) {
	this.numero = numero;
}
/**
 * @return the agencia
 */
public String getAgencia() {
	return agencia;
}
/**
 * @param agencia the agencia to set
 */
public void setAgencia(String agencia) {
	this.agencia = agencia;
}
/**
 * @return the nomeCliente
 */
public String getNomeCliente() {
	return nomeCliente;
}
/**
 * @param nomeCliente the nomeCliente to set
 */
public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}
/**
 * @return the saldo
 */
public double getSaldo() {
	return saldo;
}
/**
 * @param saldo the saldo to set
 */
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public static void main(String[] args) {
	try (Scanner ler = new Scanner(System.in)) {
        System.out.print("digite seu nome: ");
        String nomeCliente = ler.nextLine();
        
        
        System.out.print("digite a agencia: ");
        String agencia = ler.nextLine();
        

        System.out.print("digite o número da sua conta: ");
        int numero = ler.nextInt();

        
        
        
        System.out.print("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco sua agencia é " + agencia + " conta " + numero + " e seu saldo 223.1 ja está disponivel para saque " );
    }
	
	
	
	
	
	
	

}
}
