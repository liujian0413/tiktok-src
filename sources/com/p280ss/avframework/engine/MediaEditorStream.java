package com.p280ss.avframework.engine;

import com.p280ss.avframework.mixer.AudioMixer;
import com.p280ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import com.p280ss.avframework.mixer.VideoMixer;
import com.p280ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.MediaEditorStream */
public class MediaEditorStream {
    private AudioMixer mAudioMixer;
    private long mNativeObj;
    private VideoMixer mVideoMixer;

    private native long nativeGetAudioMixer(long j);

    private native long nativeGetVideoMixer(long j);

    private native boolean nativeSetAudioMixerDescription(long j, String str, AudioMixerDescription audioMixerDescription);

    private native void nativeSetOriginAudioTrack(long j, String str);

    private native void nativeSetOriginVideoTrack(long j, String str);

    private native boolean nativeSetVideoMixerDescription(long j, String str, VideoMixerDescription videoMixerDescription);

    public AudioMixer getAudioMixer() {
        if (this.mAudioMixer == null) {
            this.mAudioMixer = new AudioMixer(nativeGetAudioMixer(this.mNativeObj));
        }
        return this.mAudioMixer;
    }

    public VideoMixer getVideoMixer() {
        if (this.mVideoMixer == null) {
            this.mVideoMixer = new VideoMixer(nativeGetVideoMixer(this.mNativeObj));
        }
        return this.mVideoMixer;
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            if (this.mVideoMixer != null) {
                this.mVideoMixer.release();
                this.mVideoMixer = null;
            }
            if (this.mAudioMixer != null) {
                this.mAudioMixer.release();
                this.mAudioMixer = null;
            }
            this.mNativeObj = 0;
        }
    }

    public MediaEditorStream(long j) {
        this.mNativeObj = j;
    }

    public void setOriginAudioTrack(String str) {
        nativeSetOriginAudioTrack(this.mNativeObj, str);
    }

    public void setOriginVideoTrack(String str) {
        nativeSetOriginVideoTrack(this.mNativeObj, str);
    }

    public boolean setAudioMixerDescription(String str, AudioMixerDescription audioMixerDescription) {
        return nativeSetAudioMixerDescription(this.mNativeObj, str, audioMixerDescription);
    }

    public boolean setVideoMixerDescription(String str, VideoMixerDescription videoMixerDescription) {
        return nativeSetVideoMixerDescription(this.mNativeObj, str, videoMixerDescription);
    }
}
