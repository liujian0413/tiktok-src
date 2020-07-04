package com.p280ss.android.ugc.aweme.bizactivity;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23474c.C23475a;
import com.p280ss.android.ugc.aweme.base.utils.C23480h;

/* renamed from: com.ss.android.ugc.aweme.bizactivity.AnimateDraweeView */
public class AnimateDraweeView extends RemoteImageView {

    /* renamed from: a */
    private UrlModel f62139a;

    /* renamed from: b */
    private C23475a f62140b;

    public AnimateDraweeView(Context context) {
        super(context);
    }

    public void setController(C13386a aVar) {
        super.setController(aVar);
    }

    /* renamed from: a */
    private void m77324a(int i) {
        C13386a aVar;
        try {
            aVar = getController();
        } catch (NullPointerException unused) {
            aVar = null;
        }
        if (aVar != null) {
            Animatable j = aVar.mo32721j();
            if (j != null) {
                if (i == 0) {
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
        if (i == 0) {
            if (getVisibility() == 0) {
                i = 0;
            } else {
                i = 8;
            }
        }
        m77324a(i);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m77324a(i);
    }

    public AnimateDraweeView(Context context, C13438a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final void mo61333a(UrlModel urlModel, boolean z, Config config) {
        m77325a(urlModel, true, config, null);
    }

    public AnimateDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m77325a(UrlModel urlModel, boolean z, Config config, C13400c<C13648f> cVar) {
        if (!C23480h.m77087a(this.f62139a, urlModel)) {
            this.f62139a = urlModel;
            if (this.f62140b == null) {
                this.f62140b = new C23475a();
            }
            this.f62140b.mo61090a(this, this.f62139a, z, config, null);
        }
    }
}
