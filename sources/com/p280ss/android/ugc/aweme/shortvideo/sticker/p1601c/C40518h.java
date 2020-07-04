package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c;

import com.p280ss.android.ugc.aweme.common.p1141b.C25653a.C25655a;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27414b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27419e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.h */
public final class C40518h implements C25655a {

    /* renamed from: a */
    private final C27416b<C40506c, Void> f105290a;

    /* renamed from: b */
    private final C27414b<C40506c, Void> f105291b;

    /* renamed from: a */
    public final void mo66542a(String str, int i) {
    }

    /* renamed from: a */
    public final void mo66541a(String str) {
        this.f105290a.mo70523a(3);
        this.f105290a.f72331c = null;
        this.f105291b.mo70508b(this.f105290a);
    }

    public C40518h(C27416b<C40506c, Void> bVar, C27414b<C40506c, Void> bVar2) {
        C7573i.m23587b(bVar, "task");
        C7573i.m23587b(bVar2, "callback");
        this.f105290a = bVar;
        this.f105291b = bVar2;
    }

    /* renamed from: a */
    public final void mo66543a(String str, Exception exc) {
        String str2;
        this.f105290a.mo70523a(4);
        C27416b<C40506c, Void> bVar = this.f105290a;
        Integer valueOf = Integer.valueOf(-1);
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        bVar.f72332d = new C27419e(valueOf, str2, exc);
        this.f105291b.mo70512c(this.f105290a);
    }
}
