package com.p280ss.android.ugc.aweme.music.p1410ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.dialog.CollectSuccessDialog */
public final class CollectSuccessDialog extends DialogFragment {

    /* renamed from: a */
    private HashMap f88586a;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.dialog.CollectSuccessDialog$a */
    static final class C33954a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CollectSuccessDialog f88587a;

        C33954a(CollectSuccessDialog collectSuccessDialog) {
            this.f88587a = collectSuccessDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f88587a.dismiss();
        }
    }

    /* renamed from: a */
    private void m109420a() {
        if (this.f88586a != null) {
            this.f88586a.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m109420a();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.jy);
        dialog.findViewById(R.id.r2).setOnClickListener(new C33954a(this));
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(R.color.ac4);
        C7573i.m23582a((Object) window, "window");
        LayoutParams attributes = window.getAttributes();
        double b = (double) C23482j.m77098b(getContext());
        Double.isNaN(b);
        attributes.width = (int) (b * 0.75d);
        attributes.height = -2;
        attributes.horizontalMargin = 0.0f;
        window.setAttributes(attributes);
        return dialog;
    }
}
