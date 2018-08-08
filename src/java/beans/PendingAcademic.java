package beans;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PendingAcademic {
    String error;
    List<Object> allData=new ArrayList<Object>();
    public String TripName,Destination,DepartureDate,ReturnDate,Duration,PassengerNumber,Department;
    Object obj=new Object();

    public void setObj(Object obj) {
        this.obj = obj;
    }
    public String getError() {
        return error;
    }
     public class DataFields
    {
        public String TripName,Destination,DepartureDate,ReturnDate,Duration,PassengerNumber,Department;

        public DataFields(String TripName,String Destination,String DepartureDate,String ReturnDate,String Duration,String PassengerNumber,String Department)
        {
            this.TripName=TripName;
            this.Destination=Destination;
            this.DepartureDate=DepartureDate;
            this.ReturnDate=ReturnDate;
            this.Duration=Duration;
            this.PassengerNumber=PassengerNumber;
            this.Department= Department;
        }
    }
     public List getDb_Data()
    {
        int i=0;
        try
        {
                String qry;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transportmanagement","root","");
                Statement s = con.createStatement();                
                qry="Select TripName,Destination,DepartureDate,ReturnDate,Duration,PassengerNumber,Department from pendingacademictrips";
                ResultSet r=s.executeQuery(qry);
                while(r.next())
                {
                    DataFields d=new DataFields(r.getString(1), r.getString(2), r.getString(3),r.getString(4), r.getString(5),r.getString(6),r.getString(7));                    
                    allData.add(i,d);
                    i++;
                }
                
        }
        catch(Exception ex)
        {
                error="<b>Contact Administrator :</b><br/>" + ex;
                System.out.println("Your query is not working" + ex);
        }
       return allData;
    }

    public String getTripName() {
        this.TripName=((DataFields)obj).TripName;
        return this.TripName;
    }

    public String getDestination() {
        this.Destination=((DataFields)obj).Destination;
        return this.Destination;
    }

    public String getDepartureDate() {
        this.DepartureDate=((DataFields)obj).DepartureDate;
        return this.DepartureDate;
    }

    public String getReturnDate() {
        this.ReturnDate=((DataFields)obj).ReturnDate;
        return this.ReturnDate;
    }

    public String getDuration() {
        this.Duration=((DataFields)obj).Duration;
        return this.Duration;
    }

    public String getPassengerNumber() {
       this.PassengerNumber=((DataFields)obj).PassengerNumber;
        return this.PassengerNumber;
    }

    public String getDepartment() {
        this.Department=((DataFields)obj).Department;
        return this.Department;
    }
     
}
