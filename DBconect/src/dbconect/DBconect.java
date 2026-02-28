package dbconect;

import java.sql.Connection;

import db.DB;

public class DBconect {

    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
       
    }

}
