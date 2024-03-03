import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame{
    JTextField name_field, email_field;
    JRadioButton male;
    JCheckBox check;

    public ContactForm(){
        super("Контактная форма");
        super.setBounds(200, 100, 700, 500);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 10));

        JLabel name = new JLabel("Введите имя:");
        name_field = new JTextField("", 1);
        JLabel email = new JLabel("Введите почту:"); // Changed "Введите имя:" to "Введите почту:"
        email_field = new JTextField("@", 1);

        container.add(name);
        container.add(name_field);
        container.add(email); // Added the email label to the container
        container.add(email_field);

        male = new JRadioButton("Мужской");
        JRadioButton female = new JRadioButton("Женский");
        check = new JCheckBox("Согласны?", false); // Changed "Согласен?" to "Согласны?"

        JButton send_button = new JButton("Отправить");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager()); // Changed addAncestorListener to addActionListener
    }

    class ButtonEventManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText(); // Changed getName() to getText()
            String email = email_field.getText(); // Changed getName() to getText()

            String isMale = "Мужской";
            if(male.isSelected())
                isMale = "Женский";

            boolean checkBox = check.isSelected();

            JOptionPane.showMessageDialog(null, "Ваша почта: " + email + "\nВаш пол: " + isMale + "\nВы согласны? " + checkBox, "Привет, " + name, JOptionPane.PLAIN_MESSAGE); // Added a colon after "Ваш пол" and a comma after "Привет"

        }
    }
}