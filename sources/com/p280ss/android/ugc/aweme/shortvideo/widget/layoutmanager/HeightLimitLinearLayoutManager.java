package com.p280ss.android.ugc.aweme.shortvideo.widget.layoutmanager;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.layoutmanager.HeightLimitLinearLayoutManager */
public final class HeightLimitLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public int f108558a;

    /* renamed from: b */
    public C7561a<C7581n> f108559b;

    /* renamed from: a */
    public final void mo5373a(C1290s sVar) {
        super.mo5373a(sVar);
        C7561a<C7581n> aVar = this.f108559b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public HeightLimitLinearLayoutManager(Context context, int i, boolean z) {
        super(context, 1, false);
    }

    /* renamed from: a */
    public final void mo5369a(Rect rect, int i, int i2) {
        if (this.f108558a > 0) {
            i2 = MeasureSpec.makeMeasureSpec(this.f108558a, Integer.MIN_VALUE);
        }
        super.mo5369a(rect, i, i2);
    }

    public HeightLimitLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
