package com.p280ss.android.ugc.aweme.longvideo.feature;

import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29972a;
import com.p280ss.android.ugc.aweme.longvideo.C32717b;
import com.p280ss.android.ugc.aweme.longvideo.C32733d;
import com.p280ss.android.ugc.aweme.video.C43316v;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.a */
public final class C32744a implements C32733d {

    /* renamed from: a */
    public final C28297e f85372a;

    /* renamed from: b */
    public final C32717b f85373b;

    /* renamed from: c */
    public final C43316v f85374c;

    /* renamed from: a */
    public final boolean mo84208a() {
        if (C6900g.m21454b().mo16942c()) {
            return true;
        }
        String str = "";
        if (this.f85372a != null) {
            str = this.f85372a.mo71843n();
            C7573i.m23582a((Object) str, "dialogController.eventType");
        }
        C29972a.m98273a().mo76167a(str);
        return true;
    }

    public C32744a(C28297e eVar, C32717b bVar, C43316v vVar) {
        C7573i.m23587b(bVar, "longVideoPlayView");
        C7573i.m23587b(vVar, "mPlayManger");
        this.f85372a = eVar;
        this.f85373b = bVar;
        this.f85374c = vVar;
    }
}
