
public class BinaireMult extends ExpBinaire {

  public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroite){
    super(opGauche, opDroite);
  }

  // @Override
  // public String toStringInfixe(){
  //   return "(" + opGauche.toStringInfixe() + " * " + opDroite.toStringInfixe() + ")";
  // }

  @Override
  public String operateurToString(){
    return "*";
  }

  @Override
  public double evaluer (Env env){
    //Propage l'exception si c'est le cas
    return opGauche.evaluer(env) * opDroite.evaluer(env);
  }

}
