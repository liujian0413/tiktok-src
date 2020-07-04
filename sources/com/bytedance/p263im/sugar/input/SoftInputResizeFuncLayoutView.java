package com.bytedance.p263im.sugar.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.p263im.sugar.input.C11478b.C11479a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31896bf;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.im.sugar.input.SoftInputResizeFuncLayoutView */
public class SoftInputResizeFuncLayoutView extends FuncLayoutView implements C11478b {

    /* renamed from: d */
    protected C11479a f31054d;

    /* renamed from: e */
    private EditText f31055e;

    /* renamed from: f */
    private boolean f31056f;

    /* renamed from: g */
    private int f31057g;

    /* renamed from: h */
    private boolean f31058h;

    /* renamed from: g */
    private boolean m33867g() {
        return this.f31058h;
    }

    /* renamed from: e */
    public final void mo29011e() {
        mo29004a(-2);
    }

    public int getSoftKeyboardHeight() {
        return C11480c.m33872a(0);
    }

    private int getCurrentHeight() {
        if (this.f31056f) {
            return C11480c.m33872a(this.f31057g);
        }
        return this.f31057g;
    }

    public int getPanelHeight() {
        if (!mo29006a()) {
            return 0;
        }
        if (m33867g()) {
            return getSoftKeyboardHeight();
        }
        return getMeasuredHeight();
    }

    /* renamed from: f */
    private void m33866f() {
        this.f31056f = true;
        this.f31057g = getResources().getDimensionPixelSize(R.dimen.i3);
        ((Activity) getContext()).getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                SoftInputResizeFuncLayoutView.this.mo29010d();
            }
        });
    }

    /* renamed from: d */
    public final boolean mo29010d() {
        boolean z;
        Rect rect = new Rect();
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = activity.getWindow().getDecorView().getHeight();
        int a = C31896bf.m103623a(activity);
        int i = (height - rect.bottom) - a;
        if (i >= (((height - a) - C10994a.m32204a((Context) activity)) / 10) * 3) {
            z = true;
        } else {
            z = false;
        }
        if (this.f31058h != z) {
            this.f31058h = z;
            getLocationInWindow(new int[2]);
            m33865a(z, i);
        }
        return z;
    }

    public void setDefaultPanelHeight(int i) {
        this.f31057g = i;
    }

    public void setEditText(EditText editText) {
        this.f31055e = editText;
    }

    public void setOnKeyBordChangedListener(C11479a aVar) {
        this.f31054d = aVar;
    }

    public void setResizable(boolean z) {
        this.f31056f = z;
    }

    public SoftInputResizeFuncLayoutView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m33864a(boolean z) {
        LayoutParams layoutParams = getLayoutParams();
        int currentHeight = getCurrentHeight();
        if (layoutParams.height != currentHeight) {
            layoutParams.height = currentHeight;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo29004a(int i) {
        if (this.f31051a != i) {
            if (i == -1) {
                setVisibility(8);
                C11481d.m33874a((Activity) getContext(), (View) this.f31055e);
                this.f31051a = i;
                if (this.f31052b != null) {
                    this.f31052b.mo29021a(i, null);
                }
            } else if (i == -2) {
                this.f31055e.requestFocus();
                C11481d.m33875a((View) this.f31055e, 0);
                this.f31051a = i;
                if (this.f31052b != null) {
                    this.f31052b.mo29021a(i, null);
                }
            } else {
                View view = (View) this.f31053c.get(i);
                if (view != null) {
                    setVisibility(0);
                    int size = this.f31053c.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = this.f31053c.keyAt(i2);
                        if (keyAt != i) {
                            ((View) this.f31053c.get(keyAt)).setVisibility(8);
                        }
                    }
                    view.setVisibility(0);
                    this.f31051a = i;
                    if (this.f31052b != null) {
                        this.f31052b.mo29021a(i, view);
                    }
                    C11481d.m33874a((Activity) getContext(), (View) this.f31055e);
                }
            }
        }
    }

    public SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (mo29010d()) {
            i3 = 0;
        } else {
            i3 = getCurrentHeight();
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    /* renamed from: a */
    private void m33865a(boolean z, int i) {
        if (z) {
            C11480c.m33873b(i);
            m33864a(true);
            this.f31051a = -2;
            if (this.f31052b != null) {
                this.f31052b.mo29021a(this.f31051a, null);
            }
        } else if (this.f31051a == -2) {
            mo29004a(-1);
        }
    }

    public SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m33866f();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
