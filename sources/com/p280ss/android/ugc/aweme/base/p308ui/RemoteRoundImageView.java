package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;

/* renamed from: com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView */
public class RemoteRoundImageView extends AnimatedImageView {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16940a() {
        super.mo16940a();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.mo32879a(C9738o.m28708b(getContext(), 2.0f));
        ((C13438a) getHierarchy()).mo32897a(roundingParams);
        ((C13438a) getHierarchy()).mo32896a(C13423b.f35599g);
    }

    public RemoteRoundImageView(Context context) {
        super(context);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RemoteRoundImageView(Context context, C13438a aVar) {
        super(context, aVar);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
