/*
 * NiveauNormal.java
 */

/**
 * Niveau d'eau normal dans le barrage (ConcreteState)
 */
public class NiveauNormal extends AbstractState {
  
  public NiveauNormal(Barrage barrage) {
    super(barrage);
  }
  
  // changeState
  public void changeState() {
    if (getBarrage().getQuantite() > MAX) {
      getBarrage().setState(new NiveauEleve(getBarrage()));
    } else if (getBarrage().getQuantite() < MIN) {
      getBarrage().setState(new NiveauBas(getBarrage()));
    }
  }
  
  // handle
  public void ajusterNiveau() {
    System.out.println("Niveau normal : " + getBarrage().getQuantite());
    
    // accumulation naturelle
    getBarrage().accumuler(35);
    
    changeState();
  }
  
}
