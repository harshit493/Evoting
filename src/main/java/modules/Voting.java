/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modules;

import basicclasses.EvotingDB;
import basicclasses.Mail;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HARSHIT
 */
public class Voting extends javax.swing.JFrame {
    EvotingDB db;
    String voterid;
    String email;
    /**
     * Creates new form voting
     */
    public Voting(String id,String mail) {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int)(dimension.getWidth());
        int y = (int)(dimension.getHeight());
        this.setSize(x, y);
        System.out.println(x);
        System.out.println(y);
        voterid = id;
        email = mail;
        
        p1logo.setVisible(false);
        p1name.setVisible(false);
        p1bt.setVisible(false);
        
        p2logo.setVisible(false);
        p2name.setVisible(false);
        p2bt.setVisible(false);
        
        p3logo.setVisible(false);
        p3name.setVisible(false);
        p3bt.setVisible(false);
        
        p4logo.setVisible(false);
        p4name.setVisible(false);
        p4bt.setVisible(false);
        
        p5logo.setVisible(false);
        p5name.setVisible(false);
        p5bt.setVisible(false);
       
        p6logo.setVisible(false);
        p6name.setVisible(false);
        p6bt.setVisible(false);
        
        p7logo.setVisible(false);
        p7name.setVisible(false);
        p7bt.setVisible(false);
        
        p8logo.setVisible(false);
        p8name.setVisible(false);
        p8bt.setVisible(false);
        
        p9logo.setVisible(false);
        p9name.setVisible(false);
        p9bt.setVisible(false);
        
        p10logo.setVisible(false);
        p10name.setVisible(false);
        p10bt.setVisible(false);
        
        p11logo.setVisible(false);
        p11name.setVisible(false);
        p11bt.setVisible(false);
        
        p12logo.setVisible(false);
        p12name.setVisible(false);
        p12bt.setVisible(false);
        
        p13logo.setVisible(false);
        p13name.setVisible(false);
        p13bt.setVisible(false);
        
        p14logo.setVisible(false);
        p14name.setVisible(false);
        p14bt.setVisible(false);
        
        p15logo.setVisible(false);
        p15name.setVisible(false);
        p15bt.setVisible(false);
        
        p16logo.setVisible(false);
        p16name.setVisible(false);
        p16bt.setVisible(false);
        
        p17logo.setVisible(false);
        p17name.setVisible(false);
        p17bt.setVisible(false);
        
        p18logo.setVisible(false);
        p18name.setVisible(false);
        p18bt.setVisible(false);
        getParty();
        
    }
    
    public void getParty(){
        String query = "SELECT * FROM `partydetails` WHERE `partyID` = 1";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p1name.setText(db.rs.getString("PartyName")); 
            p1name.setVisible(true);
            
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p1logo.setIcon(new ImageIcon(img));
            p1logo.setVisible(true);
            p1bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 2";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p2name.setText(db.rs.getString("PartyName")); 
            p2name.setVisible(true);
           
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p2logo.setIcon(new ImageIcon(img));
            p2logo.setVisible(true);
            p2bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 3";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p3name.setText(db.rs.getString("PartyName")); 
            p3name.setVisible(true);
           
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p3logo.setIcon(new ImageIcon(img));
            p3logo.setVisible(true);
            p3bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 4";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p4name.setText(db.rs.getString("PartyName")); 
            p4name.setVisible(true);
                
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p4logo.setIcon(new ImageIcon(img));
            p4logo.setVisible(true);
            p4bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 5";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p5name.setText(db.rs.getString("PartyName")); 
            p5name.setVisible(true);
              
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p5logo.setIcon(new ImageIcon(img));
            p5logo.setVisible(true);
            p5bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 6";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p6name.setText(db.rs.getString("PartyName")); 
            p6name.setVisible(true);
           
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p6logo.setIcon(new ImageIcon(img));
            p6logo.setVisible(true);
            p6bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 7";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try
        {
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p7name.setText(db.rs.getString("PartyName")); 
            p7name.setVisible(true);
           
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p7logo.setIcon(new ImageIcon(img));
            p7logo.setVisible(true);
            p7bt.setVisible(true);
        }catch(Exception e)
        {
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 8";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p8name.setText(db.rs.getString("PartyName")); 
            p8name.setVisible(true);
                
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p8logo.setIcon(new ImageIcon(img));
            p8logo.setVisible(true);
            p8bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 9";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p9name.setText(db.rs.getString("PartyName")); 
            p9name.setVisible(true);
            
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p9logo.setIcon(new ImageIcon(img));
            p9logo.setVisible(true);
            p9bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 10";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p10name.setText(db.rs.getString("PartyName")); 
            p10name.setVisible(true);
           
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p10logo.setIcon(new ImageIcon(img));
            p10logo.setVisible(true);
            p10bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 11";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p11name.setText(db.rs.getString("PartyName")); 
            p11name.setVisible(true);
           
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p11logo.setIcon(new ImageIcon(img));
            p11logo.setVisible(true);
            p11bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 12";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p12name.setText(db.rs.getString("PartyName")); 
            p12name.setVisible(true);
                
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p12logo.setIcon(new ImageIcon(img));
            p12logo.setVisible(true);
            p12bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 13";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p13name.setText(db.rs.getString("PartyName")); 
            p13name.setVisible(true);
              
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p13logo.setIcon(new ImageIcon(img));
            p13logo.setVisible(true);
            p13bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 14";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p14name.setText(db.rs.getString("PartyName")); 
            p14name.setVisible(true);
           
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p14logo.setIcon(new ImageIcon(img));
            p14logo.setVisible(true);
            p14bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 15";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try
        {
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p15name.setText(db.rs.getString("PartyName")); 
            p15name.setVisible(true);
           
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p15logo.setIcon(new ImageIcon(img));
            p15logo.setVisible(true);
            p15bt.setVisible(true);
        }catch(Exception e)
        {
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 16";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p16name.setText(db.rs.getString("PartyName")); 
            p16name.setVisible(true);
                
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p16logo.setIcon(new ImageIcon(img));
            p16logo.setVisible(true);
            p16bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 17";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try
        {
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p17name.setText(db.rs.getString("PartyName")); 
            p17name.setVisible(true);
           
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p17logo.setIcon(new ImageIcon(img));
            p17logo.setVisible(true);
            p17bt.setVisible(true);
        }catch(Exception e)
        {
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
        
        query = "SELECT * FROM `partydetails` WHERE `partyID` = 18";
        //System.out.println(query);
        // get parties details
        db = new EvotingDB();
        try{
            db.rs = db.stm.executeQuery(query);
            db.rs.next();
            p18name.setText(db.rs.getString("PartyName")); 
            p18name.setVisible(true);
                
            BufferedImage bi = ImageIO.read(db.rs.getBinaryStream("PartyLogo"));
            Image img = bi.getScaledInstance(70, 70, Image.SCALE_SMOOTH );
            p18logo.setIcon(new ImageIcon(img));
            p18logo.setVisible(true);
            p18bt.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
            //JOptionPane.showMessageDialog(this,"");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p2logo = new javax.swing.JLabel();
        p4logo = new javax.swing.JLabel();
        p1logo = new javax.swing.JLabel();
        p3logo = new javax.swing.JLabel();
        p1name = new javax.swing.JLabel();
        p2name = new javax.swing.JLabel();
        p3name = new javax.swing.JLabel();
        p4name = new javax.swing.JLabel();
        p2bt = new javax.swing.JButton();
        p1bt = new javax.swing.JButton();
        p4bt = new javax.swing.JButton();
        p3bt = new javax.swing.JButton();
        p5logo = new javax.swing.JLabel();
        p5name = new javax.swing.JLabel();
        p5bt = new javax.swing.JButton();
        p6logo = new javax.swing.JLabel();
        p6name = new javax.swing.JLabel();
        p6bt = new javax.swing.JButton();
        p7logo = new javax.swing.JLabel();
        p7name = new javax.swing.JLabel();
        p7bt = new javax.swing.JButton();
        p8logo = new javax.swing.JLabel();
        p8name = new javax.swing.JLabel();
        p8bt = new javax.swing.JButton();
        p9logo = new javax.swing.JLabel();
        p9name = new javax.swing.JLabel();
        p9bt = new javax.swing.JButton();
        p10logo = new javax.swing.JLabel();
        p10name = new javax.swing.JLabel();
        p10bt = new javax.swing.JButton();
        p11logo = new javax.swing.JLabel();
        p11name = new javax.swing.JLabel();
        p11bt = new javax.swing.JButton();
        p12logo = new javax.swing.JLabel();
        p12name = new javax.swing.JLabel();
        p12bt = new javax.swing.JButton();
        p13logo = new javax.swing.JLabel();
        p13name = new javax.swing.JLabel();
        p13bt = new javax.swing.JButton();
        p14logo = new javax.swing.JLabel();
        p14name = new javax.swing.JLabel();
        p14bt = new javax.swing.JButton();
        p15logo = new javax.swing.JLabel();
        p15name = new javax.swing.JLabel();
        p15bt = new javax.swing.JButton();
        p16logo = new javax.swing.JLabel();
        p16name = new javax.swing.JLabel();
        p16bt = new javax.swing.JButton();
        p17logo = new javax.swing.JLabel();
        p17name = new javax.swing.JLabel();
        p17bt = new javax.swing.JButton();
        p18logo = new javax.swing.JLabel();
        p18name = new javax.swing.JLabel();
        p18bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VOTING");
        setPreferredSize(new java.awt.Dimension(10000, 10000));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(990, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLEASE SELECT YOUR VOTE");

        p2logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p4logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p1logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p3logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p1name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1name.setText("Party Name");

        p2name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2name.setText("Party Name");

        p3name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3name.setText("Party Name");

        p4name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p4name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4name.setText("Party Name");

        p2bt.setText("VOTE");
        p2bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2btActionPerformed(evt);
            }
        });

        p1bt.setText("VOTE");
        p1bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1btActionPerformed(evt);
            }
        });

        p4bt.setText("VOTE");
        p4bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4btActionPerformed(evt);
            }
        });

        p3bt.setText("VOTE");
        p3bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3btActionPerformed(evt);
            }
        });

        p5logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p5name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p5name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5name.setText("Party Name");

        p5bt.setText("VOTE");
        p5bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5btActionPerformed(evt);
            }
        });

        p6logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p6name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p6name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6name.setText("Party Name");

        p6bt.setText("VOTE");
        p6bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6btActionPerformed(evt);
            }
        });

        p7logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p7name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p7name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7name.setText("Party Name");

        p7bt.setText("VOTE");
        p7bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7btActionPerformed(evt);
            }
        });

        p8logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p8name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p8name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8name.setText("Party Name");

        p8bt.setText("VOTE");
        p8bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8btActionPerformed(evt);
            }
        });

        p9logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p9name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p9name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9name.setText("Party Name");

        p9bt.setText("VOTE");
        p9bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9btActionPerformed(evt);
            }
        });

        p10logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p10name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p10name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p10name.setText("Party Name");

        p10bt.setText("VOTE");
        p10bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10btActionPerformed(evt);
            }
        });

        p11logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p11name.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        p11name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p11name.setText("Party Name");

        p11bt.setText("VOTE");
        p11bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11btActionPerformed(evt);
            }
        });

        p12logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p12name.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        p12name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p12name.setText("Party Name");

        p12bt.setText("VOTE");
        p12bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12btActionPerformed(evt);
            }
        });

        p13logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p13name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p13name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p13name.setText("Party Name");

        p13bt.setText("VOTE");
        p13bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13btActionPerformed(evt);
            }
        });

        p14logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p14name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p14name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p14name.setText("Party Name");

        p14bt.setText("VOTE");
        p14bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p14btActionPerformed(evt);
            }
        });

        p15logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p15name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p15name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p15name.setText("Party Name");

        p15bt.setText("VOTE");
        p15bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p15btActionPerformed(evt);
            }
        });

        p16logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p16name.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        p16name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p16name.setText("Party Name");

        p16bt.setText("VOTE");
        p16bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p16btActionPerformed(evt);
            }
        });

        p17logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p17name.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        p17name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p17name.setText("Party Name");

        p17bt.setText("VOTE");
        p17bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p17btActionPerformed(evt);
            }
        });

        p18logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        p18name.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        p18name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p18name.setText("Party Name");

        p18bt.setText("VOTE");
        p18bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p18btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p1logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p1name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p1bt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p2name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p2bt))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p6logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p6name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p5logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p5name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(p4logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p4name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(p3logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p3name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3bt)
                            .addComponent(p4bt)
                            .addComponent(p5bt)
                            .addComponent(p6bt))))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p7logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p8logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p7name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p7bt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p8name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p8bt))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p12logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p12name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p11logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p11name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(p10logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p10name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(p9logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p9name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p9bt)
                            .addComponent(p10bt)
                            .addComponent(p11bt)
                            .addComponent(p12bt))))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p13logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p14logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p13name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p13bt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p14name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p14bt))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p18logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p18name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p17logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p17name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(p16logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p16name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(p15logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p15name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p15bt)
                            .addComponent(p16bt)
                            .addComponent(p17bt)
                            .addComponent(p18bt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(p1logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(p1name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p1bt))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(p2logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(p2name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p2bt))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(p3logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(p3name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p3bt))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(p4logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(p4name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p4bt))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p5logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(p5name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p5bt))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p6logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(p6name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p6bt)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p7logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p7name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p7bt))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(p8logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p8name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p8bt))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(p9logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p9name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p9bt))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(p10logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p10name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p10bt))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p11logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p11name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p11bt))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p12logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p12name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p12bt)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p13logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p13name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p13bt))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(p14logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p14name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p14bt))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(p15logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p15name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p15bt))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(p16logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p16name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p16bt))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p17logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p17name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p17bt))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p18logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p18name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p18bt))))))))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p3btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','3','"+p3name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p3btActionPerformed

    private void p2btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','2','"+p2name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p2btActionPerformed

    private void p8btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','8','"+p8name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_p8btActionPerformed

    private void p9btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','9','"+p9name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_p9btActionPerformed

    private void p14btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p14btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','14','"+p14name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_p14btActionPerformed

    private void p15btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p15btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','15','"+p15name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p15btActionPerformed

    private void p1btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','1','"+p1name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
            
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_p1btActionPerformed

    private void p4btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4btActionPerformed
        
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','4','"+p4name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();
        // TODO ad

        // TODO add your handling code here:
    }//GEN-LAST:event_p4btActionPerformed

    private void p5btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','5','"+p5name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_p5btActionPerformed

    private void p6btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','6','"+p6name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_p6btActionPerformed

    private void p7btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','7','"+p7name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_p7btActionPerformed

    private void p10btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','10','"+p10name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p10btActionPerformed

    private void p11btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','11','"+p11name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p11btActionPerformed

    private void p12btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','12','"+p12name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p12btActionPerformed

    private void p13btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','13','"+p13name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p13btActionPerformed

    private void p16btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p16btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','16','"+p16name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p16btActionPerformed

    private void p17btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p17btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','17','"+p17name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p17btActionPerformed

    private void p18btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p18btActionPerformed
        String query = "INSERT INTO `votes`(`VoterIdNo`, `partyid`, `partyname`) VALUES ('"+voterid+"','18','"+p18name.getText()+"')";
        System.out.println(query);
        
        // To insert values of this tab in database
        db = new EvotingDB();
        try
        {
            db.stm.executeUpdate(query);
            //JOptionPane.showMessageDialog(this,"Your Vote Recorded!!!");
            Mail vm = new Mail(email,voterid);
        }catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"");
        }
        this.setVisible(false);
        Login log = new Login(this,true);
        log.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_p18btActionPerformed

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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String a = null;
                String b = null;
                new Voting(a,b).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton p10bt;
    private javax.swing.JLabel p10logo;
    private javax.swing.JLabel p10name;
    private javax.swing.JButton p11bt;
    private javax.swing.JLabel p11logo;
    private javax.swing.JLabel p11name;
    private javax.swing.JButton p12bt;
    private javax.swing.JLabel p12logo;
    private javax.swing.JLabel p12name;
    private javax.swing.JButton p13bt;
    private javax.swing.JLabel p13logo;
    private javax.swing.JLabel p13name;
    private javax.swing.JButton p14bt;
    private javax.swing.JLabel p14logo;
    private javax.swing.JLabel p14name;
    private javax.swing.JButton p15bt;
    private javax.swing.JLabel p15logo;
    private javax.swing.JLabel p15name;
    private javax.swing.JButton p16bt;
    private javax.swing.JLabel p16logo;
    private javax.swing.JLabel p16name;
    private javax.swing.JButton p17bt;
    private javax.swing.JLabel p17logo;
    private javax.swing.JLabel p17name;
    private javax.swing.JButton p18bt;
    private javax.swing.JLabel p18logo;
    private javax.swing.JLabel p18name;
    private javax.swing.JButton p1bt;
    private javax.swing.JLabel p1logo;
    private javax.swing.JLabel p1name;
    private javax.swing.JButton p2bt;
    private javax.swing.JLabel p2logo;
    private javax.swing.JLabel p2name;
    private javax.swing.JButton p3bt;
    private javax.swing.JLabel p3logo;
    private javax.swing.JLabel p3name;
    private javax.swing.JButton p4bt;
    private javax.swing.JLabel p4logo;
    private javax.swing.JLabel p4name;
    private javax.swing.JButton p5bt;
    private javax.swing.JLabel p5logo;
    private javax.swing.JLabel p5name;
    private javax.swing.JButton p6bt;
    private javax.swing.JLabel p6logo;
    private javax.swing.JLabel p6name;
    private javax.swing.JButton p7bt;
    private javax.swing.JLabel p7logo;
    private javax.swing.JLabel p7name;
    private javax.swing.JButton p8bt;
    private javax.swing.JLabel p8logo;
    private javax.swing.JLabel p8name;
    private javax.swing.JButton p9bt;
    private javax.swing.JLabel p9logo;
    private javax.swing.JLabel p9name;
    // End of variables declaration//GEN-END:variables

    private void setPreferredSize(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
