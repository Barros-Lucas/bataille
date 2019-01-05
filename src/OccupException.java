
public class OccupException extends Exception{
	
	public OccupException(String nomBateau) {
		super("Case déjà occupée, le bateau " + nomBateau + " ne peut pas se déplacer.");
	}
}
