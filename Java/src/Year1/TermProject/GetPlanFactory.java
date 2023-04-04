package Year1.TermProject;

public class GetPlanFactory {

    public RentPlan getPlan(String planType){

        if (planType == null){
            return null;
        }
        if (planType.equalsIgnoreCase("HOUSE")){
            return new House();
        }
        else if(planType.equalsIgnoreCase("CONDO")){
            return new Condo();
        }
        else if(planType.equalsIgnoreCase("Apartment")){
            return new Apartment();
        }
        return null;
    }

}
