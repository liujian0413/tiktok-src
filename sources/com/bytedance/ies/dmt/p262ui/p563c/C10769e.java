package com.bytedance.ies.dmt.p262ui.p563c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.bytedance.ies.dmt.ui.c.e */
public final class C10769e {

    /* renamed from: a */
    public static final C10770a f28883a = new C10770a(null);

    /* renamed from: b */
    private Toast f28884b;

    /* renamed from: com.bytedance.ies.dmt.ui.c.e$a */
    public static final class C10770a {
        private C10770a() {
        }

        /* renamed from: a */
        public static C10769e m31440a() {
            return new C10769e();
        }

        public /* synthetic */ C10770a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public static final C10769e m31437b() {
        return C10770a.m31440a();
    }

    /* renamed from: a */
    public final void mo25761a() {
        try {
            Toast toast = this.f28884b;
            if (toast != null) {
                C10771f.m31441a(toast);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C10769e mo25760a(Context context, CharSequence charSequence, int i) {
        if (context == null) {
            return this;
        }
        this.f28884b = new Toast(context);
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.lp, null);
            View findViewById = inflate.findViewById(R.id.text);
            if (findViewById != null) {
                ((TextView) findViewById).setText(charSequence);
                Toast toast = this.f28884b;
                if (toast != null) {
                    toast.setView(inflate);
                }
                Toast toast2 = this.f28884b;
                if (toast2 != null) {
                    toast2.setGravity(17, 0, 0);
                }
                return this;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
