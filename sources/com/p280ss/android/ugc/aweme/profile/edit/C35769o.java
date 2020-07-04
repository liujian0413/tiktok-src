package com.p280ss.android.ugc.aweme.profile.edit;

import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.app.FragmentActivity;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.awemelobby.C9658b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.api.client.googleapis.auth.p775a.C17216c;
import com.google.api.client.googleapis.auth.p775a.C17216c.C17217a;
import com.google.api.client.http.C17272u;
import com.google.api.client.json.C17291c;
import com.google.api.client.json.p779a.C17280a;
import com.google.api.client.p770a.p771a.p772a.C17191a;
import com.google.api.p767a.p768a.C17160a;
import com.google.api.p767a.p768a.p769a.C17164a;
import com.google.api.p767a.p768a.p769a.C17172h;
import com.google.api.p767a.p768a.p769a.C17174j;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.edit.api.YouTubeLinkingApi;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.p280ss.android.ugc.trill.p1765g.C44997a;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import net.openid.appauth.C48259e;
import net.openid.appauth.C48259e.C48261a;
import net.openid.appauth.C48265g;
import net.openid.appauth.C48269i;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.o */
public final class C35769o implements C6310a, C15040c, C35754c {

    /* renamed from: b */
    static final /* synthetic */ C7595j[] f93761b = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C35769o.class), "isGoogleServiceAvailable", "isGoogleServiceAvailable()Z"))};

    /* renamed from: m */
    public static final boolean f93762m = C7163a.m22363a();

    /* renamed from: n */
    public static final C35770a f93763n = new C35770a(null);

    /* renamed from: c */
    public String f93764c = "";

    /* renamed from: d */
    public String f93765d = "";

    /* renamed from: e */
    public C6309f f93766e = new C6309f(this);

    /* renamed from: f */
    public String f93767f;

    /* renamed from: g */
    public C17216c f93768g;

    /* renamed from: h */
    public final C17272u f93769h = C17191a.m57039a();

    /* renamed from: i */
    public final C17280a f93770i = new C17280a();

    /* renamed from: j */
    public boolean f93771j;

    /* renamed from: k */
    public final FragmentActivity f93772k;

    /* renamed from: l */
    public final C35756d f93773l;

    /* renamed from: o */
    private String f93774o;

    /* renamed from: p */
    private String f93775p;

    /* renamed from: q */
    private final C7541d f93776q = C7546e.m23569a(new C35772c(this));

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.o$a */
    public static final class C35770a {
        private C35770a() {
        }

        public /* synthetic */ C35770a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.o$b */
    static final class C35771b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35769o f93777a;

        C35771b(C35769o oVar) {
            this.f93777a = oVar;
        }

        public final void run() {
            try {
                C48259e a = new C48261a(new C48269i(Uri.parse("https://accounts.google.com/o/oauth2/v2/auth"), Uri.parse("https://www.googleapis.com/oauth2/v4/token")), this.f93777a.f93764c, "code", Uri.parse(this.f93777a.f93765d)).mo120631a("https://www.googleapis.com/auth/youtube.readonly").mo120632a();
                C7573i.m23582a((Object) a, "authRequestBuilder\n     …                 .build()");
                this.f93777a.f93772k.startActivityForResult(new C48265g(this.f93777a.f93772k).mo120649a(a), 1001);
            } catch (Exception e) {
                this.f93777a.mo90644a(e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.o$c */
    static final class C35772c extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C35769o f93778a;

        C35772c(C35769o oVar) {
            this.f93778a = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m115535a());
        }

        /* renamed from: a */
        private boolean m115535a() {
            boolean a = C9658b.m28557a(this.f93778a.f93772k);
            if (a) {
                if (C6399b.m19946v()) {
                    this.f93778a.f93764c = "616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1.apps.googleusercontent.com";
                    this.f93778a.f93765d = "com.googleusercontent.apps.616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1:/oauthredirect";
                } else if (C6399b.m19947w()) {
                    this.f93778a.f93764c = "1096011445005-qqsj3hcu9s53dv6pbdrl6vs8ls649v01.apps.googleusercontent.com";
                    this.f93778a.f93765d = "com.googleusercontent.apps.1096011445005-qqsj3hcu9s53dv6pbdrl6vs8ls649v01:/oauthredirect";
                }
                this.f93778a.f93768g = new C17217a().mo44493a(this.f93778a.f93769h).mo44494a((C17291c) this.f93778a.f93770i).mo44513a(this.f93778a.f93764c, null).mo44514a();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.o$d */
    static final class C35773d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C35769o f93779a;

        /* renamed from: b */
        final /* synthetic */ Intent f93780b;

        C35773d(C35769o oVar, Intent intent) {
            this.f93779a = oVar;
            this.f93780b = intent;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m115536a());
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m115536a() {
            /*
                r7 = this;
                android.content.Intent r0 = r7.f93780b
                net.openid.appauth.f r0 = net.openid.appauth.C48262f.m149723a(r0)
                r1 = 1
                if (r0 != 0) goto L_0x0073
                android.content.Intent r0 = r7.f93780b
                net.openid.appauth.AuthorizationException r0 = net.openid.appauth.AuthorizationException.fromIntent(r0)
                r2 = 0
                if (r0 == 0) goto L_0x0042
                java.lang.String r3 = r0.getMessage()
                if (r3 == 0) goto L_0x0042
                if (r3 == 0) goto L_0x003a
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.CharSequence r3 = kotlin.text.C7634n.m23762b(r3)
                java.lang.String r3 = r3.toString()
                if (r3 == 0) goto L_0x0042
                if (r3 == 0) goto L_0x0032
                java.lang.String r3 = r3.toLowerCase()
                java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                goto L_0x0043
            L_0x0032:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x003a:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
                r0.<init>(r1)
                throw r0
            L_0x0042:
                r3 = r2
            L_0x0043:
                r4 = 0
                if (r3 == 0) goto L_0x0051
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.String r5 = "cancelled"
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r6 = 2
                boolean r4 = kotlin.text.C7634n.m23776c(r3, r5, false)
            L_0x0051:
                com.ss.android.ugc.aweme.profile.edit.o r3 = r7.f93779a
                if (r0 == 0) goto L_0x005c
                int r5 = r0.code
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x005d
            L_0x005c:
                r5 = r2
            L_0x005d:
                if (r0 == 0) goto L_0x0063
                java.lang.String r2 = r0.getMessage()
            L_0x0063:
                if (r0 == 0) goto L_0x0068
                java.lang.Exception r0 = (java.lang.Exception) r0
                goto L_0x006f
            L_0x0068:
                java.lang.Exception r0 = new java.lang.Exception
                java.lang.String r6 = "AuthorizationResponse is null"
                r0.<init>(r6)
            L_0x006f:
                r3.mo90645a(r4, r5, r2, r0)
                return r1
            L_0x0073:
                net.openid.appauth.g r2 = new net.openid.appauth.g
                com.ss.android.ugc.aweme.profile.edit.o r3 = r7.f93779a
                android.support.v4.app.FragmentActivity r3 = r3.f93772k
                android.content.Context r3 = (android.content.Context) r3
                r2.<init>(r3)
                net.openid.appauth.p r0 = r0.mo120637a()
                com.ss.android.ugc.aweme.profile.edit.o$d$1 r3 = new com.ss.android.ugc.aweme.profile.edit.o$d$1
                r3.<init>(r7)
                net.openid.appauth.g$b r3 = (net.openid.appauth.C48265g.C48267b) r3
                r2.mo120651a(r0, r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.edit.C35769o.C35773d.m115536a():boolean");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.o$e */
    static final class C35776e<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C35769o f93784a;

        C35776e(C35769o oVar) {
            this.f93784a = oVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m115538a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115538a(C1592h<Boolean> hVar) {
            if (C43173w.m136926a((C1592h) hVar)) {
                C7573i.m23582a((Object) hVar, "task");
                if (((Boolean) hVar.mo6890e()).booleanValue()) {
                    return;
                }
            }
            C35769o oVar = this.f93784a;
            C7573i.m23582a((Object) hVar, "task");
            oVar.mo90644a(new Exception(hVar.mo6891f()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.o$f */
    static final class C35777f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35769o f93785a;

        C35777f(C35769o oVar) {
            this.f93785a = oVar;
        }

        public final void run() {
            if (YouTubeLinkingApi.m115487a()) {
                C6861a.m21337f().queryUser(this.f93785a.f93766e);
            } else {
                this.f93785a.f93773l.mo90626b(this.f93785a.f93771j);
            }
        }
    }

    /* renamed from: d */
    private final boolean m115526d() {
        return ((Boolean) this.f93776q.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final void mo38259a(ConnectionResult connectionResult) {
        C7573i.m23587b(connectionResult, "p0");
    }

    /* renamed from: b */
    public final void mo90625b() {
        this.f93771j = false;
        C43173w.m136929b(new C35777f(this));
    }

    /* renamed from: a */
    public final void mo90623a() {
        this.f93771j = true;
        if (!m115526d()) {
            mo90644a(new Exception("Google service is not available, aborting."));
            return;
        }
        C6921a.m21562b("youtube-debug", "Starting YouTube authorize");
        C43173w.m136925a((Runnable) new C35771b(this), "YouTubePresenter");
    }

    /* renamed from: c */
    public final void mo90646c() {
        C6907h.m21524a("get_third_party_info", (Map) C22984d.m75611a().mo59973a("party_name", "youtube").mo59973a("party_account_id", this.f93774o).f60753a);
        this.f93771j = true;
        if (YouTubeLinkingApi.m115488a(this.f93767f, null, this.f93774o, this.f93775p)) {
            C6861a.m21337f().queryUser(this.f93766e);
        } else {
            mo90644a(new Exception("Error occurred when saving YouTube data to our own server"));
        }
    }

    /* renamed from: a */
    public final void mo90644a(Exception exc) {
        mo90645a(false, null, exc.getMessage(), exc);
    }

    /* renamed from: a */
    public final void mo90624a(Intent intent) {
        if (intent == null) {
            mo90644a(new Exception("onActivityResult called with null Intent"));
        } else {
            C1592h.m7853a((Callable<TResult>) new C35773d<TResult>(this, intent)).mo6875a((C1591g<TResult, TContinuationResult>) new C35776e<TResult,TContinuationResult>(this));
        }
    }

    /* renamed from: a */
    public final void mo90643a(C17160a aVar) throws IOException {
        C6921a.m21562b("youtube-debug", "Fetching YouTube Data API");
        C17172h hVar = (C17172h) aVar.mo44435e().mo44444a("id, snippet").mo44445a(Boolean.valueOf(true)).mo44507c();
        C7573i.m23582a((Object) hVar, "clr");
        C17164a aVar2 = (C17164a) hVar.items.get(0);
        C7573i.m23582a((Object) aVar2, "channel");
        this.f93774o = aVar2.f47896id;
        C17174j jVar = aVar2.snippet;
        C7573i.m23582a((Object) jVar, "channel.snippet");
        this.f93775p = jVar.title;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x00a4
            java.lang.Object r1 = r7.obj
            boolean r1 = r1 instanceof java.lang.Exception
            if (r1 != 0) goto L_0x00a4
            java.lang.Object r1 = r7.obj
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r7.obj
            boolean r1 = r1 instanceof com.p280ss.android.ugc.aweme.profile.UserResponse
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r7.obj
            if (r1 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.profile.UserResponse r1 = (com.p280ss.android.ugc.aweme.profile.UserResponse) r1
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            goto L_0x002c
        L_0x001e:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse"
            r7.<init>(r0)
            throw r7
        L_0x0026:
            java.lang.Object r1 = r7.obj
            if (r1 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p280ss.android.ugc.aweme.profile.model.User) r1
        L_0x002c:
            int r2 = r7.what
            r3 = 112(0x70, float:1.57E-43)
            if (r2 != r3) goto L_0x00a4
            if (r1 == 0) goto L_0x00a4
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            r2.updateCurUser(r1)
            com.ss.android.ugc.aweme.base.c.c r2 = new com.ss.android.ugc.aweme.base.c.c
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r4 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getCurUser()
            r2.<init>(r3)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r2)
            r2 = 1
            boolean r3 = r6.f93771j
            if (r3 == 0) goto L_0x0083
            java.lang.String r3 = r1.getYoutubeChannelTitle()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0066
            java.lang.String r1 = r1.getYoutubeChannelTitle()
            goto L_0x006a
        L_0x0066:
            java.lang.String r1 = r1.getYoutubeChannelId()
        L_0x006a:
            com.ss.android.ugc.aweme.profile.edit.d r3 = r6.f93773l
            r3.mo90627e(r1)
            java.lang.String r1 = "social_account_bind_success"
            com.ss.android.ugc.aweme.app.g.d r3 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r4 = "platform"
            java.lang.String r5 = "youtube"
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r3)
            goto L_0x00a5
        L_0x0083:
            com.ss.android.ugc.aweme.profile.edit.d r1 = r6.f93773l
            r1.mo90627e(r0)
            java.lang.String r1 = "social_account_unbind_success"
            com.ss.android.ugc.aweme.app.g.d r3 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r4 = "platform"
            java.lang.String r5 = "youtube"
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r3)
            goto L_0x00a5
        L_0x009c:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r7.<init>(r0)
            throw r7
        L_0x00a4:
            r2 = 0
        L_0x00a5:
            if (r2 != 0) goto L_0x00c5
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Wrong result in handleMsg function, message: "
            r2.<init>(r3)
            if (r7 == 0) goto L_0x00b8
            int r7 = r7.what
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
        L_0x00b8:
            r2.append(r0)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7)
            r6.mo90644a(r1)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.edit.C35769o.handleMsg(android.os.Message):void");
    }

    public C35769o(FragmentActivity fragmentActivity, C35756d dVar) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(dVar, "youTubeView");
        this.f93772k = fragmentActivity;
        this.f93773l = dVar;
    }

    /* renamed from: a */
    public final void mo90645a(boolean z, Integer num, String str, Exception exc) {
        int i;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Google Play Services code: ");
        sb2.append(C44997a.m141973b(this.f93772k));
        sb.append(sb2.toString());
        sb.append(" | Error message: ");
        sb.append(str);
        String sb3 = sb.toString();
        C7573i.m23582a((Object) sb3, "StringBuilder()\n        …              .toString()");
        String str2 = "social_account_bind_failure";
        C22984d a = C22984d.m75611a().mo59973a("platform", "youtube");
        String str3 = "error_code";
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        C6907h.m21524a(str2, (Map) a.mo59970a(str3, i).mo59973a("error_desc", sb3).f60753a);
        if (z) {
            this.f93773l.mo90627e(null);
            return;
        }
        this.f93773l.mo90626b(this.f93771j);
        C6921a.m21559a((Throwable) new Exception("youtube-debug", exc));
    }
}
