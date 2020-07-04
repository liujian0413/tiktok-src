package com.p280ss.android.websocket.p1779a.p1780a;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Timeout;

/* renamed from: com.ss.android.websocket.a.a.d */
public final class C45415d {

    /* renamed from: d */
    static final /* synthetic */ boolean f116954d = (!C45415d.class.desiredAssertionStatus());

    /* renamed from: a */
    public final BufferedSink f116955a;

    /* renamed from: b */
    public final Buffer f116956b = new Buffer();

    /* renamed from: c */
    public boolean f116957c;

    /* renamed from: e */
    private final boolean f116958e;

    /* renamed from: f */
    private final Random f116959f;

    /* renamed from: g */
    private boolean f116960g;

    /* renamed from: h */
    private final C45417a f116961h;

    /* renamed from: i */
    private final byte[] f116962i;

    /* renamed from: j */
    private final byte[] f116963j;

    /* renamed from: com.ss.android.websocket.a.a.d$a */
    final class C45417a implements Sink {

        /* renamed from: a */
        public int f116964a;

        /* renamed from: b */
        public long f116965b;

        /* renamed from: c */
        public boolean f116966c;

        /* renamed from: d */
        public boolean f116967d;

        public final Timeout timeout() {
            return C45415d.this.f116955a.timeout();
        }

        public final void close() throws IOException {
            if (!this.f116967d) {
                synchronized (C45415d.this) {
                    C45415d.this.mo108767a(this.f116964a, C45415d.this.f116956b.size(), this.f116966c, true);
                }
                this.f116967d = true;
                C45415d.this.f116957c = false;
                return;
            }
            throw new IOException("closed");
        }

        public final void flush() throws IOException {
            if (!this.f116967d) {
                synchronized (C45415d.this) {
                    C45415d.this.mo108767a(this.f116964a, C45415d.this.f116956b.size(), this.f116966c, false);
                }
                this.f116966c = false;
                return;
            }
            throw new IOException("closed");
        }

        private C45417a() {
        }

        public final void write(Buffer buffer, long j) throws IOException {
            boolean z;
            if (!this.f116967d) {
                C45415d.this.f116956b.write(buffer, j);
                if (!this.f116966c || this.f116965b == -1 || C45415d.this.f116956b.size() <= this.f116965b - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long completeSegmentByteCount = C45415d.this.f116956b.completeSegmentByteCount();
                if (completeSegmentByteCount > 0 && !z) {
                    synchronized (C45415d.this) {
                        C45415d.this.mo108767a(this.f116964a, completeSegmentByteCount, this.f116966c, false);
                    }
                    this.f116966c = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final void mo108769a(Buffer buffer) throws IOException {
        synchronized (this) {
            m143615a(9, buffer);
        }
    }

    /* renamed from: b */
    public final void mo108770b(Buffer buffer) throws IOException {
        synchronized (this) {
            m143615a(10, buffer);
        }
    }

    /* renamed from: a */
    public final Sink mo108766a(int i, long j) {
        if (!this.f116957c) {
            this.f116957c = true;
            this.f116961h.f116964a = i;
            this.f116961h.f116965b = j;
            this.f116961h.f116966c = true;
            this.f116961h.f116967d = false;
            return this.f116961h;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* renamed from: a */
    private void m143615a(int i, Buffer buffer) throws IOException {
        if (!f116954d && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (!this.f116960g) {
            int i2 = 0;
            if (buffer != null) {
                i2 = (int) buffer.size();
                if (((long) i2) > 125) {
                    throw new IllegalArgumentException("Payload size must be less than or equal to 125");
                }
            }
            this.f116955a.writeByte(i | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (this.f116958e) {
                this.f116955a.writeByte(i2 | PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                this.f116959f.nextBytes(this.f116962i);
                this.f116955a.write(this.f116962i);
                if (buffer != null) {
                    m143616a((BufferedSource) buffer, (long) i2);
                }
            } else {
                this.f116955a.writeByte(i2);
                if (buffer != null) {
                    this.f116955a.writeAll(buffer);
                }
            }
            this.f116955a.emit();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    private void m143616a(BufferedSource bufferedSource, long j) throws IOException {
        if (f116954d || Thread.holdsLock(this)) {
            long j2 = 0;
            while (j2 < j) {
                int read = bufferedSource.read(this.f116963j, 0, (int) Math.min(j, (long) this.f116963j.length));
                if (read != -1) {
                    long j3 = (long) read;
                    C45410b.m143605a(this.f116963j, j3, this.f116962i, j2);
                    this.f116955a.write(this.f116963j, 0, read);
                    j2 += j3;
                } else {
                    throw new AssertionError();
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo108768a(int i, String str) throws IOException {
        Buffer buffer;
        if (i == 0 && str == null) {
            buffer = null;
        } else {
            if (i != 0) {
                C45410b.m143604a(i, true);
            }
            Buffer buffer2 = new Buffer();
            buffer2.writeShort(i);
            if (str != null) {
                buffer2.writeUtf8(str);
            }
            buffer = buffer2;
        }
        synchronized (this) {
            m143615a(8, buffer);
            this.f116960g = true;
        }
    }

    public C45415d(boolean z, BufferedSink bufferedSink, Random random) {
        byte[] bArr;
        byte[] bArr2 = null;
        this.f116961h = new C45417a();
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f116958e = z;
            this.f116955a = bufferedSink;
            this.f116959f = random;
            if (z) {
                bArr = new byte[4];
            } else {
                bArr = null;
            }
            this.f116962i = bArr;
            if (z) {
                bArr2 = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            }
            this.f116963j = bArr2;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    /* renamed from: a */
    public final void mo108767a(int i, long j, boolean z, boolean z2) throws IOException {
        if (!f116954d && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (!this.f116960g) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            }
            this.f116955a.writeByte(i);
            if (this.f116958e) {
                this.f116959f.nextBytes(this.f116962i);
                i2 = PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            }
            if (j <= 125) {
                this.f116955a.writeByte(((int) j) | i2);
            } else if (j <= 65535) {
                this.f116955a.writeByte(i2 | 126);
                this.f116955a.writeShort((int) j);
            } else {
                this.f116955a.writeByte(i2 | 127);
                this.f116955a.writeLong(j);
            }
            if (this.f116958e) {
                this.f116955a.write(this.f116962i);
                m143616a((BufferedSource) this.f116956b, j);
            } else {
                this.f116955a.write(this.f116956b, j);
            }
            this.f116955a.emit();
        } else {
            throw new IOException("closed");
        }
    }
}
