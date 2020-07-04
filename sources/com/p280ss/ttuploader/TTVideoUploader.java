package com.p280ss.ttuploader;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.ttuploader.net.TTUploadDNSParser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTVideoUploader */
public class TTVideoUploader implements Callback {
    private static boolean IsErrored = true;
    int currentType;
    int headerIndex;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private String[] mHeaders;
    private Lock mHeadersLock = new ReentrantLock();
    private boolean mIsTestSpeed;
    private TTVideoUploaderListener mListener = null;
    private final ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mSartTime;
    private int mState = -1;
    private final WriteLock mWriteLock;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.ttuploader.TTVideoUploader$Type */
    public @interface Type {
    }

    /* renamed from: com.ss.ttuploader.TTVideoUploader$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private static native void _cancelUpload(long j);

    private static native String _close(long j, int i);

    private final native long _create(int i);

    private static native long _getLongValue(long j, int i);

    private static native String _getStringValue(long j, int i);

    private static native void _mergeUpload(long j);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setObject(long j, int i, Object obj);

    private static native void _setPoster(long j, float f);

    private static native void _setStringValue(long j, int i, String str);

    private static native void _start(long j);

    private static native String _stop(long j);

    public static boolean isError() {
        return IsErrored;
    }

    public void close() {
        close(0);
    }

    public String getDNSIP() {
        return TTUploadUtil.getDNSServerIP();
    }

    static {
        try {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttopenssl");
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ttvideouploader");
        } catch (Throwable unused) {
        }
    }

    public void allowMergeUpload() {
        if (this.mHandle != 0) {
            _mergeUpload(this.mHandle);
        }
    }

    public void cancelUpload() {
        this.mWriteLock.lock();
        if (this.mHandle != 0) {
            _cancelUpload(this.mHandle);
            this.mWriteLock.unlock();
        }
    }

    public void start() {
        this.mReadLock.lock();
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mSartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
        } finally {
            this.mReadLock.unlock();
        }
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                addLogToManager(_stop(this.mHandle));
                this.mState = 4;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public TTVideoUploader() throws Exception {
        try {
            this.mHandle = _create(0);
        } catch (Throwable unused) {
            this.mHandle = 0;
        }
        if (this.mHandle != 0) {
            if (Looper.myLooper() != null) {
                this.mHandler = new Handler(this);
            } else {
                this.mHandler = new Handler(Looper.getMainLooper(), this);
            }
            this.mReadLock = this.mReadWritedLock.readLock();
            this.mWriteLock = this.mReadWritedLock.writeLock();
            getDNSIP();
            this.mState = 0;
            this.mIsTestSpeed = false;
            this.mHeaders = new String[20];
            for (int i = 0; i < 20; i++) {
                this.mHeaders[i] = null;
            }
            this.headerIndex = 0;
            return;
        }
        throw new Exception("create native uploader fail");
    }

    public void setCurrentType(int i) {
        this.currentType = i;
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(TTVideoUploaderListener tTVideoUploaderListener) {
        this.mListener = tTVideoUploaderListener;
    }

    public void setFileUploadDomain(String str) {
        setStringValue(2, str);
    }

    public void setPathName(String str) {
        setStringValue(0, str);
    }

    public void setUploadCookie(String str) {
        setStringValue(4, str);
    }

    public void setUserKey(String str) {
        setStringValue(1, str);
    }

    public void setVideoUploadDomain(String str) {
        setStringValue(3, str);
    }

    public String getStringFromExtern(int i) {
        if (this.mListener != null) {
            return this.mListener.getStringFromExtern(i);
        }
        return null;
    }

    public void setTestSpeed(boolean z) {
        if (this.mHandle != 0) {
            this.mIsTestSpeed = z;
        }
    }

    private void setDeviceID(long j) {
        if (this.mHandle != 0 && j > 0) {
            _setInt64Value(this.mHandle, 66, j);
        }
    }

    private void setTraceId(String str) {
        if (this.mHandle != 0 && str != null && !str.isEmpty()) {
            _setStringValue(this.mHandle, 69, str);
        }
    }

    public boolean handleMessage(Message message) {
        long j;
        int i = message.what;
        if (this.mListener == null) {
            return true;
        }
        TTVideoInfo tTVideoInfo = (TTVideoInfo) message.obj;
        if (tTVideoInfo != null) {
            j = tTVideoInfo.mProgress;
        } else {
            j = 0;
        }
        this.mListener.onNotify(i, j, tTVideoInfo);
        return true;
    }

    public void setAliveMaxFailTime(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 22, i);
        }
    }

    public void setAuthorization(String str) {
        if (this.mHandle != 0 && str != null) {
            _setStringValue(this.mHandle, 15, str);
        }
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = TTUploadUtil.mapToString(treeMap);
            if (mapToString != null) {
                setStringValue(56, mapToString);
            }
        }
    }

    public void setEnableExternDNS(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 21, i);
        }
    }

    public void setEnableExternNet(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 26, i);
        }
    }

    public void setEnableFiletryHttps(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 25, i);
        }
    }

    public void setEnableHttps(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 19, i);
        }
    }

    public void setEnableKeepAlive(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 20, i);
        }
    }

    public void setEnableLogCallBack(boolean z) {
        if (this.mHandle != 0) {
            if (z) {
                _setIntValue(this.mHandle, 78, 1);
            } else {
                _setIntValue(this.mHandle, 78, 0);
            }
        }
    }

    public void setEnableMutiTask(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 29, i);
        }
    }

    public void setEnablePostMethod(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 23, i);
        }
    }

    public void setEnableQuic(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 28, i);
        }
    }

    public void setEnableServerHost(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 17, i);
        }
    }

    public void setEnableUpHost(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 18, i);
        }
    }

    public void setEvStateEnable(boolean z) {
        if (this.mHandle != 0) {
            _setIntValue(this.mHandle, 79, z ? 1 : 0);
        }
    }

    public void setExternFileReader(TTExternFileReader tTExternFileReader) {
        if (this.mHandle != 0 && tTExternFileReader != null) {
            _setObject(this.mHandle, C34943c.f91127w, tTExternFileReader);
        }
    }

    public void setExternMinSIze(int i) {
        if (this.mHandle != 0 && i > 0) {
            _setIntValue(this.mHandle, 77, i);
        }
    }

    public void setExternNetInfo(String str) {
        if (this.mHandle != 0 && str != null) {
            _setStringValue(this.mHandle, 41, str);
        }
    }

    public void setFileRetryCount(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 6, i);
        }
    }

    public void setMaxFailTime(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 13, i);
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader) {
        if (this.mHandle != 0 && tTMediaDataReader != null) {
            _setObject(this.mHandle, 201, tTMediaDataReader);
        }
    }

    public void setNewHttpProxyLoader(int i) {
        if (this.mHandle != 0 && (i == 0 || i == 1)) {
            _setIntValue(this.mHandle, 40, i);
        }
    }

    public void setOpenBoe(boolean z) {
        if (this.mHandle != 0) {
            if (z) {
                _setIntValue(this.mHandle, 67, 1);
            } else {
                _setIntValue(this.mHandle, 67, 0);
            }
        }
    }

    public void setOpenResume(boolean z) {
        if (this.mHandle != 0) {
            if (z) {
                _setIntValue(this.mHandle, 70, 1);
            } else {
                _setIntValue(this.mHandle, 70, 0);
            }
        }
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            String mapToString = TTUploadUtil.mapToString(treeMap);
            if (!TextUtils.isEmpty(mapToString)) {
                setStringValue(55, mapToString);
            }
        }
    }

    public void setPoster(float f) {
        if (this.mHandle != 0 && f >= 0.0f) {
            _setPoster(this.mHandle, f);
        }
    }

    public void setPreUploadEncryptionMode(int i) {
        if (this.mHandle != 0) {
            _setIntValue(this.mHandle, 74, i);
        }
    }

    public void setResponeTimeOut(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 76, i);
        }
    }

    public void setServerParameter(String str) {
        if (this.mHandle != 0 && str != null) {
            _setStringValue(this.mHandle, 16, str);
        }
    }

    public void setSliceReTryCount(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 5, i);
        }
    }

    public void setSliceSize(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 8, i);
        }
    }

    public void setSliceTimeout(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 7, i);
        }
    }

    public void setSocketNum(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 9, i);
        }
    }

    public void setTTExternLoader(TTExternNetLoader tTExternNetLoader) {
        if (this.mHandle != 0 && tTExternNetLoader != null) {
            _setObject(this.mHandle, 27, tTExternNetLoader);
        }
    }

    public void setTcpOpenTimeOutMilliSec(int i) {
        if (this.mHandle != 0 && i >= 0) {
            _setIntValue(this.mHandle, 24, i);
        }
    }

    public void setTranTimeOutUnit(int i) {
        if (this.mHandle != 0 && i > 0) {
            _setIntValue(this.mHandle, 64, i);
        }
    }

    public void setUserRefrence(String str) {
        if (this.mHandle != 0 && str != null) {
            _setStringValue(this.mHandle, 62, str);
        }
    }

    public void setVideoObjectType(String str) {
        if (this.mHandle != 0 && str != null && !str.equals("")) {
            setStringValue(54, str);
        }
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        if (this.mHandle != 0 && treeMap != null) {
            JSONObject mapToJSON = TTUploadUtil.mapToJSON(treeMap);
            if (mapToJSON != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("custom_config", mapToJSON);
                    String jSONObject2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        setStringValue(63, jSONObject2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public JSONObject addLogToManager(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", TTUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", TTUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", TTUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", TTUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", TTUploadDNSParser.mGlobalDefaultExpiredTime);
            String str2 = "";
            this.mHeadersLock.lock();
            for (int i = 0; i < 20; i++) {
                if (!TextUtils.isEmpty(this.mHeaders[i])) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("#");
                    sb.append(this.mHeaders[i]);
                    str2 = sb.toString();
                }
            }
            this.mHeadersLock.unlock();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("cdn_headers", str2);
            }
        } catch (Exception unused) {
            jSONObject = null;
        } catch (Throwable th) {
            this.mHeadersLock.unlock();
            throw th;
        }
        if (!this.mIsTestSpeed) {
            UploadEventManager.instance.addEvent(jSONObject);
        }
        return jSONObject;
    }

    public void close(int i) {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                String _close = _close(this.mHandle, i);
                if (i != 0) {
                    addLogToManager(_close);
                }
                this.mHandle = 0;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        if (map.get(Integer.valueOf(69)) == null || !(map.get(Integer.valueOf(69)) instanceof String)) {
            if (map.get(Integer.valueOf(66)) != null && (map.get(Integer.valueOf(66)) instanceof Long)) {
                long longValue = ((Long) map.get(Integer.valueOf(66))).longValue();
                if (longValue > 0) {
                    setDeviceID(longValue);
                }
            }
            return;
        }
        String str = (String) map.get(Integer.valueOf(69));
        if (str != null && !str.isEmpty()) {
            setTraceId(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TTVideoUploader(int r6) throws java.lang.Exception {
        /*
            r5 = this;
            r5.<init>()
            r0 = -1
            r5.mState = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r5.mReadWritedLock = r0
            r0 = 0
            r5.mListener = r0
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r5.mHeadersLock = r1
            r5.setCurrentType(r6)
            r1 = 0
            if (r6 == 0) goto L_0x0024
            r3 = 1
            if (r6 == r3) goto L_0x0024
            r3 = 3
            if (r6 != r3) goto L_0x002b
        L_0x0024:
            long r3 = r5._create(r6)     // Catch:{ Throwable -> 0x002b }
            r5.mHandle = r3     // Catch:{ Throwable -> 0x002b }
            goto L_0x002d
        L_0x002b:
            r5.mHandle = r1
        L_0x002d:
            long r3 = r5.mHandle
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L_0x0077
            android.os.Looper r6 = android.os.Looper.myLooper()
            if (r6 == 0) goto L_0x0041
            android.os.Handler r6 = new android.os.Handler
            r6.<init>(r5)
            r5.mHandler = r6
            goto L_0x004c
        L_0x0041:
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r6.<init>(r1, r5)
            r5.mHandler = r6
        L_0x004c:
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r5.mReadWritedLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r6.readLock()
            r5.mReadLock = r6
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r5.mReadWritedLock
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r5.mWriteLock = r6
            r6 = 0
            r5.mState = r6
            r5.mIsTestSpeed = r6
            r5.getDNSIP()
            r1 = 20
            java.lang.String[] r2 = new java.lang.String[r1]
            r5.mHeaders = r2
            r2 = 0
        L_0x006b:
            if (r2 >= r1) goto L_0x0074
            java.lang.String[] r3 = r5.mHeaders
            r3[r2] = r0
            int r2 = r2 + 1
            goto L_0x006b
        L_0x0074:
            r5.headerIndex = r6
            return
        L_0x0077:
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r0 = "create native uploader fail"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttuploader.TTVideoUploader.<init>(int):void");
    }

    public int checkNet(int i, int i2) {
        if (this.mListener == null) {
            return 1;
        }
        return this.mListener.videoUploadCheckNetState(i, i2);
    }

    public void setStringValue(int i, String str) {
        if (this.mHandle != 0 && str != null) {
            _setStringValue(this.mHandle, i, str);
        }
    }

    public void onLogInfo(int i, int i2, String str) {
        if (this.mListener != null) {
            if (i != 102 || TextUtils.isEmpty(str)) {
                this.mListener.onLog(i, i2, str);
            } else {
                try {
                    this.mHeadersLock.lock();
                    if (this.headerIndex >= 20) {
                        this.headerIndex = 0;
                    }
                    this.mHeaders[this.headerIndex] = str;
                    this.headerIndex++;
                } finally {
                    this.mHeadersLock.unlock();
                }
            }
        }
    }

    public void onNotify(int i, long j, int i2) {
        int i3 = i;
        if (this.mState == 1) {
            TTVideoInfo tTVideoInfo = null;
            switch (i3) {
                case 0:
                    this.mEndTime = System.currentTimeMillis();
                    String _getStringValue = _getStringValue(this.mHandle, 10);
                    String _getStringValue2 = _getStringValue(this.mHandle, 11);
                    String _getStringValue3 = _getStringValue(this.mHandle, 12);
                    String _getStringValue4 = _getStringValue(this.mHandle, C34943c.f91128x);
                    String _getStringValue5 = _getStringValue(this.mHandle, 51);
                    String _getStringValue6 = _getStringValue(this.mHandle, 50);
                    String _getStringValue7 = _getStringValue(this.mHandle, 52);
                    String _getStringValue8 = _getStringValue(this.mHandle, 53);
                    String _getStringValue9 = _getStringValue(this.mHandle, 57);
                    String _getStringValue10 = _getStringValue(this.mHandle, 58);
                    String _getStringValue11 = _getStringValue(this.mHandle, 59);
                    String _getStringValue12 = _getStringValue(this.mHandle, 68);
                    if (this.currentType == 1) {
                        tTVideoInfo = new TTVideoInfo(_getStringValue5, _getStringValue6, _getStringValue7, _getStringValue8, j, _getStringValue9, _getStringValue10, _getStringValue11);
                    } else {
                        tTVideoInfo = new TTVideoInfo(_getStringValue, _getStringValue2, _getStringValue3, j, _getStringValue4, _getStringValue12);
                    }
                    String dnsip = getDNSIP();
                    if (dnsip != null && !dnsip.isEmpty()) {
                        setStringValue(75, dnsip);
                    }
                    tTVideoInfo.mLog = addLogToManager(_getStringValue(this.mHandle, 100));
                    this.mState = 3;
                    break;
                case 1:
                    tTVideoInfo = new TTVideoInfo(null, null, null, j, null, null);
                    break;
                case 2:
                    String dnsip2 = getDNSIP();
                    if (dnsip2 != null && !dnsip2.isEmpty()) {
                        setStringValue(75, dnsip2);
                    }
                    String _getStringValue13 = _getStringValue(this.mHandle, 100);
                    TTVideoInfo tTVideoInfo2 = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
                    addLogToManager(_getStringValue13);
                    this.mState = 2;
                    tTVideoInfo = tTVideoInfo2;
                    break;
                case 3:
                    addLogToManager(_getStringValue(this.mHandle, 100));
                    tTVideoInfo = new TTVideoInfo(null, null, null, j, _getStringValue(this.mHandle, 14), null);
                    break;
            }
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = i3;
            obtainMessage.obj = tTVideoInfo;
            obtainMessage.sendToTarget();
        }
    }
}
