package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20977y.C20978a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.x */
public final class C20893x extends C20978a {

    /* renamed from: a */
    private final WeakReference<IStickerRequestCallback> f56322a;

    public C20893x(IStickerRequestCallback iStickerRequestCallback) {
        C7573i.m23587b(iStickerRequestCallback, "listener");
        this.f56322a = new WeakReference<>(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo56404a(long j, boolean z) {
        IStickerRequestCallback iStickerRequestCallback = (IStickerRequestCallback) this.f56322a.get();
        if (iStickerRequestCallback != null) {
            iStickerRequestCallback.onStickerRequested(j, z);
        }
    }
}
