package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.C1642a;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* renamed from: com.facebook.soloader.a */
public final class C14602a extends C14611f {

    /* renamed from: a */
    public final int f37729a;

    /* renamed from: com.facebook.soloader.a$a */
    protected class C14603a extends C14614b {

        /* renamed from: e */
        private File f37731e;

        /* renamed from: f */
        private final int f37732f;

        C14603a(C14611f fVar) throws IOException {
            super(fVar);
            this.f37731e = new File(C14602a.this.f37756f.getApplicationInfo().nativeLibraryDir);
            this.f37732f = C14602a.this.f37729a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo36849a(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(C14602a.this.f37757g)) {
                C14602a.this.f37757g = null;
                C1642a.m8034a("allowing consideration of corrupted lib %s", new Object[]{str});
                return true;
            } else if ((this.f37732f & 1) == 0) {
                StringBuilder sb = new StringBuilder("allowing consideration of ");
                sb.append(name);
                sb.append(": self-extraction preferred");
                return true;
            } else {
                File file = new File(this.f37731e, str);
                if (!file.isFile()) {
                    C1642a.m8034a("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                    return true;
                }
                long length = file.length();
                long size = zipEntry.getSize();
                if (length != size) {
                    C1642a.m8034a("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                    return true;
                }
                StringBuilder sb2 = new StringBuilder("not allowing consideration of ");
                sb2.append(name);
                sb2.append(": deferring to libdir");
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14633e mo36847a() throws IOException {
        return new C14603a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final byte[] mo36848b() throws IOException {
        File canonicalFile = this.f37743d.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte(2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(C14624n.m42297a(this.f37756f));
            if ((this.f37729a & 1) == 0) {
                obtain.writeByte(0);
                return obtain.marshall();
            }
            String str = this.f37756f.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte(1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte(1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte(2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    public C14602a(Context context, String str, int i) {
        super(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$");
        this.f37729a = i;
    }
}
