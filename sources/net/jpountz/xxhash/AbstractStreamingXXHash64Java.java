package net.jpountz.xxhash;

abstract class AbstractStreamingXXHash64Java extends StreamingXXHash64 {
    int memSize;
    final byte[] memory = new byte[32];
    long totalLen;

    /* renamed from: v1 */
    long f123145v1;

    /* renamed from: v2 */
    long f123146v2;

    /* renamed from: v3 */
    long f123147v3;

    /* renamed from: v4 */
    long f123148v4;

    public void reset() {
        this.f123145v1 = (this.seed - 7046029288634856825L) - 4417276706812531889L;
        this.f123146v2 = this.seed - 4417276706812531889L;
        this.f123147v3 = this.seed + 0;
        this.f123148v4 = this.seed - -7046029288634856825L;
        this.totalLen = 0;
        this.memSize = 0;
    }

    AbstractStreamingXXHash64Java(long j) {
        super(j);
        reset();
    }
}
