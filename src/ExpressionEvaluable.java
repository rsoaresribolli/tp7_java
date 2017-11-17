public class ExpressionEvaluable implements Evaluable {
  private ExpAbstraite exp;
  private Env env;

  @Override
  public double evaluer(){
    return exp.evaluer(env);
  }

}
