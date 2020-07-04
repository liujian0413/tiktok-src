package com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.a */
public final class C40938a {

    /* renamed from: a */
    public static final C40938a f106448a = new C40938a();

    private C40938a() {
    }

    /* renamed from: b */
    public static final void m130779b() {
        m130781c().storeBoolean("should_display_sticker_tab_guide", false);
    }

    /* renamed from: a */
    public static final boolean m130778a() {
        return m130781c().getBoolean("should_display_sticker_tab_guide", true);
    }

    /* renamed from: c */
    private static Keva m130781c() {
        Keva repoFromSp = Keva.getRepoFromSp(C6399b.m19921a(), "ChristmasGuidePreferences", 0);
        C7573i.m23582a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final void m130777a(String str) {
        C7573i.m23587b(str, "key");
        m130781c().storeInt(str, 0);
    }

    /* renamed from: b */
    public static final boolean m130780b(String str) {
        C7573i.m23587b(str, "key");
        if (-1 == m130781c().getInt(str, -1)) {
            return true;
        }
        return false;
    }
}
