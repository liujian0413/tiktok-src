package com.bytedance.android.p109c.p112b.p113a;

import com.bytedance.android.p109c.p112b.C2288c;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.bytedance.android.c.b.a.c */
public final class C2285c {

    /* renamed from: a */
    private C2288c f7568a;

    /* renamed from: b */
    private long f7569b;

    /* renamed from: c */
    private long f7570c = Long.MAX_VALUE;

    /* renamed from: d */
    private int f7571d;

    /* renamed from: e */
    private int f7572e = 2;

    /* renamed from: f */
    private int f7573f = -1;

    /* renamed from: g */
    private long f7574g = -1;

    /* renamed from: c */
    public final byte[] mo8081c() throws IOException {
        return this.f7568a.mo8093b(m9829j());
    }

    /* renamed from: d */
    public final String mo8082d() throws IOException {
        return this.f7568a.mo8095c(m9829j());
    }

    public C2285c() {
    }

    /* renamed from: j */
    private long m9829j() throws IOException {
        if (this.f7572e == 2) {
            long j = this.f7570c - this.f7569b;
            this.f7572e = 6;
            this.f7569b = this.f7570c;
            this.f7570c = this.f7574g;
            this.f7574g = -1;
            return j;
        }
        StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
        sb.append(this.f7572e);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: a */
    public final long mo8078a() throws IOException {
        if (this.f7572e == 2) {
            int i = this.f7571d + 1;
            this.f7571d = i;
            if (i <= 65) {
                long j = this.f7574g;
                this.f7574g = -1;
                this.f7572e = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    /* renamed from: e */
    public final int mo8083e() throws IOException {
        if (this.f7572e == 0 || this.f7572e == 2) {
            int i = m9828i();
            m9827b(0);
            return i;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f7572e);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: g */
    public final int mo8085g() throws IOException {
        if (this.f7572e == 5 || this.f7572e == 2) {
            this.f7569b += 4;
            int c = this.f7568a.mo8094c();
            m9827b(5);
            return c;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.f7572e);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: h */
    public final long mo8086h() throws IOException {
        if (this.f7572e == 1 || this.f7572e == 2) {
            this.f7569b += 8;
            long d = this.f7568a.mo8096d();
            m9827b(1);
            return d;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.f7572e);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: f */
    public final long mo8084f() throws IOException {
        if (this.f7572e == 0 || this.f7572e == 2) {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                this.f7569b++;
                byte b = this.f7568a.mo8092b();
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    m9827b(0);
                    return j;
                }
            }
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f7572e);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: i */
    private int m9828i() throws IOException {
        byte b;
        this.f7569b++;
        byte b2 = this.f7568a.mo8092b();
        if (b2 >= 0) {
            return b2;
        }
        byte b3 = b2 & Byte.MAX_VALUE;
        this.f7569b++;
        byte b4 = this.f7568a.mo8092b();
        if (b4 >= 0) {
            b = b3 | (b4 << 7);
        } else {
            byte b5 = b3 | ((b4 & Byte.MAX_VALUE) << 7);
            this.f7569b++;
            byte b6 = this.f7568a.mo8092b();
            if (b6 >= 0) {
                b = b5 | (b6 << 14);
            } else {
                byte b7 = b5 | ((b6 & Byte.MAX_VALUE) << 14);
                this.f7569b++;
                byte b8 = this.f7568a.mo8092b();
                if (b8 >= 0) {
                    b = b7 | (b8 << 21);
                } else {
                    byte b9 = b7 | ((b8 & Byte.MAX_VALUE) << 21);
                    this.f7569b++;
                    byte b10 = this.f7568a.mo8092b();
                    b = b9 | (b10 << 28);
                    if (b10 < 0) {
                        for (int i = 0; i < 5; i++) {
                            this.f7569b++;
                            if (this.f7568a.mo8092b() >= 0) {
                                return b;
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                }
            }
        }
        return b;
    }

    /* renamed from: b */
    public final int mo8080b() throws IOException {
        if (this.f7572e == 7) {
            this.f7572e = 2;
            return this.f7573f;
        } else if (this.f7572e == 6) {
            while (this.f7569b < this.f7570c && !this.f7568a.mo8091a()) {
                int i = m9828i();
                if (i != 0) {
                    this.f7573f = i >> 3;
                    int i2 = i & 7;
                    switch (i2) {
                        case 0:
                            this.f7572e = 0;
                            return this.f7573f;
                        case 1:
                            this.f7572e = 1;
                            return this.f7573f;
                        case 2:
                            this.f7572e = 2;
                            int i3 = m9828i();
                            if (i3 < 0) {
                                StringBuilder sb = new StringBuilder("Negative length: ");
                                sb.append(i3);
                                throw new ProtocolException(sb.toString());
                            } else if (this.f7574g == -1) {
                                this.f7574g = this.f7570c;
                                this.f7570c = this.f7569b + ((long) i3);
                                if (this.f7570c <= this.f7574g) {
                                    return this.f7573f;
                                }
                                throw new EOFException();
                            } else {
                                throw new IllegalStateException();
                            }
                        case 3:
                            m9826a(this.f7573f);
                        case 4:
                            throw new ProtocolException("Unexpected end group");
                        case 5:
                            this.f7572e = 5;
                            return this.f7573f;
                        default:
                            StringBuilder sb2 = new StringBuilder("Unexpected field encoding: ");
                            sb2.append(i2);
                            throw new ProtocolException(sb2.toString());
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    /* renamed from: a */
    public final C2285c mo8079a(C2288c cVar) {
        this.f7568a = cVar;
        this.f7569b = 0;
        this.f7570c = Long.MAX_VALUE;
        this.f7571d = 0;
        this.f7572e = 2;
        this.f7573f = -1;
        this.f7574g = -1;
        return this;
    }

    public C2285c(C2288c cVar) {
        this.f7568a = cVar;
    }

    /* renamed from: b */
    private void m9827b(int i) throws IOException {
        if (this.f7572e == i) {
            this.f7572e = 6;
        } else if (this.f7569b > this.f7570c) {
            StringBuilder sb = new StringBuilder("Expected to end at ");
            sb.append(this.f7570c);
            sb.append(" but was ");
            sb.append(this.f7569b);
            throw new IOException(sb.toString());
        } else if (this.f7569b == this.f7570c) {
            this.f7570c = this.f7574g;
            this.f7574g = -1;
            this.f7572e = 6;
        } else {
            this.f7572e = 7;
        }
    }

    /* renamed from: a */
    private void m9826a(int i) throws IOException {
        while (this.f7569b < this.f7570c && !this.f7568a.mo8091a()) {
            int i2 = m9828i();
            if (i2 != 0) {
                int i3 = i2 >> 3;
                int i4 = i2 & 7;
                switch (i4) {
                    case 0:
                        this.f7572e = 0;
                        mo8084f();
                        break;
                    case 1:
                        this.f7572e = 1;
                        mo8086h();
                        break;
                    case 2:
                        long i5 = (long) m9828i();
                        this.f7569b += i5;
                        this.f7568a.mo8090a(i5);
                        break;
                    case 3:
                        m9826a(i3);
                        break;
                    case 4:
                        if (i3 != i) {
                            throw new ProtocolException("Unexpected end group");
                        }
                        return;
                    case 5:
                        this.f7572e = 5;
                        mo8085g();
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unexpected field encoding: ");
                        sb.append(i4);
                        throw new ProtocolException(sb.toString());
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }
}
