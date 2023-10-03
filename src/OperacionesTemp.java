
public class OperacionesTemp {
	private double valor, resultado;
	private int temperatura, tempFinal;
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public int getTempFinal() {
		return tempFinal;
	}
	public void setTempFinal(int tempFinal) {
		this.tempFinal = tempFinal;
	}
	public OperacionesTemp() {}
	public double convertir() {
		if (temperatura==0 && tempFinal==1) {
			resultado = valor * 33.8;
		}else if(temperatura==1 && tempFinal==0){
			resultado = valor / 33.8;
		}else if(temperatura==0 && tempFinal==2){
			resultado = valor * 274.15;
		}else if(temperatura==0 && tempFinal==2){
			resultado = valor / 274.15;
		}else if(temperatura==1 && tempFinal==2){
			resultado = valor / -457.87;
		}else if(temperatura==2 && tempFinal==0){
			resultado = valor * -457.87;
		}else if(temperatura==2 && tempFinal==1){
			resultado = valor / -457.87;
		}
		return resultado;
	}
}
