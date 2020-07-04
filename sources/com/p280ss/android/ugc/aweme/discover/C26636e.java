package com.p280ss.android.ugc.aweme.discover;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.search.C37385g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.e */
public final class C26636e implements C26613d {
    /* renamed from: a */
    public final Map<String, String> mo68311a(Aweme aweme) {
        C22984d a = C22984d.m75611a();
        if (aweme != null && !TextUtils.isEmpty(aweme.getRequestId())) {
            a.mo59973a("search_id", aweme.getRequestId());
        }
        Map<String, String> map = a.f60753a;
        C7573i.m23582a((Object) map, "builder.builder()");
        return map;
    }

    /* renamed from: a */
    public final Map<String, String> mo68310a(Context context, Aweme aweme) {
        Activity a = C23487o.m77130a(context);
        if (!(a instanceof FragmentActivity)) {
            a = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) a;
        if (fragmentActivity == null || !C37385g.f97617a.isSearchResultActivity(fragmentActivity)) {
            return new LinkedHashMap<>();
        }
        C22984d a2 = C22984d.m75611a();
        if (aweme != null && !TextUtils.isEmpty(aweme.getRequestId())) {
            a2.mo59973a("search_id", aweme.getRequestId());
        }
        Map<String, String> map = a2.f60753a;
        C7573i.m23582a((Object) map, "builder.builder()");
        return map;
    }
}
