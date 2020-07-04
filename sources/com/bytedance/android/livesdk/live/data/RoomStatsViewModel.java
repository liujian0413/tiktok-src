package com.bytedance.android.livesdk.live.data;

import android.arch.lifecycle.C0052o;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.model.C8398b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class RoomStatsViewModel extends RxViewModel {

    /* renamed from: a */
    public final C0052o<Map<String, C8398b>> f23006a = new C0052o<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21554a(Throwable th) throws Exception {
        this.f23006a.setValue(new HashMap());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21553a(C3478c cVar) throws Exception {
        if (!C6311g.m19573a(cVar.f10296b)) {
            HashMap hashMap = new HashMap();
            for (C8398b bVar : cVar.f10296b) {
                hashMap.put(String.valueOf(bVar.f23020a), bVar);
            }
            this.f23006a.setValue(hashMap);
        }
    }

    /* renamed from: a */
    public final void mo21555a(List<Room> list) {
        if (C6311g.m19573a(list)) {
            this.f23006a.setValue(new HashMap());
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Room room : list) {
            if (room != null) {
                linkedList.add(Long.valueOf(room.getId()));
            }
        }
        ((RoomStatApi) C3458e.m12798a().mo10440a(RoomStatApi.class)).checkRoom(TextUtils.join(",", linkedList)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C8394b<Object>(this), (C7326g<? super Throwable>) new C8395c<Object>(this));
    }
}
