package com.bytedance.android.p109c.p110a.p111a;

import com.bytedance.android.p109c.p110a.p111a.C2267d.C2269b;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.bytedance.android.c.a.a.g */
public final class C2272g {

    /* renamed from: a */
    public int f7547a = -1;

    /* renamed from: b */
    private C2269b f7548b;

    /* renamed from: c */
    private long f7549c;

    /* renamed from: d */
    private long f7550d = Long.MAX_VALUE;

    /* renamed from: e */
    private int f7551e;

    /* renamed from: f */
    private int f7552f = 2;

    /* renamed from: g */
    private int f7553g = -1;

    /* renamed from: h */
    private long f7554h = -1;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final byte[] mo8060c() throws IOException {
        return this.f7548b.mo8051b(m9772j());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo8061d() throws IOException {
        return this.f7548b.mo8052c(m9772j());
    }

    /* renamed from: j */
    private long m9772j() throws IOException {
        if (this.f7552f == 2) {
            long j = this.f7550d - this.f7549c;
            this.f7552f = 6;
            this.f7549c = this.f7550d;
            this.f7550d = this.f7554h;
            this.f7554h = -1;
            return j;
        }
        StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
        sb.append(this.f7552f);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: a */
    public final long mo8056a() throws IOException {
        if (this.f7552f == 2) {
            int i = this.f7551e + 1;
            this.f7551e = i;
            if (i <= 65) {
                long j = this.f7554h;
                this.f7554h = -1;
                this.f7552f = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo8062e() throws IOException {
        if (this.f7552f == 0 || this.f7552f == 2) {
            int i = m9771i();
            m9770b(0);
            return i;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f7552f);
        throw new ProtocolException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo8064g() throws IOException {
        if (this.f7552f == 5 || this.f7552f == 2) {
            this.f7549c += 4;
            int c = this.f7548b.mo8054c();
            m9770b(5);
            return c;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.f7552f);
        throw new ProtocolException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final long mo8065h() throws IOException {
        if (this.f7552f == 1 || this.f7552f == 2) {
            this.f7549c += 8;
            long d = this.f7548b.mo8055d();
            m9770b(1);
            return d;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.f7552f);
        throw new ProtocolException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final long mo8063f() throws IOException {
        if (this.f7552f == 0 || this.f7552f == 2) {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                this.f7549c++;
                byte b = this.f7548b.mo8050b();
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    m9770b(0);
                    return j;
                }
            }
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f7552f);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: i */
    private int m9771i() throws IOException {
        byte b;
        this.f7549c++;
        byte b2 = this.f7548b.mo8050b();
        if (b2 >= 0) {
            return b2;
        }
        byte b3 = b2 & Byte.MAX_VALUE;
        this.f7549c++;
        byte b4 = this.f7548b.mo8050b();
        if (b4 >= 0) {
            b = b3 | (b4 << 7);
        } else {
            byte b5 = b3 | ((b4 & Byte.MAX_VALUE) << 7);
            this.f7549c++;
            byte b6 = this.f7548b.mo8050b();
            if (b6 >= 0) {
                b = b5 | (b6 << 14);
            } else {
                byte b7 = b5 | ((b6 & Byte.MAX_VALUE) << 14);
                this.f7549c++;
                byte b8 = this.f7548b.mo8050b();
                if (b8 >= 0) {
                    b = b7 | (b8 << 21);
                } else {
                    byte b9 = b7 | ((b8 & Byte.MAX_VALUE) << 21);
                    this.f7549c++;
                    byte b10 = this.f7548b.mo8050b();
                    b = b9 | (b10 << 28);
                    if (b10 < 0) {
                        for (int i = 0; i < 5; i++) {
                            this.f7549c++;
                            if (this.f7548b.mo8050b() >= 0) {
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
    public final int mo8059b() throws IOException {
        if (this.f7552f == 7) {
            this.f7552f = 2;
            return this.f7553g;
        } else if (this.f7552f == 6) {
            while (this.f7549c < this.f7550d && this.f7548b.mo8049a()) {
                int i = m9771i();
                if (i != 0) {
                    this.f7553g = i >> 3;
                    int i2 = i & 7;
                    switch (i2) {
                        case 0:
                            this.f7547a = 0;
                            this.f7552f = 0;
                            return this.f7553g;
                        case 1:
                            this.f7547a = 1;
                            this.f7552f = 1;
                            return this.f7553g;
                        case 2:
                            this.f7547a = 2;
                            this.f7552f = 2;
                            int i3 = m9771i();
                            if (i3 < 0) {
                                StringBuilder sb = new StringBuilder("Negative length: ");
                                sb.append(i3);
                                throw new ProtocolException(sb.toString());
                            } else if (this.f7554h == -1) {
                                this.f7554h = this.f7550d;
                                this.f7550d = this.f7549c + ((long) i3);
                                if (this.f7550d <= this.f7554h) {
                                    return this.f7553g;
                                }
                                throw new EOFException();
                            } else {
                                throw new IllegalStateException();
                            }
                        case 3:
                            m9769a(this.f7553g);
                        case 4:
                            throw new ProtocolException("Unexpected end group");
                        case 5:
                            this.f7547a = 5;
                            this.f7552f = 5;
                            return this.f7553g;
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
    public final C2272g mo8057a(C2269b bVar) {
        this.f7548b = bVar;
        this.f7549c = 0;
        this.f7550d = Long.MAX_VALUE;
        this.f7551e = 0;
        this.f7552f = 2;
        this.f7553g = -1;
        this.f7554h = -1;
        this.f7547a = -1;
        return this;
    }

    /* renamed from: b */
    private void m9770b(int i) throws IOException {
        if (this.f7552f == i) {
            this.f7552f = 6;
        } else if (this.f7549c > this.f7550d) {
            StringBuilder sb = new StringBuilder("Expected to end at ");
            sb.append(this.f7550d);
            sb.append(" but was ");
            sb.append(this.f7549c);
            throw new IOException(sb.toString());
        } else if (this.f7549c == this.f7550d) {
            this.f7550d = this.f7554h;
            this.f7554h = -1;
            this.f7552f = 6;
        } else {
            this.f7552f = 7;
        }
    }

    /* renamed from: a */
    public final void mo8058a(long j) throws IOException {
        if (this.f7552f == 6) {
            int i = this.f7551e - 1;
            this.f7551e = i;
            if (i < 0 || this.f7554h != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.f7549c == this.f7550d || this.f7551e == 0) {
                this.f7550d = j;
            } else {
                StringBuilder sb = new StringBuilder("Expected to end at ");
                sb.append(this.f7550d);
                sb.append(" but was ");
                sb.append(this.f7549c);
                throw new IOException(sb.toString());
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }

    /* renamed from: a */
    private void m9769a(int i) throws IOException {
        while (this.f7549c < this.f7550d && this.f7548b.mo8049a()) {
            int i2 = m9771i();
            if (i2 != 0) {
                int i3 = i2 >> 3;
                int i4 = i2 & 7;
                switch (i4) {
                    case 0:
                        this.f7552f = 0;
                        mo8063f();
                        break;
                    case 1:
                        this.f7552f = 1;
                        mo8065h();
                        break;
                    case 2:
                        long i5 = (long) m9771i();
                        this.f7549c += i5;
                        this.f7548b.mo8048a(i5);
                        break;
                    case 3:
                        m9769a(i3);
                        break;
                    case 4:
                        if (i3 != i) {
                            throw new ProtocolException("Unexpected end group");
                        }
                        return;
                    case 5:
                        this.f7552f = 5;
                        mo8064g();
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
