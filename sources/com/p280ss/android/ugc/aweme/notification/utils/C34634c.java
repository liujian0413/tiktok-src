package com.p280ss.android.ugc.aweme.notification.utils;

import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.c */
public final class C34634c {
    /* renamed from: a */
    public static final void m111890a(String str, String str2, int i, boolean z) {
        C7573i.m23587b(str, "accountType");
        C7573i.m23587b(str2, "position");
        Map hashMap = new HashMap();
        hashMap.put("account_type", str);
        hashMap.put("client_order", str2);
        if (i > 0) {
            if (z) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(i));
            } else {
                hashMap.put("notice_type", "yellow_dot");
            }
        }
        C6907h.m21524a("enter_official_message", hashMap);
    }
}
