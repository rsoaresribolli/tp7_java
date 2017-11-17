
public class Variable extends ExpAbstraite{

  private String nom;

  public Variable(String nom){
    this.nom = nom;
  }

  @Override
  public String toStringInfixe(){
    return nom;
  }

  @Override
  public double evaluer(Env env){
    return env.obtenirValeur(nom);
  }
}
