package com.p280ss.android.ugc.aweme.p313im.sdk.share.panel;

import android.content.Context;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.C7056c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.C32015a;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.C32015a.C32016a;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1353b.C32022b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.c */
public class C31834c implements C32015a {

    /* renamed from: a */
    private final C32022b f83280a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.c$a */
    static final class C31835a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f83281a;

        /* renamed from: b */
        final /* synthetic */ RemoteImageView f83282b;

        /* renamed from: c */
        final /* synthetic */ int f83283c;

        C31835a(Context context, RemoteImageView remoteImageView, int i) {
            this.f83281a = context;
            this.f83282b = remoteImageView;
            this.f83283c = i;
        }

        public final void run() {
            C7063bg.m22044a(this.f83281a, this.f83282b, this.f83283c, C7056c.m21977b());
        }
    }

    /* renamed from: a */
    public void mo82652a() {
    }

    /* renamed from: a */
    public void mo82654a(boolean z) {
    }

    /* renamed from: b */
    public View mo82655b() {
        return null;
    }

    /* renamed from: c */
    public List<IMContact> mo82656c() {
        return null;
    }

    /* renamed from: d */
    public void mo82657d() {
    }

    /* renamed from: e */
    public final int mo82659e() {
        return C7056c.m21973a();
    }

    public C31834c(C32022b bVar) {
        C7573i.m23587b(bVar, "payload");
        this.f83280a = bVar;
    }

    /* renamed from: a */
    public void mo82653a(C38380c cVar) {
        C7573i.m23587b(cVar, "config");
        C32016a.m103990a(this, cVar);
    }

    /* renamed from: a */
    public final void mo82658a(RemoteImageView remoteImageView, boolean z) {
        int i;
        C7573i.m23587b(remoteImageView, "ivIcon");
        if (z) {
            i = 3;
        } else if (C7573i.m23585a((Object) this.f83280a.f83736f.f20181g, (Object) "aweme")) {
            i = 1;
        } else {
            i = 0;
        }
        m103311a(this.f83280a.f83735e, remoteImageView, i);
    }

    /* renamed from: a */
    private static void m103311a(Context context, RemoteImageView remoteImageView, int i) {
        C7056c.m21974a((Runnable) new C31835a(context, remoteImageView, i));
    }
}
