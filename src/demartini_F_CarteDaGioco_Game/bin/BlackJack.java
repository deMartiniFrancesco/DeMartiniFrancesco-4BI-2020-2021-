package demartini_F_CarteDaGioco_Game.bin;

import org.springframework.util.ClassUtils;

import javax.swing.*;
import java.io.IOException;

/**
 * The type Black jack.
 */
public class BlackJack {


    /**
     * Number input int.
     *
     * @param inputDioalog the input dioalog
     * @return the int
     */
    public static int numberInput(String inputDioalog) {
        int returnedNumber = -1;

        while (returnedNumber <= 0) {
            try {
                returnedNumber = Integer.parseInt(input(inputDioalog));
                if (returnedNumber <= 0) System.out.println("Inserire numero maggiore di 0");
            } catch (Exception e) { // or your specific exception
                System.out.println("inserire numero valido");
            }
        }
        return returnedNumber;
    }

    public static String input(String inputDioalog) {
        String output = JOptionPane.showInputDialog(inputDioalog);
        output = output.toLowerCase();
        return output;
    }

    public static void confirmDialog(String inputDioalog, String title) {
        JOptionPane.showConfirmDialog(null,
                inputDioalog, title, JOptionPane.DEFAULT_OPTION);
    }

    public static boolean choseDialog(String inputDioalog, String title) {
        return JOptionPane.showConfirmDialog(null,
                inputDioalog, title, JOptionPane.YES_NO_OPTION) == 0;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) throws IOException {


        System.out.println("Start");


        // COSTANTI
        String resursesPath = "../file";
        String rulesPatah = "/rules.txt";
//        resursesPath = Objects.requireNonNull(BlackJack.class.getResource(resursesPath)).toString();

        System.out.println(System.getProperty("user.dir") + "/" + ClassUtils.convertClassNameToResourcePath(String.valueOf(BlackJack.class.getPackage())));


//        confirmDialog("Benvenuto in BlackJack", "BlackJack");
//
//        if (!choseDialog("Conosci giá le regle?", "BlackJack")) {
//            // show REGOLE
//            try {
//                BufferedReader reader = new BufferedReader(new FileReader(resursesPath + rulesPatah));
//                String currentLine = reader.readLine();
//                System.out.println(currentLine);
//                reader.close();
//            }catch (IOException e){
//                System.err.println(e);
//            }
//        }

//        Dealer dealer = new Dealer();
//
//        Player player = new Player(100);
//
//
//        player.setPuntata(numberInput("inserire punata"));
//
//        System.out.println(player);

        System.out.println("End");

    }
}
