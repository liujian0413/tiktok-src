package com.p280ss.ttuploader;

import android.text.TextUtils;
import com.bytedance.ttnet.p671c.C12960e;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTUploadExternNetBridge */
public class TTUploadExternNetBridge implements TTExternNetLoaderListener {
    TTExternResponseInfo curResponseInfo = null;
    String extraInfo = null;
    volatile boolean isFinished = false;
    private Lock lock = new ReentrantLock();
    long mHandle = 0;

    private native void nativeTTNetCallback(long j);

    public int isFinished() {
        if (this.isFinished) {
            return 1;
        }
        return 0;
    }

    public Object getExtraInfo() {
        try {
            this.lock.lock();
            return this.extraInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public Object getResponseObject() {
        try {
            this.lock.lock();
            return this.curResponseInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void resetHandle() {
        try {
            this.lock.lock();
            this.mHandle = 0;
        } finally {
            this.lock.unlock();
        }
    }

    public void cancelTask(Object obj) {
        TTExternNetLoader tTExternNetLoader = (TTExternNetLoader) obj;
        if (tTExternNetLoader != null) {
            tTExternNetLoader.cancelTask();
        }
    }

    public void onComplete(TTExternResponseInfo tTExternResponseInfo) {
        try {
            this.lock.lock();
            this.curResponseInfo = tTExternResponseInfo;
            this.isFinished = true;
        } finally {
            nativeTTNetCallback(this.mHandle);
            this.lock.unlock();
        }
    }

    public void onFailed(String str, Throwable th) {
        try {
            this.lock.lock();
            this.isFinished = true;
            if (th != null) {
                this.extraInfo = th.toString();
            }
        } finally {
            nativeTTNetCallback(this.mHandle);
            this.lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public int sendRequest(Object obj, long j, String str, String str2, String str3, byte[] bArr, int i, int i2, int i3) {
        JSONObject jSONObject;
        int i4;
        long j2 = j;
        if (obj == null || j2 == 0 || TextUtils.isEmpty(str)) {
            return -1;
        }
        this.mHandle = j2;
        try {
            jSONObject = new JSONObject(str3);
        } catch (Exception unused) {
            jSONObject = null;
        }
        TTExternNetLoader tTExternNetLoader = (TTExternNetLoader) obj;
        if (jSONObject == null || tTExternNetLoader == null) {
            return -1;
        }
        this.curResponseInfo = null;
        try {
            this.lock.lock();
            this.isFinished = false;
            this.lock.unlock();
            C12960e eVar = new C12960e();
            eVar.f27560i = (long) (i2 + i3);
            eVar.f27561j = true;
            TTExternRequestInfo tTExternRequestInfo = new TTExternRequestInfo(str, str2, jSONObject, bArr, eVar);
            try {
                i4 = tTExternNetLoader.sendRequest(tTExternRequestInfo, this);
            } catch (Throwable unused2) {
                i4 = -2;
            }
            if (i4 < 0) {
                return i4;
            }
            return 0;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }
}
