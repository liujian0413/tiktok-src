package com.p280ss.android.ugc.aweme.common;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.C0608j;
import com.p280ss.android.ugc.aweme.bridgeservice.C23549b;
import com.p280ss.android.ugc.aweme.friends.p1285ui.IAddFriendsActivity;
import com.p280ss.android.ugc.aweme.notice.api.services.NoticeBridgeService;

/* renamed from: com.ss.android.ugc.aweme.common.NoticeBridgeServiceImpl */
public class NoticeBridgeServiceImpl implements NoticeBridgeService {
    public void pushOrNoticeShowLinkAccountDialog(C0608j jVar, String str) {
        C23549b.m77335a().pushOrNoticeShowLinkAccountDialog(jVar, str);
    }

    public Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2) {
        return IAddFriendsActivity.m98617a(context, i, i2, str);
    }
}
