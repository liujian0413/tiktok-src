package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;

/* renamed from: com.ss.android.ugc.aweme.base.ui.SmartRoundImageView */
public class SmartRoundImageView extends SmartImageView {
    /* renamed from: a */
    public final void mo29857a() {
        super.mo29857a();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.mo32879a(C9738o.m28708b(getContext(), 2.0f));
        ((C13438a) getHierarchy()).mo32897a(roundingParams);
        ((C13438a) getHierarchy()).mo32896a(C13423b.f35599g);
    }

    public SmartRoundImageView(Context context) {
        super(context);
    }

    public SmartRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmartRoundImageView(Context context, C13438a aVar) {
        super(context, aVar);
    }

    public SmartRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
