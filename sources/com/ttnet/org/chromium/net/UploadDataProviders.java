package com.ttnet.org.chromium.net;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class UploadDataProviders {

    static final class ByteBufferUploadProvider extends UploadDataProvider {
        private final ByteBuffer mUploadBuffer;

        public final long getLength() {
            return (long) this.mUploadBuffer.limit();
        }

        private ByteBufferUploadProvider(ByteBuffer byteBuffer) {
            this.mUploadBuffer = byteBuffer;
        }

        public final void rewind(UploadDataSink uploadDataSink) {
            this.mUploadBuffer.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() >= this.mUploadBuffer.remaining()) {
                    byteBuffer.put(this.mUploadBuffer);
                } else {
                    int limit = this.mUploadBuffer.limit();
                    this.mUploadBuffer.limit(this.mUploadBuffer.position() + byteBuffer.remaining());
                    byteBuffer.put(this.mUploadBuffer);
                    this.mUploadBuffer.limit(limit);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
    }

    interface FileChannelProvider {
        FileChannel getChannel() throws IOException;
    }

    static final class FileUploadProvider extends UploadDataProvider {
        private volatile FileChannel mChannel;
        private final Object mLock;
        private final FileChannelProvider mProvider;

        public final void close() throws IOException {
            FileChannel fileChannel = this.mChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        public final long getLength() throws IOException {
            return getChannel().size();
        }

        private FileChannel getChannel() throws IOException {
            if (this.mChannel == null) {
                synchronized (this.mLock) {
                    if (this.mChannel == null) {
                        this.mChannel = this.mProvider.getChannel();
                    }
                }
            }
            return this.mChannel;
        }

        private FileUploadProvider(FileChannelProvider fileChannelProvider) {
            this.mLock = new Object();
            this.mProvider = fileChannelProvider;
        }

        public final void rewind(UploadDataSink uploadDataSink) throws IOException {
            getChannel().position(0);
            uploadDataSink.onRewindSucceeded();
        }

        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasRemaining()) {
                FileChannel channel = getChannel();
                int i = 0;
                while (i == 0) {
                    int read = channel.read(byteBuffer);
                    if (read == -1) {
                        break;
                    }
                    i += read;
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(final ParcelFileDescriptor parcelFileDescriptor) {
        return new FileUploadProvider(new FileChannelProvider() {
            public FileChannel getChannel() throws IOException {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                StringBuilder sb = new StringBuilder("Not a file: ");
                sb.append(parcelFileDescriptor);
                throw new IllegalArgumentException(sb.toString());
            }
        });
    }

    public static UploadDataProvider create(final File file) {
        return new FileUploadProvider(new FileChannelProvider() {
            public FileChannel getChannel() throws IOException {
                return new FileInputStream(file).getChannel();
            }
        });
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new ByteBufferUploadProvider(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new ByteBufferUploadProvider(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
