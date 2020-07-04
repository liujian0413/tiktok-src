package com.snapchat.kit.sdk.creative.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.C1642a;
import com.bytedance.sysoptimizer.BuildConfig;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.creative.models.SnapContent;
import com.snapchat.kit.sdk.creative.p808a.C18706a;
import com.snapchat.kit.sdk.creative.p809b.C18708a;
import com.snapchat.kit.sdk.creative.p809b.C18710c;
import com.snapchat.kit.sdk.util.SnapUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class SnapCreativeKitApi {
    private final String mClientId;
    private final Context mContext;
    private final C18708a mEventFactory;
    private final MetricQueue<ServerEvent> mEventQueue;
    private C18710c mOpMetricsManager;
    private String mRedirectUrl;

    public void send(SnapContent snapContent) {
        sendWithCompletionHandler(snapContent, null);
    }

    public void sendWithCompletionHandler(SnapContent snapContent, SnapCreativeKitCompletionCallback snapCreativeKitCompletionCallback) {
        long currentTimeMillis = System.currentTimeMillis();
        C18706a aVar = new C18706a(this.mClientId, snapContent);
        PackageManager packageManager = this.mContext.getPackageManager();
        if (!SnapUtils.isSnapchatInstalled(packageManager, "com.snapchat.android")) {
            this.mContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C1642a.m8034a("https://play.google.com/store/apps/details?id=%s", new Object[]{"com.snapchat.android"}))));
            this.mOpMetricsManager.mo49200a("sendToPlayStore", 1);
            if (snapCreativeKitCompletionCallback != null) {
                snapCreativeKitCompletionCallback.onSendFailed(SnapCreativeKitSendError.SNAPCHAT_NOT_INSTALLED);
            }
            return;
        }
        this.mOpMetricsManager.mo49200a("sendIntentToApp", 1);
        Intent a = aVar.mo49194a(this.mContext);
        a.setPackage("com.snapchat.android");
        a.putExtra("CLIENT_ID", this.mClientId);
        a.putExtra("KIT_VERSION", BuildConfig.VERSION_NAME);
        a.putExtra("KIT_VERSION_CODE", 11);
        a.putExtra("deep_link_intent", true);
        if (!TextUtils.isEmpty(this.mRedirectUrl)) {
            a.putExtra("KIT_REDIRECT_URL", this.mRedirectUrl);
        }
        a.putExtra("RESULT_INTENT", PendingIntent.getBroadcast(this.mContext, 17, new Intent(), 1073741824));
        a.setFlags(335544320);
        if (a.resolveActivity(packageManager) != null) {
            this.mEventQueue.push(this.mEventFactory.mo49199a());
            this.mContext.startActivity(a);
            this.mOpMetricsManager.mo49201b("sendLatency", System.currentTimeMillis() - currentTimeMillis);
            if (snapCreativeKitCompletionCallback != null) {
                snapCreativeKitCompletionCallback.onSendSuccess();
            }
        } else {
            this.mOpMetricsManager.mo49200a("cannotShareContent", 1);
            C18707a.m61263a(Toast.makeText(this.mContext, R.string.dva, 0));
            if (snapCreativeKitCompletionCallback != null) {
                snapCreativeKitCompletionCallback.onSendFailed(SnapCreativeKitSendError.SNAPCHAT_CANNOT_SHARE_CONTENT);
            }
        }
    }

    SnapCreativeKitApi(Context context, String str, String str2, C18710c cVar, MetricQueue<ServerEvent> metricQueue, C18708a aVar) {
        this.mContext = context;
        this.mClientId = str;
        this.mRedirectUrl = str2;
        this.mOpMetricsManager = cVar;
        this.mEventQueue = metricQueue;
        this.mEventFactory = aVar;
    }
}
