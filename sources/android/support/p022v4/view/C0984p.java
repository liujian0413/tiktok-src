package android.support.p022v4.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.ViewPager.C0931a;
import android.support.p022v4.view.ViewPager.C0934d;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.lang.ref.WeakReference;
import java.util.Locale;

@C0931a
/* renamed from: android.support.v4.view.p */
public class C0984p extends ViewGroup {

    /* renamed from: n */
    private static final int[] f3404n = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: o */
    private static final int[] f3405o = {16843660};

    /* renamed from: a */
    ViewPager f3406a;

    /* renamed from: b */
    TextView f3407b;

    /* renamed from: c */
    TextView f3408c;

    /* renamed from: d */
    TextView f3409d;

    /* renamed from: e */
    float f3410e;

    /* renamed from: f */
    int f3411f;

    /* renamed from: g */
    private int f3412g;

    /* renamed from: h */
    private int f3413h;

    /* renamed from: i */
    private int f3414i;

    /* renamed from: j */
    private boolean f3415j;

    /* renamed from: k */
    private boolean f3416k;

    /* renamed from: l */
    private final C0985a f3417l;

    /* renamed from: m */
    private WeakReference<PagerAdapter> f3418m;

    /* renamed from: p */
    private int f3419p;

    /* renamed from: android.support.v4.view.p$a */
    class C0985a extends DataSetObserver implements C0934d, C0935e {

        /* renamed from: a */
        final /* synthetic */ C0984p f3420a;

        /* renamed from: b */
        private int f3421b;

        public final void onChanged() {
            this.f3420a.mo3778a(this.f3420a.f3406a.getCurrentItem(), this.f3420a.f3406a.getAdapter());
            float f = 0.0f;
            if (this.f3420a.f3410e >= 0.0f) {
                f = this.f3420a.f3410e;
            }
            this.f3420a.mo3531a(this.f3420a.f3406a.getCurrentItem(), f, true);
        }

        public final void onPageScrollStateChanged(int i) {
            this.f3421b = i;
        }

        public final void onPageSelected(int i) {
            if (this.f3421b == 0) {
                this.f3420a.mo3778a(this.f3420a.f3406a.getCurrentItem(), this.f3420a.f3406a.getAdapter());
                float f = 0.0f;
                if (this.f3420a.f3410e >= 0.0f) {
                    f = this.f3420a.f3410e;
                }
                this.f3420a.mo3531a(this.f3420a.f3406a.getCurrentItem(), f, true);
            }
        }

        /* renamed from: a */
        public final void mo1668a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            this.f3420a.mo3779a(pagerAdapter, pagerAdapter2);
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            this.f3420a.mo3531a(i, f, false);
        }
    }

    /* renamed from: android.support.v4.view.p$b */
    static class C0986b extends SingleLineTransformationMethod {

        /* renamed from: a */
        private Locale f3422a;

        C0986b(Context context) {
            this.f3422a = context.getResources().getConfiguration().locale;
        }

        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f3422a);
            }
            return null;
        }
    }

    public int getTextSpacing() {
        return this.f3413h;
    }

    public void requestLayout() {
        if (!this.f3415j) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3406a != null) {
            mo3779a(this.f3406a.getAdapter(), (PagerAdapter) null);
            this.f3406a.setInternalPageChangeListener(null);
            this.f3406a.removeOnAdapterChangeListener(this.f3417l);
            this.f3406a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        PagerAdapter pagerAdapter;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.f3417l);
            viewPager.addOnAdapterChangeListener(this.f3417l);
            this.f3406a = viewPager;
            if (this.f3418m != null) {
                pagerAdapter = (PagerAdapter) this.f3418m.get();
            } else {
                pagerAdapter = null;
            }
            mo3779a(pagerAdapter, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public void setGravity(int i) {
        this.f3414i = i;
        requestLayout();
    }

    public void setTextSpacing(int i) {
        this.f3413h = i;
        requestLayout();
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C0986b(textView.getContext()));
    }

    public void setNonPrimaryAlpha(float f) {
        this.f3419p = ((int) (f * 255.0f)) & NormalGiftView.ALPHA_255;
        int i = (this.f3419p << 24) | (this.f3411f & 16777215);
        this.f3407b.setTextColor(i);
        this.f3409d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f3411f = i;
        this.f3408c.setTextColor(i);
        int i2 = (this.f3419p << 24) | (this.f3411f & 16777215);
        this.f3407b.setTextColor(i2);
        this.f3409d.setTextColor(i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3779a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.f3417l);
            this.f3418m = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.f3417l);
            this.f3418m = new WeakReference<>(pagerAdapter2);
        }
        if (this.f3406a != null) {
            this.f3412g = -1;
            this.f3410e = -1.0f;
            mo3778a(this.f3406a.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int size = MeasureSpec.getSize(i);
            int childMeasureSpec2 = getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f3407b.measure(childMeasureSpec2, childMeasureSpec);
            this.f3408c.measure(childMeasureSpec2, childMeasureSpec);
            this.f3409d.measure(childMeasureSpec2, childMeasureSpec);
            if (MeasureSpec.getMode(i2) == 1073741824) {
                i3 = MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f3408c.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f3408c.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3778a(int i, PagerAdapter pagerAdapter) {
        int i2;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (pagerAdapter != null) {
            i2 = pagerAdapter.getCount();
        } else {
            i2 = 0;
        }
        this.f3415j = true;
        CharSequence charSequence3 = null;
        if (i <= 0 || pagerAdapter == null) {
            charSequence = null;
        } else {
            charSequence = pagerAdapter.getPageTitle(i - 1);
        }
        this.f3407b.setText(charSequence);
        TextView textView = this.f3408c;
        if (pagerAdapter == null || i >= i2) {
            charSequence2 = null;
        } else {
            charSequence2 = pagerAdapter.getPageTitle(i);
        }
        textView.setText(charSequence2);
        int i3 = i + 1;
        if (i3 < i2 && pagerAdapter != null) {
            charSequence3 = pagerAdapter.getPageTitle(i3);
        }
        this.f3409d.setText(charSequence3);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f3407b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3408c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3409d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3412g = i;
        if (!this.f3416k) {
            mo3531a(i, this.f3410e, false);
        }
        this.f3415j = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3531a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = i;
        float f2 = f;
        if (i5 != this.f3412g) {
            mo3778a(i5, this.f3406a.getAdapter());
        } else if (!z && f2 == this.f3410e) {
            return;
        }
        this.f3416k = true;
        int measuredWidth = this.f3407b.getMeasuredWidth();
        int measuredWidth2 = this.f3408c.getMeasuredWidth();
        int measuredWidth3 = this.f3409d.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (((float) i8) * f3))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f3407b.getBaseline();
        int baseline2 = this.f3408c.getBaseline();
        int baseline3 = this.f3409d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int i14 = measuredWidth3;
        int measuredHeight = this.f3409d.getMeasuredHeight() + i13;
        int max2 = Math.max(Math.max(this.f3407b.getMeasuredHeight() + i11, this.f3408c.getMeasuredHeight() + i12), measuredHeight);
        int i15 = this.f3414i & 112;
        if (i15 == 16) {
            int i16 = (((height - paddingTop) - paddingBottom) - max2) / 2;
            i4 = i11 + i16;
            i2 = i12 + i16;
            i3 = i16 + i13;
        } else if (i15 != 80) {
            i4 = i11 + paddingTop;
            i2 = i12 + paddingTop;
            i3 = paddingTop + i13;
        } else {
            int i17 = (height - paddingBottom) - max2;
            i4 = i11 + i17;
            i2 = i12 + i17;
            i3 = i17 + i13;
        }
        this.f3408c.layout(i9, i2, i10, this.f3408c.getMeasuredHeight() + i2);
        int min = Math.min(paddingLeft, (i9 - this.f3413h) - measuredWidth);
        this.f3407b.layout(min, i4, measuredWidth + min, this.f3407b.getMeasuredHeight() + i4);
        int max3 = Math.max((width - paddingRight) - i14, i10 + this.f3413h);
        this.f3409d.layout(max3, i3, max3 + i14, this.f3409d.getMeasuredHeight() + i3);
        this.f3410e = f;
        this.f3416k = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f3406a != null) {
            float f = 0.0f;
            if (this.f3410e >= 0.0f) {
                f = this.f3410e;
            }
            mo3531a(this.f3412g, f, true);
        }
    }
}
