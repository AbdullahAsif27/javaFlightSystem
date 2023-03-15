import javax.swing.*;

public class Book extends JFrame {
    private JLabel nameLabel;
    private JTextField nameField;
    private JTextField emailField;
    private JLabel emailLabel;
    private JLabel addressLabel;
    private JTextArea addressTextArea;
    private JTextField cardholderField;
    private JLabel nameCardHolderLabel;
    private JTextField cardnumberField;
    private JLabel securityCodeLabel;
    private JTextField securitycodeField;
    private JLabel expiryLabel;
    private JTextField expiryField;
    private JButton submitAndPayButton;
    private JPanel bookingPanel;

    public Book(){
        setContentPane(bookingPanel);
        setSize(600,600);
        setTitle("Booking a flight");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
