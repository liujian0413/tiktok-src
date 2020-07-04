package com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1353b;

import android.content.Context;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.service.g.b.b */
public class C32022b {

    /* renamed from: e */
    public final Context f83735e;

    /* renamed from: f */
    public SharePackage f83736f;

    /* renamed from: g */
    public String f83737g;

    /* renamed from: a */
    public final void mo82989a(SharePackage sharePackage) {
        C7573i.m23587b(sharePackage, "<set-?>");
        this.f83736f = sharePackage;
    }

    private C32022b(Context context, SharePackage sharePackage, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        C7573i.m23587b(str, "leaveMsg");
        this.f83735e = context;
        this.f83736f = sharePackage;
        this.f83737g = str;
    }

    public /* synthetic */ C32022b(Context context, SharePackage sharePackage, String str, int i, C7571f fVar) {
        this(context, sharePackage, "");
    }
}
