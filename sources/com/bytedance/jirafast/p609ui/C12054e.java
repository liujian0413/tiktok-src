package com.bytedance.jirafast.p609ui;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.jirafast.utils.C12084l;

/* renamed from: com.bytedance.jirafast.ui.e */
public final class C12054e extends FrameLayout {

    /* renamed from: y */
    private static C12054e f32068y;

    /* renamed from: a */
    int f32069a;

    /* renamed from: b */
    int f32070b;

    /* renamed from: c */
    public int f32071c;

    /* renamed from: d */
    public int f32072d;

    /* renamed from: e */
    public int f32073e;

    /* renamed from: f */
    public int f32074f;

    /* renamed from: g */
    private final Handler f32075g;

    /* renamed from: h */
    private final int f32076h;

    /* renamed from: i */
    private float f32077i;

    /* renamed from: j */
    private float f32078j;

    /* renamed from: k */
    private float f32079k;

    /* renamed from: l */
    private float f32080l;

    /* renamed from: m */
    private WindowManager f32081m;

    /* renamed from: n */
    private LayoutParams f32082n;

    /* renamed from: o */
    private float f32083o;

    /* renamed from: p */
    private float f32084p;

    /* renamed from: q */
    private float f32085q;

    /* renamed from: r */
    private float f32086r;

    /* renamed from: s */
    private long f32087s;

    /* renamed from: t */
    private long f32088t;

    /* renamed from: u */
    private View f32089u;

    /* renamed from: v */
    private View f32090v;

    /* renamed from: w */
    private View f32091w;

    /* renamed from: x */
    private TextView f32092x;

    /* renamed from: d */
    private static boolean m35121d() {
        if (f32068y != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m35119a() {
        if (m35121d()) {
            f32068y.setVisibility(8);
        }
    }

    /* renamed from: b */
    public static void m35120b() {
        if (m35121d()) {
            f32068y.setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m35122e() {
        this.f32090v.setVisibility(0);
        this.f32089u.setVisibility(8);
        this.f32091w.setVisibility(8);
        this.f32082n.width = (int) C12084l.m35243a(getContext(), 212.0f);
        this.f32082n.height = (int) C12084l.m35243a(getContext(), 84.0f);
        if (this.f32073e > this.f32069a / 2) {
            this.f32082n.x = this.f32073e - (this.f32082n.width / 2);
        }
        this.f32082n.y = (this.f32074f + (((int) C12084l.m35243a(getContext(), 50.0f)) / 2)) - (this.f32082n.height / 2);
        this.f32081m.updateViewLayout(this, this.f32082n);
        this.f32075g.removeCallbacksAndMessages(null);
        this.f32075g.postDelayed(new Runnable() {
            public final void run() {
                C12054e.this.mo29715c();
            }
        }, 4000);
    }

    /* renamed from: f */
    private void m35123f() {
        int i;
        int i2;
        int i3;
        this.f32082n.x = (int) (this.f32079k - this.f32077i);
        LayoutParams layoutParams = this.f32082n;
        int i4 = 0;
        if (this.f32082n.x < 0) {
            i = 0;
        } else {
            i = this.f32082n.x;
        }
        layoutParams.x = i;
        LayoutParams layoutParams2 = this.f32082n;
        if (this.f32082n.x > this.f32069a - this.f32072d) {
            i2 = this.f32069a - this.f32072d;
        } else {
            i2 = this.f32082n.x;
        }
        layoutParams2.x = i2;
        this.f32082n.y = (int) (this.f32080l - this.f32078j);
        LayoutParams layoutParams3 = this.f32082n;
        if (this.f32082n.y >= 0) {
            i4 = this.f32082n.y;
        }
        layoutParams3.y = i4;
        LayoutParams layoutParams4 = this.f32082n;
        if (this.f32082n.y > this.f32070b - this.f32071c) {
            i3 = this.f32070b - this.f32071c;
        } else {
            i3 = this.f32082n.y;
        }
        layoutParams4.y = i3;
        this.f32073e = this.f32082n.x;
        this.f32074f = this.f32082n.y;
        this.f32081m.updateViewLayout(this, this.f32082n);
    }

    /* renamed from: c */
    public final void mo29715c() {
        this.f32082n.x = this.f32073e;
        this.f32082n.y = this.f32074f;
        this.f32090v.setVisibility(8);
        this.f32089u.setVisibility(0);
        this.f32091w.setVisibility(8);
        this.f32082n.width = (int) C12084l.m35243a(getContext(), 40.0f);
        this.f32082n.height = (int) C12084l.m35243a(getContext(), 40.0f);
        this.f32081m.updateViewLayout(this, this.f32082n);
        this.f32075g.removeCallbacksAndMessages(null);
    }

    public final void setTitle(String str) {
        if (this.f32092x != null) {
            this.f32092x.setText(str);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((this.f32089u.getVisibility() != 0 && this.f32091w.getVisibility() != 0) || getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        this.f32079k = motionEvent.getRawX();
        this.f32080l = motionEvent.getRawY() - ((float) this.f32076h);
        switch (motionEvent.getAction()) {
            case 0:
                this.f32077i = motionEvent.getX();
                this.f32078j = motionEvent.getY();
                this.f32085q = motionEvent.getRawX();
                this.f32086r = motionEvent.getRawY();
                this.f32087s = System.currentTimeMillis();
                break;
            case 1:
                this.f32083o = motionEvent.getRawX();
                this.f32084p = motionEvent.getRawY();
                this.f32088t = System.currentTimeMillis();
                if (this.f32088t - this.f32087s < 500 && ((double) Math.abs(this.f32085q - this.f32083o)) < 20.0d && ((double) Math.abs(this.f32086r - this.f32084p)) < 20.0d && this.f32089u.getVisibility() == 0) {
                    m35122e();
                    break;
                }
            case 2:
                m35123f();
                break;
        }
        return true;
    }
}
