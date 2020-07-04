package com.p280ss.android.common.p852c.p853a;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.common.c.a.a */
public final class C19274a {

    /* renamed from: a */
    public Set<C19277c> f52170a = new HashSet();

    /* renamed from: com.ss.android.common.c.a.a$a */
    public class C19275a implements C19277c {

        /* renamed from: a */
        String f52171a;

        /* renamed from: b */
        byte[] f52172b;

        /* renamed from: c */
        public String f52173c;

        /* renamed from: a */
        public final String mo51163a() {
            return this.f52171a;
        }

        /* renamed from: b */
        public final Object mo51164b() {
            return this.f52172b;
        }

        public C19275a(String str, byte[] bArr, String str2) {
            this.f52171a = str;
            this.f52172b = bArr;
            this.f52173c = str2;
        }
    }

    /* renamed from: com.ss.android.common.c.a.a$b */
    public class C19276b implements C19277c {

        /* renamed from: a */
        String f52175a;

        /* renamed from: b */
        File f52176b;

        /* renamed from: a */
        public final String mo51163a() {
            return this.f52175a;
        }

        /* renamed from: b */
        public final Object mo51164b() {
            return this.f52176b;
        }

        public C19276b(String str, File file) {
            this.f52175a = str;
            this.f52176b = file;
        }
    }

    /* renamed from: com.ss.android.common.c.a.a$c */
    public interface C19277c {
        /* renamed from: a */
        String mo51163a();

        /* renamed from: b */
        Object mo51164b();
    }

    /* renamed from: com.ss.android.common.c.a.a$d */
    public class C19278d implements C19277c {

        /* renamed from: a */
        String f52178a;

        /* renamed from: b */
        String f52179b;

        /* renamed from: a */
        public final String mo51163a() {
            return this.f52178a;
        }

        /* renamed from: b */
        public final Object mo51164b() {
            return this.f52179b;
        }

        public C19278d(String str, String str2) {
            this.f52178a = str;
            this.f52179b = str2;
        }
    }

    /* renamed from: a */
    public final void mo51160a(String str, File file) {
        this.f52170a.add(new C19276b(str, file));
    }

    /* renamed from: a */
    public final void mo51161a(String str, String str2) {
        this.f52170a.add(new C19278d(str, str2));
    }

    /* renamed from: a */
    public final void mo51162a(String str, byte[] bArr, String str2) {
        this.f52170a.add(new C19275a(str, bArr, str2));
    }
}
