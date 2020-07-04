package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.C1642a;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.k */
public final class C16663k extends C16695r {

    /* renamed from: b */
    private static boolean f46560b;

    /* renamed from: c */
    private C14734a f46561c;

    /* renamed from: d */
    private final C16431bx f46562d;

    /* renamed from: e */
    private String f46563e;

    /* renamed from: f */
    private boolean f46564f;

    /* renamed from: g */
    private final Object f46565g = new Object();

    C16663k(C16697t tVar) {
        super(tVar);
        this.f46562d = new C16431bx(tVar.f46641c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42476a() {
    }

    /* renamed from: b */
    public final boolean mo43106b() {
        mo43214s();
        C14734a d = m54633d();
        if (d == null || d.f38080b) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo43107c() {
        mo43214s();
        C14734a d = m54633d();
        String str = d != null ? d.f38079a : null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    private final synchronized C14734a m54633d() {
        if (this.f46562d.mo42567a(1000)) {
            this.f46562d.mo42566a();
            C14734a e = m54634e();
            if (m54632a(this.f46561c, e)) {
                this.f46561c = e;
            } else {
                mo43202f("Failed to reset client id on adid change. Not using adid");
                this.f46561c = new C14734a("", false);
            }
        }
        return this.f46561c;
    }

    /* renamed from: a */
    private final boolean m54632a(C14734a aVar, C14734a aVar2) {
        String str = null;
        CharSequence charSequence = aVar2 == null ? null : aVar2.f38079a;
        if (TextUtils.isEmpty(charSequence)) {
            return true;
        }
        String b = mo43212p().mo42507b();
        synchronized (this.f46565g) {
            if (!this.f46564f) {
                this.f46563e = m54635f();
                this.f46564f = true;
            } else if (TextUtils.isEmpty(this.f46563e)) {
                if (aVar != null) {
                    str = aVar.f38079a;
                }
                if (str == null) {
                    String valueOf = String.valueOf(charSequence);
                    String valueOf2 = String.valueOf(b);
                    boolean g = m54636g(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                    return g;
                }
                String valueOf3 = String.valueOf(str);
                String valueOf4 = String.valueOf(b);
                this.f46563e = m54631a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            }
            String valueOf5 = String.valueOf(charSequence);
            String valueOf6 = String.valueOf(b);
            String a = m54631a(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5));
            if (TextUtils.isEmpty(a)) {
                return false;
            }
            if (a.equals(this.f46563e)) {
                return true;
            }
            if (!TextUtils.isEmpty(this.f46563e)) {
                mo43190b("Resetting the client id because Advertising Id changed.");
                b = mo43212p().mo42508c();
                mo43187a("New client Id", b);
            }
            String valueOf7 = String.valueOf(charSequence);
            String valueOf8 = String.valueOf(b);
            boolean g2 = m54636g(valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7));
            return g2;
        }
    }

    /* renamed from: e */
    private final C14734a m54634e() {
        try {
            return C14733a.m42585a(mo43204h());
        } catch (IllegalStateException unused) {
            mo43200e("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        } catch (Exception e) {
            if (!f46560b) {
                f46560b = true;
                mo43198d("Error getting advertiser id", e);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static String m54631a(String str) {
        MessageDigest b = C16432by.m53553b("MD5");
        if (b == null) {
            return null;
        }
        return C1642a.m8035a(Locale.US, "%032X", new Object[]{new BigInteger(1, b.digest(str.getBytes()))});
    }

    /* renamed from: g */
    private final boolean m54636g(String str) {
        try {
            String a = m54631a(str);
            mo43190b("Storing hashed adid.");
            FileOutputStream openFileOutput = mo43204h().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(a.getBytes());
            openFileOutput.close();
            this.f46563e = a;
            return true;
        } catch (IOException e) {
            mo43201e("Error creating hash file", e);
            return false;
        }
    }

    /* renamed from: f */
    private final String m54635f() {
        String str = null;
        try {
            FileInputStream openFileInput = mo43204h().openFileInput("gaClientIdData");
            byte[] bArr = new byte[PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH];
            int read = openFileInput.read(bArr, 0, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (openFileInput.available() > 0) {
                mo43200e("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                mo43204h().deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                mo43190b("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                } catch (FileNotFoundException unused) {
                } catch (IOException e) {
                    e = e;
                    str = str2;
                    mo43198d("Error reading Hash file, deleting it", e);
                    mo43204h().deleteFile("gaClientIdData");
                    return str;
                }
                return str2;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        } catch (IOException e2) {
            e = e2;
            mo43198d("Error reading Hash file, deleting it", e);
            mo43204h().deleteFile("gaClientIdData");
            return str;
        }
    }
}
