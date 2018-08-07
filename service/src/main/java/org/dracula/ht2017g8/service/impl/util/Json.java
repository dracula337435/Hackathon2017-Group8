package org.dracula.ht2017g8.service.impl.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author dk
 */
public abstract class Json {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String getJsonString(Object obj){
        String string = null;
        try {
            string = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return string;
    }

    public static <K, V> Map<K, V> readJsonAsMap(String json, Class<K> key, Class<?> value){
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        MapLikeType mapLikeType = typeFactory.constructMapLikeType(LinkedHashMap.class, key, value);
        Map<K, V> map = null;
        try {
            map = objectMapper.readValue(json, mapLikeType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static <T> T readJson(String json, Class<T> type){
        T t = null;
        try {
            objectMapper.readValue(json, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }

}
