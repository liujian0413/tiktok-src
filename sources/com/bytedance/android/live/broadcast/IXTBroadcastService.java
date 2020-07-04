package com.bytedance.android.live.broadcast;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9348c;

public interface IXTBroadcastService {
    LiveActivityProxy createXTBroadcastBeforeActivityProxy(FragmentActivity fragmentActivity);

    LiveActivityProxy createXTBroadcastResDownloadActivityProxy(FragmentActivity fragmentActivity);

    Fragment createXTMediaBroadcastFragment(C9348c cVar, Bundle bundle);

    LiveActivityProxy createXTMediaStartLiveProxy(FragmentActivity fragmentActivity);
}
