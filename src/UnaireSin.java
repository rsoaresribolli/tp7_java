
public class UnaireSin extends ExpUnaire{

  public UnaireSin(ExpAbstraite operande){
    super(operande);
  }

  // @Override
  // public String toStringInfixe(){
  //   return "sin("+operande.toStringInfixe()+")";
  // }

  @Override
  public String operateurToString(){
    return "sin";
  }

  @Override
  public double evaluer (Env env){
    //Propage l'exception si c'est le cas
    return Math.sin(operande.evaluer(env));
  }

}
