
public class Operaciones {
	private double valor, resultado;
	private int divisa, divisaFinal;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getDivisa() {
		return divisa;
	}
	public void setDivisa(int divisa) {
		this.divisa = divisa;
	}
	public int getDivisaFinal() {
		return divisaFinal;
	}
	public void setDivisaFinal(int divisaFinal) {
		this.divisaFinal = divisaFinal;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public Operaciones() {}
	public double convertir() {
		if (divisa==0 && divisaFinal==1) {
			resultado = valor * 0.85;
		}else if(divisa==1 && divisaFinal==0){
			resultado = valor / 1.06;
		}else if(divisa==0 && divisaFinal==2){
			resultado = valor * 4070.75;
		}else if(divisa==2 && divisaFinal==0){
			resultado = valor / 4070.75;
		}else if(divisa==0 && divisaFinal==3){
			resultado = valor * 0.82;
		}else if(divisa==3 && divisaFinal==0){
			resultado = valor / 0.82;
		}else if(divisa==0 && divisaFinal==4){
			resultado = valor * 149.78;
		}else if(divisa==4 && divisaFinal==0){
			resultado = valor / 149.78;
		}else if(divisa==0 && divisaFinal==5){
			resultado = valor * 1351.41;
		}else if(divisa==5 && divisaFinal==0){
			resultado = valor / 1351.41;
		}else if(divisa==1 && divisaFinal==2){
			resultado = valor * 4309.50;
		}else if(divisa==2 && divisaFinal==1){
			resultado = valor / 4309.50;
		}else if(divisa==1 && divisaFinal==3){
			resultado = valor * 0.87;
		}else if(divisa==3 && divisaFinal==1){
			resultado = valor / 0.87;
		}else if(divisa==1 && divisaFinal==4){
			resultado = valor * 158.32;
		}else if(divisa==4 && divisaFinal==1){
			resultado = valor / 158.32;
		}else if(divisa==1 && divisaFinal==5){
			resultado = valor * 1425.18;
		}else if(divisa==5 && divisaFinal==1){
			resultado = valor / 1425.18;
		}else if(divisa==2 && divisaFinal==3){
			resultado = valor * 0.20;
		}else if(divisa==3 && divisaFinal==2){
			resultado = valor / 0.20;
		}else if(divisa==2 && divisaFinal==4){
			resultado = valor * 36.74;
		}else if(divisa==4 && divisaFinal==2){
			resultado = valor / 36.74;
		}else if(divisa==2 && divisaFinal==5){
			resultado = valor * 331.63;
		}else if(divisa==5 && divisaFinal==2){
			resultado = valor / 331.63;
		}else if(divisa==3 && divisaFinal==4){
			resultado = valor * 182.54;
		}else if(divisa==4 && divisaFinal==3){
			resultado = valor / 182.54;
		}else if(divisa==3 && divisaFinal==5){
			resultado = valor * 1647.66;
		}else if(divisa==5 && divisaFinal==3){
			resultado = valor / 1647.66;
		}else if(divisa==4 && divisaFinal==5){
			resultado = valor * 9.03;
		}else if(divisa==5 && divisaFinal==4){
			resultado = valor / 9.03;
		}
		return resultado;
	}
}
	
	

