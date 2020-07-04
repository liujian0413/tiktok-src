package org.webrtc;

public class AudioFrame {
    private int mBitsPerSample;
    private int mChannels;
    private byte[] mData;
    private int mSampleRate;
    private int mSamplesPerChannel;
    private int mSpeechType;

    public int getBitsPerSample() {
        return this.mBitsPerSample;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public byte[] getData() {
        return this.mData;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getSamplesPerChannel() {
        return this.mSamplesPerChannel;
    }

    public int getSpeechType() {
        return this.mSpeechType;
    }

    public AudioFrame(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.mData = bArr;
        this.mBitsPerSample = i;
        this.mSamplesPerChannel = i4;
        this.mSampleRate = i2;
        this.mChannels = i3;
        this.mSpeechType = i5;
    }
}
