package com.google.api.client.json;

import com.google.api.client.util.C17349ad;
import com.google.api.client.util.GenericData;
import java.io.IOException;

/* renamed from: com.google.api.client.json.b */
public class C17285b extends GenericData implements Cloneable {

    /* renamed from: a */
    public C17291c f48156a;

    /* renamed from: a */
    public C17285b clone() {
        return (C17285b) super.clone();
    }

    /* renamed from: d */
    public final String mo44706d() throws IOException {
        if (this.f48156a != null) {
            return this.f48156a.mo44721b(this);
        }
        return super.toString();
    }

    public String toString() {
        if (this.f48156a == null) {
            return super.toString();
        }
        try {
            return this.f48156a.mo44720a((Object) this);
        } catch (IOException e) {
            throw C17349ad.m57773a(e);
        }
    }

    /* renamed from: a */
    public C17285b mo44448c(String str, Object obj) {
        return (C17285b) super.mo44448c(str, obj);
    }
}
