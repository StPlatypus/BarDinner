package principal;
public class Residente {
protected boolean noqueado;

private Adulto adulto;
private Ni�o ni�o;
private Perro perro;

public Residente(boolean pNoqueado) {
    this.noqueado=pNoqueado;
    

}
public boolean delatar() {
	boolean x=false;
	if (!this.noqueado){
	x=true;}
	return x;
    
    

}
public int getProbabilidadNoqueo(){
	int prob=this.;
	/*if (this.adulto!=null) {prob=this.adulto.probNoqueo;}
	else if (this.adulto!=null) {prob=this.adulto.probNoqueo;}
	else {prob=this.adulto.probNoqueo;} */
	return prob;
		}
}