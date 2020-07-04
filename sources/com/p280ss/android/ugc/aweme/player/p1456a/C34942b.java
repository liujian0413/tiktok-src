package com.p280ss.android.ugc.aweme.player.p1456a;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.player.p1456a.C34950e.C34954b;
import com.p280ss.android.ugc.aweme.utils.C43048db;
import com.p280ss.android.ugc.aweme.utils.OneTimeEnum;

/* renamed from: com.ss.android.ugc.aweme.player.a.b */
public final class C34942b {
    /* renamed from: a */
    public static C34954b m112592a(String str) {
        boolean z;
        C34954b bVar = new C34954b();
        Long a = C34939a.m112588a().mo88499a(str);
        if (!C43048db.m136578a().mo104720a(OneTimeEnum.FROM_SEND_TO_FIRST) || a == null) {
            z = false;
        } else {
            z = true;
        }
        bVar.f91204a = z;
        if (bVar.f91204a) {
            bVar.f91205b = Long.valueOf(SystemClock.elapsedRealtime() - a.longValue());
        }
        C34939a.m112588a().mo88501b();
        return bVar;
    }
}
