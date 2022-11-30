package model;

public class MainModel {
   private final String region;
   private final String name;
   private final String position;
   private final String information;

   public MainModel(String region, String name, String position, String information) {
       this.region = region;
       this.name = name;
       this.position = position;
       this.information = information;
   }

    public String getRegion() {
        return region;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getInformation() {
        return information;
    }
}
