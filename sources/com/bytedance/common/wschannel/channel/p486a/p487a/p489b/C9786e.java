package com.bytedance.common.wschannel.channel.p486a.p487a.p489b;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.Buffer.UnsafeCursor;
import okio.BufferedSource;
import okio.ByteString;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.e */
final class C9786e {

    /* renamed from: a */
    final boolean f26609a;

    /* renamed from: b */
    final BufferedSource f26610b;

    /* renamed from: c */
    final C9787a f26611c;

    /* renamed from: d */
    boolean f26612d;

    /* renamed from: e */
    int f26613e;

    /* renamed from: f */
    long f26614f;

    /* renamed from: g */
    boolean f26615g;

    /* renamed from: h */
    boolean f26616h;

    /* renamed from: i */
    private final long f26617i;

    /* renamed from: j */
    private final Buffer f26618j = new Buffer();

    /* renamed from: k */
    private final Buffer f26619k = new Buffer();

    /* renamed from: l */
    private final byte[] f26620l;

    /* renamed from: m */
    private final UnsafeCursor f26621m;

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.e$a */
    public interface C9787a {
        /* renamed from: a */
        void mo24202a(int i, String str);

        /* renamed from: a */
        void mo24204a(String str) throws IOException;

        /* renamed from: a */
        void mo24208a(ByteString byteString) throws IOException;

        /* renamed from: b */
        void mo24210b(ByteString byteString);

        /* renamed from: c */
        void mo24212c(ByteString byteString);
    }

    /* renamed from: e */
    private void m28853e() throws IOException {
        while (!this.f26612d) {
            m28850b();
            if (this.f26614f <= this.f26617i) {
                if (!this.f26616h) {
                    break;
                }
                m28851c();
            } else {
                m28849a(this.f26614f);
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24223a() throws IOException {
        m28850b();
        if (this.f26614f > this.f26617i) {
            m28849a(this.f26614f);
        } else if (this.f26616h) {
            m28851c();
        } else {
            m28852d();
        }
    }

    /* renamed from: d */
    private void m28852d() throws IOException {
        int i = this.f26613e;
        if (i == 1 || i == 2) {
            m28854f();
            if (i == 1) {
                this.f26611c.mo24204a(this.f26619k.readUtf8());
            } else {
                this.f26611c.mo24208a(this.f26619k.readByteString());
            }
        } else {
            StringBuilder sb = new StringBuilder("Unknown opcode: ");
            sb.append(Integer.toHexString(i));
            throw new ProtocolException(sb.toString());
        }
    }

    /* renamed from: f */
    private void m28854f() throws IOException {
        while (!this.f26612d) {
            if (this.f26614f > 0) {
                this.f26610b.readFully(this.f26619k, this.f26614f);
                if (!this.f26609a) {
                    this.f26619k.readAndWriteUnsafe(this.f26621m);
                    this.f26621m.seek(this.f26619k.size() - this.f26614f);
                    C9785d.m28847a(this.f26621m, this.f26620l);
                    this.f26621m.close();
                }
            }
            if (!this.f26615g) {
                m28853e();
                if (this.f26613e != 0) {
                    StringBuilder sb = new StringBuilder("Expected continuation opcode. Got: ");
                    sb.append(Integer.toHexString(this.f26613e));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* renamed from: c */
    private void m28851c() throws IOException {
        if (this.f26614f > 0) {
            this.f26610b.readFully(this.f26618j, this.f26614f);
            if (!this.f26609a) {
                this.f26618j.readAndWriteUnsafe(this.f26621m);
                this.f26621m.seek(0);
                C9785d.m28847a(this.f26621m, this.f26620l);
                this.f26621m.close();
            }
        }
        if (this.f26613e == 9) {
            this.f26611c.mo24210b(this.f26618j.readByteString());
        } else if (this.f26613e == 10) {
            this.f26611c.mo24212c(this.f26618j.readByteString());
        } else if (this.f26613e == 8) {
            short s = 1005;
            String str = "";
            long size = this.f26618j.size();
            if (size != 1) {
                if (size != 0) {
                    s = this.f26618j.readShort();
                    str = this.f26618j.readUtf8();
                    String a = C9785d.m28846a(s);
                    if (a != null) {
                        throw new ProtocolException(a);
                    }
                }
                this.f26611c.mo24202a(s, str);
                this.f26612d = true;
                return;
            }
            throw new ProtocolException("Malformed close payload length of 1.");
        } else {
            StringBuilder sb = new StringBuilder("Unknown control opcode: ");
            sb.append(Integer.toHexString(this.f26613e));
            throw new ProtocolException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private void m28850b() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.f26612d) {
            long timeoutNanos = this.f26610b.timeout().timeoutNanos();
            this.f26610b.timeout().clearTimeout();
            try {
                byte readByte = this.f26610b.readByte() & 255;
                this.f26610b.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.f26613e = readByte & 15;
                boolean z6 = false;
                if ((readByte & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f26615g = z;
                if ((readByte & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f26616h = z2;
                if (!this.f26616h || this.f26615g) {
                    if ((readByte & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((readByte & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((readByte & 16) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z3 || z4 || z5) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    byte readByte2 = this.f26610b.readByte() & 255;
                    if ((readByte2 & 128) != 0) {
                        z6 = true;
                    }
                    if (z6 == this.f26609a) {
                        if (this.f26609a) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    this.f26614f = (long) (readByte2 & Byte.MAX_VALUE);
                    if (this.f26614f == 126) {
                        this.f26614f = ((long) this.f26610b.readShort()) & 65535;
                    } else if (this.f26614f == 127) {
                        this.f26614f = this.f26610b.readLong();
                        if (this.f26614f < 0) {
                            StringBuilder sb = new StringBuilder("Frame length 0x");
                            sb.append(Long.toHexString(this.f26614f));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    if (this.f26616h && this.f26614f > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z6) {
                        this.f26610b.readFully(this.f26620l);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f26610b.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    private void m28849a(long j) {
        try {
            this.f26610b.skip(j);
        } catch (Exception unused) {
        }
    }

    C9786e(boolean z, BufferedSource bufferedSource, C9787a aVar, long j) {
        byte[] bArr;
        if (bufferedSource != null) {
            this.f26609a = z;
            this.f26610b = bufferedSource;
            this.f26611c = aVar;
            this.f26617i = j;
            UnsafeCursor unsafeCursor = null;
            if (z) {
                bArr = null;
            } else {
                bArr = new byte[4];
            }
            this.f26620l = bArr;
            if (!z) {
                unsafeCursor = new UnsafeCursor();
            }
            this.f26621m = unsafeCursor;
            return;
        }
        throw new NullPointerException("source == null");
    }
}
