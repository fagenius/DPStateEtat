/*
 * NiveauEleve.java
 */

/**
 * Niveau d'eau élevé dans le barrage (ConcreteState)
 */
public class NiveauEleve extends AbstractState {
  
  public NiveauEleve(Barrage barrage) {
    super(barrage);
  }
  
  // changeState
  public void changeState() {
    if (getBarrage().getQuantite() < MIN) {
      getBarrage().setState(new NiveauBas(getBarrage()));
    } else if (getBarrage().getQuantite() < MAX) {
      getBarrage().setState(new NiveauNormal(getBarrage()));
    }
  }
  
  // handle
  public void ajusterNiveau() {
    System.out.println("Niveau élevé : " + getBarrage().getQuantite());
    
    // Ouvrir les valves
    getBarrage().ecouler(100);
    
    changeState();
  }
  
}
