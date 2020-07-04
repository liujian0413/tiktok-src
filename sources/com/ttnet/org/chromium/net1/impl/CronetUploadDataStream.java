package com.ttnet.org.chromium.net1.impl;

import com.C1642a;
import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import com.ttnet.org.chromium.base1.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net1.UploadDataProvider;
import com.ttnet.org.chromium.net1.UploadDataSink;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.UploadDataProviderWrapper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

@JNINamespace("cronet")
public final class CronetUploadDataStream extends UploadDataSink {
    public static final String TAG = "CronetUploadDataStream";
    public ByteBuffer mByteBuffer = null;
    public final UploadDataProviderWrapper mDataProvider;
    private boolean mDestroyAdapterPostponed = false;
    private final Executor mExecutor;
    public UserCallback mInWhichUserCallback = UserCallback.NOT_IN_CALLBACK;
    private long mLength;
    public final Object mLock = new Object();
    private Runnable mOnDestroyedCallbackForTesting;
    private final Runnable mReadTask = new Runnable() {
        public void run() {
            synchronized (CronetUploadDataStream.this.mLock) {
                if (CronetUploadDataStream.this.mUploadDataStreamAdapter != 0) {
                    CronetUploadDataStream.this.checkState(UserCallback.NOT_IN_CALLBACK);
                    if (CronetUploadDataStream.this.mByteBuffer != null) {
                        CronetUploadDataStream.this.mInWhichUserCallback = UserCallback.READ;
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
    private CronetUrlRequest mRequest;
    public long mUploadDataStreamAdapter = 0;

    enum UserCallback {
        READ,
        REWIND,
        GET_LENGTH,
        NOT_IN_CALLBACK
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
        if (this.mRequest != null) {
            this.mRequest.checkCallingThread();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void rewind() {
        postTaskToExecutor(new Runnable() {
            public void run() {
                synchronized (CronetUploadDataStream.this.mLock) {
                    if (CronetUploadDataStream.this.mUploadDataStreamAdapter != 0) {
                        CronetUploadDataStream.this.checkState(UserCallback.NOT_IN_CALLBACK);
                        CronetUploadDataStream.this.mInWhichUserCallback = UserCallback.REWIND;
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
            if (this.mInWhichUserCallback == UserCallback.READ) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            } else if (this.mDestroyAdapterPostponed) {
                destroyAdapter();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        postTaskToExecutor(new com.ttnet.org.chromium.net1.impl.CronetUploadDataStream.C467573(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void destroyAdapter() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            com.ttnet.org.chromium.net1.impl.CronetUploadDataStream$UserCallback r1 = r6.mInWhichUserCallback     // Catch:{ all -> 0x0032 }
            com.ttnet.org.chromium.net1.impl.CronetUploadDataStream$UserCallback r2 = com.ttnet.org.chromium.net1.impl.CronetUploadDataStream.UserCallback.READ     // Catch:{ all -> 0x0032 }
            if (r1 != r2) goto L_0x000e
            r1 = 1
            r6.mDestroyAdapterPostponed = r1     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x000e:
            long r1 = r6.mUploadDataStreamAdapter     // Catch:{ all -> 0x0032 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0018:
            long r1 = r6.mUploadDataStreamAdapter     // Catch:{ all -> 0x0032 }
            nativeDestroy(r1)     // Catch:{ all -> 0x0032 }
            r6.mUploadDataStreamAdapter = r3     // Catch:{ all -> 0x0032 }
            java.lang.Runnable r1 = r6.mOnDestroyedCallbackForTesting     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0028
            java.lang.Runnable r1 = r6.mOnDestroyedCallbackForTesting     // Catch:{ all -> 0x0032 }
            r1.run()     // Catch:{ all -> 0x0032 }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            com.ttnet.org.chromium.net1.impl.CronetUploadDataStream$3 r0 = new com.ttnet.org.chromium.net1.impl.CronetUploadDataStream$3
            r0.<init>()
            r6.postTaskToExecutor(r0)
            return
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net1.impl.CronetUploadDataStream.destroyAdapter():void");
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

    public final void onRewindSucceeded() {
        synchronized (this.mLock) {
            checkState(UserCallback.REWIND);
            this.mInWhichUserCallback = UserCallback.NOT_IN_CALLBACK;
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
    public final void readData(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
        postTaskToExecutor(this.mReadTask);
    }

    /* access modifiers changed from: 0000 */
    public final void attachNativeAdapterToRequest(long j) {
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = nativeAttachUploadDataToRequest(j, this.mLength);
        }
    }

    public final void onReadError(Exception exc) {
        synchronized (this.mLock) {
            checkState(UserCallback.READ);
            onError(exc);
        }
    }

    public final void onRewindError(Exception exc) {
        synchronized (this.mLock) {
            checkState(UserCallback.REWIND);
            onError(exc);
        }
    }

    public final void checkState(UserCallback userCallback) {
        if (this.mInWhichUserCallback != userCallback) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(userCallback);
            sb.append(", but was ");
            sb.append(this.mInWhichUserCallback);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void initializeWithRequest(CronetUrlRequest cronetUrlRequest) {
        synchronized (this.mLock) {
            this.mRequest = cronetUrlRequest;
            this.mInWhichUserCallback = UserCallback.GET_LENGTH;
        }
        try {
            cronetUrlRequest.checkCallingThread();
            this.mLength = this.mDataProvider.getLength();
            this.mRemainingLength = this.mLength;
        } catch (Throwable th) {
            onError(th);
        }
        synchronized (this.mLock) {
            this.mInWhichUserCallback = UserCallback.NOT_IN_CALLBACK;
        }
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

    public final void onError(Throwable th) {
        boolean z;
        synchronized (this.mLock) {
            if (this.mInWhichUserCallback != UserCallback.NOT_IN_CALLBACK) {
                if (this.mInWhichUserCallback == UserCallback.GET_LENGTH) {
                    z = true;
                } else {
                    z = false;
                }
                this.mInWhichUserCallback = UserCallback.NOT_IN_CALLBACK;
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
                Log.m22891e(TAG, "Failure closing data provider", e);
            }
        }
        this.mRequest.onUploadException(th);
    }

    public final void onReadSucceeded(boolean z) {
        synchronized (this.mLock) {
            checkState(UserCallback.READ);
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
            this.mByteBuffer = null;
            this.mInWhichUserCallback = UserCallback.NOT_IN_CALLBACK;
            destroyAdapterIfPostponed();
            if (this.mUploadDataStreamAdapter != 0) {
                nativeOnReadSucceeded(this.mUploadDataStreamAdapter, position, z);
            }
        }
    }

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor) {
        this.mExecutor = executor;
        this.mDataProvider = new UploadDataProviderWrapper(uploadDataProvider);
    }
}
