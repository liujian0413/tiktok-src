package com.p280ss.android.ugc.aweme.profile.util;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.util.w */
public final class C36766w {

    /* renamed from: a */
    public static final C36766w f96492a = new C36766w();

    private C36766w() {
    }

    /* renamed from: a */
    public static void m118503a() {
        C6907h.m21524a("copy_link", (Map) C22984d.m75611a().mo59973a("enter_from", "edit_profile_page").mo59973a("link_type", "personal_link").f60753a);
    }

    /* renamed from: a */
    public static void m118505a(String str, String str2) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(str2, "enterMethod");
        C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("enter_method", str2).f60753a);
    }

    /* renamed from: a */
    public static void m118504a(int i, String str, String str2) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "clickMethod");
        C6907h.m21524a("modify_username_confirm", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59970a("status", i).mo59973a("click_method", str2).f60753a);
    }

    /* renamed from: b */
    public static void m118506b(int i, String str, String str2) {
        C7573i.m23587b(str, "enterFrom");
        C6907h.m21524a("save_username", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59970a("status", i).mo59973a("error_code", str2).f60753a);
    }

    /* renamed from: a */
    public final void mo93097a(int i, int i2, String str) {
        String str2;
        switch (i2) {
            case 1:
                str2 = "personal_homepage";
                break;
            case 2:
                str2 = "modify_username_notify";
                break;
            default:
                str2 = "edit_profile_page";
                break;
        }
        m118506b(i, str2, str);
    }
}
