package com.google.firebase.components;

import com.google.firebase.p785a.C18262a;
import com.google.firebase.p785a.C18263b;
import java.util.Map.Entry;

/* renamed from: com.google.firebase.components.m */
final /* synthetic */ class C18293m implements Runnable {

    /* renamed from: a */
    private final Entry f49711a;

    /* renamed from: b */
    private final C18262a f49712b;

    private C18293m(Entry entry, C18262a aVar) {
        this.f49711a = entry;
        this.f49712b = aVar;
    }

    /* renamed from: a */
    public static Runnable m60311a(Entry entry, C18262a aVar) {
        return new C18293m(entry, aVar);
    }

    public final void run() {
        ((C18263b) this.f49711a.getKey()).mo47127a(this.f49712b);
    }
}
