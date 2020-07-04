package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout */
public class ColorSelectLayout extends FrameLayout {

    /* renamed from: d */
    private static final int[] f109288d = {-1, -16777216, -44462, -4253993, -10987818, -13461258, -11282583, -13312, -27843, -8795994, -86617, -5601196, -16159855, -14200006, -7235425, -13421773};

    /* renamed from: a */
    private Context f109289a;

    /* renamed from: b */
    private int f109290b;

    /* renamed from: c */
    private int f109291c;

    /* renamed from: e */
    private C42064a f109292e;

    /* renamed from: f */
    private List<ColorCircleView> f109293f;

    /* renamed from: g */
    private LinearLayout f109294g;

    /* renamed from: h */
    private DmtAutoCenterScrollView f109295h;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout$a */
    public interface C42064a {
        /* renamed from: a */
        void mo99488a(int i);
    }

    /* renamed from: b */
    private void m133782b() {
        for (ColorCircleView colorCircleView : this.f109293f) {
            if (colorCircleView.f109283a) {
                m133781a((View) colorCircleView, true);
                colorCircleView.f109283a = false;
            }
        }
    }

    /* renamed from: a */
    private void m133780a() {
        this.f109294g = new LinearLayout(getContext());
        this.f109295h = new DmtAutoCenterScrollView(getContext(), null);
        this.f109295h.addView(this.f109294g, new LayoutParams(-1, -1));
        this.f109295h.setHorizontalScrollBarEnabled(false);
        addView(this.f109295h, new LayoutParams(-1, -1));
        this.f109293f.clear();
        for (int i = 0; i < f109288d.length; i++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f109291c, this.f109291c);
            ColorCircleView colorCircleView = new ColorCircleView(this.f109289a);
            colorCircleView.mo103306a(f109288d[i]).mo103307a();
            colorCircleView.setTag(Integer.valueOf(f109288d[i]));
            if (i == f109288d.length - 1) {
                layoutParams.rightMargin = (int) C9738o.m28708b(this.f109289a, 12.0f);
            } else {
                layoutParams.rightMargin = this.f109290b;
            }
            if (i == 0) {
                layoutParams.leftMargin = (int) C9738o.m28708b(this.f109289a, 12.0f);
            } else {
                layoutParams.leftMargin = (int) C9738o.m28708b(this.f109289a, 2.0f);
            }
            layoutParams.gravity = 16;
            this.f109294g.addView(colorCircleView, layoutParams);
            this.f109293f.add(colorCircleView);
            colorCircleView.setOnClickListener(new C42069a(this, colorCircleView));
        }
        setSelectColorView(-1);
    }

    public void setColorChangeListener(C42064a aVar) {
        this.f109292e = aVar;
    }

    public ColorSelectLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo103311a(int i) {
        if (this.f109292e != null) {
            this.f109292e.mo99488a(i);
        }
    }

    public void setSelectColorView(int i) {
        m133782b();
        for (ColorCircleView colorCircleView : this.f109293f) {
            if (colorCircleView != null && colorCircleView.getColor() == i) {
                m133781a((View) colorCircleView, false);
                colorCircleView.f109283a = true;
                this.f109295h.mo103317a(colorCircleView);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f109291c = getMeasuredHeight();
    }

    /* renamed from: a */
    public final void mo103313a(boolean z, int i) {
        m133782b();
        if (z) {
            setSelectColorView(i);
        }
    }

    public ColorSelectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109291c = 80;
        this.f109293f = new ArrayList();
        this.f109289a = context;
        this.f109290b = (int) C9738o.m28708b(context, 6.0f);
        this.f109291c = (int) C9738o.m28708b(context, 30.0f);
        m133780a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo103312a(ColorCircleView colorCircleView, View view) {
        m133782b();
        m133781a(view, false);
        ((ColorCircleView) view).f109283a = true;
        if (this.f109292e != null) {
            this.f109292e.mo99488a(((Integer) view.getTag()).intValue());
        }
        this.f109295h.mo103317a(colorCircleView);
    }

    /* renamed from: a */
    private static void m133781a(View view, boolean z) {
        float f;
        float f2;
        float f3;
        AnimatorSet animatorSet = new AnimatorSet();
        String str = "scaleX";
        float[] fArr = new float[2];
        float f4 = 1.0f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 1.2f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        String str2 = "scaleY";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 1.2f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (!z) {
            f4 = 1.2f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, str2, fArr2);
        animatorSet.setDuration(200);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
