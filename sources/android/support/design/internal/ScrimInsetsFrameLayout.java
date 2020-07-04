package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.R$styleable;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0983o;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a */
    Drawable f1178a;

    /* renamed from: b */
    Rect f1179b;

    /* renamed from: c */
    private Rect f1180c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1179a(C0954ab abVar) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1178a != null) {
            this.f1178a.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1178a != null) {
            this.f1178a.setCallback(null);
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1179b != null && this.f1178a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f1180c.set(0, 0, width, this.f1179b.top);
            this.f1178a.setBounds(this.f1180c);
            this.f1178a.draw(canvas);
            this.f1180c.set(0, height - this.f1179b.bottom, width, height);
            this.f1178a.setBounds(this.f1180c);
            this.f1178a.draw(canvas);
            this.f1180c.set(0, this.f1179b.top, this.f1179b.left, height - this.f1179b.bottom);
            this.f1178a.setBounds(this.f1180c);
            this.f1178a.draw(canvas);
            this.f1180c.set(width - this.f1179b.right, this.f1179b.top, width, height - this.f1179b.bottom);
            this.f1178a.setBounds(this.f1180c);
            this.f1178a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1180c = new Rect();
        TypedArray a = C0296b.m1168a(context, attributeSet, R$styleable.ScrimInsetsFrameLayout, i, R.style.qe, new int[0]);
        this.f1178a = a.getDrawable(0);
        a.recycle();
        setWillNotDraw(true);
        C0991u.m4188a((View) this, (C0983o) new C0983o() {
            /* renamed from: a */
            public final C0954ab mo1183a(View view, C0954ab abVar) {
                boolean z;
                if (ScrimInsetsFrameLayout.this.f1179b == null) {
                    ScrimInsetsFrameLayout.this.f1179b = new Rect();
                }
                ScrimInsetsFrameLayout.this.f1179b.set(abVar.mo3717a(), abVar.mo3719b(), abVar.mo3720c(), abVar.mo3721d());
                ScrimInsetsFrameLayout.this.mo1179a(abVar);
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                if (!abVar.mo3722e() || ScrimInsetsFrameLayout.this.f1178a == null) {
                    z = true;
                } else {
                    z = false;
                }
                scrimInsetsFrameLayout.setWillNotDraw(z);
                C0991u.m4212e(ScrimInsetsFrameLayout.this);
                return abVar.mo3725g();
            }
        });
    }
}
