package com.p280ss.android.ugc.aweme.commercialize.p1118b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25244aq;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22384i;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.report.C37196b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.f */
public final class C24557f implements C22384i {
    /* renamed from: a */
    public final void mo58873a(Context context, User user) {
        UserProfileActivity.m117387a(context, user);
    }

    /* renamed from: b */
    private static void m80608b(Context context, String str) {
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo58874a(Context context, String str) {
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
        if (context instanceof Activity) {
            C37196b.m119559a((Activity) context, C25244aq.m82989b(awemeById, "landing_page", "ad"));
        }
    }

    /* renamed from: a */
    public final void mo58872a(Context context, LinkData linkData, Aweme aweme) {
        C25371n.m83431a(context, linkData, aweme, true);
    }

    /* renamed from: a */
    public final void mo58875a(Context context, String str, String str2) {
        if (!C25371n.m83463a(context, str, false)) {
            m80608b(context, str2);
        }
    }
}
