package com.bytedance.android.livesdk.live.model;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RaceConfigInfo {
    @C6593c(mo15949a = "top_bg_url")
    public List<String> bgUrls;
    @C6593c(mo15949a = "race_anchor_ids")
    public List<Long> raceAnchorIds;

    /* renamed from: com.bytedance.android.livesdk.live.model.RaceConfigInfo$a */
    static class C8396a {

        /* renamed from: a */
        public static RaceConfigInfo f23011a = new RaceConfigInfo();
    }

    public static RaceConfigInfo getDefaultInstance() {
        return C8396a.f23011a;
    }

    public boolean isGameRaceRoom(Room room) {
        boolean z = false;
        if (room == null || C6307b.m19566a((Collection<T>) this.raceAnchorIds)) {
            return false;
        }
        Iterator it = this.raceAnchorIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Long l = (Long) it.next();
            if (l != null && l.longValue() == room.getOwnerUserId()) {
                z = true;
                break;
            }
        }
        return z;
    }
}
