/*
 * AbstractState.java
 */

/**
 * Abstract State
 */
public abstract class AbstractState {
  public static final double MIN = 100;
  public static final double MAX = 200;
  
  private Barrage barrage;
  
  public AbstractState(Barrage barrage) {
    this.barrage = barrage;
  }
  
  public Barrage getBarrage() {
    return this.barrage;
  }
  
  public abstract void changeState();     // handle()
  public abstract void ajusterNiveau();   // changeState()
  
}
