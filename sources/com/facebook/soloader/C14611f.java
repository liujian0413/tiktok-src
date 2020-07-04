package com.facebook.soloader;

import android.content.Context;
import com.C1642a;
import com.facebook.soloader.C14627p.C14629a;
import com.facebook.soloader.C14627p.C14630b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.f */
public class C14611f extends C14627p {

    /* renamed from: d */
    protected final File f37743d;

    /* renamed from: e */
    protected final String f37744e;

    /* renamed from: com.facebook.soloader.f$a */
    static final class C14613a extends C14629a implements Comparable {

        /* renamed from: a */
        final ZipEntry f37745a;

        /* renamed from: b */
        final int f37746b;

        public final int compareTo(Object obj) {
            return this.f37765c.compareTo(((C14613a) obj).f37765c);
        }

        /* renamed from: a */
        private static String m42275a(ZipEntry zipEntry) {
            return C1642a.m8034a("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())});
        }

        C14613a(String str, ZipEntry zipEntry, int i) {
            super(str, m42275a(zipEntry));
            this.f37745a = zipEntry;
            this.f37746b = i;
        }
    }

    /* renamed from: com.facebook.soloader.f$b */
    protected class C14614b extends C14633e {

        /* renamed from: a */
        private final C14627p f37747a;

        /* renamed from: b */
        public C14613a[] f37748b;

        /* renamed from: c */
        public final ZipFile f37749c;

        /* renamed from: com.facebook.soloader.f$b$a */
        final class C14615a extends C14632d {

            /* renamed from: b */
            private int f37752b;

            /* renamed from: a */
            public final boolean mo36857a() {
                C14614b.this.mo36860c();
                if (this.f37752b < C14614b.this.f37748b.length) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final C14631c mo36858b() throws IOException {
                C14614b.this.mo36860c();
                C14613a[] aVarArr = C14614b.this.f37748b;
                int i = this.f37752b;
                this.f37752b = i + 1;
                C14613a aVar = aVarArr[i];
                InputStream inputStream = C14614b.this.f37749c.getInputStream(aVar.f37745a);
                try {
                    return new C14631c(aVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }

            private C14615a() {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo36849a(ZipEntry zipEntry, String str) {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C14632d mo36856b() throws IOException {
            return new C14615a();
        }

        public void close() throws IOException {
            this.f37749c.close();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C14630b mo36855a() throws IOException {
            return new C14630b(mo36860c());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C14613a[] mo36860c() {
            if (this.f37748b == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C14611f.this.f37744e);
                String[] a = C14624n.m42302a();
                Enumeration entries = this.f37749c.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int a2 = C14624n.m42299a(a, group);
                        if (a2 >= 0) {
                            linkedHashSet.add(group);
                            C14613a aVar = (C14613a) hashMap.get(group2);
                            if (aVar == null || a2 < aVar.f37746b) {
                                hashMap.put(group2, new C14613a(group2, zipEntry, a2));
                            }
                        }
                    }
                }
                this.f37747a.f37758h = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                C14613a[] aVarArr = (C14613a[]) hashMap.values().toArray(new C14613a[hashMap.size()]);
                Arrays.sort(aVarArr);
                int i = 0;
                for (int i2 = 0; i2 < aVarArr.length; i2++) {
                    C14613a aVar2 = aVarArr[i2];
                    if (mo36849a(aVar2.f37745a, aVar2.f37765c)) {
                        i++;
                    } else {
                        aVarArr[i2] = null;
                    }
                }
                C14613a[] aVarArr2 = new C14613a[i];
                int i3 = 0;
                for (C14613a aVar3 : aVarArr) {
                    if (aVar3 != null) {
                        int i4 = i3 + 1;
                        aVarArr2[i3] = aVar3;
                        i3 = i4;
                    }
                }
                this.f37748b = aVarArr2;
            }
            return this.f37748b;
        }

        C14614b(C14627p pVar) throws IOException {
            this.f37749c = new ZipFile(C14611f.this.f37743d);
            this.f37747a = pVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C14633e mo36847a() throws IOException {
        return new C14614b(this);
    }

    public C14611f(Context context, String str, File file, String str2) {
        super(context, str);
        this.f37743d = file;
        this.f37744e = str2;
    }
}
