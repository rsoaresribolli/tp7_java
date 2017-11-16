
public abstract class ExpBinaire extends ExpAbstraite {

  private ExpAbstraite opGauche;
  private ExpAbstraite opDroite;

  public abstract String operateurToString();

  public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroite){
    this.opGauche = opGauche;
    this.opDroite = opDroite;
  }

  @Override
  public String toStringInfixe(){
    return "(" + opGauche.toStringInfixe() + operateurToString() + opDroite.toStringInfixe() + ")";
  }


}
