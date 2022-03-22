package by.it_academy.homework8.rest_api.utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;

import java.util.List;

public final class ResponseBodyUtils {

    private ResponseBodyUtils() {
    }

    public static <T> List<T> getObjectsByJsonPath(ResponseBody responseBody, String jsonPath,
                                                   Class<T> genericType) {
        return responseBody
                .jsonPath()
                .getList(jsonPath, genericType);
    }

    public static <T> T getObjectByJsonPath(ResponseBody responseBody, String jsonPath,
                                            Class<T> genericType) {
        return responseBody
                .jsonPath()
                .getObject(jsonPath, genericType);
    }

    public static String getStringJsonValue(ResponseBody responseBody, String jsonPath) {
        return JsonPath.from(responseBody.asString()).getString(jsonPath);
    }
}