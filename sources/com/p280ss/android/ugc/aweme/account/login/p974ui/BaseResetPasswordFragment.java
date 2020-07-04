package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12835r;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.mobilelib.Validator;
import com.p280ss.android.mobilelib.model.PersistentData;
import com.p280ss.android.mobilelib.view.InputCodePasswordView;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.login.C21363e;
import com.p280ss.android.ugc.aweme.account.login.C21559m;
import com.p280ss.android.ugc.aweme.account.login.C21572p;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21346w;
import com.p280ss.android.ugc.aweme.account.login.p957c.C21357f;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.util.C22344s;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BaseResetPasswordFragment */
public abstract class BaseResetPasswordFragment extends BaseVerifyCodeFragment<C21357f> implements InputCodePasswordView {

    /* renamed from: G */
    private C21357f f58340G;

    /* renamed from: H */
    private C21346w f58341H;

    /* renamed from: J */
    private OnClickListener f58342J = new C21863c(this);

    /* renamed from: e */
    protected TextView f58343e;

    /* renamed from: q */
    protected EditText f58344q;

    /* renamed from: r */
    protected EditText f58345r;

    /* renamed from: s */
    protected Validator f58346s;

    /* renamed from: t */
    protected TextView f58347t;

    /* renamed from: u */
    protected DmtButton f58348u;

    /* renamed from: v */
    protected String f58349v;

    /* renamed from: w */
    protected String f58350w;

    /* renamed from: x */
    protected boolean f58351x;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo58163j();

    public void onResendSuccess() {
    }

    /* renamed from: u */
    public final String mo58166u() {
        return this.f58349v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo58167v() {
        return 1;
    }

    /* renamed from: w */
    public final int mo58168w() {
        return C21169e.f56920e;
    }

    public void onResendFail() {
        if (isViewValid()) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C21357f mo58129g() {
        if ((this.f58340G == null || !this.f58340G.isValid()) && getActivity() != null) {
            this.f58340G = new C21357f(getActivity(), this);
        }
        return this.f58340G;
    }

    /* renamed from: t */
    public final void mo58165t() {
        if (isViewValid() && getActivity() != null) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.csj).mo25750a();
        }
    }

    /* renamed from: s */
    public final void mo58164s() {
        if (this.f58348u != null) {
            if (this.f58345r == null || TextUtils.isEmpty(this.f58345r.getText()) || this.f58345r.getText().toString().length() < 8 || this.f58344q == null || TextUtils.isEmpty(this.f58344q.getText())) {
                this.f58348u.setEnabled(false);
            } else {
                this.f58348u.setEnabled(true);
            }
            if (!TextUtils.isEmpty(this.f58344q.getText()) && this.f58344q.getText().length() == 4) {
                this.f58345r.requestFocus();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58161b(int i) {
        if (isViewValid()) {
            this.f58344q.requestFocus();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo58162c(View view) {
        if (view.getId() == R.id.ayu) {
            ((C21559m) getActivity()).mo57197b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f58349v = arguments.getString("phone_number");
            this.f58351x = arguments.getBoolean("bundle_need_back");
            this.f58350w = arguments.getString("mask_phone_number");
            return;
        }
        this.f58349v = PersistentData.inst().getLastLoginMobile();
    }

    /* renamed from: a */
    public final void mo58159a(EditText editText, int i) {
        Editable text = editText.getText();
        int length = text.length();
        if (length > 20) {
            mo58165t();
            if (this.f58348u != null) {
                this.f58348u.setEnabled(false);
            }
            int selectionEnd = Selection.getSelectionEnd(text);
            editText.setText(text.toString().substring(0, 20));
            Editable text2 = editText.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
            return;
        }
        if (this.f58348u != null) {
            if (length < 8) {
                this.f58348u.setEnabled(false);
                return;
            }
            this.f58348u.setEnabled(true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.ayu).setOnClickListener(this.f58342J);
        this.f58343e = (TextView) view.findViewById(R.id.avk);
        this.f58344q = (EditText) view.findViewById(R.id.acr);
        this.f58345r = (EditText) view.findViewById(R.id.acc);
        this.f58348u = (DmtButton) view.findViewById(R.id.qz);
        this.f58347t = (TextView) view.findViewById(R.id.e7d);
        this.f58348u.setEnabled(false);
        mo58126b(this.f58344q);
        this.f58344q.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                BaseResetPasswordFragment.this.mo58164s();
            }
        });
        this.f58345r.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                BaseResetPasswordFragment.this.mo58164s();
                BaseResetPasswordFragment.this.mo58159a(BaseResetPasswordFragment.this.f58345r, 20);
            }
        });
        this.f58346s = Validator.with(getActivity()).notEmpty(this.f58344q, R.string.b1p).notEmpty(this.f58345r, R.string.b21);
        this.f58348u.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (BaseResetPasswordFragment.this.f58346s.check()) {
                    BaseResetPasswordFragment.this.mo58125a(BaseResetPasswordFragment.this.f58345r);
                    int length = BaseResetPasswordFragment.this.f58345r.getText().toString().length();
                    if (length < 8 || length > 20) {
                        BaseResetPasswordFragment.this.mo58165t();
                        return;
                    }
                    BaseResetPasswordFragment.this.mo58163j();
                }
            }
        });
        if (this.f58345r == null || TextUtils.isEmpty(this.f58345r.getText()) || this.f58345r.getText().toString().length() < 8 || this.f58344q == null || TextUtils.isEmpty(this.f58344q.getText())) {
            this.f58348u.setEnabled(false);
        } else {
            this.f58348u.setEnabled(true);
        }
        this.f58341H = new C21346w(this) {
            /* renamed from: a */
            public final void mo57364a(C12710e<C12835r> eVar) {
                JSONObject jSONObject;
                C21559m mVar;
                C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("enter_method", BaseResetPasswordFragment.this.f58305i).mo56946a("platform", "sms_verification").mo56946a("enter_type", BaseResetPasswordFragment.this.f58306j).mo56946a("carrier", "").mo56944a("error_code", eVar.f33702b).f56672a);
                BaseResetPasswordFragment.this.afterHandleRequest();
                C19282c.m63182a(BaseResetPasswordFragment.this.getContext(), "login", "reset_password_next_error");
                C21671bd.m72522a(8, 3, (Object) eVar.f33703c);
                if (eVar.f33702b == 1075) {
                    FragmentActivity activity = BaseResetPasswordFragment.this.getActivity();
                    int i = eVar.f33702b;
                    if (eVar.f33709g != null) {
                        jSONObject = ((C12835r) eVar.f33709g).f33964l;
                    } else {
                        jSONObject = null;
                    }
                    if (BaseResetPasswordFragment.this.getActivity() instanceof C21559m) {
                        mVar = (C21559m) BaseResetPasswordFragment.this.getActivity();
                    } else {
                        mVar = null;
                    }
                    C21363e eVar2 = new C21363e(activity, i, jSONObject, null, mVar, BaseResetPasswordFragment.this.mo58155d(null));
                    C21572p.m72299a(eVar2);
                    return;
                }
                if (!TextUtils.isEmpty(eVar.f33703c)) {
                    C22344s.m73953a(BaseResetPasswordFragment.this.getContext(), eVar.f33703c, eVar.f33702b);
                }
            }

            public final void onSuccess(C12710e<C12835r> eVar) {
                if (BaseResetPasswordFragment.this.isViewValid() && BaseResetPasswordFragment.this.getContext() != null && eVar.f33709g != null && ((C12835r) eVar.f33709g).f33996e != null) {
                    BaseResetPasswordFragment.this.afterHandleRequest();
                    PersistentData.inst().saveLastLoginMobile(BaseResetPasswordFragment.this.getContext(), ((C12835r) eVar.f33709g).f33992a);
                    C19282c.m63182a(BaseResetPasswordFragment.this.getContext(), "login", "reset_password_next");
                    C10761a.m31383a(BaseResetPasswordFragment.this.getContext(), (int) R.string.zn).mo25750a();
                    C21671bd.m72526a(((C12835r) eVar.f33709g).f33996e);
                    C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", BaseResetPasswordFragment.this.f58305i).mo56946a("enter_from", BaseResetPasswordFragment.this.f58304h).mo56946a("enter_type", BaseResetPasswordFragment.this.f58306j).mo56946a("platform", "sms_verification").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    if (BaseResetPasswordFragment.this.getActivity() != null) {
                        ((C21559m) BaseResetPasswordFragment.this.getActivity()).mo57193a(BaseResetPasswordFragment.this.mo58155d(null));
                    }
                    C21671bd.m72522a(1, 1, (Object) ((C12835r) eVar.f33709g).f33992a);
                }
            }
        };
        C6726a.m20843a(new Runnable() {
            public final void run() {
                C6907h.m21518a((Context) BaseResetPasswordFragment.this.getActivity(), "resend_click", "verification_code", C21671bd.m72536d(), 0);
            }
        }, VETransitionFilterParam.TransitionDuration_DEFAULT);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58160a(String str, String str2, String str3) {
        if (isViewValid() && this.f58340G != null) {
            C6907h.m21524a("login_submit", (Map) new C21102b().mo56946a("enter_method", this.f58305i).mo56946a("enter_from", this.f58304h).mo56946a("enter_type", this.f58306j).mo56946a("platform", "sms_verification").mo56946a("group_id", C21220e.m71415a(getArguments())).mo56946a("log_pb", C21220e.m71418b(getArguments())).f56672a);
            this.f58340G.mo57443a(this.f58349v, str, str2, null, this.f58341H);
        }
    }
}
