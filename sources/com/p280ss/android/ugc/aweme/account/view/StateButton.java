package com.p280ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21337n;
import com.p280ss.android.ugc.aweme.account.login.p974ui.CheckButton;
import com.p280ss.android.ugc.aweme.p1416n.C34033b;

/* renamed from: com.ss.android.ugc.aweme.account.view.StateButton */
public class StateButton extends DmtButton {

    /* renamed from: b */
    public static int f59624b = 0;

    /* renamed from: c */
    public static int f59625c = 1;

    /* renamed from: d */
    public static int f59626d = 2;

    /* renamed from: e */
    public static int f59627e = 0;

    /* renamed from: f */
    public static int f59628f = 1;

    /* renamed from: g */
    private Drawable f59629g;

    /* renamed from: h */
    private Drawable f59630h;

    /* renamed from: i */
    private Drawable f59631i;

    /* renamed from: j */
    private Animation f59632j;

    /* renamed from: k */
    private int f59633k;

    /* renamed from: l */
    private int f59634l;

    /* renamed from: m */
    private int f59635m;

    /* renamed from: com.ss.android.ugc.aweme.account.view.StateButton$a */
    public static class C22358a {
        /* renamed from: a */
        public static void m74033a(View view) {
            if (view instanceof StateButton) {
                ((StateButton) view).mo58776c();
            } else if (view instanceof C21337n) {
                ((C21337n) view).mo57357a();
            } else {
                if (view instanceof CheckButton) {
                    ((CheckButton) view).mo58186d();
                }
            }
        }

        /* renamed from: b */
        public static void m74035b(View view) {
            if (view instanceof StateButton) {
                ((StateButton) view).mo58775b();
            } else if (view instanceof C21337n) {
                ((C21337n) view).mo57356Z_();
            } else {
                if (view instanceof CheckButton) {
                    ((CheckButton) view).mo58184b();
                }
            }
        }

        /* renamed from: a */
        public static void m74034a(View view, boolean z) {
            if (!(view instanceof StateButton)) {
                view.setEnabled(z);
            } else if (z) {
                ((StateButton) view).mo58774a(StateButton.f59625c);
            } else {
                ((StateButton) view).mo58774a(StateButton.f59624b);
            }
        }
    }

    /* renamed from: d */
    private void m74029d() {
        mo58774a(this.f59634l);
    }

    /* renamed from: c */
    public final void mo58776c() {
        m74028b(f59626d);
    }

    /* renamed from: b */
    public final void mo58775b() {
        mo58774a(f59626d);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f59632j != null) {
            this.f59632j.cancel();
        }
    }

    public StateButton(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m74028b(int i) {
        if (this.f59633k == i) {
            m74029d();
        }
    }

    /* renamed from: a */
    public final void mo58774a(int i) {
        if (this.f59633k != i) {
            this.f59634l = this.f59633k;
            this.f59633k = i;
            if (!(this.f59633k == f59626d || this.f59634l != f59626d || this.f59632j == null)) {
                clearAnimation();
                this.f59632j.cancel();
            }
            if (i == f59624b) {
                setBackground(this.f59629g);
            } else if (i == f59625c) {
                setBackground(this.f59630h);
            } else if (i == f59626d) {
                setBackground(this.f59631i);
                startAnimation(this.f59632j);
            } else {
                this.f59633k = this.f59634l;
            }
        }
    }

    public StateButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StateButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59633k = -1;
        this.f59634l = this.f59633k;
        this.f59635m = f59627e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StateButton);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                mo58774a(obtainStyledAttributes.getInt(0, f59624b));
            } else if (index == 1) {
                this.f59629g = obtainStyledAttributes.getDrawable(1);
            } else if (index == 2) {
                this.f59630h = obtainStyledAttributes.getDrawable(2);
            } else if (index == 3) {
                this.f59631i = obtainStyledAttributes.getDrawable(3);
            } else if (index == 4) {
                this.f59635m = obtainStyledAttributes.getInt(4, f59627e);
            }
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f59632j = rotateAnimation;
        this.f59632j.setRepeatCount(-1);
        this.f59632j.setDuration(800);
        if (this.f59635m == f59628f) {
            setOnTouchListener(new C34033b(1.2f, 100, null));
        }
        if (this.f59633k == -1) {
            mo58774a(f59624b);
        }
        obtainStyledAttributes.recycle();
    }
}
