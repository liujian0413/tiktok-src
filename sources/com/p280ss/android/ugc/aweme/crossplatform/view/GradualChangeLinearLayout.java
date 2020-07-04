package com.p280ss.android.ugc.aweme.crossplatform.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout */
public final class GradualChangeLinearLayout extends LinearLayout {

    /* renamed from: a */
    public Space f68783a;

    /* renamed from: b */
    public int f68784b;

    /* renamed from: c */
    public int f68785c;

    /* renamed from: d */
    public boolean f68786d;

    /* renamed from: e */
    private SingleWebView f68787e;

    /* renamed from: f */
    private CrossPlatformTitleBar f68788f;

    /* renamed from: g */
    private int f68789g;

    /* renamed from: h */
    private int f68790h;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout$a */
    public static final class C26020a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ GradualChangeLinearLayout f68791a;

        public final void onGlobalLayout() {
            this.f68791a.f68784b = GradualChangeLinearLayout.m85476a(this.f68791a).getHeight();
            GradualChangeLinearLayout.m85476a(this.f68791a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        C26020a(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f68791a = gradualChangeLinearLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout$b */
    public static final class C26021b implements C26026d {

        /* renamed from: a */
        final /* synthetic */ GradualChangeLinearLayout f68792a;

        C26021b(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f68792a = gradualChangeLinearLayout;
        }

        /* renamed from: a */
        public final void mo66425a(int i, int i2, int i3, int i4) {
            this.f68792a.f68785c = i2;
        }
    }

    public GradualChangeLinearLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public GradualChangeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final CrossPlatformTitleBar getTitleBar() {
        return this.f68788f;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.c3a);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.nav_bar_divide)");
        this.f68783a = (Space) findViewById;
        Space space = this.f68783a;
        if (space == null) {
            C7573i.m23583a("space");
        }
        space.getViewTreeObserver().addOnGlobalLayoutListener(new C26020a(this));
        View findViewById2 = findViewById(R.id.a5b);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.cross_react_view)");
        SingleWebView b = ((C26039m) ((CrossPlatformWebView) findViewById2).mo67463a(C26039m.class)).mo67531b();
        C7573i.m23582a((Object) b, "crossPlatformWebView.get…Wrap::class.java).webView");
        this.f68787e = b;
        SingleWebView singleWebView = this.f68787e;
        if (singleWebView == null) {
            C7573i.m23583a("webView");
        }
        singleWebView.setWebScrollListener(new C26021b(this));
    }

    public final void setTitleBar(CrossPlatformTitleBar crossPlatformTitleBar) {
        this.f68788f = crossPlatformTitleBar;
    }

    /* renamed from: a */
    public static final /* synthetic */ Space m85476a(GradualChangeLinearLayout gradualChangeLinearLayout) {
        Space space = gradualChangeLinearLayout.f68783a;
        if (space == null) {
            C7573i.m23583a("space");
        }
        return space;
    }

    public final void setGradualChangeMode(boolean z) {
        this.f68786d = z;
        Space space = this.f68783a;
        if (space == null) {
            C7573i.m23583a("space");
        }
        if (space.getHeight() != this.f68784b) {
            Space space2 = this.f68783a;
            if (space2 == null) {
                C7573i.m23583a("space");
            }
            LayoutParams layoutParams = space2.getLayoutParams();
            layoutParams.height = this.f68784b;
            Space space3 = this.f68783a;
            if (space3 == null) {
                C7573i.m23583a("space");
            }
            space3.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (!this.f68786d) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f68789g = (int) motionEvent.getY();
            this.f68790h = (int) motionEvent.getY();
        } else if (num != null && num.intValue() == 2) {
            int y = (int) motionEvent.getY();
            int i = y - this.f68790h;
            Space space = this.f68783a;
            if (space == null) {
                C7573i.m23583a("space");
            }
            int height = space.getHeight();
            this.f68790h = y;
            if (height > 0 && i < 0) {
                Space space2 = this.f68783a;
                if (space2 == null) {
                    C7573i.m23583a("space");
                }
                LayoutParams layoutParams = space2.getLayoutParams();
                layoutParams.height += i;
                if (layoutParams.height < 0) {
                    layoutParams.height = 0;
                }
                Space space3 = this.f68783a;
                if (space3 == null) {
                    C7573i.m23583a("space");
                }
                space3.setLayoutParams(layoutParams);
                CrossPlatformTitleBar crossPlatformTitleBar = this.f68788f;
                if (crossPlatformTitleBar != null) {
                    crossPlatformTitleBar.setBackgroundAlpha(((float) layoutParams.height) / ((float) this.f68784b));
                }
                return true;
            } else if (height < this.f68784b && this.f68785c == 0 && i > 0) {
                Space space4 = this.f68783a;
                if (space4 == null) {
                    C7573i.m23583a("space");
                }
                LayoutParams layoutParams2 = space4.getLayoutParams();
                layoutParams2.height += i;
                if (layoutParams2.height > this.f68784b) {
                    layoutParams2.height = this.f68784b;
                }
                CrossPlatformTitleBar crossPlatformTitleBar2 = this.f68788f;
                if (crossPlatformTitleBar2 != null) {
                    crossPlatformTitleBar2.setBackgroundAlpha(((float) layoutParams2.height) / ((float) this.f68784b));
                }
                Space space5 = this.f68783a;
                if (space5 == null) {
                    C7573i.m23583a("space");
                }
                space5.setLayoutParams(layoutParams2);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public GradualChangeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ GradualChangeLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
