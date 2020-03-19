package principal;
public class Residente {
protected boolean noqueado;

private Adulto adulto;
private Niño niño;
private Perro perro;

public Residente(boolean pNoqueado) {
    this.noqueado=pNoqueado;
    

}
public boolean delatar() {
	return !this.noqueado;
}
public int getProbabilidadNoqueo(){
	int prob=this.;
	/*if (this.adulto!=null) {prob=this.adulto.probNoqueo;}
	else if (this.adulto!=null) {prob=this.adulto.probNoqueo;}
	else {prob=this.adulto.probNoqueo;} */
	return prob;
		}
}
