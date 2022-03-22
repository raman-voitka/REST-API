package by.it_academy.homework8.rest_api.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EndpointPropertyUtils {
    private static Properties property = new Properties();
    private static final String endpoint = "src/main/resources/endpoints.properties";

    private static void getFile() {
        try (FileInputStream file = new FileInputStream(EndpointPropertyUtils.endpoint)) {
            property.load(file);
        } catch (IOException e) {
            System.out.println("file '.properties' not found");
        }
    }

    public static String getSushiveslaProducts() {
        getFile();
        return property.getProperty("endpoint.sushivesla.products");
    }

    public static String getSushiVeslaProductsByFilter() {
        getFile();
        return property.getProperty("endpoint.sushivesla.filter");
    }
}
