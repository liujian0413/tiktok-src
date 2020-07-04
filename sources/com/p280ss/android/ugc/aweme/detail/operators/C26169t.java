package com.p280ss.android.ugc.aweme.detail.operators;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.t */
public final class C26169t implements C26137an {
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.detail.operators.C26134am mo67700a(java.lang.String r2, com.p280ss.android.ugc.aweme.feed.param.FeedParam r3, com.p280ss.android.ugc.aweme.common.p1144e.C25673a r4, com.bytedance.jedi.arch.JediViewModel r5) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -2129304094: goto L_0x010d;
                case -2021687896: goto L_0x0103;
                case -2010463721: goto L_0x00f8;
                case -1962327703: goto L_0x00ed;
                case -1409016138: goto L_0x00e2;
                case -1188973400: goto L_0x00d7;
                case -722719414: goto L_0x00cc;
                case -523021459: goto L_0x00c1;
                case -352746994: goto L_0x00b7;
                case 169715633: goto L_0x00ac;
                case 197801949: goto L_0x00a0;
                case 361903334: goto L_0x0095;
                case 462133794: goto L_0x0089;
                case 544190632: goto L_0x007d;
                case 707647226: goto L_0x0071;
                case 725581641: goto L_0x0065;
                case 762374289: goto L_0x0059;
                case 939020805: goto L_0x004e;
                case 1251285931: goto L_0x0042;
                case 1372379467: goto L_0x0036;
                case 1459477949: goto L_0x002a;
                case 1987897379: goto L_0x001f;
                case 2065353855: goto L_0x0014;
                case 2090054260: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0117
        L_0x0009:
            java.lang.String r0 = "potential_friends"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 7
            goto L_0x0118
        L_0x0014:
            java.lang.String r0 = "from_discovery_challenge"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 3
            goto L_0x0118
        L_0x001f:
            java.lang.String r0 = "poi_new_page"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 4
            goto L_0x0118
        L_0x002a:
            java.lang.String r0 = "from_tutorial_detail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 23
            goto L_0x0118
        L_0x0036:
            java.lang.String r0 = "from_search_commodity"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 22
            goto L_0x0118
        L_0x0042:
            java.lang.String r0 = "mp_page"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 15
            goto L_0x0118
        L_0x004e:
            java.lang.String r0 = "from_feeds_operate"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 6
            goto L_0x0118
        L_0x0059:
            java.lang.String r0 = "from_search_similar_aweme"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 12
            goto L_0x0118
        L_0x0065:
            java.lang.String r0 = "from_mix_detail"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 20
            goto L_0x0118
        L_0x0071:
            java.lang.String r0 = "from_search_mix"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 10
            goto L_0x0118
        L_0x007d:
            java.lang.String r0 = "from_detail_activity"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 18
            goto L_0x0118
        L_0x0089:
            java.lang.String r0 = "from_search_jedi"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 11
            goto L_0x0118
        L_0x0095:
            java.lang.String r0 = "from_anchor_video"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 5
            goto L_0x0118
        L_0x00a0:
            java.lang.String r0 = "from_search"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 8
            goto L_0x0118
        L_0x00ac:
            java.lang.String r0 = "from_hot_search_positive_aweme"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 14
            goto L_0x0118
        L_0x00b7:
            java.lang.String r0 = "from_challenge"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 2
            goto L_0x0118
        L_0x00c1:
            java.lang.String r0 = "from_feeds_operate_optimized"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 21
            goto L_0x0118
        L_0x00cc:
            java.lang.String r0 = "from_visual_search_result"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 19
            goto L_0x0118
        L_0x00d7:
            java.lang.String r0 = "from_user_state_tab"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 16
            goto L_0x0118
        L_0x00e2:
            java.lang.String r0 = "from_rn_search"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 9
            goto L_0x0118
        L_0x00ed:
            java.lang.String r0 = "history_list"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 17
            goto L_0x0118
        L_0x00f8:
            java.lang.String r0 = "from_hot_search_aweme"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 13
            goto L_0x0118
        L_0x0103:
            java.lang.String r0 = "from_sticker"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 1
            goto L_0x0118
        L_0x010d:
            java.lang.String r0 = "from_discovery_v4"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 0
            goto L_0x0118
        L_0x0117:
            r0 = -1
        L_0x0118:
            switch(r0) {
                case 0: goto L_0x01a6;
                case 1: goto L_0x01a0;
                case 2: goto L_0x019a;
                case 3: goto L_0x019a;
                case 4: goto L_0x0194;
                case 5: goto L_0x018b;
                case 6: goto L_0x0185;
                case 7: goto L_0x017f;
                case 8: goto L_0x0179;
                case 9: goto L_0x0173;
                case 10: goto L_0x016d;
                case 11: goto L_0x0165;
                case 12: goto L_0x015f;
                case 13: goto L_0x0159;
                case 14: goto L_0x0159;
                case 15: goto L_0x0153;
                case 16: goto L_0x014d;
                case 17: goto L_0x0147;
                case 18: goto L_0x0141;
                case 19: goto L_0x0132;
                case 20: goto L_0x0139;
                case 21: goto L_0x012c;
                case 22: goto L_0x0126;
                case 23: goto L_0x0120;
                default: goto L_0x011b;
            }
        L_0x011b:
            com.ss.android.ugc.aweme.detail.operators.am r2 = com.p280ss.android.ugc.aweme.detail.operators.C26133al.m85890a(r3, r4, r5)
            return r2
        L_0x0120:
            com.ss.android.ugc.aweme.detail.operators.f r2 = new com.ss.android.ugc.aweme.detail.operators.f
            r2.<init>(r4)
            return r2
        L_0x0126:
            com.ss.android.ugc.aweme.discover.a.a r2 = new com.ss.android.ugc.aweme.discover.a.a
            r2.<init>(r4)
            return r2
        L_0x012c:
            com.ss.android.ugc.aweme.fe.method.feeds.a.b r2 = new com.ss.android.ugc.aweme.fe.method.feeds.a.b
            r2.<init>(r4)
            return r2
        L_0x0132:
            com.ss.android.ugc.aweme.bridgeservice.c r2 = com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils.getBusinessBridgeService()
            r2.mo61471c()
        L_0x0139:
            com.ss.android.ugc.aweme.mix.b r2 = new com.ss.android.ugc.aweme.mix.b
            com.ss.android.ugc.aweme.mix.MixDetailViewModel r5 = (com.p280ss.android.ugc.aweme.mix.MixDetailViewModel) r5
            r2.<init>(r5)
            return r2
        L_0x0141:
            com.ss.android.ugc.aweme.detail.operators.o r2 = new com.ss.android.ugc.aweme.detail.operators.o
            r2.<init>(r4)
            return r2
        L_0x0147:
            com.ss.android.ugc.aweme.detail.operators.l r2 = new com.ss.android.ugc.aweme.detail.operators.l
            r2.<init>(r4)
            return r2
        L_0x014d:
            com.ss.android.ugc.aweme.detail.operators.ah r2 = new com.ss.android.ugc.aweme.detail.operators.ah
            r2.<init>(r4)
            return r2
        L_0x0153:
            com.ss.android.ugc.aweme.detail.operators.k r2 = new com.ss.android.ugc.aweme.detail.operators.k
            r2.<init>(r4)
            return r2
        L_0x0159:
            com.ss.android.ugc.aweme.detail.operators.m r3 = new com.ss.android.ugc.aweme.detail.operators.m
            r3.<init>(r4, r2)
            return r3
        L_0x015f:
            com.ss.android.ugc.aweme.detail.operators.ae r2 = new com.ss.android.ugc.aweme.detail.operators.ae
            r2.<init>(r4)
            return r2
        L_0x0165:
            com.ss.android.ugc.aweme.detail.operators.n r2 = new com.ss.android.ugc.aweme.detail.operators.n
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel r5 = (com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel) r5
            r2.<init>(r5)
            return r2
        L_0x016d:
            com.ss.android.ugc.aweme.detail.operators.ac r2 = new com.ss.android.ugc.aweme.detail.operators.ac
            r2.<init>(r4)
            return r2
        L_0x0173:
            com.ss.android.ugc.aweme.detail.operators.ar r2 = new com.ss.android.ugc.aweme.detail.operators.ar
            r2.<init>(r4)
            return r2
        L_0x0179:
            com.ss.android.ugc.aweme.detail.operators.ad r2 = new com.ss.android.ugc.aweme.detail.operators.ad
            r2.<init>(r4)
            return r2
        L_0x017f:
            com.ss.android.ugc.aweme.detail.operators.ab r2 = new com.ss.android.ugc.aweme.detail.operators.ab
            r2.<init>(r4)
            return r2
        L_0x0185:
            com.ss.android.ugc.aweme.fe.method.feeds.a.a r2 = new com.ss.android.ugc.aweme.fe.method.feeds.a.a
            r2.<init>(r4)
            return r2
        L_0x018b:
            com.ss.android.ugc.aweme.commerce.service.ICommerceService r2 = com.p280ss.android.ugc.aweme.commerce.service.C24436a.m80356a()
            com.ss.android.ugc.aweme.detail.operators.am r2 = r2.newCommerceAnchorVideosOperator(r4)
            return r2
        L_0x0194:
            com.ss.android.ugc.aweme.detail.operators.aq r2 = new com.ss.android.ugc.aweme.detail.operators.aq
            r2.<init>()
            return r2
        L_0x019a:
            com.ss.android.ugc.aweme.detail.operators.d r3 = new com.ss.android.ugc.aweme.detail.operators.d
            r3.<init>(r4, r2)
            return r3
        L_0x01a0:
            com.ss.android.ugc.aweme.detail.operators.af r2 = new com.ss.android.ugc.aweme.detail.operators.af
            r2.<init>(r4)
            return r2
        L_0x01a6:
            com.ss.android.ugc.aweme.detail.operators.h r2 = new com.ss.android.ugc.aweme.detail.operators.h
            java.lang.String r3 = r3.getTabName()
            r2.<init>(r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.detail.operators.C26169t.mo67700a(java.lang.String, com.ss.android.ugc.aweme.feed.param.FeedParam, com.ss.android.ugc.aweme.common.e.a, com.bytedance.jedi.arch.JediViewModel):com.ss.android.ugc.aweme.detail.operators.am");
    }
}
