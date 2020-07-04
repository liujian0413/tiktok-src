package com.p280ss.android.ugc.gamora.p1486a;

import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0070y;
import com.bytedance.jedi.arch.JediViewModel;

/* renamed from: com.ss.android.ugc.gamora.a.a */
public final class C36112a {

    /* renamed from: a */
    private final C0065w f94416a;

    /* renamed from: a */
    public final <T extends JediViewModel> T mo91871a(Class<T> cls) {
        if (cls.getCanonicalName() != null) {
            return m116286a(cls.getName(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C36112a(C0070y yVar, C0067b bVar) {
        this.f94416a = new C0065w(yVar, bVar);
    }

    /* renamed from: a */
    private <T extends JediViewModel> T m116286a(String str, Class<T> cls) {
        return (JediViewModel) this.f94416a.mo148a(str, cls);
    }
}
