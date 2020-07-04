package com.p280ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.widget.BaseVerticalViewPager;
import com.p280ss.android.ugc.aweme.feed.adapter.C28132ae;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout */
public class LoadMoreFrameLayout extends FrameLayout {

    /* renamed from: a */
    public C28132ae f76501a;

    /* renamed from: b */
    public int f76502b;

    /* renamed from: c */
    public int f76503c;

    /* renamed from: d */
    public int f76504d;

    /* renamed from: e */
    private DmtStatusView f76505e;

    /* renamed from: f */
    private BaseVerticalViewPager f76506f;

    /* renamed from: g */
    private SwipeRefreshLayout f76507g;

    /* renamed from: h */
    private int f76508h;

    /* renamed from: i */
    private boolean f76509i;

    /* renamed from: j */
    private float f76510j;

    /* renamed from: k */
    private float f76511k;

    /* renamed from: l */
    private int f76512l;

    /* renamed from: m */
    private ValueAnimator f76513m;

    /* renamed from: n */
    private long f76514n;

    /* renamed from: o */
    private String f76515o;

    /* renamed from: p */
    private boolean f76516p;

    /* renamed from: q */
    private Drawable f76517q;

    /* renamed from: r */
    private View f76518r;

    /* renamed from: s */
    private C29044a f76519s;

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$a */
    public interface C29044a {
        /* renamed from: a */
        void mo73462a(int i);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.f76516p = true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final void mo74381f() {
        DmtStatusView a = mo74374a(false);
        if (a != null) {
            a.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo74375a() {
        this.f76502b = 0;
        if (this.f76514n == -1) {
            this.f76514n = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo74377b() {
        DmtStatusView a = mo74374a(true);
        if (a != null) {
            a.mo25944h();
        }
        this.f76502b = 2;
        mo74379d();
    }

    /* renamed from: e */
    public final void mo74380e() {
        DmtStatusView a = mo74374a(true);
        if (a != null) {
            a.setVisibility(0);
        }
        setBackgroundColor(getContext().getResources().getColor(R.color.l3));
    }

    public int getViewPagerMarginTop() {
        if (this.f76506f == null) {
            return 0;
        }
        return ((MarginLayoutParams) this.f76506f.getLayoutParams()).topMargin;
    }

    /* renamed from: i */
    public final boolean mo74385i() {
        DmtStatusView a = mo74374a(false);
        if (a == null || a.mo25941e()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo74378c() {
        DmtStatusView a = mo74374a(true);
        if (a != null) {
            a.mo25943g();
        }
        this.f76502b = 1;
        if (this.f76506f != null) {
            m95287j();
        }
        if (this.f76514n != -1 && !TextUtils.isEmpty(this.f76515o)) {
            C6877n.m21451b("aweme_feed_load_more_duration", this.f76515o, (float) (System.currentTimeMillis() - this.f76514n));
            this.f76514n = -1;
        }
    }

    /* renamed from: d */
    public final void mo74379d() {
        DmtStatusView a = mo74374a(false);
        if (a != null) {
            a.mo25939d();
        }
        this.f76502b = -1;
        if (this.f76506f != null) {
            m95287j();
        }
        if (this.f76514n != -1 && !TextUtils.isEmpty(this.f76515o)) {
            C6877n.m21451b("aweme_feed_load_more_duration", this.f76515o, (float) (System.currentTimeMillis() - this.f76514n));
            this.f76514n = -1;
        }
    }

    /* renamed from: g */
    public final void mo74382g() {
        final int i = ((int) (((float) this.f76503c) * 1.5f)) / 100;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 100});
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = i * (intValue - LoadMoreFrameLayout.this.f76504d);
                LoadMoreFrameLayout.this.f76504d = intValue;
                DmtStatusView a = LoadMoreFrameLayout.this.mo74374a(true);
                if (a.mo25941e()) {
                    a.mo25942f();
                } else {
                    LoadMoreFrameLayout.this.mo74380e();
                }
                LoadMoreFrameLayout.this.setViewPagerMarginTopByDelta(-i);
            }
        });
        ofInt.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                LoadMoreFrameLayout.this.mo74384h();
            }

            public final void onAnimationStart(Animator animator) {
                LoadMoreFrameLayout.this.f76504d = 0;
            }
        });
        ofInt.start();
    }

    /* renamed from: j */
    private void m95287j() {
        this.f76513m = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        final int viewPagerMarginTop = getViewPagerMarginTop();
        int i = (viewPagerMarginTop * -200) / this.f76512l;
        if (i < 0) {
            i = C34943c.f91127w;
        }
        this.f76513m.setDuration((long) i);
        this.f76513m.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                if (animatedFraction == 1.0f) {
                    i = -viewPagerMarginTop;
                } else {
                    double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                    double d = (double) viewPagerMarginTop;
                    Double.isNaN(d);
                    double d2 = pow * d;
                    double viewPagerMarginTop2 = (double) LoadMoreFrameLayout.this.getViewPagerMarginTop();
                    Double.isNaN(viewPagerMarginTop2);
                    i = (int) (d2 - viewPagerMarginTop2);
                }
                loadMoreFrameLayout.setViewPagerMarginTopByDelta(i);
            }
        });
        this.f76513m.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                LoadMoreFrameLayout.this.setBackground(null);
            }
        });
        this.f76513m.start();
        mo74381f();
    }

    /* renamed from: h */
    public final void mo74384h() {
        this.f76513m = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        final int viewPagerMarginTop = getViewPagerMarginTop();
        int i = ((this.f76503c + viewPagerMarginTop) * -200) / this.f76512l;
        if (i < 0) {
            i = C34943c.f91127w;
        }
        this.f76513m.setDuration((long) i);
        this.f76513m.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                if (animatedFraction == 1.0f) {
                    i = -(viewPagerMarginTop + LoadMoreFrameLayout.this.f76503c);
                } else {
                    double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                    double d = (double) (viewPagerMarginTop + LoadMoreFrameLayout.this.f76503c);
                    Double.isNaN(d);
                    double d2 = pow * d;
                    double viewPagerMarginTop2 = (double) (LoadMoreFrameLayout.this.getViewPagerMarginTop() + LoadMoreFrameLayout.this.f76503c);
                    Double.isNaN(viewPagerMarginTop2);
                    i = (int) (d2 - viewPagerMarginTop2);
                }
                loadMoreFrameLayout.setViewPagerMarginTopByDelta(i);
            }
        });
        this.f76513m.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (LoadMoreFrameLayout.this.f76501a != null && LoadMoreFrameLayout.this.f76502b == -1) {
                    LoadMoreFrameLayout.this.f76501a.mo67659a();
                }
            }
        });
        this.f76513m.start();
    }

    public void setLabel(String str) {
        this.f76515o = str;
    }

    public void setLoadMoreListener(C28132ae aeVar) {
        this.f76501a = aeVar;
    }

    public void setOnScrolledListener(C29044a aVar) {
        this.f76519s = aVar;
    }

    public LoadMoreFrameLayout(Context context) {
        this(context, null);
    }

    public void setLoadMoreEmptyView(View view) {
        this.f76518r = view;
        this.f76505e = null;
    }

    public void setBottomViewBackground(Drawable drawable) {
        DmtStatusView a = mo74374a(false);
        if (a != null) {
            a.setBackgroundDrawable(drawable);
        } else {
            this.f76517q = drawable;
        }
    }

    /* renamed from: a */
    private void m95286a(Context context) {
        this.f76508h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f76503c = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.f76512l = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
    }

    public void setViewPagerMarginTopByDelta(int i) {
        if (this.f76506f != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f76506f.getLayoutParams();
            marginLayoutParams.topMargin += i;
            marginLayoutParams.bottomMargin = -marginLayoutParams.topMargin;
            if (this.f76519s != null) {
                this.f76519s.mo73462a(marginLayoutParams.topMargin);
            }
            this.f76506f.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final DmtStatusView mo74374a(boolean z) {
        if (this.f76505e == null && z && this.f76516p) {
            try {
                this.f76505e = new DmtStatusView(getContext());
                LayoutParams layoutParams = new LayoutParams(-1, C23486n.m77122a(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C23486n.m77122a(49.0d));
                addView(this.f76505e, 0, layoutParams);
                if (this.f76518r == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.b2x, null);
                    textView.setGravity(17);
                    this.f76518r = textView;
                }
                this.f76505e.setBuilder(C10803a.m31631a(getContext()).mo25959a((int) R.string.c46, (OnClickListener) new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (LoadMoreFrameLayout.this.f76501a != null) {
                            LoadMoreFrameLayout.this.f76501a.mo67659a();
                        }
                    }
                }).mo25963b(this.f76518r));
                if (this.f76517q != null) {
                    this.f76505e.setBackgroundDrawable(this.f76517q);
                }
            } catch (Exception unused) {
                this.f76505e = null;
                this.f76517q = null;
            }
        }
        if (this.f76505e != null && this.f76505e.mo25941e()) {
            this.f76502b = -1;
        }
        return this.f76505e;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f76506f == null || this.f76506f.getAdapter() == null || this.f76506f.getAdapter().getCount() == 0 || this.f76506f.getAdapter().getCount() - 1 != this.f76506f.getCurrentItem() || this.f76506f.mo66632a() || (this.f76507g != null && this.f76507g.f61506b)) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f76509i = false;
                this.f76510j = motionEvent.getY();
                this.f76511k = this.f76510j;
                break;
            case 1:
            case 3:
                this.f76509i = false;
                break;
            case 2:
                float y = motionEvent.getY();
                if (this.f76510j - y <= ((float) this.f76508h) || this.f76509i) {
                    if (y - this.f76510j > ((float) this.f76508h) && !this.f76509i && this.f76506f.getTop() < 0) {
                        this.f76509i = true;
                        if (this.f76513m != null) {
                            this.f76513m.cancel();
                            break;
                        }
                    }
                } else {
                    this.f76509i = true;
                    if (this.f76513m != null) {
                        this.f76513m.cancel();
                        break;
                    }
                }
                break;
        }
        return this.f76509i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r5.f76509i = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r5.mo74374a(r0)
            r2 = 0
            if (r1 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f76506f
            if (r3 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f76506f
            android.support.v4.view.PagerAdapter r3 = r3.getAdapter()
            if (r3 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f76506f
            android.support.v4.view.PagerAdapter r3 = r3.getAdapter()
            int r3 = r3.getCount()
            if (r3 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f76506f
            android.support.v4.view.PagerAdapter r3 = r3.getAdapter()
            int r3 = r3.getCount()
            int r3 = r3 - r0
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r4 = r5.f76506f
            int r4 = r4.getCurrentItem()
            if (r3 != r4) goto L_0x00b0
            com.ss.android.ugc.aweme.common.widget.BaseVerticalViewPager r3 = r5.f76506f
            boolean r3 = r3.mo66632a()
            if (r3 != 0) goto L_0x00b0
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout r3 = r5.f76507g
            if (r3 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout r3 = r5.f76507g
            boolean r3 = r3.f61506b
            if (r3 == 0) goto L_0x0047
            goto L_0x00b0
        L_0x0047:
            int r3 = r6.getAction()
            switch(r3) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x0088;
                case 2: goto L_0x0057;
                case 3: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x00ab
        L_0x004f:
            boolean r0 = r5.f76509i
            if (r0 == 0) goto L_0x00ab
            r5.m95287j()
            goto L_0x00a6
        L_0x0057:
            boolean r0 = r5.f76509i
            if (r0 == 0) goto L_0x00ab
            float r0 = r6.getY()
            float r2 = r5.f76511k
            float r2 = r0 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r3
            int r2 = (int) r2
            r5.f76511k = r0
            int r0 = r5.getViewPagerMarginTop()
            int r3 = r0 + r2
            if (r3 <= 0) goto L_0x0072
            int r2 = -r0
        L_0x0072:
            int r0 = r5.f76512l
            int r0 = -r0
            if (r3 < r0) goto L_0x00ab
            r5.setViewPagerMarginTopByDelta(r2)
            boolean r0 = r1.mo25941e()
            if (r0 == 0) goto L_0x0084
            r1.mo25942f()
            goto L_0x00ab
        L_0x0084:
            r5.mo74380e()
            goto L_0x00ab
        L_0x0088:
            boolean r1 = r5.f76509i
            if (r1 == 0) goto L_0x00ab
            int r1 = r5.getViewPagerMarginTop()
            int r3 = r5.f76503c
            int r3 = -r3
            if (r1 > r3) goto L_0x00a3
            int r1 = r5.f76502b
            if (r1 == r0) goto L_0x00a3
            int r0 = r5.f76502b
            r1 = 2
            if (r0 != r1) goto L_0x009f
            goto L_0x00a3
        L_0x009f:
            r5.mo74384h()
            goto L_0x00a6
        L_0x00a3:
            r5.m95287j()
        L_0x00a6:
            r5.f76509i = r2
            goto L_0x00ab
        L_0x00a9:
            r5.f76509i = r2
        L_0x00ab:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo74376a(BaseVerticalViewPager baseVerticalViewPager, SwipeRefreshLayout swipeRefreshLayout) {
        this.f76506f = baseVerticalViewPager;
        this.f76507g = swipeRefreshLayout;
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f76502b = -1;
        this.f76514n = -1;
        m95286a(context);
    }
}
