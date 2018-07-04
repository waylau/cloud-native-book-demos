/**
 * 
 */
package com.waylau.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application Tests.
 * 
 * @since 1.0.0 2018年7月4日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class ApplicationTests {
	
	private static Logger log = LoggerFactory.getLogger(ApplicationTests.class);

	@Test
	public void testJdbcBatch() throws SQLException {
        String sourceURL = "jdbc:h2:mem:testdb";// H2 内嵌模式
        String user = "sa";  
        String key = "";  
        Connection con = null;
        PreparedStatement stmt = null; 
        Statement st = null; 
        
		try {  

            try {
				Class.forName("org.h2.Driver");
			} catch (ClassNotFoundException e) {
	        	log.error("org.h2.Driver Not Found:", e);
			}// H2 Driver  
            con = DriverManager.getConnection(sourceURL, user, key);  

            // 关闭自动提交
            con.setAutoCommit(false);
            st = con.createStatement();
            st.execute("CREATE TABLE t_user(id INT,name VARCHAR(100))");
            
            stmt = con.prepareStatement(
            		"INSERT INTO t_user VALUES (?, ?)");
    		stmt.setInt(1, 2000);
    		stmt.setString(2, "Kelly Kaufmann");
    		stmt.addBatch();
    		
    		stmt.setInt(1, 3000);
    		stmt.setString(2, "Bill Barnes");
    		stmt.addBatch();
    		
    		// 批量提交执行
    		int[] updateCounts = stmt.executeBatch();
    		
    		log.info("执行结果:{}", updateCounts);
  
        } catch (SQLException sqle) {  
        	log.error("SQL Exception:", sqle);
        } finally {
        	if (st != null) {
                st.close();  
        	}
        	if (stmt != null) {
                stmt.close();  
        	}
        	if (con != null) {
        		con.close();  
        	}
        }
	}
}
