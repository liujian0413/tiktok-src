package com.ttnet.org.chromium.net.impl;

import com.C1642a;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.UploadDataProviderWrapper;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

@JNINamespace("cronet")
public final class CronetUploadDataStream extends UploadDataSink {
    public static final String TAG = "CronetUploadDataStream";
    public ByteBuffer mByteBuffer;
    private long mByteBufferLimit;
    public final UploadDataProviderWrapper mDataProvider;
    private boolean mDestroyAdapterPostponed;
    private final Executor mExecutor;
    public int mInWhichUserCallback = 3;
    private long mLength;
    public final Object mLock = new Object();
    private Runnable mOnDestroyedCallbackForTesting;
    private final Runnable mReadTask = new Runnable() {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class<CronetUploadDataStream> cls = CronetUploadDataStream.class;
        }

        public void run() {
            synchronized (CronetUploadDataStream.this.mLock) {
                if (CronetUploadDataStream.this.mUploadDataStreamAdapter != 0) {
                    CronetUploadDataStream.this.checkState(3);
                    if (CronetUploadDataStream.this.mByteBuffer != null) {
                        CronetUploadDataStream.this.mInWhichUserCallback = 0;
                        try {
                            CronetUploadDataStream.this.checkCallingThread();
                            CronetUploadDataStream.this.mDataProvider.read(CronetUploadDataStream.this, CronetUploadDataStream.this.mByteBuffer);
                        } catch (Exception e) {
                            CronetUploadDataStream.this.onError(e);
                        }
                    } else {
                        throw new IllegalStateException("Unexpected readData call. Buffer is null");
                    }
                }
            }
        }
    };
    private long mRemainingLength;
    private final CronetUrlRequest mRequest;
    public long mUploadDataStreamAdapter;

    @Retention(RetentionPolicy.SOURCE)
    @interface UserCallback {
    }

    private native long nativeAttachUploadDataToRequest(long j, long j2);

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long j, long j2);

    @NativeClassQualifiedName("CronetUploadDataStreamAdapter")
    private static native void nativeDestroy(long j);

    @NativeClassQualifiedName("CronetUploadDataStreamAdapter")
    private native void nativeOnReadSucceeded(long j, int i, boolean z);

    @NativeClassQualifiedName("CronetUploadDataStreamAdapter")
    private native void nativeOnRewindSucceeded(long j);

    /* access modifiers changed from: 0000 */
    public final void onUploadDataStreamDestroyed() {
        destroyAdapter();
    }

    public final void checkCallingThread() {
        this.mRequest.checkCallingThread();
    }

    /* access modifiers changed from: 0000 */
    public final void rewind() {
        postTaskToExecutor(new Runnable() {
            public void run() {
                synchronized (CronetUploadDataStream.this.mLock) {
                    if (CronetUploadDataStream.this.mUploadDataStreamAdapter != 0) {
                        CronetUploadDataStream.this.checkState(3);
                        CronetUploadDataStream.this.mInWhichUserCallback = 1;
                        try {
                            CronetUploadDataStream.this.checkCallingThread();
                            CronetUploadDataStream.this.mDataProvider.rewind(CronetUploadDataStream.this);
                        } catch (Exception e) {
                            CronetUploadDataStream.this.onError(e);
                        }
                    }
                }
            }
        });
    }

    private void destroyAdapterIfPostponed() {
        synchronized (this.mLock) {
            if (this.mInWhichUserCallback == 0) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            } else if (this.mDestroyAdapterPostponed) {
                destroyAdapter();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        postTaskToExecutor(new com.ttnet.org.chromium.net.impl.CronetUploadDataStream.C466793(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void destroyAdapter() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            int r1 = r6.mInWhichUserCallback     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x000c
            r1 = 1
            r6.mDestroyAdapterPostponed = r1     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x000c:
            long r1 = r6.mUploadDataStreamAdapter     // Catch:{ all -> 0x0030 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0016:
            long r1 = r6.mUploadDataStreamAdapter     // Catch:{ all -> 0x0030 }
            nativeDestroy(r1)     // Catch:{ all -> 0x0030 }
            r6.mUploadDataStreamAdapter = r3     // Catch:{ all -> 0x0030 }
            java.lang.Runnable r1 = r6.mOnDestroyedCallbackForTesting     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0026
            java.lang.Runnable r1 = r6.mOnDestroyedCallbackForTesting     // Catch:{ all -> 0x0030 }
            r1.run()     // Catch:{ all -> 0x0030 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            com.ttnet.org.chromium.net.impl.CronetUploadDataStream$3 r0 = new com.ttnet.org.chromium.net.impl.CronetUploadDataStream$3
            r0.<init>()
            r6.postTaskToExecutor(r0)
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUploadDataStream.destroyAdapter():void");
    }

    public final long createUploadDataStreamForTesting() throws IOException {
        long nativeCreateUploadDataStreamForTesting;
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = nativeCreateAdapterForTesting();
            this.mLength = this.mDataProvider.getLength();
            this.mRemainingLength = this.mLength;
            nativeCreateUploadDataStreamForTesting = nativeCreateUploadDataStreamForTesting(this.mLength, this.mUploadDataStreamAdapter);
        }
        return nativeCreateUploadDataStreamForTesting;
    }

    /* access modifiers changed from: 0000 */
    public final void initializeWithRequest() {
        synchronized (this.mLock) {
            this.mInWhichUserCallback = 2;
        }
        try {
            this.mRequest.checkCallingThread();
            this.mLength = this.mDataProvider.getLength();
            this.mRemainingLength = this.mLength;
        } catch (Throwable th) {
            onError(th);
        }
        synchronized (this.mLock) {
            this.mInWhichUserCallback = 3;
        }
    }

    public final void onRewindSucceeded() {
        synchronized (this.mLock) {
            checkState(1);
            this.mInWhichUserCallback = 3;
            this.mRemainingLength = this.mLength;
            if (this.mUploadDataStreamAdapter != 0) {
                nativeOnRewindSucceeded(this.mUploadDataStreamAdapter);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void setOnDestroyedCallbackForTesting(Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    /* access modifiers changed from: 0000 */
    public final void attachNativeAdapterToRequest(long j) {
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = nativeAttachUploadDataToRequest(j, this.mLength);
        }
    }

    public final void onReadError(Exception exc) {
        synchronized (this.mLock) {
            checkState(0);
            onError(exc);
        }
    }

    public final void onRewindError(Exception exc) {
        synchronized (this.mLock) {
            checkState(1);
            onError(exc);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void readData(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
        this.mByteBufferLimit = (long) byteBuffer.limit();
        postTaskToExecutor(this.mReadTask);
    }

    public final void checkState(int i) {
        if (this.mInWhichUserCallback != i) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(i);
            sb.append(", but was ");
            sb.append(this.mInWhichUserCallback);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void onError(Throwable th) {
        boolean z;
        synchronized (this.mLock) {
            if (this.mInWhichUserCallback != 3) {
                if (this.mInWhichUserCallback == 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.mInWhichUserCallback = 3;
                this.mByteBuffer = null;
                destroyAdapterIfPostponed();
            } else {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
        }
        if (z) {
            try {
                this.mDataProvider.close();
            } catch (Exception e) {
                Log.m146394e(TAG, "Failure closing data provider", e);
            }
        }
        this.mRequest.onUploadException(th);
    }

    /* access modifiers changed from: 0000 */
    public final void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (Throwable th) {
            if (this.mRequest != null) {
                this.mRequest.onUploadException(th);
                return;
            }
            StringBuilder sb = new StringBuilder("Unexpected request usage, caught in CronetUploadDataStream, caused by ");
            sb.append(th);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void onReadSucceeded(boolean z) {
        synchronized (this.mLock) {
            checkState(0);
            if (this.mByteBufferLimit == ((long) this.mByteBuffer.limit())) {
                if (z) {
                    if (this.mLength >= 0) {
                        throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
                    }
                }
                int position = this.mByteBuffer.position();
                this.mRemainingLength -= (long) position;
                if (this.mRemainingLength < 0) {
                    if (this.mLength >= 0) {
                        throw new IllegalArgumentException(C1642a.m8034a("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.mLength - this.mRemainingLength), Long.valueOf(this.mLength)}));
                    }
                }
                this.mByteBuffer.position(0);
                this.mByteBuffer = null;
                this.mInWhichUserCallback = 3;
                destroyAdapterIfPostponed();
                if (this.mUploadDataStreamAdapter != 0) {
                    nativeOnReadSucceeded(this.mUploadDataStreamAdapter, position, z);
                    return;
                }
                return;
            }
            throw new IllegalStateException("ByteBuffer limit changed");
        }
    }

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.mExecutor = executor;
        this.mDataProvider = new UploadDataProviderWrapper(uploadDataProvider);
        this.mRequest = cronetUrlRequest;
    }
}
