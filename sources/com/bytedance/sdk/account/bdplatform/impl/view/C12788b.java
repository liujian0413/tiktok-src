package com.bytedance.sdk.account.bdplatform.impl.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.account.bdplatform.p655a.C12756c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.view.b */
public final class C12788b extends Dialog implements C12756c {

    /* renamed from: d */
    private static Drawable f33831d;

    /* renamed from: a */
    private Context f33832a;

    /* renamed from: b */
    private ProgressBar f33833b;

    /* renamed from: c */
    private TextView f33834c;

    /* renamed from: a */
    private void m37120a() {
        View inflate = LayoutInflater.from(this.f33832a).inflate(R.layout.ho, null);
        this.f33833b = (ProgressBar) inflate.findViewById(R.id.cl3);
        this.f33834c = (TextView) inflate.findViewById(R.id.btn);
        m37122b(f33831d);
        setContentView(inflate);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        window.setGravity(17);
        attributes.width = m37119a(this.f33832a, 144.0f);
        attributes.height = m37119a(this.f33832a, 96.0f);
        window.setAttributes(attributes);
    }

    /* renamed from: a */
    public static void m37121a(Drawable drawable) {
        f33831d = drawable;
    }

    /* renamed from: b */
    private void m37122b(Drawable drawable) {
        if (drawable != null) {
            this.f33833b.setIndeterminateDrawable(drawable);
        }
    }

    public C12788b(Context context) {
        super(context, R.style.xt);
        this.f33832a = context;
        m37120a();
    }

    /* renamed from: a */
    public final void mo31277a(String str) {
        this.f33834c.setText(str);
        show();
    }

    /* renamed from: a */
    private static int m37119a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
