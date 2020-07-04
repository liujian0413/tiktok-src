package com.p280ss.android.ugc.aweme.feed.api;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.api.p1024c.C22823d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.feed.experiment.UsePbForRecommendFeedExperiment;
import com.p280ss.android.ugc.aweme.feed.helper.C28426n;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.ugc.aweme.proto.aweme_v2_feed_response;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.feed.api.b */
public final class C28214b {

    /* renamed from: a */
    private static final String f74329a;

    /* renamed from: b */
    static String m92753b() {
        if (C28426n.m93433b()) {
            return C28426n.m93434c();
        }
        return null;
    }

    static {
        StringBuilder sb = new StringBuilder("pb_convert_flag");
        sb.append(C6399b.m19939o());
        f74329a = sb.toString();
    }

    /* renamed from: a */
    static boolean m92752a() {
        boolean z = false;
        boolean z2 = C7285c.m22838a(C29960a.m98230a(), "pb_convert_flag", 0).getBoolean(f74329a, false);
        if (!z2) {
            z = C6384b.m19835a().mo15292a(UsePbForRecommendFeedExperiment.class, true, "use_pb_for_recommend_feed", C6384b.m19835a().mo15295d().use_pb_for_recommend_feed, true);
        }
        C6903bc.m21507z();
        StringBuilder sb = new StringBuilder("getRecommendFeedItemList,usbPb:");
        sb.append(z);
        sb.append(",errorOnce:");
        sb.append(z2);
        C6921a.m21552a(4, "FeedApi", sb.toString());
        return z;
    }

    /* renamed from: a */
    public static FeedItemList m92750a(C22823d<aweme_v2_feed_response, FeedItemList> dVar, C28226n nVar) throws Exception {
        return (FeedItemList) dVar.mo59836a((C7327h<P, J>) new C28215c<P,J>(nVar));
    }

    /* renamed from: a */
    static final /* synthetic */ FeedItemList m92751a(C28226n nVar, aweme_v2_feed_response aweme_v2_feed_response) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            FeedItemList a = C28225m.m92770a(aweme_v2_feed_response, null);
            if (nVar.f74347g.intValue() == 8) {
                a.pbData = aweme_v2_feed_response;
            }
            C28216d.f74331a = SystemClock.elapsedRealtime() - elapsedRealtime;
            return a;
        } catch (Throwable th) {
            C6877n.m21407a("service_monitor", "log_bean_copy_convert_error", C6869c.m21381a().mo16887a("errMsg", Log.getStackTraceString(th)).mo16888b());
            if (!C7163a.m22363a()) {
                BeanCopyException beanCopyException = new BeanCopyException(th);
                C6921a.m21559a((Throwable) beanCopyException);
                C2077a.m9160a((Throwable) beanCopyException);
                C6903bc.m21471L().mo57870a((Throwable) beanCopyException);
                C7285c.m22838a(C29960a.m98230a(), "pb_convert_flag", 0).edit().clear().putBoolean(f74329a, true).commit();
                return FeedApi.m92740a(nVar);
            }
            Context a2 = C6399b.m19921a();
            StringBuilder sb = new StringBuilder("feedApi pb convert error:\n");
            sb.append(th);
            C10761a.m31403c(a2, sb.toString()).mo25750a();
            throw th;
        }
    }
}
