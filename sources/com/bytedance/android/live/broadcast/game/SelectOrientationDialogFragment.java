package com.bytedance.android.live.broadcast.game;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class SelectOrientationDialogFragment extends DialogFragment {

    /* renamed from: a */
    private ViewGroup f8686a;

    /* renamed from: b */
    private ViewGroup f8687b;

    /* renamed from: c */
    private boolean f8688c = true;

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return onCreateDialog;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.zh);
        if (getArguments() != null) {
            this.f8688c = getArguments().getBoolean("hotsoon.intent.extra.IS_LANDSCAPE", true);
        }
    }

    /* renamed from: a */
    public final void mo9438a(boolean z) {
        m11024a(this.f8687b, !z);
        m11024a(this.f8686a, z);
        if (this.f8688c != z) {
            this.f8688c = z;
        }
    }

    /* renamed from: a */
    private static void m11024a(ViewGroup viewGroup, boolean z) {
        viewGroup.setSelected(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setSelected(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f8686a = (ViewGroup) view.findViewById(R.id.bi4);
        this.f8687b = (ViewGroup) view.findViewById(R.id.bj3);
        mo9438a(this.f8688c);
        this.f8686a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                SelectOrientationDialogFragment.this.mo9438a(true);
            }
        });
        this.f8687b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                SelectOrientationDialogFragment.this.mo9438a(false);
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.ap3, null);
        viewGroup2.getChildAt(0).getLayoutParams().width = getResources().getDisplayMetrics().widthPixels;
        return viewGroup2;
    }
}
