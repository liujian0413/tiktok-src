package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.IOException;

/* renamed from: com.facebook.soloader.b */
public final class C14604b extends C14623m {

    /* renamed from: a */
    private Context f37733a;

    /* renamed from: b */
    private int f37734b;

    /* renamed from: c */
    private C14605c f37735c;

    public final String toString() {
        return this.f37735c.toString();
    }

    /* renamed from: a */
    public final boolean mo36852a() throws IOException {
        try {
            File file = this.f37735c.f37736b;
            Context createPackageContext = this.f37733a.createPackageContext(this.f37733a.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            this.f37734b |= 1;
            this.f37735c = new C14605c(file2, this.f37734b);
            this.f37735c.mo36851a(this.f37734b);
            this.f37733a = createPackageContext;
            return true;
        } catch (NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36851a(int i) throws IOException {
        this.f37735c.mo36851a(i);
    }

    public C14604b(Context context, int i) {
        this.f37733a = context.getApplicationContext();
        if (this.f37733a == null) {
            this.f37733a = context;
        }
        this.f37734b = i;
        this.f37735c = new C14605c(new File(this.f37733a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: a */
    public final int mo36850a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        return this.f37735c.mo36850a(str, i, threadPolicy);
    }
}
