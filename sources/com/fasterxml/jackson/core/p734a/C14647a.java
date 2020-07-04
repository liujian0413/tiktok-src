package com.fasterxml.jackson.core.p734a;

import com.fasterxml.jackson.core.C14668d;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.p735b.C14656e;
import java.io.IOException;

/* renamed from: com.fasterxml.jackson.core.a.a */
public abstract class C14647a extends JsonGenerator {

    /* renamed from: b */
    protected C14668d f37803b;

    /* renamed from: c */
    protected int f37804c;

    /* renamed from: d */
    protected boolean f37805d;

    /* renamed from: e */
    public C14656e f37806e = C14656e.m42384f();

    /* renamed from: f */
    protected boolean f37807f;

    public void close() throws IOException {
        this.f37807f = true;
    }

    /* renamed from: b */
    protected static void m42362b(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str);
    }

    /* renamed from: a */
    public final boolean mo37138a(Feature feature) {
        if ((feature.getMask() & this.f37804c) != 0) {
            return true;
        }
        return false;
    }

    protected C14647a(int i, C14668d dVar) {
        this.f37804c = i;
        this.f37803b = dVar;
        this.f37805d = mo37138a(Feature.WRITE_NUMBERS_AS_STRINGS);
    }
}
