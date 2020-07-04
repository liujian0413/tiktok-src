package net.jpountz.xxhash;

final class StreamingXXHash64JNI extends StreamingXXHash64 {
    private long state;

    static class Factory implements Factory {
        public static final Factory INSTANCE = new Factory();

        Factory() {
        }

        public StreamingXXHash64 newStreamingHash(long j) {
            return new StreamingXXHash64JNI(j);
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        super.finalize();
        XXHashJNI.XXH64_free(this.state);
        this.state = 0;
    }

    public final long getValue() {
        checkState();
        return XXHashJNI.XXH64_digest(this.state);
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    public final void reset() {
        checkState();
        XXHashJNI.XXH64_free(this.state);
        this.state = XXHashJNI.XXH64_init(this.seed);
    }

    StreamingXXHash64JNI(long j) {
        super(j);
        this.state = XXHashJNI.XXH64_init(j);
    }

    public final void update(byte[] bArr, int i, int i2) {
        checkState();
        XXHashJNI.XXH64_update(this.state, bArr, i, i2);
    }
}
