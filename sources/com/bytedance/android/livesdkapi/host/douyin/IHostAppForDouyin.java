package com.bytedance.android.livesdkapi.host.douyin;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.support.p022v4.app.C0608j;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.host.C9467i;
import com.bytedance.android.livesdkapi.host.C9468j;
import com.bytedance.android.livesdkapi.host.p453a.C9441b;
import com.bytedance.android.livesdkapi.p452h.C9414c;
import com.bytedance.android.livesdkapi.p452h.C9415d;

public interface IHostAppForDouyin extends C2324b, C9441b {
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

    C9414c avatarBorderController();

    void bindGifImage(View view, String str, Config config);

    void centerToast(Context context, String str, int i);

    String getBgBroadcastServiceName();

    Class getHostActivity(int i);

    void hideStickerView();

    boolean isShowStickerView();

    C9415d liveCircleView(Context context);

    void openWallet(Activity activity);

    void showStickerView(AppCompatActivity appCompatActivity, C0608j jVar, String str, FrameLayout frameLayout, C9468j jVar2);

    void startBindMobileFullFragment(Activity activity, String str, String str2, C9467i iVar);

    void startBindPhoneDialogFragment(Activity activity, String str, String str2, C9467i iVar);

    boolean startVideoRecordActivity(Activity activity, String str);

    void systemToast(Context context, String str, int i);

    void tryDownloadGiftImage(String str);
}
