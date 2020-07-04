package com.bytedance.android.live.uikit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.live.uikit.dialog.C3520a.C3526a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.uikit.dialog.b */
public final class C3533b extends Dialog implements DialogInterface {

    /* renamed from: b */
    private static C3535b f10506b;

    /* renamed from: a */
    public C3520a f10507a = new C3520a(getContext(), this, getWindow());

    /* renamed from: com.bytedance.android.live.uikit.dialog.b$a */
    public static class C3534a {

        /* renamed from: a */
        private final C3526a f10508a;

        /* renamed from: b */
        private int f10509b;

        /* renamed from: a */
        public final C3533b mo10657a() {
            C3533b bVar = new C3533b(this.f10508a.f10467a, this.f10509b);
            this.f10508a.mo10635a(bVar.f10507a);
            bVar.setCancelable(this.f10508a.f10481o);
            if (this.f10508a.f10481o) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f10508a.f10482p);
            bVar.setOnDismissListener(this.f10508a.f10483q);
            if (this.f10508a.f10484r != null) {
                bVar.setOnKeyListener(this.f10508a.f10484r);
            }
            return bVar;
        }

        /* renamed from: b */
        public final C3533b mo10662b() {
            C3533b a = mo10657a();
            a.show();
            return a;
        }

        public C3534a(Context context) {
            this(context, 0);
        }

        /* renamed from: a */
        public final C3534a mo10650a(OnCancelListener onCancelListener) {
            this.f10508a.f10482p = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public final C3534a mo10660b(CharSequence charSequence) {
            this.f10508a.f10474h = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C3534a mo10648a(int i) {
            this.f10508a.f10472f = this.f10508a.f10467a.getText(i);
            return this;
        }

        /* renamed from: b */
        public final C3534a mo10658b(int i) {
            this.f10508a.f10474h = this.f10508a.f10467a.getText(i);
            return this;
        }

        /* renamed from: a */
        public final C3534a mo10651a(OnDismissListener onDismissListener) {
            this.f10508a.f10483q = onDismissListener;
            return this;
        }

        /* renamed from: a */
        public final C3534a mo10652a(OnKeyListener onKeyListener) {
            this.f10508a.f10484r = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public final C3534a mo10653a(View view) {
            this.f10508a.f10473g = view;
            return this;
        }

        /* renamed from: a */
        public final C3534a mo10654a(CharSequence charSequence) {
            this.f10508a.f10472f = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C3534a mo10656a(boolean z) {
            this.f10508a.f10481o = z;
            return this;
        }

        public C3534a(Context context, int i) {
            this.f10508a = new C3526a(new ContextThemeWrapper(context, C3533b.m12989a(context, i)));
            this.f10509b = i;
        }

        /* renamed from: a */
        public final C3534a mo10649a(int i, OnClickListener onClickListener) {
            this.f10508a.f10475i = this.f10508a.f10467a.getText(i);
            this.f10508a.f10476j = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C3534a mo10659b(int i, OnClickListener onClickListener) {
            this.f10508a.f10477k = this.f10508a.f10467a.getText(i);
            this.f10508a.f10478l = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C3534a mo10661b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f10508a.f10477k = charSequence;
            this.f10508a.f10478l = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C3534a mo10655a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f10508a.f10475i = charSequence;
            this.f10508a.f10476j = onClickListener;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.dialog.b$b */
    public interface C3535b {
        /* renamed from: a */
        boolean mo10663a();
    }

    /* renamed from: a */
    public static void m12990a(C3535b bVar) {
        f10506b = bVar;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10507a.mo10617a();
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f10507a.mo10623a(charSequence);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f10507a.mo10624a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f10507a.mo10627b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected C3533b(Context context, int i) {
        super(context, m12989a(context, i));
        if (f10506b == null) {
            throw new IllegalArgumentException("NightMode is NUll");
        }
    }

    /* renamed from: a */
    static int m12989a(Context context, int i) {
        if (i == 1) {
            return R.style.is;
        }
        if (i == 2) {
            return R.style.it;
        }
        if (i >= 16777216) {
            return i;
        }
        if (f10506b == null || !f10506b.mo10663a()) {
            return R.style.is;
        }
        return R.style.it;
    }
}
