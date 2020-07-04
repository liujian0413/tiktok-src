package com.p280ss.android.ugc.aweme.profile.edit;

import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.awemelobby.C9658b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.android.gms.auth.api.C14941a;
import com.google.android.gms.auth.api.signin.C14975c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C14972a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15037d.C15038a;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.api.client.googleapis.auth.p775a.C17215b;
import com.google.api.client.googleapis.auth.p775a.C17216c;
import com.google.api.client.googleapis.auth.p775a.C17216c.C17217a;
import com.google.api.client.googleapis.auth.p775a.C17218d;
import com.google.api.client.http.C17272u;
import com.google.api.client.json.C17291c;
import com.google.api.client.json.p779a.C17280a;
import com.google.api.client.p770a.p771a.p772a.C17191a;
import com.google.api.p767a.p768a.C17160a;
import com.google.api.p767a.p768a.C17160a.C17161a;
import com.google.api.p767a.p768a.p769a.C17164a;
import com.google.api.p767a.p768a.p769a.C17172h;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.edit.api.YouTubeLinkingApi;
import com.p280ss.android.ugc.aweme.profile.util.C36764v;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.g */
public final class C35759g implements C6310a, C15040c, C35754c {

    /* renamed from: b */
    private static final boolean f93728b = C7163a.m22363a();

    /* renamed from: c */
    private static final String f93729c;

    /* renamed from: d */
    private final C17272u f93730d = C17191a.m57039a();

    /* renamed from: e */
    private final C17291c f93731e = new C17280a();

    /* renamed from: f */
    private C35756d f93732f;

    /* renamed from: g */
    private FragmentActivity f93733g;

    /* renamed from: h */
    private C6309f f93734h;

    /* renamed from: i */
    private String f93735i;

    /* renamed from: j */
    private String f93736j;

    /* renamed from: k */
    private String f93737k;

    /* renamed from: l */
    private String f93738l;

    /* renamed from: m */
    private GoogleSignInOptions f93739m;

    /* renamed from: n */
    private C15037d f93740n;

    /* renamed from: o */
    private C17216c f93741o;

    /* renamed from: p */
    private boolean f93742p;

    /* renamed from: a */
    public final void mo38259a(ConnectionResult connectionResult) {
    }

    /* renamed from: b */
    public final void mo90625b() {
        this.f93742p = false;
        C43173w.m136925a((Runnable) new C35761i(this), "OldYouTubePresenter");
    }

    static {
        String str;
        if (C6399b.m19947w()) {
            str = "dehbnbz2mthw7Wlc15DqnFlN";
        } else {
            str = "3MPMZ1Eqw9FcFUgkJWAxNbj1";
        }
        f93729c = str;
    }

    /* renamed from: d */
    private void m115503d() {
        if (this.f93740n != null && this.f93740n.mo38249j()) {
            C14941a.f38654h.mo38099b(this.f93740n).mo38262a(C35760h.f93743a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo90631c() {
        if (YouTubeLinkingApi.m115487a()) {
            C6861a.m21337f().queryUser(this.f93734h);
        } else {
            this.f93732f.mo90626b(this.f93742p);
        }
    }

    /* renamed from: e */
    private void m115504e() {
        C6907h.m21524a("get_third_party_info", (Map) C22984d.m75611a().mo59973a("party_name", "youtube").mo59973a("party_account_id", this.f93737k).f60753a);
        this.f93742p = true;
        if (YouTubeLinkingApi.m115488a(null, this.f93735i, this.f93737k, this.f93738l)) {
            C6861a.m21337f().queryUser(this.f93734h);
            return;
        }
        if (C6399b.m19947w()) {
            this.f93732f.mo90626b(this.f93742p);
        }
    }

    /* renamed from: a */
    public final void mo90623a() {
        if (!C9658b.m28557a(this.f93733g) || this.f93740n == null) {
            this.f93732f.mo90627e(null);
            return;
        }
        this.f93742p = true;
        m115503d();
        this.f93733g.startActivityForResult(C14941a.f38654h.mo38097a(this.f93740n), 1001);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90630a(GoogleSignInAccount googleSignInAccount) {
        m115501a(googleSignInAccount.f38768f);
        m115504e();
    }

    /* renamed from: b */
    private C17218d m115502b(String str) throws IOException {
        C17215b bVar = new C17215b(this.f93730d, this.f93731e, "https://accounts.google.com/o/oauth2/token", "340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com", f93729c, str, "");
        return bVar.mo44499c();
    }

    /* renamed from: a */
    private void m115500a(C17160a aVar) throws IOException {
        C6921a.m21562b("youtube-debug", "Fetching YouTube Data API");
        C17164a aVar2 = (C17164a) ((C17172h) aVar.mo44435e().mo44444a("id,snippet").mo44445a(Boolean.valueOf(true)).mo44507c()).items.get(0);
        this.f93737k = aVar2.f47896id;
        this.f93738l = aVar2.snippet.title;
    }

    /* renamed from: a */
    private void m115501a(String str) {
        try {
            C17218d b = m115502b(str);
            this.f93741o.mo44484a(b.accessToken);
            this.f93741o.mo44487b(b.expiresInSeconds);
            this.f93741o.mo44488b(b.refreshToken);
            m115500a(new C17161a(this.f93730d, this.f93731e, this.f93741o).mo44442f(this.f93733g.getResources().getString(R.string.bf7)).mo44436a());
        } catch (Exception unused) {
            this.f93732f.mo90626b(this.f93742p);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.obj
            boolean r0 = r0 instanceof java.lang.Exception
            if (r0 != 0) goto L_0x0087
            java.lang.Object r0 = r5.obj
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r5.obj
            boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.profile.UserResponse
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r5.obj
            com.ss.android.ugc.aweme.profile.UserResponse r0 = (com.p280ss.android.ugc.aweme.profile.UserResponse) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            goto L_0x001d
        L_0x0019:
            java.lang.Object r0 = r5.obj
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.p280ss.android.ugc.aweme.profile.model.User) r0
        L_0x001d:
            int r5 = r5.what
            r1 = 112(0x70, float:1.57E-43)
            if (r5 != r1) goto L_0x0087
            if (r0 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            r5.updateCurUser(r0)
            com.ss.android.ugc.aweme.base.c.c r5 = new com.ss.android.ugc.aweme.base.c.c
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            r5.<init>(r1)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r5)
            r5 = 1
            boolean r1 = r4.f93742p
            if (r1 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.profile.edit.d r1 = r4.f93732f
            java.lang.String r2 = r0.getYoutubeChannelTitle()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0052
            java.lang.String r0 = r0.getGoogleAccount()
            goto L_0x0056
        L_0x0052:
            java.lang.String r0 = r0.getYoutubeChannelTitle()
        L_0x0056:
            r1.mo90627e(r0)
            java.lang.String r0 = "social_account_bind_success"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "platform"
            java.lang.String r3 = "youtube"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            goto L_0x0088
        L_0x006d:
            com.ss.android.ugc.aweme.profile.edit.d r0 = r4.f93732f
            r1 = 0
            r0.mo90627e(r1)
            java.lang.String r0 = "social_account_unbind_success"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "platform"
            java.lang.String r3 = "youtube"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            goto L_0x0088
        L_0x0087:
            r5 = 0
        L_0x0088:
            if (r5 != 0) goto L_0x0091
            com.ss.android.ugc.aweme.profile.edit.d r5 = r4.f93732f
            boolean r0 = r4.f93742p
            r5.mo90626b(r0)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.edit.C35759g.handleMsg(android.os.Message):void");
    }

    /* renamed from: a */
    public final void mo90624a(Intent intent) {
        C14975c a = C14941a.f38654h.mo38098a(intent);
        if (a == null || !a.mo38102b()) {
            StringBuilder sb = new StringBuilder("onActivityResult failed, GoogleSignInResult: ");
            sb.append(a);
            C6921a.m21562b("youtube-debug", sb.toString());
            if (a != null) {
                Status a2 = a.mo38101a();
                StringBuilder sb2 = new StringBuilder("onActivityResult, statusCode: ");
                sb2.append(a2.f38874g);
                sb2.append(", statusMessage");
                sb2.append(a2.f38875h);
                C6921a.m21562b("youtube-debug", sb2.toString());
            }
            this.f93732f.mo90626b(true);
            return;
        }
        GoogleSignInAccount googleSignInAccount = a.f38812a;
        if (googleSignInAccount == null) {
            C6921a.m21562b("youtube-debug", "onActivityResult failed, GoogleSignInAccount is null");
            this.f93732f.mo90626b(true);
            return;
        }
        this.f93735i = googleSignInAccount.f38763a;
        this.f93736j = googleSignInAccount.f38766d;
        C43173w.m136929b(new C35762j(this, googleSignInAccount));
    }

    public C35759g(FragmentActivity fragmentActivity, C35756d dVar) {
        this.f93733g = fragmentActivity;
        this.f93732f = dVar;
        this.f93734h = new C6309f(this);
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(fragmentActivity) == 0) {
            this.f93739m = new C14972a(GoogleSignInOptions.f38788f).mo38089a(new Scope("https://www.googleapis.com/auth/youtube"), new Scope[0]).mo38091a("340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com", C36764v.m118500a()).mo38090a("340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com").mo38094d();
            this.f93740n = new C15038a(fragmentActivity).mo38251a(fragmentActivity, (C15040c) this).mo38253a(C14941a.f38651e, this.f93739m).mo38256a();
            this.f93741o = new C17217a().mo44493a(this.f93730d).mo44494a(this.f93731e).mo44513a("340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com", f93729c).mo44514a();
        }
    }
}
