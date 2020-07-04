package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.R$styleable;
import android.support.design.p021g.C0277a;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class SnackbarContentLayout extends LinearLayout implements C0277a {

    /* renamed from: a */
    private TextView f1490a;

    /* renamed from: b */
    private Button f1491b;

    /* renamed from: c */
    private int f1492c;

    /* renamed from: d */
    private int f1493d;

    public Button getActionView() {
        return this.f1491b;
    }

    public TextView getMessageView() {
        return this.f1490a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1490a = (TextView) findViewById(R.id.d8k);
        this.f1491b = (Button) findViewById(R.id.d8j);
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
        this.f1492c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1493d = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo1055a(int i, int i2) {
        this.f1490a.setAlpha(0.0f);
        this.f1490a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.f1491b.getVisibility() == 0) {
            this.f1491b.setAlpha(0.0f);
            this.f1491b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    /* renamed from: b */
    public final void mo1056b(int i, int i2) {
        this.f1490a.setAlpha(1.0f);
        this.f1490a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.f1491b.getVisibility() == 0) {
            this.f1491b.setAlpha(1.0f);
            this.f1491b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (m1585a(1, r0, r0 - r1) != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (m1585a(0, r0, r0) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f1492c
            if (r0 <= 0) goto L_0x001a
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f1492c
            if (r0 <= r1) goto L_0x001a
            int r8 = r7.f1492c
            r0 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            super.onMeasure(r8, r9)
        L_0x001a:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165426(0x7f0700f2, float:1.7945069E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131165425(0x7f0700f1, float:1.7945067E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f1490a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            if (r2 == 0) goto L_0x005a
            int r5 = r7.f1493d
            if (r5 <= 0) goto L_0x005a
            android.widget.Button r5 = r7.f1491b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f1493d
            if (r5 <= r6) goto L_0x005a
            int r1 = r0 - r1
            boolean r0 = r7.m1585a(r4, r0, r1)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x005a:
            if (r2 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r0 = r1
        L_0x005e:
            boolean r0 = r7.m1585a(r3, r0, r0)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r4 = 0
        L_0x0066:
            if (r4 == 0) goto L_0x006b
            super.onMeasure(r8, r9)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SnackbarContentLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private static void m1584a(View view, int i, int i2) {
        if (C0991u.m4246y(view)) {
            C0991u.m4202b(view, C0991u.m4229k(view), i, C0991u.m4232l(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    private boolean m1585a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f1490a.getPaddingTop() == i2 && this.f1490a.getPaddingBottom() == i3) {
            return z;
        }
        m1584a((View) this.f1490a, i2, i3);
        return true;
    }
}
