package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.NumberInputDialogFragment */
public class NumberInputDialogFragment extends SimpleInputDialogFragment {

    /* renamed from: a */
    public int f15140a = Integer.MIN_VALUE;

    /* renamed from: b */
    public int f15141b = Integer.MAX_VALUE;

    /* renamed from: c */
    public boolean f15142c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13393a(boolean z, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13394a() {
        return false;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15140a = getArguments().getInt("live.intent.extra.MIN", Integer.MIN_VALUE);
        this.f15141b = getArguments().getInt("live.intent.extra.MAX", Integer.MAX_VALUE);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f15185f.setInputType(2);
        this.f15185f.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable)) {
                    NumberInputDialogFragment.this.f15186g.setEnabled(false);
                    return;
                }
                try {
                    int parseInt = Integer.parseInt(editable.toString());
                    if (parseInt < NumberInputDialogFragment.this.f15140a) {
                        NumberInputDialogFragment.this.f15185f.setText(String.valueOf(NumberInputDialogFragment.this.f15140a));
                        NumberInputDialogFragment.this.f15185f.setSelection(NumberInputDialogFragment.this.f15185f.getText().length());
                    } else if (parseInt > NumberInputDialogFragment.this.f15141b) {
                        NumberInputDialogFragment.this.f15185f.setText(String.valueOf(NumberInputDialogFragment.this.f15141b));
                        NumberInputDialogFragment.this.f15185f.setSelection(NumberInputDialogFragment.this.f15185f.getText().length());
                    }
                    NumberInputDialogFragment.this.f15186g.setEnabled(true);
                } catch (NumberFormatException unused) {
                    NumberInputDialogFragment.this.f15186g.setEnabled(false);
                }
            }
        });
        this.f15186g.setEnabled(false);
        if (this.f15142c) {
            this.f15185f.requestFocus();
            mo13419c();
        }
    }
}
