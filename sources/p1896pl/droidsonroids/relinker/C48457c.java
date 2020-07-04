package p1896pl.droidsonroids.relinker;

import android.content.Context;
import android.util.Log;
import com.C1642a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p1896pl.droidsonroids.relinker.C48453b.C48454a;
import p1896pl.droidsonroids.relinker.C48453b.C48455b;
import p1896pl.droidsonroids.relinker.C48453b.C48456c;
import p1896pl.droidsonroids.relinker.p1898a.C48448f;

/* renamed from: pl.droidsonroids.relinker.c */
public final class C48457c {

    /* renamed from: a */
    protected final Set<String> f123568a;

    /* renamed from: b */
    protected final C48455b f123569b;

    /* renamed from: c */
    protected final C48454a f123570c;

    /* renamed from: d */
    protected boolean f123571d;

    /* renamed from: e */
    protected boolean f123572e;

    protected C48457c() {
        this(new C48460d(), new C48437a());
    }

    /* renamed from: a */
    private static File m150139a(Context context) {
        return context.getDir("lib", 0);
    }

    /* renamed from: a */
    private void m150140a(Context context, String str) {
        mo123272a(context, str, null, null);
    }

    private C48457c(C48455b bVar, C48454a aVar) {
        this.f123568a = new HashSet();
        this.f123569b = bVar;
        this.f123570c = aVar;
    }

    /* renamed from: a */
    public final void mo123273a(String str, Object... objArr) {
        C1642a.m8035a(Locale.US, str, objArr);
    }

    /* renamed from: b */
    private File m150141b(Context context, String str, String str2) {
        String c = this.f123569b.mo123269c(str);
        if (C48462f.m150153a(str2)) {
            return new File(m150139a(context), c);
        }
        File a = m150139a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str2);
        return new File(a, sb.toString());
    }

    /* renamed from: c */
    private void m150142c(Context context, String str, String str2) {
        File a = m150139a(context);
        File b = m150141b(context, str, str2);
        final String c = this.f123569b.mo123269c(str);
        File[] listFiles = a.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.startsWith(c);
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f123571d || !file.getAbsolutePath().equals(b.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo123271a(Context context, String str, String str2) {
        C48448f fVar;
        C48448f fVar2;
        if (!this.f123568a.contains(str) || this.f123571d) {
            try {
                this.f123569b.mo123266a(str);
                this.f123568a.add(str);
                mo123273a("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e) {
                mo123273a("Loading the library normally failed: %s", Log.getStackTraceString(e));
                mo123273a("%s (%s) was not loaded normally, re-linking...", str, str2);
                File b = m150141b(context, str, str2);
                if (!b.exists() || this.f123571d) {
                    if (this.f123571d) {
                        mo123273a("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    m150142c(context, str, str2);
                    this.f123570c.mo123257a(context, this.f123569b.mo123267a(), this.f123569b.mo123269c(str), b, this);
                }
                try {
                    if (this.f123572e) {
                        fVar = null;
                        fVar2 = new C48448f(b);
                        List<String> a = fVar2.mo123262a();
                        fVar2.close();
                        for (String d : a) {
                            m150140a(context, this.f123569b.mo123270d(d));
                        }
                    }
                } catch (IOException unused) {
                }
                this.f123569b.mo123268b(b.getAbsolutePath());
                this.f123568a.add(str);
                mo123273a("%s (%s) was re-linked!", str, str2);
            } catch (Throwable th) {
                th = th;
                fVar = fVar2;
                fVar.close();
                throw th;
            }
        } else {
            mo123273a("%s already loaded previously!", str);
        }
    }

    /* renamed from: a */
    public final void mo123272a(Context context, String str, String str2, C48456c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C48462f.m150153a(str)) {
            mo123273a("Beginning load of %s...", str);
            if (cVar == null) {
                mo123271a(context, str, str2);
                return;
            }
            final Context context2 = context;
            final String str3 = str;
            final String str4 = str2;
            final C48456c cVar2 = cVar;
            C484581 r1 = new Runnable() {
                public final void run() {
                    try {
                        C48457c.this.mo123271a(context2, str3, str4);
                    } catch (UnsatisfiedLinkError unused) {
                    } catch (MissingLibraryException unused2) {
                    }
                }
            };
            new Thread(r1).start();
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }
}
