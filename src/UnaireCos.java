
public class UnaireCos extends ExpUnaire{

  public UnaireCos(ExpAbstraite operande){
    super(operande);
  }

  // @Override
  // public String toStringInfixe(){
  //   return "cos("+operande.toStringInfixe()+")";
  // }

  @Override
  public String operateurToString(){
    return "cos";
  }

  @Override
  public double evaluer (Env env){
    //Propage l'exception si c'est le cas
    return Math.cos(operande.evaluer(env));
  }

}
