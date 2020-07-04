package com.p280ss.android.ugc.aweme.discover.base;

/* renamed from: com.ss.android.ugc.aweme.discover.base.g */
public interface C26602g {

    /* renamed from: com.ss.android.ugc.aweme.discover.base.g$a */
    public static final class C26603a {
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
            if (r0 == null) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p280ss.android.ugc.aweme.discover.model.SearchApiResult m87384a(com.p280ss.android.ugc.aweme.discover.base.C26602g r2, com.p280ss.android.ugc.aweme.discover.model.SearchApiResult r3) {
            /*
                java.lang.String r0 = "data"
                kotlin.jvm.internal.C7573i.m23587b(r3, r0)
                java.lang.String r0 = r3.getRequestId()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0020
                com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r3.logPb
                if (r0 == 0) goto L_0x001b
                java.lang.String r0 = r0.getImprId()
                if (r0 != 0) goto L_0x001d
            L_0x001b:
                java.lang.String r0 = ""
            L_0x001d:
                r3.setRequestId(r0)
            L_0x0020:
                int r2 = r2.aF_()
                java.lang.String r0 = r3.getRequestId()
                java.lang.String r1 = "data.requestId"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.p280ss.android.ugc.aweme.discover.mob.SearchContext.m87923a(r2, r0)
                com.ss.android.ugc.aweme.feed.ae r2 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
                java.lang.String r0 = r3.getRequestId()
                com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = r3.logPb
                r2.mo71792a(r0, r1)
                com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo r2 = r3.queryCorrectInfo
                if (r2 == 0) goto L_0x0048
                java.lang.String r0 = r3.getRequestId()
                r2.setRequestId(r0)
            L_0x0048:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.base.C26602g.C26603a.m87384a(com.ss.android.ugc.aweme.discover.base.g, com.ss.android.ugc.aweme.discover.model.SearchApiResult):com.ss.android.ugc.aweme.discover.model.SearchApiResult");
        }
    }

    int aF_();
}
