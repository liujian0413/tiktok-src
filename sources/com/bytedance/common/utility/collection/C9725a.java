package com.bytedance.common.utility.collection;

import java.util.List;

/* renamed from: com.bytedance.common.utility.collection.a */
public final class C9725a {
    /* renamed from: a */
    public static long[] m28660a(List<Long> list) {
        if (list == null) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }
}
