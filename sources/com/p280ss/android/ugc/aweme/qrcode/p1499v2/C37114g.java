package com.p280ss.android.ugc.aweme.qrcode.p1499v2;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import bolts.C1591g;
import bolts.C1592h;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.p280ss.android.ugc.aweme.qrcode.model.C37080b;
import com.p280ss.android.ugc.aweme.qrcode.model.C37090h;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.g */
public final class C37114g extends QRCodeCardViewV2 {
    /* renamed from: a */
    public final C37080b mo93581a() {
        return new C37090h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ BitmapDrawable mo93583b() throws Exception {
        try {
            if (this.f97136a.mo93475a()) {
                return new BitmapDrawable(getResources(), this.f97136a.mo93476d().getAbsolutePath());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public C37114g(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo93458a(Exception exc) {
        if (!this.f97140e) {
            super.mo93458a(exc);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo93582a(C1592h hVar) throws Exception {
        if (hVar.mo6890e() != null) {
            ((C13438a) this.f97137b.getHierarchy()).mo32890a(0);
            ((C13438a) this.f97137b.getHierarchy()).mo32895a((Drawable) hVar.mo6890e(), C13423b.f35599g);
            this.f97141f = true;
        }
        return null;
    }

    public final void setData(QRCodeParams qRCodeParams) {
        super.setData(qRCodeParams);
        if (this.f97136a.mo93475a()) {
            this.f97140e = true;
            Uri fromFile = Uri.fromFile(this.f97136a.mo93476d());
            C13380c.m39172c().mo33181b(fromFile);
            this.f97137b.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32713b(fromFile).mo32729b(this.f97137b.getController())).mo32743a((C13401d<? super INFO>) this.f97142g)).mo32730f());
            if (this.f97138c != null) {
                this.f97138c.mo93547c();
            }
            C1592h.m7853a((Callable<TResult>) new C37115h<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C37116i<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }
}
