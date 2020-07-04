package com.google.android.gms.tagmanager;

import java.util.List;

/* renamed from: com.google.android.gms.tagmanager.h */
final class C17033h implements C17034i {

    /* renamed from: a */
    private final /* synthetic */ C17024c f47708a;

    C17033h(C17024c cVar) {
        this.f47708a = cVar;
    }

    /* renamed from: a */
    public final void mo44262a(List<C17025a> list) {
        for (C17025a aVar : list) {
            this.f47708a.m56519b(C17024c.m56513a(aVar.f47685a, aVar.f47686b));
        }
        this.f47708a.f47684i.countDown();
    }
}
