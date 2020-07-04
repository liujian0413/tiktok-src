package com.p280ss.android.ugc.aweme.commercialize.utils.p1137c;

import android.content.Context;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.adapter.C28141am;
import com.p280ss.android.ugc.aweme.feed.event.C28311ag;
import com.p280ss.android.ugc.aweme.feed.event.C28312ah;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.d */
public final class C25340d {

    /* renamed from: a */
    public static final C25340d f66731a = new C25340d();

    private C25340d() {
    }

    /* renamed from: a */
    private static final void m83269a(Uri uri) {
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("scene_id", "1048").mo59973a("enter_from", "advertisement").mo59973a("to_user_id", uri.getLastPathSegment()).f60753a);
    }

    /* renamed from: a */
    public static final void m83268a(Context context) {
        C7573i.m23587b(context, "context");
        C28141am.m92411a(new C28311ag("homepage_hot", context instanceof MainActivity), new C28312ah(context.hashCode()), "homepage_hot");
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl scrollToProfileGuideState = inst.getScrollToProfileGuideState();
        C7573i.m23582a((Object) scrollToProfileGuideState, "SharePrefCache.inst().scrollToProfileGuideState");
        Integer num = (Integer) scrollToProfileGuideState.mo59877d();
        if (num != null && num.intValue() == 0) {
            SharePrefCache inst2 = SharePrefCache.inst();
            C7573i.m23582a((Object) inst2, "SharePrefCache.inst()");
            C22903bl scrollToProfileGuideState2 = inst2.getScrollToProfileGuideState();
            C7573i.m23582a((Object) scrollToProfileGuideState2, "SharePrefCache.inst().scrollToProfileGuideState");
            scrollToProfileGuideState2.mo59871a(Integer.valueOf(1));
        }
    }

    /* renamed from: a */
    public static final void m83270a(String str) {
        boolean z;
        C7573i.m23587b(str, "url");
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "uri");
        String host = parse.getHost();
        String path = parse.getPath();
        CharSequence charSequence = host;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -309425751) {
                if (hashCode == 3599307 && host.equals("user") && path != null && C7634n.m23721b(path, "/profile", false)) {
                    m83269a(parse);
                }
            } else if (host.equals("profile")) {
                m83269a(parse);
            }
        }
    }
}
