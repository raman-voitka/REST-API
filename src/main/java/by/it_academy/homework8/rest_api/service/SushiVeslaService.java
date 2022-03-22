package by.it_academy.homework8.rest_api.service;

import by.it_academy.homework8.rest_api.model.SushiVeslaProduct;
import by.it_academy.homework8.rest_api.utils.GetRequestUtils;
import by.it_academy.homework8.rest_api.utils.ResponseBodyUtils;
import io.restassured.response.ResponseBody;

import java.util.List;

public class SushiVeslaService {
    public List<SushiVeslaProduct> getSushiVeslaProducts(String endpoint) {
        ResponseBody responseBody = GetRequestUtils.makeRequestAndGetResponseBody(endpoint, null, null);
        return ResponseBodyUtils.getObjectsByJsonPath(responseBody, "products",
                SushiVeslaProduct.class);
    }
}