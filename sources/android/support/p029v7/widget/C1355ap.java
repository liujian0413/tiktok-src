package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p029v7.app.ActionBar.C1067a;
import android.support.p029v7.view.C1152a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.ap */
public final class C1355ap extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: i */
    private static final Interpolator f5290i = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f5291a;

    /* renamed from: b */
    LinearLayoutCompat f5292b;

    /* renamed from: c */
    int f5293c;

    /* renamed from: d */
    int f5294d;

    /* renamed from: e */
    private Spinner f5295e;

    /* renamed from: f */
    private boolean f5296f;

    /* renamed from: g */
    private int f5297g;

    /* renamed from: h */
    private int f5298h;

    /* renamed from: android.support.v7.widget.ap$a */
    class C1357a extends BaseAdapter {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            return C1355ap.this.f5292b.getChildCount();
        }

        C1357a() {
        }

        public final Object getItem(int i) {
            return ((C1358b) C1355ap.this.f5292b.getChildAt(i)).mo6375a();
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C1355ap.this.mo6359a((C1067a) getItem(i), true);
            }
            ((C1358b) view).mo6376a((C1067a) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.ap$b */
    class C1358b extends LinearLayout {

        /* renamed from: b */
        private final int[] f5303b = {16842964};

        /* renamed from: c */
        private C1067a f5304c;

        /* renamed from: d */
        private TextView f5305d;

        /* renamed from: e */
        private ImageView f5306e;

        /* renamed from: f */
        private View f5307f;

        /* renamed from: a */
        public final C1067a mo6375a() {
            return this.f5304c;
        }

        /* renamed from: b */
        private void m6709b() {
            C1067a aVar = this.f5304c;
            View d = aVar.mo4188d();
            CharSequence charSequence = null;
            if (d != null) {
                ViewParent parent = d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(d);
                    }
                    addView(d);
                }
                this.f5307f = d;
                if (this.f5305d != null) {
                    this.f5305d.setVisibility(8);
                }
                if (this.f5306e != null) {
                    this.f5306e.setVisibility(8);
                    this.f5306e.setImageDrawable(null);
                }
                return;
            }
            if (this.f5307f != null) {
                removeView(this.f5307f);
                this.f5307f = null;
            }
            Drawable b = aVar.mo4186b();
            CharSequence c = aVar.mo4187c();
            if (b != null) {
                if (this.f5306e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f5306e = appCompatImageView;
                }
                this.f5306e.setImageDrawable(b);
                this.f5306e.setVisibility(0);
            } else if (this.f5306e != null) {
                this.f5306e.setVisibility(8);
                this.f5306e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(c);
            if (z) {
                if (this.f5305d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.k);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f5305d = appCompatTextView;
                }
                this.f5305d.setText(c);
                this.f5305d.setVisibility(0);
            } else if (this.f5305d != null) {
                this.f5305d.setVisibility(8);
                this.f5305d.setText(null);
            }
            if (this.f5306e != null) {
                this.f5306e.setContentDescription(aVar.mo4190f());
            }
            if (!z) {
                charSequence = aVar.mo4190f();
            }
            C1366aw.m6763a(this, charSequence);
        }

        /* renamed from: a */
        public final void mo6376a(C1067a aVar) {
            this.f5304c = aVar;
            m6709b();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C1067a.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C1067a.class.getName());
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C1355ap.this.f5293c > 0 && getMeasuredWidth() > C1355ap.this.f5293c) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(C1355ap.this.f5293c, 1073741824), i2);
            }
        }

        public C1358b(Context context, C1067a aVar, boolean z) {
            super(context, null, R.attr.j);
            this.f5304c = aVar;
            C1365av a = C1365av.m6744a(context, null, this.f5303b, R.attr.j, 0);
            if (a.mo6406g(0)) {
                setBackgroundDrawable(a.mo6392a(0));
            }
            a.mo6393a();
            if (z) {
                setGravity(8388627);
            }
            m6709b();
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* renamed from: a */
    private boolean m6703a() {
        if (this.f5295e == null || this.f5295e.getParent() != this) {
            return false;
        }
        return true;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5291a != null) {
            post(this.f5291a);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5291a != null) {
            removeCallbacks(this.f5291a);
        }
    }

    /* renamed from: d */
    private Spinner m6706d() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.o);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: c */
    private boolean m6705c() {
        if (!m6703a()) {
            return false;
        }
        removeView(this.f5295e);
        addView(this.f5292b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f5295e.getSelectedItemPosition());
        return false;
    }

    /* renamed from: b */
    private void m6704b() {
        if (!m6703a()) {
            if (this.f5295e == null) {
                this.f5295e = m6706d();
            }
            removeView(this.f5292b);
            addView(this.f5295e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f5295e.getAdapter() == null) {
                this.f5295e.setAdapter(new C1357a());
            }
            if (this.f5291a != null) {
                removeCallbacks(this.f5291a);
                this.f5291a = null;
            }
            this.f5295e.setSelection(this.f5298h);
        }
    }

    public final void setAllowCollapse(boolean z) {
        this.f5296f = z;
    }

    public final void setContentHeight(int i) {
        this.f5297g = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1152a a = C1152a.m5114a(getContext());
        setContentHeight(a.mo4574e());
        this.f5294d = a.mo4576g();
    }

    /* renamed from: a */
    public final void mo6360a(int i) {
        final View childAt = this.f5292b.getChildAt(i);
        if (this.f5291a != null) {
            removeCallbacks(this.f5291a);
        }
        this.f5291a = new Runnable() {
            public final void run() {
                C1355ap.this.smoothScrollTo(childAt.getLeft() - ((C1355ap.this.getWidth() - childAt.getWidth()) / 2), 0);
                C1355ap.this.f5291a = null;
            }
        };
        post(this.f5291a);
    }

    public final void setTabSelected(int i) {
        boolean z;
        this.f5298h = i;
        int childCount = this.f5292b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f5292b.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                mo6360a(i);
            }
        }
        if (this.f5295e != null && i >= 0) {
            this.f5295e.setSelection(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1358b mo6359a(C1067a aVar, boolean z) {
        C1358b bVar = new C1358b(getContext(), aVar, true);
        bVar.setBackgroundDrawable(null);
        bVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f5297g));
        return bVar;
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = MeasureSpec.getMode(i);
        boolean z2 = true;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f5292b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f5293c = -1;
        } else {
            if (childCount > 2) {
                this.f5293c = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f5293c = MeasureSpec.getSize(i) / 2;
            }
            this.f5293c = Math.min(this.f5293c, this.f5294d);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f5297g, 1073741824);
        if (z || !this.f5296f) {
            z2 = false;
        }
        if (z2) {
            this.f5292b.measure(0, makeMeasureSpec);
            if (this.f5292b.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m6704b();
            } else {
                m6705c();
            }
        } else {
            m6705c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f5298h);
        }
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C1358b) view).mo6375a().mo4189e();
    }
}
