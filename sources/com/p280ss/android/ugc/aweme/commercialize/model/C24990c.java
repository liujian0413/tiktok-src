package com.p280ss.android.ugc.aweme.commercialize.model;

import com.p280ss.android.ugc.aweme.commercialize.utils.C25267bf;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.c */
public final class C24990c {

    /* renamed from: a */
    public long f65887a;

    /* renamed from: b */
    public String f65888b;

    /* renamed from: c */
    public long f65889c;

    /* renamed from: d */
    public String f65890d;

    /* renamed from: e */
    public String f65891e;

    /* renamed from: f */
    public String f65892f;

    /* renamed from: g */
    public String f65893g;

    /* renamed from: h */
    public String f65894h;

    /* renamed from: i */
    public String f65895i;

    /* renamed from: j */
    public String f65896j;

    /* renamed from: k */
    public int f65897k;

    /* renamed from: l */
    public Aweme f65898l;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.c$a */
    public static final class C24991a extends C25267bf<C24990c> {

        /* renamed from: com.ss.android.ugc.aweme.commercialize.model.c$a$a */
        static final class C24992a extends Lambda implements C7562b<C24990c, C7581n> {

            /* renamed from: a */
            final /* synthetic */ Aweme f65899a;

            C24992a(Aweme aweme) {
                this.f65899a = aweme;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m82305a((C24990c) obj);
                return C7581n.f20898a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x0086  */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x00aa  */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x00bc  */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x00cc  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void m82305a(com.p280ss.android.ugc.aweme.commercialize.model.C24990c r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = "$receiver"
                    kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    r6.f65898l = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    r1 = 0
                    if (r0 == 0) goto L_0x0020
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x0020
                    java.lang.Long r0 = r0.getCreativeId()
                    if (r0 == 0) goto L_0x0020
                    long r3 = r0.longValue()
                    goto L_0x0021
                L_0x0020:
                    r3 = r1
                L_0x0021:
                    r6.f65887a = r3
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    r3 = 0
                    if (r0 == 0) goto L_0x0033
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x0033
                    java.lang.String r0 = r0.getLogExtra()
                    goto L_0x0034
                L_0x0033:
                    r0 = r3
                L_0x0034:
                    r6.f65888b = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    if (r0 == 0) goto L_0x004a
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x004a
                    java.lang.Long r0 = r0.getGroupId()
                    if (r0 == 0) goto L_0x004a
                    long r1 = r0.longValue()
                L_0x004a:
                    r6.f65889c = r1
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    if (r0 == 0) goto L_0x005b
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x005b
                    java.lang.String r0 = r0.getOpenUrl()
                    goto L_0x005c
                L_0x005b:
                    r0 = r3
                L_0x005c:
                    r6.f65890d = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    if (r0 == 0) goto L_0x006d
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x006d
                    java.lang.String r0 = r0.getWebUrl()
                    goto L_0x006e
                L_0x006d:
                    r0 = r3
                L_0x006e:
                    r6.f65891e = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    if (r0 == 0) goto L_0x007f
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x007f
                    java.lang.String r0 = r0.getWebTitle()
                    goto L_0x0080
                L_0x007f:
                    r0 = r3
                L_0x0080:
                    r6.f65892f = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    if (r0 == 0) goto L_0x0091
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x0091
                    java.lang.String r0 = r0.getDownloadUrl()
                    goto L_0x0092
                L_0x0091:
                    r0 = r3
                L_0x0092:
                    r6.f65893g = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    if (r0 == 0) goto L_0x00a3
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x00a3
                    java.lang.String r0 = r0.getPackageName()
                    goto L_0x00a4
                L_0x00a3:
                    r0 = r3
                L_0x00a4:
                    r6.f65894h = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    if (r0 == 0) goto L_0x00b5
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x00b5
                    java.lang.String r0 = r0.getAppName()
                    goto L_0x00b6
                L_0x00b5:
                    r0 = r3
                L_0x00b6:
                    r6.f65895i = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    if (r0 == 0) goto L_0x00c6
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x00c6
                    java.lang.String r3 = r0.getType()
                L_0x00c6:
                    r6.f65896j = r3
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f65899a
                    if (r0 == 0) goto L_0x00d7
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x00d7
                    int r0 = r0.getSystemOrigin()
                    goto L_0x00d8
                L_0x00d7:
                    r0 = 0
                L_0x00d8:
                    r6.f65897k = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.model.C24990c.C24991a.C24992a.m82305a(com.ss.android.ugc.aweme.commercialize.model.c):void");
            }
        }

        public C24991a() {
            C24990c cVar = r0;
            C24990c cVar2 = new C24990c(0, null, 0, null, null, null, null, null, null, null, 0, null, 4095, null);
            super(cVar);
        }

        /* renamed from: a */
        public final C24991a mo65418a(Aweme aweme) {
            C24991a aVar = this;
            aVar.mo65870a(new C24992a(aweme));
            return aVar;
        }
    }

    private C24990c(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Aweme aweme) {
        this.f65887a = j;
        this.f65888b = str;
        this.f65889c = j2;
        this.f65890d = str2;
        this.f65891e = str3;
        this.f65892f = str4;
        this.f65893g = str5;
        this.f65894h = str6;
        this.f65895i = str7;
        this.f65896j = str8;
        this.f65897k = i;
        this.f65898l = aweme;
    }

    /* synthetic */ C24990c(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Aweme aweme, int i2, C7571f fVar) {
        this(0, null, 0, null, null, null, null, null, null, null, 0, null);
    }
}
