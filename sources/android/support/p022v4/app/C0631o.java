package android.support.p022v4.app;

/* renamed from: android.support.v4.app.o */
final class C0631o {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m2717a(android.support.p022v4.app.C0612l r4, android.support.p022v4.app.Fragment r5, int r6, int r7, int r8, boolean r9) {
        /*
            r4.mo2676a(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0004 }
            return
        L_0x0004:
            r4 = move-exception
            boolean r0 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            if (r0 != 0) goto L_0x00af
            if (r5 == 0) goto L_0x0016
            java.lang.Class r0 = r5.getClass()     // Catch:{ Exception -> 0x008e }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x008e }
            goto L_0x0018
        L_0x0016:
            java.lang.String r0 = ""
        L_0x0018:
            android.app.Activity r1 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()     // Catch:{ Exception -> 0x008e }
            if (r1 == 0) goto L_0x0027
            java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x008e }
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x008e }
            goto L_0x0029
        L_0x0027:
            java.lang.String r1 = ""
        L_0x0029:
            com.ss.android.ugc.aweme.app.g.c r2 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()     // Catch:{ Exception -> 0x008e }
            java.lang.String r3 = "fragmentname"
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r0)     // Catch:{ Exception -> 0x008e }
            java.lang.String r3 = "newState"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x008e }
            com.ss.android.ugc.aweme.app.g.c r6 = r2.mo16885a(r3, r6)     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = "transit"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x008e }
            com.ss.android.ugc.aweme.app.g.c r6 = r6.mo16885a(r2, r7)     // Catch:{ Exception -> 0x008e }
            java.lang.String r7 = "transitionStyle"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x008e }
            com.ss.android.ugc.aweme.app.g.c r6 = r6.mo16885a(r7, r8)     // Catch:{ Exception -> 0x008e }
            java.lang.String r7 = "keepActive"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x008e }
            com.ss.android.ugc.aweme.app.g.c r6 = r6.mo16882a(r7, r8)     // Catch:{ Exception -> 0x008e }
            java.lang.String r7 = "currentActivity"
            com.ss.android.ugc.aweme.app.g.c r6 = r6.mo16887a(r7, r1)     // Catch:{ Exception -> 0x008e }
            java.lang.String r7 = "errorMsg"
            java.lang.String r8 = android.util.Log.getStackTraceString(r4)     // Catch:{ Exception -> 0x008e }
            com.ss.android.ugc.aweme.app.g.c r6 = r6.mo16887a(r7, r8)     // Catch:{ Exception -> 0x008e }
            org.json.JSONObject r6 = r6.mo16888b()     // Catch:{ Exception -> 0x008e }
            java.lang.String r7 = "fragment_crash_log"
            java.lang.String r8 = ""
            com.ss.android.ugc.aweme.app.g.c r9 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()     // Catch:{ Exception -> 0x008e }
            java.lang.String r1 = "errorDesc"
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x008e }
            com.ss.android.ugc.aweme.app.g.c r6 = r9.mo16887a(r1, r6)     // Catch:{ Exception -> 0x008e }
            java.lang.String r9 = "fragment_name"
            com.ss.android.ugc.aweme.app.g.c r6 = r6.mo16887a(r9, r0)     // Catch:{ Exception -> 0x008e }
            org.json.JSONObject r6 = r6.mo16888b()     // Catch:{ Exception -> 0x008e }
            com.p280ss.android.ugc.aweme.app.C6877n.m21407a(r7, r8, r6)     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage> r8 = com.p280ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage.class
            r9 = 0
            r7[r9] = r8
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2> r8 = com.p280ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2.class
            r0 = 1
            r7[r0] = r8
            r8 = 2
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment> r0 = com.p280ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment.class
            r7[r8] = r0
        L_0x00a0:
            if (r9 >= r6) goto L_0x00ae
            r8 = r7[r9]
            boolean r8 = r8.isInstance(r5)
            if (r8 == 0) goto L_0x00ab
            return
        L_0x00ab:
            int r9 = r9 + 1
            goto L_0x00a0
        L_0x00ae:
            throw r4
        L_0x00af:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.app.C0631o.m2717a(android.support.v4.app.l, android.support.v4.app.Fragment, int, int, int, boolean):void");
    }
}
