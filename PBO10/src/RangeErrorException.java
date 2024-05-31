
public class RangeErrorException extends Throwable {
    public RangeErrorException(String s){
        super(s);
    }
    
    public static void main(String[] args){
        int position = 1;
        try{
            if(position>0){
                throw new RangeErrorException("position" + position);
            }
        }
        catch(RangeErrorException e){
            System.out.println("Rabge error: " + e.getMessage());
        }
        System.out.println("This is the last program");
    }
}
