package com.facebook.react.bridge;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class JsonWriterHelper {
    JsonWriterHelper() {
    }

    private static void listValue(JsonWriter jsonWriter, List<?> list) throws IOException {
        jsonWriter.beginArray();
        for (Object objectValue : list) {
            objectValue(jsonWriter, objectValue);
        }
        jsonWriter.endArray();
    }

    public static void value(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj instanceof Map) {
            mapValue(jsonWriter, (Map) obj);
        } else if (obj instanceof List) {
            listValue(jsonWriter, (List) obj);
        } else {
            objectValue(jsonWriter, obj);
        }
    }

    private static void mapValue(JsonWriter jsonWriter, Map<?, ?> map) throws IOException {
        jsonWriter.beginObject();
        for (Entry entry : map.entrySet()) {
            jsonWriter.name(entry.getKey().toString());
            value(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }

    private static void objectValue(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else {
            StringBuilder sb = new StringBuilder("Unknown value: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
