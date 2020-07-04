package com.p280ss.android.ugc.aweme.app.p1029d;

/* renamed from: com.ss.android.ugc.aweme.app.d.b */
public final class C22915b {

    /* renamed from: a */
    static final /* synthetic */ boolean f60647a = (!C22915b.class.desiredAssertionStatus());

    private C22915b() {
        throw new IllegalStateException("No Instance.");
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m75418a(java.lang.String r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = -1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = f60647a
            if (r0 != 0) goto L_0x0015
            if (r10 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L_0x0015:
            int r0 = r10.hashCode()
            r2 = 10
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 1
            r8 = 21
            r9 = 0
            switch(r0) {
                case -2116477818: goto L_0x0113;
                case -1842036323: goto L_0x0109;
                case -1731750228: goto L_0x00fe;
                case -1465594195: goto L_0x00f3;
                case -1271119582: goto L_0x00e9;
                case -1059192357: goto L_0x00de;
                case -562830579: goto L_0x00d4;
                case -182649969: goto L_0x00c9;
                case -121207376: goto L_0x00be;
                case 3135424: goto L_0x00b3;
                case 384784128: goto L_0x00a8;
                case 452151140: goto L_0x009c;
                case 809483594: goto L_0x0091;
                case 954925063: goto L_0x0085;
                case 998835423: goto L_0x0079;
                case 1402633315: goto L_0x006e;
                case 1425879700: goto L_0x0062;
                case 1506116178: goto L_0x0057;
                case 1605556258: goto L_0x004b;
                case 1691937916: goto L_0x0040;
                case 1800278845: goto L_0x0034;
                case 1879474642: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x011e
        L_0x0028:
            java.lang.String r0 = "playlist"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 14
            goto L_0x011f
        L_0x0034:
            java.lang.String r0 = "hot_search_video_board"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 17
            goto L_0x011f
        L_0x0040:
            java.lang.String r0 = "homepage_hot"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 0
            goto L_0x011f
        L_0x004b:
            java.lang.String r0 = "other_following"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 20
            goto L_0x011f
        L_0x0057:
            java.lang.String r0 = "challenge_fresh"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 7
            goto L_0x011f
        L_0x0062:
            java.lang.String r0 = "search_result"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 15
            goto L_0x011f
        L_0x006e:
            java.lang.String r0 = "challenge"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 6
            goto L_0x011f
        L_0x0079:
            java.lang.String r0 = "general_search"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 16
            goto L_0x011f
        L_0x0085:
            java.lang.String r0 = "message"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 21
            goto L_0x011f
        L_0x0091:
            java.lang.String r0 = "others_homepage"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 5
            goto L_0x011f
        L_0x009c:
            java.lang.String r0 = "poi_page"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 10
            goto L_0x011f
        L_0x00a8:
            java.lang.String r0 = "homepage_fresh_feed"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 2
            goto L_0x011f
        L_0x00b3:
            java.lang.String r0 = "fans"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 19
            goto L_0x011f
        L_0x00be:
            java.lang.String r0 = "discovery"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 11
            goto L_0x011f
        L_0x00c9:
            java.lang.String r0 = "other_fans"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 18
            goto L_0x011f
        L_0x00d4:
            java.lang.String r0 = "personal_homepage"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 4
            goto L_0x011f
        L_0x00de:
            java.lang.String r0 = "single_song_fresh"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 9
            goto L_0x011f
        L_0x00e9:
            java.lang.String r0 = "homepage_follow"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 3
            goto L_0x011f
        L_0x00f3:
            java.lang.String r0 = "discovery_category"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 13
            goto L_0x011f
        L_0x00fe:
            java.lang.String r0 = "single_song"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 8
            goto L_0x011f
        L_0x0109:
            java.lang.String r0 = "homepage_fresh"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 1
            goto L_0x011f
        L_0x0113:
            java.lang.String r0 = "discovery_tab"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x011e
            r10 = 12
            goto L_0x011f
        L_0x011e:
            r10 = -1
        L_0x011f:
            switch(r10) {
                case 0: goto L_0x0139;
                case 1: goto L_0x0138;
                case 2: goto L_0x0138;
                case 3: goto L_0x0137;
                case 4: goto L_0x0136;
                case 5: goto L_0x0136;
                case 6: goto L_0x0135;
                case 7: goto L_0x0135;
                case 8: goto L_0x0134;
                case 9: goto L_0x0134;
                case 10: goto L_0x0131;
                case 11: goto L_0x0130;
                case 12: goto L_0x0130;
                case 13: goto L_0x0130;
                case 14: goto L_0x0130;
                case 15: goto L_0x012d;
                case 16: goto L_0x012d;
                case 17: goto L_0x012a;
                case 18: goto L_0x0127;
                case 19: goto L_0x0127;
                case 20: goto L_0x0126;
                case 21: goto L_0x0123;
                default: goto L_0x0122;
            }
        L_0x0122:
            return r1
        L_0x0123:
            r10 = 27
            return r10
        L_0x0126:
            return r2
        L_0x0127:
            r10 = 26
            return r10
        L_0x012a:
            r10 = 24
            return r10
        L_0x012d:
            r10 = 23
            return r10
        L_0x0130:
            return r3
        L_0x0131:
            r10 = 22
            return r10
        L_0x0134:
            return r4
        L_0x0135:
            return r5
        L_0x0136:
            return r6
        L_0x0137:
            return r7
        L_0x0138:
            return r8
        L_0x0139:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.p1029d.C22915b.m75418a(java.lang.String):int");
    }
}
