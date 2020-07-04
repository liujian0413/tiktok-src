package com.p280ss.android.account.p816b;

/* renamed from: com.ss.android.account.b.a */
public final class C18894a {

    /* renamed from: a */
    public static final String[] f50925a = {"flyme", "huawei", "sina_weibo", "telecom", "qq_weibo", "renren_sns", "kaixin_sns", "qzone_sns", "mobile", "live_stream", "aweme", "weixin", "xiaomi", "email", "google", "facebook", "twitter", "instagram", "line", "kakaotalk", "vk", "toutiao", "toutiao_v2", "flipchat", "gogokid"};

    /* renamed from: b */
    public final String f50926b;

    /* renamed from: c */
    public final int f50927c;

    /* renamed from: d */
    public boolean f50928d;

    /* renamed from: e */
    public String f50929e = "";

    /* renamed from: f */
    public String f50930f;

    /* renamed from: g */
    public String f50931g = "";

    /* renamed from: h */
    public String f50932h;

    /* renamed from: i */
    public long f50933i;

    /* renamed from: j */
    public long f50934j;

    /* renamed from: a */
    public final void mo50254a() {
        this.f50928d = false;
        this.f50929e = "";
        this.f50930f = null;
        this.f50931g = "";
        this.f50933i = 0;
        this.f50934j = 0;
    }

    /* renamed from: a */
    public static C18894a m61665a(String str) {
        return m61666a(str, 0);
    }

    public C18894a(String str, int i) {
        this.f50926b = str;
        this.f50927c = i;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p280ss.android.account.p816b.C18894a m61666a(java.lang.String r1, int r2) {
        /*
            int r2 = r1.hashCode()
            r0 = 0
            switch(r2) {
                case -1530308138: goto L_0x010e;
                case -1429363305: goto L_0x0103;
                case -1240244679: goto L_0x00f8;
                case -1206476313: goto L_0x00ed;
                case -1134307907: goto L_0x00e2;
                case -1068855134: goto L_0x00d8;
                case -1035863501: goto L_0x00cd;
                case -916346253: goto L_0x00c2;
                case -791575966: goto L_0x00b8;
                case -759499589: goto L_0x00ad;
                case -589445623: goto L_0x00a2;
                case -471473230: goto L_0x0097;
                case 3765: goto L_0x008b;
                case 3321844: goto L_0x007f;
                case 93227207: goto L_0x0073;
                case 96619420: goto L_0x0067;
                case 97536331: goto L_0x005c;
                case 199970038: goto L_0x0050;
                case 486515695: goto L_0x0044;
                case 497130182: goto L_0x0038;
                case 635922494: goto L_0x002c;
                case 730878681: goto L_0x0021;
                case 1766810787: goto L_0x0016;
                case 1851692357: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0118
        L_0x000a:
            java.lang.String r2 = "flipchat"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 22
            goto L_0x0119
        L_0x0016:
            java.lang.String r2 = "kaixin_sns"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 3
            goto L_0x0119
        L_0x0021:
            java.lang.String r2 = "renren_sns"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 2
            goto L_0x0119
        L_0x002c:
            java.lang.String r2 = "toutiao_v2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 21
            goto L_0x0119
        L_0x0038:
            java.lang.String r2 = "facebook"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 15
            goto L_0x0119
        L_0x0044:
            java.lang.String r2 = "kakaotalk"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 18
            goto L_0x0119
        L_0x0050:
            java.lang.String r2 = "gogokid"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 23
            goto L_0x0119
        L_0x005c:
            java.lang.String r2 = "flyme"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 7
            goto L_0x0119
        L_0x0067:
            java.lang.String r2 = "email"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 11
            goto L_0x0119
        L_0x0073:
            java.lang.String r2 = "aweme"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 13
            goto L_0x0119
        L_0x007f:
            java.lang.String r2 = "line"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 17
            goto L_0x0119
        L_0x008b:
            java.lang.String r2 = "vk"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 19
            goto L_0x0119
        L_0x0097:
            java.lang.String r2 = "sina_weibo"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 0
            goto L_0x0119
        L_0x00a2:
            java.lang.String r2 = "qq_weibo"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 1
            goto L_0x0119
        L_0x00ad:
            java.lang.String r2 = "xiaomi"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 10
            goto L_0x0119
        L_0x00b8:
            java.lang.String r2 = "weixin"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 6
            goto L_0x0119
        L_0x00c2:
            java.lang.String r2 = "twitter"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 16
            goto L_0x0119
        L_0x00cd:
            java.lang.String r2 = "live_stream"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 12
            goto L_0x0119
        L_0x00d8:
            java.lang.String r2 = "mobile"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 5
            goto L_0x0119
        L_0x00e2:
            java.lang.String r2 = "toutiao"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 20
            goto L_0x0119
        L_0x00ed:
            java.lang.String r2 = "huawei"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 8
            goto L_0x0119
        L_0x00f8:
            java.lang.String r2 = "google"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 14
            goto L_0x0119
        L_0x0103:
            java.lang.String r2 = "telecom"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 9
            goto L_0x0119
        L_0x010e:
            java.lang.String r2 = "qzone_sns"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = 4
            goto L_0x0119
        L_0x0118:
            r2 = -1
        L_0x0119:
            switch(r2) {
                case 0: goto L_0x0177;
                case 1: goto L_0x0173;
                case 2: goto L_0x016f;
                case 3: goto L_0x016b;
                case 4: goto L_0x0167;
                case 5: goto L_0x0163;
                case 6: goto L_0x015f;
                case 7: goto L_0x015b;
                case 8: goto L_0x0157;
                case 9: goto L_0x0153;
                case 10: goto L_0x014f;
                case 11: goto L_0x014b;
                case 12: goto L_0x0147;
                case 13: goto L_0x0143;
                case 14: goto L_0x013f;
                case 15: goto L_0x013b;
                case 16: goto L_0x0137;
                case 17: goto L_0x0133;
                case 18: goto L_0x012f;
                case 19: goto L_0x012b;
                case 20: goto L_0x0127;
                case 21: goto L_0x0127;
                case 22: goto L_0x0123;
                case 23: goto L_0x011e;
                default: goto L_0x011c;
            }
        L_0x011c:
            goto L_0x017a
        L_0x011e:
            r0 = 2131826895(0x7f1118cf, float:1.9286687E38)
            goto L_0x017a
        L_0x0123:
            r0 = 2131826893(0x7f1118cd, float:1.9286683E38)
            goto L_0x017a
        L_0x0127:
            r0 = 2131826908(0x7f1118dc, float:1.9286714E38)
            goto L_0x017a
        L_0x012b:
            r0 = 2131826910(0x7f1118de, float:1.9286718E38)
            goto L_0x017a
        L_0x012f:
            r0 = 2131826901(0x7f1118d5, float:1.92867E38)
            goto L_0x017a
        L_0x0133:
            r0 = 2131826902(0x7f1118d6, float:1.9286701E38)
            goto L_0x017a
        L_0x0137:
            r0 = 2131826909(0x7f1118dd, float:1.9286716E38)
            goto L_0x017a
        L_0x013b:
            r0 = 2131826892(0x7f1118cc, float:1.9286681E38)
            goto L_0x017a
        L_0x013f:
            r0 = 2131826896(0x7f1118d0, float:1.928669E38)
            goto L_0x017a
        L_0x0143:
            r0 = 2131826890(0x7f1118ca, float:1.9286677E38)
            goto L_0x017a
        L_0x0147:
            r0 = 2131826898(0x7f1118d2, float:1.9286693E38)
            goto L_0x017a
        L_0x014b:
            r0 = 2131826891(0x7f1118cb, float:1.928668E38)
            goto L_0x017a
        L_0x014f:
            r0 = 2131826913(0x7f1118e1, float:1.9286724E38)
            goto L_0x017a
        L_0x0153:
            r0 = 2131826906(0x7f1118da, float:1.928671E38)
            goto L_0x017a
        L_0x0157:
            r0 = 2131826897(0x7f1118d1, float:1.9286691E38)
            goto L_0x017a
        L_0x015b:
            r0 = 2131826894(0x7f1118ce, float:1.9286685E38)
            goto L_0x017a
        L_0x015f:
            r0 = 2131826912(0x7f1118e0, float:1.9286722E38)
            goto L_0x017a
        L_0x0163:
            r0 = 2131826903(0x7f1118d7, float:1.9286704E38)
            goto L_0x017a
        L_0x0167:
            r0 = 2131826904(0x7f1118d8, float:1.9286706E38)
            goto L_0x017a
        L_0x016b:
            r0 = 2131826900(0x7f1118d4, float:1.9286697E38)
            goto L_0x017a
        L_0x016f:
            r0 = 2131826905(0x7f1118d9, float:1.9286708E38)
            goto L_0x017a
        L_0x0173:
            r0 = 2131826907(0x7f1118db, float:1.9286712E38)
            goto L_0x017a
        L_0x0177:
            r0 = 2131826911(0x7f1118df, float:1.928672E38)
        L_0x017a:
            com.ss.android.account.b.a r2 = new com.ss.android.account.b.a
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.account.p816b.C18894a.m61666a(java.lang.String, int):com.ss.android.account.b.a");
    }
}
