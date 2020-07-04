package com.bytedance.p263im.sugar.input;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.p263im.sugar.input.C11476a.C11477a;

/* renamed from: com.bytedance.im.sugar.input.FuncLayoutView */
public class FuncLayoutView extends FrameLayout implements C11476a {

    /* renamed from: a */
    protected int f31051a;

    /* renamed from: b */
    protected C11477a f31052b;

    /* renamed from: c */
    protected final SparseArray<View> f31053c;

    /* renamed from: c */
    public final int mo29008c() {
        return this.f31051a;
    }

    /* renamed from: b */
    public final void mo29007b() {
        mo29004a(-1);
    }

    /* renamed from: a */
    public final boolean mo29006a() {
        if (this.f31051a != -1) {
            return true;
        }
        return false;
    }

    public void setOnPanelChangeListener(C11477a aVar) {
        this.f31052b = aVar;
    }

    public FuncLayoutView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo29004a(int i) {
        if (this.f31051a != i) {
            if (i == -1) {
                setVisibility(8);
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
                }
            }
        }
    }

    public FuncLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo29005a(int i, View view) {
        if (i < 0) {
            throw new IllegalArgumentException("panelType must be more than 0 ");
        } else if (this.f31053c.get(i) == null) {
            this.f31053c.put(i, view);
            addView(view, new LayoutParams(-1, -1));
            view.setVisibility(8);
        }
    }

    public FuncLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31051a = -1;
        this.f31053c = new SparseArray<>();
    }
}
