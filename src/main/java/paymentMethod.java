
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Nur Aisyah
 */
public class paymentMethod extends javax.swing.JFrame {

    
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    private String tid;
    private String fid;
    private String fn;
    private String ln;
    private String px;
    private String tp;
    private double tx;
    private double gt;
    private String gd;
    private String bd;
    private String custId;
    private String dater;

    /**
     * Creates new form paymentMethod
     */

    
    public paymentMethod() {
      
       
        initComponents();
         conn=connection.ConnectDb();
        //Random();
        //data();
        showData();
          timehere();
     
         

    }

   /*  paymentMethod(String ticketid, String flightid, String fname, String lname, String heregender, String bdate, String pax, String totprice, int tax) {
        initComponents();
        
        this.tid = ticketid;
        this.fid = flightid;
        this.fn = fname;
        this.ln = lname;
        this.gd = heregender;
        this.bd = bdate;
        this.px = pax;
        this.tp = totprice;
        this.tx = tax;
       
        
       flightIdtxt.setText(String.valueOf(fid));
        
        fnametxt.setText(String.valueOf(fn));
        lnametxt.setText(String.valueOf(ln));
        gendertxt.setText(String.valueOf(gd));
        dob.setText(String.valueOf(bd));
        paxtxt.setText(String.valueOf(px));
        
        totaltxt.setText(String.valueOf(gt));
        
        subtotaltxt.setText(String.valueOf(tp));
        taxtxt.setText(String.valueOf(tx));
    }*/

    public void showData(){
        {
                    try {
                String sql = "SELECT customer.* FROM customer ORDER BY ticketId DESC LIMIT 1;";
                pst=conn.prepareStatement(sql);
                rs = pst.executeQuery(sql);
                if(rs.next()){
                this.custId = rs.getString("ticketId");
                flightIdtxt.setText(rs.getString("flightId"));
                fnametxt.setText(rs.getString("firstName"));
                lnametxt.setText(rs.getString("lastName"));
                //gendertxt.setText(rs.getString("gender"));
                dob.setText(rs.getString("birthDate"));
                paxtxt.setText(rs.getString("noOfPax"));
                subtotaltxt.setText(rs.getString("totalPrice"));
                
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
        }
        
        
        int sub = Integer.parseInt(subtotaltxt.getText());  
        int tax = (int) (sub * 0.15);
        int total = tax + sub;
        
        String taxlol = Integer.toString(tax);
        String gtotal = Integer.toString(total);
        
        taxtxt.setText(taxlol);
        totaltxt.setText("RM " + gtotal);
                    
    }
    

    public void Random(){
        Random rd=new Random();
    flightIdtxt.setText(""+rd.nextInt(1000+1));      
    }
    
    
    public void timehere(){
         //Converting milliseconds to Date using java.util.Date
       //current time in milliseconds
       long currentDateTime = System.currentTimeMillis();
     
       //creating Date from millisecond
       Date currentDate = new Date(currentDateTime);
     
       //printing value of Date
     
     
       DateFormat df = new SimpleDateFormat("dd:MM:yy:HH:mm");
     
       //formatted value of current Date
       this.dater = df.format(currentDate);
       //jLabel2.setText(df.format(currentDate));
    }
    
   /* public void data(){
        String sql="select firstName, lastName, noOfPax, totalPrice from customer where ticketId = ? ";
                try{
            
       String sql = "SELECT customer.gender FROM customer ORDER BY flightId DESC LIMIT 1;";
        
            pst=conn.prepareStatement(sql);
            pst.setString(1,bookId.getText());
            ResultSet rs=pst.executeQuery();   
            
            if(rs.next()) { 
                String fn = rs.getString("firstName");
                fname.setText(fn);
                String ln = rs.getString("lastName");
                lname.setText(ln);
                //String bd = rs.getDate("birthDate").toString();
               // dob.setText(bd);
               
                String nop = rs.getString("noOfPax");
                pax.setText(nop);
                String tp = rs.getString("totalPrice");
                total.setText(tp);
            }      
    }
        catch (SQLException e ) {
    JOptionPane.showMessageDialog(null, e);
        }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMethod = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        taxtxt = new javax.swing.JLabel();
        flightIdtxt = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        paxtxt = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totaltxt = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subtotaltxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        fnametxt = new javax.swing.JLabel();
        lnametxt = new javax.swing.JLabel();
        gendertxt = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        fpx = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        dcCard = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbConfirm = new javax.swing.JCheckBox();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        taxtxt.setText("jLabel11");

        flightIdtxt.setText("lbl");
        flightIdtxt.setToolTipText("");

        jLabel31.setText("Passengers");

        jLabel23.setText("Included");

        paxtxt.setText("jLabel5");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setText("Your Booking!");

        jLabel33.setText("Checked Baggage");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Total:");

        totaltxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totaltxt.setText("number");

        jLabel25.setText("Flight ID");

        jLabel26.setText("Hand luggage");

        jLabel27.setText("Free");

        jLabel28.setText("Taxes and fees");

        jLabel4.setText("Subtotal");

        subtotaltxt.setText("jLabel5");

        jLabel6.setText("RM");

        jLabel7.setText("RM");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel24))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel31)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(128, 128, 128)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(paxtxt)
                            .addComponent(flightIdtxt)
                            .addComponent(jLabel23))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(156, 156, 156)
                        .addComponent(totaltxt)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtotaltxt)
                            .addComponent(taxtxt))
                        .addGap(28, 28, 28))))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(flightIdtxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(paxtxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(subtotaltxt)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(taxtxt)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(totaltxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(204, 204, 204));

        fnametxt.setText("firstname");

        lnametxt.setText("lastname");

        gendertxt.setText("gender");

        dob.setText("birthdate");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Passenger details");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(dob)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gendertxt))
                        .addGap(18, 18, 18)
                        .addComponent(lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnametxt)
                    .addComponent(lnametxt))
                .addGap(18, 18, 18)
                .addComponent(gendertxt)
                .addGap(18, 18, 18)
                .addComponent(dob)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setText("Choose payment method");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel34.setText("Check your flight");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Book and pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Enter 16-digit card number");
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jLabel11.setText("Expiration date:");

        jLabel12.setText("Security code:");

        jLabel13.setText("Cardholder's name:");

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setText("Enter first and last name");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        buttonGroupMethod.add(fpx);
        fpx.setText("Online Banking (FPX)");
        fpx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpxActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "year", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));

        buttonGroupMethod.add(dcCard);
        dcCard.setText("Debit/Credit Card");
        dcCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcCardActionPerformed(evt);
            }
        });

        jLabel9.setText("You will be redirected to Online Banking page to login your selected bank to complete your transaction.");

        jLabel10.setText("Card number:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Confirm");

        cbConfirm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbConfirm.setText("I agree with the Terms and Conditions and confirm all traveler and payment data is correct.");

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbConfirm)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(backButton)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcCard)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(82, 82, 82)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 718, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(fpx)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(67, 67, 67)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(jLabel34)
                    .addContainerGap(933, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(fpx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(38, 38, 38)
                        .addComponent(dcCard)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(backButton))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jLabel34)
                    .addContainerGap(733, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        
        if(jTextField1.getText().equals("Enter 16-digit card number")){
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        
        if(jTextField1.getText().equals("")){
            jTextField1.setText("Enter 16-digit card number");
            jTextField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        
        if(jTextField4.getText().equals("Enter first and last name")){
            jTextField4.setText("");
            jTextField4.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        
        if(jTextField4.getText().equals("")){
            jTextField4.setText("Enter first and last name");
            jTextField4.setForeground(new Color(153,153,153));
        }      
    }//GEN-LAST:event_jTextField4FocusLost

    private void dcCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcCardActionPerformed
        // TODO add your handling code here:
        jTextField1.setEditable(true);
        jComboBox1.setEditable(true);
        jComboBox2.setEditable(true);
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
       
    }//GEN-LAST:event_dcCardActionPerformed

    private void fpxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpxActionPerformed
        // TODO add your handling code here:
        jTextField1.setEditable(false);
        jComboBox1.setEditable(false);
        jComboBox2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
    }//GEN-LAST:event_fpxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(!cbConfirm.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Please click confirm if you agree with the Terms and Conditions");
        }
        
        else if(cbConfirm.isSelected()){
            
            
        String time = jLabel2.getText();
        String totprice = totaltxt.getText();
        String flightid = flightIdtxt.getText();
        String finame = fnametxt.getText();
        String lname = lnametxt.getText();
        String heregender = gendertxt.getText();
        String bdate = dob.getText();
        String pax = paxtxt.getText();
        String date = jLabel2.getText();
           
        String method;
        if(fpx.isSelected()){
            method = "Online Banking";
        }
        else 
            method = "Debit/Credit Card";
        JOptionPane.showMessageDialog(rootPane,totprice+ ". " + flightid + " " + finame + " " +  lname + " " + heregender + " " + bdate + " " + pax + " " + method);
        
        

        
       {
            try {
                String sql="insert into payment(CustomerID,Amount,Date,PaymentMethod)values("+custId+",'"+totprice+"','"+dater+"','"+method+"')"; 
            pst=conn.prepareStatement(sql);
            //pst.setString(1, ticketid);
            //pst.setString(1, flightid);
            //pst.setString(2, finame);          
            //pst.setString(3, lname);
            //pst.setString(4, heregender);
            //pst.setString(5, bdate);
            //pst.setString(6, pax);
            //pst.setString(7, totprice);
            //pst.setString(8, time);
            //pst.setString(8, method);
            
            pst.execute();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                throw new RuntimeException(e);
            
        }
        
        
        
        //setVisible(false);
        //Payment ob=new Payment();
        //ob.setVisible(true);    
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        BookTicket ob=new BookTicket();
        ob.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(paymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroupMethod;
    private javax.swing.JCheckBox cbConfirm;
    private javax.swing.JRadioButton dcCard;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel flightIdtxt;
    private javax.swing.JLabel fnametxt;
    private javax.swing.JRadioButton fpx;
    private javax.swing.JLabel gendertxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lnametxt;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JLabel paxtxt;
    private javax.swing.JLabel subtotaltxt;
    private javax.swing.JLabel taxtxt;
    private javax.swing.JLabel totaltxt;
    // End of variables declaration//GEN-END:variables
}
