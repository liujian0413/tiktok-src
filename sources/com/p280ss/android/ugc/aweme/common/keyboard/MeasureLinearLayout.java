package com.p280ss.android.ugc.aweme.common.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43045c;

/* renamed from: com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout */
public class MeasureLinearLayout extends LinearLayout {

    /* renamed from: a */
    private C25699a f67627a;

    /* renamed from: b */
    private int f67628b;

    /* renamed from: c */
    private int f67629c;

    public C25699a getKeyBoardObservable() {
        return this.f67627a;
    }

    /* renamed from: a */
    public final void mo66588a() {
        if (C43045c.m136574d()) {
            this.f67628b++;
        }
    }

    public MeasureLinearLayout(Context context) {
        this(context, null);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f67629c == this.f67628b) {
            this.f67627a.mo66591a(getContext(), i2);
        } else {
            this.f67629c = this.f67628b;
        }
        super.onMeasure(i, i2);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67627a = new C25699a();
    }
}
