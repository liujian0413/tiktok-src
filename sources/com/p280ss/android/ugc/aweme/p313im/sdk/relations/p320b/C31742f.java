package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.f */
public final class C31742f {
    /* renamed from: a */
    public static String m103082a(List<String> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append("\"");
            sb.append(str);
            sb.append("\",");
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(sb2.substring(0, sb2.lastIndexOf(",")));
        sb3.append("]");
        return sb3.toString();
    }
}
