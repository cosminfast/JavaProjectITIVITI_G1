public class ProgramLogic {

    ReadFromKeyboard read = new ReadFromKeyboard();
    ProgramMenu menu = new ProgramMenu();
    MenuOptions options = new MenuOptions();

    public void runProgram() {
        boolean repeat;
        do {
            menu.printMenu();
            repeat = repeatProgram(read.getInt());
        } while (repeat);
    }

    private boolean repeatProgram(int number) {
        switch (number) {
            case 0:
                System.out.println("Bye bye");
                return false;
            case 1:
                options.doSum();
                return true;
            case 2:
                options.doSubstract();
                return true;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;

        }
    }

}
