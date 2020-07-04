package com.bytedance.ies.ugc.appcontext;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ApkUtil {

    public static class SignatureNotFoundException extends Exception {
        private static final long serialVersionUID = 1;

        public SignatureNotFoundException(String str) {
            super(str);
        }

        public SignatureNotFoundException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.ApkUtil$a */
    static final class C6397a<A, B> {

        /* renamed from: a */
        public final A f18688a;

        /* renamed from: b */
        public final B f18689b;

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (this.f18688a == null) {
                i = 0;
            } else {
                i = this.f18688a.hashCode();
            }
            int i3 = (i + 31) * 31;
            if (this.f18689b != null) {
                i2 = this.f18689b.hashCode();
            }
            return i3 + i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C6397a aVar = (C6397a) obj;
            if (this.f18688a == null) {
                if (aVar.f18688a != null) {
                    return false;
                }
            } else if (!this.f18688a.equals(aVar.f18688a)) {
                return false;
            }
            if (this.f18689b == null) {
                if (aVar.f18689b != null) {
                    return false;
                }
            } else if (!this.f18689b.equals(aVar.f18689b)) {
                return false;
            }
            return true;
        }

        private C6397a(A a, B b) {
            this.f18688a = a;
            this.f18689b = b;
        }

        /* renamed from: a */
        public static <A, B> C6397a<A, B> m19920a(A a, B b) {
            return new C6397a<>(a, b);
        }
    }

    /* renamed from: b */
    private static long m19915b(FileChannel fileChannel) throws IOException {
        return m19910a(fileChannel, m19909a(fileChannel));
    }

    /* renamed from: c */
    private static C6397a<ByteBuffer, Long> m19918c(FileChannel fileChannel) throws IOException, SignatureNotFoundException {
        return m19916b(fileChannel, m19915b(fileChannel));
    }

    /* renamed from: c */
    private static void m19919c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: a */
    private static byte[] m19914a(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(array, byteBuffer.position() + arrayOffset, arrayOffset + byteBuffer.limit());
    }

    /* renamed from: a */
    private static long m19909a(FileChannel fileChannel) throws IOException {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long min = Math.min(j, 65535);
            int i = 0;
            while (true) {
                long j2 = (long) i;
                if (j2 <= min) {
                    long j3 = j - j2;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(allocate);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        short s = allocate2.getShort(0);
                        if (s == i) {
                            return (long) s;
                        }
                    }
                    i++;
                } else {
                    throw new IOException("ZIP End of Central Directory (EOCD) record not found");
                }
            }
        } else {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
    }

    /* renamed from: b */
    private static Map<Integer, ByteBuffer> m19917b(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        m19919c(byteBuffer);
        ByteBuffer a = m19913a(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (a.hasRemaining()) {
            i++;
            if (a.remaining() >= 8) {
                long j = a.getLong();
                if (j < 4 || j > 2147483647L) {
                    StringBuilder sb = new StringBuilder("APK Signing Block entry #");
                    sb.append(i);
                    sb.append(" size out of range: ");
                    sb.append(j);
                    throw new SignatureNotFoundException(sb.toString());
                }
                int i2 = (int) j;
                int position = a.position() + i2;
                if (i2 <= a.remaining()) {
                    linkedHashMap.put(Integer.valueOf(a.getInt()), m19912a(a, i2 - 4));
                    a.position(position);
                } else {
                    StringBuilder sb2 = new StringBuilder("APK Signing Block entry #");
                    sb2.append(i);
                    sb2.append(" size out of range: ");
                    sb2.append(i2);
                    sb2.append(", available: ");
                    sb2.append(a.remaining());
                    throw new SignatureNotFoundException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Insufficient data to read size of APK Signing Block entry #");
                sb3.append(i);
                throw new SignatureNotFoundException(sb3.toString());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private static long m19910a(FileChannel fileChannel, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j) - 6);
        fileChannel.read(allocate);
        return (long) allocate.getInt(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r4 != null) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d A[SYNTHETIC, Splitter:B:19:0x004d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19911a(java.lang.String r3, int r4) {
        /*
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r0 = 0
            if (r4 == 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x0051, all -> 0x0049 }
            java.lang.String r1 = "r"
            r4.<init>(r3, r1)     // Catch:{ Throwable -> 0x0051, all -> 0x0049 }
            java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            com.bytedance.ies.ugc.appcontext.ApkUtil$a r3 = m19918c(r3)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            A r3 = r3.f18688a     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.util.Map r3 = m19917b(r3)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            r1 = 1903654775(0x71777777, float:1.22539554E30)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            boolean r2 = r3.containsKey(r2)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            byte[] r3 = m19914a(r3)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            r4.close()     // Catch:{ Throwable -> 0x0042 }
        L_0x0042:
            return r2
        L_0x0043:
            r4.close()     // Catch:{ Throwable -> 0x0055 }
            goto L_0x0055
        L_0x0047:
            r3 = move-exception
            goto L_0x004b
        L_0x0049:
            r3 = move-exception
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0050
            r4.close()     // Catch:{ Throwable -> 0x0050 }
        L_0x0050:
            throw r3
        L_0x0051:
            r4 = r0
        L_0x0052:
            if (r4 == 0) goto L_0x0055
            goto L_0x0043
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.appcontext.ApkUtil.m19911a(java.lang.String, int):java.lang.String");
    }

    /* renamed from: b */
    private static C6397a<ByteBuffer, Long> m19916b(FileChannel fileChannel, long j) throws IOException, SignatureNotFoundException {
        if (j >= 32) {
            fileChannel.position(j - 24);
            ByteBuffer allocate = ByteBuffer.allocate(24);
            fileChannel.read(allocate);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                long j2 = allocate.getLong(0);
                if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                    StringBuilder sb = new StringBuilder("APK Signing Block size out of range: ");
                    sb.append(j2);
                    throw new SignatureNotFoundException(sb.toString());
                }
                int i = (int) (8 + j2);
                long j3 = j - ((long) i);
                if (j3 >= 0) {
                    fileChannel.position(j3);
                    ByteBuffer allocate2 = ByteBuffer.allocate(i);
                    fileChannel.read(allocate2);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    long j4 = allocate2.getLong(0);
                    if (j4 == j2) {
                        return C6397a.m19920a(allocate2, Long.valueOf(j3));
                    }
                    StringBuilder sb2 = new StringBuilder("APK Signing Block sizes in header and footer do not match: ");
                    sb2.append(j4);
                    sb2.append(" vs ");
                    sb2.append(j2);
                    throw new SignatureNotFoundException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder("APK Signing Block offset out of range: ");
                sb3.append(j3);
                throw new SignatureNotFoundException(sb3.toString());
            }
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        StringBuilder sb4 = new StringBuilder("APK too small for APK Signing Block. ZIP Central Directory offset: ");
        sb4.append(j);
        throw new SignatureNotFoundException(sb4.toString());
    }

    /* renamed from: a */
    private static ByteBuffer m19912a(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static ByteBuffer m19913a(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            } else {
                StringBuilder sb = new StringBuilder("end > capacity: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(capacity);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("end < start: ");
            sb2.append(i2);
            sb2.append(" < 8");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
