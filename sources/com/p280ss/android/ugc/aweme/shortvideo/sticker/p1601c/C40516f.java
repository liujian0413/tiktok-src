package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c;

import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27414b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.filter.C29264bt;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.f */
public final class C40516f extends C27416b<C40506c, Void> {

    /* renamed from: f */
    private int f105288f;

    /* renamed from: a */
    public final boolean mo70525a() {
        return C40517g.m129538c((C40506c) this.f72333e);
    }

    /* renamed from: b */
    public final void mo70527b(C27414b<C40506c, Void> bVar) {
        C7573i.m23587b(bVar, "callback");
        String str = (String) ((C40506c) this.f72333e).f105267d.f109647b.get(this.f105288f);
        C40518h hVar = new C40518h(this, bVar);
        String b = C40517g.m129532b((C40506c) this.f72333e);
        C7573i.m23582a((Object) str, "downloadUrl");
        C29264bt.m96002a(str, b, hVar);
    }

    public C40516f(String str, C40506c cVar) {
        C7573i.m23587b(str, "mTaskId");
        C7573i.m23587b(cVar, "mParam");
        super(str, cVar);
    }
}
