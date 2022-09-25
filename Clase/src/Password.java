import javax.swing.*;
import java.util.Scanner;

public class Password {

    public String _password1 = null;
    public String _password2 = null;


    public void InputPassword(){
        _password1= JOptionPane.showInputDialog("Enter the password");
        _password2= JOptionPane.showInputDialog("Enter the password");

        var result = _password1.equals(_password2);
        System.out.println(result);
    }

}
