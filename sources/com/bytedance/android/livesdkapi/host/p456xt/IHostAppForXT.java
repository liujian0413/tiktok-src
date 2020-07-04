package com.bytedance.android.livesdkapi.host.p456xt;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.host.C9467i;
import com.bytedance.android.livesdkapi.host.p453a.C9441b;
import com.bytedance.android.livesdkapi.host.p454b.C9455a;
import com.bytedance.android.livesdkapi.view.C9517a;

/* renamed from: com.bytedance.android.livesdkapi.host.xt.IHostAppForXT */
public interface IHostAppForXT extends C2324b, C9441b {
    public static final int BROADCAST_PREVIEW_CLASS = 18;
    public static final int BROADCAST_RES_DOWNLOAD_ACTIVITY_CLASS = 17;
    public static final int BROADCAST_SIGNING_CLASS = 9;
    public static final int GIFT_AD_ACTIVITY_CLASS = 1;
    public static final int LIVE_BG_BROADCAST_ACTIVITY_CLASS = 6;
    public static final int LIVE_BILLING_ACTIVITY_CLASS = 21;
    public static final int LIVE_BROADCAST_ACTIVITY_CLASS = 5;
    public static final int LIVE_BROADCAST_BEFORE_ACTIVITY_CLASS = 16;
    public static final int START_LIVE_ACTIVITY_CLASS = 7;
    public static final int VERIFY_ACTIVITY_CLASS = 8;
    public static final int XT_MEDIA_BROADCAST_ACTIVITY_CLASS = 20;
    public static final int XT_MEDIA_BROADCAST_CONFIG_ACTIVITY_CLASS = 19;

    void centerToast(Context context, String str, int i);

    void centerToast(Context context, String str, int i, boolean z);

    String getBgBroadcastServiceName();

    Class getHostActivity(int i);

    Class getLiveActivityClass();

    Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C9517a aVar, CharSequence charSequence4, C9517a aVar2, C9455a aVar3);

    void startBindMobileFullFragment(Activity activity, String str, String str2, C9467i iVar);

    void systemToast(Context context, String str, int i);

    void tryDownloadImage(String str);
}
