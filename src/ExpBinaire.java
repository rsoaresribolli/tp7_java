
public abstract class ExpBinaire extends ExpAbstraite {

  protected ExpAbstraite opGauche;
  protected ExpAbstraite opDroite;

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
