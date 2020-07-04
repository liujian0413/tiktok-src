package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.b */
public final class C25193b {

    /* renamed from: a */
    public static final C25193b f66485a = new C25193b();

    private C25193b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a m82872a(com.p280ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = new com.ss.android.ugc.aweme.commercialize.utils.a.a$a
            r0.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65765a(r7)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            r2 = 0
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.getOpenUrl()
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65772c(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            if (r1 == 0) goto L_0x002a
            java.lang.String r1 = r1.getWebUrl()
            goto L_0x002b
        L_0x002a:
            r1 = r2
        L_0x002b:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65775e(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r1.getWebTitle()
            goto L_0x003b
        L_0x003a:
            r1 = r2
        L_0x003b:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65776f(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = r1.getDownloadUrl()
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65780j(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = r1.getPackageName()
            goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65781k(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            if (r1 == 0) goto L_0x006a
            java.lang.String r1 = r1.getAppName()
            goto L_0x006b
        L_0x006a:
            r1 = r2
        L_0x006b:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65782l(r1)
            boolean r1 = r7.isAppAd()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65773c(r1)
            r1 = 5
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65763a(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            r3 = 0
            if (r1 == 0) goto L_0x008f
            java.lang.Long r1 = r1.getCreativeId()
            if (r1 == 0) goto L_0x008f
            long r5 = r1.longValue()
            goto L_0x0090
        L_0x008f:
            r5 = r3
        L_0x0090:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65764a(r5)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            if (r1 == 0) goto L_0x009e
            java.lang.String r2 = r1.getLogExtra()
        L_0x009e:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65770b(r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r7.getAwemeRawAd()
            if (r7 == 0) goto L_0x00b2
            java.lang.Long r7 = r7.getGroupId()
            if (r7 == 0) goto L_0x00b2
            long r3 = r7.longValue()
        L_0x00b2:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r7 = r0.mo65769b(r3)
            java.lang.String r0 = "result_ad"
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r7 = r7.mo65778h(r0)
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r0 = 0
            goto L_0x00cb
        L_0x00ca:
            r0 = 1
        L_0x00cb:
            if (r0 != 0) goto L_0x00d0
            r7.mo65779i(r8)
        L_0x00d0:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r7 = r7.f66436a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25193b.m82872a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):com.ss.android.ugc.aweme.commercialize.utils.a.a");
    }
}
