package com.p280ss.android.ugc.aweme.tools;

import android.support.p022v4.util.Pools.SimplePool;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.ah */
public final class C42141ah extends C42249c {

    /* renamed from: c */
    private static final SimplePool<C42141ah> f109663c = new SimplePool<>(1);

    /* renamed from: a */
    public List<TimeSpeedModelExtension> f109664a;

    /* renamed from: b */
    public long f109665b;

    private C42141ah() {
    }

    /* renamed from: a */
    public final void mo103576a() {
        f109663c.release(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingProgressUpdateEvent{timeSpeedModels=");
        sb.append(this.f109664a);
        sb.append(", elapsedTimeInMicros=");
        sb.append(this.f109665b);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C42141ah m134103a(List<TimeSpeedModelExtension> list, long j) {
        C42141ah ahVar = (C42141ah) f109663c.acquire();
        if (ahVar == null) {
            ahVar = new C42141ah();
        }
        ahVar.f109664a = list;
        ahVar.f109665b = j;
        return ahVar;
    }
}
