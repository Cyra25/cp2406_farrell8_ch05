import javax.swing.*;

public class CondoSales2 {
    public static void main(String[] args){

        int price = 0;
        String message = JOptionPane.showInputDialog("choose 1 for park view\nchoose 2 for golf course view, or \nchoose 3 for lake view");
        int userChoice = Integer.parseInt(message);
        message = JOptionPane.showInputDialog("1 - garage \n2 - parking space");
        int extra = Integer.parseInt(message);
        if (userChoice == 1){
            price = price + 150000;
            if (extra == 1) {
                price = price + 5000;
                JOptionPane.showMessageDialog(null, "Park view - $" + price);
            }
            else {
                JOptionPane.showMessageDialog(null, "Park view - $" + price);
            }
        }
        else if (userChoice == 2){
            price = price + 170000;
            if (extra == 1) {
                price = price + 5000;
                JOptionPane.showMessageDialog(null, "Golf course view - $" + price);
            }
            else {
                JOptionPane.showMessageDialog(null, "Golf course view - $" + price);
            }}
        else if (userChoice == 3){
            price = price + 210000;
            if (extra == 1) {
                price = price + 5000;
                JOptionPane.showMessageDialog(null, "Lake view - $" + price);
            }
            else {
                JOptionPane.showMessageDialog(null, "Lake view - $" + price);
            }}
        else {
            JOptionPane.showMessageDialog(null, "price - " + price);
        }
    }
}
