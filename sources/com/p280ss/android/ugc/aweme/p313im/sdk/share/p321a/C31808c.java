package com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a;

import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.c */
final /* synthetic */ class C31808c implements C6943d {

    /* renamed from: a */
    private final IMContact f83213a;

    /* renamed from: b */
    private final SharePackage f83214b;

    /* renamed from: c */
    private final C6892b f83215c;

    C31808c(IMContact iMContact, SharePackage sharePackage, C6892b bVar) {
        this.f83213a = iMContact;
        this.f83214b = sharePackage;
        this.f83215c = bVar;
    }

    public final void sendMsg() {
        C7052b.m21953a(this.f83213a, this.f83214b, this.f83215c);
    }
}
