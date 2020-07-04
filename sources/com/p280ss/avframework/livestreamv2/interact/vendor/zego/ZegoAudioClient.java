package com.p280ss.avframework.livestreamv2.interact.vendor.zego;

import com.p280ss.avframework.livestreamv2.interact.audio.AudioCallback;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClient;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.utils.LogUtil;
import com.zego.zegoavkit2.audiodevice.ZegoExternalAudioDevice;
import com.zego.zegoavkit2.entities.ZegoAudioFrame;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoAudioClient */
public class ZegoAudioClient {
    public boolean inited;
    private AudioClientFactory mFactory;
    public AudioClient mParent = this.mFactory.create();
    public ByteBuffer mTempBuffer;
    public boolean started;

    public void release() {
        if (this.inited && this.mParent != null) {
            if (this.started) {
                stop();
            }
            this.mFactory.destroy(this.mParent);
            this.mParent = null;
        }
        this.inited = false;
        this.started = false;
    }

    public void start() {
        if (this.inited && !this.started && this.mParent != null) {
            ZegoExternalAudioDevice.startCapture();
            this.mParent.start();
            this.started = true;
        }
    }

    public void stop() {
        if (this.inited && this.started && this.mParent != null) {
            this.mParent.stop();
            ZegoExternalAudioDevice.stopCapture();
            this.started = false;
        }
    }

    public ZegoAudioClient(AudioClientFactory audioClientFactory) {
        this.mFactory = audioClientFactory;
        if (this.mParent == null || this.mParent.getSampleRate() <= 0 || this.mParent.getChannelCount() <= 0 || this.mParent.getBitWidth() != 16) {
            this.mFactory.destroy(this.mParent);
            this.mParent = null;
            return;
        }
        this.mParent.prepare(new AudioCallback() {
            public boolean updateAudioFrame(Buffer buffer, int i, long j) {
                if (!ZegoAudioClient.this.inited || !ZegoAudioClient.this.started || !(buffer instanceof ByteBuffer)) {
                    return false;
                }
                int sampleRate = ZegoAudioClient.this.mParent.getSampleRate();
                int channelCount = ZegoAudioClient.this.mParent.getChannelCount();
                int bitWidth = ZegoAudioClient.this.mParent.getBitWidth() / 8;
                int i2 = i * channelCount * bitWidth;
                ByteBuffer byteBuffer = (ByteBuffer) buffer;
                if (!byteBuffer.isDirect()) {
                    if (ZegoAudioClient.this.mTempBuffer == null || ZegoAudioClient.this.mTempBuffer.capacity() < i2) {
                        ZegoAudioClient.this.mTempBuffer = ByteBuffer.allocateDirect(i2);
                    }
                    ZegoAudioClient.this.mTempBuffer.clear();
                    ZegoAudioClient.this.mTempBuffer.put(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i2);
                    ZegoAudioClient.this.mTempBuffer.flip();
                    byteBuffer = ZegoAudioClient.this.mTempBuffer;
                }
                try {
                    ZegoAudioFrame zegoAudioFrame = new ZegoAudioFrame();
                    zegoAudioFrame.frameType = 4097;
                    zegoAudioFrame.samples = i;
                    zegoAudioFrame.bytesPerSample = bitWidth * channelCount;
                    zegoAudioFrame.channels = channelCount;
                    zegoAudioFrame.sampleRate = sampleRate;
                    zegoAudioFrame.timeStamp = (double) j;
                    zegoAudioFrame.configLen = 0;
                    zegoAudioFrame.bufLen = i2;
                    zegoAudioFrame.buffer = byteBuffer;
                    if (!ZegoExternalAudioDevice.onRecordAudioFrame(zegoAudioFrame)) {
                        LogUtil.m143692e("push external audio frame failed");
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
