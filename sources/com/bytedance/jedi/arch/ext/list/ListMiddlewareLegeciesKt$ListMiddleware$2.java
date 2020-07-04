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

public final class ListMiddlewareLegeciesKt$ListMiddleware$2 extends Lambda implements C7562b<S, C7492s<Pair<? extends List<? extends T>, ? extends P>>> {
    final /* synthetic */ C7562b $actualRefresh;
    final /* synthetic */ C7562b $listMapper;
    final /* synthetic */ C7563m $payloadMapper;

    public ListMiddlewareLegeciesKt$ListMiddleware$2(C7562b bVar, C7562b bVar2, C7563m mVar) {
        this.$actualRefresh = bVar;
        this.$listMapper = bVar2;
        this.$payloadMapper = mVar;
        super(1);
    }

    public final C7492s<Pair<List<T>, P>> invoke(final S s) {
        C7573i.m23587b(s, "state");
        C7492s<Pair<List<T>, P>> d = ((C7319aa) this.$actualRefresh.invoke(s)).mo19136b().mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

            /* renamed from: a */
            final /* synthetic */ ListMiddlewareLegeciesKt$ListMiddleware$2 f31193a;

            {
                this.f31193a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Pair<List<T>, P> apply(RESP resp) {
                return C7579l.m23633a(this.f31193a.$listMapper.invoke(resp), this.f31193a.$payloadMapper.invoke(s, resp));
            }
        });
        C7573i.m23582a((Object) d, "actualRefresh(state).toO…yloadMapper(state, it)) }");
        return d;
    }
}
