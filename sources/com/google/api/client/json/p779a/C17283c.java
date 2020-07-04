package com.google.api.client.json.p779a;

import com.google.api.client.json.C17291c;
import com.google.api.client.json.C17295f;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.C17384w;
import com.google.gson.stream.C6718a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.api.client.json.a.c */
final class C17283c extends C17295f {

    /* renamed from: a */
    private final C6718a f48149a;

    /* renamed from: b */
    private final C17280a f48150b;

    /* renamed from: c */
    private List<String> f48151c = new ArrayList();

    /* renamed from: d */
    private JsonToken f48152d;

    /* renamed from: e */
    private String f48153e;

    /* renamed from: a */
    public final C17291c mo44691a() {
        return this.f48150b;
    }

    /* renamed from: d */
    public final JsonToken mo44694d() {
        return this.f48152d;
    }

    /* renamed from: g */
    public final String mo44697g() {
        return this.f48153e;
    }

    /* renamed from: b */
    public final void mo44692b() throws IOException {
        this.f48149a.close();
    }

    /* renamed from: h */
    public final byte mo44698h() {
        m57519p();
        return Byte.valueOf(this.f48153e).byteValue();
    }

    /* renamed from: i */
    public final short mo44699i() {
        m57519p();
        return Short.valueOf(this.f48153e).shortValue();
    }

    /* renamed from: j */
    public final int mo44700j() {
        m57519p();
        return Integer.valueOf(this.f48153e).intValue();
    }

    /* renamed from: k */
    public final float mo44701k() {
        m57519p();
        return Float.valueOf(this.f48153e).floatValue();
    }

    /* renamed from: l */
    public final long mo44702l() {
        m57519p();
        return Long.valueOf(this.f48153e).longValue();
    }

    /* renamed from: m */
    public final double mo44703m() {
        m57519p();
        return Double.valueOf(this.f48153e).doubleValue();
    }

    /* renamed from: n */
    public final BigInteger mo44704n() {
        m57519p();
        return new BigInteger(this.f48153e);
    }

    /* renamed from: o */
    public final BigDecimal mo44705o() {
        m57519p();
        return new BigDecimal(this.f48153e);
    }

    /* renamed from: p */
    private void m57519p() {
        boolean z;
        if (this.f48152d == JsonToken.VALUE_NUMBER_INT || this.f48152d == JsonToken.VALUE_NUMBER_FLOAT) {
            z = true;
        } else {
            z = false;
        }
        C17384w.m57850a(z);
    }

    /* renamed from: e */
    public final String mo44695e() {
        if (this.f48151c.isEmpty()) {
            return null;
        }
        return (String) this.f48151c.get(this.f48151c.size() - 1);
    }

    /* renamed from: f */
    public final C17295f mo44696f() throws IOException {
        if (this.f48152d != null) {
            switch (this.f48152d) {
                case START_ARRAY:
                    this.f48149a.mo16096n();
                    this.f48153e = "]";
                    this.f48152d = JsonToken.END_ARRAY;
                    break;
                case START_OBJECT:
                    this.f48149a.mo16096n();
                    this.f48153e = "}";
                    this.f48152d = JsonToken.END_OBJECT;
                    break;
            }
        }
        return this;
    }

    /* renamed from: c */
    public final JsonToken mo44693c() throws IOException {
        com.google.gson.stream.JsonToken jsonToken;
        JsonToken jsonToken2;
        if (this.f48152d != null) {
            switch (this.f48152d) {
                case START_ARRAY:
                    this.f48149a.mo16082a();
                    this.f48151c.add(null);
                    break;
                case START_OBJECT:
                    this.f48149a.mo16084c();
                    this.f48151c.add(null);
                    break;
            }
        }
        try {
            jsonToken = this.f48149a.mo16088f();
        } catch (EOFException unused) {
            jsonToken = com.google.gson.stream.JsonToken.END_DOCUMENT;
        }
        switch (jsonToken) {
            case BEGIN_ARRAY:
                this.f48153e = "[";
                this.f48152d = JsonToken.START_ARRAY;
                break;
            case END_ARRAY:
                this.f48153e = "]";
                this.f48152d = JsonToken.END_ARRAY;
                this.f48151c.remove(this.f48151c.size() - 1);
                this.f48149a.mo16083b();
                break;
            case BEGIN_OBJECT:
                this.f48153e = "{";
                this.f48152d = JsonToken.START_OBJECT;
                break;
            case END_OBJECT:
                this.f48153e = "}";
                this.f48152d = JsonToken.END_OBJECT;
                this.f48151c.remove(this.f48151c.size() - 1);
                this.f48149a.mo16086d();
                break;
            case BOOLEAN:
                if (!this.f48149a.mo16091i()) {
                    this.f48153e = "false";
                    this.f48152d = JsonToken.VALUE_FALSE;
                    break;
                } else {
                    this.f48153e = "true";
                    this.f48152d = JsonToken.VALUE_TRUE;
                    break;
                }
            case NULL:
                this.f48153e = TEVideoRecorder.FACE_BEAUTY_NULL;
                this.f48152d = JsonToken.VALUE_NULL;
                this.f48149a.mo16092j();
                break;
            case STRING:
                this.f48153e = this.f48149a.mo16090h();
                this.f48152d = JsonToken.VALUE_STRING;
                break;
            case NUMBER:
                this.f48153e = this.f48149a.mo16090h();
                if (this.f48153e.indexOf(46) == -1) {
                    jsonToken2 = JsonToken.VALUE_NUMBER_INT;
                } else {
                    jsonToken2 = JsonToken.VALUE_NUMBER_FLOAT;
                }
                this.f48152d = jsonToken2;
                break;
            case NAME:
                this.f48153e = this.f48149a.mo16089g();
                this.f48152d = JsonToken.FIELD_NAME;
                this.f48151c.set(this.f48151c.size() - 1, this.f48153e);
                break;
            default:
                this.f48153e = null;
                this.f48152d = null;
                break;
        }
        return this.f48152d;
    }

    C17283c(C17280a aVar, C6718a aVar2) {
        this.f48150b = aVar;
        this.f48149a = aVar2;
        aVar2.f19170a = true;
    }
}
