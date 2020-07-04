package com.p280ss.android.common.applog;

import com.bytedance.common.utility.p254b.C6304f;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.AppLogCache */
public class AppLogCache {
    private static volatile AppLogCache sInstance;
    public final LinkedList<AppLogEventData> mEventData = new LinkedList<>();

    /* renamed from: com.ss.android.common.applog.AppLogCache$AppLogEventData */
    class AppLogEventData {
        String mCategory;
        JSONObject mExt_json;
        long mExt_value;
        boolean mInstant_only;
        String mLabel;
        String mTag;
        long mValue;

        AppLogEventData(String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
            this.mCategory = str;
            this.mTag = str2;
            this.mLabel = str3;
            this.mValue = j;
            this.mExt_value = j2;
            this.mInstant_only = z;
            this.mExt_json = jSONObject;
        }
    }

    /* access modifiers changed from: 0000 */
    public void handleCacheEvent() {
        new C6304f("handle_cached_events") {
            public void run() {
                super.run();
                try {
                    LinkedList linkedList = new LinkedList();
                    synchronized (AppLogCache.this.mEventData) {
                        linkedList.addAll(AppLogCache.this.mEventData);
                        AppLogCache.this.mEventData.clear();
                    }
                    while (!linkedList.isEmpty()) {
                        AppLogEventData appLogEventData = (AppLogEventData) linkedList.poll();
                        AppLog.onEvent(null, appLogEventData.mCategory, appLogEventData.mTag, appLogEventData.mLabel, appLogEventData.mValue, appLogEventData.mExt_value, appLogEventData.mInstant_only, appLogEventData.mExt_json);
                    }
                } catch (Throwable unused) {
                }
            }
        }.start();
    }

    static AppLogCache getCacheInstance() {
        if (sInstance == null) {
            synchronized (AppLogCache.class) {
                if (sInstance == null) {
                    sInstance = new AppLogCache();
                }
            }
        }
        return sInstance;
    }

    /* access modifiers changed from: 0000 */
    public void cacheEvent(String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        synchronized (this.mEventData) {
            if (this.mEventData.size() > 200) {
                this.mEventData.poll();
                AppLog.tryReportEventDiscard(1);
            }
            LinkedList<AppLogEventData> linkedList = this.mEventData;
            AppLogEventData appLogEventData = new AppLogEventData(str, str2, str3, j, j2, z, jSONObject);
            linkedList.add(appLogEventData);
        }
    }
}
