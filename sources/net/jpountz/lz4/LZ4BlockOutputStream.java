package net.jpountz.lz4;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

public final class LZ4BlockOutputStream extends FilterOutputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int HEADER_LENGTH;
    static final byte[] MAGIC;
    static final int MAGIC_LENGTH;
    private final int blockSize;
    private final byte[] buffer;
    private final Checksum checksum;
    private final byte[] compressedBuffer;
    private final int compressionLevel;
    private final LZ4Compressor compressor;
    private boolean finished;

    /* renamed from: o */
    private int f123139o;
    private final boolean syncFlush;

    private void ensureNotFinished() {
        if (this.finished) {
            throw new IllegalStateException("This stream is already closed");
        }
    }

    static {
        byte[] bArr = {76, 90, 52, 66, 108, 111, 99, 107};
        MAGIC = bArr;
        int length = bArr.length;
        MAGIC_LENGTH = length;
        HEADER_LENGTH = length + 1 + 4 + 4 + 4;
    }

    public final void close() throws IOException {
        if (!this.finished) {
            finish();
        }
        if (this.out != null) {
            this.out.close();
            this.out = null;
        }
    }

    public final void flush() throws IOException {
        if (this.out != null) {
            if (this.syncFlush) {
                flushBufferedData();
            }
            this.out.flush();
        }
    }

    public final void finish() throws IOException {
        ensureNotFinished();
        flushBufferedData();
        this.compressedBuffer[MAGIC_LENGTH] = (byte) (this.compressionLevel | 16);
        writeIntLE(0, this.compressedBuffer, MAGIC_LENGTH + 1);
        writeIntLE(0, this.compressedBuffer, MAGIC_LENGTH + 5);
        writeIntLE(0, this.compressedBuffer, MAGIC_LENGTH + 9);
        this.out.write(this.compressedBuffer, 0, HEADER_LENGTH);
        this.finished = true;
        this.out.flush();
    }

    private void flushBufferedData() throws IOException {
        int i;
        int i2;
        if (this.f123139o != 0) {
            this.checksum.reset();
            this.checksum.update(this.buffer, 0, this.f123139o);
            int value = (int) this.checksum.getValue();
            int compress = this.compressor.compress(this.buffer, 0, this.f123139o, this.compressedBuffer, HEADER_LENGTH);
            if (compress >= this.f123139o) {
                i2 = 16;
                i = this.f123139o;
                System.arraycopy(this.buffer, 0, this.compressedBuffer, HEADER_LENGTH, this.f123139o);
            } else {
                i = compress;
                i2 = 32;
            }
            this.compressedBuffer[MAGIC_LENGTH] = (byte) (i2 | this.compressionLevel);
            writeIntLE(i, this.compressedBuffer, MAGIC_LENGTH + 1);
            writeIntLE(this.f123139o, this.compressedBuffer, MAGIC_LENGTH + 5);
            writeIntLE(value, this.compressedBuffer, MAGIC_LENGTH + 9);
            this.out.write(this.compressedBuffer, 0, HEADER_LENGTH + i);
            this.f123139o = 0;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(out=");
        sb.append(this.out);
        sb.append(", blockSize=");
        sb.append(this.blockSize);
        sb.append(", compressor=");
        sb.append(this.compressor);
        sb.append(", checksum=");
        sb.append(this.checksum);
        sb.append(")");
        return sb.toString();
    }

    public LZ4BlockOutputStream(OutputStream outputStream) {
        this(outputStream, 65536);
    }

    public final void write(byte[] bArr) throws IOException {
        ensureNotFinished();
        write(bArr, 0, bArr.length);
    }

    public final void write(int i) throws IOException {
        ensureNotFinished();
        if (this.f123139o == this.blockSize) {
            flushBufferedData();
        }
        byte[] bArr = this.buffer;
        int i2 = this.f123139o;
        this.f123139o = i2 + 1;
        bArr[i2] = (byte) i;
    }

    private static int compressionLevel(int i) {
        if (i < 64) {
            StringBuilder sb = new StringBuilder("blockSize must be >= 64, got ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 33554432) {
            return Math.max(0, (32 - Integer.numberOfLeadingZeros(i - 1)) - 10);
        } else {
            StringBuilder sb2 = new StringBuilder("blockSize must be <= 33554432, got ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i) {
        this(outputStream, i, LZ4Factory.fastestInstance().fastCompressor());
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i, LZ4Compressor lZ4Compressor) {
        this(outputStream, i, lZ4Compressor, XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), false);
    }

    private static void writeIntLE(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i5] = (byte) (i >>> 24);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        SafeUtils.checkRange(bArr, i, i2);
        ensureNotFinished();
        while (this.f123139o + i2 > this.blockSize) {
            int i3 = this.blockSize - this.f123139o;
            System.arraycopy(bArr, i, this.buffer, this.f123139o, this.blockSize - this.f123139o);
            this.f123139o = this.blockSize;
            flushBufferedData();
            i += i3;
            i2 -= i3;
        }
        System.arraycopy(bArr, i, this.buffer, this.f123139o, i2);
        this.f123139o += i2;
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i, LZ4Compressor lZ4Compressor, Checksum checksum2, boolean z) {
        super(outputStream);
        this.blockSize = i;
        this.compressor = lZ4Compressor;
        this.checksum = checksum2;
        this.compressionLevel = compressionLevel(i);
        this.buffer = new byte[i];
        this.compressedBuffer = new byte[(HEADER_LENGTH + lZ4Compressor.maxCompressedLength(i))];
        this.syncFlush = z;
        this.f123139o = 0;
        this.finished = false;
        System.arraycopy(MAGIC, 0, this.compressedBuffer, 0, MAGIC_LENGTH);
    }
}
