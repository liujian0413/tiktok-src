package com.bytedance.p263im.core.internal.p590db;

import java.util.List;

/* renamed from: com.bytedance.im.core.internal.db.s */
public final class C11377s {
    /* renamed from: a */
    public static String m33466a(List list, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i));
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
