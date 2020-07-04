package com.p280ss.android.ugc.aweme.mediachoose;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.g */
public final class C33175g {
    /* renamed from: a */
    public static void m107023a(boolean z, boolean z2) {
        String str;
        String str2;
        String str3 = "choose_upload_content";
        C22984d a = C22984d.m75611a();
        String str4 = "content_type";
        if (z2) {
            str = "video";
        } else {
            str = "photo";
        }
        C22984d a2 = a.mo59973a(str4, str);
        String str5 = "upload_type";
        if (z) {
            str2 = "mutiple_content";
        } else {
            str2 = "single_content";
        }
        C6907h.m21524a(str3, (Map) a2.mo59973a(str5, str2).f60753a);
    }

    /* renamed from: a */
    public static void m107022a(boolean z, int i, int i2) {
        String str;
        String str2 = "upload_content_next";
        C22984d a = C22984d.m75611a();
        String str3 = "content_type";
        if (z) {
            str = "video";
        } else {
            str = "photo";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a("video_cnt", i).mo59970a("pic_cnt", i2).f60753a);
    }
}
