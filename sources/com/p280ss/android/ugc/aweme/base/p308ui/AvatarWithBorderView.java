package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.facebook.drawee.generic.C13438a;
import com.facebook.imagepipeline.common.C13596d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView */
public class AvatarWithBorderView extends AvatarImageView {

    /* renamed from: f */
    private C13596d f61662f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16940a() {
        super.mo16940a();
        if (((C13438a) getHierarchy()).f35619a != null) {
            ((C13438a) getHierarchy()).f35619a.mo32886c(C9738o.m28708b(getContext(), 1.0f));
            ((C13438a) getHierarchy()).f35619a.mo32885b(getResources().getColor(R.color.dy));
            ((C13438a) getHierarchy()).f35619a.mo32887d(C9738o.m28708b(getContext(), 1.0f));
        }
    }

    public AvatarWithBorderView(Context context) {
        super(context);
    }

    public void setResizeOptions(C13596d dVar) {
        this.f61662f = dVar;
    }

    public void setBorderColor(int i) {
        if (((C13438a) getHierarchy()).f35619a != null) {
            ((C13438a) getHierarchy()).f35619a.mo32885b(C0683b.m2912c(getContext(), i));
        }
    }

    public void setBorderWidth(int i) {
        if (((C13438a) getHierarchy()).f35619a != null) {
            ((C13438a) getHierarchy()).f35619a.mo32886c(C9738o.m28708b(getContext(), (float) i));
        }
    }

    public void setBorderWidthPx(int i) {
        if (((C13438a) getHierarchy()).f35619a != null) {
            ((C13438a) getHierarchy()).f35619a.mo32886c((float) i);
        }
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarWithBorderView(Context context, C13438a aVar) {
        super(context, aVar);
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
