package com.bytedance.android.live.room;

import android.text.Spannable;
import com.bytedance.android.live.room.p168a.C3482a;
import com.bytedance.android.livesdkapi.depend.live.C9332f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.p108b.C2260a.C2261a;

/* renamed from: com.bytedance.android.live.room.l */
public interface C3495l extends C9332f {
    void cacheEndTime(C3491h hVar, long j);

    void cacheObj2Obj(C2261a aVar, C3491h hVar);

    C3482a getCrossRoomGift();

    String getLiveType(Room room);

    C3493j messageManagerHelper();

    Spannable parsePatternAndGetSpannable(C9505f fVar, String str);

    Spannable parsePatternAndGetSpannable(String str, C9505f fVar);

    C3494k roomManager();

    C3482a setCrossRoomGift(C3482a aVar);

    C3497n toolbarManagerHelper();
}
