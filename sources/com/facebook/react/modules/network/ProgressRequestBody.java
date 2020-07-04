package com.facebook.react.modules.network;

import java.io.IOException;
import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;

public class ProgressRequestBody extends RequestBody {
    private BufferedSink mBufferedSink;
    private long mContentLength;
    public final ProgressListener mProgressListener;
    private final RequestBody mRequestBody;

    public MediaType contentType() {
        return this.mRequestBody.contentType();
    }

    public long contentLength() throws IOException {
        if (this.mContentLength == 0) {
            this.mContentLength = this.mRequestBody.contentLength();
        }
        return this.mContentLength;
    }

    private Sink outputStreamSink(BufferedSink bufferedSink) {
        return Okio.sink((OutputStream) new CountingOutputStream(bufferedSink.outputStream()) {
            private void sendProgressUpdate() throws IOException {
                boolean z;
                long count = getCount();
                long contentLength = ProgressRequestBody.this.contentLength();
                ProgressListener progressListener = ProgressRequestBody.this.mProgressListener;
                if (count == contentLength) {
                    z = true;
                } else {
                    z = false;
                }
                progressListener.onProgress(count, contentLength, z);
            }

            public void write(int i) throws IOException {
                super.write(i);
                sendProgressUpdate();
            }

            public void write(byte[] bArr, int i, int i2) throws IOException {
                super.write(bArr, i, i2);
                sendProgressUpdate();
            }
        });
    }

    public void writeTo(BufferedSink bufferedSink) throws IOException {
        if (this.mBufferedSink == null) {
            this.mBufferedSink = Okio.buffer(outputStreamSink(bufferedSink));
        }
        contentLength();
        this.mRequestBody.writeTo(this.mBufferedSink);
        this.mBufferedSink.flush();
    }

    public ProgressRequestBody(RequestBody requestBody, ProgressListener progressListener) {
        this.mRequestBody = requestBody;
        this.mProgressListener = progressListener;
    }
}
