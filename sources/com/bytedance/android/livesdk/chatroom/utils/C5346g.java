package com.bytedance.android.livesdk.chatroom.utils;

import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8447f;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p405b.C8438j;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.g */
public final class C5346g {
    /* renamed from: b */
    public static String m17051b() {
        return m17050a("enter_method");
    }

    /* renamed from: c */
    public static String m17052c() {
        return m17050a("action_type");
    }

    /* renamed from: d */
    public static String m17053d() {
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        if (a instanceof C8420k) {
            C8420k kVar = (C8420k) a;
            if (kVar.mo21568a().containsKey("video_id")) {
                return (String) kVar.mo21568a().get("video_id");
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m17049a() {
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        if (!(a instanceof C8420k)) {
            return "";
        }
        C8420k kVar = (C8420k) a;
        if (kVar.mo21568a().containsKey("enter_from")) {
            kVar.mo21568a().get("enter_from");
        }
        if (kVar.mo21568a().containsKey("source")) {
            kVar.mo21568a().get("source");
        }
        return (String) kVar.mo21568a().get("enter_from_merge");
    }

    /* renamed from: a */
    private static String m17050a(String str) {
        return C8447f.m25681a(str, C8443c.m25663a().mo21605a(C8438j.class));
    }
}
