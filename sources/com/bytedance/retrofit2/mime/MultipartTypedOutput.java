package com.bytedance.retrofit2.mime;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public final class MultipartTypedOutput implements TypedOutput {
    private final String boundary;
    private final byte[] footer;
    private long length;
    private final List<MimePart> mimeParts;

    static final class MimePart {
        private final TypedOutput body;
        private final String boundary;
        private boolean isBuilt;
        private final boolean isFirst;
        private final String name;
        private byte[] partBoundary;
        private byte[] partHeader;
        private final String transferEncoding;

        private void build() {
            if (!this.isBuilt) {
                this.partBoundary = MultipartTypedOutput.buildBoundary(this.boundary, this.isFirst, false);
                this.partHeader = MultipartTypedOutput.buildHeader(this.name, this.transferEncoding, this.body);
                this.isBuilt = true;
            }
        }

        public final long size() {
            build();
            if (this.body.length() > -1) {
                return this.body.length() + ((long) this.partBoundary.length) + ((long) this.partHeader.length);
            }
            return -1;
        }

        public final void writeTo(OutputStream outputStream) throws IOException {
            build();
            outputStream.write(this.partBoundary);
            outputStream.write(this.partHeader);
            this.body.writeTo(outputStream);
        }

        public MimePart(String str, String str2, TypedOutput typedOutput, String str3, boolean z) {
            this.name = str;
            this.transferEncoding = str2;
            this.body = typedOutput;
            this.isFirst = z;
            this.boundary = str3;
        }
    }

    public final String fileName() {
        return null;
    }

    public final long length() {
        return this.length;
    }

    public final int getPartCount() {
        return this.mimeParts.size();
    }

    public MultipartTypedOutput() {
        this(UUID.randomUUID().toString());
    }

    public final String mimeType() {
        StringBuilder sb = new StringBuilder("multipart/form-data; boundary=");
        sb.append(this.boundary);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final List<byte[]> getParts() throws IOException {
        ArrayList arrayList = new ArrayList(this.mimeParts.size());
        for (MimePart mimePart : this.mimeParts) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mimePart.writeTo(byteArrayOutputStream);
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        return arrayList;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0036 A[SYNTHETIC, Splitter:B:24:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC, Splitter:B:28:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0045 A[SYNTHETIC, Splitter:B:35:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x004c A[SYNTHETIC, Splitter:B:39:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String md5Stub() {
        /*
            r7 = this;
            long r0 = r7.length
            r2 = 0
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0041, all -> 0x0031 }
            r0.<init>()     // Catch:{ Throwable -> 0x0041, all -> 0x0031 }
            r7.writeTo(r0)     // Catch:{ Throwable -> 0x002f, all -> 0x002d }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ Throwable -> 0x002f, all -> 0x002d }
            byte[] r3 = r0.toByteArray()     // Catch:{ Throwable -> 0x002f, all -> 0x002d }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x002f, all -> 0x002d }
            java.lang.String r3 = com.bytedance.retrofit2.mime.DigestUtil.md5Hex(r1)     // Catch:{ Throwable -> 0x002b, all -> 0x0026 }
            r0.close()     // Catch:{ Throwable -> 0x0022 }
        L_0x0022:
            r1.close()     // Catch:{ Throwable -> 0x0025 }
        L_0x0025:
            return r3
        L_0x0026:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0034
        L_0x002b:
            goto L_0x0043
        L_0x002d:
            r1 = move-exception
            goto L_0x0034
        L_0x002f:
            r1 = r2
            goto L_0x0043
        L_0x0031:
            r0 = move-exception
            r1 = r0
            r0 = r2
        L_0x0034:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ Throwable -> 0x003a }
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.close()     // Catch:{ Throwable -> 0x0040 }
        L_0x0040:
            throw r1
        L_0x0041:
            r0 = r2
            r1 = r0
        L_0x0043:
            if (r0 == 0) goto L_0x004a
            r0.close()     // Catch:{ Throwable -> 0x0049 }
            goto L_0x004a
        L_0x0049:
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ Throwable -> 0x004f }
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.mime.MultipartTypedOutput.md5Stub():java.lang.String");
    }

    MultipartTypedOutput(String str) {
        this.mimeParts = new LinkedList();
        this.boundary = str;
        this.footer = buildBoundary(str, false, true);
        this.length = (long) this.footer.length;
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        for (MimePart writeTo : this.mimeParts) {
            writeTo.writeTo(outputStream);
        }
        outputStream.write(this.footer);
    }

    public final void addPart(String str, TypedOutput typedOutput) {
        addPart(str, "binary", typedOutput);
    }

    public static byte[] buildBoundary(String str, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder(str.length() + 8);
            if (!z) {
                sb.append("\r\n");
            }
            sb.append("--");
            sb.append(str);
            if (z2) {
                sb.append("--");
            }
            sb.append("\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart boundary", e);
        }
    }

    public static byte[] buildHeader(String str, String str2, TypedOutput typedOutput) {
        try {
            StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            sb.append("Content-Disposition: form-data; name=\"");
            sb.append(str);
            String fileName = typedOutput.fileName();
            if (fileName != null) {
                sb.append("\"; filename=\"");
                sb.append(fileName);
            }
            sb.append("\"\r\nContent-Type: ");
            sb.append(typedOutput.mimeType());
            long length2 = typedOutput.length();
            if (length2 != -1) {
                sb.append("\r\nContent-Length: ");
                sb.append(length2);
            }
            sb.append("\r\nContent-Transfer-Encoding: ");
            sb.append(str2);
            sb.append("\r\n\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart header", e);
        }
    }

    public final void addPart(String str, String str2, TypedOutput typedOutput) {
        if (str == null) {
            throw new NullPointerException("Part name must not be null.");
        } else if (str2 == null) {
            throw new NullPointerException("Transfer encoding must not be null.");
        } else if (typedOutput != null) {
            MimePart mimePart = new MimePart(str, str2, typedOutput, this.boundary, this.mimeParts.isEmpty());
            this.mimeParts.add(mimePart);
            long size = mimePart.size();
            if (size == -1) {
                this.length = -1;
                return;
            }
            if (this.length != -1) {
                this.length += size;
            }
        } else {
            throw new NullPointerException("Part body must not be null.");
        }
    }
}
