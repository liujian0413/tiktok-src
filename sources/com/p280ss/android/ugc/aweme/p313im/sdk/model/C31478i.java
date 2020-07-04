package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C7020e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.i */
public final class C31478i {
    /* renamed from: a */
    public static List<C7020e> m102351a(List<StrangerMsgSession> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (StrangerMsgSession strangerMsgSession : list) {
                arrayList.add(C7020e.m21842a(strangerMsgSession.getLastMsg(), strangerMsgSession.getUnreadCount()));
            }
        }
        return arrayList;
    }
}
