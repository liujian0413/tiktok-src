package com.p280ss.ttuploader;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.UploadEventManager */
public enum UploadEventManager {
    instance;
    
    private JSONArray mImageJsonArray;
    private JSONArray mVideoJsonArray;

    public final JSONArray popAllEvents() {
        JSONArray jSONArray = this.mVideoJsonArray;
        synchronized (UploadEventManager.class) {
            this.mVideoJsonArray = new JSONArray();
        }
        return jSONArray;
    }

    public final JSONArray popAllImageEvents() {
        JSONArray jSONArray = this.mImageJsonArray;
        synchronized (UploadEventManager.class) {
            this.mImageJsonArray = new JSONArray();
        }
        return jSONArray;
    }

    /* access modifiers changed from: protected */
    public final void addEvent(JSONObject jSONObject) {
        synchronized (UploadEventManager.class) {
            this.mVideoJsonArray.put(jSONObject);
        }
    }

    /* access modifiers changed from: protected */
    public final void addImageEvent(JSONObject jSONObject) {
        synchronized (UploadEventManager.class) {
            this.mImageJsonArray.put(jSONObject);
        }
    }
}
