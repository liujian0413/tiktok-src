package com.p280ss.avframework.livestreamv2.core;

import com.p280ss.avframework.engine.AudioDeviceModule;
import com.p280ss.avframework.engine.AudioDeviceModule.AudioRenderSink;
import com.p280ss.avframework.engine.AudioSink;
import com.p280ss.avframework.livestreamv2.IInputAudioStream;
import com.p280ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.AudioDeviceInputStream */
public class AudioDeviceInputStream extends AudioSink implements IInputAudioStream {
    private final WeakReference<AudioDeviceModule> mAudioDeviceModule;
    private final IInputAudioStream mAudioStream;

    /* renamed from: com.ss.avframework.livestreamv2.core.AudioDeviceInputStream$RenderStream */
    class RenderStream implements IInputAudioStream {
        private AudioRenderSink mAudioRenderSink;
        private boolean mStart;
        private float mVolume = 1.0f;

        public AudioRenderSink getAudioRenderSink() {
            return this.mAudioRenderSink;
        }

        public int getChannel() {
            return AudioDeviceInputStream.this.getChannel();
        }

        public int getSample() {
            return AudioDeviceInputStream.this.getSample();
        }

        public String name() {
            return AudioDeviceInputStream.this.name();
        }

        public AudioMixerDescription getMixerDescription() {
            AudioMixerDescription audioMixerDescription = new AudioMixerDescription();
            audioMixerDescription.volumeCoeff = this.mVolume;
            return audioMixerDescription;
        }

        public void release() {
            this.mAudioRenderSink.release();
            this.mAudioRenderSink = null;
        }

        public int start() {
            this.mStart = true;
            return AudioDeviceInputStream.this.start();
        }

        public int stop() {
            this.mStart = false;
            return AudioDeviceInputStream.this.stop();
        }

        public void setMixerDescription(AudioMixerDescription audioMixerDescription) {
            if (!(audioMixerDescription == null || this.mAudioRenderSink == null)) {
                this.mAudioRenderSink.setVolume(audioMixerDescription.volumeCoeff);
                this.mVolume = audioMixerDescription.volumeCoeff;
            }
        }

        public RenderStream(AudioRenderSink audioRenderSink) {
            this.mAudioRenderSink = audioRenderSink;
        }

        public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
            ByteBuffer byteBuffer2;
            if (this.mAudioRenderSink == null || !this.mStart) {
                return -1;
            }
            if (!byteBuffer.isDirect()) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
                byteBuffer.position(0);
                allocateDirect.position(0);
                allocateDirect.put(byteBuffer);
                byteBuffer2 = allocateDirect;
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.mAudioRenderSink.onData(byteBuffer2, i4 / i2, i, i2, j / 1000);
            return 0;
        }
    }

    public IInputAudioStream getAudioRenderSink() {
        return this.mAudioStream;
    }

    public void onNoData() {
    }

    public int getChannel() {
        return this.mAudioStream.getChannel();
    }

    public AudioMixerDescription getMixerDescription() {
        return this.mAudioStream.getMixerDescription();
    }

    public int getSample() {
        return this.mAudioStream.getSample();
    }

    public String name() {
        return this.mAudioStream.name();
    }

    public int start() {
        return this.mAudioStream.start();
    }

    public int stop() {
        return this.mAudioStream.stop();
    }

    public RenderStream createRenderSteream() {
        if (this.mAudioDeviceModule.get() != null) {
            return new RenderStream(((AudioDeviceModule) this.mAudioDeviceModule.get()).createRenderSink());
        }
        return null;
    }

    public synchronized void release() {
        if (this.mAudioStream != null) {
            this.mAudioStream.release();
            if (this.mAudioDeviceModule.get() != null) {
                ((AudioDeviceModule) this.mAudioDeviceModule.get()).getRenderMixer().removeAudioSink(this);
            }
        }
    }

    public void setMixerDescription(AudioMixerDescription audioMixerDescription) {
        this.mAudioStream.setMixerDescription(audioMixerDescription);
    }

    public AudioDeviceInputStream(AudioDeviceModule audioDeviceModule, IInputAudioStream iInputAudioStream) {
        this.mAudioDeviceModule = new WeakReference<>(audioDeviceModule);
        this.mAudioStream = iInputAudioStream;
        ((AudioDeviceModule) this.mAudioDeviceModule.get()).getRenderMixer().addAudioSink(this);
    }

    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        if (this.mAudioStream != null) {
            this.mAudioStream.pushAudioFrame((ByteBuffer) buffer, i2, i3, 16, i * i3, j * 1000);
        }
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.mAudioStream != null) {
            return this.mAudioStream.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
        }
        return -1;
    }
}
