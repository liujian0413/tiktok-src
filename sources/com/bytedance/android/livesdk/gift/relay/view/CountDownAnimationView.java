package com.bytedance.android.livesdk.gift.relay.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class CountDownAnimationView extends FrameLayout {

    /* renamed from: a */
    private float f22732a;

    /* renamed from: b */
    private float f22733b;

    /* renamed from: c */
    private float f22734c;

    /* renamed from: d */
    private Paint f22735d;

    /* renamed from: e */
    private RectF f22736e;

    /* renamed from: f */
    private LinearGradient f22737f;

    /* renamed from: g */
    private float f22738g;

    /* renamed from: h */
    private int f22739h;

    /* renamed from: i */
    private TextView f22740i;

    /* renamed from: a */
    private void m25298a() {
        LayoutInflater.from(getContext()).inflate(R.layout.ar3, this);
        this.f22732a = getResources().getDimension(R.dimen.qh);
        this.f22733b = getResources().getDimension(R.dimen.qg);
        this.f22734c = getResources().getDimension(R.dimen.qj);
        this.f22735d = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f22732a, this.f22733b, getResources().getColor(R.color.akk), getResources().getColor(R.color.akj), TileMode.CLAMP);
        this.f22737f = linearGradient;
        this.f22735d.setAntiAlias(true);
        this.f22735d.setShader(this.f22737f);
        this.f22735d.setStyle(Style.STROKE);
        this.f22735d.setStrokeCap(Cap.ROUND);
        this.f22735d.setStrokeWidth(this.f22734c);
        float f = this.f22734c / 2.0f;
        this.f22736e = new RectF(f, f, this.f22732a - f, this.f22733b - f);
        this.f22740i = (TextView) findViewById(R.id.a3i);
        setWillNotDraw(false);
    }

    public CountDownAnimationView(Context context) {
        this(context, null);
    }

    public void setCountDownTime(int i) {
        this.f22739h = i;
        setTime(this.f22739h);
    }

    public void setProgress(float f) {
        this.f22738g = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f22736e, -90.0f, -this.f22738g, false, this.f22735d);
    }

    public void setTime(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(i));
        sb.append(" ");
        this.f22740i.setText(sb.toString());
    }

    public CountDownAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountDownAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25298a();
    }
}
