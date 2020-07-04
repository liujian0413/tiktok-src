package com.p280ss.ttm.player;

import java.nio.ByteBuffer;

/* renamed from: com.ss.ttm.player.AJMediaCodecFrame */
public class AJMediaCodecFrame implements Cloneable {
    public ByteBuffer data;
    public int flags;
    public int index;
    public long pts = -269488145;
    public int size;

    public AJMediaCodecFrame clone() {
        try {
            return (AJMediaCodecFrame) super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }
}
