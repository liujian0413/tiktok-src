package com.bytedance.vast;

import com.bytedance.vast.exception.FetchException;
import com.bytedance.vast.exception.ParseException;
import com.bytedance.vast.p673a.C13009b;
import org.w3c.dom.Document;

/* renamed from: com.bytedance.vast.a */
public final class C13007a implements C13016b {

    /* renamed from: a */
    public static final C13007a f34437a = new C13007a();

    private C13007a() {
    }

    /* renamed from: a */
    public final Document mo31542a(String str) throws FetchException, ParseException {
        if (str != null) {
            return C13009b.m37965a(str);
        }
        return null;
    }
}
