package com.p280ss.android.ugc.aweme.p313im.p1310a;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38371b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.a.c */
public final class C30552c {

    /* renamed from: a */
    public final Context f80255a;

    /* renamed from: b */
    public final Dialog f80256b;

    /* renamed from: c */
    public final ViewGroup f80257c;

    /* renamed from: d */
    public final ViewGroup f80258d;

    /* renamed from: e */
    public final View f80259e;

    /* renamed from: f */
    public SharePackage f80260f;

    /* renamed from: g */
    public C38371b f80261g;

    /* renamed from: a */
    public final void mo80300a(SharePackage sharePackage) {
        C7573i.m23587b(sharePackage, "<set-?>");
        this.f80260f = sharePackage;
    }

    public C30552c(Context context, Dialog dialog, ViewGroup viewGroup, ViewGroup viewGroup2, View view, SharePackage sharePackage, C38371b bVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(dialog, "dialog");
        C7573i.m23587b(viewGroup, "channelLayout");
        C7573i.m23587b(viewGroup2, "actionLayout");
        C7573i.m23587b(view, "cancelView");
        C7573i.m23587b(sharePackage, "sharePackage");
        this.f80255a = context;
        this.f80256b = dialog;
        this.f80257c = viewGroup;
        this.f80258d = viewGroup2;
        this.f80259e = view;
        this.f80260f = sharePackage;
        this.f80261g = bVar;
    }
}
