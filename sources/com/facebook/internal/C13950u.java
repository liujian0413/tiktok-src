package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.facebook.C13499h;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* renamed from: com.facebook.internal.u */
public final class C13950u {

    /* renamed from: a */
    private static final String f36912a = "com.facebook.internal.u";

    /* renamed from: b */
    private static File f36913b;

    /* renamed from: com.facebook.internal.u$a */
    public static final class C13952a {

        /* renamed from: a */
        public final UUID f36914a;

        /* renamed from: b */
        public final String f36915b;

        /* renamed from: c */
        public final String f36916c;

        /* renamed from: d */
        public Bitmap f36917d;

        /* renamed from: e */
        public Uri f36918e;

        /* renamed from: f */
        public boolean f36919f;

        /* renamed from: g */
        public boolean f36920g;

        private C13952a(UUID uuid, Bitmap bitmap, Uri uri) {
            String str;
            String str2;
            this.f36914a = uuid;
            this.f36917d = bitmap;
            this.f36918e = uri;
            boolean z = true;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (C38347c.f99553h.equalsIgnoreCase(scheme)) {
                    this.f36919f = true;
                    if (uri.getAuthority() == null || uri.getAuthority().startsWith("media")) {
                        z = false;
                    }
                    this.f36920g = z;
                } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                    this.f36920g = true;
                } else if (!C13967z.m41259b(uri)) {
                    StringBuilder sb = new StringBuilder("Unsupported scheme for media Uri : ");
                    sb.append(scheme);
                    throw new FacebookException(sb.toString());
                }
            } else if (bitmap != null) {
                this.f36920g = true;
            } else {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
            if (!this.f36920g) {
                str = null;
            } else {
                str = UUID.randomUUID().toString();
            }
            this.f36916c = str;
            if (!this.f36920g) {
                str2 = this.f36918e.toString();
            } else {
                str2 = FacebookContentProvider.m38244a(C13499h.m39725k(), uuid, this.f36916c);
            }
            this.f36915b = str2;
        }
    }

    private C13950u() {
    }

    /* renamed from: a */
    private static void m41148a(Uri uri, boolean z, File file) throws IOException {
        InputStream inputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (!z) {
            try {
                inputStream = new FileInputStream(uri.getPath());
            } catch (Throwable th) {
                C13967z.m41239a((Closeable) fileOutputStream);
                throw th;
            }
        } else {
            inputStream = C13499h.m39721g().getContentResolver().openInputStream(uri);
        }
        C13967z.m41212a(inputStream, (OutputStream) fileOutputStream);
        C13967z.m41239a((Closeable) fileOutputStream);
    }

    /* renamed from: a */
    public static void m41149a(Collection<C13952a> collection) {
        if (collection != null && collection.size() != 0) {
            if (f36913b == null) {
                m41152c();
            }
            m41151b();
            ArrayList<File> arrayList = new ArrayList<>();
            try {
                for (C13952a aVar : collection) {
                    if (aVar.f36920g) {
                        File a = m41145a(aVar.f36914a, aVar.f36916c, true);
                        arrayList.add(a);
                        if (aVar.f36917d != null) {
                            m41147a(aVar.f36917d, a);
                        } else if (aVar.f36918e != null) {
                            m41148a(aVar.f36918e, aVar.f36919f, a);
                        }
                    }
                }
            } catch (IOException e) {
                for (File delete : arrayList) {
                    try {
                        delete.delete();
                    } catch (Exception unused) {
                    }
                }
                throw new FacebookException((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    private static File m41151b() {
        File a = m41143a();
        a.mkdirs();
        return a;
    }

    /* renamed from: c */
    private static void m41152c() {
        C13967z.m41240a(m41143a());
    }

    /* renamed from: a */
    private static synchronized File m41143a() {
        File file;
        synchronized (C13950u.class) {
            if (f36913b == null) {
                f36913b = new File(C13499h.m39721g().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f36913b;
        }
        return file;
    }

    /* renamed from: a */
    public static void m41150a(UUID uuid) {
        File a = m41146a(uuid, false);
        if (a != null) {
            C13967z.m41240a(a);
        }
    }

    /* renamed from: a */
    public static C13952a m41141a(UUID uuid, Bitmap bitmap) {
        C13876aa.m40978a((Object) uuid, "callId");
        C13876aa.m40978a((Object) bitmap, "attachmentBitmap");
        return new C13952a(uuid, bitmap, null);
    }

    /* renamed from: a */
    public static C13952a m41142a(UUID uuid, Uri uri) {
        C13876aa.m40978a((Object) uuid, "callId");
        C13876aa.m40978a((Object) uri, "attachmentUri");
        return new C13952a(uuid, null, uri);
    }

    /* renamed from: a */
    public static File m41144a(UUID uuid, String str) throws FileNotFoundException {
        if (C13967z.m41249a(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return m41145a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    /* renamed from: a */
    private static File m41146a(UUID uuid, boolean z) {
        if (f36913b == null) {
            return null;
        }
        File file = new File(f36913b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    private static void m41147a(Bitmap bitmap, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            C13967z.m41239a((Closeable) fileOutputStream);
        }
    }

    /* renamed from: a */
    private static File m41145a(UUID uuid, String str, boolean z) throws IOException {
        File a = m41146a(uuid, z);
        if (a == null) {
            return null;
        }
        try {
            return new File(a, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
