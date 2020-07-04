package com.p280ss.avframework.livestreamv2.interact.audio;

import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.interact.audio.PcmPlayer */
public class PcmPlayer {
    private boolean inited;
    private AudioTrack mAudioTrack;

    public boolean isInited() {
        return this.inited;
    }

    public void release() {
        if (this.mAudioTrack != null) {
            if (this.mAudioTrack.getState() == 1) {
                this.mAudioTrack.stop();
                this.mAudioTrack.release();
            }
            this.mAudioTrack = null;
        }
    }

    public void playPcmData(ByteBuffer byteBuffer) {
        if (this.inited) {
            this.mAudioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
    }

    public PcmPlayer(int i, int i2) {
        int i3;
        String str;
        if (i2 == 1 || i2 == 2) {
            if (i2 == 1) {
                i3 = 4;
            } else {
                i3 = 12;
            }
            try {
                AudioTrack audioTrack = new AudioTrack(3, i, i3, 2, AudioTrack.getMinBufferSize(i, i3, 2), 1);
                this.mAudioTrack = audioTrack;
                if (this.mAudioTrack != null) {
                    if (this.mAudioTrack.getState() == 1) {
                        this.mAudioTrack.play();
                        this.inited = true;
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder("Create AudioTrack failed");
                if (this.mAudioTrack == null) {
                    str = "!";
                } else {
                    StringBuilder sb2 = new StringBuilder(": state ");
                    sb2.append(this.mAudioTrack.getState());
                    str = sb2.toString();
                }
                sb.append(str);
            } catch (Exception unused) {
            }
        }
    }

    public void playPcmData(byte[] bArr, int i, int i2) {
        if (this.inited) {
            this.mAudioTrack.write(bArr, i, i2);
        }
    }
}
