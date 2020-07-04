package com.google.gson;

import com.google.gson.internal.C6700i;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: com.google.gson.n */
public final class C18373n {
    /* renamed from: a */
    public final C6709k mo47346a(String str) throws JsonSyntaxException {
        return m60531a((Reader) new StringReader(str));
    }

    /* renamed from: a */
    private C6709k m60531a(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            C6718a aVar = new C6718a(reader);
            C6709k a = m60530a(aVar);
            if (!a.mo16135l()) {
                if (aVar.mo16088f() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("Did not consume the entire document.");
                }
            }
            return a;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException((Throwable) e);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        }
    }

    /* renamed from: a */
    private static C6709k m60530a(C6718a aVar) throws JsonIOException, JsonSyntaxException {
        boolean z = aVar.f19170a;
        aVar.f19170a = true;
        try {
            C6709k a = C6700i.m20725a(aVar);
            aVar.f19170a = z;
            return a;
        } catch (StackOverflowError e) {
            StringBuilder sb = new StringBuilder("Failed parsing JSON source: ");
            sb.append(aVar);
            sb.append(" to Json");
            throw new JsonParseException(sb.toString(), e);
        } catch (OutOfMemoryError e2) {
            StringBuilder sb2 = new StringBuilder("Failed parsing JSON source: ");
            sb2.append(aVar);
            sb2.append(" to Json");
            throw new JsonParseException(sb2.toString(), e2);
        } catch (Throwable th) {
            aVar.f19170a = z;
            throw th;
        }
    }
}
