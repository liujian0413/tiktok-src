package android.support.p022v4.app;

/* renamed from: android.support.v4.app.s */
final class C0640s {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m2766a(android.support.p022v4.app.C0612l r6, android.support.p022v4.app.Fragment r7, int r8, int r9, int r10, boolean r11) {
        /*
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.mo2676a(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x000a }
            return
        L_0x000a:
            r6 = move-exception
            boolean r8 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            if (r8 != 0) goto L_0x00b5
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x001e
            java.lang.Class r10 = r7.getClass()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r10 = r10.getName()     // Catch:{ Exception -> 0x0096 }
            goto L_0x0020
        L_0x001e:
            java.lang.String r10 = ""
        L_0x0020:
            android.app.Activity r11 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()     // Catch:{ Exception -> 0x0096 }
            if (r11 == 0) goto L_0x002f
            java.lang.Class r11 = r11.getClass()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r11 = r11.getName()     // Catch:{ Exception -> 0x0096 }
            goto L_0x0031
        L_0x002f:
            java.lang.String r11 = ""
        L_0x0031:
            com.ss.android.ugc.aweme.app.g.c r0 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "fragmentname"
            com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16887a(r1, r10)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "newState"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0096 }
            com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16885a(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "transit"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0096 }
            com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16885a(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "transitionStyle"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0096 }
            com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16885a(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "keepActive"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0096 }
            com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16882a(r1, r2)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r1 = "currentActivity"
            com.ss.android.ugc.aweme.app.g.c r11 = r0.mo16887a(r1, r11)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = "errorMsg"
            java.lang.String r1 = android.util.Log.getStackTraceString(r6)     // Catch:{ Exception -> 0x0096 }
            com.ss.android.ugc.aweme.app.g.c r11 = r11.mo16887a(r0, r1)     // Catch:{ Exception -> 0x0096 }
            org.json.JSONObject r11 = r11.mo16888b()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = "fragment_crash_log"
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.app.g.c r2 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = "errorDesc"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0096 }
            com.ss.android.ugc.aweme.app.g.c r11 = r2.mo16887a(r3, r11)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = "fragment_name"
            com.ss.android.ugc.aweme.app.g.c r10 = r11.mo16887a(r2, r10)     // Catch:{ Exception -> 0x0096 }
            org.json.JSONObject r10 = r10.mo16888b()     // Catch:{ Exception -> 0x0096 }
            com.p280ss.android.ugc.aweme.app.C6877n.m21407a(r0, r1, r10)     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            r10 = 3
            java.lang.Class[] r11 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage> r0 = com.p280ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage.class
            r11[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2> r0 = com.p280ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2.class
            r11[r8] = r0
            r8 = 2
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment> r0 = com.p280ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment.class
            r11[r8] = r0
        L_0x00a6:
            if (r9 >= r10) goto L_0x00b4
            r8 = r11[r9]
            boolean r8 = r8.isInstance(r7)
            if (r8 == 0) goto L_0x00b1
            return
        L_0x00b1:
            int r9 = r9 + 1
            goto L_0x00a6
        L_0x00b4:
            throw r6
        L_0x00b5:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.app.C0640s.m2766a(android.support.v4.app.l, android.support.v4.app.Fragment, int, int, int, boolean):void");
    }
}
