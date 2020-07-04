package com.p280ss.avframework.livestreamv2.interact.vendor.zego;

import com.p280ss.avframework.livestreamv2.interact.audio.PcmPlayer;
import com.p280ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.zego.zegoavkit2.audiodevice.ZegoExternalAudioDevice;
import com.zego.zegoavkit2.entities.ZegoAudioFrame;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoAudioSink */
public class ZegoAudioSink {
    private boolean bPlay;
    public boolean inited = true;
    private int mChannelCount;
    private EngineCallback mConsumer;
    public long mFetchCount;
    private ZegoAudioFrame mFrame;
    public int mIntervalMs;
    private PcmPlayer mPlayer;
    private int mSampleRate;
    public long mStartTimeMs;
    public boolean started;
    private Thread thread;

    public void release() {
        this.inited = false;
        this.started = false;
        if (this.thread != null) {
            try {
                this.thread.join(300);
            } catch (InterruptedException unused) {
            }
            this.thread = null;
        }
    }

    public void start() {
        if (this.inited && !this.started) {
            ZegoExternalAudioDevice.startRender();
            this.started = true;
            this.thread = new Thread(new Runnable() {
                public void run() {
                    while (ZegoAudioSink.this.inited && ZegoAudioSink.this.started) {
                        if (ZegoAudioSink.this.mStartTimeMs == 0) {
                            ZegoAudioSink.this.mStartTimeMs = System.currentTimeMillis();
                        }
                        ZegoAudioSink.this.FetchAudioFrame(ZegoAudioSink.this.mStartTimeMs + (ZegoAudioSink.this.mFetchCount * ((long) ZegoAudioSink.this.mIntervalMs)));
                        ZegoAudioSink.this.mFetchCount++;
                        long currentTimeMillis = (ZegoAudioSink.this.mStartTimeMs + (ZegoAudioSink.this.mFetchCount * ((long) ZegoAudioSink.this.mIntervalMs))) - System.currentTimeMillis();
                        if (currentTimeMillis > 0) {
                            try {
                                Thread.sleep(currentTimeMillis);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            });
            this.thread.setName("ZegoFetchAudioThread");
            this.thread.start();
        }
    }

    public void stop() {
        if (this.inited && this.started) {
            this.started = false;
            try {
                this.thread.join(300);
            } catch (InterruptedException unused) {
            }
            this.thread = null;
            ZegoExternalAudioDevice.stopRender();
            if (this.mPlayer != null) {
                this.mPlayer.release();
                this.mPlayer = null;
            }
        }
    }

    public void FetchAudioFrame(long j) {
        if (this.mFrame == null) {
            this.mFrame = new ZegoAudioFrame();
            this.mFrame.frameType = 4097;
            this.mFrame.samples = (this.mIntervalMs * this.mSampleRate) / 1000;
            this.mFrame.bytesPerSample = this.mChannelCount * 2;
            this.mFrame.channels = this.mChannelCount;
            this.mFrame.sampleRate = this.mSampleRate;
            this.mFrame.timeStamp = 0.0d;
            this.mFrame.configLen = 0;
            this.mFrame.bufLen = this.mFrame.samples * this.mFrame.bytesPerSample;
            this.mFrame.buffer = ByteBuffer.allocateDirect(this.mFrame.bufLen);
        }
        this.mFrame.buffer.clear();
        if (ZegoExternalAudioDevice.onPlaybackAudioFrame(this.mFrame) && this.mConsumer != null) {
            this.mConsumer.onPlaybackAudioFrame(this.mFrame.buffer, this.mFrame.samples, this.mSampleRate, this.mFrame.channels, j);
        }
        if (this.bPlay) {
            this.mFrame.buffer.position(0);
            this.mFrame.buffer.limit(this.mFrame.bufLen);
            if (this.mPlayer == null) {
                this.mPlayer = new PcmPlayer(this.mSampleRate, this.mChannelCount);
            }
            if (this.mPlayer != null && this.mPlayer.isInited()) {
                this.mPlayer.playPcmData(this.mFrame.buffer);
            }
        }
    }

    public ZegoAudioSink(int i, int i2, int i3, boolean z, EngineCallback engineCallback) {
        this.mSampleRate = i;
        this.mChannelCount = i2;
        this.mIntervalMs = i3;
        this.mConsumer = engineCallback;
        this.bPlay = z;
    }
}
