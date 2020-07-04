package com.facebook.binaryresource;

import com.facebook.common.internal.C13307g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.binaryresource.b */
public final class C13232b implements C13231a {

    /* renamed from: a */
    public final File f35057a;

    /* renamed from: a */
    public final InputStream mo32427a() throws IOException {
        return new FileInputStream(this.f35057a);
    }

    /* renamed from: b */
    public final long mo32428b() {
        return this.f35057a.length();
    }

    public final int hashCode() {
        return this.f35057a.hashCode();
    }

    private C13232b(File file) {
        this.f35057a = (File) C13307g.m38940a(file);
    }

    /* renamed from: a */
    public static C13232b m38669a(File file) {
        if (file != null) {
            return new C13232b(file);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C13232b)) {
            return false;
        }
        return this.f35057a.equals(((C13232b) obj).f35057a);
    }
}
