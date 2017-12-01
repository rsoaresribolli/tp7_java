import java.util.*;

public class Env {

  Map<String, Evaluable> tableAssociative;

  public Env(){
    tableAssociative = new HashMap<String, Evaluable>();
  }

  public void associer(String nom, Evaluable valeur){
    tableAssociative.put(nom, valeur);
  }

  public double obtenirValeur(String nom){
    if(tableAssociative.containsKey(nom)){
      return tableAssociative.get(nom).evaluer();
    }else{
      throw new IllegalArgumentException();
    }
  }

  @Override
  public String toString(){
    String s = "";
    for(String nom: tableAssociative.keySet()){
      //s += nom + " = " + String.valueOf(tableAssociative.get(nom)) + ";";
      s += nom + " = " + tableAssociative.get(nom).toString() + "; ";
    }
    return s;
  }
}
