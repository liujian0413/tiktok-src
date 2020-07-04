package com.p280ss.android.ugc.aweme.flowfeed.p1253g;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.g.a */
public final class C29364a {

    /* renamed from: a */
    public static final C29364a f77393a = new C29364a();

    private C29364a() {
    }

    /* renamed from: a */
    public static void m96455a(String str, User user) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(user, "user");
        C6907h.m21524a("click_more_menu", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("author_id", user.getUid()).f60753a);
    }

    /* renamed from: b */
    public static void m96456b(String str, Aweme aweme) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(aweme, "aweme");
        C6907h.m21524a("click_more_menu", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme.getAuthorUid()).f60753a);
    }

    /* renamed from: a */
    public static void m96454a(String str, Aweme aweme) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(aweme, "aweme");
        C6907h.m21524a("enter_song_category", (Map) C22984d.m75611a().mo59973a("enter_method", "click_category_list").mo59973a("category_name", C23481i.m77091b(R.string.cre)).mo59973a("enter_from", str).mo59973a("category_id", "860").mo59973a("category_type", "original").f60753a);
    }
}
