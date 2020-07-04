package com.facebook.react.modules.network;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class ProgressResponseBody extends ResponseBody {
    private BufferedSource mBufferedSource;
    public final ProgressListener mProgressListener;
    public final ResponseBody mResponseBody;
    public long mTotalBytesRead;

    public long totalBytesRead() {
        return this.mTotalBytesRead;
    }

    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    public MediaType contentType() {
        return this.mResponseBody.contentType();
    }

    public BufferedSource source() {
        if (this.mBufferedSource == null) {
            this.mBufferedSource = Okio.buffer(source(this.mResponseBody.source()));
        }
        return this.mBufferedSource;
    }

    private Source source(Source source) {
        return new ForwardingSource(source) {
            public long read(Buffer buffer, long j) throws IOException {
                long j2;
                boolean z;
                long read = super.read(buffer, j);
                ProgressResponseBody progressResponseBody = ProgressResponseBody.this;
                long j3 = ProgressResponseBody.this.mTotalBytesRead;
                if (read != -1) {
                    j2 = read;
                } else {
                    j2 = 0;
                }
                progressResponseBody.mTotalBytesRead = j3 + j2;
                ProgressListener progressListener = ProgressResponseBody.this.mProgressListener;
                long j4 = ProgressResponseBody.this.mTotalBytesRead;
                long contentLength = ProgressResponseBody.this.mResponseBody.contentLength();
                if (read == -1) {
                    z = true;
                } else {
                    z = false;
                }
                progressListener.onProgress(j4, contentLength, z);
                return read;
            }
        };
    }

    public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
        this.mResponseBody = responseBody;
        this.mProgressListener = progressListener;
    }
}
