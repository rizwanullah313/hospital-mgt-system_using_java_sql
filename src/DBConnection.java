import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class DBConnection 
{
        
    private static Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
        public static Connection setConnection(){
            Connection con = null;
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String dataSourceName="jdbc:oracle:thin:@localhost:1521:orcl";
        connection = DriverManager.getConnection(dataSourceName,"database","admin");
            }
            catch(Exception e)
            {
                System.out.println("Error in Connection");
            }
                return connection;
    }
      public int InsertUpdateDelete(String Sql)// this method is used for InsertUpdateDelete Statement
    {
        int flag=0;
        try {
            pst = connection.prepareStatement(Sql);
            flag = pst.executeUpdate();
        } catch (SQLException ex) {
            
        }
         return flag ;
    }
       public void CloseConnection(){
        
    if (rst != null) {
        try {
            rst.close();
        } catch (SQLException e) { /* ignored */}
    }
    if (pst != null) {
        try {
            pst.close();
        } catch (SQLException e) { /* ignored */}
    }
    if (connection != null) {
        try {
            connection.close();
        } catch (SQLException e) { /* ignored */}
    }
    }

     public void addmin(JTable M){
        try{
           Connection  con = setConnection();
           Statement st = con.createStatement();
               String sql = "Select * from doctor ";
               ResultSet rst = st.executeQuery(sql);
               M.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selection Failed");
        }
        ResultSet rst = null;
        //conn.CloseConnection();
}
      public void rec(JTable K){
        try{
           Connection  con = setConnection();
           Statement st = con.createStatement();
               String sql = "Select * from receptionist ";
               ResultSet rst = st.executeQuery(sql);
               K.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selection Failed");
        }
        ResultSet rst = null;
        //conn.CloseConnection();
}
    public void PAT(JTable P){
        try{
           Connection  con = setConnection();
           Statement st = con.createStatement();
               String sql2 = "Select * from inpatient ";
               ResultSet rst = st.executeQuery(sql2);
               P.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selection Failed");
        }
        ResultSet rst = null;
        //conn.CloseConnection();
}
     public void war(JTable w){
        try{
           Connection  con = setConnection();
           Statement st = con.createStatement();
               String sql2 = "Select * from ward ";
               ResultSet rst = st.executeQuery(sql2);
               w.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selection Failed");
        }
        ResultSet rst = null;
        //conn.CloseConnection();
}
     public void war1(JTable w){
        try{
           Connection  con = setConnection();
           Statement st = con.createStatement();
               String sql2 = "Select PID,PNAME from patient ";
               ResultSet rst = st.executeQuery(sql2);
               w.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selection Failed");
        }
        ResultSet rst = null;
        //conn.CloseConnection();
}
 public void bill(JTable b){
        try{
           Connection  con = setConnection();
           Statement st = con.createStatement();
               String sql2 = "Select * from bill ";
               ResultSet rst = st.executeQuery(sql2);
               b.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selection Failed");
        }
        ResultSet rst = null;
        //conn.CloseConnection();
} 
 public void opd(JTable o){
        try{
           Connection  con = setConnection();
           Statement st = con.createStatement();
               String sql2 = "Select * from opd ";
               ResultSet rst = st.executeQuery(sql2);
               o.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selection Failed");
        }
        ResultSet rst = null;
        //conn.CloseConnection();
}
  public void m1(JTable a1){
        try{
           Connection  con = setConnection();
           Statement st = con.createStatement();
               String sql2 = "Select MID,MNAME,MPRICE from medicine ";
               ResultSet rst = st.executeQuery(sql2);
               a1.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selection Failed");
        }
        ResultSet rst = null;
        //conn.CloseConnection();
}
   public void t3(JTable t1){
        try{
           Connection  con = setConnection();
           Statement st = con.createStatement();
               String sql2 = "select * from top3doctor";
               ResultSet rst = st.executeQuery(sql2);
               t1.setModel(DbUtils.resultSetToTableModel(rst));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selection Failed");
        }
        ResultSet rst = null;
        //conn.CloseConnection();
}
}


