package com.p280ss.android.pushmanager.thirdparty;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import com.p280ss.android.pushmanager.C20074g;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.thirdparty.IPushDepend */
public interface IPushDepend {
    public static final String SEND_PUSH_TOKEN_URL = C20074g.m66109d();

    void executeAsyncTask(AsyncTask asyncTask);

    JSONObject getMessage(byte[] bArr, boolean z) throws DataFormatException, IOException;

    Boolean getProviderBoolean(Context context, String str, Boolean bool);

    int getProviderInt(Context context, String str, int i);

    long getProviderLong(Context context, String str, long j);

    String getProviderString(Context context, String str, String str2);

    Pair<String, String> getPushConfig(int i);

    String getToken(Context context, int i);

    List<String> getWakeupBlacklistPkg(Context context);

    void hackJobHandler(Service service);

    boolean isAllowPushService(int i);

    void logEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

    void loggerD(String str, String str2);

    boolean loggerDebug();

    void onClickNotPassThroughNotification(Context context, int i, String str, int i2, String str2);

    void onNotificationArrived(Context context, JSONObject jSONObject);

    void saveMapToProvider(Context context, Map<String, ?> map);

    void sendMonitor(Context context, String str, JSONObject jSONObject);

    void sendToken(Context context, ISendTokenCallBack iSendTokenCallBack);

    void setAdapter(IPushDepend iPushDepend);

    void tryHookInit(Context context);
}
