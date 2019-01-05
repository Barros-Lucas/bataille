
public abstract class Navire {
	
	protected int ident;
	protected TypeNav myType;
	protected String strAffichage;
	protected int numEq;
	protected int etat;
	protected int portee;
	protected int vitesse;
	
	public Navire(int i, TypeNav t, int n) {
		this.ident = i;
		this.myType = t;
		this.numEq = n;
	}

	public int getIdent() {
		return ident;
	}
	
	public int getNumEq() {
		return numEq;
	}

	public Point getPosition() {
		return
	}
	
	public void setPosition(Point position) {
		
	}
	
	public TypeNav getMyType() {
		return myType;
	}
	
	public boolean estValide() {
		return
	}
	
	public boolean estCoule() {
		return
	}
	
	public void seDeplacer(Point pos) {
		
	}

	public int getPortee() {
		return portee;
	}
	
	public void setCoule() {
		
	}
	
	@Override
	public String toString() {
		return "Navire [ident=" + ident + ", myType=" + myType + ", strAffichage=" + strAffichage + ", numEq=" + numEq
				+ ", etat=" + etat + ", portee=" + portee + ", vitesse=" + vitesse + "]";
	}

	public int getVitesse() {
		return vitesse;
	}
}
