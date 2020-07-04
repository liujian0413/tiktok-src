package net.jpountz.xxhash;

final class StreamingXXHash32JNI extends StreamingXXHash32 {
    private long state;

    static class Factory implements Factory {
        public static final Factory INSTANCE = new Factory();

        Factory() {
        }

        public StreamingXXHash32 newStreamingHash(int i) {
            return new StreamingXXHash32JNI(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        super.finalize();
        XXHashJNI.XXH32_free(this.state);
        this.state = 0;
    }

    public final int getValue() {
        checkState();
        return XXHashJNI.XXH32_digest(this.state);
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    public final void reset() {
        checkState();
        XXHashJNI.XXH32_free(this.state);
        this.state = XXHashJNI.XXH32_init(this.seed);
    }

    StreamingXXHash32JNI(int i) {
        super(i);
        this.state = XXHashJNI.XXH32_init(i);
    }

    public final void update(byte[] bArr, int i, int i2) {
        checkState();
        XXHashJNI.XXH32_update(this.state, bArr, i, i2);
    }
}
