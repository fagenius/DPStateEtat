/*
 * Barrage.java
 */

/**
 * Barrage hydroélectrique (Context)
 */
public class Barrage {
  private AbstractState state;
  private double quantite;  
  
  public Barrage() {
    this.quantite = 0;
    this.state = null;
  }
  
  public AbstractState getState() {
    return this.state;
  }
  
  public void setState(AbstractState state) {
    this.state = state;
  }
  
  public double getQuantite() {
    return this.quantite;
  }
  
  public void setQuantite(double qte) {
    this.quantite = qte;
  }
  
  public void ecouler(double qte) {
    setQuantite(getQuantite() - qte);
  }
  
  public void accumuler(double qte) {
    setQuantite(getQuantite() + qte);
  }
  
  // service()
  public void ajusterNiveau() {
    getState().ajusterNiveau();
  }
  
}
