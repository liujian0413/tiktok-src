package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LivingView */
public class LivingView extends FrameLayout {

    /* renamed from: a */
    private static final int f15056a = C3358ac.m12510a(32.0f);

    /* renamed from: b */
    private static final int f15057b = C3358ac.m12510a(40.0f);

    /* renamed from: c */
    private static final int f15058c = C3358ac.m12510a(48.0f);

    /* renamed from: d */
    private static final int f15059d = C3358ac.m12510a(56.0f);

    /* renamed from: e */
    private static final int f15060e = C3358ac.m12510a(64.0f);

    /* renamed from: f */
    private static final int f15061f = C3358ac.m12510a(68.0f);

    /* renamed from: g */
    private static final int f15062g = C3358ac.m12510a(72.0f);

    /* renamed from: h */
    private static final int f15063h = C3358ac.m12510a(80.0f);

    /* renamed from: i */
    private static final int f15064i = C3358ac.m12510a(13.0f);

    /* renamed from: j */
    private static final int f15065j = C3358ac.m12510a(33.0f);

    /* renamed from: k */
    private static final int f15066k = C3358ac.m12510a(14.0f);

    /* renamed from: l */
    private static final int f15067l = C3358ac.m12510a(50.0f);

    /* renamed from: m */
    private static final int f15068m = C3358ac.m12510a(20.0f);

    /* renamed from: n */
    private static final int f15069n = C3358ac.m12510a(49.5f);

    /* renamed from: o */
    private static final int f15070o = C3358ac.m12510a(21.0f);

    /* renamed from: p */
    private TextView f15071p;

    /* renamed from: q */
    private C5303dy f15072q;

    public LivingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m16669a(Context context) {
        this.f15071p = new TextView(context);
        this.f15072q = new C5303dy(context);
        addView(this.f15072q);
        addView(this.f15071p);
        this.f15071p.setVisibility(8);
        this.f15072q.setVisibility(8);
    }

    public LivingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        this.f15071p.setTextColor(C3358ac.m12521b((int) R.color.alg));
        this.f15071p.setBackgroundResource(R.drawable.bvm);
        this.f15071p.setText(R.string.eev);
        this.f15071p.setGravity(17);
        LayoutParams layoutParams = getLayoutParams();
        int i6 = layoutParams.width;
        int i7 = layoutParams.height;
        float f = 10.0f;
        int i8 = 0;
        if (i6 == f15056a) {
            int a = C3358ac.m12510a(5.0f);
            i3 = a;
            i8 = i6 - (a * 2);
            i4 = f15064i;
            f = 8.0f;
        } else {
            if (i6 == f15057b) {
                i8 = f15065j;
                i4 = f15066k;
                i5 = (i6 - i8) / 2;
            } else if (i6 == f15058c) {
                int a2 = C3358ac.m12510a(8.0f);
                i4 = (int) (((float) C3358ac.m12510a(6.0f)) + C3358ac.m12519b(10.0f));
                int i9 = a2;
                i8 = i6 - (a2 * 2);
                i3 = i9;
            } else if (i6 == f15059d) {
                i8 = f15065j;
                i4 = f15066k;
                i5 = (i6 - i8) / 2;
            } else {
                if (i6 == f15061f) {
                    i6 += C3358ac.m12510a(8.0f);
                    i7 += C3358ac.m12510a(8.0f);
                } else if (i6 == f15062g) {
                    i8 = f15067l;
                    i4 = f15068m;
                    f = 12.0f;
                    i3 = (i6 - i8) / 2;
                } else if (i6 == f15063h) {
                    i6 += C3358ac.m12510a(8.0f);
                    i7 += C3358ac.m12510a(8.0f);
                    f = 13.5f;
                    i8 = f15069n;
                    i4 = f15070o;
                    i3 = (i6 - i8) / 2;
                }
                i4 = 0;
                f = 0.0f;
                i3 = 0;
            }
            i3 = i5;
            f = 9.0f;
        }
        this.f15072q.getLayoutParams().width = i6;
        this.f15072q.getLayoutParams().height = i7;
        this.f15071p.setTextSize(f);
        this.f15071p.getLayoutParams().width = i8;
        this.f15071p.getLayoutParams().height = i4;
        if (this.f15071p.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) this.f15071p.getLayoutParams()).topMargin = i7 - i4;
            ((FrameLayout.LayoutParams) this.f15071p.getLayoutParams()).leftMargin = i3;
            ((FrameLayout.LayoutParams) this.f15071p.getLayoutParams()).rightMargin = i3;
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i6, 1073741824), MeasureSpec.makeMeasureSpec(i7, 1073741824));
    }

    public LivingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16669a(context);
    }
}
