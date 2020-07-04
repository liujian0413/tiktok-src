package com.p280ss.android.ugc.aweme.commercialize.link;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeNationalTask;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p280ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p280ss.android.ugc.aweme.feed.model.StarAtlasLink;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.g */
public final class C24778g {
    /* renamed from: a */
    public static boolean m81310a(Aweme aweme) {
        LinkData a = C25268bg.m83039a(aweme);
        if ((a == null || a.linkType != 0) && aweme.getStarAtlasInfo() == null && aweme.getAwemeNationalTask() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m81308a(Context context, Aweme aweme) {
        LinkData a = C25268bg.m83039a(aweme);
        if (a == null || a.linkType != 0) {
            AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
            if (starAtlasInfo != null) {
                StarAtlasLink starAtlasLink = starAtlasInfo.getStarAtlasLink();
                if (starAtlasLink != null) {
                    C25371n.m83438a(context, starAtlasLink, aweme, false);
                    return;
                }
            }
            AwemeNationalTask awemeNationalTask = aweme.getAwemeNationalTask();
            if (awemeNationalTask != null) {
                NationalTaskLink nationalTaskLink = awemeNationalTask.getNationalTaskLink();
                if (nationalTaskLink != null) {
                    C25371n.m83437a(context, nationalTaskLink, aweme, false);
                    return;
                }
            }
            if (a != null && a.linkType == 1) {
                C25371n.m83431a(context, a, aweme, true);
            }
            return;
        }
        C25371n.m83431a(context, a, aweme, true);
    }

    /* renamed from: a */
    public static void m81309a(String str, String str2, Aweme aweme, boolean z) {
        LinkData a = C25268bg.m83039a(aweme);
        String str3 = "";
        if (a != null && a.linkType == 0) {
            str3 = "enterprise_link";
            if (C25352e.m83224g(aweme) && z) {
                C24976t.m82168b("link_click", C6399b.m19921a(), a, aweme, true);
            }
        }
        AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
        if (!(starAtlasInfo == null || starAtlasInfo.getStarAtlasLink() == null)) {
            str3 = "starmap_link";
        }
        AwemeNationalTask awemeNationalTask = aweme.getAwemeNationalTask();
        if (!(awemeNationalTask == null || awemeNationalTask.getNationalTaskLink() == null)) {
            str3 = "task_link";
        }
        if (a != null && a.linkType == 1) {
            str3 = "ad_link";
        }
        C6907h.m21524a(str2, (Map) C22984d.m75611a().mo59973a("group_id", aweme.getAid()).mo59973a("enter_from", str).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("link_type", str3).f60753a);
    }
}
