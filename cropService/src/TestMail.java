
import java.sql.SQLException;
import javax.sql.RowSet;
import server.db.DBUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ambrish
 */
public class TestMail {
    public static void main(String[] args) throws SQLException {
        RowSet rs = DBUtils.fetchDetachedRowSet("select * from state_mas");
        while(rs.next()){
            System.out.println(rs.getString(1) + "   "+rs.getString(2));
        }
    }
}
