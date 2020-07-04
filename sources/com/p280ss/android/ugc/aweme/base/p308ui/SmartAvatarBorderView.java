package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView */
public class SmartAvatarBorderView extends SmartCircleImageView {

    /* renamed from: b */
    private UrlModel f61823b;

    /* renamed from: a */
    public final void mo29857a() {
        super.mo29857a();
        ((C13438a) getHierarchy()).mo32891a((int) R.drawable.a_j, C13423b.f35599g);
        if (((C13438a) getHierarchy()).f35619a != null) {
            ((C13438a) getHierarchy()).f35619a.mo32886c(C9738o.m28708b(getContext(), 1.0f));
            ((C13438a) getHierarchy()).f35619a.mo32885b(getResources().getColor(R.color.dy));
            ((C13438a) getHierarchy()).f35619a.mo32887d(C9738o.m28708b(getContext(), 1.0f));
        }
    }

    public SmartAvatarBorderView(Context context) {
        super(context);
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

    public SmartAvatarBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmartAvatarBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo61032a(UrlModel urlModel, int[] iArr, int i, int i2, String str, boolean z) {
        if (this.f61823b != urlModel) {
            this.f61823b = urlModel;
            C12139r a = C12133n.m35299a(C23400r.m76741a(urlModel));
            if (iArr != null) {
                a.mo29853b(iArr);
            }
            a.mo29836a(i, i2).mo29845a(str).mo29855c(true).mo29844a((C12128i) this).mo29848a();
        }
    }
}
