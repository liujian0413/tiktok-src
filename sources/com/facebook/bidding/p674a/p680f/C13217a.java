package com.facebook.bidding.p674a.p680f;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.bidding.p674a.p675a.C13205a;
import com.facebook.bidding.p674a.p681h.p682a.C13221a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.bidding.a.f.a */
public final class C13217a {

    /* renamed from: a */
    private static final Set<String> f35027a = new HashSet(1);

    /* renamed from: b */
    private static final Set<String> f35028b = new HashSet(2);

    static {
        f35027a.add("1ww8E0AYsR2oX5lndk2hwp2Uosk=\n");
        f35028b.add("toZ2GRnRjC9P5VVUdCpOrFH8lfQ=\n");
        f35028b.add("3lKvjNsfmrn+WmfDhvr2iVh/yRs=\n");
        f35028b.add("B08QtE4yLCdli4rptyqAEczXOeA=\n");
        f35028b.add("XZXI6anZbdKf+taURdnyUH5ipgM=\n");
    }

    /* renamed from: a */
    public static C13221a m38625a(Context context) {
        C13221a aVar = new C13221a();
        m38626a(context, aVar);
        if (!m38627a()) {
            aVar.f35039d = f35028b;
            aVar.f35040e = f35027a;
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m38626a(Context context, C13221a aVar) {
        C13205a aVar2 = new C13205a(context);
        if (m38627a()) {
            aVar.f35036a = 360000;
            aVar.f35037b = 120000;
        } else {
            aVar.f35036a = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        }
        if (!C13205a.m38595a(context)) {
            aVar.mo32411a("X-FB-Pool-Routing-Token", BidderTokenProvider.getBidderToken(context));
        }
        aVar.mo32411a("user-agent", C13219c.m38631a(aVar2, context));
    }

    /* renamed from: a */
    private static boolean m38627a() {
        String urlPrefix = AdSettings.getUrlPrefix();
        return !TextUtils.isEmpty(urlPrefix) && urlPrefix.endsWith(".sb");
    }
}
