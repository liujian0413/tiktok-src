package com.p280ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0598c;
import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.search.activity.SearchResultActivity.C37377a;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.search.f */
public final class C37383f {

    /* renamed from: a */
    public static final C37383f f97614a = new C37383f();

    /* renamed from: b */
    private static long f97615b;

    private C37383f() {
    }

    /* renamed from: a */
    private static boolean m119981a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - f97615b;
        f97615b = currentTimeMillis;
        if (j >= 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo94070a(Context context, SearchResultParam searchResultParam, SearchEnterParam searchEnterParam, String str, String str2, Bundle bundle) {
        C7573i.m23587b(searchResultParam, "param");
        if (m119981a() && context != null) {
            C37382e.f97612a.proxySearchIntermediatePageShowEventTrackerStart();
            if (searchEnterParam != null) {
                C37382e.f97612a.requestGuessSearchAdvanced(searchEnterParam.getGroupId());
                if (str != null) {
                    String str3 = "enter_search";
                    C22984d a = C22984d.m75611a().mo59973a("enter_from", str).mo59973a("group_id", searchEnterParam.getGroupId());
                    if (str2 != null) {
                        a.mo59973a("previous_page", str2);
                    }
                    C6907h.m21524a(str3, (Map) a.f60753a);
                }
            }
            if (context instanceof Activity) {
                if (bundle == null) {
                    bundle = C0598c.m2484a((Activity) context, new C0902i[0]).mo2580a();
                }
                C37377a.m119970a(context, searchResultParam, searchEnterParam, bundle);
                return;
            }
            C37377a.m119970a(context, searchResultParam, searchEnterParam, null);
        }
    }
}
