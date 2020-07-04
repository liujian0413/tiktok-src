package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.login.p1373ui.CheckButton;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.AbsTimeLockFragment */
public abstract class AbsTimeLockFragment extends AmeBaseFragment {

    /* renamed from: e */
    protected EditText f60193e;

    /* renamed from: f */
    protected CheckButton f60194f;

    /* renamed from: g */
    protected Button f60195g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo59316a() {
        return R.string.e98;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo59318b(String str);

    /* renamed from: a */
    public static boolean m74775a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m74776b(final View view) {
        final OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        view.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                view.post(new Runnable() {
                    public final void run() {
                        if (AbsTimeLockFragment.this.getActivity() != null && AbsTimeLockFragment.this.isViewValid()) {
                            ((InputMethodManager) AbsTimeLockFragment.this.getActivity().getSystemService("input_method")).showSoftInput(view, 1);
                        }
                    }
                });
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                }
            }
        });
        view.post(new Runnable() {
            public final void run() {
                view.requestFocus();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59317a(View view) {
        if (getActivity() != null) {
            ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60193e = (EditText) view.findViewById(R.id.acp);
        m74776b((View) this.f60193e);
        this.f60194f = (CheckButton) view.findViewById(R.id.qz);
        this.f60195g = (Button) view.findViewById(R.id.c15);
        if (C6399b.m19946v() || C7212bb.m22493a()) {
            this.f60195g.setVisibility(0);
            this.f60195g.setAlpha(0.5f);
            this.f60194f.setVisibility(8);
        } else {
            this.f60195g.setVisibility(8);
            this.f60194f.setVisibility(0);
        }
        this.f60194f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String obj = AbsTimeLockFragment.this.f60193e.getText().toString();
                if (!AbsTimeLockFragment.m74775a(obj)) {
                    C10761a.m31399c(AbsTimeLockFragment.this.getContext(), AbsTimeLockFragment.this.mo59316a()).mo25750a();
                } else {
                    AbsTimeLockFragment.this.mo59318b(obj);
                }
            }
        });
        this.f60195g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String obj = AbsTimeLockFragment.this.f60193e.getText().toString();
                if (!AbsTimeLockFragment.m74775a(obj)) {
                    C10761a.m31399c(AbsTimeLockFragment.this.getContext(), AbsTimeLockFragment.this.mo59316a()).mo25750a();
                } else {
                    AbsTimeLockFragment.this.mo59318b(obj);
                }
            }
        });
        this.f60193e.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (editable.length() == 4) {
                    AbsTimeLockFragment.this.f60194f.setAlpha(1.0f);
                    AbsTimeLockFragment.this.f60195g.setAlpha(1.0f);
                    return;
                }
                AbsTimeLockFragment.this.f60194f.setAlpha(0.5f);
                AbsTimeLockFragment.this.f60195g.setAlpha(0.5f);
            }
        });
    }
}
