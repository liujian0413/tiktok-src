package com.p280ss.android.ugc.aweme.photo;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.p280ss.android.medialib.image.ImageRenderView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;

/* renamed from: com.ss.android.ugc.aweme.photo.PhotoView */
public class PhotoView extends ImageRenderView implements C0042h {

    /* renamed from: l */
    private PhotoContext f90534l;

    /* renamed from: m */
    private int f90535m;

    /* renamed from: n */
    private int f90536n;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_PAUSE)
    public void pause() {
        mo52431b();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void resume() {
        mo52432c();
    }

    /* renamed from: d */
    private void m112055d() {
        if (this.f90534l != null) {
            C23323e.m76501a(C34731e.m112065a(this.f90534l.getPhotoUri()), this.f90535m, this.f90536n, (C23319b<Bitmap>) new C23319b<Bitmap>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Bitmap bitmap) {
                    if (bitmap != null) {
                        PhotoView.this.setImage(bitmap);
                    }
                }
            });
        }
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo88158a(PhotoContext photoContext) {
        this.f90534l = photoContext;
        if (C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust)) {
            mo52489a(C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90534l.mFilterIndex).mo74978b(), this.f90534l.mFilterRate);
        } else {
            mo52493b(C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90534l.mFilterIndex).mo74978b(), this.f90534l.mFilterRate);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo88157a(C0043i iVar, PhotoContext photoContext) {
        iVar.getLifecycle().mo55a(this);
        this.f90534l = photoContext;
        m112055d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f90535m = getWidth();
        this.f90536n = getHeight();
    }
}
