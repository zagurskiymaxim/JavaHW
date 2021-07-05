import java.util.Scanner;


public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void processUser(){
        Scanner sc = new Scanner(System.in);
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER,
                                GlobalConstants.PRIMARY_MAX_BARRIER);

        model.setSecretValue();
        System.out.println(model.getSecretValue());

        while (model.checkValue(intputValue(sc)));

        view.printMessage(View.WON + model.getSecretValue());
        view.printMessage(View.STATS + model.getYourWay());
    }

    private int intputValue(Scanner sc) {
        int res = 0;
        view.printMessage(getInputIntMessage());
        while (true) {
            // check int-value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT + getInputIntMessage());
                sc.next();
            }
            
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(View.WRONG_INPUT + getInputIntMessage());
                continue;
            }
            break;
        }
        return res;
    }

    private String getInputIntMessage() {
        return view.concatenationString(
                View.INPUT_VALUE,
                String.valueOf(model.getMinBarrier()), View.SPACE,
                String.valueOf(model.getMaxBarrier()),
                View.SPACE,
                View.EQUAL, View.SPACE );
    }
}
