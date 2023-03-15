import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Flights extends JFrame {

    private JLabel fromLabel;
    private JPanel mainPanel;
    private JButton searchButton;
    private JButton clearButton;

    private JList list1;
    private JLabel flightPrice;
    private JList list2;
    private JButton bookButton;
    private JTextField departField;
    private JTextField returnField;
    private JScrollBar scrollBar1;

    public Flights(){

        setContentPane(mainPanel);
        setSize(600,800);
        setTitle("Flight Booking System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        //clear button action
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnField.setText("");
                departField.setText("");

                flightPrice.setText("");
            }
        });
        //search button action
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int number = (int)Math.floor(Math.random() * (2000 - 600 + 1) + 600);

                flightPrice.setText("There is a flight available from: " + list1.getSelectedValue() + " to: "
                        + list2.getSelectedValue()
                        + " for £" + number);


            }
        });
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Book book = new Book();
                book.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Flights flight = new Flights();

    }
}
