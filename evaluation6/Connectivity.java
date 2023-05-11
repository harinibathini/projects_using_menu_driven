package evaluation6;

import java.io.IOException;
import java.sql.SQLException;

public interface Connectivity {
    public void retrieve();
    public void update();
    public void delete();
    public boolean insert() throws SQLException, IOException;
    public void query1();
    public void query2();
    public void query3();

}
