package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.collect.C17995dt;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21642z;
import com.p280ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.login.p974ui.MusCountryListActivity;
import com.p280ss.android.ugc.aweme.account.login.sms.C21586a;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21171a;
import com.p280ss.android.ugc.aweme.account.p982ui.C22307g;
import com.p280ss.android.ugc.aweme.account.shortvideo.p981ui.PressFadeLinearLayout;
import com.p280ss.android.ugc.aweme.account.util.C22326e;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.view.StateButton.C22358a;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33027m;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusInputPhoneFragment */
public class MusInputPhoneFragment extends BaseMusLoginFragment implements OnClickListener, C21171a, C21642z, C22307g {

    /* renamed from: A */
    private String f57627A;

    /* renamed from: B */
    private String f57628B;

    /* renamed from: C */
    private TextView f57629C;

    /* renamed from: D */
    private C21586a f57630D;

    /* renamed from: E */
    private boolean f57631E = true;

    /* renamed from: F */
    private DmtTextView f57632F;

    /* renamed from: G */
    private DmtStatusView f57633G;

    /* renamed from: H */
    private long f57634H;

    /* renamed from: J */
    private OnFocusChangeListener f57635J = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            int i;
            if (view.getId() == R.id.age) {
                ImageView imageView = MusInputPhoneFragment.this.f57639q;
                if (!z || TextUtils.isEmpty(MusInputPhoneFragment.this.f57636n.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        }
    };

    /* renamed from: n */
    public EditText f57636n;

    /* renamed from: o */
    public LoginButton f57637o;

    /* renamed from: p */
    public DmtButton f57638p;

    /* renamed from: q */
    public ImageView f57639q;

    /* renamed from: r */
    public C21444a f57640r;

    /* renamed from: s */
    public String f57641s;

    /* renamed from: t */
    private TextView f57642t;

    /* renamed from: u */
    private PressFadeLinearLayout f57643u;

    /* renamed from: v */
    private TextView f57644v;

    /* renamed from: w */
    private TextView f57645w;

    /* renamed from: x */
    private Dialog f57646x;

    /* renamed from: y */
    private Dialog f57647y;

    /* renamed from: z */
    private String f57648z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusInputPhoneFragment$a */
    public interface C21444a {
        /* renamed from: a */
        void mo57450a(String str, String str2, BaseMusLoginFragment baseMusLoginFragment);

        /* renamed from: d */
        String mo57453d();

        /* renamed from: e */
        String mo57455e();

        /* renamed from: f */
        boolean mo57456f();
    }

    /* renamed from: j */
    public final long mo57601j() {
        return System.currentTimeMillis() - this.f57634H;
    }

    /* renamed from: l */
    private void m72016l() {
        this.f57645w.setText(R.string.cbh);
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m77057c(this.f57636n);
    }

    public void onStart() {
        super.onStart();
        this.f57636n.postDelayed(new Runnable() {
            public final void run() {
                MusInputPhoneFragment.this.mo57500a((View) MusInputPhoneFragment.this.f57636n);
            }
        }, 500);
    }

    public void onStop() {
        super.onStop();
        if (this.f57630D != null) {
            this.f57630D.mo57776b();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f57646x != null) {
            C21495ad.m72194a(this.f57646x);
        }
        if (this.f57647y != null) {
            C21495ad.m72194a(this.f57647y);
        }
    }

    public void onResume() {
        super.onResume();
        if (TextUtils.equals(this.f57641s, "enter_from_bind_pre_account")) {
            this.f57634H = System.currentTimeMillis();
        }
    }

    /* renamed from: X_ */
    public final boolean mo57516X_() {
        if (getArguments() == null || !this.f57631E || C21671bd.m72539g()) {
            return false;
        }
        int i = getArguments().getInt("init_page", 0);
        if (i == 11 || i == 10) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo57598a() {
        if (this.f57637o == null || this.f57637o.getVisibility() != 0) {
            if (this.f57638p != null && this.f57638p.getVisibility() == 0) {
                this.f57633G.mo25942f();
            }
            return;
        }
        C22358a.m74035b(this.f57637o);
    }

    /* renamed from: i */
    public final void mo57600i() {
        if (this.f57637o == null || this.f57637o.getVisibility() != 0) {
            if (this.f57638p != null && this.f57638p.getVisibility() == 0) {
                this.f57633G.setVisibility(8);
            }
            return;
        }
        this.f57637o.mo57357a();
    }

    /* renamed from: k */
    private void m72015k() {
        if (TextUtils.isEmpty(this.f57648z) || TextUtils.isEmpty(this.f57627A) || TextUtils.isEmpty(this.f57628B)) {
            if (getArguments() != null && getArguments().getBoolean("need_auto_fill_phone_number", false)) {
                BaseLoginMethod a = C21579s.m72305a(LoginMethodName.DEFAULT);
                if (a instanceof PhoneLoginMethod) {
                    PhoneNumber phoneNumber = ((PhoneLoginMethod) a).getPhoneNumber();
                    if (phoneNumber.getNationalNumber() != 0) {
                        this.f57636n.setText(String.valueOf(phoneNumber.getNationalNumber()));
                    }
                    C21566a a2 = C21566a.m72287a(phoneNumber);
                    if (a2 != null) {
                        this.f57642t.setText(a2.f57901d);
                        this.f57644v.setText(a2.f57900c);
                        return;
                    }
                }
            }
            String str = null;
            TelephonyManager telephonyManager = (TelephonyManager) getActivity().getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso();
            }
            if (TextUtils.isEmpty(str)) {
                str = Locale.getDefault().getCountry();
            }
            if (!TextUtils.isEmpty(str)) {
                C17995dt it = C21566a.m72288b().iterator();
                while (it.hasNext()) {
                    C21566a aVar = (C21566a) it.next();
                    if (aVar.f57900c.equalsIgnoreCase(str)) {
                        this.f57642t.setText(aVar.f57901d);
                        this.f57644v.setText(aVar.f57900c);
                        return;
                    }
                }
            }
            return;
        }
        this.f57642t.setText(this.f57648z);
        this.f57644v.setText(this.f57627A);
        this.f57636n.setText(this.f57628B);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo57599d(View view) {
        this.f57639q.setVisibility(8);
        this.f57636n.setText("");
    }

    /* renamed from: a */
    public final void mo57095a(C21566a aVar) {
        if (aVar != null) {
            this.f57642t.setText(aVar.f57901d);
            this.f57644v.setText(aVar.f57900c);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null && C21170a.m71336a() != null) {
            mo57095a(C21170a.m71336a());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57630D = new C21586a(this, this.f57412l);
        this.f57630D.mo57772a();
        if (getArguments() != null) {
            this.f57641s = getArguments().getString(C21578r.f57923k);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.r1 || view.getId() == R.id.qm) {
            if (view.getId() == R.id.r1) {
                KeyboardUtils.m77057c(this.f57636n);
                C6907h.m21524a("click_next_for_proAccount", (Map) new C21102b().mo56944a("is_success", 1).mo56946a("method", "phone").mo56946a("page", "Set up by Phone").mo56945a("duration", System.currentTimeMillis() - this.f57634H).f56672a);
            }
            C6907h.m21524a("login_click_next", (Map) new C21102b().mo56946a("platform", "phone").f56672a);
            this.f57648z = this.f57642t.getText().toString();
            this.f57627A = this.f57644v.getText().toString();
            this.f57628B = this.f57636n.getText().toString();
            if (this.f57640r != null) {
                this.f57640r.mo57450a(this.f57642t.getText().toString(), this.f57636n.getText().toString(), this);
                return;
            }
            this.f57631E = false;
            BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusLoginPhonePasswordFragment.class, getArguments()).mo58756a("country_code_alpha_2", this.f57644v.getText().toString()).mo58756a("country_code", this.f57642t.getText().toString()).mo58754a(POIService.KEY_ORDER, 1).mo58756a("enter_type", this.f57413m).mo58756a("phone_number", this.f57636n.getText().toString()).mo58754a("login_type", 0).mo58753a();
            if (baseMusLoginFragment != null) {
                C6907h.m21524a("login_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 1).f56672a);
            }
            baseMusLoginFragment.mo57501a(this.f57409h);
            mo57503b(baseMusLoginFragment, false);
            return;
        }
        if (view.getId() == R.id.e8h) {
            if (C6399b.m19946v()) {
                str = "https://m.tiktok.com/passport/email/email_bind_index/";
            } else {
                str = "https://www.tiktok.com/passport/email/email_bind_index/";
            }
            C19290j jVar = new C19290j(str);
            C42811c.m135845a();
            User b = C42811c.m135859b();
            String b2 = ((C33027m) C21671bd.m72521a(C33027m.class)).mo60025b();
            String a = ((C33027m) C21671bd.m72521a(C33027m.class)).mo60024a();
            jVar.mo51188a("lang", b2);
            jVar.mo51186a("aid", 1233);
            jVar.mo51188a("locale", a);
            jVar.mo51188a("enterfrom", "switchtoproaccount");
            C6907h.onEventV3("set_up_by_email");
            if (!TextUtils.isEmpty(b.getEmail())) {
                jVar.mo51188a("email", b.getEmail());
                StringBuilder sb = new StringBuilder();
                sb.append(jVar.mo51184a());
                sb.append("#verify-email");
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jVar.mo51184a());
                sb2.append("#bind-email");
                str2 = sb2.toString();
            }
            C22326e.m73920a(getActivity(), str2, true);
        }
    }

    /* renamed from: e */
    private void m72014e(View view) {
        this.f57642t = (TextView) view.findViewById(R.id.a3u);
        this.f57643u = (PressFadeLinearLayout) view.findViewById(R.id.a3r);
        this.f57644v = (TextView) view.findViewById(R.id.a3s);
        this.f57636n = (EditText) view.findViewById(R.id.age);
        this.f57637o = (LoginButton) view.findViewById(R.id.qm);
        this.f57637o.setLoginBackgroundRes(R.drawable.baw);
        this.f57637o.setLoadingBackground(R.drawable.bba);
        this.f57638p = (DmtButton) view.findViewById(R.id.r1);
        this.f57639q = (ImageView) view.findViewById(R.id.ww);
        this.f57645w = (TextView) view.findViewById(R.id.dh4);
        this.f57629C = (TextView) view.findViewById(R.id.dic);
        this.f57633G = (DmtStatusView) view.findViewById(R.id.dav);
        this.f57633G.setBuilder(C10803a.m31631a(getContext()));
        this.f57632F = (DmtTextView) view.findViewById(R.id.e8h);
        if ("third_party_login".equals(mo57511g()) && this.f57406e != null) {
            this.f57406e.setVisibility(4);
        }
        if ("third_party_login".equals(mo57511g()) && this.f57407f != null) {
            this.f57407f.setVisibility(0);
        }
        int i = 8;
        if (TextUtils.equals(this.f57641s, "enter_from_bind_pre_account")) {
            this.f57637o.setVisibility(8);
            this.f57638p.setVisibility(0);
            this.f57638p.setEnabled(false);
            this.f57632F.setVisibility(0);
            String a = C1642a.m8034a(getString(R.string.dpx), new Object[]{getString(R.string.dpv)});
            SpannableString spannableString = new SpannableString(a);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.lo)), a.length() - getString(R.string.dpv).length(), a.length(), 33);
            this.f57632F.setText(spannableString);
            this.f57632F.setOnClickListener(new C21535y(this));
            ((SendVerificationCodeActivity) getActivity()).f57354c = new C21536z(this);
        }
        this.f57643u.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MusInputPhoneFragment.this.getActivity().startActivity(new Intent(MusInputPhoneFragment.this.getActivity(), MusCountryListActivity.class));
            }
        });
        View findViewById = view.findViewById(R.id.qn);
        View findViewById2 = view.findViewById(R.id.qo);
        C23487o.m77144a((TextView) findViewById2, (int) R.drawable.akc);
        findViewById2.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                boolean z;
                ClickInstrumentation.onClick(view);
                if (MusInputPhoneFragment.this.getArguments() == null) {
                    z = true;
                } else {
                    z = MusInputPhoneFragment.this.getArguments().getBoolean("need_auto_fill_latest_login_info", true);
                }
                BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(BaseMusPasswordLoginFragment.class, MusInputPhoneFragment.this.getArguments()).mo58757a("need_auto_fill_account_name", z).mo58756a("enter_type", MusInputPhoneFragment.this.f57413m).mo58753a();
                if (baseMusLoginFragment != null) {
                    C6907h.m21524a("switch_to_email", (Map) null);
                }
                baseMusLoginFragment.mo57501a(MusInputPhoneFragment.this.f57409h);
                MusInputPhoneFragment.this.mo57503b(baseMusLoginFragment, true);
            }
        });
        findViewById2.setOnTouchListener(new C34032a(0.5f, 150, null));
        if (this.f57640r != null && !TextUtils.isEmpty(this.f57640r.mo57453d())) {
            this.f57629C.setText(this.f57640r.mo57453d());
            findViewById.setVisibility(8);
            View findViewById3 = view.findViewById(R.id.mh);
            if (this.f57640r.mo57456f()) {
                i = 0;
            }
            findViewById3.setVisibility(i);
            if (!TextUtils.isEmpty(this.f57640r.mo57455e())) {
                ((TextView) view.findViewById(R.id.mh)).setText(this.f57640r.mo57455e());
            }
        }
        this.f57637o.setOnClickListener(new C21492aa(this));
        this.f57638p.setOnClickListener(new C21493ab(this));
        this.f57636n.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                int i;
                if (TextUtils.equals(MusInputPhoneFragment.this.f57641s, "enter_from_bind_pre_account")) {
                    MusInputPhoneFragment.this.f57638p.setEnabled(!TextUtils.isEmpty(MusInputPhoneFragment.this.f57636n.getText()));
                } else {
                    MusInputPhoneFragment.this.f57637o.setEnabled(!TextUtils.isEmpty(MusInputPhoneFragment.this.f57636n.getText()));
                }
                ImageView imageView = MusInputPhoneFragment.this.f57639q;
                if (!MusInputPhoneFragment.this.f57636n.hasFocus() || TextUtils.isEmpty(editable.toString())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57636n.setFilters(new InputFilter[]{new InputFilter() {
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (charSequence == null) {
                    return null;
                }
                if (charSequence.length() > 1) {
                    return charSequence.toString().trim().replace("+", "").replace("-", "");
                }
                if (charSequence.length() <= 0 || charSequence.charAt(0) < '0' || charSequence.charAt(0) > '9') {
                    return "";
                }
                return charSequence;
            }
        }});
        this.f57636n.setOnFocusChangeListener(this.f57635J);
        this.f57639q.setOnClickListener(new C21494ac(this));
        if (this.f57640r != null) {
            m72016l();
        }
        this.f57630D.f57947a = this.f57636n;
        if (this.f57640r == null) {
            this.f57630D.mo57777c();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C21170a.m71338a((C21171a) this);
        m72014e(view);
        m72015k();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f57630D != null) {
            this.f57630D.mo57773a(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aee, viewGroup, false);
    }
}
