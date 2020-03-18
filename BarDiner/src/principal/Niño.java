package principal;
public class Niño extends Residente{
	private int probNoqueo;
	private int probHuida;
		
	public Niño(boolean pNoqueado, int pProbNoqueo,int pProbHuida) {
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
