package com.p280ss.ttm.player;

import java.nio.ByteBuffer;

/* renamed from: com.ss.ttm.player.AJCodecBuffer */
public class AJCodecBuffer implements Cloneable {
    public ByteBuffer data;
    public int index;
    public long pts;
    public int size;

    public AJCodecBuffer clone() {
        AJCodecBuffer aJCodecBuffer;
        try {
            aJCodecBuffer = (AJCodecBuffer) super.clone();
        } catch (Throwable unused) {
            aJCodecBuffer = null;
        }
        aJCodecBuffer.size = this.size;
        aJCodecBuffer.pts = this.pts;
        aJCodecBuffer.index = this.index;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.size);
        allocateDirect.put(this.data);
        aJCodecBuffer.data = allocateDirect;
        return aJCodecBuffer;
    }
}
