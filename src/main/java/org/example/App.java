package org.example;
/*3 таблица бар - Шаарлар, Олколор, Шаар башчылары

Ар бир таблицага жок дегенде 5тен маалымат киргизуу керек

Statement жана PreparedStatement-ти колдонуу

Шаарларды жана олколорду ArrayList-ке сактоо
Базадан шаарды id менен алып консолго чыгарышыбыз керек
 public   void printUsers() {

        String SQL = "SELECT * FROM student where id='7'";
        try (Connection conn = connection1();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {

                System.out.println(rs.getInt("id") + " "
                        + rs.getString("namestudent") + " "
                        + rs.getInt("age"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }*/
import org.example.dao.Вb;

public class App
{
    public static void main( String[] args )
    {
    Вb db=new Вb();
       db.printUsers1();
    }
}
