package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12825h;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p960b.C21369a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.AccountKeyBoardHelper.C22035a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22048b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.HintListManager.C22040a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22033a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22034b;
import com.p280ss.android.ugc.aweme.account.p982ui.InputWithIndicator;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment */
public final class InputEmailFragment extends BaseI18nLoginFragment {

    /* renamed from: f */
    public EditText f59080f;

    /* renamed from: g */
    private HashMap f59081g;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment$a */
    public static final class C22099a extends C23467g {

        /* renamed from: a */
        final /* synthetic */ InputEmailFragment f59082a;

        C22099a(InputEmailFragment inputEmailFragment) {
            this.f59082a = inputEmailFragment;
        }

        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            LoadingButton loadingButton = (LoadingButton) this.f59082a.mo58338b(R.id.b1k);
            C7573i.m23582a((Object) loadingButton, "inputEmailLoadingBtn");
            loadingButton.setEnabled(!TextUtils.isEmpty(InputEmailFragment.m73473a(this.f59082a).getText()));
            View b = this.f59082a.mo58338b(R.id.b1j);
            C7573i.m23582a((Object) b, "inputEmailInclude");
            ((InputResultIndicator) b.findViewById(R.id.b1w)).mo58394a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment$b */
    static final class C22100b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputEmailFragment f59083a;

        C22100b(InputEmailFragment inputEmailFragment) {
            this.f59083a = inputEmailFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59083a.mo57299a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment$c */
    static final class C22101c<T> implements C7326g<C12710e<C12825h>> {

        /* renamed from: a */
        final /* synthetic */ InputEmailFragment f59084a;

        /* renamed from: b */
        final /* synthetic */ String f59085b;

        C22101c(InputEmailFragment inputEmailFragment, String str) {
            this.f59084a = inputEmailFragment;
            this.f59085b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12825h> eVar) {
            this.f59084a.mo58446a(this.f59085b, true);
        }
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59081g == null) {
            this.f59081g = new HashMap();
        }
        View view = (View) this.f59081g.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59081g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59081g != null) {
            this.f59081g.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1i;
    }

    /* renamed from: q */
    public final void mo58418q() {
        ((LoadingButton) mo58338b(R.id.b1k)).mo58680b();
    }

    /* renamed from: r */
    public final void mo58419r() {
        ((LoadingButton) mo58338b(R.id.b1k)).mo58679a();
    }

    public final void ad_() {
        super.ad_();
        RecyclerView recyclerView = (RecyclerView) mo58338b(R.id.b1i);
        C7573i.m23582a((Object) recyclerView, "inputEmailDomainHint");
        recyclerView.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo58427c() {
        super.mo58427c();
        RecyclerView recyclerView = (RecyclerView) mo58338b(R.id.b1i);
        C7573i.m23582a((Object) recyclerView, "inputEmailDomainHint");
        recyclerView.setVisibility(0);
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        C22047a aVar = new C22047a(getString(R.string.ac4), null, false, getString(R.string.ccv), getString(R.string.abu), true, "reset_email_input", false, true, 134, null);
        return aVar;
    }

    public final void onResume() {
        super.onResume();
        if (C22035a.m73321a()) {
            EditText editText = this.f59080f;
            if (editText == null) {
                C7573i.m23583a("emailInput");
            }
            C22048b.m73350a(editText);
            return;
        }
        EditText editText2 = this.f59080f;
        if (editText2 == null) {
            C7573i.m23583a("emailInput");
        }
        editText2.requestFocus();
    }

    /* renamed from: a */
    public final void mo57299a() {
        EditText editText = this.f59080f;
        if (editText == null) {
            C7573i.m23583a("emailInput");
        }
        String obj = editText.getText().toString();
        C22034b a = C22033a.m73316a(getActivity(), obj, mo58344j());
        if (a != null) {
            C21866f fVar = a.f58908a;
            if (fVar != null && fVar.mo58295e()) {
                mo58446a(obj, false);
                return;
            }
        }
        if (!C21369a.m71856a(obj)) {
            View b = mo58338b(R.id.b1j);
            C7573i.m23582a((Object) b, "inputEmailInclude");
            InputResultIndicator inputResultIndicator = (InputResultIndicator) b.findViewById(R.id.b1w);
            String string = getString(R.string.acu);
            C7573i.m23582a((Object) string, "getString(R.string.commo…ration_email_input_error)");
            inputResultIndicator.mo58395a(string);
            return;
        }
        C21931e.m73161a((BaseAccountFlowFragment) this, obj, 4, false, (String) null).mo19278c((C7326g<? super T>) new C22101c<Object>(this, obj)).mo19273b();
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m73473a(InputEmailFragment inputEmailFragment) {
        EditText editText = inputEmailFragment.f59080f;
        if (editText == null) {
            C7573i.m23583a("emailInput");
        }
        return editText;
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
        View b = mo58338b(R.id.b1j);
        C7573i.m23582a((Object) b, "inputEmailInclude");
        ((InputResultIndicator) b.findViewById(R.id.b1w)).mo58395a(str);
    }

    /* renamed from: a */
    public final void mo58446a(String str, boolean z) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C21903c.m73115a((Fragment) this, str);
        arguments.putBoolean("code_sent", z);
        arguments.putInt("next_page", Step.EMAIL_SMS_FIND_PASSWORD.getValue());
        C7573i.m23582a((Object) arguments, "(arguments ?: Bundle()).…PASSWORD.value)\n        }");
        mo58336a(arguments);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59080f = ((InputWithIndicator) mo58338b(R.id.b1v)).getEditText();
        EditText editText = this.f59080f;
        if (editText == null) {
            C7573i.m23583a("emailInput");
        }
        editText.setInputType(32);
        editText.addTextChangedListener(new C22099a(this));
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.abt));
        String a = C21903c.f58624a.mo58352a((Fragment) this);
        CharSequence charSequence = a;
        if (!TextUtils.isEmpty(charSequence)) {
            editText.setText(charSequence);
            editText.setSelection(a.length());
        }
        mo58425a((LoadingButton) mo58338b(R.id.b1k), new C22100b(this));
        RecyclerView recyclerView = (RecyclerView) mo58338b(R.id.b1i);
        C7573i.m23582a((Object) recyclerView, "inputEmailDomainHint");
        EditText editText2 = this.f59080f;
        if (editText2 == null) {
            C7573i.m23583a("emailInput");
        }
        C22040a.m73330a(recyclerView, editText2, mo58340e(), mo58341f());
        mo58345k();
    }
}
