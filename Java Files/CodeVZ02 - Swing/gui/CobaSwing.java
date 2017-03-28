import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
public class CobaSwing extends JDialog
{
  JTextField txtName;
  JTextField txtPhone;
  JRadioButton rdoMale;
  JRadioButton rdoFemale;
  JComboBox cmbCategory;
  JCheckBox chkSport;
  JCheckBox chkReading;
  JCheckBox chkShopping;
  public CobaSwing( JFrame frame ) {
    super( frame, true );
    setTitle( "Input Dialog" );
    setSize( 500, 700 );
    // Creates a panel to hold all components
    JPanel panel = new JPanel( new BorderLayout() );
    panel.setLayout( new GridLayout(10,2) );
    JLabel lbl5 = new JLabel( "Name" );
    panel.add( lbl5);
    txtName= new JTextField();
    panel.add( txtName);
    JLabel lbl6 = new JLabel( "Telephone" );
    panel.add( lbl6);
    txtPhone= new JTextField();
    panel.add( txtPhone);
    JLabel lbl7 = new JLabel( "Sex" );
    panel.add( lbl7);
    JPanel radioPanel = new JPanel();
    radioPanel.setLayout( new FlowLayout( FlowLayout.LEFT, 5, 0 ) );
    ButtonGroup group = new ButtonGroup();
    rdoMale = new JRadioButton( "Male" );
    rdoMale.setSelected( true );
    group.add( rdoMale);
    rdoFemale = new JRadioButton( "Female" );
    group.add( rdoFemale );
    radioPanel.add( rdoMale );
    radioPanel.add( rdoFemale );
    panel.add( radioPanel);
    JLabel lbl3 = new JLabel( "Category" );
    panel.add( lbl3);
    cmbCategory = new JComboBox();
    cmbCategory.addItem( "Lecturer" );
    cmbCategory.addItem( "Student" );
    panel.add( cmbCategory);
    JLabel lbl9 = new JLabel( "Hobby" );
    panel.add( lbl9);
    JPanel chkPanel = new JPanel();

    chkPanel.setLayout( new FlowLayout( FlowLayout.LEFT, 10, 0 ) );
    chkSport = new JCheckBox( "Sport" );
    chkSport.setSelected( true );
    chkReading = new JCheckBox( "Reading" );
    chkShopping = new JCheckBox( "Shopping" );
    chkPanel.add( chkSport );
    chkPanel.add( chkReading );
    chkPanel.add( chkShopping );
    panel.add( chkPanel);
    JButton submitBtn = new JButton( "Submit" );
    panel.add( submitBtn);
    JButton cancelBtn = new JButton( "Cancel" );
    panel.add( cancelBtn);

    JButton helpBtn = new JButton( "Help" );
    panel.add( helpBtn);
    //action listener
    WindowAdapter wndCloser = new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    };
    addWindowListener( wndCloser );
    submitBtn.addActionListener (new java.awt.event.ActionListener () {
                                   public void actionPerformed (java.awt.event.ActionEvent
                                                                        evt) {
                                     submitBtn_Click ();
                                   }
                                 }
    );
    cancelBtn.addActionListener (new java.awt.event.ActionListener () {
      public void actionPerformed (java.awt.event.ActionEvent
                                           evt) {
        cancelBtn_Click ();
      }
                                 }
    );
    helpBtn.addActionListener (new java.awt.event.ActionListener () {
                                 public void actionPerformed (java.awt.event.ActionEvent
                                                                      evt) {
                                   helpBtn_Click ();
                                 }
                               }
    );
    setContentPane(panel);
    setVisible( true );
  }
  //penangan event
  private void submitBtn_Click(){
    String st;

    st="Name: "+txtName.getText();
    st+="\nPhone: "+txtPhone.getText();
    if (rdoMale.isSelected()) {
      st+="\nSex: "+rdoMale.getText();
    }
    else {
      st+="\nSex: "+rdoFemale.getText();
    }
    st+="\nCategory: "+cmbCategory.getSelectedItem();
    st+="\nHobby: ";
    if (chkSport.isSelected()) st+= chkSport.getText()+" ";
    if (chkReading.isSelected()) st+= chkReading.getText()+" ";
    if (chkShopping.isSelected()) st+= chkShopping.getText()+"\n";

    JOptionPane.showMessageDialog(null, st,"Data", 0);
    JOptionPane.showMessageDialog(null, "Submit Click","Submit Title", 0);
  };
  private void cancelBtn_Click(){
    JOptionPane.showMessageDialog(null, "Cancel Click","Cancel Title", 0);
  };
  private void helpBtn_Click(){
    JOptionPane.showMessageDialog(null, "Help Click","Help Title",
            0);
  };
  public static void main( String[] args ) {
    new CobaSwing( new JFrame() ).show();
  }
}