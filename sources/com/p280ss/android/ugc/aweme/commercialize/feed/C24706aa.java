package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct.F2ProjectInfo;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.aa */
public final class C24706aa {
    /* renamed from: a */
    private static void m81049a() {
        C6907h.m21524a("show_million_pound", (Map) C22984d.m75611a().mo59973a("enter_from", "click_homepage_hot").mo59970a("is_million_pound", 1).f60753a);
    }

    /* renamed from: a */
    public static boolean m81052a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        F2ProjectInfo f2ProjectInfo = aweme.getUploadMiscInfoStruct().f2ProjectInfo;
        if (f2ProjectInfo == null || f2ProjectInfo.iconUrl == null || f2ProjectInfo.iconUrl.getUrlList() == null || f2ProjectInfo.iconUrl.getUrlList().size() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m81051a(boolean z, RemoteImageView remoteImageView, Aweme aweme) {
        if (remoteImageView != null && m81052a(aweme)) {
            F2ProjectInfo f2ProjectInfo = aweme.getUploadMiscInfoStruct().f2ProjectInfo;
            remoteImageView.setVisibility(0);
            if (z) {
                m81049a();
            }
            C6903bc.m21470K().mo57880a(remoteImageView, f2ProjectInfo.iconUrl);
            String str = f2ProjectInfo.schemaUrl;
            if (TextUtils.isEmpty(str)) {
                C6921a.m21552a(6, "FeedF2Utils", "F2  schemaUrl is empty");
            } else {
                remoteImageView.setOnClickListener(new C24707ab(remoteImageView, str));
            }
        }
    }
}
