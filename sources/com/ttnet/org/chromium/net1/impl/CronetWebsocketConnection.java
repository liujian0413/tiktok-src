package com.ttnet.org.chromium.net1.impl;

import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import com.ttnet.org.chromium.base1.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net1.TTWebsocketConnection;
import com.ttnet.org.chromium.net1.TTWebsocketConnection.Callback;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

@JNINamespace("cronet")
public final class CronetWebsocketConnection extends TTWebsocketConnection {
    public static final String TAG = "CronetWebsocketConnection";
    private int mAppId;
    private String mAppKey;
    private String mAppToken;
    private int mAppVersion;
    public final Callback mCallback;
    private long mDeviceId;
    private final Executor mExecutor;
    private int mFpid;
    private Map<String, String> mHeaders;
    private long mInstallId;
    private Map<String, String> mParams;
    private final CronetUrlRequestContext mRequestContext;
    private String mSessionId;
    private boolean mSharedConnection;
    private AtomicInteger mState = new AtomicInteger(-1);
    private List<String> mUrlList;
    private boolean mUseFrontier = true;
    private long mWebsocketAdapter;
    private final Object mWebsocketAdapterLock = new Object();

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeAddGetParam(long j, String str, String str2);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeAddHeader(long j, String str, String str2);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeAddUrl(long j, String str);

    private native long nativeCreateWebsocketConnectionAdapter(long j);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeDestroy(long j);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeSendBinary(long j, ByteBuffer byteBuffer);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeStartWithFrontier(long j, int i, String str, long j2, int i2, long j3, String str2, int i3, String str3, boolean z);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeStartWithWSChannel(long j, boolean z);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeStop(long j);

    public final boolean isConnected() {
        if (this.mState.get() == 4) {
            return true;
        }
        return false;
    }

    public final void destroyConnection() {
        synchronized (this.mWebsocketAdapterLock) {
            if (this.mWebsocketAdapter != 0) {
                nativeDestroy(this.mWebsocketAdapter);
                this.mWebsocketAdapter = 0;
            }
        }
    }

    public final void stopConnection() {
        synchronized (this.mWebsocketAdapterLock) {
            if (this.mWebsocketAdapter != 0) {
                nativeStop(this.mWebsocketAdapter);
            }
        }
    }

    public final void startConnection() {
        Object obj;
        Object obj2 = this.mWebsocketAdapterLock;
        synchronized (obj2) {
            try {
                if (this.mWebsocketAdapter == 0) {
                    this.mWebsocketAdapter = nativeCreateWebsocketConnectionAdapter(this.mRequestContext.getUrlRequestContextAdapter());
                }
                for (String nativeAddUrl : this.mUrlList) {
                    nativeAddUrl(this.mWebsocketAdapter, nativeAddUrl);
                }
                if (this.mParams != null) {
                    for (Entry entry : this.mParams.entrySet()) {
                        nativeAddGetParam(this.mWebsocketAdapter, (String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.mHeaders != null) {
                    for (Entry entry2 : this.mHeaders.entrySet()) {
                        nativeAddHeader(this.mWebsocketAdapter, (String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (this.mUseFrontier) {
                    obj = obj2;
                    nativeStartWithFrontier(this.mWebsocketAdapter, this.mAppId, this.mAppKey, this.mDeviceId, this.mFpid, this.mInstallId, this.mSessionId, this.mAppVersion, this.mAppToken, this.mSharedConnection);
                } else {
                    obj = obj2;
                    nativeStartWithWSChannel(this.mWebsocketAdapter, this.mSharedConnection);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    private void onFeedbackLog(final String str) {
        Log.m22893v(TAG, "OnFeedbackLog");
        postTaskToExecutor(new Runnable() {
            public void run() {
                try {
                    CronetWebsocketConnection.this.mCallback.onFeedbackLog(CronetWebsocketConnection.this, str);
                } catch (Exception e) {
                    Log.m22891e(CronetWebsocketConnection.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    private ByteBuffer clone(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    private void onMessageReceived(ByteBuffer byteBuffer) {
        Log.m22893v(TAG, "onMessageReceived");
        final ByteBuffer clone = clone(byteBuffer);
        postTaskToExecutor(new Runnable() {
            public void run() {
                try {
                    CronetWebsocketConnection.this.mCallback.onMessageReceived(CronetWebsocketConnection.this, clone);
                } catch (Exception e) {
                    Log.m22891e(CronetWebsocketConnection.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m22891e(TAG, "Exception posting task to executor", e);
        }
    }

    public final void asyncSendBinary(ByteBuffer byteBuffer) {
        synchronized (this.mWebsocketAdapterLock) {
            if (this.mWebsocketAdapter != 0) {
                nativeSendBinary(this.mWebsocketAdapter, byteBuffer);
            }
        }
    }

    private void onConnectionStateChanged(final int i, final String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onConnectionStateChanged: state = ");
        sb.append(i);
        sb.append(", url = ");
        sb.append(str);
        Log.m22893v(str2, sb.toString());
        this.mState.set(i);
        postTaskToExecutor(new Runnable() {
            public void run() {
                try {
                    CronetWebsocketConnection.this.mCallback.onConnectionStateChanged(CronetWebsocketConnection.this, i, str);
                } catch (Exception e) {
                    Log.m22891e(CronetWebsocketConnection.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    private void onConnectionError(final int i, final String str, final String str2) {
        String str3 = TAG;
        StringBuilder sb = new StringBuilder("onConnectionError: ");
        sb.append(str2);
        Log.m22891e(str3, sb.toString(), new Object[0]);
        this.mState.set(i);
        postTaskToExecutor(new Runnable() {
            public void run() {
                try {
                    CronetWebsocketConnection.this.mCallback.onConnectionError(CronetWebsocketConnection.this, i, str, str2);
                } catch (Exception e) {
                    Log.m22891e(CronetWebsocketConnection.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, Callback callback, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mCallback = callback;
        this.mExecutor = executor;
        this.mUrlList = list;
        this.mParams = map;
        this.mHeaders = map2;
        this.mSharedConnection = z;
        this.mUseFrontier = false;
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, Callback callback, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mCallback = callback;
        this.mExecutor = executor;
        this.mUrlList = list;
        this.mAppId = i;
        this.mAppKey = str;
        this.mDeviceId = j;
        this.mFpid = i2;
        this.mInstallId = j2;
        this.mSessionId = str2;
        this.mAppVersion = i3;
        this.mAppToken = str3;
        this.mParams = map;
        this.mHeaders = map2;
        this.mSharedConnection = z;
    }
}
