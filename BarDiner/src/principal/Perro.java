package principal;
import java.util.Random;
public class Perro extends Residente{
	private int probNoqueo;
	private int probHuida;
		
	public Perro(boolean pNoqueado, int pProbNoqueo,int pProbHuida) {
			super(pNoqueado);
			this.probNoqueo=pProbNoqueo;
			this.probHuida=pProbHuida;
			
		}
	public boolean delatar() {
		boolean x=false;
		if (!this.noqueado){
		x=true;}
		return x;}


}
