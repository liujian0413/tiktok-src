package net.jpountz.xxhash;

import java.util.zip.Checksum;

public abstract class StreamingXXHash32 {
    final int seed;

    interface Factory {
        StreamingXXHash32 newStreamingHash(int i);
    }

    public abstract int getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i, int i2);

    public final Checksum asChecksum() {
        return new Checksum() {
            public void reset() {
                StreamingXXHash32.this.reset();
            }

            public String toString() {
                return StreamingXXHash32.this.toString();
            }

            public long getValue() {
                return ((long) StreamingXXHash32.this.getValue()) & 268435455;
            }

            public void update(int i) {
                StreamingXXHash32.this.update(new byte[]{(byte) i}, 0, 1);
            }

            public void update(byte[] bArr, int i, int i2) {
                StreamingXXHash32.this.update(bArr, i, i2);
            }
        };
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(seed=");
        sb.append(this.seed);
        sb.append(")");
        return sb.toString();
    }

    StreamingXXHash32(int i) {
        this.seed = i;
    }
}
