package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.a */
public final class C36580a {

    /* renamed from: a */
    public static final C36580a f95990a = new C36580a();

    private C36580a() {
    }

    /* renamed from: a */
    public static void m118027a() {
        C6907h.m21524a("show_profile_bio_hint", (Map) C22984d.m75611a().f60753a);
    }

    /* renamed from: b */
    public static void m118033b() {
        C6907h.m21524a("enter_profile_bio", (Map) C22984d.m75611a().mo59973a("enter_method", "click_hint").f60753a);
    }

    /* renamed from: b */
    private static String m118032b(User user) {
        if (C43122ff.m136787r(user)) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: a */
    public static void m118028a(User user) {
        if (user != null) {
            C6907h.m21524a("enter_activity_page", (Map) new C22984d().mo59973a("enter_from", m118032b(user)).f60753a);
        }
    }

    /* renamed from: a */
    public static void m118029a(String str) {
        if (C23764b.m77913a(str)) {
            C6907h.m21524a("enter_personal_homepage", (Map) C22984d.m75611a().mo59973a("tab_name", str).f60753a);
        }
    }

    /* renamed from: a */
    private static String m118026a(User user, String str) {
        if (C7573i.m23585a((Object) str, (Object) "weblink")) {
            return user.getBioUrl();
        }
        return user.getBioEmail();
    }

    /* renamed from: a */
    public static void m118030a(String str, User user) {
        C7573i.m23587b(str, "type");
        if (user != null) {
            C6907h.m21524a("click_link", (Map) C22984d.m75611a().mo59973a("enter_from", m118032b(user)).mo59973a("link_type", str).mo59973a("author_id", user.getUid()).mo59973a("link", m118026a(user, str)).f60753a);
        }
    }

    /* renamed from: a */
    public static void m118031a(String str, String str2, User user) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "type");
        if (user != null) {
            C6907h.m21524a("show_link", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("link_type", str2).mo59973a("link", m118026a(user, str2)).mo59973a("scene_id", "1008").mo59973a("author_id", user.getUid()).f60753a);
        }
    }
}
