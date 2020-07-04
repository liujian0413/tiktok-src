package net.jpountz.lz4;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

public final class LZ4BlockInputStream extends FilterInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] buffer;
    private final Checksum checksum;
    private byte[] compressedBuffer;
    private final LZ4FastDecompressor decompressor;
    private boolean finished;

    /* renamed from: o */
    private int f123138o;
    private int originalLen;
    private final boolean stopOnEmptyBlock;

    public final void mark(int i) {
    }

    public final boolean markSupported() {
        return false;
    }

    public final int available() throws IOException {
        return this.originalLen - this.f123138o;
    }

    public final void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    public final int read() throws IOException {
        if (this.finished) {
            return -1;
        }
        if (this.f123138o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.f123138o;
        this.f123138o = i + 1;
        return bArr[i] & 255;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(in=");
        sb.append(this.in);
        sb.append(", decompressor=");
        sb.append(this.decompressor);
        sb.append(", checksum=");
        sb.append(this.checksum);
        sb.append(")");
        return sb.toString();
    }

    private void refill() throws IOException {
        try {
            readFully(this.compressedBuffer, LZ4BlockOutputStream.HEADER_LENGTH);
            int i = 0;
            while (i < LZ4BlockOutputStream.MAGIC_LENGTH) {
                if (this.compressedBuffer[i] == LZ4BlockOutputStream.MAGIC[i]) {
                    i++;
                } else {
                    throw new IOException("Stream is corrupted");
                }
            }
            byte b = this.compressedBuffer[LZ4BlockOutputStream.MAGIC_LENGTH] & 255;
            byte b2 = b & 240;
            int i2 = (b & 15) + 10;
            if (b2 == 16 || b2 == 32) {
                int readIntLE = SafeUtils.readIntLE(this.compressedBuffer, LZ4BlockOutputStream.MAGIC_LENGTH + 1);
                this.originalLen = SafeUtils.readIntLE(this.compressedBuffer, LZ4BlockOutputStream.MAGIC_LENGTH + 5);
                int readIntLE2 = SafeUtils.readIntLE(this.compressedBuffer, LZ4BlockOutputStream.MAGIC_LENGTH + 9);
                if (this.originalLen > (1 << i2) || this.originalLen < 0 || readIntLE < 0 || ((this.originalLen == 0 && readIntLE != 0) || ((this.originalLen != 0 && readIntLE == 0) || (b2 == 16 && this.originalLen != readIntLE)))) {
                    throw new IOException("Stream is corrupted");
                } else if (this.originalLen != 0 || readIntLE != 0) {
                    if (this.buffer.length < this.originalLen) {
                        this.buffer = new byte[Math.max(this.originalLen, (this.buffer.length * 3) / 2)];
                    }
                    if (b2 == 16) {
                        readFully(this.buffer, this.originalLen);
                    } else if (b2 == 32) {
                        if (this.compressedBuffer.length < readIntLE) {
                            this.compressedBuffer = new byte[Math.max(readIntLE, (this.compressedBuffer.length * 3) / 2)];
                        }
                        readFully(this.compressedBuffer, readIntLE);
                        try {
                            if (readIntLE != this.decompressor.decompress(this.compressedBuffer, 0, this.buffer, 0, this.originalLen)) {
                                throw new IOException("Stream is corrupted");
                            }
                        } catch (LZ4Exception e) {
                            throw new IOException("Stream is corrupted", e);
                        }
                    } else {
                        throw new AssertionError();
                    }
                    this.checksum.reset();
                    this.checksum.update(this.buffer, 0, this.originalLen);
                    if (((int) this.checksum.getValue()) == readIntLE2) {
                        this.f123138o = 0;
                        return;
                    }
                    throw new IOException("Stream is corrupted");
                } else if (readIntLE2 != 0) {
                    throw new IOException("Stream is corrupted");
                } else if (!this.stopOnEmptyBlock) {
                    refill();
                } else {
                    this.finished = true;
                }
            } else {
                throw new IOException("Stream is corrupted");
            }
        } catch (EOFException e2) {
            if (!this.stopOnEmptyBlock) {
                this.finished = true;
                return;
            }
            throw e2;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public LZ4BlockInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor());
    }

    public final long skip(long j) throws IOException {
        if (j <= 0 || this.finished) {
            return 0;
        }
        if (this.f123138o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return 0;
        }
        int min = (int) Math.min(j, (long) (this.originalLen - this.f123138o));
        this.f123138o += min;
        return (long) min;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor) {
        this(inputStream, lZ4FastDecompressor, XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), true);
    }

    private void readFully(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = this.in.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new EOFException("Stream ended prematurely");
            }
        }
    }

    public LZ4BlockInputStream(InputStream inputStream, boolean z) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor(), XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), z);
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum2) {
        this(inputStream, lZ4FastDecompressor, checksum2, true);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        SafeUtils.checkRange(bArr, i, i2);
        if (this.finished) {
            return -1;
        }
        if (this.f123138o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        int min = Math.min(i2, this.originalLen - this.f123138o);
        System.arraycopy(this.buffer, this.f123138o, bArr, i, min);
        this.f123138o += min;
        return min;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum2, boolean z) {
        super(inputStream);
        this.decompressor = lZ4FastDecompressor;
        this.checksum = checksum2;
        this.stopOnEmptyBlock = z;
        this.buffer = new byte[0];
        this.compressedBuffer = new byte[LZ4BlockOutputStream.HEADER_LENGTH];
        this.originalLen = 0;
        this.f123138o = 0;
    }
}
