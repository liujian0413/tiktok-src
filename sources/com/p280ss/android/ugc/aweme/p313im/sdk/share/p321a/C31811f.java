package com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a;

import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.f */
final /* synthetic */ class C31811f implements C6943d {

    /* renamed from: a */
    private final List f83222a;

    /* renamed from: b */
    private final String f83223b;

    /* renamed from: c */
    private final SharePackage f83224c;

    /* renamed from: d */
    private final BaseContent f83225d;

    /* renamed from: e */
    private final C6892b f83226e;

    C31811f(List list, String str, SharePackage sharePackage, BaseContent baseContent, C6892b bVar) {
        this.f83222a = list;
        this.f83223b = str;
        this.f83224c = sharePackage;
        this.f83225d = baseContent;
        this.f83226e = bVar;
    }

    public final void sendMsg() {
        C7052b.m21959a(this.f83222a, this.f83223b, this.f83224c, this.f83225d, this.f83226e);
    }
}
