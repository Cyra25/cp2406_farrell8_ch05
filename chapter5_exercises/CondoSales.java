import javax.swing.JOptionPane;
import java.awt.*;

public class CondoSales {
    public static void main(String[] args){
        int price = 0;
        String message = JOptionPane.showInputDialog("choose 1 for park view\nchoose 2 for golf course view, or \nchoose 3 for lake view");
        int userChoice = Integer.parseInt(message);
        if (userChoice == 1){
            price = price + 150000;
            JOptionPane.showMessageDialog(null, "Park view - $" + price);

        }
        else if (userChoice == 2){
            price = price + 170000;
            JOptionPane.showMessageDialog(null, "golf course view - $" + price);
        }
        else if (userChoice == 3){
            price = price + 210000;
            JOptionPane.showMessageDialog(null, "lake view - $" + price);
        }
        else {
            JOptionPane.showMessageDialog(null, "price - " + price);
        }
    }
}
