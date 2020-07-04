package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.C7056c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService$$Lambda$2 */
final /* synthetic */ class IMService$$Lambda$2 implements Runnable {
    private final Context arg$1;
    private final RemoteImageView arg$2;
    private final int arg$3;

    IMService$$Lambda$2(Context context, RemoteImageView remoteImageView, int i) {
        this.arg$1 = context;
        this.arg$2 = remoteImageView;
        this.arg$3 = i;
    }

    public final void run() {
        C7063bg.m22044a(this.arg$1, this.arg$2, this.arg$3, C7056c.m21977b());
    }
}
