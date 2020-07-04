package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.api.C21109b;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p280ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker.C21160a;
import com.p280ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity;
import com.p280ss.android.ugc.aweme.account.login.C21640x;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.login.agegate.p953a.C21290a;
import com.p280ss.android.ugc.aweme.account.login.agegate.p953a.C21295f;
import com.p280ss.android.ugc.aweme.account.login.agegate.p953a.C21296g;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22151j;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21213a;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.account.util.C22323b;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.AgeGateFragment */
public final class AgeGateFragment extends BaseI18nLoginFragment implements C21160a, C21296g {

    /* renamed from: f */
    public C21295f f58991f;

    /* renamed from: g */
    public boolean f58992g;

    /* renamed from: h */
    public boolean f58993h = true;

    /* renamed from: i */
    public int f58994i;

    /* renamed from: k */
    private int f58995k = Step.AGE_GATE_SIGN_UP.getValue();

    /* renamed from: l */
    private String f58996l;

    /* renamed from: m */
    private String f58997m;

    /* renamed from: n */
    private int f58998n = -3001;

    /* renamed from: o */
    private boolean f58999o;

    /* renamed from: p */
    private HashMap f59000p;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.AgeGateFragment$a */
    static final class C22058a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AgeGateFragment f59001a;

        C22058a(AgeGateFragment ageGateFragment) {
            this.f59001a = ageGateFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C21671bd.m72538f().notifyFinish();
            if (this.f59001a.getActivity() != null) {
                FragmentActivity activity = this.f59001a.getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.AgeGateFragment$b */
    static final class C22059b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AgeGateFragment f59002a;

        C22059b(AgeGateFragment ageGateFragment) {
            this.f59002a = ageGateFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("choose_birthday_next", (Map) new C21102b().mo56946a("enter_method", this.f59002a.mo58341f()).f56672a);
            this.f59002a.f58994i = 0;
            AgeGateFragment.m73361a(this.f59002a).mo57297a(this.f59002a.f58992g, !this.f59002a.f58992g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.AgeGateFragment$c */
    static final class C22060c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AgeGateFragment f59003a;

        C22060c(AgeGateFragment ageGateFragment) {
            this.f59003a = ageGateFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Bundle arguments = this.f59003a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C7573i.m23582a((Object) arguments, "arguments ?: Bundle()");
            arguments.putBoolean("ftc_detect", this.f59003a.f58992g);
            arguments.putInt("age_gate_init_type", C22151j.m73595b(this.f59003a.mo58339d()));
            AgeGateFragment ageGateFragment = this.f59003a;
            arguments.putInt("next_page", Step.CREATE_ACCOUNT.getValue());
            ageGateFragment.mo58336a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.AgeGateFragment$d */
    static final class C22061d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AgeGateFragment f59004a;

        C22061d(AgeGateFragment ageGateFragment) {
            this.f59004a = ageGateFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Bundle arguments = this.f59004a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C7573i.m23582a((Object) arguments, "arguments ?: Bundle()");
            arguments.putInt("age_gate_init_type", C22151j.m73595b(this.f59004a.mo58339d()));
            AgeGateFragment ageGateFragment = this.f59004a;
            arguments.putInt("next_page", Step.CREATE_ACCOUNT.getValue());
            ageGateFragment.mo58336a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.AgeGateFragment$e */
    static final class C22062e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AgeGateFragment f59005a;

        C22062e(AgeGateFragment ageGateFragment) {
            this.f59005a = ageGateFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f59005a.getActivity() != null) {
                this.f59005a.f58993h = false;
                FragmentActivity activity = this.f59005a.getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59000p == null) {
            this.f59000p = new HashMap();
        }
        View view = (View) this.f59000p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59000p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59000p != null) {
            this.f59000p.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1c;
    }

    /* renamed from: q */
    public final void mo58418q() {
        ((LoadingButton) mo58338b(R.id.en)).mo58680b();
    }

    /* renamed from: r */
    public final void mo58419r() {
        ((LoadingButton) mo58338b(R.id.en)).mo58679a();
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f58991f != null) {
            C21295f fVar = this.f58991f;
            if (fVar == null) {
                C7573i.m23583a("mPresenter");
            }
            fVar.mo57298c();
        }
    }

    /* renamed from: u */
    private void m73362u() {
        C21297b.m71677a((DatePicker) mo58338b(R.id.em));
        ((DatePicker) mo58338b(R.id.em)).mo57060a((C21160a) this);
        mo58425a((LoadingButton) mo58338b(R.id.en), new C22059b(this));
        LoadingButton loadingButton = (LoadingButton) mo58338b(R.id.en);
        C7573i.m23582a((Object) loadingButton, "ageGateNextButton");
        loadingButton.setEnabled(false);
    }

    /* renamed from: v */
    private final void m73363v() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C7573i.m23582a((Object) arguments, "arguments ?: Bundle()");
        arguments.putInt("next_page", Step.FINISH.getValue());
        arguments.putInt("result_code", this.f58994i);
        mo58336a(arguments);
    }

    /* renamed from: l */
    public final boolean mo58346l() {
        if (this.f58992g || this.f58995k == Step.AGE_GATE.getValue()) {
            return true;
        }
        C22323b.m73915a("");
        if (this.f58993h) {
            new C21213a().mo57137b(this.f58996l).mo57135a("0").mo57138c(String.valueOf(this.f58998n)).mo57141b();
        }
        if (!this.f58999o) {
            return false;
        }
        m73363v();
        return true;
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        C22047a aVar = new C22047a(null, null, false, null, null, false, null, false, false, 511, null);
        if (!this.f58992g) {
            aVar.f58963a = getString(R.string.abj);
            aVar.f58967e = getString(R.string.cb9);
        } else {
            aVar.f58963a = null;
            aVar.f58967e = getString(R.string.cd2);
        }
        aVar.f58966d = getString(R.string.cb_);
        aVar.f58969g = "age_gate_homepage";
        return aVar;
    }

    /* renamed from: a */
    public final void mo57299a() {
        this.f58994i = -1;
        new C21213a().mo57137b(this.f58996l).mo57135a("1").mo57141b();
        boolean z = !C21297b.m71680c();
        C21295f fVar = this.f58991f;
        if (fVar == null) {
            C7573i.m23583a("mPresenter");
        }
        C25640a h = fVar.mo66539h();
        C7573i.m23582a((Object) h, "mPresenter.getModel()");
        C21640x.m72453a(z, (AgeGateResponse) ((C21290a) h).getData(), this.f58996l);
        if (this.f58999o) {
            m73363v();
            return;
        }
        if ((getActivity() instanceof SignUpOrLoginActivity) && this.f58995k != Step.AGE_GATE.getValue()) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                SignUpOrLoginActivity signUpOrLoginActivity = (SignUpOrLoginActivity) activity;
                C21295f fVar2 = this.f58991f;
                if (fVar2 == null) {
                    C7573i.m23583a("mPresenter");
                }
                C21290a aVar = (C21290a) fVar2.mo66539h();
                C7573i.m23582a((Object) aVar, "mPresenter.model");
                signUpOrLoginActivity.f58958a = (AgeGateResponse) aVar.getData();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
            }
        }
        m73364w();
    }

    /* renamed from: w */
    private final void m73364w() {
        if (this.f58995k == Step.AGE_GATE_SIGN_UP.getValue()) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C7573i.m23580a();
            }
            arguments.putInt("next_page", Step.PHONE_EMAIL_SIGN_UP.getValue());
            C7573i.m23582a((Object) arguments, "arguments!!.apply {\n    …N_UP.value)\n            }");
            mo58336a(arguments);
        } else if (this.f58995k == Step.AGE_GATE_LOGIN.getValue()) {
            PhoneNumber b = C21903c.f58624a.mo58353b((Fragment) this);
            BaseAccountFlowFragment baseAccountFlowFragment = this;
            String str = this.f58997m;
            if (str == null) {
                C7573i.m23580a();
            }
            C21931e.m73158a(baseAccountFlowFragment, b, str, Scene.SIGN_UP, mo58339d()).mo19273b();
        } else {
            if (this.f58995k == Step.AGE_GATE.getValue()) {
                C21295f fVar = this.f58991f;
                if (fVar == null) {
                    C7573i.m23583a("mPresenter");
                }
                C21290a aVar = (C21290a) fVar.mo66539h();
                C7573i.m23582a((Object) aVar, "mPresenter.model");
                if (((AgeGateResponse) aVar.getData()).is_prompt()) {
                    Intent intent = new Intent(getActivity(), DeleteVideoAlertActivity.class);
                    String str2 = "age_gate_response";
                    C21295f fVar2 = this.f58991f;
                    if (fVar2 == null) {
                        C7573i.m23583a("mPresenter");
                    }
                    C21290a aVar2 = (C21290a) fVar2.mo66539h();
                    C7573i.m23582a((Object) aVar2, "mPresenter.model");
                    intent.putExtra(str2, (Serializable) aVar2.getData());
                    startActivity(intent);
                    if (getActivity() != null) {
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            C7573i.m23580a();
                        }
                        activity.finish();
                    }
                } else {
                    C10741a aVar3 = new C10741a(getActivity());
                    aVar3.mo25649a((int) R.string.cd8);
                    aVar3.mo25657b((int) R.string.cd3);
                    aVar3.mo25650a((int) R.string.bc5, (OnClickListener) new C22058a(this));
                    aVar3.mo25656a().mo25637a().setCancelable(false);
                }
            } else if (this.f58995k == Step.THIRD_PARTY_FTC_AGE_GATE.getValue() && getActivity() != null) {
                Intent intent2 = new Intent();
                String str3 = "age_gate_response";
                C21295f fVar3 = this.f58991f;
                if (fVar3 == null) {
                    C7573i.m23583a("mPresenter");
                }
                C21290a aVar4 = (C21290a) fVar3.mo66539h();
                C7573i.m23582a((Object) aVar4, "mPresenter.model");
                intent2.putExtra(str3, (Serializable) aVar4.getData());
                FragmentActivity activity2 = getActivity();
                if (activity2 == null) {
                    C7573i.m23580a();
                }
                activity2.setResult(-1, intent2);
                FragmentActivity activity3 = getActivity();
                if (activity3 == null) {
                    C7573i.m23580a();
                }
                activity3.finish();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C21295f m73361a(AgeGateFragment ageGateFragment) {
        C21295f fVar = ageGateFragment.f58991f;
        if (fVar == null) {
            C7573i.m23583a("mPresenter");
        }
        return fVar;
    }

    /* renamed from: a */
    public final void mo57301a(boolean z) {
        if (isViewValid()) {
            if (z) {
                ((LoadingButton) mo58338b(R.id.en)).mo58679a();
                return;
            }
            ((LoadingButton) mo58338b(R.id.en)).mo58680b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r5 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            java.lang.String r5 = "compliance_setting"
            com.bytedance.keva.Keva r5 = com.bytedance.keva.Keva.getRepo(r5)
            java.lang.String r0 = "need_to_show_ftc_age_gate_but_no_showed"
            r1 = 0
            r5.storeBoolean(r0, r1)
            com.ss.android.ugc.aweme.account.login.v2.base.Step r5 = r4.mo58339d()
            com.ss.android.ugc.aweme.account.login.v2.base.Step r0 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.THIRD_PARTY_AGE_GATE
            r2 = 1
            if (r5 != r0) goto L_0x0031
            android.os.Bundle r5 = r4.getArguments()
            if (r5 == 0) goto L_0x0028
            java.lang.String r0 = "platform"
            java.lang.String r3 = ""
            java.lang.String r5 = r5.getString(r0, r3)
            if (r5 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r5 = ""
        L_0x002a:
            r4.f58996l = r5
            r4.f58999o = r2
            r4.f58993h = r1
            goto L_0x0064
        L_0x0031:
            android.os.Bundle r5 = r4.getArguments()
            if (r5 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.account.login.v2.base.Step r0 = r4.mo58339d()
            int r0 = r0.getValue()
            r4.f58995k = r0
            java.lang.String r0 = "sms_code_key"
            java.lang.String r3 = ""
            java.lang.String r0 = r5.getString(r0, r3)
            r4.f58997m = r0
            java.lang.String r0 = "ftc_detect"
            boolean r5 = r5.getBoolean(r0, r1)
            r4.f58992g = r5
        L_0x0053:
            int r5 = r4.f58995k
            com.ss.android.ugc.aweme.account.login.v2.base.Step r0 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.AGE_GATE_LOGIN
            int r0 = r0.getValue()
            if (r5 != r0) goto L_0x0060
            java.lang.String r5 = "sms_verification"
            goto L_0x0062
        L_0x0060:
            java.lang.String r5 = "phone"
        L_0x0062:
            r4.f58996l = r5
        L_0x0064:
            boolean r5 = com.p280ss.android.ugc.aweme.account.login.agegate.C21297b.m71680c()
            r5 = r5 ^ r2
            java.lang.String r0 = r4.f58996l
            com.p280ss.android.ugc.aweme.account.login.C21640x.m72454a(r5, r0)
            com.ss.android.ugc.aweme.account.i.b r5 = new com.ss.android.ugc.aweme.account.i.b
            r5.<init>()
            java.lang.String r0 = r4.f58996l
            com.ss.android.ugc.aweme.account.i.b r5 = r5.mo57139a(r0)
            r5.mo57141b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.AgeGateFragment.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo57300a(Exception exc) {
        if (isViewValid() && getActivity() != null) {
            if (this.f58999o) {
                C21109b.m71181a(getActivity(), exc);
                this.f58994i = -99;
                new C21213a().mo57137b(this.f58996l).mo57135a("0").mo57141b();
                if (exc instanceof ApiServerException) {
                    m73363v();
                }
            } else if (exc instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) exc;
                this.f58998n = apiServerException.getErrorCode();
                C10761a.m31403c((Context) getActivity(), apiServerException.getErrorMsg()).mo25750a();
                C21640x.m72453a(!C21297b.m71680c(), new AgeGateResponse(apiServerException.getErrorCode(), apiServerException.getErrorMsg(), false, false), this.f58996l);
            } else {
                C21295f fVar = this.f58991f;
                if (fVar == null) {
                    C7573i.m23583a("mPresenter");
                }
                C21290a aVar = (C21290a) fVar.mo66539h();
                C7573i.m23582a((Object) aVar, "mPresenter.model");
                if (aVar.getData() == null) {
                    C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                    C21640x.m72453a(!C21297b.m71680c(), null, this.f58996l);
                    return;
                }
                C21295f fVar2 = this.f58991f;
                if (fVar2 == null) {
                    C7573i.m23583a("mPresenter");
                }
                C21290a aVar2 = (C21290a) fVar2.mo66539h();
                C7573i.m23582a((Object) aVar2, "mPresenter.model");
                if (((AgeGateResponse) aVar2.getData()).getStatus_code() != 0) {
                    C21295f fVar3 = this.f58991f;
                    if (fVar3 == null) {
                        C7573i.m23583a("mPresenter");
                    }
                    C21290a aVar3 = (C21290a) fVar3.mo66539h();
                    C7573i.m23582a((Object) aVar3, "mPresenter.model");
                    this.f58998n = ((AgeGateResponse) aVar3.getData()).getStatus_code();
                    C21295f fVar4 = this.f58991f;
                    if (fVar4 == null) {
                        C7573i.m23583a("mPresenter");
                    }
                    C21290a aVar4 = (C21290a) fVar4.mo66539h();
                    C7573i.m23582a((Object) aVar4, "mPresenter.model");
                    String status_msg = ((AgeGateResponse) aVar4.getData()).getStatus_msg();
                    if (!TextUtils.isEmpty(status_msg)) {
                        C10761a.m31403c((Context) getActivity(), status_msg).mo25750a();
                    }
                    C21640x.m72453a(!C21297b.m71680c(), new AgeGateResponse(this.f58998n, status_msg, false, false), this.f58996l);
                    return;
                }
                if ((getActivity() instanceof SignUpOrLoginActivity) && this.f58995k != Step.AGE_GATE.getValue()) {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        SignUpOrLoginActivity signUpOrLoginActivity = (SignUpOrLoginActivity) activity;
                        C21295f fVar5 = this.f58991f;
                        if (fVar5 == null) {
                            C7573i.m23583a("mPresenter");
                        }
                        C21290a aVar5 = (C21290a) fVar5.mo66539h();
                        C7573i.m23582a((Object) aVar5, "mPresenter.model");
                        signUpOrLoginActivity.f58958a = (AgeGateResponse) aVar5.getData();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                    }
                }
                if (!C21297b.m71680c()) {
                    boolean z = !C21297b.m71680c();
                    C21295f fVar6 = this.f58991f;
                    if (fVar6 == null) {
                        C7573i.m23583a("mPresenter");
                    }
                    C21290a aVar6 = (C21290a) fVar6.mo66539h();
                    C7573i.m23582a((Object) aVar6, "mPresenter.model");
                    C21640x.m72453a(z, (AgeGateResponse) aVar6.getData(), this.f58996l);
                    C10741a aVar7 = new C10741a(getActivity());
                    if (this.f58992g) {
                        aVar7.mo25649a((int) R.string.cd8);
                        aVar7.mo25657b((int) R.string.cd3);
                        aVar7.mo25650a((int) R.string.bc5, (OnClickListener) new C22060c(this));
                    } else {
                        aVar7.mo25649a((int) R.string.b_x);
                        aVar7.mo25657b((int) R.string.cba);
                        aVar7.mo25650a((int) R.string.ur, (OnClickListener) new C22061d(this));
                        if (getActivity() != null && this.f58995k == Step.THIRD_PARTY_FTC_AGE_GATE.getValue()) {
                            Intent intent = new Intent();
                            String str = "age_gate_response";
                            C21295f fVar7 = this.f58991f;
                            if (fVar7 == null) {
                                C7573i.m23583a("mPresenter");
                            }
                            C21290a aVar8 = (C21290a) fVar7.mo66539h();
                            C7573i.m23582a((Object) aVar8, "mPresenter.model");
                            intent.putExtra(str, (Serializable) aVar8.getData());
                            FragmentActivity activity2 = getActivity();
                            if (activity2 == null) {
                                C7573i.m23580a();
                            }
                            activity2.setResult(-99, intent);
                        }
                    }
                    aVar7.mo25656a().mo25637a().setCancelable(false);
                    return;
                }
                C10741a aVar9 = new C10741a(getActivity());
                aVar9.mo25657b((int) R.string.cb7);
                aVar9.mo25650a((int) R.string.cql, (OnClickListener) new C22062e(this));
                aVar9.mo25656a().mo25637a().setCancelable(false);
                new C21213a().mo57137b(this.f58996l).mo57135a("0").mo57138c("56004").mo57141b();
            }
        }
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
        C10761a.m31403c(getContext(), str).mo25750a();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f58991f = new C21295f();
        C21295f fVar = this.f58991f;
        if (fVar == null) {
            C7573i.m23583a("mPresenter");
        }
        fVar.mo57295a((C21296g) this);
        m73362u();
    }

    /* renamed from: a */
    public final void mo57070a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar) {
        C21295f fVar = this.f58991f;
        if (fVar == null) {
            C7573i.m23583a("mPresenter");
        }
        fVar.mo57294a(i, i2, i3);
        LoadingButton loadingButton = (LoadingButton) mo58338b(R.id.en);
        C7573i.m23582a((Object) loadingButton, "ageGateNextButton");
        loadingButton.setEnabled(true);
    }
}
