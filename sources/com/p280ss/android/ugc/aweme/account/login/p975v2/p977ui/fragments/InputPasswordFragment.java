package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22048b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22051d;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p982ui.InputWithIndicator;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment */
public final class InputPasswordFragment extends BaseI18nLoginFragment {

    /* renamed from: f */
    public EditText f59086f;

    /* renamed from: g */
    private HashMap f59087g;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment$a */
    public static final class C22102a extends C23467g {

        /* renamed from: a */
        final /* synthetic */ InputPasswordFragment f59088a;

        C22102a(InputPasswordFragment inputPasswordFragment) {
            this.f59088a = inputPasswordFragment;
        }

        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            LoadingButton loadingButton = (LoadingButton) this.f59088a.mo58338b(R.id.b1n);
            C7573i.m23582a((Object) loadingButton, "inputPasswordNextButton");
            loadingButton.setEnabled(!C22048b.m73351b(InputPasswordFragment.m73485a(this.f59088a)));
            View b = this.f59088a.mo58338b(R.id.b1m);
            C7573i.m23582a((Object) b, "inputPasswordInclude");
            ((InputResultIndicator) b.findViewById(R.id.b1w)).mo58394a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment$b */
    static final class C22103b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputPasswordFragment f59089a;

        C22103b(InputPasswordFragment inputPasswordFragment) {
            this.f59089a = inputPasswordFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            BaseAccountFlowFragment baseAccountFlowFragment = this.f59089a;
            String a = PhoneNumberUtil.m73058a(C21903c.f58624a.mo58353b((Fragment) this.f59089a));
            C7573i.m23582a((Object) a, "PhoneNumberUtil.formatNu…ataHelper.getPhone(this))");
            C21931e.m73166a(baseAccountFlowFragment, a, InputPasswordFragment.m73485a(this.f59089a).getText().toString(), "phone").mo19273b();
        }
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59087g == null) {
            this.f59087g = new HashMap();
        }
        View view = (View) this.f59087g.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59087g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59087g != null) {
            this.f59087g.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1j;
    }

    public final void onResume() {
        super.onResume();
        EditText editText = this.f59086f;
        if (editText == null) {
            C7573i.m23583a("passwordInput");
        }
        C22048b.m73350a(editText);
    }

    /* renamed from: q */
    public final void mo58418q() {
        ((LoadingButton) mo58338b(R.id.b1n)).mo58680b();
    }

    /* renamed from: r */
    public final void mo58419r() {
        ((LoadingButton) mo58338b(R.id.b1n)).mo58679a();
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        C22047a aVar = new C22047a(getString(R.string.aaw), null, false, getString(R.string.abo), " ", false, "phone_login_enter_password_page", false, false, 422, null);
        return aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m73485a(InputPasswordFragment inputPasswordFragment) {
        EditText editText = inputPasswordFragment.f59086f;
        if (editText == null) {
            C7573i.m23583a("passwordInput");
        }
        return editText;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6907h.m21524a("phone_login_enter_password", (Map) new C21102b().mo56946a("enter_method", mo58341f()).mo56946a("enter_type", mo58342g()).f56672a);
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
        View b = mo58338b(R.id.b1m);
        C7573i.m23582a((Object) b, "inputPasswordInclude");
        ((InputResultIndicator) b.findViewById(R.id.b1w)).mo58395a(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59086f = ((InputWithIndicator) mo58338b(R.id.b1v)).getEditText();
        EditText editText = this.f59086f;
        if (editText == null) {
            C7573i.m23583a("passwordInput");
        }
        editText.setInputType(129);
        editText.setHint(getString(R.string.cff));
        editText.addTextChangedListener(new C22102a(this));
        View b = mo58338b(R.id.b1l);
        C7573i.m23582a((Object) b, "inputPasswordForgot");
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
        C22051d.m73354a(b, activity2, baseAccountFlowFragment, str);
        mo58425a((LoadingButton) mo58338b(R.id.b1n), new C22103b(this));
    }
}
