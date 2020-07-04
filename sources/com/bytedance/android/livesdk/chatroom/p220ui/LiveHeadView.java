package com.bytedance.android.livesdk.chatroom.p220ui;

import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.widget.C9242f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveHeadView */
public final class LiveHeadView extends FrameLayout {

    /* renamed from: A */
    private static final float[] f14650A = {1.0f, 0.8f};

    /* renamed from: b */
    private static final int f14651b = C3358ac.m12510a(8.0f);

    /* renamed from: c */
    private static final int f14652c = C3358ac.m12510a(20.0f);

    /* renamed from: d */
    private static final int f14653d = C3358ac.m12510a(30.0f);

    /* renamed from: e */
    private static final int f14654e = C3358ac.m12510a(64.0f);

    /* renamed from: f */
    private static final int f14655f = C3358ac.m12510a(32.0f);

    /* renamed from: g */
    private static final int f14656g = C3358ac.m12510a(40.0f);

    /* renamed from: h */
    private static final int f14657h = C3358ac.m12510a(48.0f);

    /* renamed from: i */
    private static final int f14658i = C3358ac.m12510a(56.0f);

    /* renamed from: j */
    private static final int f14659j = C3358ac.m12510a(64.0f);

    /* renamed from: k */
    private static final int f14660k = C3358ac.m12510a(72.0f);

    /* renamed from: l */
    private static final int f14661l = C3358ac.m12510a(80.0f);

    /* renamed from: m */
    private static final int f14662m = C3358ac.m12510a(20.0f);

    /* renamed from: n */
    private static final int f14663n = C3358ac.m12510a(26.0f);

    /* renamed from: o */
    private static final int f14664o = C3358ac.m12510a(32.0f);

    /* renamed from: p */
    private static final int f14665p = C3358ac.m12510a(38.0f);

    /* renamed from: q */
    private static final int f14666q = C3358ac.m12510a(42.0f);

    /* renamed from: r */
    private static final int f14667r = C3358ac.m12510a(50.0f);

    /* renamed from: s */
    private static final int f14668s = C3358ac.m12510a(58.0f);

    /* renamed from: t */
    private static final int f14669t = C3358ac.m12510a(13.0f);

    /* renamed from: u */
    private static final int f14670u = C3358ac.m12510a(33.0f);

    /* renamed from: v */
    private static final int f14671v = C3358ac.m12510a(14.0f);

    /* renamed from: w */
    private static final int f14672w = C3358ac.m12510a(50.0f);

    /* renamed from: x */
    private static final int f14673x = C3358ac.m12510a(20.0f);

    /* renamed from: y */
    private static final int f14674y = C3358ac.m12510a(49.5f);

    /* renamed from: z */
    private static final int f14675z = C3358ac.m12510a(21.0f);

    /* renamed from: B */
    private C9242f f14676B;

    /* renamed from: C */
    private C5303dy f14677C;

    /* renamed from: D */
    private LottieAnimationView f14678D;

    /* renamed from: E */
    private TextView f14679E;

    /* renamed from: F */
    private C5284dq f14680F;

    /* renamed from: G */
    private int f14681G;

    /* renamed from: H */
    private int f14682H;

    /* renamed from: I */
    private int f14683I;

    /* renamed from: J */
    private boolean f14684J;

    /* renamed from: K */
    private int f14685K;

    /* renamed from: a */
    public LottieAnimationView f14686a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveHeadView$LiveAnimationColor */
    public enum LiveAnimationColor {
        RED("indicator_streaming_ring_red.json", "indicator_streaming_tag_red.json"),
        WHITE("indicator_streaming_ring_white.json", "indicator_streaming_tag_white.json");
        
        public String mCircleAnimFileName;
        public String mTagAnimFileName;

        private LiveAnimationColor(String str, String str2) {
            this.mCircleAnimFileName = str;
            this.mTagAnimFileName = str2;
        }
    }

    /* renamed from: a */
    private static int m16440a(int i, int i2) {
        int i3 = i - i2;
        if (i3 > 0) {
            return i3;
        }
        return 0;
    }

    public final C9242f getHeadView() {
        return this.f14676B;
    }

    /* renamed from: a */
    private boolean m16441a() {
        if (this.f14681G == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m16442b() {
        if (this.f14681G == 2) {
            return true;
        }
        return false;
    }

    public final void setLiveType(boolean z) {
        if (z) {
            this.f14685K = 2;
        } else {
            this.f14685K = 1;
        }
    }

    public final void setAuthor(boolean z) {
        if (this.f14676B != null && !m16441a()) {
            this.f14676B.setAuthor(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        LayoutParams layoutParams = getLayoutParams();
        if (this.f14682H == 0) {
            this.f14682H = layoutParams.width;
        }
        int i12 = this.f14682H;
        if (this.f14683I == 0) {
            this.f14683I = layoutParams.height;
        }
        int i13 = this.f14683I;
        this.f14676B.getLayoutParams().width = i12;
        this.f14676B.getLayoutParams().height = i13;
        int i14 = 0;
        if (this.f14685K == 2) {
            i4 = (f14651b * 2) + i12;
            i3 = (f14651b * 2) + i13;
            if (this.f14676B.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                i14 = f14651b;
                ((FrameLayout.LayoutParams) this.f14676B.getLayoutParams()).setMargins(i14, i14, i14, i14);
            }
            this.f14678D.getLayoutParams().width = i4;
            this.f14678D.getLayoutParams().height = i3;
            if (i12 >= f14654e) {
                this.f14686a.getLayoutParams().width = f14653d * 2;
                this.f14686a.getLayoutParams().height = f14653d;
            } else {
                this.f14686a.getLayoutParams().width = f14652c * 2;
                this.f14686a.getLayoutParams().height = f14652c;
            }
            if (this.f14686a.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f14686a.getLayoutParams();
                int i15 = (i4 - layoutParams2.width) / 2;
                layoutParams2.leftMargin = i15;
                layoutParams2.rightMargin = i15;
                if (i12 == f14655f) {
                    i11 = f14662m;
                } else if (i12 == f14656g) {
                    i11 = f14663n;
                } else if (i12 == f14657h) {
                    i11 = f14664o;
                } else if (i12 == f14658i) {
                    i11 = f14665p;
                } else if (i12 == f14659j) {
                    i11 = f14666q;
                } else if (i12 == f14660k) {
                    i11 = f14667r;
                } else if (i12 == f14661l) {
                    i11 = f14668s;
                } else {
                    i11 = i13 - layoutParams2.height;
                }
                layoutParams2.topMargin = i11 + i14;
            }
        } else {
            this.f14679E.setTextColor(C3358ac.m12521b((int) R.color.alg));
            this.f14679E.setBackgroundResource(R.drawable.bvm);
            this.f14679E.setText(R.string.eev);
            this.f14679E.setGravity(17);
            int a = C3358ac.m12510a(8.0f) + i12;
            int a2 = C3358ac.m12510a(8.0f) + i13;
            float f = 1.0f;
            float f2 = 9.0f;
            if (i12 == f14655f) {
                int a3 = C3358ac.m12510a(5.0f);
                i5 = a3;
                i7 = a - (a3 * 2);
                i4 = a;
                i3 = a2;
                i6 = f14669t;
                f = 1.06f;
                f2 = 8.0f;
            } else {
                if (i12 == f14656g) {
                    i7 = f14670u;
                    i10 = f14671v;
                    f = 1.11f;
                    i5 = (a - i7) / 2;
                    i3 = a2;
                } else if (i12 == f14657h) {
                    int a4 = C3358ac.m12510a(8.0f);
                    i10 = (int) (((float) C3358ac.m12510a(6.0f)) + C3358ac.m12519b(10.0f));
                    i5 = a4;
                    i7 = a - (a4 * 2);
                    i3 = a2;
                    f2 = 10.0f;
                } else if (i12 == f14658i) {
                    i7 = f14670u;
                    i10 = f14671v;
                    i5 = (a - i7) / 2;
                    i3 = a2;
                    f = 1.1f;
                } else {
                    if (i12 == f14659j) {
                        i8 = i13 + C3358ac.m12510a(8.0f);
                        i4 = C3358ac.m12510a(8.0f) + i12;
                        i9 = 0;
                        i6 = 0;
                        f = 1.1f;
                    } else if (i12 == f14660k) {
                        i7 = f14672w;
                        i10 = f14673x;
                        i5 = (a - i7) / 2;
                        i3 = a2;
                        f2 = 12.0f;
                    } else if (i12 == f14661l) {
                        i4 = C3358ac.m12510a(8.0f) + i12;
                        int a5 = i13 + C3358ac.m12510a(8.0f);
                        int i16 = f14674y;
                        i6 = f14675z;
                        i3 = a5;
                        i7 = i16;
                        i5 = (i4 - i16) / 2;
                        f = 1.1f;
                        f2 = 13.5f;
                    } else {
                        i4 = a;
                        i8 = a2;
                        i9 = 0;
                        i6 = 0;
                    }
                    i5 = 0;
                    f2 = 0.0f;
                }
                i6 = i10;
                i4 = a;
            }
            this.f14677C.getLayoutParams().width = i4;
            this.f14677C.getLayoutParams().height = i3;
            this.f14679E.setTextSize(f2);
            this.f14679E.getLayoutParams().width = i7;
            this.f14679E.getLayoutParams().height = i6;
            if (m16442b()) {
                this.f14680F.getLayoutParams().width = i4;
                this.f14680F.getLayoutParams().height = i3;
                this.f14680F.setScale(f);
            }
            if (this.f14676B.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                i14 = (i4 - i12) / 2;
                ((FrameLayout.LayoutParams) this.f14676B.getLayoutParams()).setMargins(i14, i14, i14, i14);
            }
            if (this.f14679E.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) this.f14679E.getLayoutParams()).topMargin = i3 - i6;
                ((FrameLayout.LayoutParams) this.f14679E.getLayoutParams()).leftMargin = i5;
                ((FrameLayout.LayoutParams) this.f14679E.getLayoutParams()).rightMargin = i5;
            }
        }
        layoutParams.width = i4;
        layoutParams.height = i3;
        if (!this.f14684J && (layoutParams instanceof MarginLayoutParams)) {
            this.f14684J = true;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = m16440a(marginLayoutParams.topMargin, i14);
            marginLayoutParams.bottomMargin = m16440a(marginLayoutParams.bottomMargin, i14);
            marginLayoutParams.rightMargin = m16440a(marginLayoutParams.rightMargin, i14);
            marginLayoutParams.leftMargin = m16440a(marginLayoutParams.leftMargin, i14);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i4, 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }
}
