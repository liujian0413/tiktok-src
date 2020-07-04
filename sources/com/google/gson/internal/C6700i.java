package com.google.gson.internal;

import com.google.gson.C6709k;
import com.google.gson.internal.bind.C6649j;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.internal.i */
public final class C6700i {

    /* renamed from: com.google.gson.internal.i$a */
    static final class C6701a extends Writer {

        /* renamed from: a */
        private final Appendable f19156a;

        /* renamed from: b */
        private final C6702a f19157b = new C6702a();

        /* renamed from: com.google.gson.internal.i$a$a */
        static class C6702a implements CharSequence {

            /* renamed from: a */
            char[] f19158a;

            C6702a() {
            }

            public final int length() {
                return this.f19158a.length;
            }

            public final char charAt(int i) {
                return this.f19158a[i];
            }

            public final CharSequence subSequence(int i, int i2) {
                return new String(this.f19158a, i, i2 - i);
            }
        }

        public final void close() {
        }

        public final void flush() {
        }

        public final void write(int i) throws IOException {
            this.f19156a.append((char) i);
        }

        C6701a(Appendable appendable) {
            this.f19156a = appendable;
        }

        public final void write(char[] cArr, int i, int i2) throws IOException {
            this.f19157b.f19158a = cArr;
            this.f19156a.append(this.f19157b, i, i2 + i);
        }
    }

    /* renamed from: a */
    public static Writer m20726a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new C6701a(appendable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.gson.C6710l.f19164a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.C6709k m20725a(com.google.gson.stream.C6718a r2) throws com.google.gson.JsonParseException {
        /*
            r2.mo16088f()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.r<com.google.gson.k> r1 = com.google.gson.internal.bind.C6649j.f19095X     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.read(r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.gson.k r2 = (com.google.gson.C6709k) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.gson.l r2 = com.google.gson.C6710l.f19164a
            return r2
        L_0x002b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C6700i.m20725a(com.google.gson.stream.a):com.google.gson.k");
    }

    /* renamed from: a */
    public static void m20727a(C6709k kVar, C6720b bVar) throws IOException {
        C6649j.f19095X.write(bVar, kVar);
    }
}
