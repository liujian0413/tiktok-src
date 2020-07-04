package com.bytedance.android.livesdk.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class ControlButton extends LinearLayout {

    /* renamed from: a */
    public boolean f21142a;

    /* renamed from: b */
    public C7835a f21143b;

    /* renamed from: c */
    private View f21144c;

    /* renamed from: d */
    private int f21145d;

    /* renamed from: e */
    private int f21146e;

    /* renamed from: f */
    private int f21147f;

    /* renamed from: g */
    private int f21148g;

    /* renamed from: h */
    private int f21149h;

    /* renamed from: i */
    private int f21150i;

    /* renamed from: j */
    private ImageView f21151j;

    /* renamed from: k */
    private TextView f21152k;

    /* renamed from: com.bytedance.android.livesdk.floatwindow.ControlButton$a */
    public interface C7835a {
        /* renamed from: a */
        void mo9950a();
    }

    private int getLayoutId() {
        return R.layout.awj;
    }

    /* renamed from: b */
    private void m24017b() {
        inflate(getContext(), getLayoutId(), this);
        this.f21144c = findViewById(R.id.a1m);
        this.f21151j = (ImageView) findViewById(R.id.b_a);
        this.f21152k = (TextView) findViewById(R.id.dt5);
        this.f21144c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ControlButton.this.f21142a = !ControlButton.this.f21142a;
                ControlButton.this.mo20529a();
                if (ControlButton.this.f21143b != null) {
                    ControlButton.this.f21143b.mo9950a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo20529a() {
        if (this.f21142a) {
            this.f21151j.setImageResource(this.f21146e);
            this.f21152k.setTextColor(getResources().getColor(this.f21148g));
            this.f21152k.setText(this.f21150i);
            return;
        }
        this.f21151j.setImageResource(this.f21145d);
        this.f21152k.setTextColor(getResources().getColor(this.f21147f));
        this.f21152k.setText(this.f21149h);
    }

    public void setOnViewClickListener(C7835a aVar) {
        this.f21143b = aVar;
    }

    public ControlButton(Context context) {
        super(context);
        m24017b();
    }

    public void setChecked(boolean z) {
        this.f21142a = z;
        mo20529a();
    }

    public ControlButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24017b();
    }

    public ControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24017b();
    }

    public ControlButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m24017b();
    }

    /* renamed from: a */
    public final void mo20530a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.f21145d = i;
        this.f21146e = i2;
        this.f21147f = R.color.as5;
        this.f21148g = i4;
        this.f21149h = i5;
        this.f21150i = i6;
        this.f21142a = z;
        mo20529a();
    }
}
