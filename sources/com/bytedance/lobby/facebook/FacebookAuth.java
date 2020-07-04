package com.bytedance.lobby.facebook;

import android.arch.lifecycle.C0069x;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.lobby.C12191a;
import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.LobbyException;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.AuthResult.C12195a;
import com.bytedance.lobby.auth.C12197b;
import com.bytedance.lobby.auth.C12201d;
import com.bytedance.lobby.auth.C12202e;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.facebook.AccessToken;
import com.facebook.C13447e;
import com.facebook.C13447e.C13448a;
import com.facebook.C13498g;
import com.facebook.FacebookException;
import com.facebook.login.C14102d;
import com.facebook.login.LoginManager;

public class FacebookAuth extends FacebookProvider<AuthResult> implements C12201d, C13498g<C14102d> {

    /* renamed from: c */
    private static final boolean f32474c = C12191a.f32435a;

    /* renamed from: d */
    private C13447e f32475d;

    /* renamed from: e */
    private LobbyViewModel f32476e;

    /* renamed from: f */
    private C12214a f32477f;

    /* renamed from: c */
    public final String mo29940c() {
        return C12202e.m35475a(this);
    }

    /* renamed from: b */
    public final String mo29938b() {
        if (AccessToken.m38225a() != null) {
            return AccessToken.m38225a().f34627e;
        }
        return null;
    }

    /* renamed from: n_ */
    public final void mo29948n_() {
        this.f32476e.mo29956b(new C12195a("facebook", 1).mo29925a(false).mo29923a(new LobbyException(4, "Facebook login cancelled")).mo29926a());
    }

    /* renamed from: a */
    public final void mo29935a() {
        if (this.f32477f != null) {
            this.f32477f.mo33835a(this.f32475d);
            this.f32477f.onDetachedFromWindow();
        }
    }

    public FacebookAuth(C12203b bVar) {
        super(LobbyCore.getApplication(), bVar);
    }

    /* renamed from: a */
    private static String m35482a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("fb_read_permissions");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return "public_profile";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29947a(C14102d dVar) {
        this.f32476e.mo29956b(new C12195a("facebook", 1).mo29925a(true).mo29927b(dVar.f37252a.f34627e).mo29921a(dVar.f37252a.f34623a.getTime()).mo29924a(dVar.f37252a.f34631i).mo29926a());
    }

    /* renamed from: a */
    public final void mo29946a(FacebookException facebookException) {
        this.f32476e.mo29956b(new C12195a("facebook", 1).mo29925a(false).mo29923a(new LobbyException(facebookException)).mo29926a());
    }

    /* renamed from: b */
    public final void mo29939b(FragmentActivity fragmentActivity, Bundle bundle) {
        C12197b.m35462a(this.f32476e, this.f32494b.f32466b);
    }

    /* renamed from: a */
    public final void mo29937a(FragmentActivity fragmentActivity, Bundle bundle) {
        this.f32476e = (LobbyViewModel) C0069x.m159a(fragmentActivity).mo147a(LobbyViewModel.class);
        if (!mo29951d()) {
            C12197b.m35463a(this.f32476e, "facebook", 1);
            return;
        }
        this.f32475d = C13448a.m39515a();
        LoginManager.m41580a().mo33805a(this.f32475d, (C13498g<C14102d>) this);
        String a = m35482a(bundle);
        this.f32477f = new C12214a(fragmentActivity);
        this.f32477f.setReadPermissions(a);
        this.f32477f.mo33836a(this.f32475d, this);
        if (AccessToken.m38225a() != null) {
            LoginManager.m41580a().mo33808b();
        }
        this.f32477f.performClick();
    }

    /* renamed from: a */
    public final void mo29936a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        if (this.f32475d != null) {
            this.f32475d.mo32944a(i, i2, intent);
            return;
        }
        this.f32476e.mo29956b(new C12195a("facebook", 1).mo29925a(false).mo29923a(new LobbyException(3, "Facebook CallbackManager is null")).mo29926a());
    }
}
