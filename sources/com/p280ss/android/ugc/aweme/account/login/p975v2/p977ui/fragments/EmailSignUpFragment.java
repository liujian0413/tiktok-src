package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.sdk.account.p662f.p663a.C12822e;
import com.p280ss.android.ugc.aweme.account.C21173f;
import com.p280ss.android.ugc.aweme.account.base.p939a.C21118a;
import com.p280ss.android.ugc.aweme.account.login.C21278ac;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p960b.C21369a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.HintListManager;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.HintListManager.C22040a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p982ui.InputWithIndicator;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment */
public final class EmailSignUpFragment extends BaseI18nLoginFragment {

    /* renamed from: f */
    public static final C22074a f59036f = new C22074a(null);

    /* renamed from: g */
    private HintListManager f59037g;

    /* renamed from: h */
    private HashMap f59038h;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment$a */
    public static final class C22074a {
        private C22074a() {
        }

        public /* synthetic */ C22074a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m73428a(Integer num, String str) {
            int i;
            C7573i.m23587b(str, "enterMethod");
            C21102b a = new C21102b().mo56946a("platform", "email").mo56946a("enter_method", str);
            String str2 = "is_success";
            if (num != null && num.intValue() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            C21102b a2 = a.mo56944a(str2, i).mo56944a("is_register", 1);
            if (num == null) {
                a2.mo56946a("error_code", "");
            } else {
                a2.mo56944a("error_code", num.intValue());
            }
            C6907h.m21524a("register_click_next_result", (Map) a2.f56672a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment$b */
    static final class C22075b<T> implements C7326g<C12822e> {

        /* renamed from: a */
        final /* synthetic */ EmailSignUpFragment f59039a;

        C22075b(EmailSignUpFragment emailSignUpFragment) {
            this.f59039a = emailSignUpFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12822e eVar) {
            String str;
            C21903c.m73115a((Fragment) this.f59039a, ((InputWithIndicator) this.f59039a.mo58338b(R.id.adi)).getText());
            StringBuilder sb = new StringBuilder();
            sb.append(((InputWithIndicator) this.f59039a.mo58338b(R.id.adi)).getText());
            sb.append(" is ");
            C7573i.m23582a((Object) eVar, "it");
            if (eVar.mo31360a()) {
                str = "not available";
            } else {
                str = "available";
            }
            sb.append(str);
            if (eVar.mo31360a()) {
                EmailSignUpFragment emailSignUpFragment = this.f59039a;
                Bundle arguments = this.f59039a.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", Step.EMAIL_PASSWORD_LOGIN.getValue());
                C7573i.m23582a((Object) arguments, "(arguments ?: Bundle()).…                        }");
                emailSignUpFragment.mo58336a(arguments);
            } else {
                EmailSignUpFragment emailSignUpFragment2 = this.f59039a;
                Bundle arguments2 = this.f59039a.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                arguments2.putInt("next_page", Step.CREATE_PASSWORD_FOR_EMAIL.getValue());
                C7573i.m23582a((Object) arguments2, "(arguments ?: Bundle()).…                        }");
                emailSignUpFragment2.mo58336a(arguments2);
            }
            C22074a.m73428a(Integer.valueOf(0), this.f59039a.mo58341f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment$c */
    static final class C22076c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EmailSignUpFragment f59040a;

        C22076c(EmailSignUpFragment emailSignUpFragment) {
            this.f59040a = emailSignUpFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("register_click_next", (Map) new C21102b().mo56946a("platform", "email").mo56946a("enter_method", this.f59040a.mo58341f()).f56672a);
            if (C21369a.m71855a((CharSequence) ((InputWithIndicator) this.f59040a.mo58338b(R.id.adi)).getText())) {
                ((InputResultIndicator) this.f59040a.mo58338b(R.id.adj)).mo58394a();
                this.f59040a.mo57299a();
                return;
            }
            EmailSignUpFragment emailSignUpFragment = this.f59040a;
            String string = this.f59040a.getString(R.string.acu);
            C7573i.m23582a((Object) string, "getString(R.string.commo…ration_email_input_error)");
            emailSignUpFragment.mo58335a(0, string);
            C22074a.m73428a(null, this.f59040a.mo58341f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment$d */
    public static final class C22077d extends C21173f {

        /* renamed from: a */
        final /* synthetic */ EmailSignUpFragment f59041a;

        C22077d(EmailSignUpFragment emailSignUpFragment) {
            this.f59041a = emailSignUpFragment;
        }

        public final void afterTextChanged(Editable editable) {
            ((InputResultIndicator) this.f59041a.mo58338b(R.id.adj)).mo58394a();
            LoadingButton loadingButton = (LoadingButton) this.f59041a.mo58338b(R.id.adf);
            C7573i.m23582a((Object) loadingButton, "emailSignUpContinueBtn");
            boolean z = false;
            if (editable != null) {
                String obj = editable.toString();
                if (obj != null && obj.length() > 0) {
                    z = true;
                }
            }
            loadingButton.setEnabled(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment$e */
    static final class C22078e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EmailSignUpFragment f59042a;

        C22078e(EmailSignUpFragment emailSignUpFragment) {
            this.f59042a = emailSignUpFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42951au.m136342a(C21118a.m71202a((Context) this.f59042a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment$f */
    static final class C22079f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EmailSignUpFragment f59043a;

        C22079f(EmailSignUpFragment emailSignUpFragment) {
            this.f59043a = emailSignUpFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42951au.m136342a(C21118a.m71203b(this.f59043a.getActivity()));
        }
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59038h == null) {
            this.f59038h = new HashMap();
        }
        View view = (View) this.f59038h.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59038h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59038h != null) {
            this.f59038h.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1g;
    }

    /* renamed from: q */
    public final void mo58418q() {
        ((LoadingButton) mo58338b(R.id.adf)).mo58680b();
    }

    /* renamed from: r */
    public final void mo58419r() {
        ((LoadingButton) mo58338b(R.id.adf)).mo58679a();
    }

    public final void ad_() {
        super.ad_();
        RecyclerView recyclerView = (RecyclerView) mo58338b(R.id.adh);
        C7573i.m23582a((Object) recyclerView, "emailSignUpDomainList");
        recyclerView.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo58427c() {
        super.mo58427c();
        RecyclerView recyclerView = (RecyclerView) mo58338b(R.id.adh);
        C7573i.m23582a((Object) recyclerView, "emailSignUpDomainList");
        recyclerView.setVisibility(0);
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        C22047a aVar = new C22047a(null, null, false, null, null, true, null, false, true, 223, null);
        return aVar;
    }

    /* renamed from: a */
    public final void mo57299a() {
        C21931e.m73162a((BaseAccountFlowFragment) this, ((InputWithIndicator) mo58338b(R.id.adi)).getText(), Scene.SIGN_UP, mo58339d()).mo19278c((C7326g<? super T>) new C22075b<Object>(this)).mo19273b();
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
        ((InputResultIndicator) mo58338b(R.id.adj)).mo58395a(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        mo58425a((LoadingButton) mo58338b(R.id.adf), new C22076c(this));
        ((InputWithIndicator) mo58338b(R.id.adi)).setTextWatcher(new C22077d(this));
        C21278ac.m71641a(getContext(), (DmtTextView) mo58338b(R.id.adg), new C22078e(this), new C22079f(this), false);
        RecyclerView recyclerView = (RecyclerView) mo58338b(R.id.adh);
        C7573i.m23582a((Object) recyclerView, "emailSignUpDomainList");
        this.f59037g = C22040a.m73330a(recyclerView, ((InputWithIndicator) mo58338b(R.id.adi)).getEditText(), mo58340e(), mo58341f());
        ((InputWithIndicator) mo58338b(R.id.adi)).getEditText().setNextFocusDownId(((InputWithIndicator) mo58338b(R.id.adi)).getEditText().getId());
    }
}
