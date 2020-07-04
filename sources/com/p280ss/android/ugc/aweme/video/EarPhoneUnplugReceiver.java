package com.p280ss.android.ugc.aweme.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C30241a;

/* renamed from: com.ss.android.ugc.aweme.video.EarPhoneUnplugReceiver */
public final class EarPhoneUnplugReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Integer num;
        Activity g = C6405d.m19984g();
        if (intent != null) {
            num = Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0));
        } else {
            num = null;
        }
        if ((g instanceof FragmentActivity) && num != null && num.intValue() == 0) {
            C30241a.m98909a((FragmentActivity) g).f79568g.postValue("on_ear_phone_unplug");
        }
    }
}
