package com.p1848vk.sdk.p1849a;

import android.text.TextUtils;
import com.C1642a;
import com.p1848vk.sdk.api.model.VKAttachments;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.vk.sdk.a.b */
public final class C47108b {
    /* renamed from: a */
    public static String m147301a(Map<String, ?> map) {
        return m147302a(map, false);
    }

    /* renamed from: a */
    public static String m147300a(Collection<?> collection, String str) {
        return TextUtils.join(str, collection);
    }

    /* renamed from: a */
    private static String m147302a(Map<String, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof VKAttachments) {
                value = ((VKAttachments) value).mo118610a();
            }
            arrayList.add(C1642a.m8034a("%s=%s", new Object[]{entry.getKey(), String.valueOf(value)}));
        }
        return m147300a((Collection<?>) arrayList, "&");
    }
}
