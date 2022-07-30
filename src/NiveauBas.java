/*
 * NiveauBas.java
 */

/**
 * Niveau d'eau bas dans le barrage (ConcreteState)
 */
public class NiveauBas extends AbstractState {
  
  public NiveauBas(Barrage barrage) {
    super(barrage);
  }
  
  // changeState
  public void changeState() {
    if (getBarrage().getQuantite() > MAX) {
      getBarrage().setState(new NiveauEleve(getBarrage()));
    } else if (getBarrage().getQuantite() > MIN) {
      getBarrage().setState(new NiveauNormal(getBarrage()));
    }
  }
  
  // handle
  public void ajusterNiveau() {
    System.out.println("Niveau bas : " + getBarrage().getQuantite());
    
    // Fermer les valves
    getBarrage().accumuler(100);
    
    changeState();
  }
  
}
