package com.p280ss.android.ugc.aweme.newfollow.p1422e;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.newfollow.e.a */
public final class C34137a {
    /* renamed from: a */
    public static void m109960a(String str) {
        C6907h.m21524a("page_refresh", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("refresh_method", str).f60753a);
    }

    /* renamed from: a */
    public static String m109959a(Integer num) {
        int i;
        if (num == null) {
            i = 3;
        } else {
            i = num.intValue();
        }
        switch (Integer.valueOf(i).intValue()) {
            case 1:
                return "click_bottom_icon";
            case 2:
                return "click_top_icon";
            case 3:
                return "slide_down";
            case 7:
                return "launch";
            case 8:
                return "slide_right";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static String m109962b(Integer num) {
        int i;
        if (num == null) {
            i = 4;
        } else {
            i = num.intValue();
        }
        switch (Integer.valueOf(i).intValue()) {
            case 4:
                return "slide_up";
            case 5:
                return "prefetch";
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static void m109961a(String str, boolean z, boolean z2) {
        C6907h.m21524a("page_refresh_response", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("refresh_method", str).mo59970a("is_success", z ? 1 : 0).mo59970a("no_more_content", z2 ^ true ? 1 : 0).f60753a);
    }
}
