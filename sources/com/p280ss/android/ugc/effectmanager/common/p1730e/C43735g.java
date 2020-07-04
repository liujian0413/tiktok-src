package com.p280ss.android.ugc.effectmanager.common.p1730e;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.effectmanager.common.e.g */
public final class C43735g {
    /* renamed from: a */
    public static <T> String m138608a(List<T> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (list == null || list.isEmpty()) {
            sb.append("]");
            return sb.toString();
        }
        for (Object next : list) {
            sb.append("\"");
            sb.append(next.toString());
            sb.append("\"");
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m138609a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (map.size() > 0) {
            sb.append("?");
            int i = 0;
            for (Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    if (i == 0) {
                        sb.append(str2);
                        sb.append("=");
                        sb.append(str3);
                    } else {
                        sb.append("&");
                        sb.append(str2);
                        sb.append("=");
                        sb.append(str3);
                    }
                }
                i++;
            }
        }
        return new String(sb);
    }
}
