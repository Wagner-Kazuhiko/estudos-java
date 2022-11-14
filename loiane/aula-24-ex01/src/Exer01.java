
public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.cor = "amarela";
		lampada.tipoLuz = "amarela";
		lampada.garantiaMeses = 12;
		lampada.tipoAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
		System.out.println(lampada.toString());
	}

}
