package com.bytedance.android.livesdkapi.depend.live;

import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.livesdkapi.depend.live.f */
public interface C9332f extends C2324b {
    Room getCurrentRoom();

    C7486b<Long> getLiveWatchTime();

    boolean isInteracting();

    void recordEnterStart(EntryType entryType);

    void registerInteractStateChangeListener(C9326b bVar);

    void removeInteractStateChangeListener(C9326b bVar);

    void setCurrentRoom(Room room);
}
