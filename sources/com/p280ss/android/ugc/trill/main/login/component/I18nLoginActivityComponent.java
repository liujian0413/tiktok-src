package com.p280ss.android.ugc.trill.main.login.component;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.IAccountService.C21082f;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.component.BaseLoginActivityComponent;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.trill.app.p1758a.C44982a;
import com.p280ss.android.ugc.trill.app.p1758a.C44983b;

/* renamed from: com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent */
public class I18nLoginActivityComponent extends BaseLoginActivityComponent {
    /* renamed from: a */
    public final void mo60579a(Activity activity, String str, String str2, Bundle bundle, C23305g gVar) {
        if (activity != null && !activity.isFinishing()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            super.mo60579a(activity, str, str2, bundle, gVar);
            m142097b(activity, str, str2, bundle, gVar);
        }
    }

    /* renamed from: b */
    private static void m142097b(Activity activity, String str, String str2, Bundle bundle, C23305g gVar) {
        C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a(activity).mo56861a(bundle).mo56864a(str).mo56866b(str2).mo56863a((C21083g) new C44983b(gVar)).mo56862a((C21082f) new C44982a(activity)).mo56859a());
    }

    /* renamed from: a */
    public final void mo60580a(Fragment fragment, String str, String str2, Bundle bundle, C23305g gVar) {
        if (fragment != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            super.mo60580a(fragment, str, str2, bundle, gVar);
            m142097b(fragment.getActivity(), str, str2, bundle, gVar);
        }
    }
}
