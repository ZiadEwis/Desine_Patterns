public class CarFactory {
    public static Car getCar(String type){
        if (type.equalsIgnoreCase("BMW")){
            return new BMW();
        }
        else if (type.equalsIgnoreCase("Porche")){
            return new Porche();
        }
        else if (type.equalsIgnoreCase("Benz")){
            return new Benz();
        }
        else{
            throw new IllegalArgumentException("Invalid car type");
        }
    }
}
