package com.bytedance.android.livesdk.module;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.linkpk.C3440a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.log.p405b.C8434f;
import com.bytedance.ies.sdk.widgets.KVData;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p354j.C7486b;

public class LinkPkService implements C3440a {
    private C0053p<KVData> pkStateObserver = new C0053p<KVData>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(KVData kVData) {
            if (kVData != null && kVData.getData() != null) {
                LinkPkService.this.pkStateSubject.onNext(kVData.getData());
            }
        }
    };
    public final C7486b<PkState> pkStateSubject = C7486b.m23223a();

    public PkState getCurrentPkState() {
        return (PkState) LinkCrossRoomDataHolder.m13782a().get("data_pk_state", PkState.DISABLED);
    }

    public C8434f getLinkCrossRoomLog() {
        return LinkCrossRoomDataHolder.m13782a().mo11449b();
    }

    public C7492s<PkState> observePkState() {
        return this.pkStateSubject.mo19294a(C47549a.m148327a());
    }

    public LinkPkService() {
        C3596c.m13174a(C3440a.class, this);
    }

    public void registerObserve() {
        if (LinkCrossRoomDataHolder.m13782a() != LinkCrossRoomDataHolder.f11658a) {
            LinkCrossRoomDataHolder.m13782a().observe("data_pk_state", this.pkStateObserver);
        }
    }

    public void removeObserve() {
        if (LinkCrossRoomDataHolder.m13782a() != LinkCrossRoomDataHolder.f11658a) {
            LinkCrossRoomDataHolder.m13782a().removeObserver(this.pkStateObserver);
        }
    }
}
