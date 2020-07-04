package com.p280ss.video.rtc.engine.video;

import java.nio.ByteBuffer;

/* renamed from: com.ss.video.rtc.engine.video.RtcI420Buffer */
public class RtcI420Buffer {
    private ByteBuffer dataU;
    private ByteBuffer dataV;
    private ByteBuffer dataY;
    private int height;
    private int width;

    public ByteBuffer getDataU() {
        return this.dataU;
    }

    public ByteBuffer getDataV() {
        return this.dataV;
    }

    public ByteBuffer getDataY() {
        return this.dataY;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDataU(ByteBuffer byteBuffer) {
        this.dataU = byteBuffer;
    }

    public void setDataV(ByteBuffer byteBuffer) {
        this.dataV = byteBuffer;
    }

    public void setDataY(ByteBuffer byteBuffer) {
        this.dataY = byteBuffer;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
