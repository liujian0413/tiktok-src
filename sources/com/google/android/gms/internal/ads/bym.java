package com.google.android.gms.internal.ads;

import java.util.Random;
import java.util.WeakHashMap;

@C6505uv
public final class bym {

    /* renamed from: a */
    private static bym f44195a = new bym();

    /* renamed from: b */
    private final afb f44196b;

    /* renamed from: c */
    private final bye f44197c;

    /* renamed from: d */
    private final String f44198d;

    /* renamed from: e */
    private final C15580br f44199e;

    /* renamed from: f */
    private final C15581bs f44200f;

    /* renamed from: g */
    private final C15582bt f44201g;

    /* renamed from: h */
    private final zzbgz f44202h;

    /* renamed from: i */
    private final Random f44203i;

    /* renamed from: j */
    private final WeakHashMap<Object, String> f44204j;

    protected bym() {
        afb afb = new afb();
        bye bye = new bye(new bxw(), new bxv(), new C15543aw(), new C15712gn(), new C16200yq(), new C16231zu(), new C16018rw(), new C15713go());
        this(afb, bye, new C15580br(), new C15581bs(), new C15582bt(), afb.m45736c(), new zzbgz(0, 15302000, true), new Random(), new WeakHashMap());
    }

    private bym(afb afb, bye bye, C15580br brVar, C15581bs bsVar, C15582bt btVar, String str, zzbgz zzbgz, Random random, WeakHashMap<Object, String> weakHashMap) {
        this.f44196b = afb;
        this.f44197c = bye;
        this.f44199e = brVar;
        this.f44200f = bsVar;
        this.f44201g = btVar;
        this.f44198d = str;
        this.f44202h = zzbgz;
        this.f44203i = random;
        this.f44204j = weakHashMap;
    }

    /* renamed from: a */
    public static afb m50296a() {
        return f44195a.f44196b;
    }

    /* renamed from: b */
    public static bye m50297b() {
        return f44195a.f44197c;
    }

    /* renamed from: c */
    public static C15580br m50298c() {
        return f44195a.f44199e;
    }

    /* renamed from: d */
    public static C15582bt m50299d() {
        return f44195a.f44201g;
    }

    /* renamed from: e */
    public static String m50300e() {
        return f44195a.f44198d;
    }

    /* renamed from: f */
    public static zzbgz m50301f() {
        return f44195a.f44202h;
    }

    /* renamed from: g */
    public static Random m50302g() {
        return f44195a.f44203i;
    }
}
