package com.bytedance.android.livesdk.viewmodel;

import android.arch.paging.C0100h.C0106d.C0107a;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.core.paging.p151a.C3181c;
import com.bytedance.android.live.core.paging.p152b.C3199b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdk.chatroom.api.FansClubApi;
import com.bytedance.android.livesdk.chatroom.model.C4905g;
import com.bytedance.android.livesdk.chatroom.model.C4905g.C4906a;
import com.bytedance.android.livesdk.p428w.C9178j;
import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;

public class FansClubAutoLightViewModel extends PagingViewModel<C4906a> implements C3199b<C4906a> {

    /* renamed from: a */
    private int f24816a;

    /* renamed from: j */
    private FansClubApi f24817j = ((FansClubApi) C9178j.m27302j().mo22373b().mo10440a(FansClubApi.class));

    /* renamed from: d */
    public final void mo22300d() {
        mo10109a(new C3181c().mo10050a((C3199b<V>) this).mo10049a(new C0107a().mo228a(false).mo227a(20).mo230b(20).mo229a()).mo10051i());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo22299b(C3477b bVar) throws Exception {
        if (bVar != null && bVar.data != null) {
            List<C4906a> list = ((C4905g) bVar.data).f14025b;
            if (list != null) {
                this.f24816a += list.size();
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Pair m27168a(C3477b bVar) throws Exception {
        if (bVar == null || bVar.extra == null || bVar.data == null) {
            return Pair.create(new ArrayList(), new C2344a());
        }
        ((C2344a) bVar.extra).hasMore = ((C4905g) bVar.data).f14024a;
        return Pair.create(((C4905g) bVar.data).f14025b, bVar.extra);
    }

    /* renamed from: a */
    public final C7492s<Pair<List<C4906a>, C2344a>> mo10093a(boolean z, Long l, int i) {
        if (z) {
            this.f24816a = 0;
        }
        return this.f24817j.getAutoLightList(this.f24816a, 20).mo19316d((C7326g<? super T>) new C9138a<Object>(this)).mo19317d(C9139b.f24845a);
    }
}
