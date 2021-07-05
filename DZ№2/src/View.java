public class View {

    public static final String EQUAL = "=";
    public static final String SPACE = " ";


    public static final String INPUT_VALUE = "Input value";
    public static final String WRONG_INPUT = "Wrong input!";
    public static final String WON = "You WON!";
    public static final String STATS = "Stats = ";


    public void printMessage (String message){
        System.out.println(message);
    }

    public String concatenationString (String... message){
        StringBuilder concatString = new StringBuilder();
        for (String v : message){
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
