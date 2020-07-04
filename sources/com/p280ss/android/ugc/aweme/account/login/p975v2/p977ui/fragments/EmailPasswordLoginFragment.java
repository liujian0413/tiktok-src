package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21642z;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p960b.C21369a;
import com.p280ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.AccountKeyBoardHelper.C22035a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22048b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22050c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22051d;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.p951l.C21237a;
import com.p280ss.android.ugc.aweme.account.p982ui.InputWithIndicator;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailPasswordLoginFragment */
public final class EmailPasswordLoginFragment extends BaseI18nLoginFragment implements OnClickListener, C22050c, C21642z {

    /* renamed from: i */
    public static final C22072a f59027i = new C22072a(null);

    /* renamed from: f */
    public EditText f59028f;

    /* renamed from: g */
    public EditText f59029g;

    /* renamed from: h */
    public boolean f59030h;

    /* renamed from: k */
    private boolean f59031k;

    /* renamed from: l */
    private String f59032l = "";

    /* renamed from: m */
    private boolean f59033m = true;

    /* renamed from: n */
    private HashMap f59034n;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailPasswordLoginFragment$a */
    public static final class C22072a {
        private C22072a() {
        }

        public /* synthetic */ C22072a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailPasswordLoginFragment$b */
    public static final class C22073b extends C23467g {

        /* renamed from: a */
        final /* synthetic */ EmailPasswordLoginFragment f59035a;

        C22073b(EmailPasswordLoginFragment emailPasswordLoginFragment) {
            this.f59035a = emailPasswordLoginFragment;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            super.afterTextChanged(editable);
            if (this.f59035a.isViewValid()) {
                LoadingButton loadingButton = (LoadingButton) this.f59035a.mo58338b((int) R.id.adb);
                C7573i.m23582a((Object) loadingButton, "emailLoginNextBtn");
                if (C22048b.m73351b(EmailPasswordLoginFragment.m73405a(this.f59035a)) || C22048b.m73351b(EmailPasswordLoginFragment.m73406b(this.f59035a))) {
                    z = false;
                } else {
                    z = true;
                }
                loadingButton.setEnabled(z);
                this.f59035a.mo58435u();
            }
        }
    }

    /* renamed from: v */
    private final void m73407v() {
        m73408w();
    }

    /* renamed from: X_ */
    public final boolean mo57516X_() {
        return this.f59033m;
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59034n == null) {
            this.f59034n = new HashMap();
        }
        View view = (View) this.f59034n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59034n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59034n != null) {
            this.f59034n.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1f;
    }

    public final void onResume() {
        super.onResume();
        if (this.f59031k) {
            m73408w();
        }
    }

    /* renamed from: q */
    public final void mo58418q() {
        LoadingButton loadingButton = (LoadingButton) mo58338b((int) R.id.adb);
        if (loadingButton != null) {
            loadingButton.mo58680b();
        }
    }

    /* renamed from: r */
    public final void mo58419r() {
        LoadingButton loadingButton = (LoadingButton) mo58338b((int) R.id.adb);
        if (loadingButton != null) {
            loadingButton.mo58679a();
        }
    }

    /* renamed from: a */
    public final String mo57299a() {
        EditText editText = this.f59028f;
        if (editText == null) {
            C7573i.m23583a("emailInput");
        }
        return editText.getText().toString();
    }

    /* renamed from: w */
    private final void m73408w() {
        EditText editText;
        EditText editText2 = this.f59028f;
        if (editText2 == null) {
            C7573i.m23583a("emailInput");
        }
        if (C22048b.m73351b(editText2)) {
            editText = this.f59028f;
            if (editText == null) {
                C7573i.m23583a("emailInput");
            }
        } else {
            editText = this.f59029g;
            if (editText == null) {
                C7573i.m23583a("passwordInput");
            }
        }
        if (C22035a.m73321a()) {
            C22048b.m73350a(editText);
        } else {
            editText.requestFocus();
        }
    }

    /* renamed from: u */
    public final void mo58435u() {
        View b = mo58338b((int) R.id.ada);
        C7573i.m23582a((Object) b, "emailLoginInclude");
        ((InputResultIndicator) b.findViewById(R.id.b1w)).mo58394a();
        ((InputResultIndicator) mo58338b((int) R.id.add)).mo58394a();
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        if (this.f59031k) {
            C22047a aVar = new C22047a(getString(R.string.aaw), null, false, getString(R.string.acr), getString(R.string.acq), false, "email_sign_up_to_login_enter_password_page", false, true, 166, null);
            return aVar;
        }
        C22047a aVar2 = new C22047a(null, null, false, null, null, false, "email_login_homepage", false, true, 191, null);
        return aVar2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m73405a(EmailPasswordLoginFragment emailPasswordLoginFragment) {
        EditText editText = emailPasswordLoginFragment.f59028f;
        if (editText == null) {
            C7573i.m23583a("emailInput");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditText m73406b(EmailPasswordLoginFragment emailPasswordLoginFragment) {
        EditText editText = emailPasswordLoginFragment.f59029g;
        if (editText == null) {
            C7573i.m23583a("passwordInput");
        }
        return editText;
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (isViewValid()) {
                m73407v();
                return;
            }
            this.f59030h = true;
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (mo58339d() == Step.EMAIL_PASSWORD_LOGIN) {
            z = true;
        } else {
            z = false;
        }
        this.f59031k = z;
        if (this.f59031k) {
            this.f59032l = C21903c.f58624a.mo58352a((Fragment) this);
            return;
        }
        if (!C21671bd.m72539g()) {
            BaseLoginMethod a = C21579s.m72305a(LoginMethodName.DEFAULT);
            if (a instanceof AccountPassLoginMethod) {
                this.f59032l = ((AccountPassLoginMethod) a).getName();
            }
        }
    }

    public final void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        this.f59033m = false;
        C21237a.m71490a(getContext());
        EditText editText = this.f59028f;
        if (editText == null) {
            C7573i.m23583a("emailInput");
        }
        String obj = editText.getText().toString();
        EditText editText2 = this.f59029g;
        if (editText2 == null) {
            C7573i.m23583a("passwordInput");
        }
        String obj2 = editText2.getText().toString();
        BaseAccountFlowFragment baseAccountFlowFragment = this;
        if (C21369a.m71856a(obj)) {
            str = "email";
        } else {
            str = "handle";
        }
        C21931e.m73166a(baseAccountFlowFragment, obj, obj2, str).mo19273b();
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
        View b = mo58338b((int) R.id.ada);
        C7573i.m23582a((Object) b, "emailLoginInclude");
        ((InputResultIndicator) b.findViewById(R.id.b1w)).mo58396b();
        ((InputResultIndicator) mo58338b((int) R.id.add)).mo58395a(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        View b = mo58338b((int) R.id.ada);
        C7573i.m23582a((Object) b, "emailLoginInclude");
        this.f59028f = ((InputWithIndicator) b.findViewById(R.id.b1v)).getEditText();
        this.f59029g = ((InputWithIndicator) mo58338b((int) R.id.adc)).getEditText();
        C22073b bVar = new C22073b(this);
        EditText editText = this.f59028f;
        if (editText == null) {
            C7573i.m23583a("emailInput");
        }
        editText.setInputType(32);
        editText.setHint(getString(R.string.aan));
        TextWatcher textWatcher = bVar;
        editText.addTextChangedListener(textWatcher);
        if (!TextUtils.isEmpty(this.f59032l)) {
            editText.setText(this.f59032l);
            editText.setSelection(this.f59032l.length());
        }
        if (this.f59031k) {
            editText.setEnabled(false);
        }
        EditText editText2 = this.f59029g;
        if (editText2 == null) {
            C7573i.m23583a("passwordInput");
        }
        editText2.setInputType(129);
        editText2.setTypeface(Typeface.DEFAULT);
        editText2.setTransformationMethod(new PasswordTransformationMethod());
        editText2.setHint(getString(R.string.cff));
        editText2.addTextChangedListener(textWatcher);
        View b2 = mo58338b((int) R.id.ad_);
        C7573i.m23582a((Object) b2, "emailLoginForgotPassword");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        Activity activity2 = activity;
        BaseAccountFlowFragment baseAccountFlowFragment = this;
        C22047a aVar = this.f59008j;
        if (aVar == null) {
            C7573i.m23580a();
        }
        String str = aVar.f58969g;
        if (str == null) {
            C7573i.m23580a();
        }
        C22051d.m73354a(b2, activity2, baseAccountFlowFragment, str);
        mo58425a((LoadingButton) mo58338b((int) R.id.adb), this);
        if (this.f59030h) {
            m73407v();
        }
    }
}
