package com.p280ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.account.C21164d.C21165a;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.profile.api.C35731g;
import com.p280ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

/* renamed from: com.ss.android.ugc.aweme.initializer.a */
public final class C32121a implements C21164d {
    /* renamed from: a */
    public final boolean mo57088a() {
        return C43122ff.m136767b();
    }

    /* renamed from: b */
    public final boolean mo57089b() {
        return TimeLockRuler.isTeenModeON();
    }

    /* renamed from: f */
    private static IUserService m104314f() {
        return (IUserService) ServiceManager.get().getService(IUserService.class);
    }

    /* renamed from: c */
    public final boolean mo57090c() {
        return m104314f().isLogin();
    }

    /* renamed from: d */
    public final String mo57091d() {
        return m104314f().getCurrentUserID();
    }

    /* renamed from: e */
    public final C22200c mo57092e() {
        User currentUser = m104314f().getCurrentUser();
        if (currentUser != null) {
            return new C32132j(currentUser);
        }
        return null;
    }

    /* renamed from: a */
    public final C22200c mo57084a(String str) throws Exception {
        if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
            return new C32132j(C35731g.m115439a(C35731g.m115449b((String) null, str, 0), false, (String) null));
        }
        return new C32132j(C35731g.m115439a(C35731g.m115448b(str), false, (String) null));
    }

    /* renamed from: a */
    public final void mo57087a(boolean z) {
        m104314f().setIsOldUser(true);
    }

    /* renamed from: a */
    public final void mo57085a(Activity activity, String str, String str2, Bundle bundle, final C21165a aVar) {
        C32656f.m105744a(activity, str, str2, bundle, (C23305g) new C23305g() {
            /* renamed from: a */
            public final void mo58663a() {
                if (aVar != null) {
                    aVar.mo57093a();
                }
            }

            /* renamed from: a */
            public final void mo58664a(Bundle bundle) {
                if (aVar != null) {
                    aVar.mo57094b();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo57086a(Fragment fragment, String str, String str2, Bundle bundle, final C21165a aVar) {
        C32656f.m105748a(fragment, str, str2, bundle, (C23305g) new C23305g() {
            /* renamed from: a */
            public final void mo58663a() {
                if (aVar != null) {
                    aVar.mo57093a();
                }
            }

            /* renamed from: a */
            public final void mo58664a(Bundle bundle) {
                if (aVar != null) {
                    aVar.mo57094b();
                }
            }
        });
    }
}
