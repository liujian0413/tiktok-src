package com.squareup.okhttp.internal.framed;

import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.FrameReader.Handler;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Okio;
import okio.Sink;

public final class Spdy3 implements Variant {
    static final byte[] DICTIONARY;

    static final class Reader implements FrameReader {
        private final boolean client;
        private final NameValueBlockReader headerBlockReader = new NameValueBlockReader(this.source);
        private final BufferedSource source;

        public final void readConnectionPreface() {
        }

        public final void close() throws IOException {
            this.headerBlockReader.close();
        }

        public final boolean nextFrame(Handler handler) throws IOException {
            boolean z;
            boolean z2 = false;
            try {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                if ((Integer.MIN_VALUE & readInt) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = (-16777216 & readInt2) >>> 24;
                int i2 = readInt2 & 16777215;
                if (z) {
                    int i3 = (2147418112 & readInt) >>> 16;
                    int i4 = readInt & 65535;
                    if (i3 == 3) {
                        switch (i4) {
                            case 1:
                                readSynStream(handler, i, i2);
                                return true;
                            case 2:
                                readSynReply(handler, i, i2);
                                return true;
                            case 3:
                                readRstStream(handler, i, i2);
                                return true;
                            case 4:
                                readSettings(handler, i, i2);
                                return true;
                            case 6:
                                readPing(handler, i, i2);
                                return true;
                            case 7:
                                readGoAway(handler, i, i2);
                                return true;
                            case 8:
                                readHeaders(handler, i, i2);
                                return true;
                            case 9:
                                readWindowUpdate(handler, i, i2);
                                return true;
                            default:
                                this.source.skip((long) i2);
                                return true;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("version != 3: ");
                        sb.append(i3);
                        throw new ProtocolException(sb.toString());
                    }
                } else {
                    int i5 = readInt & Integer.MAX_VALUE;
                    if ((i & 1) != 0) {
                        z2 = true;
                    }
                    handler.data(z2, i5, this.source, i2);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        private static IOException ioException(String str, Object... objArr) throws IOException {
            throw new IOException(C1642a.m8034a(str, objArr));
        }

        Reader(BufferedSource bufferedSource, boolean z) {
            this.source = bufferedSource;
            this.client = z;
        }

        private void readHeaders(Handler handler, int i, int i2) throws IOException {
            handler.headers(false, false, this.source.readInt() & Integer.MAX_VALUE, -1, this.headerBlockReader.readNameValueBlock(i2 - 4), HeadersMode.SPDY_HEADERS);
        }

        private void readGoAway(Handler handler, int i, int i2) throws IOException {
            if (i2 == 8) {
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                int readInt2 = this.source.readInt();
                ErrorCode fromSpdyGoAway = ErrorCode.fromSpdyGoAway(readInt2);
                if (fromSpdyGoAway != null) {
                    handler.goAway(readInt, fromSpdyGoAway, ByteString.EMPTY);
                } else {
                    throw ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                }
            } else {
                throw ioException("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
            }
        }

        private void readPing(Handler handler, int i, int i2) throws IOException {
            boolean z;
            boolean z2 = true;
            if (i2 == 4) {
                int readInt = this.source.readInt();
                boolean z3 = this.client;
                if ((readInt & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z3 != z) {
                    z2 = false;
                }
                handler.ping(z2, readInt, 0);
                return;
            }
            throw ioException("TYPE_PING length: %d != 4", Integer.valueOf(i2));
        }

        private void readRstStream(Handler handler, int i, int i2) throws IOException {
            if (i2 == 8) {
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                int readInt2 = this.source.readInt();
                ErrorCode fromSpdy3Rst = ErrorCode.fromSpdy3Rst(readInt2);
                if (fromSpdy3Rst != null) {
                    handler.rstStream(readInt, fromSpdy3Rst);
                } else {
                    throw ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                }
            } else {
                throw ioException("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
            }
        }

        private void readSynReply(Handler handler, int i, int i2) throws IOException {
            boolean z;
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            List readNameValueBlock = this.headerBlockReader.readNameValueBlock(i2 - 4);
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            handler.headers(false, z, readInt, -1, readNameValueBlock, HeadersMode.SPDY_REPLY);
        }

        private void readSynStream(Handler handler, int i, int i2) throws IOException {
            boolean z;
            boolean z2;
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            int readInt2 = this.source.readInt() & Integer.MAX_VALUE;
            this.source.readShort();
            List readNameValueBlock = this.headerBlockReader.readNameValueBlock(i2 - 10);
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            handler.headers(z2, z, readInt, readInt2, readNameValueBlock, HeadersMode.SPDY_SYN_STREAM);
        }

        private void readWindowUpdate(Handler handler, int i, int i2) throws IOException {
            if (i2 == 8) {
                int readInt = this.source.readInt() & Integer.MAX_VALUE;
                long readInt2 = (long) (this.source.readInt() & Integer.MAX_VALUE);
                if (readInt2 != 0) {
                    handler.windowUpdate(readInt, readInt2);
                } else {
                    throw ioException("windowSizeIncrement was 0", Long.valueOf(readInt2));
                }
            } else {
                throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
            }
        }

        private void readSettings(Handler handler, int i, int i2) throws IOException {
            int readInt = this.source.readInt();
            boolean z = false;
            if (i2 == (readInt * 8) + 4) {
                Settings settings = new Settings();
                for (int i3 = 0; i3 < readInt; i3++) {
                    int readInt2 = this.source.readInt();
                    int i4 = (-16777216 & readInt2) >>> 24;
                    settings.set(readInt2 & 16777215, i4, this.source.readInt());
                }
                if ((i & 1) != 0) {
                    z = true;
                }
                handler.settings(z, settings);
                return;
            }
            throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(readInt));
        }
    }

    static final class Writer implements FrameWriter {
        private final boolean client;
        private boolean closed;
        private final Buffer headerBlockBuffer = new Buffer();
        private final BufferedSink headerBlockOut;
        private final BufferedSink sink;

        public final void ackSettings(Settings settings) {
        }

        public final synchronized void connectionPreface() {
        }

        public final int maxDataLength() {
            return 16383;
        }

        public final void pushPromise(int i, int i2, List<Header> list) throws IOException {
        }

        public final synchronized void close() throws IOException {
            this.closed = true;
            Util.closeAll(this.sink, this.headerBlockOut);
        }

        public final synchronized void flush() throws IOException {
            if (!this.closed) {
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }

        private void writeNameValueBlockToBuffer(List<Header> list) throws IOException {
            this.headerBlockOut.writeInt(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ByteString byteString = ((Header) list.get(i)).name;
                this.headerBlockOut.writeInt(byteString.size());
                this.headerBlockOut.write(byteString);
                ByteString byteString2 = ((Header) list.get(i)).value;
                this.headerBlockOut.writeInt(byteString2.size());
                this.headerBlockOut.write(byteString2);
            }
            this.headerBlockOut.flush();
        }

        public final synchronized void settings(Settings settings) throws IOException {
            if (!this.closed) {
                int size = settings.size();
                int i = (size * 8) + 4;
                this.sink.writeInt(-2147287036);
                this.sink.writeInt((i & 16777215) | 0);
                this.sink.writeInt(size);
                for (int i2 = 0; i2 <= 10; i2++) {
                    if (settings.isSet(i2)) {
                        this.sink.writeInt(((settings.flags(i2) & NormalGiftView.ALPHA_255) << 24) | (i2 & 16777215));
                        this.sink.writeInt(settings.get(i2));
                    }
                }
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }

        Writer(BufferedSink bufferedSink, boolean z) {
            this.sink = bufferedSink;
            this.client = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(Spdy3.DICTIONARY);
            this.headerBlockOut = Okio.buffer((Sink) new DeflaterSink((Sink) this.headerBlockBuffer, deflater));
        }

        public final synchronized void headers(int i, List<Header> list) throws IOException {
            if (!this.closed) {
                writeNameValueBlockToBuffer(list);
                int size = (int) (this.headerBlockBuffer.size() + 4);
                this.sink.writeInt(-2147287032);
                this.sink.writeInt((size & 16777215) | 0);
                this.sink.writeInt(i & Integer.MAX_VALUE);
                this.sink.writeAll(this.headerBlockBuffer);
            } else {
                throw new IOException("closed");
            }
        }

        public final synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            } else if (errorCode.spdyRstCode != -1) {
                this.sink.writeInt(-2147287037);
                this.sink.writeInt(8);
                this.sink.writeInt(i & Integer.MAX_VALUE);
                this.sink.writeInt(errorCode.spdyRstCode);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final synchronized void windowUpdate(int i, long j) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                StringBuilder sb = new StringBuilder("windowSizeIncrement must be between 1 and 0x7fffffff: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else {
                this.sink.writeInt(-2147287031);
                this.sink.writeInt(8);
                this.sink.writeInt(i);
                this.sink.writeInt((int) j);
                this.sink.flush();
            }
        }

        public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            } else if (errorCode.spdyGoAwayCode != -1) {
                this.sink.writeInt(-2147287033);
                this.sink.writeInt(8);
                this.sink.writeInt(i);
                this.sink.writeInt(errorCode.spdyGoAwayCode);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
        }

        public final synchronized void ping(boolean z, int i, int i2) throws IOException {
            boolean z2;
            if (!this.closed) {
                boolean z3 = this.client;
                boolean z4 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 != z2) {
                    z4 = true;
                }
                if (z == z4) {
                    this.sink.writeInt(-2147287034);
                    this.sink.writeInt(4);
                    this.sink.writeInt(i);
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException("payload != reply");
                }
            } else {
                throw new IOException("closed");
            }
        }

        public final synchronized void synReply(boolean z, int i, List<Header> list) throws IOException {
            if (!this.closed) {
                writeNameValueBlockToBuffer(list);
                int size = (int) (this.headerBlockBuffer.size() + 4);
                this.sink.writeInt(-2147287038);
                this.sink.writeInt(((z & true ? 1 : 0) << true) | (size & 16777215));
                this.sink.writeInt(i & Integer.MAX_VALUE);
                this.sink.writeAll(this.headerBlockBuffer);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public final synchronized void data(boolean z, int i, Buffer buffer, int i2) throws IOException {
            sendDataFrame(i, z ? 1 : 0, buffer, i2);
        }

        /* access modifiers changed from: 0000 */
        public final void sendDataFrame(int i, int i2, Buffer buffer, int i3) throws IOException {
            if (!this.closed) {
                long j = (long) i3;
                if (j <= 16777215) {
                    this.sink.writeInt(i & Integer.MAX_VALUE);
                    this.sink.writeInt(((i2 & NormalGiftView.ALPHA_255) << 24) | (16777215 & i3));
                    if (i3 > 0) {
                        this.sink.write(buffer, j);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("FRAME_TOO_LARGE max size is 16Mib: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IOException("closed");
        }

        public final synchronized void synStream(boolean z, boolean z2, int i, int i2, List<Header> list) throws IOException {
            char c;
            if (!this.closed) {
                writeNameValueBlockToBuffer(list);
                int size = (int) (this.headerBlockBuffer.size() + 10);
                if (z2) {
                    c = 2;
                } else {
                    c = 0;
                }
                boolean z3 = z | c;
                this.sink.writeInt(-2147287039);
                this.sink.writeInt(((z3 & true ? 1 : 0) << true) | (size & 16777215));
                this.sink.writeInt(i & Integer.MAX_VALUE);
                this.sink.writeInt(Integer.MAX_VALUE & i2);
                this.sink.writeShort(0);
                this.sink.writeAll(this.headerBlockBuffer);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final Protocol getProtocol() {
        return Protocol.SPDY_3;
    }

    static {
        try {
            DICTIONARY = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(Util.UTF_8.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    public final FrameReader newReader(BufferedSource bufferedSource, boolean z) {
        return new Reader(bufferedSource, z);
    }

    public final FrameWriter newWriter(BufferedSink bufferedSink, boolean z) {
        return new Writer(bufferedSink, z);
    }
}
