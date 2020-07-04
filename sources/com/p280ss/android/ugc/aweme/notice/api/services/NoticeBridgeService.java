package com.p280ss.android.ugc.aweme.notice.api.services;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.C0608j;

/* renamed from: com.ss.android.ugc.aweme.notice.api.services.NoticeBridgeService */
public interface NoticeBridgeService {
    Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2);

    void pushOrNoticeShowLinkAccountDialog(C0608j jVar, String str);
}
