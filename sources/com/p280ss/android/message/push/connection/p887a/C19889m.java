package com.p280ss.android.message.push.connection.p887a;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;

/* renamed from: com.ss.android.message.push.connection.a.m */
public final class C19889m extends OutputStream implements WritableByteChannel {

    /* renamed from: a */
    private C19890a f53948a;

    /* renamed from: com.ss.android.message.push.connection.a.m$a */
    static class C19890a extends C19886k {

        /* renamed from: b */
        WritableByteChannel f53949b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo53286a(ByteBuffer byteBuffer) throws IOException {
            return this.f53949b.write(byteBuffer);
        }

        C19890a(WritableByteChannel writableByteChannel) throws IOException {
            super((SelectableChannel) writableByteChannel);
            this.f53949b = writableByteChannel;
        }
    }

    public final boolean isOpen() {
        return this.f53948a.mo53289b();
    }

    public final synchronized void close() throws IOException {
        this.f53948a.f53949b.close();
        this.f53948a.mo53287a();
    }

    public C19889m(Socket socket) throws IOException {
        this((WritableByteChannel) socket.getChannel());
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        return this.f53948a.mo53288b(byteBuffer);
    }

    private C19889m(WritableByteChannel writableByteChannel) throws IOException {
        C19886k.m65664a((Object) writableByteChannel);
        this.f53948a = new C19890a(writableByteChannel);
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            try {
                if (write(wrap) < 0) {
                    throw new IOException("The stream is closed");
                }
            } catch (IOException e) {
                if (wrap.capacity() > wrap.remaining()) {
                    this.f53948a.mo53287a();
                }
                throw e;
            }
        }
    }
}
