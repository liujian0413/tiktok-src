package com.p280ss.android.ugc.aweme.p339sp;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.ss.android.ugc.aweme.sp.b */
public final class C7227b implements XmlSerializer {

    /* renamed from: a */
    private static final String[] f20198a = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: b */
    private final char[] f20199b = new char[VideoCacheReadBuffersizeExperiment.DEFAULT];

    /* renamed from: c */
    private int f20200c;

    /* renamed from: d */
    private Writer f20201d;

    /* renamed from: e */
    private OutputStream f20202e;

    /* renamed from: f */
    private CharsetEncoder f20203f;

    /* renamed from: g */
    private ByteBuffer f20204g = ByteBuffer.allocate(VideoCacheReadBuffersizeExperiment.DEFAULT);

    /* renamed from: h */
    private boolean f20205h;

    public final void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    public final int getDepth() {
        throw new UnsupportedOperationException();
    }

    public final String getName() {
        throw new UnsupportedOperationException();
    }

    public final String getNamespace() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private void m22651a() throws IOException {
        int position = this.f20204g.position();
        if (position > 0) {
            this.f20204g.flip();
            this.f20202e.write(this.f20204g.array(), 0, position);
            this.f20204g.clear();
        }
    }

    public final void flush() throws IOException {
        if (this.f20200c > 0) {
            if (this.f20202e != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f20199b, 0, this.f20200c);
                CoderResult encode = this.f20203f.encode(wrap, this.f20204g, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        m22651a();
                        encode = this.f20203f.encode(wrap, this.f20204g, true);
                    } else {
                        m22651a();
                        this.f20202e.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.f20201d.write(this.f20199b, 0, this.f20200c);
            this.f20201d.flush();
            this.f20200c = 0;
        }
    }

    public final void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f20201d = writer;
    }

    public final void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public final void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private void m22653a(String str) throws IOException {
        m22654a(str, 0, str.length());
    }

    public final XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f20205h) {
            m22653a(">");
            this.f20205h = false;
        }
        m22656b(str);
        return this;
    }

    /* renamed from: a */
    private void m22652a(char c) throws IOException {
        int i = this.f20200c;
        if (i >= 8191) {
            flush();
            i = this.f20200c;
        }
        this.f20199b[i] = c;
        this.f20200c = i + 1;
    }

    /* renamed from: b */
    private void m22656b(String str) throws IOException {
        int length = str.length();
        char length2 = (char) f20198a.length;
        String[] strArr = f20198a;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2) {
                String str2 = strArr[charAt];
                if (str2 != null) {
                    if (i2 < i) {
                        m22654a(str, i2, i - i2);
                    }
                    i2 = i + 1;
                    m22653a(str2);
                }
            }
            i++;
        }
        if (i2 < i) {
            m22654a(str, i2, i - i2);
        }
    }

    public final String getPrefix(String str, boolean z) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public final void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public final void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    public final XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f20205h) {
            m22653a(">\n");
        }
        m22652a('<');
        if (str != null) {
            m22653a(str);
            m22652a(':');
        }
        m22653a(str2);
        this.f20205h = true;
        return this;
    }

    public final XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f20205h) {
            m22653a(" />\n");
        } else {
            m22653a("</");
            if (str != null) {
                m22653a(str);
                m22652a(':');
            }
            m22653a(str2);
            m22653a(">\n");
        }
        this.f20205h = false;
        return this;
    }

    public final void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream != null) {
            try {
                this.f20203f = Charset.forName(str).newEncoder();
                this.f20202e = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
            } catch (UnsupportedCharsetException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        String str2;
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        sb.append(str2);
        sb.append("' ?>\n");
        m22653a(sb.toString());
    }

    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        m22652a(' ');
        if (str != null) {
            m22653a(str);
            m22652a(':');
        }
        m22653a(str2);
        m22653a("=\"");
        m22656b(str3);
        m22652a('\"');
        return this;
    }

    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f20205h) {
            m22653a(">");
            this.f20205h = false;
        }
        m22657b(cArr, i, i2);
        return this;
    }

    /* renamed from: a */
    private void m22654a(String str, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + VideoCacheReadBuffersizeExperiment.DEFAULT;
                if (i5 < i4) {
                    i3 = VideoCacheReadBuffersizeExperiment.DEFAULT;
                } else {
                    i3 = i4 - i;
                }
                m22654a(str, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.f20200c;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.f20200c;
        }
        str.getChars(i, i + i2, this.f20199b, i6);
        this.f20200c = i6 + i2;
    }

    /* renamed from: b */
    private void m22657b(char[] cArr, int i, int i2) throws IOException {
        char length = (char) f20198a.length;
        String[] strArr = f20198a;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length) {
                String str = strArr[c];
                if (str != null) {
                    if (i4 < i) {
                        m22655a(cArr, i4, i - i4);
                    }
                    i4 = i + 1;
                    m22653a(str);
                }
            }
            i++;
        }
        if (i4 < i) {
            m22655a(cArr, i4, i - i4);
        }
    }

    /* renamed from: a */
    private void m22655a(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + VideoCacheReadBuffersizeExperiment.DEFAULT;
                if (i5 < i4) {
                    i3 = VideoCacheReadBuffersizeExperiment.DEFAULT;
                } else {
                    i3 = i4 - i;
                }
                m22655a(cArr, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.f20200c;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.f20200c;
        }
        System.arraycopy(cArr, i, this.f20199b, i6, i2);
        this.f20200c = i6 + i2;
    }
}
