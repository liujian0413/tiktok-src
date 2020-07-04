package com.p280ss.android.websocket.p1779a.p1780a;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.websocket.p1779a.C45405a;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* renamed from: com.ss.android.websocket.a.a.c */
public final class C45411c {

    /* renamed from: a */
    public final BufferedSource f116936a;

    /* renamed from: b */
    public boolean f116937b;

    /* renamed from: c */
    public boolean f116938c;

    /* renamed from: d */
    public int f116939d;

    /* renamed from: e */
    public long f116940e;

    /* renamed from: f */
    public long f116941f;

    /* renamed from: g */
    public boolean f116942g;

    /* renamed from: h */
    public boolean f116943h;

    /* renamed from: i */
    public final byte[] f116944i = new byte[4];

    /* renamed from: j */
    public final byte[] f116945j = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];

    /* renamed from: k */
    private final boolean f116946k;

    /* renamed from: l */
    private final C45413a f116947l;

    /* renamed from: m */
    private final Source f116948m = new C45414b();

    /* renamed from: n */
    private boolean f116949n;

    /* renamed from: com.ss.android.websocket.a.a.c$a */
    public interface C45413a {
        /* renamed from: a */
        void mo108760a(int i, String str);

        /* renamed from: a */
        void mo108761a(ResponseBody responseBody) throws IOException;

        /* renamed from: a */
        void mo108762a(Buffer buffer);

        /* renamed from: b */
        void mo108763b(Buffer buffer);
    }

    /* renamed from: com.ss.android.websocket.a.a.c$b */
    final class C45414b implements Source {
        public final Timeout timeout() {
            return C45411c.this.f116936a.timeout();
        }

        public final void close() throws IOException {
            if (!C45411c.this.f116938c) {
                C45411c.this.f116938c = true;
                if (!C45411c.this.f116937b) {
                    C45411c.this.f116936a.skip(C45411c.this.f116940e - C45411c.this.f116941f);
                    while (!C45411c.this.f116942g) {
                        C45411c.this.mo108765b();
                        C45411c.this.f116936a.skip(C45411c.this.f116940e);
                    }
                }
            }
        }

        private C45414b() {
        }

        public final long read(Buffer buffer, long j) throws IOException {
            long j2;
            if (C45411c.this.f116937b) {
                throw new IOException("closed");
            } else if (!C45411c.this.f116938c) {
                if (C45411c.this.f116941f == C45411c.this.f116940e) {
                    if (C45411c.this.f116942g) {
                        return -1;
                    }
                    C45411c.this.mo108765b();
                    if (C45411c.this.f116939d != 0) {
                        StringBuilder sb = new StringBuilder("Expected continuation opcode. Got: ");
                        sb.append(Integer.toHexString(C45411c.this.f116939d));
                        throw new ProtocolException(sb.toString());
                    } else if (C45411c.this.f116942g && C45411c.this.f116940e == 0) {
                        return -1;
                    }
                }
                long min = Math.min(j, C45411c.this.f116940e - C45411c.this.f116941f);
                if (C45411c.this.f116943h) {
                    j2 = (long) C45411c.this.f116936a.read(C45411c.this.f116945j, 0, (int) Math.min(min, (long) C45411c.this.f116945j.length));
                    if (j2 != -1) {
                        C45410b.m143605a(C45411c.this.f116945j, j2, C45411c.this.f116944i, C45411c.this.f116941f);
                        buffer.write(C45411c.this.f116945j, 0, (int) j2);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    j2 = C45411c.this.f116936a.read(buffer, min);
                    if (j2 == -1) {
                        throw new EOFException();
                    }
                }
                C45411c.this.f116941f += j2;
                return j2;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: a */
    public final void mo108764a() throws IOException {
        m143606c();
        if (this.f116949n) {
            m143607d();
        } else {
            m143608e();
        }
    }

    /* renamed from: b */
    public final void mo108765b() throws IOException {
        while (!this.f116937b) {
            m143606c();
            if (this.f116949n) {
                m143607d();
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private void m143608e() throws IOException {
        final MediaType mediaType;
        switch (this.f116939d) {
            case 1:
                mediaType = C45405a.f116918a;
                break;
            case 2:
                mediaType = C45405a.f116919b;
                break;
            default:
                StringBuilder sb = new StringBuilder("Unknown opcode: ");
                sb.append(Integer.toHexString(this.f116939d));
                throw new ProtocolException(sb.toString());
        }
        final BufferedSource buffer = Okio.buffer(this.f116948m);
        C454121 r2 = new ResponseBody() {
            public final long contentLength() {
                return -1;
            }

            public final MediaType contentType() {
                return mediaType;
            }

            public final BufferedSource source() {
                return buffer;
            }
        };
        this.f116938c = false;
        this.f116947l.mo108761a((ResponseBody) r2);
        if (!this.f116938c) {
            throw new IllegalStateException("Listener failed to call close on message payload.");
        }
    }

    /* renamed from: c */
    private void m143606c() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!this.f116937b) {
            byte readByte = this.f116936a.readByte() & 255;
            this.f116939d = readByte & 15;
            boolean z6 = false;
            if ((readByte & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f116942g = z;
            if ((readByte & 8) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f116949n = z2;
            if (!this.f116949n || this.f116942g) {
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
                byte readByte2 = this.f116936a.readByte() & 255;
                if ((readByte2 & 128) != 0) {
                    z6 = true;
                }
                this.f116943h = z6;
                if (this.f116943h != this.f116946k) {
                    this.f116940e = (long) (readByte2 & Byte.MAX_VALUE);
                    if (this.f116940e == 126) {
                        this.f116940e = ((long) this.f116936a.readShort()) & 65535;
                    } else if (this.f116940e == 127) {
                        this.f116940e = this.f116936a.readLong();
                        if (this.f116940e < 0) {
                            StringBuilder sb = new StringBuilder("Frame length 0x");
                            sb.append(Long.toHexString(this.f116940e));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    this.f116941f = 0;
                    if (this.f116949n && this.f116940e > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (this.f116943h) {
                        this.f116936a.readFully(this.f116944i);
                    }
                } else {
                    throw new ProtocolException("Client-sent frames must be masked. Server sent must not.");
                }
            } else {
                throw new ProtocolException("Control frames must be final.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: d */
    private void m143607d() throws IOException {
        Buffer buffer;
        if (this.f116941f < this.f116940e) {
            buffer = new Buffer();
            if (this.f116946k) {
                this.f116936a.readFully(buffer, this.f116940e);
            } else {
                while (this.f116941f < this.f116940e) {
                    int read = this.f116936a.read(this.f116945j, 0, (int) Math.min(this.f116940e - this.f116941f, (long) this.f116945j.length));
                    if (read != -1) {
                        long j = (long) read;
                        C45410b.m143605a(this.f116945j, j, this.f116944i, this.f116941f);
                        buffer.write(this.f116945j, 0, read);
                        this.f116941f += j;
                    } else {
                        throw new EOFException();
                    }
                }
            }
        } else {
            buffer = null;
        }
        switch (this.f116939d) {
            case 8:
                short s = 1000;
                String str = "";
                if (buffer != null) {
                    long size = buffer.size();
                    if (size == 1) {
                        throw new ProtocolException("Malformed close payload length of 1.");
                    } else if (size != 0) {
                        s = buffer.readShort();
                        C45410b.m143604a(s, false);
                        str = buffer.readUtf8();
                    }
                }
                this.f116947l.mo108760a(s, str);
                this.f116937b = true;
                return;
            case 9:
                this.f116947l.mo108762a(buffer);
                return;
            case 10:
                this.f116947l.mo108763b(buffer);
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown control opcode: ");
                sb.append(Integer.toHexString(this.f116939d));
                throw new ProtocolException(sb.toString());
        }
    }

    public C45411c(boolean z, BufferedSource bufferedSource, C45413a aVar) {
        if (bufferedSource != null) {
            this.f116946k = z;
            this.f116936a = bufferedSource;
            this.f116947l = aVar;
            return;
        }
        throw new NullPointerException("source == null");
    }
}
