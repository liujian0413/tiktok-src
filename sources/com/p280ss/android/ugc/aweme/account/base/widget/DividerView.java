package com.p280ss.android.ugc.aweme.account.base.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.p280ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel;
import com.p280ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel.Orientation;
import com.p280ss.android.ugc.aweme.base.mvvm.C23357b;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.DividerView */
public class DividerView extends View implements C23357b<DividerViewModel> {
    private static Map<Class, Constructor<LayoutParams>> sConstructorMapCache = new HashMap();
    private Class layoutParamClazz;
    int mBackgroundColor;
    int mForegroundColor;
    private DividerViewModel mViewModel;

    /* renamed from: com.ss.android.ugc.aweme.account.base.widget.DividerView$1 */
    static /* synthetic */ class C211311 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56741a = new int[Orientation.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel$Orientation[] r0 = com.p280ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56741a = r0
                int[] r0 = f56741a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel$Orientation r1 = com.p280ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel.Orientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f56741a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel$Orientation r1 = com.p280ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel.Orientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.base.widget.DividerView.C211311.<clinit>():void");
        }
    }

    public DividerView create(Context context, ViewGroup viewGroup) {
        return this;
    }

    public View getAndroidView() {
        return this;
    }

    private void hide() {
        if (getVisibility() != 8) {
            setVisibility(8);
            requestLayout();
        }
    }

    public void refresh() {
        if (this.mViewModel != null) {
            bind(this.mViewModel);
        }
    }

    public DividerView(Context context) {
        super(context);
    }

    public DividerView setLayoutParamClazz(Class cls) {
        this.layoutParamClazz = cls;
        return this;
    }

    private void setColor(DividerViewModel dividerViewModel) {
        this.mForegroundColor = dividerViewModel.f56748e;
        this.mBackgroundColor = dividerViewModel.f56749f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mViewModel != null) {
            canvas.clipRect(0, 0, getWidth(), getHeight());
            canvas.drawColor(this.mBackgroundColor);
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.drawColor(this.mForegroundColor);
        }
    }

    public void bind(DividerViewModel dividerViewModel) {
        this.mViewModel = dividerViewModel;
        if (dividerViewModel == null) {
            hide();
            return;
        }
        setColor(dividerViewModel);
        int i = dividerViewModel.f56746c;
        if (i <= 0) {
            hide();
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        int[] iArr = dividerViewModel.f56747d;
        if (iArr != null) {
            setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        } else {
            setPadding(0, 0, 0, 0);
        }
        if (getLayoutParams() == null) {
            setLayoutParams(createLayoutParams(dividerViewModel.f56745a, i, dividerViewModel.f56750g));
            return;
        }
        LayoutParams layoutParams = getLayoutParams();
        if (C211311.f56741a[dividerViewModel.f56750g.ordinal()] != 2) {
            if (layoutParams.height != i) {
                layoutParams.height = i;
                requestLayout();
            }
        } else if (layoutParams.width != i) {
            layoutParams.width = i;
            requestLayout();
        }
    }

    public DividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DividerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class, code=java.lang.Class<android.view.ViewGroup$LayoutParams>, for r6v0, types: [java.lang.Class] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.ViewGroup.LayoutParams createLayoutParams(java.lang.Class<android.view.ViewGroup.LayoutParams> r6, int r7, com.p280ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel.Orientation r8) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0004
            java.lang.Class<android.view.ViewGroup$LayoutParams> r6 = android.view.ViewGroup.LayoutParams.class
        L_0x0004:
            java.util.Map<java.lang.Class, java.lang.reflect.Constructor<android.view.ViewGroup$LayoutParams>> r0 = sConstructorMapCache     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x0059 }
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch:{ Exception -> 0x0059 }
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 != 0) goto L_0x0024
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0059 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0059 }
            r0[r2] = r4     // Catch:{ Exception -> 0x0059 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0059 }
            r0[r1] = r4     // Catch:{ Exception -> 0x0059 }
            java.lang.reflect.Constructor r0 = r6.getConstructor(r0)     // Catch:{ Exception -> 0x0059 }
            java.util.Map<java.lang.Class, java.lang.reflect.Constructor<android.view.ViewGroup$LayoutParams>> r4 = sConstructorMapCache     // Catch:{ Exception -> 0x0059 }
            r4.put(r6, r0)     // Catch:{ Exception -> 0x0059 }
        L_0x0024:
            int[] r6 = com.p280ss.android.ugc.aweme.account.base.widget.DividerView.C211311.f56741a     // Catch:{ Exception -> 0x0059 }
            int r8 = r8.ordinal()     // Catch:{ Exception -> 0x0059 }
            r6 = r6[r8]     // Catch:{ Exception -> 0x0059 }
            r8 = -1
            if (r6 == r3) goto L_0x0044
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0059 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0059 }
            r6[r2] = r8     // Catch:{ Exception -> 0x0059 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0059 }
            r6[r1] = r7     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r6 = r0.newInstance(r6)     // Catch:{ Exception -> 0x0059 }
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6     // Catch:{ Exception -> 0x0059 }
            return r6
        L_0x0044:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0059 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0059 }
            r6[r2] = r7     // Catch:{ Exception -> 0x0059 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0059 }
            r6[r1] = r7     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r6 = r0.newInstance(r6)     // Catch:{ Exception -> 0x0059 }
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6     // Catch:{ Exception -> 0x0059 }
            return r6
        L_0x0059:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.base.widget.DividerView.createLayoutParams(java.lang.Class, int, com.ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel$Orientation):android.view.ViewGroup$LayoutParams");
    }
}
