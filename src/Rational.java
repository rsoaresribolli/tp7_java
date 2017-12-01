/*

    Implementation d'une classe pour representer les nombres rationnels

*/
public class Rational {
    /* numerateur */
    private int num;
    /* denominaeur */
    private int den;

    public Rational(int num, int den){
      this.num = num;
      setDen(den);
      reduction(this);
    }

    public void setDen(int den){
      /* Attribue um denominador coerente */
      if(den == 0){
        throw new IllegalArgumentException("Le denominaeur ne peut pas etre 0!");
      }
      else{
        this.den = den;
      }

    }


    public void mult(Rational r){
      this.num = this.num * r.num;
      this.den = this.den * r.den;
      reduction(this);

    }

    public void add(Rational r){
      this.num = this.num * r.den + this.den*r.num;
      this.den = this.den*r.den;
      reduction(this);
    }

    public double getValeurDouble(){
      return num/den;
    }

    private int pgcd(int n, int d){
      /* Fonction qui verifie si le rational est irreductible
       * Si le retour est 1, la fonction est irreductible
       * Sinon, il fault diviser le num et le den par le retour
       */
      if(d == 0){
        return n;
      }else{
        return pgcd(d, n%d);
      }
    }

    private void reduction(Rational r){
      int div = pgcd(r.num, r.den);
      if(div != 1){
        r.num = r.num/div;
        r.den = r.den/div;
      }
    }

    @Override
    public String toString(){
      return num + "/" + den;
    }
}
