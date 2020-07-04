package com.p280ss.android.ugc.aweme.profile.adapter;

import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.h */
public final /* synthetic */ class C35715h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f93666a;

    static {
        int[] iArr = new int[PlayerMessage.values().length];
        f93666a = iArr;
        iArr[PlayerMessage.DISPLAYED_PLAY.ordinal()] = 1;
        f93666a[PlayerMessage.MEDIA_ERROR.ordinal()] = 2;
        f93666a[PlayerMessage.COMPLETE_PLAY.ordinal()] = 3;
    }
}
