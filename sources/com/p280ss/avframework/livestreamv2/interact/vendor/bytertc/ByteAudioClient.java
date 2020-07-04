package com.p280ss.avframework.livestreamv2.interact.vendor.bytertc;

import com.p280ss.avframework.livestreamv2.interact.audio.AudioCallback;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClient;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.utils.LogUtil;
import com.p280ss.video.rtc.engine.RtcEngine;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteAudioClient */
public class ByteAudioClient {
    public boolean inited;
    public byte[] mByteArray;
    private AudioClientFactory mFactory;
    public AudioClient mParent = this.mFactory.create();
    public boolean sdkStarted;
    public boolean started;

    public void onAudioDeviceRecordStart() {
        this.sdkStarted = true;
    }

    public void onAudioDeviceRecordStop() {
        this.sdkStarted = false;
    }

    public void start() {
        if (this.inited && !this.started && this.mParent != null) {
            this.mParent.start();
            this.started = true;
        }
    }

    public void stop() {
        if (this.inited && this.started && this.mParent != null) {
            this.mParent.stop();
            this.started = false;
        }
    }

    public void release() {
        if (this.inited && this.mParent != null) {
            if (this.started) {
                this.mParent.stop();
            }
            this.mFactory.destroy(this.mParent);
            this.mParent = null;
        }
        this.inited = false;
        this.started = false;
    }

    public ByteAudioClient(AudioClientFactory audioClientFactory, final RtcEngine rtcEngine) {
        this.mFactory = audioClientFactory;
        if (this.mParent.getSampleRate() <= 0 || this.mParent.getChannelCount() <= 0 || this.mParent.getBitWidth() != 16) {
            this.mFactory.destroy(this.mParent);
            this.mParent = null;
            return;
        }
        this.mParent.prepare(new AudioCallback() {
            public boolean updateAudioFrame(Buffer buffer, int i, long j) {
                if (!ByteAudioClient.this.inited || !ByteAudioClient.this.started || !ByteAudioClient.this.sdkStarted || !(buffer instanceof ByteBuffer) || i * 100 != ByteAudioClient.this.mParent.getSampleRate()) {
                    return false;
                }
                ByteBuffer byteBuffer = (ByteBuffer) buffer;
                int channelCount = ByteAudioClient.this.mParent.getChannelCount() * i * 2;
                try {
                    if (ByteAudioClient.this.mByteArray == null || ByteAudioClient.this.mByteArray.length != channelCount) {
                        ByteAudioClient.this.mByteArray = new byte[channelCount];
                    }
                    byteBuffer.get(ByteAudioClient.this.mByteArray, 0, channelCount);
                    boolean pushExternalAudioFrame = rtcEngine.pushExternalAudioFrame(ByteAudioClient.this.mByteArray, i);
                    if (!pushExternalAudioFrame) {
                        StringBuilder sb = new StringBuilder("push external audio frame failed: ");
                        sb.append(pushExternalAudioFrame);
                        LogUtil.m143692e(sb.toString());
                        return false;
                    }
                } catch (Exception unused) {
                }
                return true;
            }
        });
        this.inited = true;
    }
}
