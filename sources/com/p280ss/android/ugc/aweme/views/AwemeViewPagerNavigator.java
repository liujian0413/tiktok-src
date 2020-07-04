package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.internal.C13307g;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator */
public class AwemeViewPagerNavigator extends FrameLayout {

    /* renamed from: f */
    public static final String f112152f = "AwemeViewPagerNavigator";

    /* renamed from: a */
    public View f112153a;

    /* renamed from: b */
    public LinearLayout f112154b;

    /* renamed from: c */
    public int f112155c;

    /* renamed from: d */
    public View f112156d;

    /* renamed from: e */
    C0935e f112157e;

    /* renamed from: g */
    ViewPager f112158g;

    /* renamed from: h */
    public boolean f112159h;

    /* renamed from: i */
    private int f112160i;

    /* renamed from: j */
    private boolean f112161j;

    /* renamed from: k */
    private List<View> f112162k;

    /* renamed from: l */
    private C43370f f112163l;

    /* renamed from: m */
    private FrameLayout f112164m;

    /* renamed from: n */
    private boolean f112165n;

    /* renamed from: com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator$a */
    public interface C43324a {
    }

    public int getAllTabWidth() {
        return this.f112160i;
    }

    public View getLastSelectedTab() {
        return this.f112156d;
    }

    public ViewPager getViewPager() {
        return this.f112158g;
    }

    public int getTabCount() {
        return this.f112154b.getChildCount();
    }

    /* renamed from: b */
    private void m137541b() {
        this.f112163l = new C43370f(getContext());
        this.f112163l.setScrollable(false);
        this.f112163l.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f112163l);
        this.f112163l.setHorizontalFadingEdgeEnabled(false);
        this.f112163l.setHorizontalScrollBarEnabled(false);
        this.f112164m = new FrameLayout(getContext());
        this.f112163l.addView(this.f112164m, new ViewGroup.LayoutParams(-2, -1));
        this.f112154b = new LinearLayout(getContext());
        this.f112154b.setOrientation(0);
        this.f112154b.setLayoutParams(new LayoutParams(-1, -1));
        this.f112164m.addView(this.f112154b);
    }

    /* renamed from: a */
    public final boolean mo105131a() {
        Context context = getContext();
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public void setAllTabWidth(int i) {
        this.f112160i = i;
    }

    public AwemeViewPagerNavigator(Context context) {
        this(context, null);
    }

    public void setScrollable(boolean z) {
        this.f112159h = z;
        this.f112163l.setScrollable(z);
    }

    private void setIndicatorPosition(int i) {
        if (this.f112153a != null) {
            float f = (float) (this.f112155c * i);
            if (mo105131a()) {
                f = -f;
            }
            this.f112153a.setTranslationX(f);
        }
    }

    /* renamed from: a */
    public final View mo105128a(int i) {
        if (C6399b.m19944t()) {
            return this.f112154b.getChildAt(i);
        }
        if (this.f112162k == null || i < 0 || i >= this.f112162k.size()) {
            return null;
        }
        return (View) this.f112162k.get(i);
    }

    public AwemeViewPagerNavigator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo105129a(int i, int i2) {
        int i3;
        if (!this.f112165n && this.f112156d != null && !mo105131a()) {
            int scrollX = (this.f112155c * i) - this.f112163l.getScrollX();
            if (scrollX <= this.f112155c / 2) {
                if (i == 1) {
                    i3 = scrollX - this.f112155c;
                } else {
                    i3 = scrollX - (this.f112155c / 2);
                }
            } else if (scrollX < (getMeasuredWidth() - (this.f112155c / 2)) - this.f112155c) {
                i3 = 0;
            } else if (i == i2 - 2) {
                i3 = this.f112155c + ((scrollX + this.f112155c) - getMeasuredWidth());
            } else {
                i3 = (this.f112155c / 2) + ((scrollX + this.f112155c) - getMeasuredWidth());
            }
            this.f112163l.smoothScrollBy(i3, 0);
        }
    }

    /* renamed from: a */
    public final void mo105130a(ViewPager viewPager, C43372h hVar) {
        m137538a(viewPager, hVar, (C43324a) null);
    }

    /* renamed from: a */
    private void m137538a(ViewPager viewPager, C43372h hVar, C43324a aVar) {
        m137539a(viewPager, hVar, null, 0);
    }

    public AwemeViewPagerNavigator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112160i = -1;
        this.f112165n = true;
        this.f112159h = true;
        m137541b();
    }

    /* renamed from: a */
    private void m137537a(ViewPager viewPager, final C43324a aVar, final int i) {
        if (this.f112157e != null) {
            viewPager.removeOnPageChangeListener(this.f112157e);
        }
        this.f112157e = new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageSelected(int i) {
                View view;
                if (C6399b.m19944t()) {
                    view = AwemeViewPagerNavigator.this.f112154b.getChildAt(i);
                } else {
                    view = AwemeViewPagerNavigator.this.mo105128a(i);
                }
                if (AwemeViewPagerNavigator.this.f112156d != null) {
                    AwemeViewPagerNavigator.this.f112156d.setSelected(false);
                }
                if (view != null) {
                    view.setSelected(true);
                    AwemeViewPagerNavigator.this.f112156d = view;
                }
                AwemeViewPagerNavigator.this.mo105129a(i, i);
            }

            public final void onPageScrolled(int i, float f, int i2) {
                if (AwemeViewPagerNavigator.this.f112153a != null) {
                    float f2 = ((float) AwemeViewPagerNavigator.this.f112155c) * (((float) i) + f);
                    if (AwemeViewPagerNavigator.this.mo105131a()) {
                        f2 = -f2;
                    }
                    AwemeViewPagerNavigator.this.f112153a.setTranslationX(f2);
                }
            }
        };
        viewPager.setOnPageChangeListener(this.f112157e);
    }

    /* renamed from: a */
    private void m137539a(ViewPager viewPager, C43372h hVar, C43324a aVar, int i) {
        m137540a(viewPager, hVar, aVar, 0, false);
    }

    /* renamed from: a */
    private void m137540a(ViewPager viewPager, C43372h hVar, C43324a aVar, int i, boolean z) {
        int i2;
        final ViewPager viewPager2 = viewPager;
        final C43324a aVar2 = aVar;
        C13307g.m38940a(viewPager);
        C13307g.m38940a(viewPager.getAdapter());
        C13307g.m38940a(hVar);
        this.f112158g = viewPager2;
        PagerAdapter adapter = viewPager.getAdapter();
        int count = adapter.getCount();
        if (count > 0) {
            this.f112162k = new ArrayList();
            if (this.f112153a != null) {
                this.f112164m.removeView(this.f112153a);
            }
            if (getAllTabWidth() < 0) {
                i2 = getMeasuredWidth();
            } else {
                i2 = getAllTabWidth();
            }
            if (i2 <= 0) {
                i2 = C23482j.m77100c(getContext());
            }
            this.f112155c = i2 / count;
            if (count > 5) {
                getContext();
            }
            int i3 = this.f112155c;
            this.f112153a = hVar.mo89706a(getContext(), this.f112155c);
            int i4 = 0;
            if (this.f112153a != null) {
                this.f112164m.addView(this.f112153a, 0);
            }
            this.f112154b.removeAllViews();
            for (final int i5 = 0; i5 < count; i5++) {
                View a = hVar.mo89707a(getContext(), this.f112154b, adapter, i5, i3, new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (AwemeViewPagerNavigator.this.f112159h) {
                            viewPager2.setCurrentItem(i5);
                        }
                    }
                });
                this.f112154b.addView(a);
                if (!C6399b.m19944t()) {
                    this.f112162k.add(a);
                }
                if (C6399b.m19944t() && i5 < count - 1) {
                    getContext();
                }
            }
            int i6 = i;
            View a2 = mo105128a(i6);
            if (a2 == null) {
                a2 = mo105128a(0);
            } else {
                i4 = i6;
            }
            if (a2 != null) {
                this.f112156d = a2;
                a2.setSelected(true);
                if (i4 > 0) {
                    this.f112153a.setTranslationX((float) (this.f112155c * i4));
                }
            }
            if (C6399b.m19944t() && !this.f112161j) {
                getContext();
                this.f112161j = true;
            }
            m137537a(viewPager2, aVar2, count);
        }
    }
}
