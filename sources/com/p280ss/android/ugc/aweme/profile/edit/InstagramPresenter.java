package com.p280ss.android.ugc.aweme.profile.edit;

import android.net.Uri;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12196a;
import com.bytedance.lobby.auth.C12198c;
import com.bytedance.lobby.auth.C12198c.C12200a;
import com.bytedance.lobby.internal.C12222c;
import com.bytedance.lobby.internal.C12226d;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.InstagramPresenter */
public final class InstagramPresenter implements C6310a, C12196a {

    /* renamed from: a */
    private static final boolean f93708a = C7163a.m22363a();

    /* renamed from: b */
    private static final String f93709b;

    /* renamed from: c */
    private C35748a f93710c;

    /* renamed from: d */
    private FragmentActivity f93711d;

    /* renamed from: e */
    private C6309f f93712e;

    /* renamed from: f */
    private IAccountUserService f93713f;

    /* renamed from: g */
    private InstagramApi f93714g = ((InstagramApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(InstagramApi.class));

    /* renamed from: h */
    private boolean f93715h;

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.InstagramPresenter$InstagramApi */
    public interface InstagramApi {
        @C6456g
        @C6468s
        C18253l<String> doPost(@C6450ac String str, @C6455f Map<String, String> map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo90607c() {
        this.f93710c.mo90609c(null);
    }

    /* renamed from: b */
    public final void mo90606b() {
        this.f93715h = false;
        this.f93713f.updateInsId(this.f93712e, "", 0);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/instagram/bind/");
        f93709b = sb.toString();
    }

    /* renamed from: a */
    public final void mo90604a() {
        this.f93715h = true;
        C12198c a = new C12200a(this.f93711d).mo29933a("instagram").mo29932a((C12196a) this).mo29934a();
        C12222c.m35539a();
        C12226d.m35547a(a);
    }

    /* renamed from: c */
    private void m115478c(String str) {
        if (this.f93715h) {
            C6907h.m21524a("social_account_bind_failure", (Map) C22984d.m75611a().mo59973a("platform", "instagram").mo59973a("error_desc", str).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo29929a(AuthResult authResult) {
        String str;
        if (!authResult.f32438a) {
            this.f93710c.mo90609c(null);
            if (authResult.f32440c != null) {
                str = authResult.f32440c.getMessage();
            } else {
                str = "Lobby failed and no error info available";
            }
            m115478c(str);
            return;
        }
        String string = authResult.f32447j.getString("code");
        if (!TextUtils.isEmpty(string)) {
            C43173w.m136929b(new C35758f(this, string));
            return;
        }
        this.f93710c.mo90609c(null);
        m115478c("Authorization code is missing");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo90605a(String str) {
        String str2;
        this.f93715h = true;
        boolean z = false;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Uri.encode(str));
            String str3 = (String) this.f93714g.doPost(f93709b, hashMap).get();
            if (!TextUtils.isEmpty(str3)) {
                String string = new JSONObject(str3).getString("status_code");
                if (TextUtils.equals(string, "0")) {
                    this.f93713f.queryUser(this.f93712e);
                    str2 = null;
                    z = true;
                } else {
                    StringBuilder sb = new StringBuilder("Failure response, status: ");
                    sb.append(string);
                    str2 = sb.toString();
                }
            } else {
                str2 = "Empty response";
            }
        } catch (Exception e) {
            str2 = e.getMessage();
        }
        if (!z) {
            m115478c(str2);
            C43173w.m136924a((Runnable) new C35757e(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.obj
            boolean r0 = r0 instanceof java.lang.Exception
            r1 = 1
            if (r0 != 0) goto L_0x0076
            java.lang.Object r0 = r5.obj
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r5.obj
            boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.profile.UserResponse
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r5.obj
            com.ss.android.ugc.aweme.profile.UserResponse r0 = (com.p280ss.android.ugc.aweme.profile.UserResponse) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            goto L_0x001e
        L_0x001a:
            java.lang.Object r0 = r5.obj
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.p280ss.android.ugc.aweme.profile.model.User) r0
        L_0x001e:
            com.ss.android.ugc.aweme.profile.edit.a r2 = r4.f93710c
            java.lang.String r3 = r0.getInsId()
            r2.mo90609c(r3)
            int r2 = r5.what
            r3 = 6
            if (r2 != r3) goto L_0x0057
            com.ss.android.ugc.aweme.IAccountUserService r5 = r4.f93713f
            java.lang.String r0 = r0.getInsId()
            r5.updateInsId(r0)
            com.ss.android.ugc.aweme.base.c.c r5 = new com.ss.android.ugc.aweme.base.c.c
            com.ss.android.ugc.aweme.IAccountUserService r0 = r4.f93713f
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            r5.<init>(r0)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r5)
            java.lang.String r5 = "social_account_unbind_success"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "platform"
            java.lang.String r3 = "instagram"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r5, r0)
            goto L_0x0077
        L_0x0057:
            int r5 = r5.what
            r2 = 112(0x70, float:1.57E-43)
            if (r5 != r2) goto L_0x0076
            com.ss.android.ugc.aweme.IAccountUserService r5 = r4.f93713f
            r5.updateCurUser(r0)
            java.lang.String r5 = "social_account_bind_success"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "platform"
            java.lang.String r3 = "instagram"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r5, r0)
            goto L_0x0077
        L_0x0076:
            r1 = 0
        L_0x0077:
            if (r1 != 0) goto L_0x0084
            java.lang.String r5 = "Failed to retrieve data from TikTok server"
            r4.m115478c(r5)
            com.ss.android.ugc.aweme.profile.edit.a r5 = r4.f93710c
            r0 = 0
            r5.mo90609c(r0)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.edit.InstagramPresenter.handleMsg(android.os.Message):void");
    }

    public InstagramPresenter(FragmentActivity fragmentActivity, C35748a aVar) {
        this.f93711d = fragmentActivity;
        this.f93710c = aVar;
        this.f93712e = new C6309f(this);
        this.f93713f = C6861a.m21337f();
    }
}
