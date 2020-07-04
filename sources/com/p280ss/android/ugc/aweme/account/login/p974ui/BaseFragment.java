package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.mobilelib.present.CommonPresent;
import com.p280ss.android.mobilelib.view.CommonView;
import com.p280ss.android.ugc.aweme.account.log.C21252c;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21336m;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BaseFragment */
public abstract class BaseFragment<T extends CommonPresent> extends AmeBaseFragment implements CommonView, C21336m {

    /* renamed from: e */
    private InputCaptchaFragment f58301e;

    /* renamed from: f */
    public View f58302f;

    /* renamed from: g */
    protected T f58303g;

    /* renamed from: h */
    public String f58304h;

    /* renamed from: i */
    public String f58305i;

    /* renamed from: j */
    protected String f58306j;

    /* renamed from: k */
    protected String f58307k;

    /* renamed from: l */
    private boolean f58308l;

    /* renamed from: m */
    private ProgressDialog f58309m;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return false;
    }

    public void beforeHandleRequest() {
        mo58128f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract T mo58129g();

    public void afterHandleRequest() {
        mo57105a();
        mo57355c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final LoginOrRegisterActivity mo58130i() {
        return (LoginOrRegisterActivity) getActivity();
    }

    /* renamed from: c */
    public final void mo57355c() {
        if (this.f58301e != null) {
            this.f58301e.dismiss();
            this.f58301e = null;
        }
    }

    /* renamed from: e */
    public final void mo58127e() {
        if (this.f58303g != null) {
            this.f58303g.destroy();
            this.f58303g = null;
        }
    }

    public void onDestroyView() {
        this.f58309m = null;
        mo58127e();
        super.onDestroyView();
    }

    /* renamed from: a */
    private void mo57105a() {
        if (this.f58309m != null && this.f58309m.isShowing()) {
            this.f58309m.dismiss();
        }
    }

    /* renamed from: f */
    public final ProgressDialog mo58128f() {
        if (this.f58309m == null) {
            this.f58309m = C22347v.m73995b(getActivity());
            this.f58309m.setMessage(getString(R.string.c_o));
            this.f58309m.setCanceledOnTouchOutside(false);
        }
        if (!this.f58309m.isShowing()) {
            this.f58309m.show();
        }
        return this.f58309m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo58126b(final View view) {
        if (!this.f58308l) {
            final OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new OnFocusChangeListener() {
                public final void onFocusChange(View view, boolean z) {
                    view.post(new Runnable() {
                        public final void run() {
                            if (BaseFragment.this.getActivity() != null && BaseFragment.this.isViewValid()) {
                                ((InputMethodManager) BaseFragment.this.getActivity().getSystemService("input_method")).showSoftInput(view, 1);
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
            this.f58308l = true;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            this.f58303g = mo58129g();
        } catch (IllegalStateException unused) {
        }
        if (this.f58302f != null) {
            this.f58302f.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    try {
                        BaseFragment.this.mo58125a(BaseFragment.this.f58302f);
                        BaseFragment.this.getActivity().onBackPressed();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58125a(View view) {
        if (getActivity() != null) {
            ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f58304h = getArguments().getString("enter_from");
            this.f58305i = getArguments().getString("enter_method");
            this.f58306j = getArguments().getString("enter_type");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view != null) {
            this.f58302f = view.findViewById(R.id.ayu);
        }
    }

    public void showCaptchaView(String str, String str2, final int i) {
        if (C6399b.m19944t()) {
            C217934 r0 = new C21823a() {
                /* renamed from: a */
                public final void mo57346a() {
                    BaseFragment.this.mo58128f();
                    if (BaseFragment.this.f58303g != null) {
                        BaseFragment.this.f58303g.refreshCaptcha(i);
                    }
                }

                /* renamed from: a */
                public final void mo57347a(String str, int i) {
                    BaseFragment.this.mo58128f();
                    if (BaseFragment.this.f58303g != null) {
                        BaseFragment.this.f58303g.onCompleteCaptcha(str, i);
                    }
                }
            };
            if (getActivity() != null) {
                if (this.f58301e == null) {
                    this.f58301e = InputCaptchaFragment.m72938a(str, i, (C21823a) r0);
                    C0633q a = getActivity().getSupportFragmentManager().mo2645a();
                    a.mo2588a((Fragment) this.f58301e, "captcha");
                    a.mo2606d();
                } else if (getActivity().getSupportFragmentManager().mo2644a("captcha") == null) {
                    this.f58301e.show(getActivity().getSupportFragmentManager(), "captcha");
                    this.f58301e.f58411d = r0;
                }
                this.f58301e.mo58197a(str, str2, i);
            }
        }
    }

    public void showErrorMessage(String str, int i, boolean z) {
        if (getActivity() != null) {
            if (!TextUtils.isEmpty(str)) {
                C10761a.m31403c((Context) getActivity(), str).mo25750a();
            } else if (i == -12) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.b1y).mo25750a();
            } else if (i == -21) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.b25).mo25750a();
            } else {
                C10761a.m31399c((Context) getActivity(), (int) R.string.b29).mo25750a();
            }
            if (!z) {
                mo57355c();
            }
        }
    }

    /* renamed from: a */
    public final void mo57354a(String str, String str2, int i, C21823a aVar) {
        if (C6399b.m19944t() && getActivity() != null) {
            C21252c.m71532a(str, String.valueOf(i), str2);
            if (this.f58301e == null) {
                this.f58301e = InputCaptchaFragment.m72938a(str, i, aVar);
                C0633q a = getActivity().getSupportFragmentManager().mo2645a();
                a.mo2588a((Fragment) this.f58301e, "captcha");
                a.mo2606d();
            } else if (getActivity().getSupportFragmentManager().mo2644a("captcha") == null) {
                this.f58301e.show(getActivity().getSupportFragmentManager(), "captcha");
                this.f58301e.f58411d = aVar;
            }
            this.f58301e.mo58197a(str, str2, i);
        }
    }
}
