package com.bytedance.android.live.wallet.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.wallet.C3701d;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.p431y.p432a.C9280a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class PreBonusHintDialogFragment extends LiveDialogFragment {

    /* renamed from: a */
    public C3701d f11068a;

    /* renamed from: b */
    public C3713a f11069b;

    /* renamed from: c */
    private boolean f11070c;

    /* renamed from: d */
    private List<C9280a> f11071d;

    /* renamed from: com.bytedance.android.live.wallet.dialog.PreBonusHintDialogFragment$a */
    public interface C3713a {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.xv);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f11068a != null) {
            this.f11068a.mo11208a(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            if (this.f11070c) {
                window.setGravity(80);
                window.setLayout(-1, -2);
            } else {
                int b = C3358ac.m12520b();
                LayoutParams attributes = window.getAttributes();
                attributes.gravity = 8388693;
                window.setLayout(b, -2);
                window.setAttributes(attributes);
            }
        }
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.aor, viewGroup, false);
        if (getArguments() != null) {
            str = getArguments().getString("KEY_PREBONUS_HINT_TITLE");
        } else {
            str = null;
        }
        ((TextView) inflate.findViewById(R.id.dzv)).setText(str);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf("");
        String str2 = "   ";
        if (this.f11071d != null) {
            for (int i = 0; i < this.f11071d.size(); i++) {
                C9280a aVar = (C9280a) this.f11071d.get(i);
                String str3 = aVar.f25463b;
                String str4 = aVar.f25462a;
                int length = valueOf.length();
                valueOf.append(str3).append(str4).append(str2);
                valueOf.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.apx)), str3.length() + length, length + str3.length() + str4.length(), 33);
            }
        }
        ((TextView) inflate.findViewById(R.id.dzu)).setText(valueOf);
        inflate.findViewById(R.id.ds_).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (PreBonusHintDialogFragment.this.f11069b != null) {
                    PreBonusHintDialogFragment.this.dismissAllowingStateLoss();
                    PreBonusHintDialogFragment.this.f11068a = null;
                }
            }
        });
        return inflate;
    }
}
