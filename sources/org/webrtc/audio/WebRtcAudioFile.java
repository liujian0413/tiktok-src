package org.webrtc.audio;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Build.VERSION;
import com.p280ss.android.medialib.camera.ImageFrame;
import java.nio.ByteBuffer;
import org.webrtc.Logging;

class WebRtcAudioFile {
    private boolean eoInputStream;
    private boolean eoOutputStream;
    private int mChannels = 2;
    private byte[] mDecodedData;
    private ByteBuffer mDecodedRAWBuffer;
    private MediaExtractor mExtractor;
    private long mFileLength;
    private ByteBuffer[] mInputBuffers;
    private MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers;
    private int mRetryCount;
    private int mSampleRate = 44100;
    private MediaFormat mTrackFormat;

    public int getChannelCount() {
        return this.mChannels;
    }

    public byte[] getDecodedData() {
        return this.mDecodedData;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public long getFileLength() {
        return this.mFileLength / 1000;
    }

    public long getCurrentFilePosition() {
        return this.mExtractor.getSampleTime() / 1000;
    }

    WebRtcAudioFile() {
        Logging.m150048e("WebRtcAudioRecordFile", "AudioMix WebRtcAudioFile");
    }

    private boolean checkInfoChange() {
        boolean z;
        if (VERSION.SDK_INT < 19) {
            return false;
        }
        try {
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            int integer2 = outputFormat.getInteger("channel-count");
            if (this.mSampleRate == integer) {
                if (this.mChannels == integer2) {
                    z = false;
                    this.mSampleRate = integer;
                    this.mChannels = integer2;
                    return z;
                }
            }
            z = true;
            this.mSampleRate = integer;
            this.mChannels = integer2;
            return z;
        } catch (Exception unused) {
            Logging.m150048e("WebRtcAudioRecordFile", "Error when checking file's new format");
            return false;
        }
    }

    public void uninit() {
        try {
            if (this.mMediaCodec != null) {
                this.mMediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            if (this.mExtractor != null) {
                this.mExtractor.release();
                this.mExtractor = null;
            }
        } catch (Exception unused) {
            Logging.m150048e("WebRtcAudioRecordFile", "Error when releasing audio file stream");
        }
        this.eoOutputStream = false;
        this.eoInputStream = false;
    }

    public boolean readAudioData() {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i;
        try {
            if (!this.eoInputStream) {
                int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(0);
                if (dequeueInputBuffer >= 0) {
                    if (VERSION.SDK_INT >= 21) {
                        byteBuffer2 = this.mMediaCodec.getInputBuffer(dequeueInputBuffer);
                    } else {
                        this.mInputBuffers = this.mMediaCodec.getInputBuffers();
                        byteBuffer2 = this.mInputBuffers[dequeueInputBuffer];
                    }
                    int readSampleData = this.mExtractor.readSampleData(byteBuffer2, 0);
                    if (readSampleData <= 0) {
                        this.eoInputStream = true;
                        i = 0;
                    } else {
                        i = readSampleData;
                    }
                    long sampleTime = this.mExtractor.getSampleTime();
                    int sampleFlags = this.mExtractor.getSampleFlags();
                    if (this.eoInputStream) {
                        sampleFlags |= 4;
                    }
                    this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i, sampleTime, sampleFlags);
                    this.mExtractor.advance();
                }
            }
            if (!this.eoOutputStream) {
                BufferInfo bufferInfo = new BufferInfo();
                int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                this.mDecodedData = null;
                switch (dequeueOutputBuffer) {
                    case ImageFrame.NV21 /*-3*/:
                    case -2:
                        this.mDecodedData = new byte[0];
                        break;
                    case -1:
                        this.mRetryCount++;
                        if (this.mRetryCount >= 100 && (Build.BRAND.toLowerCase().contains("meizu") || Build.MANUFACTURER.toLowerCase().contains("meizu"))) {
                            StringBuilder sb = new StringBuilder("EAGAIN count=");
                            sb.append(this.mRetryCount);
                            sb.append(" presentationTimeUs=");
                            sb.append(bufferInfo.presentationTimeUs);
                            sb.append(" totalUs=");
                            sb.append(this.mFileLength);
                            sb.append(" Force EOS");
                            Logging.m150048e("WebRtcAudioRecordFile", sb.toString());
                            this.eoOutputStream = true;
                        }
                        this.mDecodedData = new byte[0];
                        break;
                    default:
                        this.mRetryCount = 0;
                        if (dequeueOutputBuffer >= 0) {
                            if ((bufferInfo.flags & 4) == 4) {
                                this.eoOutputStream = true;
                            }
                            if (VERSION.SDK_INT >= 21) {
                                byteBuffer = this.mMediaCodec.getOutputBuffer(dequeueOutputBuffer);
                            } else {
                                this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                                ByteBuffer byteBuffer3 = this.mOutputBuffers[dequeueOutputBuffer];
                                byteBuffer3.limit(bufferInfo.size);
                                byteBuffer = byteBuffer3;
                            }
                            this.mDecodedData = new byte[byteBuffer.limit()];
                            byteBuffer.get(this.mDecodedData);
                            byteBuffer.clear();
                            this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                            break;
                        }
                        break;
                }
            }
        } catch (Exception unused) {
            Logging.m150048e("WebRtcAudioRecordFile", "Error when decoding audio file stream");
        }
        return this.eoOutputStream;
    }

    public void setCurrentFilePosition(long j) {
        if (this.eoOutputStream) {
            try {
                this.mMediaCodec.flush();
            } catch (Exception unused) {
                Logging.m150048e("WebRtcAudioRecordFile", "Error when creating audio file decoder");
            }
        }
        this.mExtractor.seekTo(j * 1000, 2);
        this.eoInputStream = false;
        this.eoOutputStream = false;
    }

    /* access modifiers changed from: 0000 */
    public boolean init(String str) {
        String str2 = "WebRtcAudioRecordFile";
        try {
            StringBuilder sb = new StringBuilder("Try to decode audio file : ");
            sb.append(str);
            Logging.m150047d(str2, sb.toString());
            this.mRetryCount = 0;
            this.mExtractor = new MediaExtractor();
            this.mExtractor.setDataSource(str);
            int trackCount = this.mExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                this.mExtractor.unselectTrack(i);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= trackCount) {
                    break;
                }
                this.mTrackFormat = this.mExtractor.getTrackFormat(i2);
                String string = this.mTrackFormat.getString("mime");
                if (string.contains("audio/")) {
                    this.mExtractor.selectTrack(i2);
                    this.mMediaCodec = MediaCodec.createDecoderByType(string);
                    this.mMediaCodec.configure(this.mTrackFormat, null, null, 0);
                    break;
                }
                i2++;
            }
            if (this.mMediaCodec != null) {
                this.mMediaCodec.start();
            }
            this.mChannels = this.mTrackFormat.getInteger("channel-count");
            this.mSampleRate = this.mTrackFormat.getInteger("sample-rate");
            this.mFileLength = this.mTrackFormat.getLong("durationUs");
            return true;
        } catch (Exception unused) {
            Logging.m150048e("WebRtcAudioRecordFile", "Error when creating audio file decoder");
            return false;
        }
    }
}
