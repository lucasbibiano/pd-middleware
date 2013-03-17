package views;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginPasswordForm extends JPanel
{
  private JButton signUpBtn;
  private JTextField nameTxt;
  private JPasswordField pwdTxt;
  
  public LoginPasswordForm()
  {
    
    
    signUpBtn = new JButton("Sign Up");
    signUpBtn.addActionListener(null);
  }
}
