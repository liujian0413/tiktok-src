package com.p280ss.android.pushmanager.thirdparty;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.p254b.C9709a;
import com.bytedance.common.utility.reflect.C9743c;
import com.p280ss.android.message.C19837f;
import com.p280ss.android.message.log.C19851c;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.C20076i;
import com.p280ss.android.pushmanager.app.C20042b;
import com.p280ss.android.pushmanager.app.C20051g;
import com.p280ss.android.pushmanager.setting.C20090b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.thirdparty.PushDependAdapter */
public class PushDependAdapter implements IPushDepend {
    public static PushDependAdapter INSTANCE = new PushDependAdapter();

    private PushDependAdapter() {
    }

    public void loggerD(String str, String str2) {
    }

    public void setAdapter(IPushDepend iPushDepend) {
    }

    public boolean loggerDebug() {
        return C6312h.m19578b();
    }

    public static void inJect() throws Throwable {
        Object a = C9743c.m28722a(Class.forName("com.ss.android.push.PushDependManager"), "inst", new Object[0]);
        if (a instanceof IPushDepend) {
            ((IPushDepend) a).setAdapter(INSTANCE);
        }
    }

    public void hackJobHandler(Service service) {
        C20042b.m66003a(service);
    }

    public void tryHookInit(Context context) {
        C20074g.m66102a();
    }

    public void executeAsyncTask(AsyncTask asyncTask) {
        C9709a.m28647a(asyncTask, new Object[0]);
    }

    public boolean isAllowPushService(int i) {
        return C20076i.m66116a(i);
    }

    public Pair<String, String> getPushConfig(int i) {
        if (i == 1) {
            return C20074g.m66102a().mo53711b();
        }
        if (i == 8) {
            return C20074g.m66102a().mo53712c();
        }
        if (i == 10) {
            return C20074g.m66102a().mo53713d();
        }
        return null;
    }

    public List<String> getWakeupBlacklistPkg(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            String w = C20090b.m66187a().mo53796w();
            if (TextUtils.isEmpty(w)) {
                return arrayList;
            }
            JSONArray jSONArray = new JSONArray(w);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.optString(i));
            }
            return arrayList;
        } catch (Exception unused) {
        }
    }

    public void onNotificationArrived(Context context, JSONObject jSONObject) {
        C19837f.m65507a(context, jSONObject);
    }

    public void sendToken(Context context, ISendTokenCallBack iSendTokenCallBack) {
        C20092b.m66247a(context, iSendTokenCallBack);
    }

    public JSONObject getMessage(byte[] bArr, boolean z) throws DataFormatException, IOException {
        return C20051g.m66036a(bArr, z);
    }

    public String getToken(Context context, int i) {
        return C20092b.m66246a(i);
    }

    public void saveMapToProvider(Context context, Map<String, ?> map) {
        C20090b.m66187a().mo53766c(map);
    }

    public void sendMonitor(Context context, String str, JSONObject jSONObject) {
        C20074g.m66102a();
    }

    public Boolean getProviderBoolean(Context context, String str, Boolean bool) {
        return C20090b.m66187a().mo53754a(str, bool);
    }

    public int getProviderInt(Context context, String str, int i) {
        return C20090b.m66187a().mo53752a(str, i);
    }

    public long getProviderLong(Context context, String str, long j) {
        return C20090b.m66187a().mo53753a(str, j);
    }

    public String getProviderString(Context context, String str, String str2) {
        return C20090b.m66187a().mo53755a(str, str2);
    }

    public void onClickNotPassThroughNotification(Context context, int i, String str, int i2, String str2) {
        C20074g.m66102a().mo53708a(context, i, str, i2, str2);
    }

    public void logEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        C19851c.m65554a(context, str, str2, str3, j, j2, jSONObject);
    }
}
