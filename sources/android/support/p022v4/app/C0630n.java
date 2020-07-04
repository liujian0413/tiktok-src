package android.support.p022v4.app;

/* renamed from: android.support.v4.app.n */
final class C0630n {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m2716a(android.support.p022v4.app.C0612l r6, android.support.p022v4.app.Fragment r7, int r8, int r9, int r10, boolean r11) {
        /*
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r0.mo2676a(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x000a }
            return
        L_0x000a:
            r6 = move-exception
            boolean r9 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            if (r9 != 0) goto L_0x00b5
            r9 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.Class r10 = r7.getClass()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r10 = r10.getName()     // Catch:{ Exception -> 0x0095 }
            goto L_0x001f
        L_0x001d:
            java.lang.String r10 = ""
        L_0x001f:
            android.app.Activity r11 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()     // Catch:{ Exception -> 0x0095 }
            if (r11 == 0) goto L_0x002e
            java.lang.Class r11 = r11.getClass()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r11 = r11.getName()     // Catch:{ Exception -> 0x0095 }
            goto L_0x0030
        L_0x002e:
            java.lang.String r11 = ""
        L_0x0030:
            com.ss.android.ugc.aweme.app.g.c r0 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r1 = "fragmentname"
            com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16887a(r1, r10)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r1 = "newState"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0095 }
            com.ss.android.ugc.aweme.app.g.c r8 = r0.mo16885a(r1, r8)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "transit"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0095 }
            com.ss.android.ugc.aweme.app.g.c r8 = r8.mo16885a(r0, r1)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "transitionStyle"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0095 }
            com.ss.android.ugc.aweme.app.g.c r8 = r8.mo16885a(r0, r1)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "keepActive"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0095 }
            com.ss.android.ugc.aweme.app.g.c r8 = r8.mo16882a(r0, r1)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "currentActivity"
            com.ss.android.ugc.aweme.app.g.c r8 = r8.mo16887a(r0, r11)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r11 = "errorMsg"
            java.lang.String r0 = android.util.Log.getStackTraceString(r6)     // Catch:{ Exception -> 0x0095 }
            com.ss.android.ugc.aweme.app.g.c r8 = r8.mo16887a(r11, r0)     // Catch:{ Exception -> 0x0095 }
            org.json.JSONObject r8 = r8.mo16888b()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r11 = "fragment_crash_log"
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.app.g.c r1 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r2 = "errorDesc"
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0095 }
            com.ss.android.ugc.aweme.app.g.c r8 = r1.mo16887a(r2, r8)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r1 = "fragment_name"
            com.ss.android.ugc.aweme.app.g.c r8 = r8.mo16887a(r1, r10)     // Catch:{ Exception -> 0x0095 }
            org.json.JSONObject r8 = r8.mo16888b()     // Catch:{ Exception -> 0x0095 }
            com.p280ss.android.ugc.aweme.app.C6877n.m21407a(r11, r0, r8)     // Catch:{ Exception -> 0x0095 }
        L_0x0095:
            r8 = 3
            java.lang.Class[] r10 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage> r11 = com.p280ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage.class
            r10[r9] = r11
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2> r11 = com.p280ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2.class
            r0 = 1
            r10[r0] = r11
            r11 = 2
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment> r0 = com.p280ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment.class
            r10[r11] = r0
        L_0x00a6:
            if (r9 >= r8) goto L_0x00b4
            r11 = r10[r9]
            boolean r11 = r11.isInstance(r7)
            if (r11 == 0) goto L_0x00b1
            return
        L_0x00b1:
            int r9 = r9 + 1
            goto L_0x00a6
        L_0x00b4:
            throw r6
        L_0x00b5:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.app.C0630n.m2716a(android.support.v4.app.l, android.support.v4.app.Fragment, int, int, int, boolean):void");
    }
}
