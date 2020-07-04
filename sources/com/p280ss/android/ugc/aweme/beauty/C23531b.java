package com.p280ss.android.ugc.aweme.beauty;

import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.beauty.b */
public final class C23531b {

    /* renamed from: a */
    public static final C23531b f62105a = new C23531b();

    /* renamed from: b */
    private static List<BeautifyInfo> f62106b;

    /* renamed from: c */
    private static int f62107c;

    private C23531b() {
    }

    /* renamed from: a */
    public static final List<BeautifyInfo> m77285a() {
        return f62106b;
    }

    /* renamed from: b */
    public static final int m77286b() {
        return f62107c;
    }

    /* renamed from: d */
    public static final void m77288d() {
        f62106b = null;
        f62107c = 0;
    }

    /* renamed from: c */
    public static void m77287c() {
        ComposerBeautyBuriedInfo f = C35574k.m114859a().mo70099n().mo61331f();
        C6907h.m21524a("perf_record_video", (Map) C38511bc.m123103a().mo96483a("beautify_used", f.getBeautifyUsed()).mo96483a("is_composer", f.isComposer()).mo96485a("beautify_info", C35574k.m114859a().mo70085S().mo15979b((Object) f.getBeautifyInfo())).f100112a);
        if (f.getBeautifyUsed() == 1) {
            f62107c = 1;
        }
        if (f62106b == null) {
            f62106b = f.getBeautifyInfo();
        }
    }
}
