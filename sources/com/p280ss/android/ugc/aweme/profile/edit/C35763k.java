package com.p280ss.android.ugc.aweme.profile.edit;

import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12196a;
import com.bytedance.lobby.auth.C12198c;
import com.bytedance.lobby.auth.C12198c.C12200a;
import com.bytedance.lobby.internal.C12226d;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.edit.api.C35750a;
import com.p280ss.android.ugc.aweme.profile.edit.api.C35750a.C35752a;
import com.p280ss.android.ugc.aweme.profile.edit.api.TwitterApi;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.p280ss.android.ugc.trill.main.login.C45047a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.k */
public final class C35763k implements C6310a, C12196a {

    /* renamed from: d */
    private static final boolean f93747d = C7163a.m22363a();

    /* renamed from: a */
    public C35753b f93748a;

    /* renamed from: b */
    public FragmentActivity f93749b;

    /* renamed from: c */
    public C6309f f93750c = new C6309f(this);

    /* renamed from: e */
    private boolean f93751e;

    /* renamed from: a */
    public final void mo90634a() {
        this.f93751e = true;
        C12198c a = new C12200a(this.f93749b).mo29933a("twitter").mo29932a((C12196a) this).mo29934a();
        C12226d.m35546a();
        C12226d.m35547a(a);
    }

    /* renamed from: b */
    public final void mo90637b() {
        this.f93751e = false;
        C35750a.m115489a(new C35752a() {
            /* renamed from: a */
            public final String mo90618a() throws Exception {
                return TwitterApi.m115485a();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final /* synthetic */ void mo90639d() {
                C35763k.this.f93748a.mo90621b();
            }

            /* renamed from: b */
            public final void mo90619b() {
                C6861a.m21337f().queryUser(C35763k.this.f93750c);
            }

            /* renamed from: c */
            public final void mo90620c() {
                C35763k.this.f93749b.runOnUiThread(new C35768n(this));
            }
        });
    }

    /* renamed from: a */
    public final void mo90635a(String str) {
        if (this.f93751e) {
            C6907h.m21524a("social_account_bind_failure", (Map) C22984d.m75611a().mo59973a("platform", "twitter").mo59973a("error_desc", str).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo29929a(AuthResult authResult) {
        String str;
        if (authResult.f32438a) {
            C43173w.m136929b(new C35766l(this, authResult.f32442e, authResult.f32447j.getString("username")));
            return;
        }
        LobbyException lobbyException = authResult.f32440c;
        if (authResult.f32440c != null) {
            str = authResult.f32440c.getMessage();
        } else {
            str = "";
        }
        if (lobbyException != null && !TextUtils.equals(str, "Authorization failed, request was canceled.") && !TextUtils.equals(str, "Failed to get authorization, bundle incomplete")) {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : lobbyException.getStackTrace()) {
                sb.append(stackTraceElement.toString());
            }
            sb.append(lobbyException.getMessage());
            C45047a.m142092a(sb.toString(), "twitter");
            C6921a.m21559a((Throwable) lobbyException);
            mo90635a(lobbyException.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.obj
            boolean r0 = r0 instanceof java.lang.Exception
            r1 = 0
            if (r0 != 0) goto L_0x006b
            java.lang.Object r0 = r6.obj
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r6.obj
            boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.profile.UserResponse
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r6.obj
            com.ss.android.ugc.aweme.profile.UserResponse r0 = (com.p280ss.android.ugc.aweme.profile.UserResponse) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            goto L_0x001e
        L_0x001a:
            java.lang.Object r0 = r6.obj
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.p280ss.android.ugc.aweme.profile.model.User) r0
        L_0x001e:
            int r6 = r6.what
            r2 = 112(0x70, float:1.57E-43)
            if (r6 != r2) goto L_0x006b
            r6 = 1
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            r2.updateCurUser(r0)
            boolean r2 = r5.f93751e
            if (r2 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.profile.edit.b r2 = r5.f93748a
            java.lang.String r0 = r0.getTwitterName()
            r2.mo90622d(r0)
            java.lang.String r0 = "social_account_bind_success"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "platform"
            java.lang.String r4 = "twitter"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r2)
            goto L_0x0065
        L_0x004d:
            com.ss.android.ugc.aweme.profile.edit.b r0 = r5.f93748a
            r0.mo90622d(r1)
            java.lang.String r0 = "social_account_unbind_success"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "platform"
            java.lang.String r4 = "twitter"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r2)
        L_0x0065:
            java.lang.String r0 = "twitter"
            com.p280ss.android.ugc.trill.main.login.C45047a.m142091a(r0)
            goto L_0x006c
        L_0x006b:
            r6 = 0
        L_0x006c:
            if (r6 != 0) goto L_0x0078
            java.lang.String r6 = "Failed to retrieve data from TikTok server"
            r5.mo90635a(r6)
            com.ss.android.ugc.aweme.profile.edit.b r6 = r5.f93748a
            r6.mo90622d(r1)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.edit.C35763k.handleMsg(android.os.Message):void");
    }

    public C35763k(FragmentActivity fragmentActivity, C35753b bVar) {
        this.f93748a = bVar;
        this.f93749b = fragmentActivity;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo90636a(final String str, final String str2) {
        this.f93751e = true;
        C35750a.m115489a(new C35752a() {
            /* renamed from: a */
            public final String mo90618a() throws Exception {
                return TwitterApi.m115486a(str, str2);
            }

            /* renamed from: b */
            public final void mo90619b() {
                C6861a.m21337f().queryUser(C35763k.this.f93750c);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final /* synthetic */ void mo90638d() {
                C35763k.this.f93748a.mo90622d(null);
            }

            /* renamed from: c */
            public final void mo90620c() {
                C35763k.this.mo90635a("Failed to store data to TikTok server");
                C35763k.this.f93749b.runOnUiThread(new C35767m(this));
            }
        });
    }
}
