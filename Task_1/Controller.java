package Task_1;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void userInput() {
        String word_1;
        String word_2;
        int flag = 0;

        view.entryMessageWord_1();
        Scanner sc = new Scanner(System.in);

        do {
            if (flag++ != 0) {
                view.wrongWord();
            }
            word_1 = sc.nextLine();
        } while (!firstWordChecker(word_1));

        view.entryMessageWord_2();

        flag = 0;

        do {
            if (flag++ != 0) {
                view.wrongWord();
            }
            word_2 = sc.nextLine();
        } while (!secondWordChecker(word_2));

        model.summary(word_1, word_2);
        view.finalMessage(model.summary);
    }

    public boolean firstWordChecker(String str) {
        return str.equals("Hello") ? true : false;
    }

    public boolean secondWordChecker(String str) {
        return str.equals("world!") ? true : false;
    }
}
