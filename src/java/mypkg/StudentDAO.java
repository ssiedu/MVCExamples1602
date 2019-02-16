package mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    private Connection con;
    private PreparedStatement ps;
    
    public StudentDAO(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdmgmt", "root", "root");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
            
    public void save(Student st){
        String sql="insert into student values(?,?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, st.getRollNo());
            ps.setString(2, st.getName());
            ps.setString(3, st.getAddress());
            ps.setString(4, st.getCourse());
            ps.setInt(5, st.getSem());
            ps.setString(6, st.getPassword());
            int n=ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public Student search(int rno){
        Student s=new Student();
        String sql="select * from student where roll=?";
        try{
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, rno);
        ResultSet rs=ps.executeQuery();
        rs.next();
        s.setRollNo(rs.getInt(1));
        s.setName(rs.getString(2));
        s.setAddress(rs.getString(3));
        s.setCourse(rs.getString(4));
        s.setSem(rs.getInt(5));
        s.setPassword(rs.getString(6));
        }catch(Exception e){
            e.printStackTrace();
        }
        return s;
    }
}
