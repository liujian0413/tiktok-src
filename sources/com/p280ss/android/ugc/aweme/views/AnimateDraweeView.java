package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.p698c.C13386a;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39826a;

/* renamed from: com.ss.android.ugc.aweme.views.AnimateDraweeView */
public class AnimateDraweeView extends RemoteImageView {
    public AnimateDraweeView(Context context) {
        super(context);
    }

    public void setController(C13386a aVar) {
        super.setController(aVar);
    }

    /* renamed from: a */
    public final void mo105125a(boolean z) {
        C13386a aVar;
        try {
            aVar = getController();
        } catch (NullPointerException unused) {
            aVar = null;
        }
        if (aVar != null) {
            Animatable j = aVar.mo32721j();
            if (j != null) {
                if (z) {
                    j.start();
                } else {
                    j.stop();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        if (i == 0) {
            if (getVisibility() == 0) {
                i = 0;
            } else {
                i = 8;
            }
        }
        if (i == 0) {
            z = true;
        }
        mo105125a(z);
    }

    /* renamed from: a */
    public final void mo105124a(String str, Config config) {
        C39826a.m127518a((RemoteImageView) this, str, config);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        mo105125a(z);
    }

    public AnimateDraweeView(Context context, C13438a aVar) {
        super(context, aVar);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
