package com.p280ss.android.ugc.aweme.comment.p1099f;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33233af;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.f.b */
public final class C24131b {

    /* renamed from: a */
    public static final C24131b f63783a = new C24131b();

    private C24131b() {
    }

    /* renamed from: a */
    private static C22984d m79279a(String str, String str2) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("enter_from", str).mo59973a("group_id", str2);
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str2);
        if (awemeById != null) {
            a.mo59973a("author_id", awemeById.getAuthorUid());
        }
        C7573i.m23582a((Object) a, "builder");
        return a;
    }

    /* renamed from: b */
    public static final void m79285b(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C6907h.m21524a("show_comment_emoji", (Map) m79280a(str, str2, str3, str4, str5, Integer.valueOf(i), logPbBean).f60753a);
    }

    /* renamed from: a */
    private static C22984d m79280a(String str, String str2, String str3, String str4, String str5, Integer num, LogPbBean logPbBean) {
        C22984d a = C22984d.m75611a().mo59973a("emoji_type", str);
        CharSequence charSequence = str;
        if (TextUtils.equals(charSequence, "recommend")) {
            a.mo59973a("group_id", str2).mo59973a("author_id", str3).mo59973a("emoji_uri", str5).mo59972a("position", (Object) num).mo59972a("log_pb", (Object) logPbBean);
        } else if (TextUtils.equals(charSequence, "search")) {
            a.mo59973a("group_id", str2).mo59973a("author_id", str3).mo59973a("search_keyword", str4).mo59973a("emoji_uri", str5).mo59972a("position", (Object) num).mo59972a("log_pb", (Object) logPbBean);
        }
        C7573i.m23582a((Object) a, "builder");
        return a;
    }

    /* renamed from: a */
    public static final void m79284a(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C6907h.m21524a("click_comment_emoji", (Map) m79280a(str, str2, str3, str4, str5, Integer.valueOf(i), logPbBean).f60753a);
    }

    /* renamed from: a */
    public static final void m79283a(String str, String str2, String str3, int i, String str4, int i2, long j, String str5, String str6, String str7, String str8) {
        m79282a(str, str2, str3, i, str4, i2, j, str5, 0, str6, str7, str8);
    }

    /* renamed from: a */
    public static final void m79282a(String str, String str2, String str3, int i, String str4, int i2, long j, String str5, int i3, String str6, String str7, String str8) {
        String str9;
        String str10 = str4;
        int i4 = i3;
        C6907h.m21521a(C6399b.m19921a(), "comment_duration", str, str2, str3, C6869c.m21381a().mo16886a("duration", Long.valueOf(j)).mo16888b());
        String str11 = str3;
        int i5 = i;
        long j2 = j;
        C22984d a = m79279a(str, str2).mo59973a("parent_comment_id", str3).mo59970a("parent_position", i).mo59973a("relation_label_type", str7).mo59973a("label_type", str6).mo59971a("duration", j);
        if (!TextUtils.isEmpty(str10)) {
            int i6 = i2;
            a.mo59973a("secondary_comment_id", str4).mo59970a("secondary_position", i2);
        }
        if (i4 != 0) {
            a.mo59970a("is_long_item", i4);
        }
        if (C33230ac.m107222d(str)) {
            a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(str5));
            String str12 = "comment_user_id";
            if (TextUtils.isEmpty(str8)) {
                str9 = "";
            } else {
                str9 = str8;
            }
            a.mo59973a(str12, str9);
            C6907h.m21525a("comment_duration", C33230ac.m107211a(a.f60753a));
            return;
        }
        C6907h.m21524a("comment_duration", (Map) a.f60753a);
    }

    /* renamed from: a */
    public static final void m79281a(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        String str19;
        String str20;
        Aweme aweme2 = aweme;
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        String str24 = str6;
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, C38347c.f99553h);
        C7573i.m23587b(str2, "enterFrom");
        C7573i.m23587b(str3, "category");
        C7573i.m23587b(str6, "emojiTimes");
        if (!TextUtils.equals(str22, "trending_page") || str15 == null) {
            str19 = str22;
        } else {
            str19 = str15;
        }
        String str25 = str7;
        C33233af afVar = (C33233af) ((C33233af) new C33233af().mo85065c(str).mo85061a(str2).mo85063b(str19).mo85077q(str7).mo85071g(aweme).mo85066d(str3).mo85074k(str10).mo85073j(str9).mo85072i(str8).mo85283l(str11)).mo85284m(str12);
        if (str4 == null) {
            str20 = "";
        } else {
            str20 = str4;
        }
        C33233af f = afVar.mo85069f(str20);
        String str26 = str5;
        int i2 = i;
        f.mo85070g(str5).mo85062a(z).mo85067e(str6).mo85060a(i).mo85064b(z2).mo85075o(str13).mo85076p(str14).mo85078r(str16).mo85079s(str17).mo85080t(str18).mo85252e();
    }
}
