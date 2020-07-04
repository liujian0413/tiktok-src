package com.p280ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.common.internal.C13307g;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileFragmentAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator */
public class MusProfileNavigator extends RelativeLayout {

    /* renamed from: a */
    public LinearLayout f94351a;

    /* renamed from: b */
    public View f94352b;

    /* renamed from: c */
    public View f94353c;

    /* renamed from: d */
    public boolean f94354d = true;

    /* renamed from: e */
    private boolean f94355e;

    /* renamed from: f */
    private FragmentPagerAdapter f94356f;

    /* renamed from: g */
    private int f94357g;

    /* renamed from: h */
    private C0935e f94358h;

    /* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator$a */
    public interface C36095a {
        /* renamed from: i */
        void mo91846i(int i);

        /* renamed from: j */
        void mo91847j(int i);
    }

    /* renamed from: a */
    private boolean m116239a() {
        if (this.f94357g == 1) {
            return true;
        }
        return false;
    }

    public int getTabCount() {
        return this.f94351a.getChildCount();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f94351a = (LinearLayout) findViewById(R.id.dfb);
        this.f94353c = findViewById(R.id.bwe);
    }

    public void setScrollable(boolean z) {
        this.f94354d = z;
    }

    public MusProfileNavigator(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final View mo91833a(int i) {
        return this.f94351a.getChildAt(i);
    }

    /* renamed from: a */
    public final void mo91837a(boolean z) {
        if (this.f94353c != null) {
            this.f94353c.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final int mo91838b(int i) {
        if (this.f94356f == null || this.f94356f.getCount() <= i) {
            return 0;
        }
        if (!this.f94355e || !(this.f94356f instanceof ProfileFragmentAdapter)) {
            return (int) this.f94356f.mo2424b(i);
        }
        return ((ProfileFragmentAdapter) this.f94356f).mo92302e(i);
    }

    public MusProfileNavigator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo91835a(ViewPager viewPager, View view) {
        if (viewPager != null && view != null) {
            mo91834a(viewPager.getCurrentItem(), 0.0f, view);
        }
    }

    public MusProfileNavigator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo91834a(int i, float f, View view) {
        if (C23487o.m77147a(view)) {
            View a = mo91833a(i);
            View a2 = mo91833a(i + 1);
            if (a != null && a.getVisibility() == 0 && a2 != null && a2.getVisibility() == 0) {
                float x = (a.getX() + ((float) (a.getWidth() / 2))) - ((float) (view.getWidth() / 2));
                view.setX(getX() + x + (f * (((a2.getX() + ((float) (a2.getWidth() / 2))) - ((float) (view.getWidth() / 2))) - x)));
            } else if (C23487o.m77147a(a)) {
                view.setX(((getX() + a.getX()) + ((float) (a.getWidth() / 2))) - ((float) (view.getWidth() / 2)));
            }
        }
    }

    /* renamed from: a */
    public final void mo91836a(final ViewPager viewPager, boolean z, boolean z2, final C36095a aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        C13307g.m38940a(viewPager);
        C13307g.m38940a(viewPager.getAdapter());
        this.f94356f = (FragmentPagerAdapter) viewPager.getAdapter();
        if (this.f94356f.getCount() > 0) {
            this.f94355e = z2;
            this.f94351a.removeAllViews();
            int count = this.f94356f.getCount();
            if (count == 4) {
                this.f94357g = 1;
            } else {
                this.f94357g = 0;
            }
            for (final int i5 = 0; i5 < count; i5++) {
                if (!z2 || !(this.f94356f instanceof ProfileFragmentAdapter)) {
                    i = (int) this.f94356f.mo2424b(i5);
                } else {
                    i = ((ProfileFragmentAdapter) this.f94356f).mo92302e(i5);
                }
                if (i != 3) {
                    switch (i) {
                        case 0:
                            Context context = getContext();
                            int i6 = this.f94357g;
                            LinearLayout linearLayout = this.f94351a;
                            if (!m116239a()) {
                                i3 = R.drawable.ajh;
                            } else {
                                i3 = R.string.fsv;
                            }
                            MusProfileTabView a = C36101a.m116260a(context, i6, linearLayout, i3);
                            a.setOnClickListener(new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    if (MusProfileNavigator.this.f94354d) {
                                        if (aVar != null) {
                                            aVar.mo91847j(0);
                                        }
                                        viewPager.setCurrentItem(i5);
                                    }
                                }
                            });
                            a.setBackground(getContext().getResources().getDrawable(R.drawable.i3));
                            this.f94351a.addView(a);
                            break;
                        case 1:
                            Context context2 = getContext();
                            int i7 = this.f94357g;
                            LinearLayout linearLayout2 = this.f94351a;
                            if (!m116239a()) {
                                i4 = R.drawable.ajn;
                            } else {
                                i4 = R.string.bz_;
                            }
                            MusProfileTabView a2 = C36101a.m116260a(context2, i7, linearLayout2, i4);
                            a2.setOnClickListener(new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    if (MusProfileNavigator.this.f94354d) {
                                        if (aVar != null) {
                                            aVar.mo91847j(1);
                                        }
                                        viewPager.setCurrentItem(i5);
                                    }
                                }
                            });
                            a2.setBackground(getContext().getResources().getDrawable(R.drawable.i3));
                            this.f94351a.addView(a2);
                            break;
                        default:
                            StringBuilder sb = new StringBuilder("unknown aweme list type: ");
                            sb.append(i);
                            throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    Context context3 = getContext();
                    int i8 = this.f94357g;
                    LinearLayout linearLayout3 = this.f94351a;
                    if (!m116239a()) {
                        i2 = R.drawable.ad4;
                    } else {
                        i2 = R.string.cgx;
                    }
                    MusProfileTabView a3 = C36101a.m116260a(context3, i8, linearLayout3, i2);
                    this.f94352b = a3;
                    a3.setSelected(true);
                    a3.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            if (MusProfileNavigator.this.f94354d) {
                                if (aVar != null) {
                                    aVar.mo91847j(3);
                                }
                                viewPager.setCurrentItem(i5);
                            }
                        }
                    });
                    a3.setBackground(getContext().getResources().getDrawable(R.drawable.i3));
                    this.f94351a.addView(a3);
                }
            }
            MusProfileTabView musProfileTabView = (MusProfileTabView) mo91833a(0);
            if (musProfileTabView != null) {
                this.f94352b = musProfileTabView;
                musProfileTabView.setSelected(true);
            }
            if (this.f94358h != null) {
                viewPager.removeOnPageChangeListener(this.f94358h);
            }
            this.f94358h = new C0935e() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageSelected(int i) {
                    MusProfileNavigator.this.mo91834a(i, 0.0f, MusProfileNavigator.this.f94353c);
                    View childAt = MusProfileNavigator.this.f94351a.getChildAt(i);
                    if (MusProfileNavigator.this.f94352b != null) {
                        MusProfileNavigator.this.f94352b.setSelected(false);
                    }
                    if (childAt != null) {
                        childAt.setSelected(true);
                        MusProfileNavigator.this.f94352b = childAt;
                    }
                    if (aVar != null) {
                        aVar.mo91846i(MusProfileNavigator.this.mo91838b(i));
                    }
                }

                public final void onPageScrolled(int i, float f, int i2) {
                    MusProfileNavigator.this.mo91834a(i, f, MusProfileNavigator.this.f94353c);
                }
            };
            viewPager.addOnPageChangeListener(this.f94358h);
            final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                            MusProfileNavigator.this.mo91835a(viewPager, MusProfileNavigator.this.f94353c);
                        }
                    }
                });
            }
        }
    }
}
