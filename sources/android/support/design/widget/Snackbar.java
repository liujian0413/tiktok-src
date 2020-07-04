package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.p021g.C0277a;
import android.support.design.widget.BaseTransientBottomBar.C0334d;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: j */
    private static final int[] f1487j = {R.attr.a2d};

    /* renamed from: h */
    private final AccessibilityManager f1488h;

    /* renamed from: i */
    private boolean f1489i;

    public static final class SnackbarLayout extends C0334d {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo1281b() {
        super.mo1281b();
    }

    public final void dismiss() {
        super.dismiss();
    }

    /* renamed from: c */
    public final boolean mo1284c() {
        return super.mo1284c();
    }

    /* renamed from: a */
    public final int mo1279a() {
        if (!this.f1489i || !this.f1488h.isTouchExplorationEnabled()) {
            return super.mo1279a();
        }
        return -2;
    }

    /* renamed from: a */
    private Snackbar m1578a(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f1297d.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: a */
    private static ViewGroup m1579a(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    private static boolean m1580a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1487j);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    private Snackbar(ViewGroup viewGroup, View view, C0277a aVar) {
        super(viewGroup, view, aVar);
        this.f1488h = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: a */
    public static Snackbar m1577a(View view, CharSequence charSequence, int i) {
        int i2;
        ViewGroup a = m1579a(view);
        if (a != null) {
            LayoutInflater from = LayoutInflater.from(a.getContext());
            if (m1580a(a.getContext())) {
                i2 = R.layout.ae0;
            } else {
                i2 = R.layout.jc;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, a, false);
            Snackbar snackbar = new Snackbar(a, snackbarContentLayout, snackbarContentLayout);
            snackbar.m1578a(charSequence);
            snackbar.mo1280a(-2);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }
}
