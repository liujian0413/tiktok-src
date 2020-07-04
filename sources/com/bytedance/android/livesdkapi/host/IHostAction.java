package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.host.p453a.C9440a;
import java.util.Map;

public interface IHostAction extends C2324b, C9440a {
    public static final String BUNDLE_HIDE_MORE = "hide_more";
    public static final String BUNDLE_HIDE_NAV_BAR = "hide_nav_bar";
    public static final String BUNDLE_HIDE_STATUS_BAR = "hide_status_bar";
    public static final String BUNDLE_ROTATE = "bundle_rotate";
    public static final String BUNDLE_SHOW_PROGRESS = "show_progress";
    public static final String BUNDLE_TITLE = "title";
    public static final String BUNDLE_URL = "url";

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostAction$a */
    public interface C9429a {
    }

    boolean handleSchema(Context context, String str, Bundle bundle);

    void openFeedBack(String str, Context context);

    boolean openHostBrowser(String str, Bundle bundle, Context context);

    boolean openHostBrowser(String str, boolean z, String str2, Context context);

    void openLiveBrowser(String str, Bundle bundle, Context context);

    void openLiveBrowser(String str, String str2, Context context);

    void openSignActivity(Context context, Intent intent);

    void openTaobaoApp(Context context, String str, C9429a aVar);

    void openUserProfilePage(long j, Map<String, String> map);

    void openUserProfilePage(Context context, long j, Bundle bundle);

    void openVideoDetailPage(String str, String str2);

    void switchToLiveTab(int i, String str);

    boolean tryOpenAdByOpenUrl(Context context, long j, String str, String str2);

    boolean tryShowKoiRedPackageInLive(String str);
}
