package com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1353b;

import android.app.Activity;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.service.g.b.a */
public final class C32021a extends C32022b {

    /* renamed from: a */
    public final ViewGroup f83731a;

    /* renamed from: b */
    public final ViewGroup f83732b;

    /* renamed from: c */
    public final ViewGroup f83733c;

    /* renamed from: d */
    public final boolean f83734d;

    public C32021a(Activity activity, SharePackage sharePackage, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, boolean z) {
        C7573i.m23587b(activity, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        C7573i.m23587b(viewGroup, "headerContainer");
        C7573i.m23587b(viewGroup2, "editContainer");
        C7573i.m23587b(viewGroup3, "sendContainer");
        super(activity, sharePackage, null, 4, null);
        this.f83731a = viewGroup;
        this.f83732b = viewGroup2;
        this.f83733c = viewGroup3;
        this.f83734d = z;
    }
}
