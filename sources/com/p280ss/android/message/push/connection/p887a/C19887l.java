package com.p280ss.android.message.push.connection.p887a;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;

/* renamed from: com.ss.android.message.push.connection.a.l */
public final class C19887l extends InputStream implements ReadableByteChannel {

    /* renamed from: a */
    private C19888a f53946a;

    /* renamed from: com.ss.android.message.push.connection.a.l$a */
    static class C19888a extends C19886k {

        /* renamed from: b */
        ReadableByteChannel f53947b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo53286a(ByteBuffer byteBuffer) throws IOException {
            return this.f53947b.read(byteBuffer);
        }

        C19888a(ReadableByteChannel readableByteChannel) throws IOException {
            super((SelectableChannel) readableByteChannel);
            this.f53947b = readableByteChannel;
        }
    }

    public final boolean isOpen() {
        return this.f53946a.mo53289b();
    }

    public final synchronized void close() throws IOException {
        this.f53946a.f53947b.close();
        this.f53946a.mo53287a();
    }

    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read > 0) {
            return bArr[0] & 255;
        }
        if (read == -1) {
            return read;
        }
        throw new IOException("Could not read from stream");
    }

    public C19887l(Socket socket) throws IOException {
        this((ReadableByteChannel) socket.getChannel());
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        return this.f53946a.mo53288b(byteBuffer);
    }

    private C19887l(ReadableByteChannel readableByteChannel) throws IOException {
        C19886k.m65664a((Object) readableByteChannel);
        this.f53946a = new C19888a(readableByteChannel);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return read(ByteBuffer.wrap(bArr, i, i2));
    }
}
