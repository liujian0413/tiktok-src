package com.bytedance.ies.uikit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import com.bytedance.ies.uikit.dialog.C11016a.C11022a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.uikit.dialog.b */
public class C11029b extends Dialog implements DialogInterface {

    /* renamed from: b */
    private static C11031b f29915b;

    /* renamed from: a */
    public C11016a f29916a;

    /* renamed from: com.bytedance.ies.uikit.dialog.b$a */
    public static class C11030a {

        /* renamed from: a */
        private final C11022a f29917a;

        /* renamed from: b */
        private int f29918b;

        /* renamed from: a */
        public final C11030a mo26643a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
            this.f29917a.f29894s = charSequenceArr;
            this.f29917a.f29896u = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C11029b mo26644a() {
            C11029b bVar = new C11029b(this.f29917a.f29876a, this.f29918b);
            this.f29917a.mo26618a(bVar.f29916a);
            bVar.setCancelable(this.f29917a.f29890o);
            if (this.f29917a.f29890o) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f29917a.f29891p);
            bVar.setOnDismissListener(this.f29917a.f29892q);
            if (this.f29917a.f29893r != null) {
                bVar.setOnKeyListener(this.f29917a.f29893r);
            }
            return bVar;
        }

        /* renamed from: b */
        public final C11029b mo26649b() {
            C11029b a = mo26644a();
            a.show();
            return a;
        }

        public C11030a(Context context) {
            this(context, 0);
        }

        /* renamed from: a */
        public final C11030a mo26636a(OnCancelListener onCancelListener) {
            this.f29917a.f29891p = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public final C11030a mo26647b(CharSequence charSequence) {
            this.f29917a.f29883h = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C11030a mo26634a(int i) {
            this.f29917a.f29881f = this.f29917a.f29876a.getText(i);
            return this;
        }

        /* renamed from: b */
        public final C11030a mo26645b(int i) {
            this.f29917a.f29883h = this.f29917a.f29876a.getText(i);
            return this;
        }

        /* renamed from: a */
        public final C11030a mo26637a(OnDismissListener onDismissListener) {
            this.f29917a.f29892q = onDismissListener;
            return this;
        }

        /* renamed from: a */
        public final C11030a mo26638a(Drawable drawable) {
            this.f29917a.f29879d = drawable;
            return this;
        }

        /* renamed from: a */
        public final C11030a mo26639a(View view) {
            this.f29917a.f29898w = view;
            this.f29917a.f29897v = 0;
            this.f29917a.f29864B = false;
            return this;
        }

        /* renamed from: a */
        public final C11030a mo26640a(CharSequence charSequence) {
            this.f29917a.f29881f = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C11030a mo26642a(boolean z) {
            this.f29917a.f29890o = z;
            return this;
        }

        private C11030a(Context context, int i) {
            this.f29917a = new C11022a(new ContextThemeWrapper(context, C11029b.m32308a(context, 0)));
            this.f29918b = 0;
        }

        /* renamed from: a */
        public final C11030a mo26635a(int i, OnClickListener onClickListener) {
            this.f29917a.f29884i = this.f29917a.f29876a.getText(i);
            this.f29917a.f29885j = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C11030a mo26646b(int i, OnClickListener onClickListener) {
            this.f29917a.f29886k = this.f29917a.f29876a.getText(i);
            this.f29917a.f29887l = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C11030a mo26648b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f29917a.f29886k = charSequence;
            this.f29917a.f29887l = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C11030a mo26641a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f29917a.f29884i = charSequence;
            this.f29917a.f29885j = onClickListener;
            return this;
        }
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.b$b */
    public interface C11031b {
    }

    /* renamed from: a */
    static int m32308a(Context context, int i) {
        return i == 1 ? R.style.is : i == 2 ? R.style.it : i >= 16777216 ? i : R.style.is;
    }

    /* renamed from: a */
    public static void m32309a(C11031b bVar) {
        f29915b = bVar;
    }

    protected C11029b(Context context) {
        this(context, 0);
    }

    /* renamed from: a */
    public final Button mo26627a(int i) {
        return this.f29916a.mo26611d(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29916a.mo26599a();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f29916a.mo26605a(charSequence);
    }

    /* renamed from: a */
    public final void mo26629a(CharSequence charSequence) {
        this.f29916a.mo26608b(charSequence);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f29916a.mo26606a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f29916a.mo26609b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected C11029b(Context context, int i) {
        super(context, m32308a(context, i));
        this.f29916a = new C11016a(getContext(), this, getWindow());
        if (f29915b == null) {
            throw new IllegalArgumentException("NightMode is NUll");
        }
    }

    /* renamed from: a */
    public final void mo26628a(int i, CharSequence charSequence, OnClickListener onClickListener) {
        this.f29916a.mo26601a(i, charSequence, null, null);
    }
}
