package com.ttnet.org.chromium.net.impl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

final class InputStreamChannel implements ReadableByteChannel {
    private final InputStream mInputStream;
    private final AtomicBoolean mIsOpen = new AtomicBoolean(true);

    public final boolean isOpen() {
        return this.mIsOpen.get();
    }

    public final void close() throws IOException {
        if (this.mIsOpen.compareAndSet(true, false)) {
            this.mInputStream.close();
        }
    }

    private InputStreamChannel(InputStream inputStream) {
        this.mInputStream = inputStream;
    }

    static ReadableByteChannel wrap(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new InputStreamChannel(inputStream);
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            int read = this.mInputStream.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read <= 0) {
                return read;
            }
            byteBuffer.position(byteBuffer.position() + read);
            return read;
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.mInputStream.available(), 4096), byteBuffer.remaining()))];
        int read2 = this.mInputStream.read(bArr);
        if (read2 > 0) {
            byteBuffer.put(bArr, 0, read2);
        }
        return read2;
    }
}
