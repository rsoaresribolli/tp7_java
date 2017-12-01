public class RationalEvaluable extends Rational implements Evaluable {

  public RationalEvaluable(int num, int den){
    super(num, den);
  }

  public RationalEvaluable(int num) {
    //S'il n'y a pas de denominateur, on le considere 1
    super(num, 1);
  }

  @Override
  public double evaluer(){
    return getValeurDouble();
  }
}
