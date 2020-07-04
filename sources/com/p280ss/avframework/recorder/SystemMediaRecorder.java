package com.p280ss.avframework.recorder;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build.VERSION;
import com.p280ss.avframework.utils.AVLog;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.recorder.SystemMediaRecorder */
public class SystemMediaRecorder implements MediaRecorder {
    private String mFileName;
    private int mFormat;
    private MediaMuxer mMediaMuxer;

    public int start() {
        if (this.mMediaMuxer == null) {
            return -1;
        }
        try {
            this.mMediaMuxer.start();
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public void release() {
        if (this.mMediaMuxer != null) {
            try {
                this.mMediaMuxer.release();
            } catch (Exception e) {
                AVLog.m143700w("SystemMediaRecorder", e.toString());
            }
            this.mMediaMuxer = null;
        }
    }

    public int stop() {
        if (this.mMediaMuxer != null) {
            try {
                this.mMediaMuxer.stop();
            } catch (Exception e) {
                AVLog.m143700w("SystemMediaRecorder", e.toString());
            }
        }
        return 0;
    }

    public int addTrack(MediaFormat mediaFormat) {
        if (this.mMediaMuxer != null) {
            return this.mMediaMuxer.addTrack(mediaFormat);
        }
        return -1;
    }

    public SystemMediaRecorder(String str, int i) {
        this.mFileName = str;
        this.mFormat = i;
        try {
            if (VERSION.SDK_INT >= 18) {
                this.mMediaMuxer = new MediaMuxer(this.mFileName, this.mFormat);
            }
        } catch (IOException unused) {
            this.mMediaMuxer = null;
        }
    }

    public int writeSampleData(int i, ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        if (this.mMediaMuxer != null) {
            try {
                this.mMediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
            } catch (Exception e) {
                AVLog.m143697e("SystemMediaRecorder", e.toString());
                return -1;
            }
        }
        return 0;
    }
}
