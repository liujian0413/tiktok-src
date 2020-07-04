package org.msgpack.unpacker;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import org.msgpack.C48350a;
import org.msgpack.MessageTypeException;
import org.msgpack.p1895io.C48353b;
import org.msgpack.p1895io.C48355d;
import org.msgpack.packer.Unconverter;

public class MessagePackUnpacker extends AbstractUnpacker {
    private final ArrayAccept arrayAccept = new ArrayAccept();
    private final BigIntegerAccept bigIntegerAccept = new BigIntegerAccept();
    private final ByteArrayAccept byteArrayAccept = new ByteArrayAccept();
    private final DoubleAccept doubleAccept = new DoubleAccept();
    private byte headByte = -63;

    /* renamed from: in */
    protected final C48355d f123485in;
    private final IntAccept intAccept = new IntAccept();
    private final LongAccept longAccept = new LongAccept();
    private final MapAccept mapAccept = new MapAccept();
    private byte[] raw;
    private int rawFilled;
    private final SkipAccept skipAccept = new SkipAccept();
    private final UnpackerStack stack = new UnpackerStack();
    private final StringAccept stringAccept = new StringAccept();
    private final ValueAccept valueAccept = new ValueAccept();

    public void close() throws IOException {
        this.f123485in.close();
    }

    private byte getHeadByte() throws IOException {
        byte b = this.headByte;
        if (b != -63) {
            return b;
        }
        byte b2 = this.f123485in.mo121892b();
        this.headByte = b2;
        return b2;
    }

    public int readArrayBegin() throws IOException {
        readOne(this.arrayAccept);
        return this.arrayAccept.size;
    }

    public BigInteger readBigInteger() throws IOException {
        readOne(this.bigIntegerAccept);
        return this.bigIntegerAccept.value;
    }

    public byte[] readByteArray() throws IOException {
        readOne(this.byteArrayAccept);
        return this.byteArrayAccept.value;
    }

    public double readDouble() throws IOException {
        readOne(this.doubleAccept);
        return this.doubleAccept.value;
    }

    public float readFloat() throws IOException {
        readOne(this.doubleAccept);
        return (float) this.doubleAccept.value;
    }

    public int readInt() throws IOException {
        readOne(this.intAccept);
        return this.intAccept.value;
    }

    public long readLong() throws IOException {
        readOne(this.longAccept);
        return this.longAccept.value;
    }

    public int readMapBegin() throws IOException {
        readOne(this.mapAccept);
        return this.mapAccept.size;
    }

    public String readString() throws IOException {
        readOne(this.stringAccept);
        return this.stringAccept.value;
    }

    /* access modifiers changed from: protected */
    public boolean tryReadNil() throws IOException {
        this.stack.checkCount();
        if ((getHeadByte() & 255) != 192) {
            return false;
        }
        this.stack.reduceCount();
        this.headByte = -63;
        return true;
    }

    private void readRawBodyCont() throws IOException {
        this.rawFilled += this.f123485in.mo121890a(this.raw, this.rawFilled, this.raw.length - this.rawFilled);
        if (this.rawFilled < this.raw.length) {
            throw new EOFException();
        }
    }

    public boolean readBoolean() throws IOException {
        this.stack.checkCount();
        byte headByte2 = getHeadByte() & 255;
        if (headByte2 == 194) {
            this.stack.reduceCount();
            this.headByte = -63;
            return false;
        } else if (headByte2 == 195) {
            this.stack.reduceCount();
            this.headByte = -63;
            return true;
        } else {
            throw new MessageTypeException("Expected Boolean but got not boolean value");
        }
    }

    public byte readByte() throws IOException {
        this.stack.checkCount();
        readOneWithoutStack(this.intAccept);
        int i = this.intAccept.value;
        if (i < -128 || i > 127) {
            throw new MessageTypeException();
        }
        this.stack.reduceCount();
        return (byte) i;
    }

    public short readShort() throws IOException {
        this.stack.checkCount();
        readOneWithoutStack(this.intAccept);
        int i = this.intAccept.value;
        if (i < -32768 || i > 32767) {
            throw new MessageTypeException();
        }
        this.stack.reduceCount();
        return (short) i;
    }

    public void skip() throws IOException {
        this.stack.checkCount();
        if (readOneWithoutStack(this.skipAccept)) {
            this.stack.reduceCount();
            return;
        }
        int i = this.stack.top - 1;
        while (true) {
            if (this.stack.getTopCount() == 0) {
                this.stack.pop();
                if (this.stack.top <= i) {
                    return;
                }
            } else {
                readOne(this.skipAccept);
            }
        }
    }

    public boolean trySkipNil() throws IOException {
        if (this.stack.top > 0 && this.stack.getTopCount() <= 0) {
            return true;
        }
        if ((getHeadByte() & 255) != 192) {
            return false;
        }
        this.stack.reduceCount();
        this.headByte = -63;
        return true;
    }

    private void readRawBody(int i) throws IOException {
        this.raw = new byte[i];
        this.rawFilled = 0;
        readRawBodyCont();
    }

    /* access modifiers changed from: 0000 */
    public final void readOne(Accept accept) throws IOException {
        this.stack.checkCount();
        if (readOneWithoutStack(accept)) {
            this.stack.reduceCount();
        }
    }

    public void readArrayEnd(boolean z) throws IOException {
        if (this.stack.topIsArray()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        skip();
                    }
                } else {
                    throw new MessageTypeException("readArrayEnd(check=true) is called but the array is not end");
                }
            }
            this.stack.pop();
            return;
        }
        throw new MessageTypeException("readArrayEnd() is called but readArrayBegin() is not called");
    }

    public void readMapEnd(boolean z) throws IOException {
        if (this.stack.topIsMap()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        skip();
                    }
                } else {
                    throw new MessageTypeException("readMapEnd(check=true) is called but the map is not end");
                }
            }
            this.stack.pop();
            return;
        }
        throw new MessageTypeException("readMapEnd() is called but readMapBegin() is not called");
    }

    /* access modifiers changed from: protected */
    public void readValue(Unconverter unconverter) throws IOException {
        if (unconverter.result != null) {
            unconverter.resetResult();
        }
        this.valueAccept.f123488uc = unconverter;
        this.stack.checkCount();
        if (readOneWithoutStack(this.valueAccept)) {
            this.stack.reduceCount();
            if (unconverter.result != null) {
                return;
            }
        }
        while (true) {
            if (this.stack.getTopCount() == 0) {
                if (this.stack.topIsArray()) {
                    unconverter.writeArrayEnd(true);
                    this.stack.pop();
                } else if (this.stack.topIsMap()) {
                    unconverter.writeMapEnd(true);
                    this.stack.pop();
                } else {
                    throw new RuntimeException("invalid stack");
                }
                if (unconverter.result != null) {
                    return;
                }
            } else {
                readOne(this.valueAccept);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean readOneWithoutStack(Accept accept) throws IOException {
        if (this.raw != null) {
            readRawBodyCont();
            accept.acceptRaw(this.raw);
            this.raw = null;
            this.headByte = -63;
            return true;
        }
        byte headByte2 = getHeadByte();
        if ((headByte2 & 128) == 0) {
            accept.acceptInteger((int) headByte2);
            this.headByte = -63;
            return true;
        }
        byte b = headByte2 & 224;
        if (b == 224) {
            accept.acceptInteger((int) headByte2);
            this.headByte = -63;
            return true;
        } else if (b == 160) {
            byte b2 = headByte2 & 31;
            if (b2 == 0) {
                accept.acceptEmptyRaw();
                this.headByte = -63;
                return true;
            }
            if (!tryReferRawBody(accept, b2)) {
                readRawBody(b2);
                accept.acceptRaw(this.raw);
                this.raw = null;
            }
            this.headByte = -63;
            return true;
        } else {
            byte b3 = headByte2 & 240;
            if (b3 == 144) {
                byte b4 = headByte2 & 15;
                accept.acceptArray(b4);
                this.stack.reduceCount();
                this.stack.pushArray(b4);
                this.headByte = -63;
                return false;
            } else if (b3 != 128) {
                return readOneWithoutStackLarge(accept, headByte2);
            } else {
                byte b5 = headByte2 & 15;
                accept.acceptMap(b5);
                this.stack.reduceCount();
                this.stack.pushMap(b5);
                this.headByte = -63;
                return false;
            }
        }
    }

    private boolean tryReferRawBody(C48353b bVar, int i) throws IOException {
        return this.f123485in.mo121891a(bVar, i);
    }

    protected MessagePackUnpacker(C48350a aVar, C48355d dVar) {
        super(aVar);
        this.f123485in = dVar;
    }

    /* JADX INFO: used method not loaded: org.msgpack.unpacker.SizeLimitException.<init>(java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ca, code lost:
        r9 = r7.f123485in.mo121896f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d0, code lost:
        if (r9 != 0) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d2, code lost:
        r8.acceptEmptyRaw();
        r7.f123485in.mo121893c();
        r7.headByte = -63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01dc, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01dd, code lost:
        if (r9 < 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e1, code lost:
        if (r9 >= r7.rawSizeLimit) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e3, code lost:
        r7.f123485in.mo121893c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ec, code lost:
        if (tryReferRawBody(r8, r9) != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ee, code lost:
        readRawBody(r9);
        r8.acceptRaw(r7.raw);
        r7.raw = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f8, code lost:
        r7.headByte = -63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fa, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0216, code lost:
        throw new org.msgpack.unpacker.SizeLimitException(com.C1642a.m8034a("Size of raw (%d) over limit at %d", new java.lang.Object[]{java.lang.Integer.valueOf(r9), java.lang.Integer.valueOf(r7.rawSizeLimit)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0217, code lost:
        r9 = r7.f123485in.mo121895e() & 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x021e, code lost:
        if (r9 != 0) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0220, code lost:
        r8.acceptEmptyRaw();
        r7.f123485in.mo121893c();
        r7.headByte = -63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x022a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x022d, code lost:
        if (r9 >= r7.rawSizeLimit) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x022f, code lost:
        r7.f123485in.mo121893c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0238, code lost:
        if (tryReferRawBody(r8, r9) != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023a, code lost:
        readRawBody(r9);
        r8.acceptRaw(r7.raw);
        r7.raw = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0244, code lost:
        r7.headByte = -63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0246, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0262, code lost:
        throw new org.msgpack.unpacker.SizeLimitException(com.C1642a.m8034a("Size of raw (%d) over limit at %d", new java.lang.Object[]{java.lang.Integer.valueOf(r9), java.lang.Integer.valueOf(r7.rawSizeLimit)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0263, code lost:
        r9 = r7.f123485in.mo121894d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0269, code lost:
        if (r9 != 0) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x026b, code lost:
        r8.acceptEmptyRaw();
        r7.f123485in.mo121893c();
        r7.headByte = -63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0275, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0278, code lost:
        if (r9 >= r7.rawSizeLimit) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027a, code lost:
        r7.f123485in.mo121893c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0283, code lost:
        if (tryReferRawBody(r8, r9) != false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0285, code lost:
        readRawBody(r9);
        r8.acceptRaw(r7.raw);
        r7.raw = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028f, code lost:
        r7.headByte = -63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0291, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ad, code lost:
        throw new org.msgpack.unpacker.SizeLimitException(com.C1642a.m8034a("Size of raw (%d) over limit at %d", new java.lang.Object[]{java.lang.Integer.valueOf(r9), java.lang.Integer.valueOf(r7.rawSizeLimit)}));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean readOneWithoutStackLarge(org.msgpack.unpacker.Accept r8, int r9) throws java.io.IOException {
        /*
            r7 = this;
            r0 = r9 & 255(0xff, float:3.57E-43)
            r1 = 192(0xc0, float:2.69E-43)
            r2 = -63
            r3 = 1
            if (r0 == r1) goto L_0x02ba
            r1 = 0
            r4 = 65535(0xffff, float:9.1834E-41)
            r5 = 2
            r6 = 0
            switch(r0) {
                case 194: goto L_0x02b4;
                case 195: goto L_0x02ae;
                case 196: goto L_0x0263;
                case 197: goto L_0x0217;
                case 198: goto L_0x01ca;
                default: goto L_0x0012;
            }
        L_0x0012:
            switch(r0) {
                case 202: goto L_0x01b9;
                case 203: goto L_0x01a8;
                case 204: goto L_0x0197;
                case 205: goto L_0x0186;
                case 206: goto L_0x0175;
                case 207: goto L_0x0164;
                case 208: goto L_0x0153;
                case 209: goto L_0x0142;
                case 210: goto L_0x0131;
                case 211: goto L_0x0120;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r0) {
                case 217: goto L_0x0263;
                case 218: goto L_0x0217;
                case 219: goto L_0x01ca;
                case 220: goto L_0x00e4;
                case 221: goto L_0x00a7;
                case 222: goto L_0x006b;
                case 223: goto L_0x002e;
                default: goto L_0x0018;
            }
        L_0x0018:
            r7.headByte = r2
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid byte: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
        L_0x002e:
            org.msgpack.io.d r9 = r7.f123485in
            int r9 = r9.mo121896f()
            if (r9 < 0) goto L_0x004f
            int r0 = r7.mapSizeLimit
            if (r9 >= r0) goto L_0x004f
            r8.acceptMap(r9)
            org.msgpack.unpacker.UnpackerStack r8 = r7.stack
            r8.reduceCount()
            org.msgpack.unpacker.UnpackerStack r8 = r7.stack
            r8.pushMap(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r6
        L_0x004f:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            int r9 = r7.mapSizeLimit
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "Size of map (%d) over limit at %d"
            java.lang.String r8 = com.C1642a.m8034a(r9, r8)
            org.msgpack.unpacker.SizeLimitException r9 = new org.msgpack.unpacker.SizeLimitException
            r9.<init>(r8)
            throw r9
        L_0x006b:
            org.msgpack.io.d r9 = r7.f123485in
            short r9 = r9.mo121895e()
            r9 = r9 & r4
            int r0 = r7.mapSizeLimit
            if (r9 >= r0) goto L_0x008b
            r8.acceptMap(r9)
            org.msgpack.unpacker.UnpackerStack r8 = r7.stack
            r8.reduceCount()
            org.msgpack.unpacker.UnpackerStack r8 = r7.stack
            r8.pushMap(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r6
        L_0x008b:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            int r9 = r7.mapSizeLimit
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "Size of map (%d) over limit at %d"
            java.lang.String r8 = com.C1642a.m8034a(r9, r8)
            org.msgpack.unpacker.SizeLimitException r9 = new org.msgpack.unpacker.SizeLimitException
            r9.<init>(r8)
            throw r9
        L_0x00a7:
            org.msgpack.io.d r9 = r7.f123485in
            int r9 = r9.mo121896f()
            if (r9 < 0) goto L_0x00c8
            int r0 = r7.arraySizeLimit
            if (r9 >= r0) goto L_0x00c8
            r8.acceptArray(r9)
            org.msgpack.unpacker.UnpackerStack r8 = r7.stack
            r8.reduceCount()
            org.msgpack.unpacker.UnpackerStack r8 = r7.stack
            r8.pushArray(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r6
        L_0x00c8:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            int r9 = r7.arraySizeLimit
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "Size of array (%d) over limit at %d"
            java.lang.String r8 = com.C1642a.m8034a(r9, r8)
            org.msgpack.unpacker.SizeLimitException r9 = new org.msgpack.unpacker.SizeLimitException
            r9.<init>(r8)
            throw r9
        L_0x00e4:
            org.msgpack.io.d r9 = r7.f123485in
            short r9 = r9.mo121895e()
            r9 = r9 & r4
            int r0 = r7.arraySizeLimit
            if (r9 >= r0) goto L_0x0104
            r8.acceptArray(r9)
            org.msgpack.unpacker.UnpackerStack r8 = r7.stack
            r8.reduceCount()
            org.msgpack.unpacker.UnpackerStack r8 = r7.stack
            r8.pushArray(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r6
        L_0x0104:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            int r9 = r7.arraySizeLimit
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "Size of array (%d) over limit at %d"
            java.lang.String r8 = com.C1642a.m8034a(r9, r8)
            org.msgpack.unpacker.SizeLimitException r9 = new org.msgpack.unpacker.SizeLimitException
            r9.<init>(r8)
            throw r9
        L_0x0120:
            org.msgpack.io.d r9 = r7.f123485in
            long r0 = r9.mo121897g()
            r8.acceptInteger(r0)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x0131:
            org.msgpack.io.d r9 = r7.f123485in
            int r9 = r9.mo121896f()
            r8.acceptInteger(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x0142:
            org.msgpack.io.d r9 = r7.f123485in
            short r9 = r9.mo121895e()
            r8.acceptInteger(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x0153:
            org.msgpack.io.d r9 = r7.f123485in
            byte r9 = r9.mo121894d()
            r8.acceptInteger(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x0164:
            org.msgpack.io.d r9 = r7.f123485in
            long r0 = r9.mo121897g()
            r8.acceptUnsignedInteger(r0)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x0175:
            org.msgpack.io.d r9 = r7.f123485in
            int r9 = r9.mo121896f()
            r8.acceptUnsignedInteger(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x0186:
            org.msgpack.io.d r9 = r7.f123485in
            short r9 = r9.mo121895e()
            r8.acceptUnsignedInteger(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x0197:
            org.msgpack.io.d r9 = r7.f123485in
            byte r9 = r9.mo121894d()
            r8.acceptUnsignedInteger(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x01a8:
            org.msgpack.io.d r9 = r7.f123485in
            double r0 = r9.mo121899i()
            r8.acceptDouble(r0)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x01b9:
            org.msgpack.io.d r9 = r7.f123485in
            float r9 = r9.mo121898h()
            r8.acceptFloat(r9)
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x01ca:
            org.msgpack.io.d r9 = r7.f123485in
            int r9 = r9.mo121896f()
            if (r9 != 0) goto L_0x01dd
            r8.acceptEmptyRaw()
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x01dd:
            if (r9 < 0) goto L_0x01fb
            int r0 = r7.rawSizeLimit
            if (r9 >= r0) goto L_0x01fb
            org.msgpack.io.d r0 = r7.f123485in
            r0.mo121893c()
            boolean r0 = r7.tryReferRawBody(r8, r9)
            if (r0 != 0) goto L_0x01f8
            r7.readRawBody(r9)
            byte[] r9 = r7.raw
            r8.acceptRaw(r9)
            r7.raw = r1
        L_0x01f8:
            r7.headByte = r2
            return r3
        L_0x01fb:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            int r9 = r7.rawSizeLimit
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "Size of raw (%d) over limit at %d"
            java.lang.String r8 = com.C1642a.m8034a(r9, r8)
            org.msgpack.unpacker.SizeLimitException r9 = new org.msgpack.unpacker.SizeLimitException
            r9.<init>(r8)
            throw r9
        L_0x0217:
            org.msgpack.io.d r9 = r7.f123485in
            short r9 = r9.mo121895e()
            r9 = r9 & r4
            if (r9 != 0) goto L_0x022b
            r8.acceptEmptyRaw()
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x022b:
            int r0 = r7.rawSizeLimit
            if (r9 >= r0) goto L_0x0247
            org.msgpack.io.d r0 = r7.f123485in
            r0.mo121893c()
            boolean r0 = r7.tryReferRawBody(r8, r9)
            if (r0 != 0) goto L_0x0244
            r7.readRawBody(r9)
            byte[] r9 = r7.raw
            r8.acceptRaw(r9)
            r7.raw = r1
        L_0x0244:
            r7.headByte = r2
            return r3
        L_0x0247:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            int r9 = r7.rawSizeLimit
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "Size of raw (%d) over limit at %d"
            java.lang.String r8 = com.C1642a.m8034a(r9, r8)
            org.msgpack.unpacker.SizeLimitException r9 = new org.msgpack.unpacker.SizeLimitException
            r9.<init>(r8)
            throw r9
        L_0x0263:
            org.msgpack.io.d r9 = r7.f123485in
            byte r9 = r9.mo121894d()
            if (r9 != 0) goto L_0x0276
            r8.acceptEmptyRaw()
            org.msgpack.io.d r8 = r7.f123485in
            r8.mo121893c()
            r7.headByte = r2
            return r3
        L_0x0276:
            int r0 = r7.rawSizeLimit
            if (r9 >= r0) goto L_0x0292
            org.msgpack.io.d r0 = r7.f123485in
            r0.mo121893c()
            boolean r0 = r7.tryReferRawBody(r8, r9)
            if (r0 != 0) goto L_0x028f
            r7.readRawBody(r9)
            byte[] r9 = r7.raw
            r8.acceptRaw(r9)
            r7.raw = r1
        L_0x028f:
            r7.headByte = r2
            return r3
        L_0x0292:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            int r9 = r7.rawSizeLimit
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "Size of raw (%d) over limit at %d"
            java.lang.String r8 = com.C1642a.m8034a(r9, r8)
            org.msgpack.unpacker.SizeLimitException r9 = new org.msgpack.unpacker.SizeLimitException
            r9.<init>(r8)
            throw r9
        L_0x02ae:
            r8.acceptBoolean(r3)
            r7.headByte = r2
            return r3
        L_0x02b4:
            r8.acceptBoolean(r6)
            r7.headByte = r2
            return r3
        L_0x02ba:
            r8.acceptNil()
            r7.headByte = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.unpacker.MessagePackUnpacker.readOneWithoutStackLarge(org.msgpack.unpacker.Accept, int):boolean");
    }
}
