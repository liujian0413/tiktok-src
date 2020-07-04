package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21336m;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21869g;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.p951l.C21237a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusLoginFragment */
public abstract class BaseMusLoginFragment extends AmeBaseFragment implements C21336m {

    /* renamed from: i */
    protected static int f57404i;

    /* renamed from: q */
    private static int f57405q;

    /* renamed from: e */
    protected View f57406e;

    /* renamed from: f */
    protected View f57407f;

    /* renamed from: g */
    protected Dialog f57408g;

    /* renamed from: h */
    public C21524n f57409h;

    /* renamed from: j */
    protected int f57410j = 1;

    /* renamed from: k */
    protected String f57411k;

    /* renamed from: l */
    protected String f57412l;

    /* renamed from: m */
    protected String f57413m;

    /* renamed from: n */
    private boolean f57414n;

    /* renamed from: o */
    private InputCaptchaFragment f57415o;

    /* renamed from: p */
    private Handler f57416p;

    /* renamed from: r */
    private OnGlobalLayoutListener f57417r;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo57505b(boolean z) {
    }

    /* renamed from: f */
    public final void mo57510f() {
        m71871a(getContext());
    }

    /* renamed from: c */
    public final void mo57355c() {
        if (this.f57415o != null) {
            this.f57415o.mo58195a();
            this.f57415o = null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f57416p != null) {
            this.f57416p.removeCallbacksAndMessages(null);
            this.f57416p = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo57508d() {
        if (getActivity() != null) {
            try {
                KeyboardUtils.m77057c(this.f57406e);
                getActivity().onBackPressed();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public final MusLoginManager mo57509e() {
        if (this.f57409h == null) {
            return new MusLoginManager();
        }
        return this.f57409h.mo57190a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo57511g() {
        if (getArguments() != null) {
            return getArguments().getString("ENTER_REASON");
        }
        return null;
    }

    public void onStart() {
        super.onStart();
        if (getView() != null) {
            getView().getViewTreeObserver().addOnGlobalLayoutListener(this.f57417r);
        }
    }

    public void onStop() {
        super.onStop();
        if (getView() != null && getView().getViewTreeObserver() != null && getView().getViewTreeObserver().isAlive() && this.f57417r != null) {
            getView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f57417r);
        }
    }

    /* renamed from: a */
    private static void m71871a(Context context) {
        C21237a.m71490a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo57504b(View view) {
        if (isViewValid()) {
            getActivity().finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57500a(final View view) {
        if (!this.f57414n) {
            final OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new OnFocusChangeListener() {
                public final void onFocusChange(View view, boolean z) {
                    view.post(new Runnable() {
                        public final void run() {
                            if (BaseMusLoginFragment.this.getActivity() != null && BaseMusLoginFragment.this.isViewValid()) {
                                ((InputMethodManager) BaseMusLoginFragment.this.getActivity().getSystemService("input_method")).showSoftInput(view, 1);
                            }
                        }
                    });
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(view, z);
                    }
                }
            });
            view.post(new Runnable() {
                public final void run() {
                    view.requestFocus();
                }
            });
            this.f57414n = true;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f57406e != null) {
            this.f57406e.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    BaseMusLoginFragment.this.mo57508d();
                }
            });
        }
        if (this.f57407f != null) {
            this.f57407f.setOnClickListener(new C21513c(this));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f57409h == getActivity()) {
            bundle.putBoolean("iticklistener_value_equal_activity", true);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null && bundle.getBoolean("iticklistener_value_equal_activity", false)) {
            this.f57409h = (C21524n) getActivity();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57498a(int i) {
        if (isViewValid() && getContext() != null) {
            if (i > f57405q) {
                if (this.f57410j != 0) {
                    this.f57410j = 0;
                    mo57505b(true);
                }
            } else if (this.f57410j != 1) {
                this.f57410j = 1;
                mo57505b(false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo57507c(View view) {
        if (isViewValid() && getContext() != null && this.f57416p != null) {
            int height = view.getRootView().getHeight() - view.getHeight();
            this.f57416p.removeCallbacksAndMessages(null);
            this.f57416p.post(new C21514d(this, height));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57416p = new Handler();
        f57405q = (int) C9738o.m28708b(getContext(), 150.0f);
        f57404i = (int) C9738o.m28708b(getContext(), 20.0f);
        if (getArguments() != null) {
            this.f57411k = getArguments().getString("enter_from");
            this.f57412l = getArguments().getString("enter_method");
            this.f57413m = getArguments().getString("enter_type");
        }
    }

    /* renamed from: a */
    public void mo57501a(C21524n nVar) {
        this.f57409h = nVar;
    }

    /* renamed from: a */
    public void mo57502a(boolean z) {
        if (getContext() != null) {
            if (this.f57408g == null) {
                this.f57408g = new C21869g(getContext());
            }
            if (!z || this.f57408g.isShowing()) {
                if (!z && this.f57408g.isShowing()) {
                    C21515e.m72199a(this.f57408g);
                }
                return;
            }
            this.f57408g.show();
        }
    }

    /* renamed from: a */
    public static void m71873a(JSONObject jSONObject, C12898b bVar) {
        C21671bd.m72526a(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo57503b(Fragment fragment, boolean z) {
        if (getActivity() != null && (getActivity() instanceof C21524n)) {
            if (this.f57409h == null) {
                this.f57409h = (C21524n) getActivity();
            }
            this.f57409h.mo57194a(fragment, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo57506c(Fragment fragment, boolean z) {
        if (getActivity() != null && (getActivity() instanceof C21524n)) {
            if (this.f57409h == null) {
                this.f57409h = (C21524n) getActivity();
            }
            this.f57409h.mo57202c(fragment, false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view != null) {
            this.f57406e = view.findViewById(R.id.b6a);
            this.f57407f = view.findViewById(R.id.e77);
            view.setOnClickListener(new C21491a(view));
            this.f57417r = new C21512b(this, view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57499a(Fragment fragment, boolean z) {
        if (getActivity() != null && (getActivity() instanceof C21524n)) {
            if (this.f57409h == null) {
                this.f57409h = (C21524n) getActivity();
            }
            this.f57409h.mo57198b(fragment, false);
        }
    }

    /* renamed from: a */
    public final void mo57354a(String str, String str2, int i, C21823a aVar) {
        if (getActivity() != null) {
            getActivity().getSupportFragmentManager().mo2654b();
            if (this.f57415o == null) {
                this.f57415o = InputCaptchaFragment.m72938a(str, i, aVar);
                C0633q a = getActivity().getSupportFragmentManager().mo2645a();
                a.mo2588a((Fragment) this.f57415o, "captcha");
                a.mo2606d();
            } else if (getActivity().getSupportFragmentManager().mo2644a("captcha") == null && !this.f57415o.isAdded()) {
                this.f57415o.mo58196a(getActivity().getSupportFragmentManager(), "captcha");
                this.f57415o.f58411d = aVar;
            }
            this.f57415o.mo58197a(str, str2, i);
        }
    }
}
