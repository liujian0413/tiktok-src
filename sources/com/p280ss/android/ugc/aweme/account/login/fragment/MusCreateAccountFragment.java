package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity;
import com.p280ss.android.ugc.aweme.account.login.C21640x;
import com.p280ss.android.ugc.aweme.account.login.bean.UserSettingBean;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21271b;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21337n;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.p951l.C21246h;
import com.p280ss.android.ugc.aweme.account.util.C22332k;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.account.util.C22351x;
import com.p280ss.android.ugc.aweme.account.util.C22352y;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23483k;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.main.p1385g.C33019f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusCreateAccountFragment */
public class MusCreateAccountFragment extends BaseMusLoginFragment implements OnClickListener, C21271b, C21337n, C22332k {

    /* renamed from: z */
    private static final Pattern f57597z = Pattern.compile("^([\\u4e00-\\u9fa5\\w.]{1,19}[\\u4e00-\\u9fa5\\w])$");

    /* renamed from: n */
    public EditText f57598n;

    /* renamed from: o */
    public LoginButton f57599o;

    /* renamed from: p */
    public View f57600p;

    /* renamed from: q */
    public TextView f57601q;

    /* renamed from: r */
    public boolean f57602r;

    /* renamed from: s */
    public boolean f57603s;

    /* renamed from: t */
    public int f57604t = 1;

    /* renamed from: u */
    private TextView f57605u;

    /* renamed from: v */
    private TextView f57606v;

    /* renamed from: w */
    private String f57607w;

    /* renamed from: x */
    private C21434a f57608x;

    /* renamed from: y */
    private C22351x f57609y;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusCreateAccountFragment$a */
    class C21434a implements C18245g<String> {
        private C21434a() {
        }

        public final void onFailure(Throwable th) {
            if (MusCreateAccountFragment.this.isViewValid() && MusCreateAccountFragment.this.getContext() != null) {
                C21640x.m72455b(false, MusCreateAccountFragment.this.f57411k);
                MusCreateAccountFragment.this.mo57502a(false);
                C10761a.m31392b(MusCreateAccountFragment.this.getContext(), (int) R.string.cg0, 0).mo25750a();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(String str) {
            MusCreateAccountFragment.this.mo57502a(false);
            try {
                if (new JSONObject(str).optBoolean("valid")) {
                    C21640x.m72455b(true, MusCreateAccountFragment.this.f57411k);
                    if (MusCreateAccountFragment.this.f57604t != 1 || MusCreateAccountFragment.this.f57602r) {
                        C22345t.m73980i(false);
                    }
                    MusCreateAccountFragment.this.f57600p.setVisibility(8);
                    MusCreateAccountFragment.this.mo57503b((BaseMusLoginFragment) C22334m.m73938a(MusCreatePasswordFragment.class, MusCreateAccountFragment.this.getArguments()).mo58756a("enter_from", MusCreateAccountFragment.this.f57411k).mo58756a("enter_method", MusCreateAccountFragment.this.f57412l).mo58756a("username", MusCreateAccountFragment.this.f57598n.getText().toString()).mo58754a("init_page", MusCreateAccountFragment.this.f57604t).mo58753a(), false);
                    return;
                }
                C21640x.m72455b(false, MusCreateAccountFragment.this.f57411k);
                MusCreateAccountFragment.this.f57600p.setVisibility(0);
                MusCreateAccountFragment.this.f57601q.setText(R.string.cbw);
            } catch (Exception unused) {
                C10761a.m31392b(MusCreateAccountFragment.this.getContext(), (int) R.string.cg0, 0).mo25750a();
            }
        }
    }

    public final boolean aa_() {
        return true;
    }

    /* renamed from: Z_ */
    public final void mo57356Z_() {
        this.f57599o.mo57356Z_();
    }

    /* renamed from: a */
    public final void mo57357a() {
        this.f57599o.mo57357a();
    }

    /* renamed from: j */
    private void m71993j() {
        if (this.f57604t != 1 || this.f57602r) {
            C22345t.m73980i(false);
        }
        if (getActivity() != null) {
            if (!this.f57603s) {
                mo57503b((BaseMusLoginFragment) C22334m.m73938a(MusCreatePasswordFragment.class, getArguments()).mo58756a("enter_from", this.f57411k).mo58756a("enter_method", this.f57412l).mo58756a("username", this.f57598n.getText().toString()).mo58757a("ftc_detect", true).mo58754a("init_page", this.f57604t).mo58753a(), false);
            } else if (this.f57602r) {
                Intent intent = new Intent(getActivity(), DeleteVideoAlertActivity.class);
                intent.putExtra("age_gate_response", new AgeGateResponse(0, "", false, true));
                intent.putExtra("enter_from", "from_create_account_password");
                startActivity(intent);
                getActivity().finish();
            }
        }
    }

    /* renamed from: i */
    public final void mo57590i() {
        String obj = this.f57598n.getText().toString();
        if (C23483k.m77110a(obj) || obj.length() < 2 || obj.length() > 20) {
            this.f57600p.setVisibility(0);
            this.f57601q.setText(R.string.b1x);
            mo57502a(false);
            C21640x.m72455b(false, this.f57411k);
        } else if (!f57597z.matcher(obj).find()) {
            this.f57600p.setVisibility(0);
            this.f57601q.setText(R.string.b1x);
            mo57502a(false);
            C21640x.m72455b(false, this.f57411k);
        } else {
            this.f57600p.setVisibility(8);
            if (!this.f57602r) {
                mo57502a(true);
                mo57509e().mo57212a(obj, (C18245g<String>) this.f57608x);
            } else if (TextUtils.equals(this.f57607w, this.f57598n.getText().toString())) {
                this.f57600p.setVisibility(8);
                C21640x.m72455b(true, this.f57411k);
                mo57502a(false);
                m71993j();
            } else {
                mo57502a(true);
                C21246h hVar = new C21246h();
                hVar.f57057c = this.f57598n.getText().toString();
                this.f57609y.mo58768a(hVar.mo57171a());
            }
        }
    }

    /* renamed from: c */
    public final void mo57589c(boolean z) {
        if (z) {
            C21640x.m72455b(true, this.f57411k);
            if (this.f57604t != 1 || this.f57602r) {
                C22345t.m73980i(false);
            }
            C21671bd.m72522a(12, 1, (Object) "");
            mo57502a(false);
            this.f57600p.setVisibility(8);
            m71993j();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.qm) {
            if (!C21532v.m72215a(getActivity())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            } else {
                mo57502a(true);
                mo57509e().mo57210a((C18245g<UserSettingBean>) new C18245g<UserSettingBean>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onSuccess(UserSettingBean userSettingBean) {
                        MusCreateAccountFragment musCreateAccountFragment = MusCreateAccountFragment.this;
                        boolean z = true;
                        if (userSettingBean.getIs_password_set() != 1) {
                            z = false;
                        }
                        musCreateAccountFragment.f57603s = z;
                        MusCreateAccountFragment.this.mo57590i();
                    }

                    public final void onFailure(Throwable th) {
                        MusCreateAccountFragment.this.mo57502a(false);
                        C10761a.m31392b(MusCreateAccountFragment.this.getContext(), (int) R.string.cg0, 0).mo25750a();
                        C21640x.m72455b(false, MusCreateAccountFragment.this.f57411k);
                    }
                });
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57608x = new C21434a();
        this.f57609y = new C22351x();
        this.f57609y.f59617a = this;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57602r = arguments.getBoolean("ftc_detect", false);
            this.f57604t = arguments.getInt("init_page", 1);
        }
        if (this.f57604t != 1 || this.f57602r) {
            C22345t.m73980i(true);
        }
    }

    /* renamed from: d */
    private void m71992d(View view) {
        this.f57598n = (EditText) view.findViewById(R.id.agq);
        this.f57599o = (LoginButton) view.findViewById(R.id.qm);
        this.f57599o.setLoginBackgroundRes(R.drawable.bav);
        this.f57599o.setAutoMirrored(false);
        this.f57599o.setLoadingBackground(R.drawable.bba);
        this.f57600p = view.findViewById(R.id.ehj);
        this.f57601q = (TextView) view.findViewById(R.id.ehi);
        this.f57605u = (TextView) view.findViewById(R.id.dvl);
        this.f57606v = (TextView) view.findViewById(R.id.djl);
        this.f57599o.setOnClickListener(this);
        this.f57406e.setVisibility(8);
        if (this.f57602r) {
            String b = C23481i.m77091b(R.string.cd6);
            String b2 = C23481i.m77091b(R.string.cd7);
            SpannableString spannableString = new SpannableString(b);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.sv)), b.length() - b2.length(), b.length(), 33);
            this.f57605u.setText(spannableString);
            this.f57406e.setVisibility(8);
            this.f57606v.setText(R.string.cd5);
            this.f57607w = C22352y.m74015a(C21671bd.m72543k());
            this.f57598n.setText(this.f57607w);
            this.f57599o.setEnabled(true);
        } else {
            this.f57605u.setText(R.string.cbu);
        }
        this.f57598n.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                MusCreateAccountFragment.this.f57599o.setEnabled(!TextUtils.isEmpty(editable.toString()));
            }
        });
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m71992d(view);
    }

    /* renamed from: a */
    public final void mo57588a(String str, boolean z) {
        this.f57600p.setVisibility(0);
        this.f57601q.setText(str);
    }

    /* renamed from: a */
    public final void mo57587a(Exception exc, int i) {
        if (isViewValid() && this.f57609y != null) {
            mo57502a(false);
            C33019f fVar = (C33019f) C21671bd.m72521a(C33019f.class);
            if (fVar == null || !fVar.mo60012a(exc)) {
                C21640x.m72455b(false, this.f57411k);
                if (!(exc instanceof ApiServerException) || ((ApiServerException) exc).getErrorCode() != 2064) {
                    this.f57600p.setVisibility(8);
                    C10761a.m31392b(getContext(), (int) R.string.cg0, 0).mo25750a();
                } else {
                    this.f57600p.setVisibility(0);
                    this.f57601q.setText(R.string.cbw);
                }
            } else {
                fVar.mo60011a(getChildFragmentManager(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: a */
                    public final void mo57592a() {
                        MusCreateAccountFragment.this.mo57590i();
                    }

                    /* renamed from: b */
                    public final void mo57593b() {
                        C21640x.m72455b(false, MusCreateAccountFragment.this.f57411k);
                    }
                });
            }
            C6921a.m21559a((Throwable) exc);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aeb, viewGroup, false);
    }
}
