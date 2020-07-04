package com.p280ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel$$special$$inlined$NonPayloadSingleListMiddleware$2 */
public final class C27857xebca41fc extends Lambda implements C7562b<ProfileCollectionState, C7492s<Pair<? extends List<? extends C27707j>, ? extends C11583n>>> {
    final /* synthetic */ C7562b $loadMoreBlock;

    public C27857xebca41fc(C7562b bVar) {
        this.$loadMoreBlock = bVar;
        super(1);
    }

    public final C7492s<Pair<List<C27707j>, C11583n>> invoke(ProfileCollectionState profileCollectionState) {
        C7573i.m23587b(profileCollectionState, "state");
        C7492s<Pair<List<C27707j>, C11583n>> d = ((C7319aa) this.$loadMoreBlock.invoke(profileCollectionState)).mo19136b().mo19317d((C7327h<? super T, ? extends R>) C278581.f73431a);
        C7573i.m23582a((Object) d, "loadMoreBlock(state).toO…able().map { it to null }");
        return d;
    }
}
