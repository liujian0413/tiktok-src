package com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b.C7053a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.d */
final /* synthetic */ class C31809d implements C7053a {

    /* renamed from: a */
    private final Context f83216a;

    /* renamed from: b */
    private final List f83217b;

    /* renamed from: c */
    private final SharePackage f83218c;

    /* renamed from: d */
    private final BaseContent f83219d;

    /* renamed from: e */
    private final C6892b f83220e;

    C31809d(Context context, List list, SharePackage sharePackage, BaseContent baseContent, C6892b bVar) {
        this.f83216a = context;
        this.f83217b = list;
        this.f83218c = sharePackage;
        this.f83219d = baseContent;
        this.f83220e = bVar;
    }

    public final void onShare(String str) {
        C7052b.m21951a(this.f83216a, this.f83217b, this.f83218c, this.f83219d, this.f83220e, str);
    }
}
