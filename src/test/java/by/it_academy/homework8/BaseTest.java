package by.it_academy.homework8;

import by.it_academy.homework8.rest_api.model.SushiVeslaProduct;
import by.it_academy.homework8.rest_api.service.SushiVeslaService;

import java.util.List;

public class BaseTest {
    SushiVeslaService sushiVeslaService = new SushiVeslaService();
    List<SushiVeslaProduct> sushiVeslaProducts;
}
