/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {
    Barrage barrage = new Barrage();
    barrage.setState(new NiveauNormal(barrage));
    
    for (int i = 0; i < 10; i++) {
      barrage.ajusterNiveau();
    }
  }
  
}
