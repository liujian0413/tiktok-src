package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b.C7053a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService$$Lambda$0 */
final /* synthetic */ class IMService$$Lambda$0 implements C7053a {
    private final Activity arg$1;
    private final SharePackage arg$2;
    private final IMUser arg$3;
    private final C6892b arg$4;

    IMService$$Lambda$0(Activity activity, SharePackage sharePackage, IMUser iMUser, C6892b bVar) {
        this.arg$1 = activity;
        this.arg$2 = sharePackage;
        this.arg$3 = iMUser;
        this.arg$4 = bVar;
    }

    public final void onShare(String str) {
        new C6928b(this.arg$1, new IMService$$Lambda$5(this.arg$2, this.arg$3, str, this.arg$4)).sendMsg();
    }
}
