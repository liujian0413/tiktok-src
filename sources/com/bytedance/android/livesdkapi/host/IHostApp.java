package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.host.p453a.C9441b;
import com.bytedance.android.livesdkapi.host.p454b.C9455a;
import com.bytedance.android.livesdkapi.p452h.C9414c;
import com.bytedance.android.livesdkapi.p452h.C9415d;
import com.bytedance.android.livesdkapi.view.C9517a;
import java.io.File;
import org.json.JSONObject;

public interface IHostApp extends C2324b, C9441b {
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

    void centerToast(Context context, String str, int i, boolean z);

    void checkAndShowGuide(FragmentActivity fragmentActivity, String str, String str2);

    void checkBindHelpShow(FragmentActivity fragmentActivity, String str);

    void enterRecorderActivity(Activity activity);

    String getBgBroadcastServiceName();

    Class getHostActivity(int i);

    Typeface getHostTypeface(int i);

    Class getLiveActivityClass();

    Uri getUriForFile(Context context, File file);

    void hideStickerView();

    void initImageLib();

    boolean isShowStickerView();

    C9415d liveCircleView(Context context);

    void openWallet(Activity activity);

    Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C9517a aVar, CharSequence charSequence4, C9517a aVar2, C9455a aVar3);

    void showStickerView(AppCompatActivity appCompatActivity, C0608j jVar, String str, FrameLayout frameLayout, C9468j jVar2);

    void startBindMobileFullFragment(Activity activity, String str, String str2, C9467i iVar);

    void startBindPhoneDialogFragment(Activity activity, String str, String str2, C9467i iVar);

    boolean startVideoRecordActivity(Activity activity, String str);

    void systemToast(Context context, String str, int i);

    void transCloudControlCommand(JSONObject jSONObject);

    void tryDownloadGiftImage(String str);

    void tryDownloadImage(String str);
}
