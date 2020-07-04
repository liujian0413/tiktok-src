package com.bytedance.android.livesdkapi.host.vigo;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.host.p453a.C9445f;
import com.bytedance.android.livesdkapi.p434a.C9286a;
import com.bytedance.android.livesdkapi.p434a.C9287b;
import com.bytedance.android.livesdkapi.p434a.C9288c;
import java.util.List;
import org.json.JSONObject;

public interface IHostHSFuncForVigo extends C2324b, C9445f {
    void adLog(Context context, String str, long j, String str2, JSONObject jSONObject, boolean z);

    void adLog(Context context, String str, String str2, long j, long j2, JSONObject jSONObject);

    String anchorSchema();

    boolean anchorSwitch();

    String audienceSchema();

    boolean audienceSwitch();

    void bindHost(Context context, JSONObject jSONObject, Object... objArr);

    C9287b createAdVideoView(Context context, JSONObject jSONObject);

    String createRoomSchema();

    boolean createRoomSwitch();

    void onAdActionCLick(Context context, JSONObject jSONObject, int i, Object... objArr);

    void onClickEvent(Context context, JSONObject jSONObject, String str, String str2, boolean z);

    void onDislikeAd(Context context, JSONObject jSONObject, List<Object> list);

    void openDownloadWebView(String str, Bundle bundle, Context context);

    boolean openSchema(Context context, String str);

    C9288c provideViewTrackService();

    void sendAdStats(Context context, List<String> list, boolean z, Object... objArr);

    void tryBindDownloadManager(Context context, int i, C9286a aVar, JSONObject jSONObject);

    void tryUnBindDowloadManager(Context context, int i, JSONObject jSONObject);

    void unBindHost(Context context, JSONObject jSONObject);
}
