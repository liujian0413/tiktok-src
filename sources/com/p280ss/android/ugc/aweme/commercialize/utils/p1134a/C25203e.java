package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.commercialize.C24558c;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25183a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25187e;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25192f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e */
public final class C25203e {

    /* renamed from: a */
    public static final C25203e f66500a = new C25203e();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$a */
    public static final class C25204a extends C25187e {

        /* renamed from: a */
        final /* synthetic */ Context f66501a;

        /* renamed from: b */
        final /* synthetic */ LinkData f66502b;

        /* renamed from: c */
        final /* synthetic */ Aweme f66503c;

        /* renamed from: d */
        final /* synthetic */ boolean f66504d;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$a$a */
        static final class C25205a implements C25372a {

            /* renamed from: a */
            final /* synthetic */ C25204a f66505a;

            C25205a(C25204a aVar) {
                this.f66505a = aVar;
            }

            /* renamed from: a */
            public final void mo61517a(boolean z) {
                if (z) {
                    C24976t.m82080a("deeplink_success", this.f66505a.f66501a, this.f66505a.f66502b, this.f66505a.f66503c, this.f66505a.f66504d);
                } else {
                    C24976t.m82080a("deeplink_failed", this.f66505a.f66501a, this.f66505a.f66502b, this.f66505a.f66503c, this.f66505a.f66504d);
                }
            }
        }

        /* renamed from: a */
        public final void mo65814a(boolean z, C25175a aVar) {
            C7573i.m23587b(aVar, "params");
            super.mo65814a(z, aVar);
            if (z) {
                C24976t.m82080a("open_url_app", this.f66501a, this.f66502b, this.f66503c, this.f66504d);
                C25371n.m83440a((C25372a) new C25205a(this));
            }
        }

        C25204a(Context context, LinkData linkData, Aweme aweme, boolean z) {
            this.f66501a = context;
            this.f66502b = linkData;
            this.f66503c = aweme;
            this.f66504d = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$b */
    public static final class C25206b extends C25183a {

        /* renamed from: a */
        final /* synthetic */ LinkData f66506a;

        /* renamed from: b */
        final /* synthetic */ Context f66507b;

        /* renamed from: c */
        final /* synthetic */ Aweme f66508c;

        /* renamed from: d */
        final /* synthetic */ boolean f66509d;

        /* renamed from: b */
        public final boolean mo65818b() {
            return C25371n.m83471b(this.f66507b, this.f66506a.packageName);
        }

        /* renamed from: a */
        public final boolean mo65817a() {
            if (!C6399b.m19944t() || !TextUtils.equals(this.f66506a.type, "app")) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo65814a(boolean z, C25175a aVar) {
            C7573i.m23587b(aVar, "params");
            super.mo65814a(z, aVar);
            if (z) {
                C24976t.m82080a("open_url_app", this.f66507b, this.f66506a, this.f66508c, this.f66509d);
            }
        }

        C25206b(LinkData linkData, Context context, Aweme aweme, boolean z) {
            this.f66506a = linkData;
            this.f66507b = context;
            this.f66508c = aweme;
            this.f66509d = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$c */
    public static final class C25207c extends C25192f {

        /* renamed from: a */
        final /* synthetic */ Context f66510a;

        /* renamed from: b */
        final /* synthetic */ LinkData f66511b;

        /* renamed from: c */
        final /* synthetic */ Aweme f66512c;

        /* renamed from: d */
        final /* synthetic */ boolean f66513d;

        /* renamed from: a */
        public final void mo65814a(boolean z, C25175a aVar) {
            C7573i.m23587b(aVar, "params");
            super.mo65814a(z, aVar);
            if (z) {
                C24976t.m82080a("open_url_h5", this.f66510a, this.f66511b, this.f66512c, this.f66513d);
            }
        }

        C25207c(Context context, LinkData linkData, Aweme aweme, boolean z) {
            this.f66510a = context;
            this.f66511b = linkData;
            this.f66512c = aweme;
            this.f66513d = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$d */
    static final class C25208d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Aweme f66514a;

        C25208d(Aweme aweme) {
            this.f66514a = aweme;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            try {
                C24558c a = C24558c.m80613a();
                C7573i.m23582a((Object) a, "CommercializeManager.getInstance()");
                a.f64800a = this.f66514a;
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.e$e */
    static final class C25209e implements C25372a {

        /* renamed from: a */
        final /* synthetic */ Context f66515a;

        /* renamed from: b */
        final /* synthetic */ LinkData f66516b;

        /* renamed from: c */
        final /* synthetic */ Aweme f66517c;

        /* renamed from: d */
        final /* synthetic */ boolean f66518d;

        C25209e(Context context, LinkData linkData, Aweme aweme, boolean z) {
            this.f66515a = context;
            this.f66516b = linkData;
            this.f66517c = aweme;
            this.f66518d = z;
        }

        /* renamed from: a */
        public final void mo61517a(boolean z) {
            if (z) {
                C24976t.m82080a("deeplink_success", this.f66515a, this.f66516b, this.f66517c, this.f66518d);
            } else {
                C24976t.m82080a("deeplink_failed", this.f66515a, this.f66516b, this.f66517c, this.f66518d);
            }
        }
    }

    private C25203e() {
    }

    /* renamed from: c */
    private static C33471b m82892c() {
        C33471b bVar = new C33471b();
        bVar.f87403e = "mp_url";
        return bVar;
    }

    /* renamed from: a */
    private static IMiniAppService m82888a() {
        C7167b b = C7167b.m22380b();
        C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
        IMiniAppService a = b.mo18647a();
        C7573i.m23582a((Object) a, "MiniAppServiceProxy.inst().service");
        return a;
    }

    /* renamed from: b */
    private static boolean m82891b() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean enableAdRouter = a.getEnableAdRouter();
            C7573i.m23582a((Object) enableAdRouter, "SettingsReader.get().enableAdRouter");
            return enableAdRouter.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m82889a(String str) {
        if (C33447f.m108191d(str)) {
            return C22912d.f60642b;
        }
        return "mp_url";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (r1 == null) goto L_0x0063;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m82890a(android.content.Context r22, com.p280ss.android.ugc.aweme.commercialize.model.LinkData r23, com.p280ss.android.ugc.aweme.feed.model.Aweme r24, boolean r25) {
        /*
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = 0
            if (r7 != 0) goto L_0x000c
            return r11
        L_0x000c:
            if (r8 != 0) goto L_0x000f
            return r11
        L_0x000f:
            if (r9 != 0) goto L_0x0012
            return r11
        L_0x0012:
            boolean r0 = m82891b()
            if (r0 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = new com.ss.android.ugc.aweme.commercialize.utils.a.a$a
            r0.<init>()
            java.lang.String r1 = r8.openUrl
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65772c(r1)
            java.lang.String r1 = r8.mpUrl
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65777g(r1)
            com.ss.android.ugc.aweme.miniapp_api.model.params.b$a r1 = new com.ss.android.ugc.aweme.miniapp_api.model.params.b$a
            r1.<init>()
            java.lang.String r2 = r8.openUrl
            java.lang.String r2 = m82889a(r2)
            com.ss.android.ugc.aweme.miniapp_api.model.params.b$a r1 = r1.mo85794e(r2)
            if (r10 == 0) goto L_0x003d
            java.lang.String r2 = "comment_page"
            goto L_0x003f
        L_0x003d:
            java.lang.String r2 = "in_video_tag"
        L_0x003f:
            com.ss.android.ugc.aweme.miniapp_api.model.params.b$a r1 = r1.mo85789a(r2)
            com.ss.android.ugc.aweme.miniapp_api.model.params.b r1 = r1.mo85790a()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65766a(r1)
            java.lang.String r1 = r8.webUrl
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65775e(r1)
            java.lang.String r1 = r8.webTitle
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65776f(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r24.getAwemeRawAd()
            if (r1 == 0) goto L_0x0063
            java.lang.String r1 = r1.getDownloadUrl()
            if (r1 != 0) goto L_0x0065
        L_0x0063:
            java.lang.String r1 = ""
        L_0x0065:
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65780j(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65765a(r9)
            java.lang.String r1 = r8.creativeId
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65767a(r1)
            java.lang.String r1 = r8.logExtra
            com.ss.android.ugc.aweme.commercialize.utils.a.a$a r0 = r0.mo65770b(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r0 = r0.f66436a
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.c$a
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r1 = r1.mo65823a(r7)
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r1.mo65825a(r0)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.c r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.c
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25183a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo65824a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$a r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$a
            r1.<init>(r7, r8, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25183a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo65824a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$b r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$b
            r1.<init>(r8, r7, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25183a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo65824a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.d r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.a.d
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25183a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo65824a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$c r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$c
            r1.<init>(r7, r8, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.a.a.a r1 = (com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25183a) r1
            com.ss.android.ugc.aweme.commercialize.utils.a.c$a r0 = r0.mo65824a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.c r0 = r0.f66489a
            boolean r0 = r0.mo65822a()
            return r0
        L_0x00c6:
            java.lang.String r0 = r8.openUrl
            java.lang.String r1 = r8.openUrl
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00e9
            boolean r1 = com.p280ss.android.ugc.aweme.miniapp_api.C33447f.m108191d(r0)
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = "&schema_from=ad_link"
            java.lang.String r0 = kotlin.jvm.internal.C7573i.m23577a(r0, r1)
            if (r10 == 0) goto L_0x00e3
            java.lang.String r1 = "&position=comment_page"
            goto L_0x00e5
        L_0x00e3:
            java.lang.String r1 = "&position=in_video_tag"
        L_0x00e5:
            java.lang.String r0 = kotlin.jvm.internal.C7573i.m23577a(r0, r1)
        L_0x00e9:
            boolean r1 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83361c(r0)
            r2 = 3
            if (r1 == 0) goto L_0x011f
            java.lang.String r1 = "draw_ad"
            int r3 = r8.feedShowType
            if (r3 != r2) goto L_0x00f8
            java.lang.String r1 = "comment_ad"
        L_0x00f8:
            java.lang.String r3 = com.p280ss.android.ugc.aweme.commercialize.p1114a.C24504a.C24505a.f64678a
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r4 = "tag"
            android.net.Uri$Builder r1 = r3.appendQueryParameter(r4, r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Uri.parse(CommercializeC…              .toString()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.lang.String r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83325a(r0, r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$d r1 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$d
            r1.<init>(r9)
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            bolts.C1592h.m7853a(r1)
        L_0x011f:
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83463a(r7, r0, r11)
            r12 = 1
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = "open_url_app"
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82080a(r0, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.a.e$e r0 = new com.ss.android.ugc.aweme.commercialize.utils.a.e$e
            r0.<init>(r7, r8, r9, r10)
            com.ss.android.ugc.aweme.commercialize.utils.n$a r0 = (com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a) r0
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83440a(r0)
            return r12
        L_0x0136:
            java.lang.String r0 = r8.mpUrl
            boolean r0 = com.p280ss.android.ugc.aweme.miniapp_api.C33447f.m108191d(r0)
            if (r0 == 0) goto L_0x014f
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = m82888a()
            java.lang.String r1 = r8.mpUrl
            com.ss.android.ugc.aweme.miniapp_api.model.params.b r3 = m82892c()
            boolean r0 = r0.openMiniApp(r7, r1, r3)
            if (r0 == 0) goto L_0x014f
            return r12
        L_0x014f:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = r8.type
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "app"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = "open_url_app"
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82080a(r0, r7, r8, r9, r10)
            java.lang.String r0 = r8.packageName
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83471b(r7, r0)
            return r0
        L_0x016f:
            r0 = 0
            java.lang.String r3 = r8.creativeId     // Catch:{ Exception -> 0x0178 }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x0178 }
            r0 = r3
        L_0x0178:
            r3 = 0
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r24.getAwemeRawAd()
            if (r5 == 0) goto L_0x0199
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r24.getAwemeRawAd()
            if (r2 != 0) goto L_0x018f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x018f:
            java.lang.String r3 = "aweme.awemeRawAd!!"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r3 = r2.getDownloadUrl()
            goto L_0x01ad
        L_0x0199:
            int r5 = r8.feedShowType
            if (r5 != r2) goto L_0x01ad
            java.lang.String r3 = r8.downloadUrl
            java.lang.String r2 = "aweme_package_name"
            java.lang.String r5 = r8.packageName
            r4.put(r2, r5)
            java.lang.String r2 = "bundle_app_ad_from"
            java.lang.String r5 = "6"
            r4.put(r2, r5)
        L_0x01ad:
            r16 = r3
            java.lang.String r2 = r8.webUrl
            java.lang.String r3 = r8.webTitle
            r5 = 0
            r6 = 1
            com.ss.android.ugc.aweme.commercialize.utils.c.a.a$a r21 = new com.ss.android.ugc.aweme.commercialize.utils.c.a.a$a
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            java.lang.String r15 = r8.logExtra
            java.lang.String r0 = r8.type
            r18 = 0
            r19 = 16
            r20 = 0
            r13 = r21
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r0 = r22
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r21
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25332a.m83256a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = "open_url_h5"
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82080a(r0, r7, r8, r9, r10)
            return r12
        L_0x01e0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25203e.m82890a(android.content.Context, com.ss.android.ugc.aweme.commercialize.model.LinkData, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }
}
