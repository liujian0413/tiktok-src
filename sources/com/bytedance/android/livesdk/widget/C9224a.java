package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.p212e.C4340a;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.widget.a */
public class C9224a extends LinearLayout {

    /* renamed from: b */
    private static final String f25312b = "com.bytedance.android.livesdk.widget.a";

    /* renamed from: a */
    public boolean f25313a;

    /* renamed from: c */
    private ImageView f25314c;

    /* renamed from: d */
    private TextView f25315d;

    /* renamed from: e */
    private View f25316e;

    private int getLayoutResource() {
        return R.layout.ava;
    }

    public C9224a(Context context) {
        super(context);
        m27473a(context);
    }

    /* renamed from: a */
    private void m27473a(Context context) {
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        this.f25314c = (ImageView) findViewById(R.id.ax9);
        this.f25315d = (TextView) findViewById(R.id.a1q);
        this.f25316e = findViewById(R.id.c7w);
    }

    public void setAbsActionMessage(C4343b<?> bVar) {
        if (bVar instanceof C4340a) {
            C4340a aVar = (C4340a) bVar;
            if (aVar.mo12060a() != null) {
                C5343e.m17032a(this.f25314c, aVar.mo12060a(), this.f25314c.getWidth(), this.f25314c.getHeight());
            } else if (aVar.mo12062b() > 0) {
                this.f25314c.setImageResource(aVar.mo12062b());
            } else {
                this.f25314c.setBackgroundResource(R.drawable.c9q);
            }
            if (!TextUtils.isEmpty(aVar.mo12075n())) {
                this.f25315d.setText(aVar.mo12075n());
            } else {
                this.f25315d.setText("");
            }
            if (!TextUtils.isEmpty(aVar.mo12067g())) {
                try {
                    ((GradientDrawable) this.f25316e.getBackground()).setColor(Color.parseColor(aVar.mo12067g()));
                } catch (Exception unused) {
                }
            }
            this.f25313a = true;
        }
    }
}
