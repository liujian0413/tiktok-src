package com.p280ss.android.ugc.aweme.util.crony;

/* renamed from: com.ss.android.ugc.aweme.util.crony.b */
public final class C42873b implements C42874c {
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo104582a(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1245625446: goto L_0x0066;
                case 0: goto L_0x005c;
                case 100: goto L_0x0052;
                case 103: goto L_0x0047;
                case 117: goto L_0x003d;
                case 118: goto L_0x0033;
                case 3599307: goto L_0x0029;
                case 94746189: goto L_0x001e;
                case 688591589: goto L_0x0014;
                case 1109191185: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0070
        L_0x000a:
            java.lang.String r0 = "deviceId"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 3
            goto L_0x0071
        L_0x0014:
            java.lang.String r0 = "versionCode"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 5
            goto L_0x0071
        L_0x001e:
            java.lang.String r0 = "clear"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 9
            goto L_0x0071
        L_0x0029:
            java.lang.String r0 = "user"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0033:
            java.lang.String r0 = "v"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 6
            goto L_0x0071
        L_0x003d:
            java.lang.String r0 = "u"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 2
            goto L_0x0071
        L_0x0047:
            java.lang.String r0 = "g"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 8
            goto L_0x0071
        L_0x0052:
            java.lang.String r0 = "d"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 4
            goto L_0x0071
        L_0x005c:
            java.lang.String r0 = ""
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 0
            goto L_0x0071
        L_0x0066:
            java.lang.String r0 = "gitsha"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 7
            goto L_0x0071
        L_0x0070:
            r3 = -1
        L_0x0071:
            switch(r3) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00aa;
                case 8: goto L_0x00aa;
                case 9: goto L_0x0077;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.String r3 = "don't support key"
            return r3
        L_0x0077:
            android.content.Context r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            java.lang.String r0 = "MainTabPreferences"
            android.content.SharedPreferences r3 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r3, r0, r1)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r3.clear()
            r3.apply()
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bl r3 = r3.getFollowGuideShown()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.mo59871a(r0)
            android.content.Context r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            java.lang.String r0 = "清除成功，建议冷起"
            com.bytedance.ies.dmt.ui.c.a r3 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31387a(r3, r0)
            r3.mo25750a()
            java.lang.String r3 = "OK"
            return r3
        L_0x00aa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "GitSHA: "
            r3.<init>(r0)
            java.lang.String r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19937m()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L_0x00bd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "UpdateVersionCode:"
            r3.<init>(r0)
            long r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19932h()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L_0x00d0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "DeviceId:"
            r3.<init>(r0)
            java.lang.String r0 = com.p280ss.android.common.applog.TeaAgent.getServerDeviceId()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L_0x00e3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "userID:"
            r3.<init>(r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r0 = r0.getCurUserId()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L_0x00fa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "UserId: "
            r3.<init>(r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r0 = r0.getCurUserId()
            r3.append(r0)
            java.lang.String r0 = "\nDeviceId: "
            r3.append(r0)
            java.lang.String r0 = com.p280ss.android.common.applog.TeaAgent.getServerDeviceId()
            r3.append(r0)
            java.lang.String r0 = "\nUpdateVerionCode: "
            r3.append(r0)
            long r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19932h()
            r3.append(r0)
            java.lang.String r0 = "\nGitSHA: "
            r3.append(r0)
            java.lang.String r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19937m()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.util.crony.C42873b.mo104582a(java.lang.String):java.lang.String");
    }
}
