package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.mobilelib.present.CommonPresent;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.C21885a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21171a;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BasePhoneNumberInputFragment */
public abstract class BasePhoneNumberInputFragment<T extends CommonPresent> extends BasePhoneNumberFragment<T> implements C21171a {

    /* renamed from: e */
    private TextWatcher f58331e;

    /* renamed from: m */
    protected View f58332m;

    /* renamed from: n */
    protected TextView f58333n;

    /* renamed from: o */
    public EditText f58334o;

    /* renamed from: p */
    protected View f58335p;

    /* renamed from: q */
    private C23467g f58336q = new C23467g() {
        public final void afterTextChanged(Editable editable) {
            if (BasePhoneNumberInputFragment.this.isViewValid()) {
                if (editable.length() > 0) {
                    BasePhoneNumberInputFragment.this.f58335p.setVisibility(0);
                } else {
                    BasePhoneNumberInputFragment.this.f58335p.setVisibility(8);
                }
                BasePhoneNumberInputFragment.this.mo58145a(editable.toString());
                StringBuilder sb = new StringBuilder();
                int length = editable.length();
                for (int i = 0; i < length; i++) {
                    int digit = Character.digit(editable.charAt(i), 10);
                    if (digit != -1) {
                        sb.append(digit);
                    }
                }
                if (sb.length() == 0) {
                    BasePhoneNumberInputFragment.this.mo58144a(0);
                } else {
                    try {
                        BasePhoneNumberInputFragment.this.mo58144a(Long.parseLong(sb.toString(), 10));
                    } catch (NumberFormatException unused) {
                    }
                }
                BasePhoneNumberInputFragment.this.mo58148l();
                BasePhoneNumberInputFragment.this.mo58154c(editable.toString());
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo58154c(String str) {
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo57105a() {
        if (getActivity() != null) {
            getActivity().startActivity(new Intent(getActivity(), CountryListActivity.class));
        }
    }

    public void onResume() {
        super.onResume();
        mo57106d();
        mo58626a(mo58151o(), mo58149m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo58156r() {
        if (this.f58332m != null) {
            this.f58332m.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (BasePhoneNumberInputFragment.this.isViewValid()) {
                        BasePhoneNumberInputFragment.this.mo57105a();
                    }
                }
            });
        }
        if (this.f58335p != null) {
            this.f58335p.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    BasePhoneNumberInputFragment.this.f58334o.setText("");
                }
            });
        }
    }

    /* renamed from: d */
    private void mo57106d() {
        if (isViewValid() && this.f58334o != null) {
            if (this.f58331e != null) {
                this.f58334o.removeTextChangedListener(this.f58331e);
            }
            this.f58331e = mo58172e(mo58150n());
            this.f58334o.addTextChangedListener(this.f58331e);
            if (this.f58336q != null) {
                this.f58334o.removeTextChangedListener(this.f58336q);
                this.f58334o.addTextChangedListener(this.f58336q);
            }
        }
    }

    /* renamed from: e */
    private static TextWatcher mo58172e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (VERSION.SDK_INT >= 21) {
            return new PhoneNumberFormattingTextWatcher(str);
        }
        return new C21885a();
    }

    /* renamed from: a */
    public final void mo57095a(C21566a aVar) {
        if (aVar != null) {
            mo58146b(aVar.f57900c);
            mo58143a(aVar.mo57751a());
            mo57106d();
            mo58148l();
            mo58626a(mo58151o(), mo58149m());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Bundle mo58155d(String str) {
        Bundle bundle;
        if (getArguments() == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(getArguments());
        }
        bundle.putString("platform", "mobile");
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("login_path", str);
        }
        return bundle;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C21170a.m71338a((C21171a) this);
    }

    /* renamed from: a */
    private void mo58626a(int i, String str) {
        if (isViewValid()) {
            if (this.f58333n != null) {
                TextView textView = this.f58333n;
                StringBuilder sb = new StringBuilder("+");
                sb.append(String.valueOf(i));
                textView.setText(sb.toString());
            }
            if (this.f58334o != null) {
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Editable text = this.f58334o.getText();
                if (text != null) {
                    text.replace(0, text.length(), str2, 0, str2.length());
                    Selection.setSelection(text, text.length());
                }
            }
        }
    }
}
