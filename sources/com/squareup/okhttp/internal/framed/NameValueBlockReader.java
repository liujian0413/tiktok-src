package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSource;
import okio.InflaterSource;
import okio.Okio;
import okio.Source;

class NameValueBlockReader {
    public int compressedLimit;
    private final InflaterSource inflaterSource;
    private final BufferedSource source = Okio.buffer((Source) this.inflaterSource);

    public void close() throws IOException {
        this.source.close();
    }

    private ByteString readByteString() throws IOException {
        return this.source.readByteString((long) this.source.readInt());
    }

    private void doneReading() throws IOException {
        if (this.compressedLimit > 0) {
            this.inflaterSource.refill();
            if (this.compressedLimit != 0) {
                StringBuilder sb = new StringBuilder("compressedLimit > 0: ");
                sb.append(this.compressedLimit);
                throw new IOException(sb.toString());
            }
        }
    }

    public NameValueBlockReader(BufferedSource bufferedSource) {
        this.inflaterSource = new InflaterSource((Source) new ForwardingSource(bufferedSource) {
            public long read(Buffer buffer, long j) throws IOException {
                if (NameValueBlockReader.this.compressedLimit == 0) {
                    return -1;
                }
                long read = super.read(buffer, Math.min(j, (long) NameValueBlockReader.this.compressedLimit));
                if (read == -1) {
                    return -1;
                }
                NameValueBlockReader.this.compressedLimit = (int) (((long) NameValueBlockReader.this.compressedLimit) - read);
                return read;
            }
        }, (Inflater) new Inflater() {
            public int inflate(byte[] bArr, int i, int i2) throws DataFormatException {
                int inflate = super.inflate(bArr, i, i2);
                if (inflate != 0 || !needsDictionary()) {
                    return inflate;
                }
                setDictionary(Spdy3.DICTIONARY);
                return super.inflate(bArr, i, i2);
            }
        });
    }

    public List<Header> readNameValueBlock(int i) throws IOException {
        this.compressedLimit += i;
        int readInt = this.source.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder("numberOfPairs < 0: ");
            sb.append(readInt);
            throw new IOException(sb.toString());
        } else if (readInt <= 1024) {
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 < readInt) {
                ByteString asciiLowercase = readByteString().toAsciiLowercase();
                ByteString readByteString = readByteString();
                if (asciiLowercase.size() != 0) {
                    arrayList.add(new Header(asciiLowercase, readByteString));
                    i2++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            doneReading();
            return arrayList;
        } else {
            StringBuilder sb2 = new StringBuilder("numberOfPairs > 1024: ");
            sb2.append(readInt);
            throw new IOException(sb2.toString());
        }
    }
}
