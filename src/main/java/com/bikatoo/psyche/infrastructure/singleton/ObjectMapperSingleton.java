package com.bikatoo.psyche.infrastructure.singleton;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperSingleton {

    private static class ObjectMapperHolder {
        private final static ObjectMapper instance = new ObjectMapper();
    }

    public static ObjectMapper getInstance() {
        return ObjectMapperHolder.instance;
    }
}
