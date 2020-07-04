package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.InlineExecutionProhibitedException;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.RequestFinishedInfo.Listener;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UrlRequest.Callback;
import com.ttnet.org.chromium.net.UrlRequest.StatusListener;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.RequestFinishedInfoListener;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.UrlRequestCallback;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@JNINamespace("cronet")
public final class CronetUrlRequest extends UrlRequestBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mAllowDirectExecutor;
    public final UrlRequestCallback mCallback;
    private final boolean mDisableCache;
    private final boolean mDisableConnectionMigration;
    private CronetException mException;
    private final Executor mExecutor;
    private int mFinishedReason;
    private String mInitialMethod;
    private final String mInitialUrl;
    private CronetMetrics mMetrics;
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private final int mPriority;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    public final RequestFinishedInfoListener mRequestFinishedListener;
    private int mRequestFlag;
    private final HeadersList mRequestHeaders;
    private String mRequestLog;
    private int mRequestTimeout;
    public UrlResponseInfoImpl mResponseInfo;
    private int mSocketConnectTimeout;
    private int mSocketReadTimeout;
    private int mSocketWriteTimeout;
    private boolean mStarted;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
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

    private native long nativeCreateRequestAdapter(long j, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, int i4);

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
    private native boolean nativeSetHttpMethod(long j, String str);

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

    private void onCanceled() {
        postTaskToExecutor(new Runnable() {
            public void run() {
                try {
                    CronetUrlRequest.this.mCallback.onCanceled(CronetUrlRequest.this, CronetUrlRequest.this.mResponseInfo);
                    CronetUrlRequest.this.maybeReportMetrics();
                } catch (Exception e) {
                    Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception in onCanceled method", e);
                }
            }
        });
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

    private void onNativeAdapterDestroyed() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mOnDestroyedCallbackForTesting != null) {
                this.mOnDestroyedCallbackForTesting.run();
            }
            if (this.mException != null) {
            }
        }
    }

    public final void appTimeout() {
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
            r1 = 2
            r2.destroyRequestAdapterLocked(r1)     // Catch:{ all -> 0x0016 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequest.cancel():void");
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

    public final void maybeReportMetrics() {
        if (this.mMetrics != null) {
            final RequestFinishedInfoImpl requestFinishedInfoImpl = new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, this.mMetrics, this.mFinishedReason, this.mResponseInfo, this.mException);
            this.mRequestContext.reportRequestFinished(requestFinishedInfoImpl);
            if (this.mRequestFinishedListener != null) {
                try {
                    this.mRequestFinishedListener.getExecutor().execute(new Runnable() {
                        public void run() {
                            CronetUrlRequest.this.mRequestFinishedListener.onRequestFinished(requestFinishedInfoImpl);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[Catch:{ RuntimeException -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073 A[Catch:{ RuntimeException -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r17 = this;
            r14 = r17
            java.lang.Object r15 = r14.mUrlRequestAdapterLock
            monitor-enter(r15)
            r17.checkNotStarted()     // Catch:{ all -> 0x0113 }
            r13 = 1
            com.ttnet.org.chromium.net.impl.CronetUrlRequestContext r0 = r14.mRequestContext     // Catch:{ RuntimeException -> 0x010d }
            long r2 = r0.getUrlRequestContextAdapter()     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r4 = r14.mInitialUrl     // Catch:{ RuntimeException -> 0x010d }
            int r5 = r14.mPriority     // Catch:{ RuntimeException -> 0x010d }
            int r6 = r14.mRequestFlag     // Catch:{ RuntimeException -> 0x010d }
            boolean r7 = r14.mDisableCache     // Catch:{ RuntimeException -> 0x010d }
            boolean r8 = r14.mDisableConnectionMigration     // Catch:{ RuntimeException -> 0x010d }
            com.ttnet.org.chromium.net.impl.CronetUrlRequestContext r0 = r14.mRequestContext     // Catch:{ RuntimeException -> 0x010d }
            boolean r0 = r0.hasRequestFinishedListener()     // Catch:{ RuntimeException -> 0x010d }
            r16 = 0
            if (r0 != 0) goto L_0x002a
            com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$RequestFinishedInfoListener r0 = r14.mRequestFinishedListener     // Catch:{ RuntimeException -> 0x010d }
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r9 = 0
            goto L_0x002b
        L_0x002a:
            r9 = 1
        L_0x002b:
            boolean r10 = r14.mTrafficStatsTagSet     // Catch:{ RuntimeException -> 0x010d }
            int r11 = r14.mTrafficStatsTag     // Catch:{ RuntimeException -> 0x010d }
            boolean r12 = r14.mTrafficStatsUidSet     // Catch:{ RuntimeException -> 0x010d }
            int r0 = r14.mTrafficStatsUid     // Catch:{ RuntimeException -> 0x010d }
            r1 = r17
            r13 = r0
            long r0 = r1.nativeCreateRequestAdapter(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ RuntimeException -> 0x010d }
            r14.mUrlRequestAdapter = r0     // Catch:{ RuntimeException -> 0x010d }
            com.ttnet.org.chromium.net.impl.CronetUrlRequestContext r0 = r14.mRequestContext     // Catch:{ RuntimeException -> 0x010d }
            r0.onRequestStarted()     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r0 = r14.mInitialMethod     // Catch:{ RuntimeException -> 0x010d }
            if (r0 == 0) goto L_0x0066
            long r0 = r14.mUrlRequestAdapter     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r2 = r14.mInitialMethod     // Catch:{ RuntimeException -> 0x010d }
            boolean r0 = r14.nativeSetHttpMethod(r0, r2)     // Catch:{ RuntimeException -> 0x010d }
            if (r0 == 0) goto L_0x0050
            goto L_0x0066
        L_0x0050:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x010d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r2 = "Invalid http method "
            r1.<init>(r2)     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r2 = r14.mInitialMethod     // Catch:{ RuntimeException -> 0x010d }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x010d }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x010d }
            throw r0     // Catch:{ RuntimeException -> 0x010d }
        L_0x0066:
            com.ttnet.org.chromium.net.impl.CronetUrlRequest$HeadersList r0 = r14.mRequestHeaders     // Catch:{ RuntimeException -> 0x010d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x010d }
            r13 = 0
        L_0x006d:
            boolean r1 = r0.hasNext()     // Catch:{ RuntimeException -> 0x010d }
            if (r1 == 0) goto L_0x00d1
            java.lang.Object r1 = r0.next()     // Catch:{ RuntimeException -> 0x010d }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ RuntimeException -> 0x010d }
            java.lang.Object r2 = r1.getKey()     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r3 = "Content-Type"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ RuntimeException -> 0x010d }
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r1.getValue()     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RuntimeException -> 0x010d }
            boolean r2 = r2.isEmpty()     // Catch:{ RuntimeException -> 0x010d }
            if (r2 != 0) goto L_0x0094
            r13 = 1
        L_0x0094:
            long r2 = r14.mUrlRequestAdapter     // Catch:{ RuntimeException -> 0x010d }
            java.lang.Object r4 = r1.getKey()     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ RuntimeException -> 0x010d }
            java.lang.Object r5 = r1.getValue()     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ RuntimeException -> 0x010d }
            boolean r2 = r14.nativeAddRequestHeader(r2, r4, r5)     // Catch:{ RuntimeException -> 0x010d }
            if (r2 == 0) goto L_0x00a9
            goto L_0x006d
        L_0x00a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x010d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r3 = "Invalid header "
            r2.<init>(r3)     // Catch:{ RuntimeException -> 0x010d }
            java.lang.Object r3 = r1.getKey()     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ RuntimeException -> 0x010d }
            r2.append(r3)     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r3 = "="
            r2.append(r3)     // Catch:{ RuntimeException -> 0x010d }
            java.lang.Object r1 = r1.getValue()     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ RuntimeException -> 0x010d }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x010d }
            java.lang.String r1 = r2.toString()     // Catch:{ RuntimeException -> 0x010d }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x010d }
            throw r0     // Catch:{ RuntimeException -> 0x010d }
        L_0x00d1:
            long r2 = r14.mUrlRequestAdapter     // Catch:{ RuntimeException -> 0x010d }
            int r4 = r14.mSocketConnectTimeout     // Catch:{ RuntimeException -> 0x010d }
            int r5 = r14.mSocketReadTimeout     // Catch:{ RuntimeException -> 0x010d }
            int r6 = r14.mSocketWriteTimeout     // Catch:{ RuntimeException -> 0x010d }
            r1 = r17
            r1.nativeSetSocketTimeout(r2, r4, r5, r6)     // Catch:{ RuntimeException -> 0x010d }
            long r0 = r14.mUrlRequestAdapter     // Catch:{ RuntimeException -> 0x010d }
            int r2 = r14.mRequestTimeout     // Catch:{ RuntimeException -> 0x010d }
            r14.nativeSetRequestTimeout(r0, r2)     // Catch:{ RuntimeException -> 0x010d }
            com.ttnet.org.chromium.net.impl.CronetUploadDataStream r0 = r14.mUploadDataStream     // Catch:{ RuntimeException -> 0x010d }
            if (r0 == 0) goto L_0x0105
            if (r13 == 0) goto L_0x00fa
            r1 = 1
            r14.mStarted = r1     // Catch:{ RuntimeException -> 0x0103 }
            com.ttnet.org.chromium.net.impl.CronetUploadDataStream r0 = r14.mUploadDataStream     // Catch:{ RuntimeException -> 0x0103 }
            com.ttnet.org.chromium.net.impl.CronetUrlRequest$1 r2 = new com.ttnet.org.chromium.net.impl.CronetUrlRequest$1     // Catch:{ RuntimeException -> 0x0103 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0103 }
            r0.postTaskToExecutor(r2)     // Catch:{ RuntimeException -> 0x0103 }
            monitor-exit(r15)     // Catch:{ all -> 0x0113 }
            return
        L_0x00fa:
            r1 = 1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ RuntimeException -> 0x0103 }
            java.lang.String r2 = "Requests with upload data must have a Content-Type."
            r0.<init>(r2)     // Catch:{ RuntimeException -> 0x0103 }
            throw r0     // Catch:{ RuntimeException -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            goto L_0x010f
        L_0x0105:
            r1 = 1
            r14.mStarted = r1     // Catch:{ all -> 0x0113 }
            r17.startInternalLocked()     // Catch:{ all -> 0x0113 }
            monitor-exit(r15)     // Catch:{ all -> 0x0113 }
            return
        L_0x010d:
            r0 = move-exception
            r1 = 1
        L_0x010f:
            r14.destroyRequestAdapterLocked(r1)     // Catch:{ all -> 0x0113 }
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x0113:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0113 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequest.start():void");
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

    private void destroyRequestAdapterLocked(int i) {
        destroyRequestAdapterLocked(i, false);
    }

    private void failWithException(CronetException cronetException) {
        failWithException(cronetException, false);
    }

    public final void setOnDestroyedUploadCallbackForTesting(Runnable runnable) {
        this.mUploadDataStream.setOnDestroyedCallbackForTesting(runnable);
    }

    private void onSucceeded(long j) {
        this.mResponseInfo.setReceivedByteCount(j);
        postTaskToExecutor(new Runnable() {
            public void run() {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (!CronetUrlRequest.this.isDoneLocked()) {
                        CronetUrlRequest.this.destroyRequestAdapterLocked(0, true);
                        try {
                            CronetUrlRequest.this.mCallback.onSucceeded(CronetUrlRequest.this, CronetUrlRequest.this.mResponseInfo);
                            CronetUrlRequest.this.maybeReportMetrics();
                        } catch (Exception e) {
                            Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception in onSucceeded method", e);
                        }
                    }
                }
            }
        });
    }

    public final void setHttpMethod(String str) {
        checkNotStarted();
        if (str != null) {
            this.mInitialMethod = str;
            return;
        }
        throw new NullPointerException("Method is required.");
    }

    public final void setOnDestroyedCallbackForTesting(Runnable runnable) {
        synchronized (this.mUrlRequestAdapterLock) {
            this.mOnDestroyedCallbackForTesting = runnable;
        }
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
            failWithException(new CronetExceptionImpl("Exception posting task to executor", e));
        }
    }

    public final void onCallbackException(Exception exc) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UrlRequest.Callback", exc);
        Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", exc);
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
        Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception in upload method", th);
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
                Log.m146394e(str, sb.toString(), new Object[0]);
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
            this.mUploadDataStream = new CronetUploadDataStream(uploadDataProvider, executor, this);
            return;
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    private void failWithException(final CronetException cronetException, boolean z) {
        synchronized (this.mUrlRequestAdapterLock) {
            if (!isDoneLocked()) {
                this.mException = cronetException;
                destroyRequestAdapterLocked(1, z);
                try {
                    this.mExecutor.execute(new Runnable() {
                        public void run() {
                            try {
                                CronetUrlRequest.this.mCallback.onFailed(CronetUrlRequest.this, CronetUrlRequest.this.mResponseInfo, cronetException);
                                CronetUrlRequest.this.maybeReportMetrics();
                            } catch (Exception e) {
                                Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception in onFailed method", e);
                            }
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
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

    public final void destroyRequestAdapterLocked(int i, boolean z) {
        boolean z2;
        this.mFinishedReason = i;
        if (this.mUrlRequestAdapter != 0) {
            if (z) {
                this.mRequestLog = nativeGetRequestLog(this.mUrlRequestAdapter);
            }
            this.mRequestContext.onRequestDestroyed();
            long j = this.mUrlRequestAdapter;
            if (i == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            nativeDestroy(j, z2);
            this.mUrlRequestAdapter = 0;
        }
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
        this.mResponseInfo.setReceivedByteCount(j);
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
        if (this.mResponseInfo != null) {
            this.mResponseInfo.setReceivedByteCount(j);
        }
        if (i == 10 || i == 3) {
            StringBuilder sb = new StringBuilder("Exception in CronetUrlRequest: ");
            sb.append(str);
            failWithException(new QuicExceptionImpl(sb.toString(), i, i2, i3), true);
            return;
        }
        int mapUrlRequestErrorToApiErrorCode = mapUrlRequestErrorToApiErrorCode(i);
        StringBuilder sb2 = new StringBuilder("Exception in CronetUrlRequest: ");
        sb2.append(str);
        failWithException(new NetworkExceptionImpl(sb2.toString(), mapUrlRequestErrorToApiErrorCode, i2), true);
    }

    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        this.mResponseInfo = prepareResponseInfoOnNetworkThread(i, str, strArr, z, str2, str3, j);
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

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        String[] strArr2 = strArr;
        HeadersList headersList = new HeadersList();
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            headersList.add(new SimpleImmutableEntry(strArr2[i2], strArr2[i2 + 1]));
        }
        UrlResponseInfoImpl urlResponseInfoImpl = new UrlResponseInfoImpl(new ArrayList(this.mUrlChain), i, str, headersList, z, str2, str3, j);
        return urlResponseInfoImpl;
    }

    private void onRedirectReceived(final String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        String str5 = str;
        final UrlResponseInfoImpl prepareResponseInfoOnNetworkThread = prepareResponseInfoOnNetworkThread(i, str2, strArr, z, str3, str4, j);
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

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, Callback callback, Executor executor, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, Listener listener) {
        String str2 = str;
        Callback callback2 = callback;
        Executor executor2 = executor;
        Listener listener2 = listener;
        RequestFinishedInfoListener requestFinishedInfoListener = null;
        this.mRequestHeaders = new HeadersList();
        if (str2 == null) {
            throw new NullPointerException("URL is required");
        } else if (callback2 == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor2 != null) {
            this.mAllowDirectExecutor = z3;
            this.mRequestContext = cronetUrlRequestContext;
            this.mInitialUrl = str2;
            this.mUrlChain.add(str);
            this.mPriority = convertRequestPriority(i);
            this.mCallback = new UrlRequestCallback(callback);
            this.mExecutor = executor2;
            this.mRequestAnnotations = collection;
            this.mDisableCache = z;
            this.mDisableConnectionMigration = z2;
            this.mTrafficStatsTagSet = z4;
            this.mTrafficStatsTag = i2;
            this.mTrafficStatsUidSet = z5;
            this.mTrafficStatsUid = i3;
            if (listener2 != null) {
                requestFinishedInfoListener = new RequestFinishedInfoListener(listener2);
            }
            this.mRequestFinishedListener = requestFinishedInfoListener;
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
                    Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception in onMetricsCollected method", e);
                }
            }
        });
        this.mRequestContext.reportRequestFinished(requestFinishedInfo);
    }
}
