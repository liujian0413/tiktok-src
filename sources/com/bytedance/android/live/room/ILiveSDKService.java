package com.bytedance.android.live.room;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.model.p121b.C2336a;
import com.bytedance.android.live.room.C3484c.C3485a;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;

public interface ILiveSDKService extends C2324b {
    C3484c createImagePicker(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, C3485a aVar);

    C3486d createInteractionFragment(int i);

    C3489f createLiveBroadcastEndFragment(boolean z);

    C3483b dnsOptimizer();

    C3492i getLottiePlayService();

    IMessageManager getMessageManager(long j, boolean z, Context context);

    C3498o getXTSDKService();

    void handleRealNameConflict(Activity activity, int i, C2336a aVar, Bundle bundle);

    C3496m hostStickerViewService();

    C3488e linkCrossRoomWidget();

    C3490g liveCommerceService();
}
