package net.jpountz.xxhash;

abstract class AbstractStreamingXXHash32Java extends StreamingXXHash32 {
    int memSize;
    final byte[] memory = new byte[16];
    long totalLen;

    /* renamed from: v1 */
    int f123141v1;

    /* renamed from: v2 */
    int f123142v2;

    /* renamed from: v3 */
    int f123143v3;

    /* renamed from: v4 */
    int f123144v4;

    public void reset() {
        this.f123141v1 = (this.seed - 1640531535) - 2048144777;
        this.f123142v2 = this.seed - 2048144777;
        this.f123143v3 = this.seed + 0;
        this.f123144v4 = this.seed - -1640531535;
        this.totalLen = 0;
        this.memSize = 0;
    }

    AbstractStreamingXXHash32Java(int i) {
        super(i);
        reset();
    }
}
