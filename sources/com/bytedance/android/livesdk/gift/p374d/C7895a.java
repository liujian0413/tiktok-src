package com.bytedance.android.livesdk.gift.p374d;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.gift.d.a */
public final class C7895a {
    /* renamed from: a */
    public static String m24190a(HashMap<Long, Integer> hashMap) {
        Iterator it = hashMap.entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        while (true) {
            Entry entry = (Entry) it.next();
            Long l = (Long) entry.getKey();
            Integer num = (Integer) entry.getValue();
            sb.append('\"');
            sb.append(l);
            sb.append('\"');
            sb.append(':');
            sb.append(num);
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
        }
    }
}
