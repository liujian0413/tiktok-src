package com.bytedance.common.wschannel.channel.p486a.p487a.p489b;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.Buffer.UnsafeCursor;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.f */
final class C9788f {

    /* renamed from: a */
    final boolean f26622a;

    /* renamed from: b */
    final Random f26623b;

    /* renamed from: c */
    final BufferedSink f26624c;

    /* renamed from: d */
    final Buffer f26625d;

    /* renamed from: e */
    boolean f26626e;

    /* renamed from: f */
    final Buffer f26627f = new Buffer();

    /* renamed from: g */
    final C9789a f26628g = new C9789a();

    /* renamed from: h */
    boolean f26629h;

    /* renamed from: i */
    private final byte[] f26630i;

    /* renamed from: j */
    private final UnsafeCursor f26631j;

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.f$a */
    final class C9789a implements Sink {

        /* renamed from: a */
        int f26632a;

        /* renamed from: b */
        long f26633b;

        /* renamed from: c */
        boolean f26634c;

        /* renamed from: d */
        boolean f26635d;

        public final Timeout timeout() {
            return C9788f.this.f26624c.timeout();
        }

        public final void close() throws IOException {
            if (!this.f26635d) {
                C9788f.this.mo24225a(this.f26632a, C9788f.this.f26627f.size(), this.f26634c, true);
                this.f26635d = true;
                C9788f.this.f26629h = false;
                return;
            }
            throw new IOException("closed");
        }

        public final void flush() throws IOException {
            if (!this.f26635d) {
                C9788f.this.mo24225a(this.f26632a, C9788f.this.f26627f.size(), this.f26634c, false);
                this.f26634c = false;
                return;
            }
            throw new IOException("closed");
        }

        C9789a() {
        }

        public final void write(Buffer buffer, long j) throws IOException {
            boolean z;
            if (!this.f26635d) {
                C9788f.this.f26627f.write(buffer, j);
                if (!this.f26634c || this.f26633b == -1 || C9788f.this.f26627f.size() <= this.f26633b - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long completeSegmentByteCount = C9788f.this.f26627f.completeSegmentByteCount();
                if (completeSegmentByteCount > 0 && !z) {
                    C9788f.this.mo24225a(this.f26632a, completeSegmentByteCount, this.f26634c, false);
                    this.f26634c = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24227a(ByteString byteString) throws IOException {
        m28861b(9, byteString);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo24228b(ByteString byteString) throws IOException {
        m28861b(10, byteString);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Sink mo24224a(int i, long j) {
        if (!this.f26629h) {
            this.f26629h = true;
            this.f26628g.f26632a = i;
            this.f26628g.f26633b = j;
            this.f26628g.f26634c = true;
            this.f26628g.f26635d = false;
            return this.f26628g;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* renamed from: b */
    private void m28861b(int i, ByteString byteString) throws IOException {
        if (!this.f26626e) {
            int size = byteString.size();
            if (((long) size) <= 125) {
                this.f26625d.writeByte(i | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                if (this.f26622a) {
                    this.f26625d.writeByte(size | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                    this.f26623b.nextBytes(this.f26630i);
                    this.f26625d.write(this.f26630i);
                    if (size > 0) {
                        long size2 = this.f26625d.size();
                        this.f26625d.write(byteString);
                        this.f26625d.readAndWriteUnsafe(this.f26631j);
                        this.f26631j.seek(size2);
                        C9785d.m28847a(this.f26631j, this.f26630i);
                        this.f26631j.close();
                    }
                } else {
                    this.f26625d.writeByte(size);
                    this.f26625d.write(byteString);
                }
                this.f26624c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24226a(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (!(i == 0 && byteString == null)) {
            if (i != 0) {
                C9785d.m28848b(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            m28861b(8, byteString2);
        } finally {
            this.f26626e = true;
        }
    }

    C9788f(boolean z, BufferedSink bufferedSink, Random random) {
        byte[] bArr;
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f26622a = z;
            this.f26624c = bufferedSink;
            this.f26625d = bufferedSink.buffer();
            this.f26623b = random;
            UnsafeCursor unsafeCursor = null;
            if (z) {
                bArr = new byte[4];
            } else {
                bArr = null;
            }
            this.f26630i = bArr;
            if (z) {
                unsafeCursor = new UnsafeCursor();
            }
            this.f26631j = unsafeCursor;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24225a(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.f26626e) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            }
            this.f26625d.writeByte(i);
            if (this.f26622a) {
                i2 = PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            }
            if (j <= 125) {
                this.f26625d.writeByte(((int) j) | i2);
            } else if (j <= 65535) {
                this.f26625d.writeByte(i2 | 126);
                this.f26625d.writeShort((int) j);
            } else {
                this.f26625d.writeByte(i2 | 127);
                this.f26625d.writeLong(j);
            }
            if (this.f26622a) {
                this.f26623b.nextBytes(this.f26630i);
                this.f26625d.write(this.f26630i);
                if (j > 0) {
                    long size = this.f26625d.size();
                    this.f26625d.write(this.f26627f, j);
                    this.f26625d.readAndWriteUnsafe(this.f26631j);
                    this.f26631j.seek(size);
                    C9785d.m28847a(this.f26631j, this.f26630i);
                    this.f26631j.close();
                }
            } else {
                this.f26625d.write(this.f26627f, j);
            }
            this.f26624c.emit();
            return;
        }
        throw new IOException("closed");
    }
}
