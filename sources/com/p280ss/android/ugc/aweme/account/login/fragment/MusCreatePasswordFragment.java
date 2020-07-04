package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12838u;
import com.bytedance.sdk.account.p662f.p664b.C12878t.C12879a;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12858s;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity;
import com.p280ss.android.ugc.aweme.account.login.C21638v;
import com.p280ss.android.ugc.aweme.account.login.C21640x;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21271b;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21320aa;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21337n;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusCreatePasswordFragment */
public class MusCreatePasswordFragment extends BaseMusLoginFragment implements OnClickListener, C21271b, C21337n {

    /* renamed from: n */
    public LoginButton f57614n;

    /* renamed from: o */
    public View f57615o;

    /* renamed from: p */
    public TextView f57616p;

    /* renamed from: q */
    public Handler f57617q;

    /* renamed from: r */
    public boolean f57618r;

    /* renamed from: s */
    public int f57619s = 1;

    /* renamed from: t */
    private EditText f57620t;

    /* renamed from: u */
    private TextView f57621u;

    /* renamed from: v */
    private String f57622v;

    /* renamed from: w */
    private C12728d f57623w;

    public final boolean aa_() {
        return this.f57618r;
    }

    /* renamed from: Z_ */
    public final void mo57356Z_() {
        this.f57614n.mo57356Z_();
    }

    /* renamed from: a */
    public final void mo57357a() {
        this.f57614n.mo57357a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo57595j() {
        mo57500a((View) this.f57620t);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f57617q != null) {
            this.f57617q.removeCallbacksAndMessages(null);
            this.f57617q = null;
        }
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m77057c(this.f57620t);
    }

    public void onStart() {
        super.onStart();
        this.f57620t.postDelayed(new C21533w(this), 500);
    }

    /* renamed from: k */
    private void m72005k() {
        mo57509e().mo57213a(this.f57620t.getText().toString(), (C21320aa) new C21320aa(this, this.f57620t.getText().toString(), 0) {
            /* renamed from: a */
            public final void mo57342a(C12710e<C12879a> eVar) {
                if (MusCreatePasswordFragment.this.f57619s != 1 || MusCreatePasswordFragment.this.f57618r) {
                    C22345t.m73981j(false);
                }
                if (MusCreatePasswordFragment.this.isViewValid() && MusCreatePasswordFragment.this.getActivity() != null) {
                    MusCreatePasswordFragment.this.mo57594i();
                }
            }

            /* renamed from: b */
            public final void mo57343b(C12710e<C12879a> eVar) {
                if (eVar.f33702b > 0) {
                    if (MusCreatePasswordFragment.this.f57619s != 1 || MusCreatePasswordFragment.this.f57618r) {
                        C22345t.m73981j(false);
                    }
                    if (MusCreatePasswordFragment.this.isViewValid() && MusCreatePasswordFragment.this.getActivity() != null) {
                        MusCreatePasswordFragment.this.mo57594i();
                    }
                } else if (MusCreatePasswordFragment.this.isViewValid() && MusCreatePasswordFragment.this.getActivity() != null) {
                    MusCreatePasswordFragment.this.mo57502a(false);
                    C10761a.m31392b(MusCreatePasswordFragment.this.getContext(), (int) R.string.cg0, 0).mo25750a();
                    C21640x.m72456c(false, MusCreatePasswordFragment.this.f57412l);
                }
            }
        });
    }

    /* renamed from: i */
    public final void mo57594i() {
        if (this.f57618r) {
            Intent intent = new Intent(getActivity(), DeleteVideoAlertActivity.class);
            intent.putExtra("age_gate_response", new AgeGateResponse(0, "", false, true));
            intent.putExtra("enter_from", "from_create_account_password");
            startActivity(intent);
        }
        mo57502a(false);
        getActivity().finish();
        C21640x.m72456c(true, this.f57412l);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.b6a) {
            mo57508d();
            return;
        }
        if (id == R.id.qm) {
            mo57502a(true);
            if (this.f57618r) {
                m72005k();
                return;
            }
            this.f57623w.mo31194a(this.f57622v, this.f57620t.getText().toString(), (C12858s) new C12858s() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNeedSecureCaptcha(C12710e<C12838u> eVar) {
                    super.onNeedSecureCaptcha(eVar);
                    if (MusCreatePasswordFragment.this.isViewValid()) {
                        MusCreatePasswordFragment.this.mo57502a(false);
                    }
                }

                public final void onSuccess(C12710e<C12838u> eVar) {
                    if (MusCreatePasswordFragment.this.isViewValid() && MusCreatePasswordFragment.this.getActivity() != null && eVar.f33709g != null && ((C12838u) eVar.f33709g).f34023c != null) {
                        if (MusCreatePasswordFragment.this.f57619s != 1 || MusCreatePasswordFragment.this.f57618r) {
                            C22345t.m73981j(false);
                        }
                        C21640x.m72456c(true, MusCreatePasswordFragment.this.f57412l);
                        MusCreatePasswordFragment.this.mo57502a(false);
                        MusCreatePasswordFragment.this.f57615o.setVisibility(8);
                        MusCreatePasswordFragment.m71873a(((C12838u) eVar.f33709g).f34023c.f34083f, ((C12838u) eVar.f33709g).f34023c);
                        Bundle bundle = new Bundle(MusCreatePasswordFragment.this.getArguments());
                        bundle.putString("platform", "account");
                        ((MusLoginActivity) MusCreatePasswordFragment.this.getActivity()).mo57193a(bundle);
                    }
                }

                public final void onError(C12710e<C12838u> eVar, int i) {
                    if (MusCreatePasswordFragment.this.isViewValid() && MusCreatePasswordFragment.this.getContext() != null) {
                        MusCreatePasswordFragment.this.mo57502a(false);
                        C21640x.m72456c(false, MusCreatePasswordFragment.this.f57412l);
                        if (eVar.f33702b != 1105) {
                            MusCreatePasswordFragment.this.f57615o.setVisibility(0);
                            MusCreatePasswordFragment.this.f57616p.setText(eVar.f33703c);
                        }
                        MusCreatePasswordFragment.this.mo57357a();
                    }
                }
            });
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57622v = arguments.getString("username", "");
            this.f57618r = arguments.getBoolean("ftc_detect", false);
            this.f57619s = arguments.getInt("init_page", 1);
        }
        this.f57617q = new Handler();
        if (this.f57619s != 1 || this.f57618r) {
            C22345t.m73981j(true);
        }
    }

    /* renamed from: d */
    private void m72004d(View view) {
        this.f57620t = (EditText) view.findViewById(R.id.agq);
        this.f57614n = (LoginButton) view.findViewById(R.id.qm);
        this.f57614n.setLoginBackgroundRes(R.drawable.bav);
        this.f57614n.setAutoMirrored(false);
        this.f57614n.setLoadingBackground(R.drawable.bba);
        this.f57615o = view.findViewById(R.id.ehj);
        this.f57616p = (TextView) view.findViewById(R.id.ehi);
        this.f57406e = view.findViewById(R.id.b6a);
        this.f57621u = (TextView) view.findViewById(R.id.dvl);
        if (this.f57618r) {
            this.f57406e.setVisibility(8);
        }
        this.f57621u.setText(R.string.cby);
        this.f57406e.setOnClickListener(this);
        this.f57614n.setOnClickListener(this);
        this.f57620t.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                MusCreatePasswordFragment.this.f57617q.removeCallbacksAndMessages(null);
                MusCreatePasswordFragment.this.f57617q.postDelayed(new C21534x(this, editable), 200);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo57597a(Editable editable) {
                if (editable.toString().length() >= 0 && editable.toString().length() < 8) {
                    MusCreatePasswordFragment.this.f57614n.setEnabled(false);
                } else if (editable.toString().length() > 20) {
                    MusCreatePasswordFragment.this.f57615o.setVisibility(0);
                    MusCreatePasswordFragment.this.f57616p.setText(MusCreatePasswordFragment.this.getResources().getString(R.string.cet));
                    MusCreatePasswordFragment.this.f57614n.setEnabled(false);
                } else if (TextUtils.isEmpty(editable.toString()) || C21638v.m72447a(editable.toString())) {
                    MusCreatePasswordFragment.this.f57615o.setVisibility(8);
                    MusCreatePasswordFragment.this.f57614n.setEnabled(true);
                } else {
                    MusCreatePasswordFragment.this.f57615o.setVisibility(0);
                    MusCreatePasswordFragment.this.f57616p.setText(MusCreatePasswordFragment.this.getResources().getString(R.string.ceq));
                    MusCreatePasswordFragment.this.f57614n.setEnabled(false);
                }
            }
        });
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57623w = C12798d.m37186a(getContext());
        m72004d(view);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aec, viewGroup, false);
    }
}
