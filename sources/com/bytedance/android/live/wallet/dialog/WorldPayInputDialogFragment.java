package com.bytedance.android.live.wallet.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p347b.C7321c;

public class WorldPayInputDialogFragment extends DialogFragment implements OnClickListener {

    /* renamed from: a */
    private EditText f11105a;

    /* renamed from: b */
    private C3730a f11106b;

    /* renamed from: c */
    private C7321c f11107c;

    /* renamed from: com.bytedance.android.live.wallet.dialog.WorldPayInputDialogFragment$a */
    public interface C3730a {
        /* renamed from: a */
        void mo11225a(String str);
    }

    public void dismiss() {
        super.dismiss();
        if (this.f11107c != null && !this.f11107c.isDisposed()) {
            this.f11107c.dispose();
        }
    }

    /* renamed from: a */
    public static WorldPayInputDialogFragment m13407a(C3730a aVar) {
        WorldPayInputDialogFragment worldPayInputDialogFragment = new WorldPayInputDialogFragment();
        worldPayInputDialogFragment.f11106b = aVar;
        return worldPayInputDialogFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.za);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return onCreateDialog;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ds9) {
            String obj = this.f11105a.getText().toString();
            if (TextUtils.isEmpty(obj) || !obj.contains("@")) {
                C9049ap.m27022a((int) R.string.ff8);
                return;
            } else if (this.f11106b != null) {
                this.f11106b.mo11225a(obj);
            }
        }
        dismissAllowingStateLoss();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ane, viewGroup, false);
        this.f11105a = (EditText) inflate.findViewById(R.id.agu);
        inflate.findViewById(R.id.bqv).getLayoutParams().width = C3358ac.m12523c();
        inflate.findViewById(R.id.eci).setOnClickListener(this);
        inflate.findViewById(R.id.ds9).setOnClickListener(this);
        inflate.findViewById(R.id.dr5).setOnClickListener(this);
        return inflate;
    }
}
