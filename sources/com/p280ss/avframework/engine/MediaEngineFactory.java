package com.p280ss.avframework.engine;

import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.EarlyAVLog;
import com.p280ss.avframework.utils.JNINamespace;
import com.p280ss.avframework.utils.JniCommon;
import com.p280ss.avframework.utils.LibraryLoader;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.MediaEngineFactory */
public class MediaEngineFactory {
    private long mNativeObj;

    public static String getVersion() {
        return "6.0.0.11";
    }

    public static void loadLibrary() {
    }

    private native long nativeCreateAudioTrack(long j, AudioSource audioSource, String str);

    private native long nativeCreateMediaEncodeStream(long j, VideoEncoderFactory videoEncoderFactory, Transport transport);

    private native long nativeCreateVideoTrack(long j, VideoSource videoSource, String str);

    private static native long nativeGetMediaEngineFactory();

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
    }

    public static MediaEngineFactory create() {
        long nativeGetMediaEngineFactory = nativeGetMediaEngineFactory();
        if (nativeGetMediaEngineFactory != 0) {
            return new MediaEngineFactory(nativeGetMediaEngineFactory);
        }
        return null;
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            JniCommon.nativeReleaseRef(this.mNativeObj);
            this.mNativeObj = 0;
        }
    }

    static {
        loadLibrary("c++_shared");
        loadLibrary("ttffmpeg");
        loadLibrary("audioeffect");
        loadLibrary("effect");
        loadLibrary("yuv");
        loadLibrary("fdk-aac");
        loadLibrary("lens");
        loadLibrary("ttquic");
        loadLibrary("avframework");
    }

    public static void setLogLevel(int i) {
        AVLog.setLevel(i);
    }

    protected MediaEngineFactory(long j) {
        this.mNativeObj = j;
    }

    public AudioTrack createAudioTrack(AudioSource audioSource) {
        return createAudioTrack(audioSource, null);
    }

    public VideoTrack createVideoTrack(VideoSource videoSource) {
        return createVideoTrack(videoSource, null);
    }

    private static boolean loadLibrary(String str) {
        try {
            LibraryLoader.loadLibrary(str);
            StringBuilder sb = new StringBuilder("Loading library lib");
            sb.append(str);
            sb.append(".so done.");
            EarlyAVLog.println(5, "MediaEngineFactory", sb.toString(), null);
            return true;
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Loading library lib");
            sb2.append(str);
            sb2.append(".so error (");
            sb2.append(th.getMessage());
            sb2.append(")");
            EarlyAVLog.println(5, "MediaEngineFactory", sb2.toString(), th);
            return false;
        }
    }

    public AudioTrack createAudioTrack(AudioSource audioSource, String str) {
        long nativeCreateAudioTrack = nativeCreateAudioTrack(this.mNativeObj, audioSource, str);
        if (nativeCreateAudioTrack != 0) {
            return new AudioTrack(nativeCreateAudioTrack, audioSource);
        }
        return null;
    }

    public MediaEncodeStream createMediaEncodeStream(VideoEncoderFactory videoEncoderFactory, Transport transport) {
        long nativeCreateMediaEncodeStream = nativeCreateMediaEncodeStream(this.mNativeObj, videoEncoderFactory, transport);
        if (nativeCreateMediaEncodeStream != 0) {
            return new MediaEncodeStream(nativeCreateMediaEncodeStream, transport, videoEncoderFactory);
        }
        return null;
    }

    public VideoTrack createVideoTrack(VideoSource videoSource, String str) {
        long nativeCreateVideoTrack = nativeCreateVideoTrack(this.mNativeObj, videoSource, str);
        if (nativeCreateVideoTrack != 0) {
            return new VideoTrack(nativeCreateVideoTrack, videoSource);
        }
        return null;
    }
}
