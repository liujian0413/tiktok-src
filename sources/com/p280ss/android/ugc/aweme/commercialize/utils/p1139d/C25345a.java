package com.p280ss.android.ugc.aweme.commercialize.utils.p1139d;

import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d.a */
public final class C25345a implements C25346b {

    /* renamed from: a */
    public static final C25345a f66736a = new C25345a();

    private C25345a() {
    }

    /* renamed from: a */
    public final long mo65903a() {
        if (C43316v.m137250H()) {
            C44933a a = C44933a.m141791a();
            C7573i.m23582a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            return a.mo107444d();
        }
        C43222g K = C43316v.m137450K();
        C7573i.m23582a((Object) K, "PlayerManager.inst()");
        return K.mo104915n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m83283a(com.p280ss.android.ugc.aweme.feed.model.Aweme r4, com.p280ss.android.ugc.playerkit.videoview.C44960f r5) {
        /*
            boolean r0 = com.p280ss.android.ugc.aweme.video.C43316v.m137250H()
            if (r0 == 0) goto L_0x000d
            if (r5 == 0) goto L_0x000d
            long r0 = r5.mo71674af()
            goto L_0x001a
        L_0x000d:
            com.ss.android.ugc.aweme.video.g r5 = com.p280ss.android.ugc.aweme.video.C43316v.m137450K()
            java.lang.String r0 = "PlayerManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            long r0 = r5.mo104910i()
        L_0x001a:
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0021
            return r0
        L_0x0021:
            if (r4 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.feed.model.Video r5 = r4.getVideo()
            if (r5 == 0) goto L_0x0032
            int r5 = r5.getDuration()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r5 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.model.Video r5 = r4.getVideo()
            java.lang.String r0 = "aweme.video"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            int r5 = r5.getDuration()
            if (r5 <= 0) goto L_0x0053
            com.ss.android.ugc.aweme.feed.model.Video r4 = r4.getVideo()
            java.lang.String r5 = "aweme.video"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            int r4 = r4.getDuration()
            long r4 = (long) r4
            return r4
        L_0x0053:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.p1139d.C25345a.m83283a(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.playerkit.videoview.f):long");
    }
}
