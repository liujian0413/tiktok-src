package com.bytedance.ies.sdk.widgets;

import android.util.Log;
import com.bytedance.android.live.core.p148d.C3172e;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class LiveRecyclableWidget extends LiveWidget implements IRecyclableWidget {
    private boolean alive;
    private Object[] args;
    private boolean clearAfterDestroyed;
    private boolean initialized;

    public final boolean isAlive() {
        return this.alive;
    }

    public final boolean isInitialized() {
        return this.initialized;
    }

    public void onClear() {
    }

    public abstract void onInit(Object[] objArr);

    public abstract void onLoad(Object[] objArr);

    public abstract void onUnload();

    /* access modifiers changed from: protected */
    public boolean startWithMergeTag() {
        return false;
    }

    public final void setClearAfterDestroyed() {
        if (this.alive) {
            this.clearAfterDestroyed = true;
            return;
        }
        if (this.isDestroyed) {
            onClear();
        }
    }

    public final void onCreate() {
        this.alive = true;
        super.onCreate();
        if (!this.initialized) {
            onInit(this.args);
            this.initialized = true;
        }
        onLoad(this.args);
    }

    public final void onDestroy() {
        if (!(this.contentView == null || this.containerView == null)) {
            this.containerView.removeView(this.contentView);
        }
        try {
            onUnload();
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("stacktrace", Log.getStackTraceString(e));
                C3172e.m12002a("widget_unload_data_center_null", -3, jSONObject);
            } catch (Exception e2) {
                try {
                    jSONObject.put("stacktrace", Log.getStackTraceString(e2));
                } catch (JSONException unused) {
                }
                C3172e.m12002a("widget_unload_data_center_null", -4, jSONObject);
            }
        }
        super.onDestroy();
        this.containerView = null;
        this.dataCenter = null;
        setWidgetCallback(null);
        this.args = null;
        this.context = null;
        this.containerView = null;
        this.alive = false;
        if (this.clearAfterDestroyed) {
            onClear();
        }
    }

    public final void setArgs(Object[] objArr) {
        this.args = objArr;
    }
}
