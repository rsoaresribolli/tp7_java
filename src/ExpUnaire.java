
public abstract class ExpUnaire extends ExpAbstraite {

  protected ExpAbstraite operande;

  public abstract String operateurToString();

  public ExpUnaire(ExpAbstraite operande){
    this.operande = operande;
  }

  @Override
  public String toStringInfixe(){
    return operateurToString() + "(" + operande.toStringInfixe() + ")";
  }

}
