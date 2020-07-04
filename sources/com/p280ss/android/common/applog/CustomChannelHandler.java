package com.p280ss.android.common.applog;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.C6730a;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.usergrowth.C45167b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.CustomChannelHandler */
public class CustomChannelHandler {
    private static CustomChannelHandler mInstance = null;
    public static boolean sCanSendAppInstallInfo = true;
    private long mApkCreateTime = -1;
    private int mApkSuffixNum = -1;
    private String mAppChannel = "";
    private WeakReference<Context> mContextRef;
    private boolean mHasSendAppInfo;
    public AtomicBoolean mIsRunning = new AtomicBoolean(false);
    private boolean mIsSendingAppInfo;
    private long mSystemCreateTime = -1;
    private String mSystemRecordChannel = "";

    /* renamed from: com.ss.android.common.applog.CustomChannelHandler$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_FixApplogGetSystemChannelLancet_getSystemRecordChannel */
        static void m20888x906a5ccc(CustomChannelHandler customChannelHandler) {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m20889x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    public void getSystemRecordChannel() {
        _lancet.m20888x906a5ccc(this);
    }

    public boolean hasSendAppInfo() {
        return this.mHasSendAppInfo;
    }

    public boolean isSendingAppInfo() {
        return this.mIsSendingAppInfo;
    }

    public boolean hasGetChannels() {
        if (!C6319n.m19593a(this.mAppChannel)) {
            return true;
        }
        return false;
    }

    public boolean hasGetApkInstallInfo() {
        if (this.mApkCreateTime == -1 || this.mSystemCreateTime == -1) {
            return false;
        }
        return true;
    }

    public JSONObject toOnlySystemRecordJson() {
        if (C6319n.m19593a(this.mSystemRecordChannel)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!C6319n.m19593a(this.mSystemRecordChannel)) {
                jSONObject.put("system_record_channel", this.mSystemRecordChannel);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void getApkInstallInfo() {
        if (this.mContextRef.get() != null && this.mIsRunning.compareAndSet(false, true)) {
            new C6304f(new Runnable() {
                public void run() {
                    try {
                        CustomChannelHandler.this.getSystemRecordChannel();
                        CustomChannelHandler.this.getSystemCreateTime();
                        CustomChannelHandler.this.getApkInfo();
                        CustomChannelHandler.this.saveInfoToSp();
                        CustomChannelHandler.this.mIsRunning.set(false);
                    } catch (Throwable unused) {
                    }
                }
            }, "get_apk_install_info", true).start();
        }
    }

    public void loadInfoFromSp() {
        if (this.mContextRef.get() != null) {
            Context context = (Context) this.mContextRef.get();
            try {
                synchronized ("custom_channels") {
                    JSONObject jSONObject = new JSONObject(C7285c.m22838a(context, "custom_channels", 0).getString("app_install_info", ""));
                    inst(context).init(jSONObject);
                    this.mHasSendAppInfo = jSONObject.optBoolean("has_send_app_info", false);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void getApkInfo() {
        String str;
        if (this.mContextRef.get() != null) {
            try {
                str = _lancet.m20889x89c42dc8(((Context) this.mContextRef.get()).getPackageManager(), ((Context) this.mContextRef.get()).getPackageName(), 0).publicSourceDir;
                try {
                    this.mApkCreateTime = getFileLastModifiedTime(str) / 1000;
                } catch (NameNotFoundException | Exception unused) {
                }
            } catch (NameNotFoundException | Exception unused2) {
                str = null;
            }
            if (str != null) {
                try {
                    Matcher matcher = Pattern.compile("(.*)-(\\d+)(.*)").matcher(str.trim());
                    if (matcher.find()) {
                        this.mApkSuffixNum = Integer.parseInt(matcher.group(2));
                    } else {
                        this.mApkSuffixNum = -1;
                    }
                } catch (Exception unused3) {
                }
            }
        }
    }

    public void getSystemCreateTime() {
        try {
            File file = new File("/system/app");
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (File file2 : listFiles) {
                    if (file2.exists() && i < 5) {
                        arrayList.add(Long.valueOf(file2.lastModified() / 1000));
                        i++;
                    }
                }
                Collections.sort(arrayList);
                this.mSystemCreateTime = ((Long) arrayList.get(arrayList.size() / 2)).longValue();
            }
        } catch (Exception unused) {
        }
    }

    public void getSystemRecordChannel$___twin___() {
        if (C6319n.m19593a(this.mSystemRecordChannel)) {
            try {
                this.mSystemRecordChannel = C45167b.m142384a((Context) this.mContextRef.get());
                Context context = (Context) this.mContextRef.get();
                if (context != null && !TextUtils.isEmpty(this.mSystemRecordChannel)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("position", "app_start");
                    jSONObject.put("system_record_channel", this.mSystemRecordChannel);
                    AppLog.onEvent(context, "event_v3", "pre_install_check", (String) null, 0, 0, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void saveInfoToSp() {
        if (this.mContextRef.get() != null) {
            Context context = (Context) this.mContextRef.get();
            JSONObject json = inst(context).toJson();
            if (json != null) {
                try {
                    synchronized ("custom_channels") {
                        json.put("has_send_app_info", this.mHasSendAppInfo);
                        Editor edit = C7285c.m22838a(context, "custom_channels", 0).edit();
                        edit.putString("app_install_info", json.toString());
                        C9721b.m28656a(edit);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public JSONObject toJson() {
        if (C6319n.m19593a(this.mAppChannel) && C6319n.m19593a(this.mSystemRecordChannel) && this.mApkCreateTime == -1 && this.mApkSuffixNum == -1 && this.mSystemCreateTime == -1) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!C6319n.m19593a(this.mAppChannel)) {
                jSONObject.put("app_channel", this.mAppChannel);
            }
            if (!C6319n.m19593a(this.mSystemRecordChannel)) {
                jSONObject.put("system_record_channel", this.mSystemRecordChannel);
            }
            if (this.mApkCreateTime != -1) {
                jSONObject.put("apk_create_time", this.mApkCreateTime);
            }
            if (this.mApkSuffixNum != -1) {
                jSONObject.put("apk_shuffix_num", this.mApkSuffixNum);
            }
            if (this.mSystemCreateTime != -1) {
                jSONObject.put("system_create_time", this.mSystemCreateTime);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void setIsSendingAppInfo(boolean z) {
        this.mIsSendingAppInfo = z;
    }

    public void setHasSendAppInfo(boolean z) {
        this.mHasSendAppInfo = z;
        saveInfoToSp();
    }

    public void getAppChannel(C6730a aVar) {
        if (aVar != null) {
            this.mAppChannel = aVar.mo16336c();
            saveInfoToSp();
        }
    }

    private static long getFileLastModifiedTime(String str) {
        long j = -1;
        if (C6319n.m19593a(str)) {
            return -1;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                j = file.lastModified();
            }
        } catch (Exception unused) {
        }
        return j;
    }

    public static CustomChannelHandler inst(Context context) {
        if (mInstance == null) {
            synchronized (CustomChannelHandler.class) {
                if (mInstance == null) {
                    mInstance = new CustomChannelHandler(context);
                }
            }
        }
        return mInstance;
    }

    private CustomChannelHandler(Context context) {
        this.mContextRef = new WeakReference<>(context.getApplicationContext());
    }

    public void init(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.mAppChannel = jSONObject.optString("app_channel", "");
                this.mSystemRecordChannel = jSONObject.optString("system_record_channel", "");
                this.mApkCreateTime = jSONObject.optLong("apk_create_time", -1);
                this.mApkSuffixNum = jSONObject.optInt("apk_shuffix_num", -1);
                this.mSystemCreateTime = jSONObject.optLong("system_create_time", -1);
            } catch (Exception unused) {
            }
        }
    }
}
