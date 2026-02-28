package dbconect;

//import java.sql.Connection;
//import java.sql.Statement;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

//import db.DB;
//import db.DbException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import db.DbIntegrityException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class DBconect {

    public static void main(String[] args) {

        /*Connection conn = null;     //conexão com a bd;
        Statement st = null;        //consulta na bd;
        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false); //as alterações vão esperar confirmação
            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE departmentId = 1");
//          int x = 1;
            //          if (x < 2) {
            //            throw new SQLException("Fake error");
            //           }
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE departmentId = 2");

            conn.commit(); //confirmou as alterações

            System.out.println("rows1: " + rows1 + " rows2: " + rows2);
        } catch (SQLException e) {
            try {
                //e.printStackTrace();
                conn.rollback(); //voltar em caso de erro
                throw new DbException("Transação não concluída: " + e.getMessage());
            } catch (SQLException e1) {
                // e1.printStackTrace();
                throw new DbException("Error trying to rollback" + e1.getMessage());

            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }*/

 /* --------------- Deletar dados -------------
        Connection conn = null;     //conexão com a bd;
        PreparedStatement st = null;        //consulta na bd;
        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?"
            );

            st.setInt(1, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! rows = " + rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
         */
 /* ---------------- Actualizar dados ----------------------
        Connection conn = null;     //conexão com a bd;
        PreparedStatement st = null;        //consulta na bd;
        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE (DepartmentId = ?)"
            );

            st.setDouble(1, 200.00);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! rows = " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
         */
 /* --------------- Inserir dados --------------------
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;     //conexão com a bd;
        PreparedStatement st = null;        //consulta na bd;

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO SELLER "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );

            st.setString(1, "Líria Bá");
            st.setString(2, "lb@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("11/05/2004").getTime()));
            st.setInt(4, 400);
            st.setInt(5, 4);
            st = conn.prepareStatement(
                    "insert into department (Name) values ('D1'), ('D2')",
                    Statement.RETURN_GENERATED_KEYS
            );

            int rowsAffected = st.executeUpdate();

            st.getGeneratedKeys();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done id: " + id);
                }

            } else {
                System.out.println("No file change");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ParseException e) {
            e.printStackTrace();
        }  finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
         */
 /* -------------------- Consulta de dados ----------------------------
        Statement st = null;        //consulta na bd;
        ResultSet rs = null;        //resultado da consulta;

        try {
            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from department");

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
         */
    }

}
