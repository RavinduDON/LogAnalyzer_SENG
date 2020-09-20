package lk.uok.se.DBManagement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class DBFactoryTest {

    @Test
    public void ShouldReturn_DBPerformAction() {
        DBRepository dbRepository= DBFactory.getDbFactory().getDBrepository(DBFactory.DBFactoryTypes.email);
        assertThat(dbRepository,instanceOf(DBPerformAction.class));
    }
}