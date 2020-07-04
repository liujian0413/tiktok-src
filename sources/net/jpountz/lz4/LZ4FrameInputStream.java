package net.jpountz.lz4;

import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import net.jpountz.lz4.LZ4FrameOutputStream.C48234BD;
import net.jpountz.lz4.LZ4FrameOutputStream.FLG;
import net.jpountz.lz4.LZ4FrameOutputStream.FLG.Bits;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

public class LZ4FrameInputStream extends FilterInputStream {
    private ByteBuffer buffer;
    private final XXHash32 checksum;
    private byte[] compressedBuffer;
    private final LZ4SafeDecompressor decompressor;
    private long expectedContentSize;
    private FrameInfo frameInfo;
    private final byte[] headerArray;
    private final ByteBuffer headerBuffer;
    private int maxBlockSize;
    private byte[] rawBuffer;
    private final ByteBuffer readNumberBuff;
    private long totalContentSize;

    public void close() throws IOException {
        super.close();
    }

    public boolean markSupported() {
        return false;
    }

    public int available() throws IOException {
        return this.buffer.remaining();
    }

    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException("reset not supported");
    }

    private boolean nextFrameInfo() throws IOException {
        while (true) {
            int i = 0;
            do {
                int read = this.in.read(this.readNumberBuff.array(), i, 4 - i);
                if (read < 0) {
                    return false;
                }
                i += read;
            } while (i < 4);
            int i2 = this.readNumberBuff.getInt(0);
            if (i2 == 407708164) {
                readHeader();
                return true;
            } else if ((i2 >>> 4) == 25481893) {
                skippableFrame();
            } else {
                throw new IOException("Stream unsupported");
            }
        }
    }

    private void skippableFrame() throws IOException {
        int readInt = readInt(this.in);
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (readInt > 0) {
            int read = this.in.read(bArr, 0, Math.min(readInt, PreloadTask.BYTE_UNIT_NUMBER));
            if (read >= 0) {
                readInt -= read;
            } else {
                throw new IOException("Stream ended prematurely");
            }
        }
    }

    public int read() throws IOException {
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return -1;
            }
            readBlock();
        }
        return this.buffer.get() & 255;
    }

    private void readBlock() throws IOException {
        boolean z;
        byte[] bArr;
        int readInt = readInt(this.in);
        if ((Integer.MIN_VALUE & readInt) == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = readInt & Integer.MAX_VALUE;
        if (i != 0) {
            if (z) {
                bArr = this.compressedBuffer;
            } else {
                bArr = this.rawBuffer;
            }
            byte[] bArr2 = bArr;
            if (i <= this.maxBlockSize) {
                int i2 = 0;
                while (i2 < i) {
                    int read = this.in.read(bArr2, i2, i - i2);
                    if (read >= 0) {
                        i2 += read;
                    } else {
                        throw new IOException("Stream ended prematurely");
                    }
                }
                if (!this.frameInfo.isEnabled(Bits.BLOCK_CHECKSUM) || readInt(this.in) == this.checksum.hash(bArr2, 0, i, 0)) {
                    if (z) {
                        try {
                            i = this.decompressor.decompress(bArr2, 0, i, this.rawBuffer, 0, this.rawBuffer.length);
                        } catch (LZ4Exception e) {
                            throw new IOException(e);
                        }
                    }
                    if (this.frameInfo.isEnabled(Bits.CONTENT_CHECKSUM)) {
                        this.frameInfo.updateStreamHash(this.rawBuffer, 0, i);
                    }
                    this.totalContentSize += (long) i;
                    this.buffer.limit(i);
                    this.buffer.rewind();
                    return;
                }
                throw new IOException("Block checksum mismatch");
            }
            throw new IOException(C1642a.m8035a(Locale.ROOT, "Block size %s exceeded max: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(this.maxBlockSize)}));
        } else if (this.frameInfo.isEnabled(Bits.CONTENT_CHECKSUM) && readInt(this.in) != this.frameInfo.currentStreamHash()) {
            throw new IOException("Content checksum mismatch");
        } else if (!this.frameInfo.isEnabled(Bits.CONTENT_SIZE) || this.expectedContentSize == this.totalContentSize) {
            this.frameInfo.finish();
        } else {
            throw new IOException("Size check mismatch");
        }
    }

    private void readHeader() throws IOException {
        this.headerBuffer.rewind();
        int read = this.in.read();
        if (read >= 0) {
            int read2 = this.in.read();
            if (read2 >= 0) {
                byte b = (byte) (read & NormalGiftView.ALPHA_255);
                FLG fromByte = FLG.fromByte(b);
                this.headerBuffer.put(b);
                byte b2 = (byte) (read2 & NormalGiftView.ALPHA_255);
                C48234BD fromByte2 = C48234BD.fromByte(b2);
                this.headerBuffer.put(b2);
                this.frameInfo = new FrameInfo(fromByte, fromByte2);
                if (fromByte.isEnabled(Bits.CONTENT_SIZE)) {
                    this.expectedContentSize = readLong(this.in);
                    this.headerBuffer.putLong(this.expectedContentSize);
                }
                this.totalContentSize = 0;
                byte hash = (byte) ((this.checksum.hash(this.headerArray, 0, this.headerBuffer.position(), 0) >> 8) & NormalGiftView.ALPHA_255);
                int read3 = this.in.read();
                if (read3 < 0) {
                    throw new IOException("Stream ended prematurely");
                } else if (hash == ((byte) (read3 & NormalGiftView.ALPHA_255))) {
                    this.maxBlockSize = this.frameInfo.getBD().getBlockMaximumSize();
                    this.compressedBuffer = new byte[this.maxBlockSize];
                    this.rawBuffer = new byte[this.maxBlockSize];
                    this.buffer = ByteBuffer.wrap(this.rawBuffer);
                    this.buffer.limit(0);
                } else {
                    throw new IOException("Stream frame descriptor corrupted");
                }
            } else {
                throw new IOException("Stream ended prematurely");
            }
        } else {
            throw new IOException("Stream ended prematurely");
        }
    }

    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    public LZ4FrameInputStream(InputStream inputStream) throws IOException {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), XXHashFactory.fastestInstance().hash32());
    }

    private int readInt(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 4 - i);
            if (read >= 0) {
                i += read;
            } else {
                throw new IOException("Stream ended prematurely");
            }
        } while (i < 4);
        return this.readNumberBuff.getInt(0);
    }

    private long readLong(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 8 - i);
            if (read >= 0) {
                i += read;
            } else {
                throw new IOException("Stream ended prematurely");
            }
        } while (i < 8);
        return this.readNumberBuff.getLong(0);
    }

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return 0;
            }
            readBlock();
        }
        long min = Math.min(j, (long) this.buffer.remaining());
        this.buffer.position(this.buffer.position() + ((int) min));
        return min;
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, XXHash32 xXHash32) throws IOException {
        super(inputStream);
        this.headerArray = new byte[15];
        this.headerBuffer = ByteBuffer.wrap(this.headerArray).order(ByteOrder.LITTLE_ENDIAN);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1;
        this.totalContentSize = 0;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.decompressor = lZ4SafeDecompressor;
        this.checksum = xXHash32;
        nextFrameInfo();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return -1;
            }
            readBlock();
        }
        int min = Math.min(i2, this.buffer.remaining());
        this.buffer.get(bArr, i, min);
        return min;
    }
}
