package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.widget.e */
public final class C9241e extends Dialog implements OnClickListener {

    /* renamed from: a */
    private TextView f25339a;

    /* renamed from: b */
    private View f25340b;

    /* renamed from: c */
    private View f25341c;

    /* renamed from: d */
    private DialogInterface.OnClickListener f25342d;

    /* renamed from: e */
    private DialogInterface.OnClickListener f25343e;

    /* renamed from: a */
    private void m27493a() {
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ans, null));
        this.f25339a = (TextView) findViewById(R.id.at6);
        this.f25340b = findViewById(R.id.at7);
        this.f25341c = findViewById(R.id.at5);
        this.f25340b.setOnClickListener(this);
        this.f25341c.setOnClickListener(this);
    }

    /* renamed from: a */
    public final C9241e mo22693a(DialogInterface.OnClickListener onClickListener) {
        this.f25342d = onClickListener;
        return this;
    }

    /* renamed from: b */
    public final C9241e mo22695b(DialogInterface.OnClickListener onClickListener) {
        this.f25343e = onClickListener;
        return this;
    }

    public C9241e(Context context) {
        this(context, R.style.yw);
    }

    /* renamed from: a */
    public final C9241e mo22694a(String str) {
        this.f25339a.setText(str);
        return this;
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.at7) {
            if (this.f25343e != null) {
                this.f25343e.onClick(this, 1);
            }
        } else if (view.getId() == R.id.at5 && this.f25342d != null) {
            this.f25342d.onClick(this, 2);
        }
    }

    private C9241e(Context context, int i) {
        super(context, R.style.yw);
        m27493a();
    }
}
