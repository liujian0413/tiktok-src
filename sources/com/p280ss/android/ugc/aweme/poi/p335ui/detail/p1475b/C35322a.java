package com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1475b;

import android.os.Handler;
import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.poi.model.C35106c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.a */
public final class C35322a implements C1591g<C35106c, Void> {

    /* renamed from: a */
    private final Handler f92595a;

    /* renamed from: b */
    private final int f92596b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void then(C1592h<C35106c> hVar) {
        if (this.f92595a == null || hVar == null) {
            return null;
        }
        Message obtainMessage = this.f92595a.obtainMessage(this.f92596b);
        if (hVar.mo6887c()) {
            obtainMessage.obj = null;
        } else if (hVar.mo6889d()) {
            obtainMessage.obj = hVar.mo6891f();
        } else {
            obtainMessage.obj = hVar.mo6890e();
        }
        this.f92595a.sendMessage(obtainMessage);
        return null;
    }

    public C35322a(Handler handler, int i) {
        C7573i.m23587b(handler, "handler");
        this.f92595a = handler;
        this.f92596b = i;
    }
}
