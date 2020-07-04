package com.snapchat.kit.sdk.core.models;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class AnalyticsPayload implements Serializable {
    private final List<Map<String, Object>> mEvents;

    public AnalyticsPayload(List<Map<String, Object>> list) {
        this.mEvents = list;
    }
}
