package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12833p;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21275f;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21348y;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.login.p974ui.MusCountDownView;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22173a;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22180e;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.account.view.StateButton.C22358a;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusSecureSendCodeFragment */
public abstract class BaseMusSecureSendCodeFragment extends BaseMusLoginFragment {

    /* renamed from: r */
    public static String f57501r = "sendcode_ticket";

    /* renamed from: s */
    public static String f57502s = "sendcode_description";

    /* renamed from: t */
    public static String f57503t = "mobile";
    @BindView(2131492941)
    View loginViewText;
    @BindView(2131492933)
    LoginButton mBtnLogin;
    @BindView(2131492940)
    View mBtnLoginPhonePassword;
    @BindView(2131493296)
    MusCountDownView mCountDownView;
    @BindView(2131493098)
    EditText mEdCode;
    @BindView(2131493090)
    View mEdCodeUnderline;
    @BindView(2131493138)
    TextView mGetVoiceCode;
    @BindView(2131493568)
    TextView mTvHint;
    @BindView(2131493343)
    TextView mTvPhoneNumber;
    @BindView(2131493635)
    TextView mTvWrongCode;
    @BindView(2131493636)
    View mWrongCodeContainer;

    /* renamed from: n */
    protected C21348y f57504n;

    /* renamed from: o */
    protected boolean f57505o = true;

    /* renamed from: p */
    protected boolean f57506p;

    /* renamed from: q */
    protected String f57507q;
    @BindView(2131493529)
    TextView tipTitle;

    /* renamed from: u */
    protected String f57508u;

    /* renamed from: v */
    protected C21407a f57509v;

    /* renamed from: w */
    protected C12728d f57510w;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusSecureSendCodeFragment$a */
    class C21407a implements C21823a {
        /* renamed from: a */
        public final void mo57346a() {
            int i;
            if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                BaseMusSecureSendCodeFragment.this.mo57355c();
                MusLoginManager e = BaseMusSecureSendCodeFragment.this.mo57509e();
                if (BaseMusSecureSendCodeFragment.this.f57506p) {
                    i = C21169e.f56916a;
                } else {
                    i = C21169e.f56937v;
                }
                e.mo57208a(i, (C12852m) new C12852m() {
                    public final void onSuccess(C12710e<C12833p> eVar) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C21407a.this.mo57561a(eVar);
                        }
                    }

                    public final void onError(C12710e<C12833p> eVar, int i) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C21407a.this.mo57561a(eVar);
                        }
                    }
                });
            }
        }

        private C21407a() {
        }

        /* renamed from: a */
        public final void mo57561a(C12710e<C12833p> eVar) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            int i;
            if (eVar.f33709g != null) {
                jSONObject = ((C12833p) eVar.f33709g).f33964l;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("data");
            } else {
                jSONObject2 = null;
            }
            if (BaseMusSecureSendCodeFragment.this.f57506p) {
                i = C21169e.f56916a;
            } else {
                i = C21169e.f56937v;
            }
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("captcha");
                if (!TextUtils.isEmpty(optString)) {
                    BaseMusSecureSendCodeFragment.this.mo57354a(optString, null, i, BaseMusSecureSendCodeFragment.this.f57509v);
                }
            }
        }

        /* renamed from: a */
        public final void mo57347a(String str, int i) {
            int i2;
            if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                BaseMusSecureSendCodeFragment.this.mo57355c();
                BaseMusSecureSendCodeFragment.this.mCountDownView.mo58213a(0);
                if (BaseMusSecureSendCodeFragment.this.f57506p) {
                    i2 = C21169e.f56916a;
                } else {
                    i2 = C21169e.f56937v;
                }
                boolean a = C21241d.m71496a();
                BaseMusSecureSendCodeFragment.this.f57510w.mo31184a(BaseMusSecureSendCodeFragment.this.f57508u, str, i2, 0, BaseMusSecureSendCodeFragment.this.f57507q, 1, a ? 1 : 0, (C12855p) new C21275f(BaseMusSecureSendCodeFragment.this) {
                    /* renamed from: a */
                    public final void mo57263a() {
                        C22358a.m74033a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                    }

                    /* renamed from: c */
                    public final void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
                        super.onNeedSecureCaptcha(eVar);
                        C22358a.m74033a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                    }

                    /* renamed from: a */
                    public final void mo57266a(C12710e<C12836s> eVar) {
                        C22358a.m74033a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                        C10761a.m31403c(BaseMusSecureSendCodeFragment.this.getContext(), C22338o.m73945a((C12707b) eVar)).mo25750a();
                    }

                    /* renamed from: a */
                    public final void mo57264a(int i) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getActivity() != null) {
                            C22358a.m74033a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                            BaseMusSecureSendCodeFragment.this.mo57554a(BaseMusSecureSendCodeFragment.this.getResources().getString(R.string.cdl));
                        }
                    }

                    /* renamed from: b */
                    public final void mo57366b(C12710e<C12836s> eVar) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C22358a.m74033a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                            C10761a.m31392b(BaseMusSecureSendCodeFragment.this.getContext(), (int) R.string.cg0, 0).mo25750a();
                        }
                    }

                    /* renamed from: b */
                    public final void mo57268b(int i) {
                        super.mo57268b(i);
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_method", BaseMusSecureSendCodeFragment.this.f57412l).mo56946a("enter_type", BaseMusSecureSendCodeFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
                            C22358a.m74033a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                        }
                    }

                    /* renamed from: a */
                    public final void mo57265a(int i, String str) {
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            C22358a.m74033a(BaseMusSecureSendCodeFragment.this.mBtnLogin);
                            BaseMusSecureSendCodeFragment baseMusSecureSendCodeFragment = BaseMusSecureSendCodeFragment.this;
                            if (TextUtils.isEmpty(str)) {
                                str = BaseMusSecureSendCodeFragment.this.getResources().getString(R.string.ctp);
                            }
                            baseMusSecureSendCodeFragment.mo57554a(str);
                        }
                    }

                    /* renamed from: a */
                    public final void mo57267a(String str, String str2) {
                        int i;
                        if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null) {
                            if (BaseMusSecureSendCodeFragment.this.f57506p) {
                                i = C21169e.f56916a;
                            } else {
                                i = C21169e.f56937v;
                            }
                            BaseMusSecureSendCodeFragment.this.mo57354a(str, str2, i, BaseMusSecureSendCodeFragment.this.f57509v);
                        }
                    }
                });
                C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", "resend").mo56944a("send_reason", i2).mo56946a("enter_method", BaseMusSecureSendCodeFragment.this.f57412l).mo56946a("enter_from", BaseMusSecureSendCodeFragment.this.f57411k).f56672a);
                C22180e.m73610a(BaseMusSecureSendCodeFragment.this.f57508u, (C22173a) new C22173a() {
                    /* renamed from: a */
                    public final void mo57562a(boolean z) {
                        String str;
                        if (C7163a.m22363a()) {
                            StringBuilder sb = new StringBuilder("Voice verification code ");
                            if (z) {
                                str = "available";
                            } else {
                                str = "disabled";
                            }
                            sb.append(str);
                        }
                        if (BaseMusSecureSendCodeFragment.this.mCountDownView != null) {
                            BaseMusSecureSendCodeFragment.this.mCountDownView.setVoiceCodeEnabled(z);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo57553a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo57555b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo57557i();

    /* renamed from: k */
    private void m71938k() {
        C6907h.m21524a("auto_fill_sms_verification", (Map) new C21102b().mo56946a("enter_method", this.f57412l).f56672a);
    }

    /* renamed from: j */
    private void m71937j() {
        C0052o oVar;
        if (getActivity() instanceof MusLoginActivity) {
            oVar = ((MusLoginActivity) getActivity()).mo57203d();
        } else {
            oVar = null;
        }
        if (oVar != null) {
            if (!TextUtils.isEmpty((CharSequence) oVar.getValue())) {
                this.mEdCode.setText((CharSequence) oVar.getValue());
                m71938k();
                oVar.setValue("");
            }
            oVar.observe(this, new C21523m(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo57556c(String str) {
        this.mEdCode.setText(str);
        m71938k();
    }

    /* renamed from: a */
    public final void mo57554a(String str) {
        C1081a aVar = new C1081a(getContext(), R.style.rk);
        aVar.mo4233a((CharSequence) "").mo4240b((CharSequence) str).mo4226a((int) R.string.afn, (OnClickListener) null);
        try {
            aVar.mo4242b().show();
        } catch (Exception unused) {
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57507q = arguments.getString(f57501r);
            this.f57508u = arguments.getString(f57503t);
        }
        this.f57510w = C12798d.m37186a(getContext());
        this.f57509v = new C21407a();
        this.f57504n = new C21348y(this) {
            public final void onSuccess(C12710e<C12836s> eVar) {
            }

            /* renamed from: b */
            public final void mo57366b(C12710e<C12836s> eVar) {
                String str;
                if (BaseMusSecureSendCodeFragment.this.isViewValid() && BaseMusSecureSendCodeFragment.this.getContext() != null && eVar != null && eVar.f33702b > 0) {
                    if (eVar.f33702b == 1003) {
                        BaseMusSecureSendCodeFragment.this.mo57554a(BaseMusSecureSendCodeFragment.this.getResources().getString(R.string.cdl));
                    } else if (eVar.f33702b == 1001) {
                        BaseMusSecureSendCodeFragment baseMusSecureSendCodeFragment = BaseMusSecureSendCodeFragment.this;
                        if (TextUtils.isEmpty(eVar.f33703c)) {
                            str = BaseMusSecureSendCodeFragment.this.getResources().getString(R.string.ctp);
                        } else {
                            str = eVar.f33703c;
                        }
                        baseMusSecureSendCodeFragment.mo57554a(str);
                    } else if (eVar.f33702b != 1105) {
                        C10761a.m31387a(BaseMusSecureSendCodeFragment.this.getContext(), eVar.f33703c).mo25750a();
                    }
                }
            }
        };
    }

    @OnClick({2131493138, 2131492933})
    public void onClick(View view) {
        if (view.getId() != R.id.aqc) {
            if (view.getId() == R.id.qm) {
                mo57555b(this.mEdCode.getText().toString());
            }
        } else if (this.f57505o || this.mCountDownView.getRemainTick() <= 0) {
            mo57557i();
            this.f57505o = false;
        } else {
            C10761a.m31403c((Context) C21671bd.m72532b(), getResources().getString(R.string.fq2)).mo25750a();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.aed, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.mBtnLogin.setLoginBackgroundRes(R.drawable.baw);
        this.mBtnLogin.setLoadingBackground(R.drawable.bba);
        this.mBtnLoginPhonePassword.setVisibility(8);
        String string = getString(R.string.wv);
        String string2 = getString(R.string.bb7);
        Factory instance = Factory.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" ");
        sb.append(string2);
        Spannable newSpannable = instance.newSpannable(sb.toString());
        newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.lj)), string.length(), newSpannable.length(), 33);
        this.mGetVoiceCode.setText(newSpannable);
        this.mCountDownView.setTargetView(this.mGetVoiceCode);
        this.mCountDownView.getTimerText().setVisibility(8);
        this.mCountDownView.getResendCodeButton().setVisibility(0);
        this.mCountDownView.getResendCodeButton().setText(getString(R.string.dlu));
        if (this.f57409h != null) {
            this.mCountDownView.setTickListener(this.f57409h);
        }
        this.mCountDownView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                BaseMusSecureSendCodeFragment.this.mo57553a();
            }
        });
        this.mEdCode.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                boolean z;
                LoginButton loginButton = BaseMusSecureSendCodeFragment.this.mBtnLogin;
                if (TextUtils.isEmpty(editable.toString()) || editable.toString().length() != 4) {
                    z = false;
                } else {
                    z = true;
                }
                loginButton.setEnabled(z);
                if (TextUtils.isEmpty(editable.toString())) {
                    BaseMusSecureSendCodeFragment.this.mWrongCodeContainer.setVisibility(8);
                    BaseMusSecureSendCodeFragment.this.mEdCodeUnderline.setBackgroundColor(BaseMusSecureSendCodeFragment.this.getResources().getColor(R.color.le));
                }
            }
        });
        m71937j();
        return inflate;
    }
}
