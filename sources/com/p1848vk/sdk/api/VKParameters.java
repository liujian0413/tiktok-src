package com.p1848vk.sdk.api;

import com.p1848vk.sdk.p1849a.C47109c;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.vk.sdk.api.VKParameters */
public class VKParameters extends LinkedHashMap<String, Object> implements Serializable {
    private static final long serialVersionUID = -7183150344504033644L;

    public VKParameters() {
    }

    public VKParameters(Map<String, Object> map) {
        super(map);
    }

    public static VKParameters from(Object... objArr) {
        return C47109c.m147303a(objArr);
    }
}
