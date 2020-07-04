package com.ttnet.org.chromium.net.impl;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import com.C1642a;
import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.lancet.network.C7118e;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.policy.Policy;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.InlineExecutionProhibitedException;
import com.ttnet.org.chromium.net.ThreadStatsUid;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import com.ttnet.org.chromium.net.UrlRequest.Callback;
import com.ttnet.org.chromium.net.UrlRequest.StatusListener;
import com.ttnet.org.chromium.net.UrlResponseInfo;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.UploadDataProviderWrapper;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.UrlRequestCallback;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class JavaUrlRequest extends UrlRequestBase {
    public static final String TAG = "JavaUrlRequest";
    public volatile int mAdditionalStatusDetails = -1;
    public final boolean mAllowDirectExecutor;
    public final AsyncUrlRequestCallback mCallbackAsync;
    public String mCurrentUrl;
    public HttpURLConnection mCurrentUrlConnection;
    public final Executor mExecutor;
    public String mInitialMethod;
    public OutputStreamDataSink mOutputStreamDataSink;
    public String mPendingRedirectUrl;
    public final Map<String, String> mRequestHeaders = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public ReadableByteChannel mResponseChannel;
    public final AtomicReference<Integer> mState = new AtomicReference<>(Integer.valueOf(0));
    public UploadDataProviderWrapper mUploadDataProvider;
    public Executor mUploadExecutor;
    private final AtomicBoolean mUploadProviderClosed = new AtomicBoolean(false);
    public final List<String> mUrlChain = new ArrayList();
    public UrlResponseInfoImpl mUrlResponseInfo;
    public final String mUserAgent;

    @Retention(RetentionPolicy.SOURCE)
    @interface SinkState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface State {
    }

    final class AsyncUrlRequestCallback {
        final UrlRequestCallback mCallback;
        final Executor mFallbackExecutor;
        final Executor mUserExecutor;

        /* access modifiers changed from: 0000 */
        public final void onCanceled(final UrlResponseInfo urlResponseInfo) {
            JavaUrlRequest.this.closeResponseChannel();
            this.mUserExecutor.execute(new Runnable() {
                public void run() {
                    try {
                        AsyncUrlRequestCallback.this.mCallback.onCanceled(JavaUrlRequest.this, urlResponseInfo);
                    } catch (Exception unused) {
                    }
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public final void onResponseStarted(UrlResponseInfo urlResponseInfo) {
            execute(new CheckedRunnable() {
                public void run() throws Exception {
                    if (JavaUrlRequest.this.mState.compareAndSet(Integer.valueOf(1), Integer.valueOf(4))) {
                        AsyncUrlRequestCallback.this.mCallback.onResponseStarted(JavaUrlRequest.this, JavaUrlRequest.this.mUrlResponseInfo);
                    }
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public final void onSucceeded(final UrlResponseInfo urlResponseInfo) {
            this.mUserExecutor.execute(new Runnable() {
                public void run() {
                    try {
                        AsyncUrlRequestCallback.this.mCallback.onSucceeded(JavaUrlRequest.this, urlResponseInfo);
                    } catch (Exception unused) {
                    }
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public final void execute(CheckedRunnable checkedRunnable) {
            try {
                this.mUserExecutor.execute(JavaUrlRequest.this.userErrorSetting(checkedRunnable));
            } catch (RejectedExecutionException e) {
                JavaUrlRequest.this.enterErrorState(new CronetExceptionImpl("Exception posting task to executor", e));
            }
        }

        /* access modifiers changed from: 0000 */
        public final void onReadCompleted(final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) {
            execute(new CheckedRunnable() {
                public void run() throws Exception {
                    if (JavaUrlRequest.this.mState.compareAndSet(Integer.valueOf(5), Integer.valueOf(4))) {
                        AsyncUrlRequestCallback.this.mCallback.onReadCompleted(JavaUrlRequest.this, urlResponseInfo, byteBuffer);
                    }
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public final void onRedirectReceived(final UrlResponseInfo urlResponseInfo, final String str) {
            execute(new CheckedRunnable() {
                public void run() throws Exception {
                    AsyncUrlRequestCallback.this.mCallback.onRedirectReceived(JavaUrlRequest.this, urlResponseInfo, str);
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public final void sendStatus(final UrlRequestStatusListener urlRequestStatusListener, final int i) {
            this.mUserExecutor.execute(new Runnable() {
                public void run() {
                    urlRequestStatusListener.onStatus(i);
                }
            });
        }

        /* access modifiers changed from: 0000 */
        public final void onFailed(final UrlResponseInfo urlResponseInfo, final CronetException cronetException) {
            JavaUrlRequest.this.closeResponseChannel();
            C467247 r0 = new Runnable() {
                public void run() {
                    try {
                        AsyncUrlRequestCallback.this.mCallback.onFailed(JavaUrlRequest.this, urlResponseInfo, cronetException);
                    } catch (Exception unused) {
                    }
                }
            };
            try {
                this.mUserExecutor.execute(r0);
            } catch (InlineExecutionProhibitedException unused) {
                if (this.mFallbackExecutor != null) {
                    this.mFallbackExecutor.execute(r0);
                }
            }
        }

        AsyncUrlRequestCallback(Callback callback, Executor executor) {
            this.mCallback = new UrlRequestCallback(callback);
            if (JavaUrlRequest.this.mAllowDirectExecutor) {
                this.mUserExecutor = executor;
                this.mFallbackExecutor = null;
                return;
            }
            this.mUserExecutor = new DirectPreventingExecutor(executor);
            this.mFallbackExecutor = executor;
        }
    }

    interface CheckedRunnable {
        void run() throws Exception;
    }

    static final class DirectPreventingExecutor implements Executor {
        private final Executor mDelegate;

        static final class InlineCheckingRunnable implements Runnable {
            public Thread mCallingThread;
            private final Runnable mCommand;
            public InlineExecutionProhibitedException mExecutedInline;

            public final void run() {
                if (Thread.currentThread() == this.mCallingThread) {
                    this.mExecutedInline = new InlineExecutionProhibitedException();
                } else {
                    this.mCommand.run();
                }
            }

            private InlineCheckingRunnable(Runnable runnable, Thread thread) {
                this.mCommand = runnable;
                this.mCallingThread = thread;
            }
        }

        DirectPreventingExecutor(Executor executor) {
            this.mDelegate = executor;
        }

        public final void execute(Runnable runnable) {
            InlineCheckingRunnable inlineCheckingRunnable = new InlineCheckingRunnable(runnable, Thread.currentThread());
            this.mDelegate.execute(inlineCheckingRunnable);
            if (inlineCheckingRunnable.mExecutedInline == null) {
                inlineCheckingRunnable.mCallingThread = null;
                return;
            }
            throw inlineCheckingRunnable.mExecutedInline;
        }
    }

    final class OutputStreamDataSink extends UploadDataSink {
        ByteBuffer mBuffer;
        final Executor mExecutor;
        WritableByteChannel mOutputChannel;
        final AtomicBoolean mOutputChannelClosed = new AtomicBoolean(false);
        final AtomicReference<Integer> mSinkState = new AtomicReference<>(Integer.valueOf(3));
        long mTotalBytes;
        final UploadDataProviderWrapper mUploadProvider;
        final HttpURLConnection mUrlConnection;
        OutputStream mUrlConnectionOutputStream;
        final Executor mUserUploadExecutor;
        long mWrittenBytes;

        /* access modifiers changed from: 0000 */
        public final void finish() throws IOException {
            closeOutputChannel();
            JavaUrlRequest.this.fireGetHeaders();
        }

        /* access modifiers changed from: 0000 */
        public final void closeOutputChannel() throws IOException {
            if (this.mOutputChannel != null && this.mOutputChannelClosed.compareAndSet(false, true)) {
                this.mOutputChannel.close();
            }
        }

        public final void onRewindSucceeded() {
            if (this.mSinkState.compareAndSet(Integer.valueOf(1), Integer.valueOf(2))) {
                startRead();
                return;
            }
            throw new IllegalStateException("Not expecting a read result");
        }

        /* access modifiers changed from: 0000 */
        public final void startRead() {
            this.mExecutor.execute(JavaUrlRequest.this.errorSetting(new CheckedRunnable() {
                public void run() throws Exception {
                    if (OutputStreamDataSink.this.mOutputChannel == null) {
                        JavaUrlRequest.this.mAdditionalStatusDetails = 10;
                        OutputStreamDataSink.this.mUrlConnection.setDoOutput(true);
                        OutputStreamDataSink.this.mUrlConnection.connect();
                        JavaUrlRequest.this.mAdditionalStatusDetails = 12;
                        OutputStreamDataSink.this.mUrlConnectionOutputStream = OutputStreamDataSink.this.mUrlConnection.getOutputStream();
                        OutputStreamDataSink.this.mOutputChannel = Channels.newChannel(OutputStreamDataSink.this.mUrlConnectionOutputStream);
                    }
                    OutputStreamDataSink.this.mSinkState.set(Integer.valueOf(0));
                    OutputStreamDataSink.this.executeOnUploadExecutor(new CheckedRunnable() {
                        public void run() throws Exception {
                            OutputStreamDataSink.this.mUploadProvider.read(OutputStreamDataSink.this, OutputStreamDataSink.this.mBuffer);
                        }
                    });
                }
            }));
        }

        public final void onReadError(Exception exc) {
            JavaUrlRequest.this.enterUploadErrorState(exc);
        }

        public final void onRewindError(Exception exc) {
            JavaUrlRequest.this.enterUploadErrorState(exc);
        }

        /* access modifiers changed from: 0000 */
        public final void start(final boolean z) {
            executeOnUploadExecutor(new CheckedRunnable() {
                public void run() throws Exception {
                    OutputStreamDataSink.this.mTotalBytes = OutputStreamDataSink.this.mUploadProvider.getLength();
                    if (OutputStreamDataSink.this.mTotalBytes == 0) {
                        OutputStreamDataSink.this.finish();
                        return;
                    }
                    if (OutputStreamDataSink.this.mTotalBytes <= 0 || OutputStreamDataSink.this.mTotalBytes >= 8192) {
                        OutputStreamDataSink.this.mBuffer = ByteBuffer.allocateDirect(VideoCacheReadBuffersizeExperiment.DEFAULT);
                    } else {
                        OutputStreamDataSink.this.mBuffer = ByteBuffer.allocateDirect(((int) OutputStreamDataSink.this.mTotalBytes) + 1);
                    }
                    if (OutputStreamDataSink.this.mTotalBytes > 0 && OutputStreamDataSink.this.mTotalBytes <= 2147483647L) {
                        OutputStreamDataSink.this.mUrlConnection.setFixedLengthStreamingMode((int) OutputStreamDataSink.this.mTotalBytes);
                    } else if (OutputStreamDataSink.this.mTotalBytes <= 2147483647L || VERSION.SDK_INT < 19) {
                        OutputStreamDataSink.this.mUrlConnection.setChunkedStreamingMode(VideoCacheReadBuffersizeExperiment.DEFAULT);
                    } else {
                        OutputStreamDataSink.this.mUrlConnection.setFixedLengthStreamingMode(OutputStreamDataSink.this.mTotalBytes);
                    }
                    if (z) {
                        OutputStreamDataSink.this.startRead();
                        return;
                    }
                    OutputStreamDataSink.this.mSinkState.set(Integer.valueOf(1));
                    OutputStreamDataSink.this.mUploadProvider.rewind(OutputStreamDataSink.this);
                }
            });
        }

        public final void executeOnUploadExecutor(CheckedRunnable checkedRunnable) {
            try {
                this.mUserUploadExecutor.execute(JavaUrlRequest.this.uploadErrorSetting(checkedRunnable));
            } catch (RejectedExecutionException e) {
                JavaUrlRequest.this.enterUploadErrorState(e);
            }
        }

        public final void onReadSucceeded(final boolean z) {
            if (this.mSinkState.compareAndSet(Integer.valueOf(0), Integer.valueOf(2))) {
                this.mExecutor.execute(JavaUrlRequest.this.errorSetting(new CheckedRunnable() {
                    public void run() throws Exception {
                        OutputStreamDataSink.this.mBuffer.flip();
                        if (OutputStreamDataSink.this.mTotalBytes == -1 || OutputStreamDataSink.this.mTotalBytes - OutputStreamDataSink.this.mWrittenBytes >= ((long) OutputStreamDataSink.this.mBuffer.remaining())) {
                            while (OutputStreamDataSink.this.mBuffer.hasRemaining()) {
                                OutputStreamDataSink.this.mWrittenBytes += (long) OutputStreamDataSink.this.mOutputChannel.write(OutputStreamDataSink.this.mBuffer);
                            }
                            OutputStreamDataSink.this.mUrlConnectionOutputStream.flush();
                            if (OutputStreamDataSink.this.mWrittenBytes < OutputStreamDataSink.this.mTotalBytes || (OutputStreamDataSink.this.mTotalBytes == -1 && !z)) {
                                OutputStreamDataSink.this.mBuffer.clear();
                                OutputStreamDataSink.this.mSinkState.set(Integer.valueOf(0));
                                OutputStreamDataSink.this.executeOnUploadExecutor(new CheckedRunnable() {
                                    public void run() throws Exception {
                                        OutputStreamDataSink.this.mUploadProvider.read(OutputStreamDataSink.this, OutputStreamDataSink.this.mBuffer);
                                    }
                                });
                            } else if (OutputStreamDataSink.this.mTotalBytes == -1) {
                                OutputStreamDataSink.this.finish();
                            } else if (OutputStreamDataSink.this.mTotalBytes == OutputStreamDataSink.this.mWrittenBytes) {
                                OutputStreamDataSink.this.finish();
                            } else {
                                JavaUrlRequest.this.enterUploadErrorState(new IllegalArgumentException(C1642a.m8034a("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(OutputStreamDataSink.this.mWrittenBytes), Long.valueOf(OutputStreamDataSink.this.mTotalBytes)})));
                            }
                        } else {
                            JavaUrlRequest.this.enterUploadErrorState(new IllegalArgumentException(C1642a.m8034a("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(OutputStreamDataSink.this.mWrittenBytes + ((long) OutputStreamDataSink.this.mBuffer.remaining())), Long.valueOf(OutputStreamDataSink.this.mTotalBytes)})));
                        }
                    }
                }));
                return;
            }
            StringBuilder sb = new StringBuilder("Not expecting a read result, expecting: ");
            sb.append(this.mSinkState.get());
            throw new IllegalStateException(sb.toString());
        }

        OutputStreamDataSink(final Executor executor, Executor executor2, HttpURLConnection httpURLConnection, UploadDataProviderWrapper uploadDataProviderWrapper) {
            this.mUserUploadExecutor = new Executor(JavaUrlRequest.this) {
                public void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RejectedExecutionException e) {
                        JavaUrlRequest.this.enterUploadErrorState(e);
                    }
                }
            };
            this.mExecutor = executor2;
            this.mUrlConnection = httpURLConnection;
            this.mUploadProvider = uploadDataProviderWrapper;
        }
    }

    static final class SerializingExecutor implements Executor {
        public final Runnable mRunTasks = new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(7:32|33|34|35|36|37|38) */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
                if (r1 == null) goto L_0x005f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r1.run();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
                r0 = r6.this$0.mTaskQueue;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
                monitor-enter(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                r1 = (java.lang.Runnable) r6.this$0.mTaskQueue.pollFirst();
                r2 = r6.this$0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
                if (r1 == null) goto L_0x003d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
                r5 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
                r5 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
                r2.mRunning = r5;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
                monitor-exit(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
                monitor-enter(r6.this$0.mTaskQueue);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
                r6.this$0.mRunning = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
                r6.this$0.mUnderlyingExecutor.execute(r6.this$0.mRunTasks);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x005b, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x005f, code lost:
                return;
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x005a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r6 = this;
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r0 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this
                    java.util.ArrayDeque<java.lang.Runnable> r0 = r0.mTaskQueue
                    monitor-enter(r0)
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r1 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0060 }
                    boolean r1 = r1.mRunning     // Catch:{ all -> 0x0060 }
                    if (r1 == 0) goto L_0x000d
                    monitor-exit(r0)     // Catch:{ all -> 0x0060 }
                    return
                L_0x000d:
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r1 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0060 }
                    java.util.ArrayDeque<java.lang.Runnable> r1 = r1.mTaskQueue     // Catch:{ all -> 0x0060 }
                    java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x0060 }
                    java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0060 }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r2 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0060 }
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x001f
                    r5 = 1
                    goto L_0x0020
                L_0x001f:
                    r5 = 0
                L_0x0020:
                    r2.mRunning = r5     // Catch:{ all -> 0x0060 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0060 }
                L_0x0023:
                    if (r1 == 0) goto L_0x005f
                    r1.run()     // Catch:{ all -> 0x0045 }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r0 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this
                    java.util.ArrayDeque<java.lang.Runnable> r0 = r0.mTaskQueue
                    monitor-enter(r0)
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r1 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0042 }
                    java.util.ArrayDeque<java.lang.Runnable> r1 = r1.mTaskQueue     // Catch:{ all -> 0x0042 }
                    java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x0042 }
                    java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0042 }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r2 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0042 }
                    if (r1 == 0) goto L_0x003d
                    r5 = 1
                    goto L_0x003e
                L_0x003d:
                    r5 = 0
                L_0x003e:
                    r2.mRunning = r5     // Catch:{ all -> 0x0042 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                    goto L_0x0023
                L_0x0042:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                    throw r1
                L_0x0045:
                    r0 = move-exception
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r1 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this
                    java.util.ArrayDeque<java.lang.Runnable> r1 = r1.mTaskQueue
                    monitor-enter(r1)
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r2 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x005c }
                    r2.mRunning = r4     // Catch:{ all -> 0x005c }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r2 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ RejectedExecutionException -> 0x005a }
                    java.util.concurrent.Executor r2 = r2.mUnderlyingExecutor     // Catch:{ RejectedExecutionException -> 0x005a }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r3 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ RejectedExecutionException -> 0x005a }
                    java.lang.Runnable r3 = r3.mRunTasks     // Catch:{ RejectedExecutionException -> 0x005a }
                    r2.execute(r3)     // Catch:{ RejectedExecutionException -> 0x005a }
                L_0x005a:
                    monitor-exit(r1)     // Catch:{ all -> 0x005c }
                    throw r0
                L_0x005c:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x005c }
                    throw r0
                L_0x005f:
                    return
                L_0x0060:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0060 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.C467311.run():void");
            }
        };
        public boolean mRunning;
        public final ArrayDeque<Runnable> mTaskQueue = new ArrayDeque<>();
        public final Executor mUnderlyingExecutor;

        SerializingExecutor(Executor executor) {
            this.mUnderlyingExecutor = executor;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void execute(java.lang.Runnable r3) {
            /*
                r2 = this;
                java.util.ArrayDeque<java.lang.Runnable> r0 = r2.mTaskQueue
                monitor-enter(r0)
                java.util.ArrayDeque<java.lang.Runnable> r1 = r2.mTaskQueue     // Catch:{ all -> 0x0017 }
                r1.addLast(r3)     // Catch:{ all -> 0x0017 }
                java.util.concurrent.Executor r3 = r2.mUnderlyingExecutor     // Catch:{ RejectedExecutionException -> 0x0010 }
                java.lang.Runnable r1 = r2.mRunTasks     // Catch:{ RejectedExecutionException -> 0x0010 }
                r3.execute(r1)     // Catch:{ RejectedExecutionException -> 0x0010 }
                goto L_0x0015
            L_0x0010:
                java.util.ArrayDeque<java.lang.Runnable> r3 = r2.mTaskQueue     // Catch:{ all -> 0x0017 }
                r3.removeLast()     // Catch:{ all -> 0x0017 }
            L_0x0015:
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                return
            L_0x0017:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.execute(java.lang.Runnable):void");
        }
    }

    public final String getRequestLog() {
        return "";
    }

    public final void setRequestTimeout(int i) {
    }

    public final void setSocketConnectTimeout(int i) {
    }

    public final void setSocketReadTimeout(int i) {
    }

    public final void setSocketWriteTimeout(int i) {
    }

    public final void stopRedirect() {
    }

    private void fireDisconnect() {
        this.mExecutor.execute(new Runnable() {
            public void run() {
                if (JavaUrlRequest.this.mOutputStreamDataSink != null) {
                    try {
                        JavaUrlRequest.this.mOutputStreamDataSink.closeOutputChannel();
                    } catch (IOException unused) {
                    }
                }
                if (JavaUrlRequest.this.mCurrentUrlConnection != null) {
                    JavaUrlRequest.this.mCurrentUrlConnection.disconnect();
                    JavaUrlRequest.this.mCurrentUrlConnection = null;
                }
            }
        });
    }

    public final void closeResponseChannel() {
        this.mExecutor.execute(new Runnable() {
            public void run() {
                if (JavaUrlRequest.this.mResponseChannel != null) {
                    try {
                        JavaUrlRequest.this.mResponseChannel.close();
                    } catch (IOException unused) {
                    }
                    JavaUrlRequest.this.mResponseChannel = null;
                }
            }
        });
    }

    public final void fireOpenConnection() {
        this.mExecutor.execute(errorSetting(new CheckedRunnable() {

            /* renamed from: com.ttnet.org.chromium.net.impl.JavaUrlRequest$7$_lancet */
            class _lancet {
                private _lancet() {
                }

                /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_setRequestProperty */
                static void m146454x963129db(HttpURLConnection httpURLConnection, String str, String str2) {
                    URLConnection uRLConnection = httpURLConnection;
                    if (C7118e.m22232a(uRLConnection)) {
                        C7116a.m22226a(uRLConnection.getURL(), str, str2, "");
                    } else if (C7163a.m22363a()) {
                        C7116a.m22230b(uRLConnection.getURL(), str, str2, "");
                    }
                    httpURLConnection.setRequestProperty(str, str2);
                }
            }

            public void run() throws Exception {
                if (((Integer) JavaUrlRequest.this.mState.get()).intValue() != 8) {
                    URL url = new URL(JavaUrlRequest.this.mCurrentUrl);
                    if (JavaUrlRequest.this.mCurrentUrlConnection != null) {
                        JavaUrlRequest.this.mCurrentUrlConnection.disconnect();
                        JavaUrlRequest.this.mCurrentUrlConnection = null;
                    }
                    JavaUrlRequest.this.mCurrentUrlConnection = (HttpURLConnection) url.openConnection();
                    boolean z = false;
                    JavaUrlRequest.this.mCurrentUrlConnection.setInstanceFollowRedirects(false);
                    if (!JavaUrlRequest.this.mRequestHeaders.containsKey("User-Agent")) {
                        JavaUrlRequest.this.mRequestHeaders.put("User-Agent", JavaUrlRequest.this.mUserAgent);
                    }
                    for (Entry entry : JavaUrlRequest.this.mRequestHeaders.entrySet()) {
                        _lancet.m146454x963129db(JavaUrlRequest.this.mCurrentUrlConnection, (String) entry.getKey(), (String) entry.getValue());
                    }
                    if (JavaUrlRequest.this.mInitialMethod == null) {
                        JavaUrlRequest.this.mInitialMethod = "GET";
                    }
                    JavaUrlRequest.this.mCurrentUrlConnection.setRequestMethod(JavaUrlRequest.this.mInitialMethod);
                    if (JavaUrlRequest.this.mUploadDataProvider != null) {
                        JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                        OutputStreamDataSink outputStreamDataSink = new OutputStreamDataSink(JavaUrlRequest.this.mUploadExecutor, JavaUrlRequest.this.mExecutor, JavaUrlRequest.this.mCurrentUrlConnection, JavaUrlRequest.this.mUploadDataProvider);
                        javaUrlRequest.mOutputStreamDataSink = outputStreamDataSink;
                        OutputStreamDataSink outputStreamDataSink2 = JavaUrlRequest.this.mOutputStreamDataSink;
                        if (JavaUrlRequest.this.mUrlChain.size() == 1) {
                            z = true;
                        }
                        outputStreamDataSink2.start(z);
                        return;
                    }
                    JavaUrlRequest.this.mAdditionalStatusDetails = 10;
                    JavaUrlRequest.this.mCurrentUrlConnection.connect();
                    JavaUrlRequest.this.fireGetHeaders();
                }
            }
        }));
    }

    public final void followRedirect() {
        transitionStates(3, 1, new Runnable() {
            public void run() {
                JavaUrlRequest.this.mCurrentUrl = JavaUrlRequest.this.mPendingRedirectUrl;
                JavaUrlRequest.this.mPendingRedirectUrl = null;
                JavaUrlRequest.this.fireOpenConnection();
            }
        });
    }

    public final void start() {
        this.mAdditionalStatusDetails = 10;
        transitionStates(0, 1, new Runnable() {
            public void run() {
                JavaUrlRequest.this.mUrlChain.add(JavaUrlRequest.this.mCurrentUrl);
                JavaUrlRequest.this.fireOpenConnection();
            }
        });
    }

    public final void fireCloseUploadDataProvider() {
        if (this.mUploadDataProvider != null && this.mUploadProviderClosed.compareAndSet(false, true)) {
            try {
                this.mUploadExecutor.execute(uploadErrorSetting(new CheckedRunnable() {
                    public void run() throws Exception {
                        JavaUrlRequest.this.mUploadDataProvider.close();
                    }
                }));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final void fireGetHeaders() {
        this.mAdditionalStatusDetails = 13;
        this.mExecutor.execute(errorSetting(new CheckedRunnable() {

            /* renamed from: com.ttnet.org.chromium.net.impl.JavaUrlRequest$4$_lancet */
            class _lancet {
                private _lancet() {
                }

                /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_getInputStream */
                static InputStream m146453xff4d584d(HttpURLConnection httpURLConnection) throws IOException {
                    URLConnection uRLConnection = httpURLConnection;
                    if (C7118e.m22232a(uRLConnection)) {
                        C7116a.m22226a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
                    } else if (C7163a.m22363a()) {
                        C7116a.m22230b(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
                    }
                    return httpURLConnection.getInputStream();
                }
            }

            public void run() throws Exception {
                ReadableByteChannel readableByteChannel;
                if (JavaUrlRequest.this.mCurrentUrlConnection != null) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    String str = "http/1.1";
                    while (true) {
                        String headerFieldKey = JavaUrlRequest.this.mCurrentUrlConnection.getHeaderFieldKey(i);
                        if (headerFieldKey == null) {
                            break;
                        }
                        if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                            str = JavaUrlRequest.this.mCurrentUrlConnection.getHeaderField(i);
                        }
                        if (!headerFieldKey.startsWith("X-Android")) {
                            arrayList.add(new SimpleEntry(headerFieldKey, JavaUrlRequest.this.mCurrentUrlConnection.getHeaderField(i)));
                        }
                        i++;
                    }
                    int responseCode = JavaUrlRequest.this.mCurrentUrlConnection.getResponseCode();
                    JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                    UrlResponseInfoImpl urlResponseInfoImpl = new UrlResponseInfoImpl(new ArrayList(JavaUrlRequest.this.mUrlChain), responseCode, JavaUrlRequest.this.mCurrentUrlConnection.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0);
                    javaUrlRequest.mUrlResponseInfo = urlResponseInfoImpl;
                    if (responseCode < 300 || responseCode >= 400) {
                        JavaUrlRequest.this.fireCloseUploadDataProvider();
                        if (responseCode >= 400) {
                            InputStream errorStream = JavaUrlRequest.this.mCurrentUrlConnection.getErrorStream();
                            JavaUrlRequest javaUrlRequest2 = JavaUrlRequest.this;
                            if (errorStream == null) {
                                readableByteChannel = null;
                            } else {
                                readableByteChannel = InputStreamChannel.wrap(errorStream);
                            }
                            javaUrlRequest2.mResponseChannel = readableByteChannel;
                            JavaUrlRequest.this.mCallbackAsync.onResponseStarted(JavaUrlRequest.this.mUrlResponseInfo);
                            return;
                        }
                        JavaUrlRequest.this.mResponseChannel = InputStreamChannel.wrap(_lancet.m146453xff4d584d(JavaUrlRequest.this.mCurrentUrlConnection));
                        JavaUrlRequest.this.mCallbackAsync.onResponseStarted(JavaUrlRequest.this.mUrlResponseInfo);
                        return;
                    }
                    JavaUrlRequest.this.fireRedirectReceived(JavaUrlRequest.this.mUrlResponseInfo.getAllHeaders());
                }
            }
        }));
    }

    public final boolean isDone() {
        int intValue = ((Integer) this.mState.get()).intValue();
        if (intValue == 7 || intValue == 6 || intValue == 8) {
            return true;
        }
        return false;
    }

    private void checkNotStarted() {
        int intValue = ((Integer) this.mState.get()).intValue();
        if (intValue != 0) {
            StringBuilder sb = new StringBuilder("Request is already started. State is: ");
            sb.append(intValue);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void cancel() {
        switch (((Integer) this.mState.getAndSet(Integer.valueOf(8))).intValue()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                fireDisconnect();
                fireCloseUploadDataProvider();
                this.mCallbackAsync.onCanceled(this.mUrlResponseInfo);
                return;
            default:
                return;
        }
    }

    public final Runnable errorSetting(final CheckedRunnable checkedRunnable) {
        return new Runnable() {
            public void run() {
                try {
                    checkedRunnable.run();
                } catch (Throwable th) {
                    JavaUrlRequest.this.enterCronetErrorState(th);
                }
            }
        };
    }

    public final Runnable uploadErrorSetting(final CheckedRunnable checkedRunnable) {
        return new Runnable() {
            public void run() {
                try {
                    checkedRunnable.run();
                } catch (Throwable th) {
                    JavaUrlRequest.this.enterUploadErrorState(th);
                }
            }
        };
    }

    public final Runnable userErrorSetting(final CheckedRunnable checkedRunnable) {
        return new Runnable() {
            public void run() {
                try {
                    checkedRunnable.run();
                } catch (Throwable th) {
                    JavaUrlRequest.this.enterUserErrorState(th);
                }
            }
        };
    }

    public final void enterCronetErrorState(Throwable th) {
        enterErrorState(new CronetExceptionImpl("System error", th));
    }

    public final void enterUploadErrorState(Throwable th) {
        enterErrorState(new CallbackExceptionImpl("Exception received from UploadDataProvider", th));
    }

    public final void enterUserErrorState(Throwable th) {
        enterErrorState(new CallbackExceptionImpl("Exception received from UrlRequest.Callback", th));
    }

    public final void fireRedirectReceived(final Map<String, List<String>> map) {
        transitionStates(1, 2, new Runnable() {
            public void run() {
                JavaUrlRequest.this.mPendingRedirectUrl = URI.create(JavaUrlRequest.this.mCurrentUrl).resolve((String) ((List) map.get("location")).get(0)).toString();
                JavaUrlRequest.this.mUrlChain.add(JavaUrlRequest.this.mPendingRedirectUrl);
                JavaUrlRequest.this.transitionStates(2, 3, new Runnable() {
                    public void run() {
                        JavaUrlRequest.this.mCallbackAsync.onRedirectReceived(JavaUrlRequest.this.mUrlResponseInfo, JavaUrlRequest.this.mPendingRedirectUrl);
                    }
                });
            }
        });
    }

    public final void enterErrorState(CronetException cronetException) {
        if (setTerminalState(6)) {
            fireDisconnect();
            fireCloseUploadDataProvider();
            this.mCallbackAsync.onFailed(this.mUrlResponseInfo, cronetException);
        }
    }

    public final void read(final ByteBuffer byteBuffer) {
        Preconditions.checkDirect(byteBuffer);
        Preconditions.checkHasRemaining(byteBuffer);
        transitionStates(4, 5, new Runnable() {
            public void run() {
                JavaUrlRequest.this.mExecutor.execute(JavaUrlRequest.this.errorSetting(new CheckedRunnable() {
                    public void run() throws Exception {
                        int i;
                        if (JavaUrlRequest.this.mResponseChannel == null) {
                            i = -1;
                        } else {
                            i = JavaUrlRequest.this.mResponseChannel.read(byteBuffer);
                        }
                        JavaUrlRequest.this.processReadResult(i, byteBuffer);
                    }
                }));
            }
        });
    }

    private boolean setTerminalState(int i) {
        int intValue;
        do {
            intValue = ((Integer) this.mState.get()).intValue();
            if (intValue != 0) {
                switch (intValue) {
                    case 6:
                    case 7:
                    case 8:
                        return false;
                }
            } else {
                throw new IllegalStateException("Can't enter error state before start");
            }
        } while (!this.mState.compareAndSet(Integer.valueOf(intValue), Integer.valueOf(i)));
        return true;
    }

    private boolean isValidHeaderName(String str) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (!(charAt == ',' || charAt == '/' || charAt == '{' || charAt == '}')) {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case BaseNotice.LIKE /*41*/:
                        break;
                    default:
                        switch (charAt) {
                            case ':':
                            case ';':
                            case '<':
                            case BaseNotice.TCM /*61*/:
                            case BaseNotice.CREATOR /*62*/:
                            case '?':
                            case '@':
                                break;
                            default:
                                switch (charAt) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                        break;
                                    default:
                                        if (Character.isISOControl(charAt) || Character.isWhitespace(charAt)) {
                                            return false;
                                        }
                                        i++;
                                        break;
                                }
                        }
                }
            }
            return false;
        }
        return true;
    }

    public final void getStatus(StatusListener statusListener) {
        int intValue = ((Integer) this.mState.get()).intValue();
        int i = this.mAdditionalStatusDetails;
        switch (intValue) {
            case 0:
            case 6:
            case 7:
            case 8:
                i = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i = 0;
                break;
            case 5:
                i = 14;
                break;
            default:
                StringBuilder sb = new StringBuilder("Switch is exhaustive: ");
                sb.append(intValue);
                throw new IllegalStateException(sb.toString());
        }
        this.mCallbackAsync.sendStatus(new UrlRequestStatusListener(statusListener), i);
    }

    public final void setHttpMethod(String str) {
        checkNotStarted();
        if (str == null) {
            throw new NullPointerException("Method is required.");
        } else if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || Policy.ACTION_DELETE.equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            this.mInitialMethod = str;
        } else {
            StringBuilder sb = new StringBuilder("Invalid http method ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void addHeader(String str, String str2) {
        checkNotStarted();
        if (!isValidHeaderName(str) || str2.contains("\r\n")) {
            StringBuilder sb = new StringBuilder("Invalid header ");
            sb.append(str);
            sb.append("=");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.mRequestHeaders.containsKey(str)) {
            this.mRequestHeaders.remove(str);
        }
        this.mRequestHeaders.put(str, str2);
    }

    public final void processReadResult(int i, ByteBuffer byteBuffer) throws IOException {
        if (i != -1) {
            this.mCallbackAsync.onReadCompleted(this.mUrlResponseInfo, byteBuffer);
            return;
        }
        if (this.mResponseChannel != null) {
            this.mResponseChannel.close();
        }
        if (this.mState.compareAndSet(Integer.valueOf(5), Integer.valueOf(7))) {
            fireDisconnect();
            this.mCallbackAsync.onSucceeded(this.mUrlResponseInfo);
        }
    }

    public final void setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (this.mRequestHeaders.containsKey("Content-Type")) {
            checkNotStarted();
            if (this.mInitialMethod == null) {
                this.mInitialMethod = "POST";
            }
            this.mUploadDataProvider = new UploadDataProviderWrapper(uploadDataProvider);
            if (this.mAllowDirectExecutor) {
                this.mUploadExecutor = executor;
            } else {
                this.mUploadExecutor = new DirectPreventingExecutor(executor);
            }
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }

    public final void transitionStates(int i, int i2, Runnable runnable) {
        if (!this.mState.compareAndSet(Integer.valueOf(i), Integer.valueOf(i2))) {
            int intValue = ((Integer) this.mState.get()).intValue();
            if (intValue != 8 && intValue != 6) {
                StringBuilder sb = new StringBuilder("Invalid state transition - expected ");
                sb.append(i);
                sb.append(" but was ");
                sb.append(intValue);
                throw new IllegalStateException(sb.toString());
            }
            return;
        }
        runnable.run();
    }

    JavaUrlRequest(Callback callback, Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2) {
        final int i3;
        Callback callback2 = callback;
        Executor executor3 = executor2;
        String str3 = str;
        if (str3 == null) {
            throw new NullPointerException("URL is required");
        } else if (callback2 == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required");
        } else if (executor3 != null) {
            this.mAllowDirectExecutor = z;
            this.mCallbackAsync = new AsyncUrlRequestCallback(callback, executor2);
            if (z2) {
                i3 = i;
            } else {
                i3 = TrafficStats.getThreadStatsTag();
            }
            final Executor executor4 = executor;
            final boolean z4 = z3;
            final int i4 = i2;
            C467021 r0 = new Executor() {
                public void execute(final Runnable runnable) {
                    executor4.execute(new Runnable() {
                        public void run() {
                            int threadStatsTag = TrafficStats.getThreadStatsTag();
                            TrafficStats.setThreadStatsTag(i3);
                            if (z4) {
                                ThreadStatsUid.set(i4);
                            }
                            try {
                                runnable.run();
                            } finally {
                                if (z4) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag);
                            }
                        }
                    });
                }
            };
            this.mExecutor = new SerializingExecutor(r0);
            this.mCurrentUrl = str3;
            this.mUserAgent = str2;
        } else {
            throw new NullPointerException("userExecutor is required");
        }
    }
}
