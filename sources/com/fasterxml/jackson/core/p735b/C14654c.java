package com.fasterxml.jackson.core.p735b;

import com.fasterxml.jackson.core.C14668d;
import com.fasterxml.jackson.core.C14670f;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.p734a.C14647a;
import com.fasterxml.jackson.core.p737io.C14673b;
import com.fasterxml.jackson.core.p737io.C14674c;
import com.fasterxml.jackson.core.p737io.CharacterEscapes;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/* renamed from: com.fasterxml.jackson.core.b.c */
public abstract class C14654c extends C14647a {

    /* renamed from: g */
    protected static final int[] f37836g = C14673b.m42439c();

    /* renamed from: h */
    protected final C14674c f37837h;

    /* renamed from: i */
    protected int[] f37838i = f37836g;

    /* renamed from: j */
    protected int f37839j;

    /* renamed from: k */
    protected CharacterEscapes f37840k;

    /* renamed from: l */
    protected C14670f f37841l = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    /* renamed from: a */
    public final JsonGenerator mo37097a(C14670f fVar) {
        this.f37841l = fVar;
        return this;
    }

    /* renamed from: a */
    public final JsonGenerator mo37096a(int i) {
        this.f37839j = 127;
        return this;
    }

    /* renamed from: a */
    public final JsonGenerator mo37098a(CharacterEscapes characterEscapes) {
        this.f37840k = characterEscapes;
        if (characterEscapes == null) {
            this.f37838i = f37836g;
        } else {
            this.f37838i = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    public C14654c(C14674c cVar, int i, C14668d dVar) {
        super(i, dVar);
        this.f37837h = cVar;
        if (mo37138a(Feature.ESCAPE_NON_ASCII)) {
            mo37096a(127);
        }
    }
}
