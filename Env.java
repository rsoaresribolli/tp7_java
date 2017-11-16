import java.util.*;

public class Env {

  Map<String, Double> tableAssociative;

  public Env(){
    tableAssociative = new HashMap<String, Double>();
  }

  public void associer(String nom, double valeur){
    tableAssociative.put(nom, valeur);
  }

  public double obtenirValeur(String nom){
    if(tableAssociative.containsKey(nom)){
      return tableAssociative.get(nom);
    }else{
      throw new IllegalArgumentException();
    }
  }

  @Override
  public String toString(){
    String s = "";
    for(String nom: tableAssociative.keySet()){
      s += nom + " = " + String.valueOf(tableAssociative.get(nom)) + ";";
    }
    return s;
  }
}
