
public class Main {

	public static void main(String[] args) {
		//Empf�nger erstellen
		DisneyPlus dp = new DisneyPlus();
		ZDF zdf = new ZDF();
		ORF orf1 = new ORF();
		
		Eltern papa = new Eltern();
		papa.setTv(new ORFBefehl(orf1));		
		papa.tvEinschalten("ORF");
		
		Kind emil = new Kind();
		emil.setTv(new DisneyPlusBefehl(dp));
		emil.tvEinschalten("Disney Plus");
		
		Gro�eltern gro�mutter = new Gro�eltern();
		gro�mutter.setTv(new ZDFBefehl(zdf));
		gro�mutter.tvEinschalten("zdf");

	}

}
