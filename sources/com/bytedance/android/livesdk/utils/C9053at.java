package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.utils.at */
public final class C9053at {

    /* renamed from: com.bytedance.android.livesdk.utils.at$a */
    static class C9054a extends ProgressDialog {
        public final void setMessage(CharSequence charSequence) {
        }

        public final void show() {
            try {
                super.show();
            } catch (Exception unused) {
            }
        }

        public C9054a(Context context) {
            this(context, 0);
        }

        /* access modifiers changed from: protected */
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.azv);
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(17170445);
                window.clearFlags(2);
            }
        }

        private C9054a(Context context, int i) {
            super(context, 0);
        }
    }

    /* renamed from: a */
    public static ProgressDialog m27042a(Context context) {
        C9054a aVar = new C9054a(context);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            aVar.show();
        }
        return aVar;
    }
}
