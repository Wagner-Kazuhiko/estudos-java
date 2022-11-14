package aula43.contaBancaria.exer;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		String s = "ContaEspecial [";
		s += "limite: " + limite;
		s += "; " + super.toString();
		s += "]";
		return s;
	}
	
	public boolean sacar(double valor) {
		
		double saldoComLimite = this.getLimite() + limite;
		
		if ((saldoComLimite - valor) >= 0) {
			this.setLimite(this.getLimite() - valor);
			return true;
		}
		
		return false;
		
	}
	
	
	

}
