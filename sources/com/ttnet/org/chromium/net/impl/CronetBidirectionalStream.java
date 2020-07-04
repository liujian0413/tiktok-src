package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.BidirectionalStream.Callback;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.ExperimentalBidirectionalStream;
import com.ttnet.org.chromium.net.RequestFinishedInfo.Metrics;
import com.ttnet.org.chromium.net.impl.UrlResponseInfoImpl.HeaderBlockImpl;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.BidirectionalStreamCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@JNINamespace("cronet")
public class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final BidirectionalStreamCallback mCallback;
    private final boolean mDelayRequestHeadersUntilFirstFlush;
    private boolean mEndOfStreamWritten;
    private CronetException mException;
    private final Executor mExecutor;
    private LinkedList<ByteBuffer> mFlushData;
    public final String mInitialMethod;
    private final int mInitialPriority;
    private final String mInitialUrl;
    private Metrics mMetrics;
    private long mNativeStream;
    public final Object mNativeStreamLock = new Object();
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private LinkedList<ByteBuffer> mPendingData;
    public int mReadState = 0;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    private final String[] mRequestHeaders;
    public boolean mRequestHeadersSent;
    public UrlResponseInfoImpl mResponseInfo;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    public int mWriteState = 0;

    @Retention(RetentionPolicy.SOURCE)
    @interface State {
    }

    final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;
        boolean mEndOfStream;

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r6.this$0.mCallback.onReadCompleted(r6.this$0, r6.this$0.mResponseInfo, r0, r6.mEndOfStream);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            if (r3 == false) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
            r6.this$0.maybeOnSucceededOnExecutor();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                java.nio.ByteBuffer r0 = r6.mByteBuffer     // Catch:{ Exception -> 0x0049 }
                r1 = 0
                r6.mByteBuffer = r1     // Catch:{ Exception -> 0x0049 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0049 }
                java.lang.Object r1 = r1.mNativeStreamLock     // Catch:{ Exception -> 0x0049 }
                monitor-enter(r1)     // Catch:{ Exception -> 0x0049 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0046 }
                boolean r2 = r2.isDoneLocked()     // Catch:{ all -> 0x0046 }
                if (r2 == 0) goto L_0x0014
                monitor-exit(r1)     // Catch:{ all -> 0x0046 }
                return
            L_0x0014:
                boolean r2 = r6.mEndOfStream     // Catch:{ all -> 0x0046 }
                r3 = 0
                if (r2 == 0) goto L_0x0029
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0046 }
                r4 = 4
                r2.mReadState = r4     // Catch:{ all -> 0x0046 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0046 }
                int r2 = r2.mWriteState     // Catch:{ all -> 0x0046 }
                r4 = 10
                if (r2 != r4) goto L_0x002e
                r2 = 1
                r3 = 1
                goto L_0x002e
            L_0x0029:
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0046 }
                r4 = 2
                r2.mReadState = r4     // Catch:{ all -> 0x0046 }
            L_0x002e:
                monitor-exit(r1)     // Catch:{ all -> 0x0046 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0049 }
                com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$BidirectionalStreamCallback r1 = r1.mCallback     // Catch:{ Exception -> 0x0049 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0049 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r4 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0049 }
                com.ttnet.org.chromium.net.impl.UrlResponseInfoImpl r4 = r4.mResponseInfo     // Catch:{ Exception -> 0x0049 }
                boolean r5 = r6.mEndOfStream     // Catch:{ Exception -> 0x0049 }
                r1.onReadCompleted(r2, r4, r0, r5)     // Catch:{ Exception -> 0x0049 }
                if (r3 == 0) goto L_0x0045
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0049 }
                r0.maybeOnSucceededOnExecutor()     // Catch:{ Exception -> 0x0049 }
            L_0x0045:
                return
            L_0x0046:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0046 }
                throw r0     // Catch:{ Exception -> 0x0049 }
            L_0x0049:
                r0 = move-exception
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r1.onCallbackException(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.OnReadCompletedRunnable.run():void");
        }

        private OnReadCompletedRunnable() {
        }
    }

    final class OnWriteCompletedRunnable implements Runnable {
        private ByteBuffer mByteBuffer;
        private final boolean mEndOfStream;

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r6.this$0.mCallback.onWriteCompleted(r6.this$0, r6.this$0.mResponseInfo, r0, r6.mEndOfStream);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
            if (r3 == false) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            r6.this$0.maybeOnSucceededOnExecutor();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                java.nio.ByteBuffer r0 = r6.mByteBuffer     // Catch:{ Exception -> 0x0043 }
                r1 = 0
                r6.mByteBuffer = r1     // Catch:{ Exception -> 0x0043 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0043 }
                java.lang.Object r1 = r1.mNativeStreamLock     // Catch:{ Exception -> 0x0043 }
                monitor-enter(r1)     // Catch:{ Exception -> 0x0043 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0040 }
                boolean r2 = r2.isDoneLocked()     // Catch:{ all -> 0x0040 }
                if (r2 == 0) goto L_0x0014
                monitor-exit(r1)     // Catch:{ all -> 0x0040 }
                return
            L_0x0014:
                boolean r2 = r6.mEndOfStream     // Catch:{ all -> 0x0040 }
                r3 = 0
                if (r2 == 0) goto L_0x0028
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0040 }
                r4 = 10
                r2.mWriteState = r4     // Catch:{ all -> 0x0040 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0040 }
                int r2 = r2.mReadState     // Catch:{ all -> 0x0040 }
                r4 = 4
                if (r2 != r4) goto L_0x0028
                r2 = 1
                r3 = 1
            L_0x0028:
                monitor-exit(r1)     // Catch:{ all -> 0x0040 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0043 }
                com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$BidirectionalStreamCallback r1 = r1.mCallback     // Catch:{ Exception -> 0x0043 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0043 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r4 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0043 }
                com.ttnet.org.chromium.net.impl.UrlResponseInfoImpl r4 = r4.mResponseInfo     // Catch:{ Exception -> 0x0043 }
                boolean r5 = r6.mEndOfStream     // Catch:{ Exception -> 0x0043 }
                r1.onWriteCompleted(r2, r4, r0, r5)     // Catch:{ Exception -> 0x0043 }
                if (r3 == 0) goto L_0x003f
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0043 }
                r0.maybeOnSucceededOnExecutor()     // Catch:{ Exception -> 0x0043 }
            L_0x003f:
                return
            L_0x0040:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0040 }
                throw r0     // Catch:{ Exception -> 0x0043 }
            L_0x0043:
                r0 = move-exception
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r1.onCallbackException(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.OnWriteCompletedRunnable.run():void");
        }

        OnWriteCompletedRunnable(ByteBuffer byteBuffer, boolean z) {
            this.mByteBuffer = byteBuffer;
            this.mEndOfStream = z;
        }
    }

    private native long nativeCreateBidirectionalStream(long j, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native void nativeDestroy(long j, boolean z);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native void nativeSendRequestHeaders(long j);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native int nativeStart(long j, String str, int i, String str2, String[] strArr, boolean z);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native boolean nativeWritevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    private void onCanceled() {
        postTaskToExecutor(new Runnable() {
            public void run() {
                try {
                    CronetBidirectionalStream.this.mCallback.onCanceled(CronetBidirectionalStream.this, CronetBidirectionalStream.this.mResponseInfo);
                } catch (Exception e) {
                    Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception in onCanceled method", e);
                }
            }
        });
    }

    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mNativeStreamLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    public boolean isDoneLocked() {
        if (this.mReadState == 0 || this.mNativeStream != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mNativeStreamLock
            monitor-enter(r0)
            boolean r1 = r2.isDoneLocked()     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x0019
            int r1 = r2.mReadState     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            r1 = 5
            r2.mWriteState = r1     // Catch:{ all -> 0x001b }
            r2.mReadState = r1     // Catch:{ all -> 0x001b }
            r1 = 1
            r2.destroyNativeStreamLocked(r1)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.cancel():void");
    }

    public List<ByteBuffer> getFlushDataForTesting() {
        LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            linkedList = new LinkedList();
            Iterator it = this.mFlushData.iterator();
            while (it.hasNext()) {
                linkedList.add(((ByteBuffer) it.next()).asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    public List<ByteBuffer> getPendingDataForTesting() {
        LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            linkedList = new LinkedList();
            Iterator it = this.mPendingData.iterator();
            while (it.hasNext()) {
                linkedList.add(((ByteBuffer) it.next()).asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    public void maybeOnSucceededOnExecutor() {
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked()) {
                if (this.mWriteState == 10) {
                    if (this.mReadState == 4) {
                        this.mWriteState = 7;
                        this.mReadState = 7;
                        destroyNativeStreamLocked(false);
                        try {
                            this.mCallback.onSucceeded(this, this.mResponseInfo);
                        } catch (Exception e) {
                            Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception in onSucceeded method", e);
                        }
                    }
                }
            }
        }
    }

    private void sendFlushDataLocked() {
        boolean z;
        int size = this.mFlushData.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) this.mFlushData.poll();
            byteBufferArr[i] = byteBuffer;
            iArr[i] = byteBuffer.position();
            iArr2[i] = byteBuffer.limit();
        }
        this.mWriteState = 9;
        this.mRequestHeadersSent = true;
        long j = this.mNativeStream;
        if (!this.mEndOfStreamWritten || !this.mPendingData.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!nativeWritevData(j, byteBufferArr, iArr, iArr2, z)) {
            this.mWriteState = 8;
            throw new IllegalArgumentException("Unable to call native writev.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void flush() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mNativeStreamLock
            monitor-enter(r0)
            boolean r1 = r4.isDoneLocked()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x005f
            int r1 = r4.mWriteState     // Catch:{ all -> 0x0061 }
            r2 = 8
            r3 = 9
            if (r1 == r2) goto L_0x0016
            int r1 = r4.mWriteState     // Catch:{ all -> 0x0061 }
            if (r1 == r3) goto L_0x0016
            goto L_0x005f
        L_0x0016:
            java.util.LinkedList<java.nio.ByteBuffer> r1 = r4.mPendingData     // Catch:{ all -> 0x0061 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0040
            java.util.LinkedList<java.nio.ByteBuffer> r1 = r4.mFlushData     // Catch:{ all -> 0x0061 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0040
            boolean r1 = r4.mRequestHeadersSent     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x003e
            r1 = 1
            r4.mRequestHeadersSent = r1     // Catch:{ all -> 0x0061 }
            long r1 = r4.mNativeStream     // Catch:{ all -> 0x0061 }
            r4.nativeSendRequestHeaders(r1)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = r4.mInitialMethod     // Catch:{ all -> 0x0061 }
            boolean r1 = doesMethodAllowWriteData(r1)     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x003e
            r1 = 10
            r4.mWriteState = r1     // Catch:{ all -> 0x0061 }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return
        L_0x0040:
            java.util.LinkedList<java.nio.ByteBuffer> r1 = r4.mPendingData     // Catch:{ all -> 0x0061 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0054
            java.util.LinkedList<java.nio.ByteBuffer> r1 = r4.mFlushData     // Catch:{ all -> 0x0061 }
            java.util.LinkedList<java.nio.ByteBuffer> r2 = r4.mPendingData     // Catch:{ all -> 0x0061 }
            r1.addAll(r2)     // Catch:{ all -> 0x0061 }
            java.util.LinkedList<java.nio.ByteBuffer> r1 = r4.mPendingData     // Catch:{ all -> 0x0061 }
            r1.clear()     // Catch:{ all -> 0x0061 }
        L_0x0054:
            int r1 = r4.mWriteState     // Catch:{ all -> 0x0061 }
            if (r1 != r3) goto L_0x005a
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return
        L_0x005a:
            r4.sendFlushDataLocked()     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.flush():void");
    }

    public void start() {
        synchronized (this.mNativeStreamLock) {
            if (this.mReadState == 0) {
                try {
                    this.mNativeStream = nativeCreateBidirectionalStream(this.mRequestContext.getUrlRequestContextAdapter(), !this.mDelayRequestHeadersUntilFirstFlush, this.mRequestContext.hasRequestFinishedListener(), this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid);
                    this.mRequestContext.onRequestStarted();
                    int nativeStart = nativeStart(this.mNativeStream, this.mInitialUrl, this.mInitialPriority, this.mInitialMethod, this.mRequestHeaders, !doesMethodAllowWriteData(this.mInitialMethod));
                    if (nativeStart == -1) {
                        StringBuilder sb = new StringBuilder("Invalid http method ");
                        sb.append(this.mInitialMethod);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (nativeStart <= 0) {
                        this.mWriteState = 1;
                        this.mReadState = 1;
                    } else {
                        int i = nativeStart - 1;
                        StringBuilder sb2 = new StringBuilder("Invalid header ");
                        sb2.append(this.mRequestHeaders[i]);
                        sb2.append("=");
                        sb2.append(this.mRequestHeaders[i + 1]);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } catch (RuntimeException e) {
                    destroyNativeStreamLocked(false);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Stream is already started.");
            }
        }
    }

    public void setOnDestroyedCallbackForTesting(Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    private void failWithException(final CronetException cronetException) {
        postTaskToExecutor(new Runnable() {
            public void run() {
                CronetBidirectionalStream.this.failWithExceptionOnExecutor(cronetException);
            }
        });
    }

    private void onStreamReady(final boolean z) {
        postTaskToExecutor(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r3.this$0.mCallback.onStreamReady(r3.this$0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
                r3.this$0.onCallbackException(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r3 = this;
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                    java.lang.Object r0 = r0.mNativeStreamLock
                    monitor-enter(r0)
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0049 }
                    boolean r1 = r1.isDoneLocked()     // Catch:{ all -> 0x0049 }
                    if (r1 == 0) goto L_0x000f
                    monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                    return
                L_0x000f:
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0049 }
                    boolean r2 = r2     // Catch:{ all -> 0x0049 }
                    r1.mRequestHeadersSent = r2     // Catch:{ all -> 0x0049 }
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0049 }
                    r2 = 2
                    r1.mReadState = r2     // Catch:{ all -> 0x0049 }
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0049 }
                    java.lang.String r1 = r1.mInitialMethod     // Catch:{ all -> 0x0049 }
                    boolean r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.doesMethodAllowWriteData(r1)     // Catch:{ all -> 0x0049 }
                    if (r1 != 0) goto L_0x0031
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0049 }
                    boolean r1 = r1.mRequestHeadersSent     // Catch:{ all -> 0x0049 }
                    if (r1 == 0) goto L_0x0031
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0049 }
                    r2 = 10
                    r1.mWriteState = r2     // Catch:{ all -> 0x0049 }
                    goto L_0x0037
                L_0x0031:
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0049 }
                    r2 = 8
                    r1.mWriteState = r2     // Catch:{ all -> 0x0049 }
                L_0x0037:
                    monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0042 }
                    com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$BidirectionalStreamCallback r0 = r0.mCallback     // Catch:{ Exception -> 0x0042 }
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0042 }
                    r0.onStreamReady(r1)     // Catch:{ Exception -> 0x0042 }
                    return
                L_0x0042:
                    r0 = move-exception
                    com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                    r1.onCallbackException(r0)
                    return
                L_0x0049:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.C466711.run():void");
            }
        });
    }

    public static boolean doesMethodAllowWriteData(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    private static ArrayList<Entry<String, String>> headersListFromStrings(String[] strArr) {
        ArrayList<Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private void onResponseTrailersReceived(String[] strArr) {
        final HeaderBlockImpl headerBlockImpl = new HeaderBlockImpl(headersListFromStrings(strArr));
        postTaskToExecutor(new Runnable() {
            public void run() {
                synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (!CronetBidirectionalStream.this.isDoneLocked()) {
                        try {
                            CronetBidirectionalStream.this.mCallback.onResponseTrailersReceived(CronetBidirectionalStream.this, CronetBidirectionalStream.this.mResponseInfo, headerBlockImpl);
                        } catch (Exception e) {
                            CronetBidirectionalStream.this.onCallbackException(e);
                        }
                    }
                }
            }
        });
    }

    public void onCallbackException(Exception exc) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("CalledByNative method has thrown an exception", exc);
        Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", exc);
        failWithExceptionOnExecutor(callbackExceptionImpl);
    }

    private static int convertStreamPriority(int i) {
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
                throw new IllegalArgumentException("Invalid stream priority.");
        }
    }

    private void destroyNativeStreamLocked(boolean z) {
        String str = CronetUrlRequestContext.LOG_TAG;
        StringBuilder sb = new StringBuilder("destroyNativeStreamLocked ");
        sb.append(toString());
        Log.m146395i(str, sb.toString(), new Object[0]);
        if (this.mNativeStream != 0) {
            nativeDestroy(this.mNativeStream, z);
            this.mRequestContext.onRequestDestroyed();
            this.mNativeStream = 0;
            if (this.mOnDestroyedCallbackForTesting != null) {
                this.mOnDestroyedCallbackForTesting.run();
            }
        }
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
            synchronized (this.mNativeStreamLock) {
                this.mWriteState = 6;
                this.mReadState = 6;
                destroyNativeStreamLocked(false);
            }
        }
    }

    private static String[] stringsFromHeaderList(List<Entry<String, String>> list) {
        String[] strArr = new String[(list.size() * 2)];
        int i = 0;
        for (Entry entry : list) {
            int i2 = i + 1;
            strArr[i] = (String) entry.getKey();
            i = i2 + 1;
            strArr[i2] = (String) entry.getValue();
        }
        return strArr;
    }

    public void failWithExceptionOnExecutor(CronetException cronetException) {
        this.mException = cronetException;
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked()) {
                this.mWriteState = 6;
                this.mReadState = 6;
                destroyNativeStreamLocked(false);
                try {
                    this.mCallback.onFailed(this, this.mResponseInfo, cronetException);
                } catch (Exception e) {
                    Log.m146394e(CronetUrlRequestContext.LOG_TAG, "Exception notifying of failed request", e);
                }
            }
        }
    }

    public void read(ByteBuffer byteBuffer) {
        synchronized (this.mNativeStreamLock) {
            Preconditions.checkHasRemaining(byteBuffer);
            Preconditions.checkDirect(byteBuffer);
            if (this.mReadState != 2) {
                throw new IllegalStateException("Unexpected read attempt.");
            } else if (!isDoneLocked()) {
                if (this.mOnReadCompletedTask == null) {
                    this.mOnReadCompletedTask = new OnReadCompletedRunnable();
                }
                this.mReadState = 3;
                if (!nativeReadData(this.mNativeStream, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    this.mReadState = 2;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(java.nio.ByteBuffer r3, boolean r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mNativeStreamLock
            monitor-enter(r0)
            com.ttnet.org.chromium.net.impl.Preconditions.checkDirect(r3)     // Catch:{ all -> 0x0037 }
            boolean r1 = r3.hasRemaining()     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0017
            if (r4 == 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "Empty buffer before end of stream."
            r3.<init>(r4)     // Catch:{ all -> 0x0037 }
            throw r3     // Catch:{ all -> 0x0037 }
        L_0x0017:
            boolean r1 = r2.mEndOfStreamWritten     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x002f
            boolean r1 = r2.isDoneLocked()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0023
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0023:
            java.util.LinkedList<java.nio.ByteBuffer> r1 = r2.mPendingData     // Catch:{ all -> 0x0037 }
            r1.add(r3)     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x002d
            r3 = 1
            r2.mEndOfStreamWritten = r3     // Catch:{ all -> 0x0037 }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x002f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "Write after writing end of stream."
            r3.<init>(r4)     // Catch:{ all -> 0x0037 }
            throw r3     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.write(java.nio.ByteBuffer, boolean):void");
    }

    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            this.mResponseInfo = prepareResponseInfoOnNetworkThread(i, str, strArr, j);
            postTaskToExecutor(new Runnable() {
                public void run() {
                    synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                        if (!CronetBidirectionalStream.this.isDoneLocked()) {
                            CronetBidirectionalStream.this.mReadState = 2;
                            try {
                                CronetBidirectionalStream.this.mCallback.onResponseHeadersReceived(CronetBidirectionalStream.this, CronetBidirectionalStream.this.mResponseInfo);
                            } catch (Exception e) {
                                CronetBidirectionalStream.this.onCallbackException(e);
                            }
                        }
                    }
                }
            });
        } catch (Exception unused) {
            failWithException(new CronetExceptionImpl("Cannot prepare ResponseInfo", null));
        }
    }

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i, String str, String[] strArr, long j) {
        int i2 = i;
        UrlResponseInfoImpl urlResponseInfoImpl = new UrlResponseInfoImpl(Arrays.asList(new String[]{this.mInitialUrl}), i2, "", headersListFromStrings(strArr), false, str, null, j);
        return urlResponseInfoImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r1 >= r7.length) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        r2 = r7[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2.position() != r8[r1]) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r2.limit() == r9[r1]) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        r2.position(r2.limit());
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r10 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r1 != (r7.length - 1)) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        postTaskToExecutor(new com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.OnWriteCompletedRunnable(r6, r2, r4));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        failWithException(new com.ttnet.org.chromium.net.impl.CronetExceptionImpl("ByteBuffer modified externally during write", null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onWritevCompleted(java.nio.ByteBuffer[] r7, int[] r8, int[] r9, boolean r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mNativeStreamLock
            monitor-enter(r0)
            boolean r1 = r6.isDoneLocked()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x000b:
            r1 = 8
            r6.mWriteState = r1     // Catch:{ all -> 0x005b }
            java.util.LinkedList<java.nio.ByteBuffer> r1 = r6.mFlushData     // Catch:{ all -> 0x005b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x001a
            r6.sendFlushDataLocked()     // Catch:{ all -> 0x005b }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            r0 = 0
            r1 = 0
        L_0x001d:
            int r2 = r7.length
            if (r1 >= r2) goto L_0x005a
            r2 = r7[r1]
            int r3 = r2.position()
            r4 = r8[r1]
            if (r3 != r4) goto L_0x004e
            int r3 = r2.limit()
            r4 = r9[r1]
            if (r3 == r4) goto L_0x0033
            goto L_0x004e
        L_0x0033:
            int r3 = r2.limit()
            r2.position(r3)
            com.ttnet.org.chromium.net.impl.CronetBidirectionalStream$OnWriteCompletedRunnable r3 = new com.ttnet.org.chromium.net.impl.CronetBidirectionalStream$OnWriteCompletedRunnable
            r4 = 1
            if (r10 == 0) goto L_0x0044
            int r5 = r7.length
            int r5 = r5 - r4
            if (r1 != r5) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            r3.<init>(r2, r4)
            r6.postTaskToExecutor(r3)
            int r1 = r1 + 1
            goto L_0x001d
        L_0x004e:
            com.ttnet.org.chromium.net.impl.CronetExceptionImpl r7 = new com.ttnet.org.chromium.net.impl.CronetExceptionImpl
            java.lang.String r8 = "ByteBuffer modified externally during write"
            r9 = 0
            r7.<init>(r8, r9)
            r6.failWithException(r7)
            return
        L_0x005a:
            return
        L_0x005b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        if (this.mResponseInfo != null) {
            this.mResponseInfo.setReceivedByteCount(j);
        }
        if (i == 10 || i == 3) {
            StringBuilder sb = new StringBuilder("Exception in BidirectionalStream: ");
            sb.append(str);
            failWithException(new QuicExceptionImpl(sb.toString(), i, i2, i3));
            return;
        }
        StringBuilder sb2 = new StringBuilder("Exception in BidirectionalStream: ");
        sb2.append(str);
        failWithException(new BidirectionalStreamNetworkException(sb2.toString(), i, i2));
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        boolean z;
        this.mResponseInfo.setReceivedByteCount(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (i >= 0) {
                int i4 = i2 + i;
                if (i4 <= i3) {
                    byteBuffer.position(i4);
                    this.mOnReadCompletedTask.mByteBuffer = byteBuffer;
                    OnReadCompletedRunnable onReadCompletedRunnable = this.mOnReadCompletedTask;
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    onReadCompletedRunnable.mEndOfStream = z;
                    postTaskToExecutor(this.mOnReadCompletedTask);
                    return;
                }
            }
            failWithException(new CronetExceptionImpl("Invalid number of bytes read", null));
            return;
        }
        failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
    }

    CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, Callback callback, Executor executor, String str2, List<Entry<String, String>> list, boolean z, Collection<Object> collection, boolean z2, int i2, boolean z3, int i3) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mInitialUrl = str;
        this.mInitialPriority = convertStreamPriority(i);
        this.mCallback = new BidirectionalStreamCallback(callback);
        this.mExecutor = executor;
        this.mInitialMethod = str2;
        this.mRequestHeaders = stringsFromHeaderList(list);
        this.mDelayRequestHeadersUntilFirstFlush = z;
        this.mPendingData = new LinkedList<>();
        this.mFlushData = new LinkedList<>();
        this.mRequestAnnotations = collection;
        this.mTrafficStatsTagSet = z2;
        this.mTrafficStatsTag = i2;
        this.mTrafficStatsUidSet = z3;
        this.mTrafficStatsUid = i3;
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16) {
        int i;
        synchronized (this.mNativeStreamLock) {
            if (this.mMetrics == null) {
                CronetMetrics cronetMetrics = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15, str, j16, 0);
                this.mMetrics = cronetMetrics;
                if (this.mReadState == 7) {
                    i = 0;
                } else if (this.mReadState == 5) {
                    i = 2;
                } else {
                    i = 1;
                }
                RequestFinishedInfoImpl requestFinishedInfoImpl = new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, this.mMetrics, i, this.mResponseInfo, this.mException);
                this.mRequestContext.reportRequestFinished(requestFinishedInfoImpl);
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }
}
