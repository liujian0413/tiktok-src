package com.bytedance.android.livesdk.chatroom.interact.p215c;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.p280ss.avframework.livestreamv2.core.Anchor.Region;
import com.p280ss.avframework.livestreamv2.core.Anchor.StreamMixer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.c */
public final class C4505c implements StreamMixer {

    /* renamed from: a */
    private C4506a f13115a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.c$a */
    public interface C4506a {
        /* renamed from: a */
        long mo12275a(int i);
    }

    public C4505c(C4506a aVar) {
        this.f13115a = aVar;
    }

    public final List<Region> mixStream(int i, int i2, int i3, List<Integer> list) {
        int i4;
        int i5 = C3912d.m13795a().f11713h;
        long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        ArrayList arrayList = new ArrayList();
        Region region = new Region();
        com.p280ss.avframework.livestreamv2.interact.model.Region userId = region.mediaType(1).size(1.0d, 1.0d).position(0.0d, 0.0d).interactId(i5).userId(b);
        userId.status(0);
        arrayList.add(region);
        if (list == null || list.isEmpty()) {
            i4 = 0;
        } else {
            i4 = list.size();
        }
        for (int i6 = 0; i6 < i4; i6++) {
            int intValue = ((Integer) list.get(i6)).intValue();
            Region region2 = new Region();
            region2.mediaType(2).size(1.0d, 1.0d).position(0.0d, 0.0d).interactId(intValue).userId(this.f13115a.mo12275a(intValue));
            arrayList.add(region2);
        }
        return arrayList;
    }
}
