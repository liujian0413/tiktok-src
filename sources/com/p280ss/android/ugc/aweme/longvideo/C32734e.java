package com.p280ss.android.ugc.aweme.longvideo;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.longvideonew.LongVideoActivity;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.e */
public final class C32734e {

    /* renamed from: a */
    public static final C32734e f85316a = new C32734e();

    /* renamed from: b */
    private static Aweme f85317b;

    private C32734e() {
    }

    /* renamed from: a */
    public static Aweme m105951a() {
        return f85317b;
    }

    /* renamed from: a */
    public static void m105953a(Aweme aweme) {
        f85317b = aweme;
    }

    /* renamed from: a */
    public static final void m105952a(Context context, Aweme aweme, String str, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        LongVideoActivity.f85428a.mo84272a(context, aweme, str, i, 0, "");
    }
}
