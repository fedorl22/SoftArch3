public class CarWash {
   public CarWash() {
   }

   public void wash(Wiping vehicle) {
      System.out.println("\u041c\u043e\u0439\u043a\u0430 \u0430\u0432\u0442\u043e\u043c\u043e\u0431\u0438\u043b\u044f...");
      vehicle.wipMirrors();
      vehicle.wipWindshield();
      vehicle.wipHeadlights();
   }
}

