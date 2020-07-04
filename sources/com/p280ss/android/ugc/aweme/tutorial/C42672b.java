package com.p280ss.android.ugc.aweme.tutorial;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tutorial.b */
public final class C42672b {

    /* renamed from: a */
    public static final C42672b f110933a = new C42672b();

    /* renamed from: b */
    private static String f110934b;

    /* renamed from: c */
    private static String f110935c;

    /* renamed from: d */
    private static String f110936d;

    /* renamed from: e */
    private static final Set<String> f110937e = new LinkedHashSet();

    private C42672b() {
    }

    /* renamed from: a */
    public static void m135518a(ShortVideoContext shortVideoContext) {
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        f110934b = shortVideoContext.f99787w;
        f110935c = shortVideoContext.f99788x;
    }

    /* renamed from: a */
    public static void m135519a(String str) {
        C7573i.m23587b(str, "tabName");
        f110936d = str;
        C6907h.m21524a("enter_tutorial_tab", (Map) C22984d.m75611a().mo59973a("creation_id", f110934b).mo59973a("shoot_way", f110935c).mo59973a("enter_from", "video_tutorial_page").mo59973a("tab_name", str).f60753a);
    }

    /* renamed from: b */
    public static void m135520b(String str) {
        C7573i.m23587b(str, "tutorialId");
        if (f110937e.add(str)) {
            C6907h.m21524a("tutorial_show", (Map) C22984d.m75611a().mo59973a("creation_id", f110934b).mo59973a("shoot_way", f110935c).mo59973a("enter_from", "video_tutorial_page").mo59973a("tab_name", f110936d).mo59973a("group_id", str).f60753a);
        }
    }
}
