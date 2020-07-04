package com.ttnet.org.chromium.net1.impl;

import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import com.ttnet.org.chromium.base1.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net1.CronetException;
import com.ttnet.org.chromium.net1.InlineExecutionProhibitedException;
import com.ttnet.org.chromium.net1.RequestFinishedInfo;
import com.ttnet.org.chromium.net1.RequestFinishedInfo.Metrics;
import com.ttnet.org.chromium.net1.UploadDataProvider;
import com.ttnet.org.chromium.net1.UrlRequest.Callback;
import com.ttnet.org.chromium.net1.UrlRequest.StatusListener;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.UrlRequestCallback;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.UrlRequestStatusListener;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@JNINamespace("cronet")
public final class CronetUrlRequest extends UrlRequestBase {
    private final boolean mAllowDirectExecutor;
    public final UrlRequestCallback mCallback;
    private String mCronetMapKey = null;
    private final boolean mDisableCache;
    private final boolean mDisableConnectionMigration;
    private CronetException mException;
    private final Executor mExecutor;
    private int mFinishedReason;
    private String mInitialMethod;
    private final String mInitialUrl;
    private Metrics mMetrics;
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private final int mPriority;
    private long mReceivedByteCountFromRedirects;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    private int mRequestFlag;
    private final HeadersList mRequestHeaders = new HeadersList();
    private String mRequestLog;
    private int mRequestTimeout = 0;
    public UrlResponseInfoImpl mResponseInfo;
    private int mSocketConnectTimeout = 0;
    private int mSocketReadTimeout = 0;
    private int mSocketWriteTimeout = 0;
    private boolean mStarted;
    public CronetUploadDataStream mUploadDataStream;
    private final List<String> mUrlChain = new ArrayList();
    public long mUrlRequestAdapter;
    public final Object mUrlRequestAdapterLock = new Object();
    public boolean mWaitingOnRead;
    public boolean mWaitingOnRedirect;

    static final class HeadersList extends ArrayList<Entry<String, String>> {
        private HeadersList() {
        }
    }

    final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;

        public final void run() {
            CronetUrlRequest.this.checkCallingThread();
            ByteBuffer byteBuffer = this.mByteBuffer;
            this.mByteBuffer = null;
            try {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (!CronetUrlRequest.this.isDoneLocked()) {
                        CronetUrlRequest.this.mWaitingOnRead = true;
                        CronetUrlRequest.this.mCallback.onReadCompleted(CronetUrlRequest.this, CronetUrlRequest.this.mResponseInfo, byteBuffer);
                    }
                }
            } catch (Exception e) {
                CronetUrlRequest.this.onCallbackException(e);
            }
        }

        private OnReadCompletedRunnable() {
        }
    }

    private static int convertRequestPriority(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 4;
        }
    }

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeAbortWhenUploadException(long j);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native boolean nativeAddRequestHeader(long j, String str, String str2);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeAppTimeout(long j);

    private native long nativeCreateRequestAdapter(long j, String str, int i, boolean z, boolean z2, boolean z3);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeDestroy(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeFollowDeferredRedirect(long j);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native String nativeGetRequestLog(long j);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeGetStatus(long j, UrlRequestStatusListener urlRequestStatusListener);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeReportMetrics(long j);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native boolean nativeSetHttpMethod(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeSetRequestFlag(long j, int i);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeSetRequestTimeout(long j, int i);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeSetSocketTimeout(long j, int i, int i2, int i3);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeStart(long j);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeStopRedirect(long j);

    public final String getRequestLog() {
        return this.mRequestLog;
    }

    public final void startInternalLocked() {
        nativeStart(this.mUrlRequestAdapter);
    }

    public final long getUrlRequestAdapterForTesting() {
        long j;
        synchronized (this.mUrlRequestAdapterLock) {
            j = this.mUrlRequestAdapter;
        }
        return j;
    }

    public final boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mUrlRequestAdapterLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    public final boolean isDoneLocked() {
        if (!this.mStarted || this.mUrlRequestAdapter != 0) {
            return false;
        }
        return true;
    }

    private void checkNotStarted() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mStarted || isDoneLocked()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    private RequestFinishedInfo getRequestFinishedInfo() {
        RequestFinishedInfoImpl requestFinishedInfoImpl = new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, this.mMetrics, this.mFinishedReason, this.mResponseInfo, this.mException);
        return requestFinishedInfoImpl;
    }

    private void onCanceled() {
        this.mFinishedReason = 2;
        CronetUrlRequestMapping.RemoveRequest(this.mCronetMapKey);
        postTaskToExecutor(new Runnable() {
            public void run() {
                try {
                    CronetUrlRequest.this.mCallback.onCanceled(CronetUrlRequest.this, CronetUrlRequest.this.mResponseInfo);
                } catch (Exception e) {
                    Log.m22891e(CronetUrlRequestContext.LOG_TAG, "Exception in onCanceled method", e);
                }
            }
        });
    }

    public final void appTimeout() {
        CronetUrlRequestMapping.RemoveRequest(this.mCronetMapKey);
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mUrlRequestAdapter != 0) {
                nativeAppTimeout(this.mUrlRequestAdapter);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mUrlRequestAdapterLock
            monitor-enter(r0)
            boolean r1 = r2.isDoneLocked()     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0014
            boolean r1 = r2.mStarted     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            r1 = 1
            r2.destroyRequestAdapter(r1)     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net1.impl.CronetUrlRequest.cancel():void");
    }

    /* access modifiers changed from: 0000 */
    public final void checkCallingThread() {
        if (!this.mAllowDirectExecutor && this.mRequestContext.isNetworkThread(Thread.currentThread())) {
            throw new InlineExecutionProhibitedException();
        }
    }

    public final void stopRedirect() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mUrlRequestAdapter != 0) {
                nativeStopRedirect(this.mUrlRequestAdapter);
            }
        }
    }

    public final void followRedirect() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mWaitingOnRedirect) {
                this.mWaitingOnRedirect = false;
                if (!isDoneLocked()) {
                    nativeFollowDeferredRedirect(this.mUrlRequestAdapter);
                    return;
                }
                return;
            }
            throw new IllegalStateException("No redirect to follow.");
        }
    }

    public final void start() {
        synchronized (this.mUrlRequestAdapterLock) {
            checkNotStarted();
            try {
                this.mUrlRequestAdapter = nativeCreateRequestAdapter(this.mRequestContext.getUrlRequestContextAdapter(), this.mInitialUrl, this.mPriority, this.mDisableCache, this.mDisableConnectionMigration, this.mRequestContext.hasRequestFinishedListener());
                this.mRequestContext.onRequestStarted();
                if (this.mInitialMethod != null) {
                    if (!nativeSetHttpMethod(this.mUrlRequestAdapter, this.mInitialMethod)) {
                        StringBuilder sb = new StringBuilder("Invalid http method ");
                        sb.append(this.mInitialMethod);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (this.mRequestFlag != 0) {
                    nativeSetRequestFlag(this.mUrlRequestAdapter, this.mRequestFlag);
                }
                Iterator it = this.mRequestHeaders.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (((String) entry.getKey()).equalsIgnoreCase("Content-Type") && !((String) entry.getValue()).isEmpty()) {
                        z = true;
                    }
                    if (((String) entry.getKey()).equalsIgnoreCase("Tt-Map-Key") && !((String) entry.getValue()).isEmpty()) {
                        this.mCronetMapKey = (String) entry.getValue();
                    }
                    if (!nativeAddRequestHeader(this.mUrlRequestAdapter, (String) entry.getKey(), (String) entry.getValue())) {
                        StringBuilder sb2 = new StringBuilder("Invalid header ");
                        sb2.append((String) entry.getKey());
                        sb2.append("=");
                        sb2.append((String) entry.getValue());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                nativeSetSocketTimeout(this.mUrlRequestAdapter, this.mSocketConnectTimeout, this.mSocketReadTimeout, this.mSocketWriteTimeout);
                nativeSetRequestTimeout(this.mUrlRequestAdapter, this.mRequestTimeout);
                if (this.mUploadDataStream == null) {
                    if (this.mCronetMapKey != null) {
                        CronetUrlRequestMapping.AddRequest(this.mCronetMapKey, this);
                    }
                    this.mStarted = true;
                    startInternalLocked();
                } else if (z) {
                    this.mStarted = true;
                    this.mUploadDataStream.postTaskToExecutor(new Runnable() {
                        public void run() {
                            CronetUrlRequest.this.mUploadDataStream.initializeWithRequest(CronetUrlRequest.this);
                            synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                                if (!CronetUrlRequest.this.isDoneLocked()) {
                                    CronetUrlRequest.this.mUploadDataStream.attachNativeAdapterToRequest(CronetUrlRequest.this.mUrlRequestAdapter);
                                    CronetUrlRequest.this.startInternalLocked();
                                }
                            }
                        }
                    });
                } else {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
            } catch (RuntimeException e) {
                destroyRequestAdapter(false);
                throw e;
            }
        }
    }

    public final void setOnDestroyedCallbackForTesting(Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    public final void setRequestFlag(int i) {
        this.mRequestFlag = i;
    }

    public final void setRequestTimeout(int i) {
        this.mRequestTimeout = i;
    }

    public final void setSocketConnectTimeout(int i) {
        this.mSocketConnectTimeout = i;
    }

    public final void setSocketReadTimeout(int i) {
        this.mSocketReadTimeout = i;
    }

    public final void setSocketWriteTimeout(int i) {
        this.mSocketWriteTimeout = i;
    }

    private void destroyRequestAdapter(boolean z) {
        destroyRequestAdapter(z, false);
    }

    private void failWithException(CronetException cronetException) {
        failWithException(cronetException, false);
    }

    public final void setOnDestroyedUploadCallbackForTesting(Runnable runnable) {
        this.mUploadDataStream.setOnDestroyedCallbackForTesting(runnable);
    }

    public final void setHttpMethod(String str) {
        checkNotStarted();
        if (str != null) {
            this.mInitialMethod = str;
            return;
        }
        throw new NullPointerException("Method is required.");
    }

    private void onSucceeded(long j) {
        this.mFinishedReason = 0;
        CronetUrlRequestMapping.RemoveRequest(this.mCronetMapKey);
        this.mResponseInfo.setReceivedByteCount(this.mReceivedByteCountFromRedirects + j);
        postTaskToExecutor(new Runnable() {
            public void run() {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (!CronetUrlRequest.this.isDoneLocked()) {
                        CronetUrlRequest.this.destroyRequestAdapter(false, true);
                        try {
                            CronetUrlRequest.this.mCallback.onSucceeded(CronetUrlRequest.this, CronetUrlRequest.this.mResponseInfo);
                        } catch (Exception e) {
                            Log.m22891e(CronetUrlRequestContext.LOG_TAG, "Exception in onComplete method", e);
                        }
                    }
                }
            }
        });
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m22891e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
            failWithException(new CronetExceptionImpl("Exception posting task to executor", e));
        }
    }

    public final void onCallbackException(Exception exc) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UrlRequest.Callback", exc);
        Log.m22891e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", exc);
        failWithException(callbackExceptionImpl);
    }

    public final void getStatus(StatusListener statusListener) {
        final UrlRequestStatusListener urlRequestStatusListener = new UrlRequestStatusListener(statusListener);
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mUrlRequestAdapter != 0) {
                nativeGetStatus(this.mUrlRequestAdapter, urlRequestStatusListener);
            } else {
                postTaskToExecutor(new Runnable() {
                    public void run() {
                        urlRequestStatusListener.onStatus(-1);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void onUploadException(Throwable th) {
        new CallbackExceptionImpl("Exception received from UploadDataProvider", th);
        Log.m22891e(CronetUrlRequestContext.LOG_TAG, "Exception in upload method", th);
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mUrlRequestAdapter != 0) {
                nativeAbortWhenUploadException(this.mUrlRequestAdapter);
            }
        }
    }

    private int mapUrlRequestErrorToApiErrorCode(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                String str = CronetUrlRequestContext.LOG_TAG;
                StringBuilder sb = new StringBuilder("Unknown error code: ");
                sb.append(i);
                Log.m22891e(str, sb.toString(), new Object[0]);
                return i;
        }
    }

    public final void read(ByteBuffer byteBuffer) {
        Preconditions.checkHasRemaining(byteBuffer);
        Preconditions.checkDirect(byteBuffer);
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mWaitingOnRead) {
                this.mWaitingOnRead = false;
                if (!isDoneLocked()) {
                    if (!nativeReadData(this.mUrlRequestAdapter, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                        this.mWaitingOnRead = true;
                        throw new IllegalArgumentException("Unable to call native read");
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unexpected read attempt.");
        }
    }

    private void onStatus(final UrlRequestStatusListener urlRequestStatusListener, final int i) {
        postTaskToExecutor(new Runnable() {
            public void run() {
                urlRequestStatusListener.onStatus(UrlRequestBase.convertLoadState(i));
            }
        });
    }

    public final void setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider != null) {
            if (this.mInitialMethod == null) {
                this.mInitialMethod = "POST";
            }
            this.mUploadDataStream = new CronetUploadDataStream(uploadDataProvider, executor);
            return;
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    private void failWithException(final CronetException cronetException, boolean z) {
        this.mException = cronetException;
        synchronized (this.mUrlRequestAdapterLock) {
            if (!isDoneLocked()) {
                destroyRequestAdapter(false, z);
                try {
                    this.mExecutor.execute(new Runnable() {
                        public void run() {
                            try {
                                CronetUrlRequest.this.mCallback.onFailed(CronetUrlRequest.this, CronetUrlRequest.this.mResponseInfo, cronetException);
                            } catch (Exception e) {
                                Log.m22891e(CronetUrlRequestContext.LOG_TAG, "Exception in onFailed method", e);
                            }
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Log.m22891e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
                }
            }
        }
    }

    public final void addHeader(String str, String str2) {
        checkNotStarted();
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 != null) {
            this.mRequestHeaders.add(new SimpleImmutableEntry(str, str2));
        } else {
            throw new NullPointerException("Invalid header value.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void destroyRequestAdapter(boolean r7, boolean r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mUrlRequestAdapterLock
            monitor-enter(r0)
            long r1 = r6.mUrlRequestAdapter     // Catch:{ all -> 0x002e }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x000d:
            if (r8 == 0) goto L_0x0017
            long r1 = r6.mUrlRequestAdapter     // Catch:{ all -> 0x002e }
            java.lang.String r8 = r6.nativeGetRequestLog(r1)     // Catch:{ all -> 0x002e }
            r6.mRequestLog = r8     // Catch:{ all -> 0x002e }
        L_0x0017:
            long r1 = r6.mUrlRequestAdapter     // Catch:{ all -> 0x002e }
            r6.nativeDestroy(r1, r7)     // Catch:{ all -> 0x002e }
            com.ttnet.org.chromium.net1.impl.CronetUrlRequestContext r7 = r6.mRequestContext     // Catch:{ all -> 0x002e }
            r7.onRequestDestroyed()     // Catch:{ all -> 0x002e }
            r6.mUrlRequestAdapter = r3     // Catch:{ all -> 0x002e }
            java.lang.Runnable r7 = r6.mOnDestroyedCallbackForTesting     // Catch:{ all -> 0x002e }
            if (r7 == 0) goto L_0x002c
            java.lang.Runnable r7 = r6.mOnDestroyedCallbackForTesting     // Catch:{ all -> 0x002e }
            r7.run()     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net1.impl.CronetUrlRequest.destroyRequestAdapter(boolean, boolean):void");
    }

    private String[] addSecurityFactor(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            hashMap.put(strArr[i2].toLowerCase(Locale.US), strArr[i2 + 1]);
        }
        Map onCallToAddSecurityFactor = this.mRequestContext.onCallToAddSecurityFactor(str, hashMap);
        if (onCallToAddSecurityFactor == null) {
            return null;
        }
        String[] strArr2 = new String[(onCallToAddSecurityFactor.size() * 2)];
        for (Entry entry : onCallToAddSecurityFactor.entrySet()) {
            strArr2[i] = (String) entry.getKey();
            strArr2[i + 1] = (String) entry.getValue();
            i += 2;
        }
        return strArr2;
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.mResponseInfo.setReceivedByteCount(this.mReceivedByteCountFromRedirects + j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.mOnReadCompletedTask == null) {
                this.mOnReadCompletedTask = new OnReadCompletedRunnable();
            }
            byteBuffer.position(i2 + i);
            this.mOnReadCompletedTask.mByteBuffer = byteBuffer;
            postTaskToExecutor(this.mOnReadCompletedTask);
            return;
        }
        failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        this.mFinishedReason = 1;
        CronetUrlRequestMapping.RemoveRequest(this.mCronetMapKey);
        if (this.mResponseInfo != null) {
            this.mResponseInfo.setReceivedByteCount(this.mReceivedByteCountFromRedirects + j);
        }
        if (i == 10) {
            StringBuilder sb = new StringBuilder("Exception in CronetUrlRequest: ");
            sb.append(str);
            failWithException(new QuicExceptionImpl(sb.toString(), i2, i3), true);
            return;
        }
        int mapUrlRequestErrorToApiErrorCode = mapUrlRequestErrorToApiErrorCode(i);
        StringBuilder sb2 = new StringBuilder("Exception in CronetUrlRequest: ");
        sb2.append(str);
        failWithException(new NetworkExceptionImpl(sb2.toString(), mapUrlRequestErrorToApiErrorCode, i2), true);
    }

    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3) {
        this.mResponseInfo = prepareResponseInfoOnNetworkThread(i, str, strArr, z, str2, str3);
        postTaskToExecutor(new Runnable() {
            public void run() {
                CronetUrlRequest.this.checkCallingThread();
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (!CronetUrlRequest.this.isDoneLocked()) {
                        CronetUrlRequest.this.mWaitingOnRead = true;
                        try {
                            CronetUrlRequest.this.mCallback.onResponseStarted(CronetUrlRequest.this, CronetUrlRequest.this.mResponseInfo);
                        } catch (Exception e) {
                            CronetUrlRequest.this.onCallbackException(e);
                        }
                    }
                }
            }
        });
    }

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i, String str, String[] strArr, boolean z, String str2, String str3) {
        HeadersList headersList = new HeadersList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            headersList.add(new SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        UrlResponseInfoImpl urlResponseInfoImpl = new UrlResponseInfoImpl(new ArrayList(this.mUrlChain), i, str, headersList, z, str2, str3);
        return urlResponseInfoImpl;
    }

    private void onRedirectReceived(final String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        String str5 = str;
        final UrlResponseInfoImpl prepareResponseInfoOnNetworkThread = prepareResponseInfoOnNetworkThread(i, str2, strArr, z, str3, str4);
        this.mReceivedByteCountFromRedirects += j;
        prepareResponseInfoOnNetworkThread.setReceivedByteCount(this.mReceivedByteCountFromRedirects);
        this.mUrlChain.add(str);
        postTaskToExecutor(new Runnable() {
            public void run() {
                CronetUrlRequest.this.checkCallingThread();
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (!CronetUrlRequest.this.isDoneLocked()) {
                        CronetUrlRequest.this.mWaitingOnRedirect = true;
                        try {
                            CronetUrlRequest.this.mCallback.onRedirectReceived(CronetUrlRequest.this, prepareResponseInfoOnNetworkThread, str);
                        } catch (Exception e) {
                            CronetUrlRequest.this.onCallbackException(e);
                        }
                    }
                }
            }
        });
    }

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, Callback callback, Executor executor, Collection<Object> collection, boolean z, boolean z2, boolean z3) {
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (callback == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor != null) {
            this.mAllowDirectExecutor = z3;
            this.mRequestContext = cronetUrlRequestContext;
            this.mInitialUrl = str;
            this.mUrlChain.add(str);
            this.mPriority = convertRequestPriority(i);
            this.mCallback = new UrlRequestCallback(callback);
            this.mExecutor = executor;
            this.mRequestAnnotations = collection;
            this.mDisableCache = z;
            this.mDisableConnectionMigration = z2;
            this.mRequestFlag = 0;
        } else {
            throw new NullPointerException("Executor is required");
        }
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16, long j17) {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mMetrics == null) {
                CronetMetrics cronetMetrics = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15, str, j16, j17);
                this.mMetrics = cronetMetrics;
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
        final RequestFinishedInfo requestFinishedInfo = getRequestFinishedInfo();
        postTaskToExecutor(new Runnable() {
            public void run() {
                try {
                    CronetUrlRequest.this.mCallback.onMetricsCollected(CronetUrlRequest.this, requestFinishedInfo);
                } catch (Exception e) {
                    Log.m22891e(CronetUrlRequestContext.LOG_TAG, "Exception in onMetricsCollected method", e);
                }
            }
        });
        this.mRequestContext.reportFinished(requestFinishedInfo);
    }
}
