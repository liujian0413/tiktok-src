package com.p280ss.android.ugc.aweme.login.component;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.IAccountService.C21082f;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.component.BaseLoginActivityComponent;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.login.C32654d.C32655a;
import com.p280ss.android.ugc.aweme.login.p1371a.C32647c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.trill.app.p1758a.C44982a;
import com.p280ss.android.ugc.trill.app.p1758a.C44983b;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.login.component.MLoginActivityComponent */
public class MLoginActivityComponent extends BaseLoginActivityComponent implements C6892b<Boolean>, C32655a {

    /* renamed from: a */
    public Activity f85109a;

    /* renamed from: b */
    public Fragment f85110b;

    /* renamed from: c */
    public C23305g f85111c;

    /* renamed from: d */
    public Bundle f85112d;

    /* renamed from: e */
    public String f85113e;

    /* renamed from: f */
    public String f85114f;

    /* renamed from: g */
    private Handler f85115g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private Runnable f85116h = new Runnable() {
        public final void run() {
            Activity activity;
            if (MLoginActivityComponent.this.f85109a != null || (MLoginActivityComponent.this.f85110b != null && MLoginActivityComponent.this.f85110b.getActivity() != null)) {
                if (MLoginActivityComponent.this.f85109a == null) {
                    activity = MLoginActivityComponent.this.f85110b.getActivity();
                } else {
                    activity = MLoginActivityComponent.this.f85109a;
                }
                C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a(activity).mo56864a(MLoginActivityComponent.this.f85113e).mo56866b(MLoginActivityComponent.this.f85114f).mo56861a(MLoginActivityComponent.this.f85112d).mo56863a((C21083g) new C44983b(MLoginActivityComponent.this.f85111c)).mo56862a((C21082f) new C44982a(MLoginActivityComponent.this.f85109a)).mo56859a());
            }
        }
    };

    /* renamed from: a */
    public final void mo84100a() {
        this.f85109a = null;
        this.f85110b = null;
        this.f85112d = null;
    }

    public void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
        this.f85109a = null;
        this.f85110b = null;
        this.f85112d = null;
        this.f85111c = null;
    }

    @C7709l
    public void onLoginPageCloseEvent(C32647c cVar) {
        if (!C6861a.m21337f().isLogin() && this.f85111c != null) {
            this.f85111c.mo58664a(null);
        }
        this.f85111c = null;
        C42961az.m136383d(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void run(Boolean bool) {
        Activity activity;
        if (this.f85109a != null || (this.f85110b != null && this.f85110b.getActivity() != null)) {
            if (this.f85109a == null) {
                activity = this.f85110b.getActivity();
            } else {
                activity = this.f85109a;
            }
            if (bool != null && !bool.booleanValue() && activity != null && !activity.isFinishing() && this.f85115g != null) {
                this.f85115g.removeCallbacks(this.f85116h);
                this.f85115g.post(this.f85116h);
            }
        }
    }

    /* renamed from: a */
    public final void mo60579a(Activity activity, String str, String str2, Bundle bundle, C23305g gVar) {
        if (activity != null && !activity.isFinishing()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            super.mo60579a(activity, str, str2, bundle, gVar);
            C42961az.m136382c(this);
            this.f85110b = null;
            this.f85109a = activity;
            this.f85112d = bundle;
            this.f85113e = str;
            this.f85114f = str2;
            this.f85111c = gVar;
            this.f85115g.removeCallbacks(this.f85116h);
            this.f85115g.post(this.f85116h);
        }
    }

    /* renamed from: a */
    public final void mo60580a(Fragment fragment, String str, String str2, Bundle bundle, C23305g gVar) {
        if (fragment != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            super.mo60580a(fragment, str, str2, bundle, gVar);
            C42961az.m136382c(this);
            this.f85110b = fragment;
            this.f85109a = fragment.getActivity();
            this.f85112d = bundle;
            this.f85113e = str;
            this.f85114f = str2;
            this.f85111c = gVar;
            this.f85115g.removeCallbacks(this.f85116h);
            this.f85115g.post(this.f85116h);
        }
    }
}
