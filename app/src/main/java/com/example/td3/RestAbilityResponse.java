package com.example.td3;

import java.util.List;

public class RestAbilityResponse {

    private Integer count;
    private String next;
    private List<Ability> results;

    public Integer getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public List<Ability> getResults() {
        return results;
    }
}
