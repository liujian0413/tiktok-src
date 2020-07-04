package com.bytedance.jedi.arch.ext.list;

import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

public final class ListMiddlewareLegeciesKt$ListMiddleware$$inlined$let$lambda$1 extends Lambda implements C7562b<S, C7492s<Pair<? extends List<? extends T>, ? extends P>>> {
    final /* synthetic */ C7562b $listMapper$inlined;
    final /* synthetic */ C7562b $loadMore;
    final /* synthetic */ C7563m $payloadMapper$inlined;

    public ListMiddlewareLegeciesKt$ListMiddleware$$inlined$let$lambda$1(C7562b bVar, C7562b bVar2, C7563m mVar) {
        this.$loadMore = bVar;
        this.$listMapper$inlined = bVar2;
        this.$payloadMapper$inlined = mVar;
        super(1);
    }

    public final C7492s<Pair<List<T>, P>> invoke(final S s) {
        C7573i.m23587b(s, "state");
        return ((C7319aa) this.$loadMore.invoke(s)).mo19136b().mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

            /* renamed from: a */
            final /* synthetic */ ListMiddlewareLegeciesKt$ListMiddleware$$inlined$let$lambda$1 f31181a;

            {
                this.f31181a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Pair<List<T>, P> apply(RESP resp) {
                return C7579l.m23633a(this.f31181a.$listMapper$inlined.invoke(resp), this.f31181a.$payloadMapper$inlined.invoke(s, resp));
            }
        });
    }
}
