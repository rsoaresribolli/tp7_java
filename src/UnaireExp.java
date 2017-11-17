
public class UnaireExp extends ExpUnaire{

  public UnaireExp(ExpAbstraite operande){
    super(operande);
  }

  // @Override
  // public String toStringInfixe(){
  //   return "cos("+operande.toStringInfixe()+")";
  // }

  @Override
  public String operateurToString(){
    return "exp";
  }

  @Override
  public double evaluer (Env env){
    //Propage l'exception si c'est le cas
    return Math.exp(operande.evaluer(env));
  }

}
