package com.facebook.cache.p683a;

import com.facebook.binaryresource.C13231a;
import com.facebook.cache.common.C13271g;
import java.io.IOException;
import java.util.Collection;

/* renamed from: com.facebook.cache.a.d */
public interface C13248d {

    /* renamed from: com.facebook.cache.a.d$a */
    public interface C13249a {
        /* renamed from: a */
        String mo32443a();

        /* renamed from: b */
        long mo32444b();

        /* renamed from: c */
        long mo32445c();
    }

    /* renamed from: com.facebook.cache.a.d$b */
    public interface C13250b {
        /* renamed from: a */
        C13231a mo32449a(Object obj) throws IOException;

        /* renamed from: a */
        void mo32450a(C13271g gVar, Object obj) throws IOException;

        /* renamed from: a */
        boolean mo32451a();
    }

    /* renamed from: a */
    long mo32431a(C13249a aVar) throws IOException;

    /* renamed from: a */
    C13250b mo32433a(String str, Object obj) throws IOException;

    /* renamed from: a */
    boolean mo32435a();

    /* renamed from: b */
    long mo32436b(String str) throws IOException;

    /* renamed from: b */
    C13231a mo32437b(String str, Object obj) throws IOException;

    /* renamed from: b */
    void mo32438b();

    /* renamed from: c */
    void mo32439c() throws IOException;

    /* renamed from: c */
    boolean mo32440c(String str, Object obj) throws IOException;

    /* renamed from: d */
    Collection<C13249a> mo32441d() throws IOException;
}
