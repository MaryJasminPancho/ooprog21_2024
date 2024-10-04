class BloodData {
   private String bloodType;
   private String rhFactor;
   
   public BloodData() {
      defaultPatient();
   }
   
   public BloodData(String bloodType, String rhFactor){
      this.bloodType = bloodType;
      this.rhFactor = rhFactor;
   }
      
   public void setBlood(String bloodType){
      this.bloodType = bloodType;
   }
   
   public String getBlood() {
      return this.bloodType;
   }
   
   public void setRH(String rhFactor){
      this.rhFactor = rhFactor;
   }
   
   public String getRH() {
      return this.rhFactor;
   }
   
   public void defaultPatient() {
      this.bloodType = "A";
      this.rhFactor = "-";
   }
   
   public void displayBloodInfo() {
      System.out.printf("Your blood type is: %s \nYour Rh Factor is: %s", bloodType, rhFactor);
   }
}