
public class Constante extends ExpAbstraite{

  private double valeur;

  public Constante(double valeur){
    this.valeur = valeur;
  }

  @Override
  public String toStringInfixe(){
    return String.valueOf(valeur);
  }

  @Override
  public double evaluer(Env env){
    return valeur;
  }
}
