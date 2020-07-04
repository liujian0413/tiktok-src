package com.ttnet.org.chromium.net1.impl;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import com.C1642a;
import com.p280ss.android.ugc.aweme.lancet.network.C7116a;
import com.p280ss.android.ugc.aweme.lancet.network.C7118e;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.policy.Policy;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.ttnet.org.chromium.net1.CronetException;
import com.ttnet.org.chromium.net1.InlineExecutionProhibitedException;
import com.ttnet.org.chromium.net1.UploadDataProvider;
import com.ttnet.org.chromium.net1.UploadDataSink;
import com.ttnet.org.chromium.net1.UrlRequest.Callback;
import com.ttnet.org.chromium.net1.UrlRequest.StatusListener;
import com.ttnet.org.chromium.net1.UrlResponseInfo;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.UploadDataProviderWrapper;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.UrlRequestCallback;
import com.ttnet.org.chromium.net1.impl.VersionSafeCallbacks.UrlRequestStatusListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
    public final AtomicReference<HttpURLConnection> mCurrentUrlConnection = new AtomicReference<>();
    public final Executor mExecutor;
    public String mInitialMethod;
    public String mPendingRedirectUrl;
    public final Map<String, String> mRequestHeaders = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public ReadableByteChannel mResponseChannel;
    public final AtomicReference<State> mState = new AtomicReference<>(State.NOT_STARTED);
    public final int mTrafficStatsTag;
    public UploadDataProviderWrapper mUploadDataProvider;
    public Executor mUploadExecutor;
    private final AtomicBoolean mUploadProviderClosed = new AtomicBoolean(false);
    public final List<String> mUrlChain = new ArrayList();
    public UrlResponseInfoImpl mUrlResponseInfo;
    public final String mUserAgent;

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
                    if (JavaUrlRequest.this.mState.compareAndSet(State.STARTED, State.AWAITING_READ)) {
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
                    if (JavaUrlRequest.this.mState.compareAndSet(State.READING, State.AWAITING_READ)) {
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
            C468047 r0 = new Runnable() {
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
        final AtomicReference<SinkState> mSinkState = new AtomicReference<>(SinkState.NOT_STARTED);
        long mTotalBytes;
        final UploadDataProviderWrapper mUploadProvider;
        final HttpURLConnection mUrlConnection;
        OutputStream mUrlConnectionOutputStream;
        final Executor mUserUploadExecutor;
        long mWrittenBytes = 0;

        /* access modifiers changed from: 0000 */
        public final void finish() throws IOException {
            if (this.mOutputChannel != null) {
                this.mOutputChannel.close();
            }
            JavaUrlRequest.this.fireGetHeaders();
        }

        public final void onRewindSucceeded() {
            if (this.mSinkState.compareAndSet(SinkState.AWAITING_REWIND_RESULT, SinkState.UPLOADING)) {
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
                        OutputStreamDataSink.this.mUrlConnection.connect();
                        JavaUrlRequest.this.mAdditionalStatusDetails = 12;
                        OutputStreamDataSink.this.mUrlConnectionOutputStream = OutputStreamDataSink.this.mUrlConnection.getOutputStream();
                        OutputStreamDataSink.this.mOutputChannel = Channels.newChannel(OutputStreamDataSink.this.mUrlConnectionOutputStream);
                    }
                    OutputStreamDataSink.this.mSinkState.set(SinkState.AWAITING_READ_RESULT);
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
                    OutputStreamDataSink.this.mSinkState.set(SinkState.AWAITING_REWIND_RESULT);
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
            if (this.mSinkState.compareAndSet(SinkState.AWAITING_READ_RESULT, SinkState.UPLOADING)) {
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
                                OutputStreamDataSink.this.mSinkState.set(SinkState.AWAITING_READ_RESULT);
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

    final class SeriaizingExecutor implements Executor {
        public final ArrayDeque<Runnable> mTaskQueue = new ArrayDeque<>();
        private final Executor mUnderlyingExecutor;

        public final void runTask(final Runnable runnable) {
            try {
                this.mUnderlyingExecutor.execute(new Runnable() {
                    public void run() {
                        Runnable runnable;
                        try {
                            runnable.run();
                            synchronized (SeriaizingExecutor.this.mTaskQueue) {
                                SeriaizingExecutor.this.mTaskQueue.removeFirst();
                                runnable = (Runnable) SeriaizingExecutor.this.mTaskQueue.peekFirst();
                            }
                            if (runnable != null) {
                                SeriaizingExecutor.this.runTask(runnable);
                            }
                        } catch (Throwable th) {
                            synchronized (SeriaizingExecutor.this.mTaskQueue) {
                                SeriaizingExecutor.this.mTaskQueue.removeFirst();
                                Runnable runnable2 = (Runnable) SeriaizingExecutor.this.mTaskQueue.peekFirst();
                                if (runnable2 != null) {
                                    SeriaizingExecutor.this.runTask(runnable2);
                                }
                                throw th;
                            }
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        public final void execute(Runnable runnable) {
            synchronized (this.mTaskQueue) {
                this.mTaskQueue.addLast(runnable);
                if (this.mTaskQueue.size() <= 1) {
                    runTask(runnable);
                }
            }
        }

        SeriaizingExecutor(Executor executor) {
            this.mUnderlyingExecutor = executor;
        }
    }

    enum SinkState {
        AWAITING_READ_RESULT,
        AWAITING_REWIND_RESULT,
        UPLOADING,
        NOT_STARTED
    }

    enum State {
        NOT_STARTED,
        STARTED,
        REDIRECT_RECEIVED,
        AWAITING_FOLLOW_REDIRECT,
        AWAITING_READ,
        READING,
        ERROR,
        COMPLETE,
        CANCELLED
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

    public final void fireOpenConnection() {
        this.mExecutor.execute(errorSetting(new CheckedRunnable() {

            /* renamed from: com.ttnet.org.chromium.net1.impl.JavaUrlRequest$7$_lancet */
            class _lancet {
                private _lancet() {
                }

                /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_setRequestProperty */
                static void m146457x963129db(HttpURLConnection httpURLConnection, String str, String str2) {
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
                if (JavaUrlRequest.this.mState.get() != State.CANCELLED) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(JavaUrlRequest.this.mCurrentUrl).openConnection();
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) JavaUrlRequest.this.mCurrentUrlConnection.getAndSet(httpURLConnection);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    boolean z = false;
                    httpURLConnection.setInstanceFollowRedirects(false);
                    if (!JavaUrlRequest.this.mRequestHeaders.containsKey("User-Agent")) {
                        JavaUrlRequest.this.mRequestHeaders.put("User-Agent", JavaUrlRequest.this.mUserAgent);
                    }
                    for (Entry entry : JavaUrlRequest.this.mRequestHeaders.entrySet()) {
                        _lancet.m146457x963129db(httpURLConnection, (String) entry.getKey(), (String) entry.getValue());
                    }
                    if (JavaUrlRequest.this.mInitialMethod == null) {
                        JavaUrlRequest.this.mInitialMethod = "GET";
                    }
                    httpURLConnection.setRequestMethod(JavaUrlRequest.this.mInitialMethod);
                    if (JavaUrlRequest.this.mUploadDataProvider != null) {
                        OutputStreamDataSink outputStreamDataSink = new OutputStreamDataSink(JavaUrlRequest.this.mUploadExecutor, JavaUrlRequest.this.mExecutor, httpURLConnection, JavaUrlRequest.this.mUploadDataProvider);
                        if (JavaUrlRequest.this.mUrlChain.size() == 1) {
                            z = true;
                        }
                        outputStreamDataSink.start(z);
                        return;
                    }
                    JavaUrlRequest.this.mAdditionalStatusDetails = 10;
                    httpURLConnection.connect();
                    JavaUrlRequest.this.fireGetHeaders();
                }
            }
        }));
    }

    public final void followRedirect() {
        transitionStates(State.AWAITING_FOLLOW_REDIRECT, State.STARTED, new Runnable() {
            public void run() {
                JavaUrlRequest.this.mCurrentUrl = JavaUrlRequest.this.mPendingRedirectUrl;
                JavaUrlRequest.this.mPendingRedirectUrl = null;
                JavaUrlRequest.this.fireOpenConnection();
            }
        });
    }

    private void fireDisconnect() {
        final HttpURLConnection httpURLConnection = (HttpURLConnection) this.mCurrentUrlConnection.getAndSet(null);
        if (httpURLConnection != null) {
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    httpURLConnection.disconnect();
                }
            });
        }
    }

    public final void closeResponseChannel() {
        final ReadableByteChannel readableByteChannel = this.mResponseChannel;
        if (readableByteChannel != null) {
            this.mResponseChannel = null;
            this.mExecutor.execute(new Runnable() {
                public void run() {
                    try {
                        readableByteChannel.close();
                    } catch (IOException unused) {
                    }
                }
            });
        }
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

            /* renamed from: com.ttnet.org.chromium.net1.impl.JavaUrlRequest$4$_lancet */
            class _lancet {
                private _lancet() {
                }

                /* renamed from: com_ss_android_ugc_aweme_lancet_network_UrlConnectionLancet_getInputStream */
                static InputStream m146456xff4d584d(HttpURLConnection httpURLConnection) throws IOException {
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
                HttpURLConnection httpURLConnection = (HttpURLConnection) JavaUrlRequest.this.mCurrentUrlConnection.get();
                if (httpURLConnection != null) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    String str = "http/1.1";
                    while (true) {
                        String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                        if (headerFieldKey == null) {
                            break;
                        }
                        if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                            str = httpURLConnection.getHeaderField(i);
                        }
                        if (!headerFieldKey.startsWith("X-Android")) {
                            arrayList.add(new SimpleEntry(headerFieldKey, httpURLConnection.getHeaderField(i)));
                        }
                        i++;
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                    UrlResponseInfoImpl urlResponseInfoImpl = new UrlResponseInfoImpl(new ArrayList(JavaUrlRequest.this.mUrlChain), responseCode, httpURLConnection.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "");
                    javaUrlRequest.mUrlResponseInfo = urlResponseInfoImpl;
                    if (responseCode < 300 || responseCode >= 400) {
                        JavaUrlRequest.this.fireCloseUploadDataProvider();
                        if (responseCode >= 400) {
                            JavaUrlRequest.this.mResponseChannel = InputStreamChannel.wrap(httpURLConnection.getErrorStream());
                            JavaUrlRequest.this.mCallbackAsync.onResponseStarted(JavaUrlRequest.this.mUrlResponseInfo);
                            return;
                        }
                        JavaUrlRequest.this.mResponseChannel = InputStreamChannel.wrap(_lancet.m146456xff4d584d(httpURLConnection));
                        JavaUrlRequest.this.mCallbackAsync.onResponseStarted(JavaUrlRequest.this.mUrlResponseInfo);
                        return;
                    }
                    JavaUrlRequest.this.fireRedirectReceived(JavaUrlRequest.this.mUrlResponseInfo.getAllHeaders());
                }
            }
        }));
    }

    public final void start() {
        this.mAdditionalStatusDetails = 10;
        transitionStates(State.NOT_STARTED, State.STARTED, new Runnable() {
            public void run() {
                JavaUrlRequest.this.mUrlChain.add(JavaUrlRequest.this.mCurrentUrl);
                JavaUrlRequest.this.fireOpenConnection();
            }
        });
    }

    private void checkNotStarted() {
        State state = (State) this.mState.get();
        if (state != State.NOT_STARTED) {
            StringBuilder sb = new StringBuilder("Request is already started. State is: ");
            sb.append(state);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void cancel() {
        State state = (State) this.mState.getAndSet(State.CANCELLED);
        if (state == State.REDIRECT_RECEIVED || state == State.AWAITING_FOLLOW_REDIRECT || state == State.AWAITING_READ || state == State.STARTED || state == State.READING) {
            fireDisconnect();
            fireCloseUploadDataProvider();
            this.mCallbackAsync.onCanceled(this.mUrlResponseInfo);
        }
    }

    public final boolean isDone() {
        boolean z;
        boolean z2;
        State state = (State) this.mState.get();
        boolean z3 = false;
        if (state == State.COMPLETE) {
            z = true;
        } else {
            z = false;
        }
        if (state == State.ERROR) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (state == State.CANCELLED) {
            z3 = true;
        }
        return z4 | z3;
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
        transitionStates(State.STARTED, State.REDIRECT_RECEIVED, new Runnable() {
            public void run() {
                JavaUrlRequest.this.mPendingRedirectUrl = URI.create(JavaUrlRequest.this.mCurrentUrl).resolve((String) ((List) map.get("location")).get(0)).toString();
                JavaUrlRequest.this.mUrlChain.add(JavaUrlRequest.this.mPendingRedirectUrl);
                JavaUrlRequest.this.transitionStates(State.REDIRECT_RECEIVED, State.AWAITING_FOLLOW_REDIRECT, new Runnable() {
                    public void run() {
                        JavaUrlRequest.this.mCallbackAsync.onRedirectReceived(JavaUrlRequest.this.mUrlResponseInfo, JavaUrlRequest.this.mPendingRedirectUrl);
                    }
                });
            }
        });
    }

    public final void enterErrorState(CronetException cronetException) {
        if (setTerminalState(State.ERROR)) {
            fireDisconnect();
            fireCloseUploadDataProvider();
            this.mCallbackAsync.onFailed(this.mUrlResponseInfo, cronetException);
        }
    }

    public final void read(final ByteBuffer byteBuffer) {
        Preconditions.checkDirect(byteBuffer);
        Preconditions.checkHasRemaining(byteBuffer);
        transitionStates(State.AWAITING_READ, State.READING, new Runnable() {
            public void run() {
                JavaUrlRequest.this.mExecutor.execute(JavaUrlRequest.this.errorSetting(new CheckedRunnable() {
                    public void run() throws Exception {
                        JavaUrlRequest.this.processReadResult(JavaUrlRequest.this.mResponseChannel.read(byteBuffer), byteBuffer);
                    }
                }));
            }
        });
    }

    private boolean setTerminalState(State state) {
        State state2;
        do {
            state2 = (State) this.mState.get();
            if (state2 == State.NOT_STARTED) {
                throw new IllegalStateException("Can't enter error state before start");
            } else if (state2 == State.ERROR || state2 == State.COMPLETE || state2 == State.CANCELLED) {
                return false;
            }
        } while (!this.mState.compareAndSet(state2, state));
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
        State state = (State) this.mState.get();
        int i = this.mAdditionalStatusDetails;
        if (state == State.ERROR || state == State.COMPLETE || state == State.CANCELLED || state == State.NOT_STARTED) {
            i = -1;
        } else if (state != State.STARTED) {
            if (state == State.REDIRECT_RECEIVED || state == State.AWAITING_FOLLOW_REDIRECT || state == State.AWAITING_READ) {
                i = 0;
            } else if (state == State.READING) {
                i = 14;
            } else {
                StringBuilder sb = new StringBuilder("Switch is exhaustive: ");
                sb.append(state);
                throw new IllegalStateException(sb.toString());
            }
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
        this.mResponseChannel.close();
        if (this.mState.compareAndSet(State.READING, State.COMPLETE)) {
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

    public final void transitionStates(State state, State state2, Runnable runnable) {
        if (!this.mState.compareAndSet(state, state2)) {
            State state3 = (State) this.mState.get();
            if (state3 != State.CANCELLED && state3 != State.ERROR) {
                StringBuilder sb = new StringBuilder("Invalid state transition - expected ");
                sb.append(state);
                sb.append(" but was ");
                sb.append(state3);
                throw new IllegalStateException(sb.toString());
            }
            return;
        }
        runnable.run();
    }

    JavaUrlRequest(Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (callback == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required");
        } else if (executor2 != null) {
            this.mAllowDirectExecutor = z;
            this.mCallbackAsync = new AsyncUrlRequestCallback(callback, executor2);
            this.mTrafficStatsTag = TrafficStats.getThreadStatsTag();
            this.mExecutor = new SeriaizingExecutor(new Executor() {
                public void execute(final Runnable runnable) {
                    executor.execute(new Runnable() {
                        public void run() {
                            int threadStatsTag = TrafficStats.getThreadStatsTag();
                            TrafficStats.setThreadStatsTag(JavaUrlRequest.this.mTrafficStatsTag);
                            try {
                                runnable.run();
                            } finally {
                                TrafficStats.setThreadStatsTag(threadStatsTag);
                            }
                        }
                    });
                }
            });
            this.mCurrentUrl = str;
            this.mUserAgent = str2;
        } else {
            throw new NullPointerException("userExecutor is required");
        }
    }
}
