package by.it_academy.homework8;

import by.it_academy.homework8.rest_api.utils.EndpointPropertyUtils;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class OnlinerSushiVeslaProductTest extends BaseTest {
    @Test
    public void test_Each_Of_SushiVesla_Products_Has_Name() {
        sushiVeslaProducts = sushiVeslaService.getSushiVeslaProducts(EndpointPropertyUtils.getSushiveslaProducts());
        assertThat(sushiVeslaProducts)
                .as("At Least One Of SushiVesla Products Does Not Have Name")
                .noneMatch(product -> product.getName() == null);
    }
}