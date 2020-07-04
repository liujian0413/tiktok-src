package com.p280ss.android.ugc.aweme.qrcode.p1499v2;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.p280ss.android.ugc.aweme.qrcode.model.C37080b;
import com.p280ss.android.ugc.aweme.qrcode.model.C37090h;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.j */
public final class C37117j extends QRCodeCardViewV2ForSaveImage {
    /* renamed from: a */
    public final C37080b mo93581a() {
        return new C37090h();
    }

    public C37117j(Context context) {
        super(context);
    }

    public final void setParams(QRCodeParams qRCodeParams) {
        super.setParams(qRCodeParams);
        if (this.f97136a.mo93475a()) {
            this.f97137b.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32713b(Uri.fromFile(this.f97136a.mo93476d())).mo32729b(this.f97137b.getController())).mo32743a((C13401d<? super INFO>) this.f97142g)).mo32730f());
        }
    }
}
