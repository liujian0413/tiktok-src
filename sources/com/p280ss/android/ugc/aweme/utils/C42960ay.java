package com.p280ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ttplatformsdk.p910a.C20424a;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.utils.ay */
public final class C42960ay {
    /* renamed from: a */
    public static void m136379a() {
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
        String b = C20424a.m67762a(C6399b.m19921a()).mo54971b("enjoy_today_date", "");
        if (TextUtils.isEmpty(b) || !b.equals(format)) {
            C20424a.m67762a(C6399b.m19921a()).mo54968a("enjoy_today_date", format);
        }
    }
}
