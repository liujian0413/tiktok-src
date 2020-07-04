package com.p280ss.android.ugc.trill.start;

import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.IFeedLogger;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.trill.start.FeedLogger */
public class FeedLogger implements IFeedLogger {
    public void setFeedRequestEvent(String str, String str2, int i) {
        if (!C6399b.m19946v()) {
            return;
        }
        if ("homepage_hot".equals(str2) || "homepage_follow".equals(str2)) {
            C1592h.m7855a((Callable<TResult>) new C45165b<TResult>(str2, str, i), (Executor) C6907h.m21516a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFeedResponseEvent(int r10, java.lang.String r11, java.lang.String r12, com.p280ss.android.ugc.aweme.feed.p1233i.C28447b r13, android.support.p022v4.app.Fragment r14, long r15) {
        /*
            r9 = this;
            r1 = r12
            r0 = r13
            r2 = r14
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            if (r3 == 0) goto L_0x0072
            java.lang.String r3 = "homepage_hot"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x0019
            java.lang.String r3 = "homepage_follow"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x0072
        L_0x0019:
            java.lang.String r3 = "homepage_hot"
            boolean r3 = r3.equals(r12)
            r4 = 0
            if (r3 == 0) goto L_0x002e
            boolean r3 = r2 instanceof com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment
            if (r3 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r2 = (com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment) r2
            int r2 = r2.mo73852q()
        L_0x002c:
            r3 = r2
            goto L_0x0042
        L_0x002e:
            java.lang.String r3 = "homepage_follow"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x0041
            boolean r3 = r2 instanceof com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFollowFragment
            if (r3 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment r2 = (com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFollowFragment) r2
            int r2 = r2.mo73822q()
            goto L_0x002c
        L_0x0041:
            r3 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = r0.f74999b
            if (r0 == 0) goto L_0x005c
            java.util.List r2 = r0.getItems()
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 != 0) goto L_0x005c
            java.util.List r0 = r0.getItems()
            int r0 = r0.size()
            r5 = r0
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r15
            com.ss.android.ugc.trill.start.a r8 = new com.ss.android.ugc.trill.start.a
            r0 = r8
            r1 = r12
            r2 = r11
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.concurrent.ExecutorService r0 = com.p280ss.android.ugc.aweme.common.C6907h.m21516a()
            bolts.C1592h.m7855a(r8, r0)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.trill.start.FeedLogger.setFeedResponseEvent(int, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.i.b, android.support.v4.app.Fragment, long):void");
    }
}
