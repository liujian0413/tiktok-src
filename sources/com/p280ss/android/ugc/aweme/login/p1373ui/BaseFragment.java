package com.p280ss.android.ugc.aweme.login.p1373ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.mobilelib.present.CommonPresent;
import com.p280ss.android.mobilelib.view.CommonView;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33603c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.login.ui.BaseFragment */
public abstract class BaseFragment<T extends CommonPresent> extends AmeBaseFragment implements CommonView {

    /* renamed from: e */
    protected C33603c f85175e = new C33603c("login");

    /* renamed from: f */
    public View f85176f;

    /* renamed from: g */
    protected T f85177g;

    /* renamed from: h */
    protected String f85178h;

    /* renamed from: i */
    protected String f85179i;

    /* renamed from: j */
    private boolean f85180j = false;

    /* renamed from: k */
    private ProgressDialog f85181k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo84129a();

    /* renamed from: d */
    private void m105801d() {
        if (this.f85177g != null) {
            this.f85177g.destroy();
            this.f85177g = null;
        }
    }

    public void onDestroyView() {
        this.f85181k = null;
        m105801d();
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84130a(View view) {
        if (getActivity() != null) {
            ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            this.f85177g = mo84129a();
        } catch (IllegalStateException unused) {
        }
        if (this.f85176f != null) {
            this.f85176f.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    try {
                        BaseFragment.this.mo84130a(BaseFragment.this.f85176f);
                        BaseFragment.this.getActivity().onBackPressed();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f85178h = getArguments().getString("enter_from");
            this.f85179i = getArguments().getString("enter_method");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view != null) {
            this.f85176f = view.findViewById(R.id.ayu);
        }
    }
}
