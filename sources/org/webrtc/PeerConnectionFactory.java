package org.webrtc;

import android.os.Process;
import com.bytedance.webrtc.ConfigMessage;
import com.bytedance.webrtc.RTCCapabilities;
import java.util.List;
import org.webrtc.EglBase.Context;
import org.webrtc.Logging.Severity;
import org.webrtc.PeerConnection.IceServer;
import org.webrtc.PeerConnection.Observer;
import org.webrtc.PeerConnection.RTCConfiguration;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.LegacyAudioDeviceModule;

public class PeerConnectionFactory {
    public static final String VIDEO_FRAME_EMIT_TRIAL = "VideoFrameEmit";
    private static volatile boolean internalTracerInitialized;
    private static ThreadInfo staticNetworkThread;
    private static ThreadInfo staticSignalingThread;
    private static ThreadInfo staticWorkerThread;
    private long nativeFactory;
    private volatile ThreadInfo networkThread;
    private volatile ThreadInfo signalingThread;
    private volatile ThreadInfo workerThread;

    public static class Builder {
        private AudioDecoderFactoryFactory audioDecoderFactoryFactory;
        private AudioDeviceModule audioDeviceModule;
        private AudioEncoderFactoryFactory audioEncoderFactoryFactory;
        private AudioProcessingFactory audioProcessingFactory;
        private FecControllerFactoryFactoryInterface fecControllerFactoryFactory;
        private Context hwDecodeContext;
        private Context hwEncodeContext;
        private MediaTransportFactoryFactory mediaTransportFactoryFactory;
        private Options options;
        private VideoDecoderFactory videoDecoderFactory;
        private VideoEncoderFactory videoEncoderFactory;

        private Builder() {
            this.audioDeviceModule = new LegacyAudioDeviceModule();
            this.audioEncoderFactoryFactory = new BuiltinAudioEncoderFactoryFactory();
            this.audioDecoderFactoryFactory = new BuiltinAudioDecoderFactoryFactory();
        }

        public PeerConnectionFactory createPeerConnectionFactory() {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            PeerConnectionFactory.checkInitializeHasBeenCalled();
            if (this.videoEncoderFactory == null && this.videoDecoderFactory == null) {
                android.content.Context applicationContext = ContextUtils.getApplicationContext();
                Options options2 = this.options;
                if (this.audioDeviceModule == null) {
                    j5 = 0;
                } else {
                    j5 = this.audioDeviceModule.getNativeAudioDeviceModulePointer();
                }
                long createNativeAudioEncoderFactory = this.audioEncoderFactoryFactory.createNativeAudioEncoderFactory();
                long createNativeAudioDecoderFactory = this.audioDecoderFactoryFactory.createNativeAudioDecoderFactory();
                Context context = this.hwEncodeContext;
                Context context2 = this.hwDecodeContext;
                if (this.audioProcessingFactory == null) {
                    j6 = 0;
                } else {
                    j6 = this.audioProcessingFactory.createNative();
                }
                if (this.fecControllerFactoryFactory == null) {
                    j7 = 0;
                } else {
                    j7 = this.fecControllerFactoryFactory.createNative();
                }
                if (this.mediaTransportFactoryFactory == null) {
                    j8 = 0;
                } else {
                    j8 = this.mediaTransportFactoryFactory.createNativeMediaTransportFactory();
                }
                return PeerConnectionFactory.nativeCreatePeerConnectionFactoryDefaultVideoCodec(applicationContext, options2, j5, createNativeAudioEncoderFactory, createNativeAudioDecoderFactory, context, context2, j6, j7, j8);
            }
            android.content.Context applicationContext2 = ContextUtils.getApplicationContext();
            Options options3 = this.options;
            if (this.audioDeviceModule == null) {
                j = 0;
            } else {
                j = this.audioDeviceModule.getNativeAudioDeviceModulePointer();
            }
            long createNativeAudioEncoderFactory2 = this.audioEncoderFactoryFactory.createNativeAudioEncoderFactory();
            long createNativeAudioDecoderFactory2 = this.audioDecoderFactoryFactory.createNativeAudioDecoderFactory();
            VideoEncoderFactory videoEncoderFactory2 = this.videoEncoderFactory;
            VideoDecoderFactory videoDecoderFactory2 = this.videoDecoderFactory;
            if (this.audioProcessingFactory == null) {
                j2 = 0;
            } else {
                j2 = this.audioProcessingFactory.createNative();
            }
            if (this.fecControllerFactoryFactory == null) {
                j3 = 0;
            } else {
                j3 = this.fecControllerFactoryFactory.createNative();
            }
            if (this.mediaTransportFactoryFactory == null) {
                j4 = 0;
            } else {
                j4 = this.mediaTransportFactoryFactory.createNativeMediaTransportFactory();
            }
            return PeerConnectionFactory.nativeCreatePeerConnectionFactory(applicationContext2, options3, j, createNativeAudioEncoderFactory2, createNativeAudioDecoderFactory2, videoEncoderFactory2, videoDecoderFactory2, j2, j3, j4);
        }

        public Builder setAudioDeviceModule(AudioDeviceModule audioDeviceModule2) {
            this.audioDeviceModule = audioDeviceModule2;
            return this;
        }

        public Builder setFecControllerFactoryFactoryInterface(FecControllerFactoryFactoryInterface fecControllerFactoryFactoryInterface) {
            this.fecControllerFactoryFactory = fecControllerFactoryFactoryInterface;
            return this;
        }

        public Builder setHwEncodeContext(Context context) {
            this.hwEncodeContext = context;
            return this;
        }

        public Builder setMediaTransportFactoryFactory(MediaTransportFactoryFactory mediaTransportFactoryFactory2) {
            this.mediaTransportFactoryFactory = mediaTransportFactoryFactory2;
            return this;
        }

        public Builder setOptions(Options options2) {
            this.options = options2;
            return this;
        }

        public Builder setVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory2) {
            this.videoDecoderFactory = videoDecoderFactory2;
            return this;
        }

        public Builder setVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory2) {
            this.videoEncoderFactory = videoEncoderFactory2;
            return this;
        }

        public Builder setAudioDecoderFactoryFactory(AudioDecoderFactoryFactory audioDecoderFactoryFactory2) {
            if (audioDecoderFactoryFactory2 != null) {
                this.audioDecoderFactoryFactory = audioDecoderFactoryFactory2;
                return this;
            }
            throw new IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory.");
        }

        public Builder setAudioEncoderFactoryFactory(AudioEncoderFactoryFactory audioEncoderFactoryFactory2) {
            if (audioEncoderFactoryFactory2 != null) {
                this.audioEncoderFactoryFactory = audioEncoderFactoryFactory2;
                return this;
            }
            throw new IllegalArgumentException("PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory.");
        }

        public Builder setAudioProcessingFactory(AudioProcessingFactory audioProcessingFactory2) {
            if (audioProcessingFactory2 != null) {
                this.audioProcessingFactory = audioProcessingFactory2;
                return this;
            }
            throw new NullPointerException("PeerConnectionFactory builder does not accept a null AudioProcessingFactory.");
        }
    }

    public static class InitializationOptions {
        final android.content.Context applicationContext;
        final boolean enableInternalTracer;
        final String fieldTrials;
        Loggable loggable;
        Severity loggableSeverity;
        final NativeLibraryLoader nativeLibraryLoader;
        final String nativeLibraryName;

        public static class Builder {
            private final android.content.Context applicationContext;
            private boolean enableInternalTracer;
            private String fieldTrials = "";
            private Loggable loggable;
            private Severity loggableSeverity;
            private NativeLibraryLoader nativeLibraryLoader = new DefaultLoader();
            private String nativeLibraryName = "bytertc";

            public InitializationOptions createInitializationOptions() {
                InitializationOptions initializationOptions = new InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.nativeLibraryLoader, this.nativeLibraryName, this.loggable, this.loggableSeverity);
                return initializationOptions;
            }

            public Builder setEnableInternalTracer(boolean z) {
                this.enableInternalTracer = z;
                return this;
            }

            public Builder setFieldTrials(String str) {
                this.fieldTrials = str;
                return this;
            }

            public Builder setNativeLibraryLoader(NativeLibraryLoader nativeLibraryLoader2) {
                this.nativeLibraryLoader = nativeLibraryLoader2;
                return this;
            }

            public Builder setNativeLibraryName(String str) {
                this.nativeLibraryName = str;
                return this;
            }

            Builder(android.content.Context context) {
                this.applicationContext = context;
            }

            public Builder setInjectableLogger(Loggable loggable2, Severity severity) {
                this.loggable = loggable2;
                this.loggableSeverity = severity;
                return this;
            }
        }

        public static Builder builder(android.content.Context context) {
            return new Builder(context);
        }

        private InitializationOptions(android.content.Context context, String str, boolean z, NativeLibraryLoader nativeLibraryLoader2, String str2, Loggable loggable2, Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z;
            this.nativeLibraryLoader = nativeLibraryLoader2;
            this.nativeLibraryName = str2;
            this.loggable = loggable2;
            this.loggableSeverity = severity;
        }
    }

    public static class Options {
        public boolean disableEncryption;
        public boolean disableNetworkMonitor;
        public int networkIgnoreMask = 16;

        /* access modifiers changed from: 0000 */
        public boolean getDisableEncryption() {
            return this.disableEncryption;
        }

        /* access modifiers changed from: 0000 */
        public boolean getDisableNetworkMonitor() {
            return this.disableNetworkMonitor;
        }

        /* access modifiers changed from: 0000 */
        public int getNetworkIgnoreMask() {
            return this.networkIgnoreMask;
        }
    }

    static class ThreadInfo {
        final Thread thread;
        final int tid;

        public static ThreadInfo getCurrent() {
            return new ThreadInfo(Thread.currentThread(), Process.myTid());
        }

        private ThreadInfo(Thread thread2, int i) {
            this.thread = thread2;
            this.tid = i;
        }
    }

    private static native void nativeAdjustPlaybackSignalVolume(long j, int i);

    private static native void nativeAdjustRecordingSignalVolume(long j, int i);

    private static native long nativeCreateAudioSource(long j, MediaConstraints mediaConstraints);

    private static native long nativeCreateAudioTrack(long j, String str, long j2);

    private static native long nativeCreateLocalMediaStream(long j, String str);

    private static native long nativeCreatePeerConnection(long j, RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier);

    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(android.content.Context context, Options options, long j, long j2, long j3, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j4, long j5, long j6);

    public static native PeerConnectionFactory nativeCreatePeerConnectionFactoryDefaultVideoCodec(android.content.Context context, Options options, long j, long j2, long j3, Context context2, Context context3, long j4, long j5, long j6);

    private static native long nativeCreateVideoSource(long j, boolean z, boolean z2);

    private static native long nativeCreateVideoTrack(long j, String str, long j2);

    private static native void nativeDeleteLoggable();

    private static native void nativeEnableLocalAudio(long j, boolean z);

    private static native String nativeFindFieldTrialsFullName(String str);

    private static native void nativeFreeFactory(long j);

    private static native RTCCapabilities nativeGetByteCapabilities();

    private static native long nativeGetNativePeerConnectionFactory(long j);

    private static native void nativeInitializeAndroidGlobals();

    private static native void nativeInitializeFieldTrials(String str);

    private static native void nativeInitializeInternalTracer();

    private static native void nativeInjectLoggable(JNILogging jNILogging, int i);

    private static native void nativeOnConfigMessage(long j);

    private static native void nativePrintStackTrace(int i);

    private static native void nativeSetChannelProfileClientRole(long j, int i, int i2);

    private static native void nativeSetHeadsetConnectionStatus(long j, boolean z);

    private static native void nativeShutdownInternalTracer();

    private static native boolean nativeStartAecDump(long j, int i, int i2);

    private static native boolean nativeStartInternalTracingCapture(String str);

    private static native void nativeStartMixAudioLoopback(long j);

    private static native void nativeStopAecDump(long j);

    private static native void nativeStopInternalTracingCapture();

    private static native void nativeStopMixAudioLoopback(long j);

    public static void stopInternalTracingCapture() {
        nativeStopInternalTracingCapture();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RTCCapabilities getByteCapabilities() {
        return nativeGetByteCapabilities();
    }

    private static void initializeInternalTracer() {
        internalTracerInitialized = true;
        nativeInitializeInternalTracer();
    }

    public static void shutdownInternalTracer() {
        internalTracerInitialized = false;
        nativeShutdownInternalTracer();
    }

    public long getNativeOwnedFactoryAndThreads() {
        checkPeerConnectionFactoryExists();
        return this.nativeFactory;
    }

    public long getNativePeerConnectionFactory() {
        checkPeerConnectionFactoryExists();
        return nativeGetNativePeerConnectionFactory(this.nativeFactory);
    }

    public void startMixAudioLoopback() {
        checkPeerConnectionFactoryExists();
        nativeStartMixAudioLoopback(this.nativeFactory);
    }

    public void stopAecDump() {
        checkPeerConnectionFactoryExists();
        nativeStopAecDump(this.nativeFactory);
    }

    public void stopMixAudioLoopback() {
        checkPeerConnectionFactoryExists();
        nativeStopMixAudioLoopback(this.nativeFactory);
    }

    public static void checkInitializeHasBeenCalled() {
        if (!NativeLibrary.isLoaded() || ContextUtils.getApplicationContext() == null) {
            throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    private void checkPeerConnectionFactoryExists() {
        if (this.nativeFactory == 0) {
            throw new IllegalStateException("PeerConnectionFactory has been disposed.");
        }
    }

    private void onNetworkThreadReady() {
        this.networkThread = ThreadInfo.getCurrent();
        staticNetworkThread = this.networkThread;
        Logging.m150047d("PeerConnectionFactory", "onNetworkThreadReady");
    }

    private void onSignalingThreadReady() {
        this.signalingThread = ThreadInfo.getCurrent();
        staticSignalingThread = this.signalingThread;
        Logging.m150047d("PeerConnectionFactory", "onSignalingThreadReady");
    }

    private void onWorkerThreadReady() {
        this.workerThread = ThreadInfo.getCurrent();
        staticWorkerThread = this.workerThread;
        Logging.m150047d("PeerConnectionFactory", "onWorkerThreadReady");
    }

    public static void printStackTraces() {
        printStackTrace(staticNetworkThread, false);
        printStackTrace(staticWorkerThread, false);
        printStackTrace(staticSignalingThread, false);
    }

    public void dispose() {
        NativeLibrary.disposeListener();
        checkPeerConnectionFactoryExists();
        nativeFreeFactory(this.nativeFactory);
        this.networkThread = null;
        this.workerThread = null;
        this.signalingThread = null;
        MediaCodecVideoEncoder.disposeEglContext();
        MediaCodecVideoDecoder.disposeEglContext();
        this.nativeFactory = 0;
    }

    public static void initializeFieldTrials(String str) {
        nativeInitializeFieldTrials(str);
    }

    public static void setNativeLibLoadListener(NativeLibraryLoadListener nativeLibraryLoadListener) {
        NativeLibrary.setLoadListener(nativeLibraryLoadListener);
    }

    public static void onConfigMessage(ConfigMessage configMessage) {
        nativeOnConfigMessage(configMessage.getNativeMessage());
    }

    public static boolean startInternalTracingCapture(String str) {
        return nativeStartInternalTracingCapture(str);
    }

    public VideoSource createVideoSource(boolean z) {
        return createVideoSource(z, true);
    }

    public static String fieldTrialsFindFullName(String str) {
        if (NativeLibrary.isLoaded()) {
            return nativeFindFieldTrialsFullName(str);
        }
        return "";
    }

    public void adjustPlaybackSignalVolume(int i) {
        checkPeerConnectionFactoryExists();
        nativeAdjustPlaybackSignalVolume(this.nativeFactory, i);
    }

    public void adjustRecordingSignalVolume(int i) {
        checkPeerConnectionFactoryExists();
        nativeAdjustRecordingSignalVolume(this.nativeFactory, i);
    }

    public AudioSource createAudioSource(MediaConstraints mediaConstraints) {
        checkPeerConnectionFactoryExists();
        return new AudioSource(nativeCreateAudioSource(this.nativeFactory, mediaConstraints));
    }

    public MediaStream createLocalMediaStream(String str) {
        checkPeerConnectionFactoryExists();
        return new MediaStream(nativeCreateLocalMediaStream(this.nativeFactory, str));
    }

    public void enableLocalAudio(boolean z) {
        checkPeerConnectionFactoryExists();
        nativeEnableLocalAudio(this.nativeFactory, z);
    }

    public void printInternalStackTraces(boolean z) {
        printStackTrace(this.signalingThread, z);
        printStackTrace(this.workerThread, z);
        printStackTrace(this.networkThread, z);
    }

    public void setHeadsetConnectionStatus(boolean z) {
        checkPeerConnectionFactoryExists();
        nativeSetHeadsetConnectionStatus(this.nativeFactory, z);
    }

    PeerConnectionFactory(long j) {
        checkInitializeHasBeenCalled();
        if (j != 0) {
            this.nativeFactory = j;
            return;
        }
        throw new RuntimeException("Failed to initialize PeerConnectionFactory!");
    }

    public static void initialize(InitializationOptions initializationOptions) {
        ContextUtils.initialize(initializationOptions.applicationContext);
        NativeLibrary.initialize(initializationOptions.nativeLibraryLoader, initializationOptions.nativeLibraryName);
        nativeInitializeAndroidGlobals();
        nativeInitializeFieldTrials(initializationOptions.fieldTrials);
        if (initializationOptions.enableInternalTracer && !internalTracerInitialized) {
            initializeInternalTracer();
        }
        if (initializationOptions.loggable != null) {
            Logging.injectLoggable(initializationOptions.loggable, initializationOptions.loggableSeverity);
            nativeInjectLoggable(new JNILogging(initializationOptions.loggable), initializationOptions.loggableSeverity.ordinal());
            return;
        }
        Logging.m150047d("PeerConnectionFactory", "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
        Logging.deleteInjectedLoggable();
        nativeDeleteLoggable();
    }

    public VideoSource createVideoSource(boolean z, boolean z2) {
        checkPeerConnectionFactoryExists();
        return new VideoSource(nativeCreateVideoSource(this.nativeFactory, z, z2));
    }

    public void setChannelProfileClientRole(int i, int i2) {
        checkPeerConnectionFactoryExists();
        nativeSetChannelProfileClientRole(this.nativeFactory, i, i2);
    }

    public boolean startAecDump(int i, int i2) {
        checkPeerConnectionFactoryExists();
        return nativeStartAecDump(this.nativeFactory, i, i2);
    }

    public AudioTrack createAudioTrack(String str, AudioSource audioSource) {
        checkPeerConnectionFactoryExists();
        return new AudioTrack(nativeCreateAudioTrack(this.nativeFactory, str, audioSource.getNativeAudioSource()));
    }

    public PeerConnection createPeerConnection(List<IceServer> list, Observer observer) {
        return createPeerConnection(new RTCConfiguration(list), observer);
    }

    public VideoTrack createVideoTrack(String str, VideoSource videoSource) {
        checkPeerConnectionFactoryExists();
        return new VideoTrack(nativeCreateVideoTrack(this.nativeFactory, str, videoSource.getNativeVideoTrackSource()));
    }

    public PeerConnection createPeerConnection(RTCConfiguration rTCConfiguration, Observer observer) {
        return createPeerConnection(rTCConfiguration, (MediaConstraints) null, observer);
    }

    private static void printStackTrace(ThreadInfo threadInfo, boolean z) {
        if (threadInfo != null) {
            String name = threadInfo.thread.getName();
            StackTraceElement[] stackTrace = threadInfo.thread.getStackTrace();
            if (stackTrace.length > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(" stacktrace:");
                Logging.m150051w("PeerConnectionFactory", sb.toString());
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.m150051w("PeerConnectionFactory", stackTraceElement.toString());
                }
            }
            if (z) {
                Logging.m150051w("PeerConnectionFactory", "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
                StringBuilder sb2 = new StringBuilder("pid: ");
                sb2.append(Process.myPid());
                sb2.append(", tid: ");
                sb2.append(threadInfo.tid);
                sb2.append(", name: ");
                sb2.append(name);
                sb2.append("  >>> WebRTC <<<");
                Logging.m150051w("PeerConnectionFactory", sb2.toString());
                nativePrintStackTrace(threadInfo.tid);
            }
        }
    }

    public PeerConnection createPeerConnection(RTCConfiguration rTCConfiguration, PeerConnectionDependencies peerConnectionDependencies) {
        return createPeerConnectionInternal(rTCConfiguration, null, peerConnectionDependencies.getObserver(), peerConnectionDependencies.getSSLCertificateVerifier());
    }

    public PeerConnection createPeerConnection(RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, Observer observer) {
        return createPeerConnectionInternal(rTCConfiguration, mediaConstraints, observer, null);
    }

    public PeerConnection createPeerConnection(List<IceServer> list, MediaConstraints mediaConstraints, Observer observer) {
        return createPeerConnection(new RTCConfiguration(list), mediaConstraints, observer);
    }

    /* access modifiers changed from: 0000 */
    public PeerConnection createPeerConnectionInternal(RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, Observer observer, SSLCertificateVerifier sSLCertificateVerifier) {
        checkPeerConnectionFactoryExists();
        long createNativePeerConnectionObserver = PeerConnection.createNativePeerConnectionObserver(observer);
        if (createNativePeerConnectionObserver == 0) {
            return null;
        }
        long nativeCreatePeerConnection = nativeCreatePeerConnection(this.nativeFactory, rTCConfiguration, mediaConstraints, createNativePeerConnectionObserver, sSLCertificateVerifier);
        if (nativeCreatePeerConnection == 0) {
            return null;
        }
        return new PeerConnection(nativeCreatePeerConnection);
    }
}
