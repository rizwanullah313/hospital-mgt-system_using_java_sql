
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIZWAN ULLAH
 */
public class Receptionclas {
    Connection con = DBConnection.setConnection();
     ResultSet rst;
     public void addp(int i,String nam,int h,String Gender,String ad,int po,String d,int bno,int wno)
     {
        try{
    String sql = "insert into inpatient (ADMITID,APNAME,ADMITDATE,APGENDER,APADDRESS,APPHONENO,ADISEASE,BIDNO,WARDNO) values ('"+i+ "','"+nam+ "','"+h+ "','"+Gender+ "','"+ad+ "','"+po+ "','"+d+"','"+bno+"','"+wno+"')";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, " Insert success ");  
              }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Not Insert ");  
        }}}