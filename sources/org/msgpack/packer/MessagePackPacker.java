package org.msgpack.packer;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.C48350a;
import org.msgpack.MessageTypeException;
import org.msgpack.p1895io.C48359g;

public class MessagePackPacker extends AbstractPacker {
    protected final C48359g out;
    private PackerStack stack = new PackerStack();

    public void close() throws IOException {
        this.out.close();
    }

    public void flush() throws IOException {
        this.out.flush();
    }

    public Packer writeNil() throws IOException {
        this.out.mo121879a(-64);
        this.stack.reduceCount();
        return this;
    }

    /* access modifiers changed from: protected */
    public void writeDouble(double d) throws IOException {
        this.out.mo121881a(-53, d);
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeFloat(float f) throws IOException {
        this.out.mo121882a(-54, f);
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeBoolean(boolean z) throws IOException {
        if (z) {
            this.out.mo121879a(-61);
        } else {
            this.out.mo121879a(-62);
        }
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeByte(byte b) throws IOException {
        if (b < -32) {
            this.out.mo121880a(-48, b);
        } else {
            this.out.mo121879a(b);
        }
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeString(String str) throws IOException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            writeByteArray(bytes, 0, bytes.length);
            this.stack.reduceCount();
        } catch (UnsupportedEncodingException e) {
            throw new MessageTypeException((Throwable) e);
        }
    }

    public Packer writeArrayBegin(int i) throws IOException {
        if (i < 16) {
            this.out.mo121879a((byte) (i | 144));
        } else if (i < 65536) {
            this.out.mo121885a(-36, (short) i);
        } else {
            this.out.mo121883a(-35, i);
        }
        this.stack.reduceCount();
        this.stack.pushArray(i);
        return this;
    }

    public Packer writeArrayEnd(boolean z) throws IOException {
        if (this.stack.topIsArray()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        writeNil();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("writeArrayEnd(check=true) is called but the array is not end: ");
                    sb.append(topCount);
                    throw new MessageTypeException(sb.toString());
                }
            }
            this.stack.pop();
            return this;
        }
        throw new MessageTypeException("writeArrayEnd() is called but writeArrayBegin() is not called");
    }

    /* access modifiers changed from: protected */
    public void writeBigInteger(BigInteger bigInteger) throws IOException {
        if (bigInteger.bitLength() <= 63) {
            writeLong(bigInteger.longValue());
            this.stack.reduceCount();
        } else if (bigInteger.bitLength() == 64 && bigInteger.signum() == 1) {
            this.out.mo121884a(-49, bigInteger.longValue());
            this.stack.reduceCount();
        } else {
            throw new MessageTypeException("MessagePack can't serialize BigInteger larger than (2^64)-1");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void writeByteBuffer(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        if (remaining < 32) {
            this.out.mo121879a((byte) (remaining | 160));
        } else if (remaining < 65536) {
            this.out.mo121885a(-38, (short) remaining);
        } else {
            this.out.mo121883a(-37, remaining);
        }
        int position = byteBuffer.position();
        try {
            this.out.mo121886a(byteBuffer);
            byteBuffer.position(position);
            this.stack.reduceCount();
        } catch (Throwable th) {
            byteBuffer.position(position);
            throw th;
        }
    }

    public Packer writeMapBegin(int i) throws IOException {
        if (i < 16) {
            this.out.mo121879a((byte) (i | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
        } else if (i < 65536) {
            this.out.mo121885a(-34, (short) i);
        } else {
            this.out.mo121883a(-33, i);
        }
        this.stack.reduceCount();
        this.stack.pushMap(i);
        return this;
    }

    public Packer writeMapEnd(boolean z) throws IOException {
        if (this.stack.topIsMap()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        writeNil();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("writeMapEnd(check=true) is called but the map is not end: ");
                    sb.append(topCount);
                    throw new MessageTypeException(sb.toString());
                }
            }
            this.stack.pop();
            return this;
        }
        throw new MessageTypeException("writeMapEnd() is called but writeMapBegin() is not called");
    }

    /* access modifiers changed from: protected */
    public void writeShort(short s) throws IOException {
        if (s < -32) {
            if (s < -128) {
                this.out.mo121885a(-47, s);
            } else {
                this.out.mo121880a(-48, (byte) s);
            }
        } else if (s < 128) {
            this.out.mo121879a((byte) s);
        } else if (s < 256) {
            this.out.mo121880a(-52, (byte) s);
        } else {
            this.out.mo121885a(-51, s);
        }
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeInt(int i) throws IOException {
        if (i < -32) {
            if (i < -32768) {
                this.out.mo121883a(-46, i);
            } else if (i < -128) {
                this.out.mo121885a(-47, (short) i);
            } else {
                this.out.mo121880a(-48, (byte) i);
            }
        } else if (i < 128) {
            this.out.mo121879a((byte) i);
        } else if (i < 256) {
            this.out.mo121880a(-52, (byte) i);
        } else if (i < 65536) {
            this.out.mo121885a(-51, (short) i);
        } else {
            this.out.mo121883a(-50, i);
        }
        this.stack.reduceCount();
    }

    /* access modifiers changed from: protected */
    public void writeLong(long j) throws IOException {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    this.out.mo121884a(-45, j);
                } else {
                    this.out.mo121883a(-46, (int) j);
                }
            } else if (j < -128) {
                this.out.mo121885a(-47, (short) ((int) j));
            } else {
                this.out.mo121880a(-48, (byte) ((int) j));
            }
        } else if (j < 128) {
            this.out.mo121879a((byte) ((int) j));
        } else if (j < 65536) {
            if (j < 256) {
                this.out.mo121880a(-52, (byte) ((int) j));
            } else {
                this.out.mo121885a(-51, (short) ((int) j));
            }
        } else if (j < 4294967296L) {
            this.out.mo121883a(-50, (int) j);
        } else {
            this.out.mo121884a(-49, j);
        }
        this.stack.reduceCount();
    }

    protected MessagePackPacker(C48350a aVar, C48359g gVar) {
        super(aVar);
        this.out = gVar;
    }

    /* access modifiers changed from: protected */
    public void writeByteArray(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 32) {
            this.out.mo121879a((byte) (i2 | 160));
        } else if (i2 < 65536) {
            this.out.mo121885a(-38, (short) i2);
        } else {
            this.out.mo121883a(-37, i2);
        }
        this.out.mo121887a(bArr, i, i2);
        this.stack.reduceCount();
    }
}
