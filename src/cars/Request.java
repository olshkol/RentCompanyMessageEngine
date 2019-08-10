package cars;

import java.io.Serializable;
import java.util.ArrayList;

public class Request implements Serializable{
    private String query;
    private Package aPackage;

    public Request(String query, Package aPackage) {
        this.query = query;
        this.aPackage = aPackage;
    }

    public Request(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public Package getPackage() {
        return aPackage;
    }

    public void setPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
