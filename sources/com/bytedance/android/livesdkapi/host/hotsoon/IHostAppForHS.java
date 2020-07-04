package com.bytedance.android.livesdkapi.host.hotsoon;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.host.C9467i;
import com.bytedance.android.livesdkapi.host.p453a.C9441b;
import java.io.File;
import org.json.JSONObject;

public interface IHostAppForHS extends C2324b, C9441b {
    void centerToast(Context context, String str, int i);

    void checkAndShowGuide(FragmentActivity fragmentActivity, String str, String str2);

    void checkBindHelpShow(FragmentActivity fragmentActivity, String str);

    void enterRecorderActivity(Activity activity);

    String getBgBroadcastServiceName();

    Class getHostActivity(int i);

    Uri getUriForFile(Context context, File file);

    void initImageLib();

    void openWallet(Activity activity);

    void startBindMobileFullFragment(Activity activity, String str, String str2, C9467i iVar);

    void startBindPhoneDialogFragment(Activity activity, String str, String str2, C9467i iVar);

    boolean startVideoRecordActivity(Activity activity, String str);

    void systemToast(Context context, String str, int i);

    void transCloudControlCommand(JSONObject jSONObject);
}
