package awesomecucumber.customtype;

import awesomecucumber.domainobjects.BillingDetails;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTableType {

    @DataTableType
    public BillingDetails billingDetailsEntry(Map<String, String> entry){
        System.out.println("Data Table Type");
            return new BillingDetails(entry.get("firstname"),entry.get("lastname"),entry.get("address_line1"),
                    entry.get("city"),entry.get("state"),entry.get("zip"),entry.get("email"));
    }
}
