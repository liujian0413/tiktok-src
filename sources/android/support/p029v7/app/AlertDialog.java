package android.support.p029v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p029v7.app.AlertController.C1074a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.app.AlertDialog */
public class AlertDialog extends AppCompatDialog implements DialogInterface {

    /* renamed from: a */
    final AlertController f3824a;

    /* renamed from: android.support.v7.app.AlertDialog$a */
    public static class C1081a {

        /* renamed from: a */
        private final C1074a f3825a;

        /* renamed from: b */
        private final int f3826b;

        /* renamed from: a */
        public final C1081a mo4233a(CharSequence charSequence) {
            this.f3825a.f3790f = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C1081a mo4234a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f3825a.f3793i = charSequence;
            this.f3825a.f3795k = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C1081a mo4235a(boolean z) {
            this.f3825a.f3802r = false;
            return this;
        }

        /* renamed from: a */
        public final C1081a mo4236a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
            this.f3825a.f3806v = charSequenceArr;
            this.f3825a.f3808x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final Context mo4224a() {
            return this.f3825a.f3785a;
        }

        /* renamed from: c */
        public final AlertDialog mo4245c() {
            AlertDialog b = mo4242b();
            b.show();
            return b;
        }

        /* renamed from: b */
        public final AlertDialog mo4242b() {
            AlertDialog alertDialog = new AlertDialog(this.f3825a.f3785a, this.f3826b);
            this.f3825a.mo4211a(alertDialog.f3824a);
            alertDialog.setCancelable(this.f3825a.f3802r);
            if (this.f3825a.f3802r) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f3825a.f3803s);
            alertDialog.setOnDismissListener(this.f3825a.f3804t);
            if (this.f3825a.f3805u != null) {
                alertDialog.setOnKeyListener(this.f3825a.f3805u);
            }
            return alertDialog;
        }

        /* renamed from: b */
        public final C1081a mo4240b(CharSequence charSequence) {
            this.f3825a.f3792h = charSequence;
            return this;
        }

        public C1081a(Context context) {
            this(context, AlertDialog.m4703a(context, 0));
        }

        /* renamed from: a */
        public final C1081a mo4225a(int i) {
            this.f3825a.f3790f = this.f3825a.f3785a.getText(i);
            return this;
        }

        /* renamed from: b */
        public final C1081a mo4237b(int i) {
            this.f3825a.f3792h = this.f3825a.f3785a.getText(i);
            return this;
        }

        /* renamed from: a */
        public final C1081a mo4227a(OnCancelListener onCancelListener) {
            this.f3825a.f3803s = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public final C1081a mo4239b(View view) {
            this.f3825a.f3810z = view;
            this.f3825a.f3809y = 0;
            this.f3825a.f3774E = false;
            return this;
        }

        /* renamed from: a */
        public final C1081a mo4228a(OnDismissListener onDismissListener) {
            this.f3825a.f3804t = onDismissListener;
            return this;
        }

        /* renamed from: a */
        public final C1081a mo4229a(OnKeyListener onKeyListener) {
            this.f3825a.f3805u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public final C1081a mo4230a(Drawable drawable) {
            this.f3825a.f3788d = drawable;
            return this;
        }

        /* renamed from: a */
        public final C1081a mo4231a(View view) {
            this.f3825a.f3791g = view;
            return this;
        }

        /* renamed from: c */
        public final C1081a mo4244c(CharSequence charSequence, OnClickListener onClickListener) {
            this.f3825a.f3799o = charSequence;
            this.f3825a.f3801q = onClickListener;
            return this;
        }

        public C1081a(Context context, int i) {
            this.f3825a = new C1074a(new ContextThemeWrapper(context, AlertDialog.m4703a(context, i)));
            this.f3826b = i;
        }

        /* renamed from: a */
        public final C1081a mo4226a(int i, OnClickListener onClickListener) {
            this.f3825a.f3793i = this.f3825a.f3785a.getText(i);
            this.f3825a.f3795k = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C1081a mo4238b(int i, OnClickListener onClickListener) {
            this.f3825a.f3796l = this.f3825a.f3785a.getText(i);
            this.f3825a.f3798n = onClickListener;
            return this;
        }

        /* renamed from: c */
        public final C1081a mo4243c(int i, OnClickListener onClickListener) {
            this.f3825a.f3799o = this.f3825a.f3785a.getText(R.string.nw);
            this.f3825a.f3801q = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C1081a mo4241b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f3825a.f3796l = charSequence;
            this.f3825a.f3798n = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C1081a mo4232a(ListAdapter listAdapter, OnClickListener onClickListener) {
            this.f3825a.f3807w = listAdapter;
            this.f3825a.f3808x = onClickListener;
            return this;
        }
    }

    protected AlertDialog(Context context) {
        this(context, 0);
    }

    /* renamed from: a */
    public final Button mo4220a(int i) {
        return this.f3824a.mo4204d(-1);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3824a.mo4192a();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f3824a.mo4198a(charSequence);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f3824a.mo4199a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f3824a.mo4202b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    protected AlertDialog(Context context, int i) {
        super(context, m4703a(context, i));
        this.f3824a = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: a */
    static int m4703a(Context context, int i) {
        if (((i >>> 24) & NormalGiftView.ALPHA_255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.aq, typedValue, true);
        return typedValue.resourceId;
    }
}
