package com.p280ss.android.ugc.aweme.commercialize.log;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p280ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.s */
public final class C24975s {
    /* renamed from: a */
    public static void m81992a(NationalTaskLink nationalTaskLink, Aweme aweme, String str, boolean z, String str2) {
        String str3;
        String str4;
        if (aweme != null && nationalTaskLink != null) {
            String str5 = "link_userside";
            C22984d a = C22984d.m75611a().mo59973a("link_id", nationalTaskLink.getId()).mo59973a("degree_style_difference", "normaltitle");
            String str6 = "is_enterprise";
            if (C43122ff.m136783n(aweme.getAuthor())) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C22984d a2 = a.mo59973a(str6, str3).mo59973a("action_type", str);
            String str7 = "page_type";
            if (z) {
                str4 = "video_comment";
            } else {
                str4 = "video_play";
            }
            C22984d a3 = a2.mo59973a(str7, str4).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("group_id", aweme.getAid());
            String str8 = "enter_from";
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C6907h.m21524a(str5, (Map) a3.mo59973a(str8, str2).mo59973a("scene_id", "1002").mo59973a("link_type", "task_link").f60753a);
        }
    }

    /* renamed from: a */
    public static void m81991a(LinkData linkData, Aweme aweme, String str, boolean z, String str2) {
        String str3;
        String str4;
        if (aweme != null && linkData != null) {
            String str5 = "normaltitle";
            if (!z) {
                int i = linkData.feedShowType;
                if (i != 4) {
                    switch (i) {
                        case 1:
                            str5 = "weaktitle";
                            break;
                        case 2:
                            str5 = "strongtitle";
                            break;
                    }
                } else {
                    str5 = "specialtitle";
                }
            }
            String str6 = "link_userside";
            C22984d a = C22984d.m75611a().mo59973a("degree_style_difference", str5);
            String str7 = "is_enterprise";
            if (C43122ff.m136783n(aweme.getAuthor())) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C22984d a2 = a.mo59973a(str7, str3).mo59973a("action_type", str);
            String str8 = "page_type";
            if (z) {
                str4 = "video_comment";
            } else {
                str4 = "video_play";
            }
            C22984d a3 = a2.mo59973a(str8, str4).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("group_id", aweme.getAid());
            String str9 = "enter_from";
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C6907h.m21524a(str6, (Map) a3.mo59973a(str9, str2).mo59973a("scene_id", "1002").mo59973a("link_type", "ad_link").f60753a);
        }
    }

    /* renamed from: a */
    public static void m81993a(StarAtlasLink starAtlasLink, Aweme aweme, String str, boolean z, String str2) {
        String str3;
        String str4;
        if (aweme != null && starAtlasLink != null) {
            String str5 = "link_userside";
            C22984d a = C22984d.m75611a().mo59973a("link_id", starAtlasLink.getId()).mo59973a("degree_style_difference", "normaltitle");
            String str6 = "is_enterprise";
            if (C43122ff.m136783n(aweme.getAuthor())) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C22984d a2 = a.mo59973a(str6, str3).mo59973a("action_type", str);
            String str7 = "page_type";
            if (z) {
                str4 = "video_comment";
            } else {
                str4 = "video_play";
            }
            C22984d a3 = a2.mo59973a(str7, str4).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("group_id", aweme.getAid());
            String str8 = "enter_from";
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C6907h.m21524a(str5, (Map) a3.mo59973a(str8, str2).mo59973a("scene_id", "1002").mo59973a("link_type", "starmap_link").f60753a);
        }
    }
}
