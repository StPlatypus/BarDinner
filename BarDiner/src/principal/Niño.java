package principal;
public class Ni�o extends Residente{
	private int probNoqueo;
	private int probHuida;
		
	public Ni�o(boolean pNoqueado, int pProbNoqueo,int pProbHuida) {
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
