package com.bytedance.android.live.linkpk;

import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.log.p405b.C8434f;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.live.linkpk.a */
public interface C3440a extends C2324b {
    PkState getCurrentPkState();

    C8434f getLinkCrossRoomLog();

    C7492s<PkState> observePkState();

    void registerObserve();

    void removeObserve();
}
