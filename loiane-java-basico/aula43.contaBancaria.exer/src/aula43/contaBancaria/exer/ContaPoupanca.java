package aula43.contaBancaria.exer;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

	private double diaRendimento;

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	
	
	@Override
	public String toString() {
		String s = "ContaPoupança [";
		s += "diaRendimento: " + diaRendimento;
		s += "; " + super.toString();
		s += "]";
		return s;
	}
	
	

	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo += saldo * taxaRendimento;
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
	
}
