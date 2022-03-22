package by.it_academy.homework8;

import by.it_academy.homework8.rest_api.utils.EndpointPropertyUtils;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class OnlinerSushiVeslaFilterTest extends BaseTest {
    @Test
    public void test_Each_Of_SushiVesla_Products_Has_Preset_Filter() {
        sushiVeslaProducts = sushiVeslaService
                .getSushiVeslaProducts(EndpointPropertyUtils.getSushiVeslaProductsByFilter());
        assertThat(sushiVeslaProducts)
                .as("At Least One Of SushiVesla Products Doesn't Have Filter \"Роллы\"")
                .allMatch(product -> product.getName_prefix().equals("Роллы"));
    }
}