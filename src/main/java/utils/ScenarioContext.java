package utils;

import helpers.Context;
import pojo.ProductData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScenarioContext {

    private Map<String, Object> scenarioContext;

    public ScenarioContext() {
        scenarioContext = new HashMap<>();
    }

    public void setContext(Context key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public List<ProductData> getContext(Context key) {
        return (List<ProductData>) scenarioContext.get(key.toString());
    }
}
