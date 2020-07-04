package com.p280ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.account.C6861a;

/* renamed from: com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent */
public abstract class BaseLoginActivityComponent implements C0042h, C23304f {
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
    }

    /* renamed from: b */
    private void m76445b() {
        mo60579a(C6405d.m19984g(), "", "", (Bundle) null, (C23305g) null);
    }

    public final void bo_() {
        C6861a.m21333b().openPrivacyPolicy(C6405d.m19984g());
    }

    /* renamed from: a */
    public final void mo60581a(String str) {
        m76445b();
    }

    /* renamed from: a */
    public void mo60579a(Activity activity, String str, String str2, Bundle bundle, C23305g gVar) {
        if (activity instanceof C0043i) {
            ((C0043i) activity).getLifecycle().mo55a(this);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }

    /* renamed from: a */
    public void mo60580a(Fragment fragment, String str, String str2, Bundle bundle, C23305g gVar) {
        fragment.getLifecycle().mo55a(this);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }
}
