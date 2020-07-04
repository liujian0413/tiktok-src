package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39165c;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView */
public final class StickPointModeChangeView extends FrameLayout {

    /* renamed from: h */
    public static final C39212a f101639h = new C39212a(null);

    /* renamed from: a */
    public AVDmtTextView f101640a;

    /* renamed from: b */
    public AVDmtTextView f101641b;

    /* renamed from: c */
    public DmtThreeAngleView f101642c;

    /* renamed from: d */
    public final int[] f101643d;

    /* renamed from: e */
    public final int[] f101644e;

    /* renamed from: f */
    public int f101645f;

    /* renamed from: g */
    public int f101646g;

    /* renamed from: i */
    private C39165c f101647i;

    /* renamed from: j */
    private final Runnable f101648j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$a */
    public static final class C39212a {
        private C39212a() {
        }

        public /* synthetic */ C39212a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$b */
    static final class C39213b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointModeChangeView f101649a;

        C39213b(StickPointModeChangeView stickPointModeChangeView) {
            this.f101649a = stickPointModeChangeView;
        }

        public final void onClick(View view) {
            float f;
            ClickInstrumentation.onClick(view);
            ViewPropertyAnimator animate = StickPointModeChangeView.m125208a(this.f101649a).animate();
            if (C39182e.m125105i()) {
                f = 0.0f;
            } else {
                f = -((float) this.f101649a.f101646g);
            }
            animate.translationX(f).setDuration(200).start();
            this.f101649a.mo97532a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$c */
    static final class C39214c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointModeChangeView f101650a;

        C39214c(StickPointModeChangeView stickPointModeChangeView) {
            this.f101650a = stickPointModeChangeView;
        }

        public final void onClick(View view) {
            float f;
            ClickInstrumentation.onClick(view);
            ViewPropertyAnimator animate = StickPointModeChangeView.m125208a(this.f101650a).animate();
            if (C39182e.m125105i()) {
                f = (float) this.f101650a.f101646g;
            } else {
                f = 0.0f;
            }
            animate.translationX(f).setDuration(200).start();
            this.f101650a.mo97532a(2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$d */
    static final class C39215d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StickPointModeChangeView f101651a;

        C39215d(StickPointModeChangeView stickPointModeChangeView) {
            this.f101651a = stickPointModeChangeView;
        }

        public final void run() {
            StickPointModeChangeView.m125210b(this.f101651a).getLocationOnScreen(this.f101651a.f101643d);
            StickPointModeChangeView.m125211c(this.f101651a).getLocationOnScreen(this.f101651a.f101644e);
            LayoutParams layoutParams = StickPointModeChangeView.m125208a(this.f101651a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (this.f101651a.f101645f == 1) {
                    layoutParams2.leftMargin = (this.f101651a.f101643d[0] + (StickPointModeChangeView.m125210b(this.f101651a).getMeasuredWidth() / 2)) - (StickPointModeChangeView.m125208a(this.f101651a).getMeasuredWidth() / 2);
                } else {
                    layoutParams2.leftMargin = (this.f101651a.f101644e[0] + (StickPointModeChangeView.m125211c(this.f101651a).getMeasuredWidth() / 2)) - (StickPointModeChangeView.m125208a(this.f101651a).getMeasuredWidth() / 2);
                }
                StickPointModeChangeView.m125208a(this.f101651a).setLayoutParams(layoutParams2);
                this.f101651a.f101646g = (this.f101651a.f101644e[0] - this.f101651a.f101643d[0]) + ((StickPointModeChangeView.m125211c(this.f101651a).getMeasuredWidth() - StickPointModeChangeView.m125210b(this.f101651a).getMeasuredWidth()) / 2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public StickPointModeChangeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickPointModeChangeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setStickPointModeChangeListener(C39165c cVar) {
        C7573i.m23587b(cVar, "listener");
        this.f101647i = cVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtThreeAngleView m125208a(StickPointModeChangeView stickPointModeChangeView) {
        DmtThreeAngleView dmtThreeAngleView = stickPointModeChangeView.f101642c;
        if (dmtThreeAngleView == null) {
            C7573i.m23583a("angleView");
        }
        return dmtThreeAngleView;
    }

    /* renamed from: b */
    public static final /* synthetic */ AVDmtTextView m125210b(StickPointModeChangeView stickPointModeChangeView) {
        AVDmtTextView aVDmtTextView = stickPointModeChangeView.f101640a;
        if (aVDmtTextView == null) {
            C7573i.m23583a("stickPointModeView");
        }
        return aVDmtTextView;
    }

    /* renamed from: c */
    public static final /* synthetic */ AVDmtTextView m125211c(StickPointModeChangeView stickPointModeChangeView) {
        AVDmtTextView aVDmtTextView = stickPointModeChangeView.f101641b;
        if (aVDmtTextView == null) {
            C7573i.m23583a("normalModeView");
        }
        return aVDmtTextView;
    }

    private final void setSelectMode(int i) {
        this.f101645f = i;
        AVDmtTextView aVDmtTextView = this.f101640a;
        if (aVDmtTextView == null) {
            C7573i.m23583a("stickPointModeView");
        }
        aVDmtTextView.post(this.f101648j);
        mo97532a(i);
    }

    /* renamed from: a */
    private final void m125209a(Context context) {
        int i;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ab0, this);
        View findViewById = inflate.findViewById(R.id.dax);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.stick_mode)");
        this.f101640a = (AVDmtTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.c54);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.normal_mode)");
        this.f101641b = (AVDmtTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.g9);
        C7573i.m23582a((Object) findViewById3, "contentView.findViewById(R.id.angle_view)");
        this.f101642c = (DmtThreeAngleView) findViewById3;
        DmtThreeAngleView dmtThreeAngleView = this.f101642c;
        if (dmtThreeAngleView == null) {
            C7573i.m23583a("angleView");
        }
        dmtThreeAngleView.setBgColor(C42111b.f109618a.mo103542a(true, true, false, false, false));
        DmtThreeAngleView dmtThreeAngleView2 = this.f101642c;
        if (dmtThreeAngleView2 == null) {
            C7573i.m23583a("angleView");
        }
        C7573i.m23582a((Object) inflate, "contentView");
        dmtThreeAngleView2.setRoundRadius((int) C9738o.m28708b(inflate.getContext(), 4.0f));
        AVDmtTextView aVDmtTextView = this.f101640a;
        if (aVDmtTextView == null) {
            C7573i.m23583a("stickPointModeView");
        }
        aVDmtTextView.setOnClickListener(new C39213b(this));
        AVDmtTextView aVDmtTextView2 = this.f101641b;
        if (aVDmtTextView2 == null) {
            C7573i.m23583a("normalModeView");
        }
        aVDmtTextView2.setOnClickListener(new C39214c(this));
        if (C39182e.m125105i()) {
            i = 1;
        } else {
            i = 2;
        }
        setSelectMode(i);
    }

    /* renamed from: a */
    public final void mo97532a(int i) {
        if (i == 1) {
            AVDmtTextView aVDmtTextView = this.f101640a;
            if (aVDmtTextView == null) {
                C7573i.m23583a("stickPointModeView");
            }
            aVDmtTextView.setSelected(true);
            AVDmtTextView aVDmtTextView2 = this.f101641b;
            if (aVDmtTextView2 == null) {
                C7573i.m23583a("normalModeView");
            }
            aVDmtTextView2.setSelected(false);
            AVDmtTextView aVDmtTextView3 = this.f101641b;
            if (aVDmtTextView3 == null) {
                C7573i.m23583a("normalModeView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
            AVDmtTextView aVDmtTextView4 = this.f101641b;
            if (aVDmtTextView4 == null) {
                C7573i.m23583a("normalModeView");
            }
            TextPaint paint = aVDmtTextView4.getPaint();
            C7573i.m23582a((Object) paint, "normalModeView.paint");
            paint.setFakeBoldText(false);
            AVDmtTextView aVDmtTextView5 = this.f101640a;
            if (aVDmtTextView5 == null) {
                C7573i.m23583a("stickPointModeView");
            }
            aVDmtTextView5.mo103533b();
            AVDmtTextView aVDmtTextView6 = this.f101640a;
            if (aVDmtTextView6 == null) {
                C7573i.m23583a("stickPointModeView");
            }
            TextPaint paint2 = aVDmtTextView6.getPaint();
            C7573i.m23582a((Object) paint2, "stickPointModeView.paint");
            paint2.setFakeBoldText(true);
        } else {
            AVDmtTextView aVDmtTextView7 = this.f101640a;
            if (aVDmtTextView7 == null) {
                C7573i.m23583a("stickPointModeView");
            }
            aVDmtTextView7.setSelected(false);
            AVDmtTextView aVDmtTextView8 = this.f101641b;
            if (aVDmtTextView8 == null) {
                C7573i.m23583a("normalModeView");
            }
            aVDmtTextView8.setSelected(true);
            AVDmtTextView aVDmtTextView9 = this.f101640a;
            if (aVDmtTextView9 == null) {
                C7573i.m23583a("stickPointModeView");
            }
            aVDmtTextView9.setTypeface(Typeface.defaultFromStyle(0));
            AVDmtTextView aVDmtTextView10 = this.f101640a;
            if (aVDmtTextView10 == null) {
                C7573i.m23583a("stickPointModeView");
            }
            TextPaint paint3 = aVDmtTextView10.getPaint();
            C7573i.m23582a((Object) paint3, "stickPointModeView.paint");
            paint3.setFakeBoldText(false);
            AVDmtTextView aVDmtTextView11 = this.f101641b;
            if (aVDmtTextView11 == null) {
                C7573i.m23583a("normalModeView");
            }
            aVDmtTextView11.mo103533b();
            AVDmtTextView aVDmtTextView12 = this.f101641b;
            if (aVDmtTextView12 == null) {
                C7573i.m23583a("normalModeView");
            }
            TextPaint paint4 = aVDmtTextView12.getPaint();
            C7573i.m23582a((Object) paint4, "normalModeView.paint");
            paint4.setFakeBoldText(true);
        }
        C39165c cVar = this.f101647i;
        if (cVar != null) {
            cVar.mo97196a(i);
        }
    }

    public StickPointModeChangeView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        int i2 = 2;
        this.f101643d = new int[2];
        this.f101644e = new int[2];
        if (C39182e.m125105i()) {
            i2 = 1;
        }
        this.f101645f = i2;
        this.f101648j = new C39215d(this);
        m125209a(context);
    }

    public /* synthetic */ StickPointModeChangeView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
