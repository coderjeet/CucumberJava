package awesomecucumber.customtype;

import awesomecucumber.domainobjects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterType {

    @ParameterType(".*")
    public Product product(String name){
        Product product = new Product(name.replace("\"",""));
        return product;
    }
}

