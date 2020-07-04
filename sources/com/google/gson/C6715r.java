package com.google.gson;

import com.google.gson.internal.bind.C6639c;
import com.google.gson.internal.bind.C6641d;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.google.gson.r */
public abstract class C6715r<T> {
    public abstract T read(C6718a aVar) throws IOException;

    public abstract void write(C6720b bVar, T t) throws IOException;

    public final C6715r<T> nullSafe() {
        return new C6715r<T>() {
            public final T read(C6718a aVar) throws IOException {
                if (aVar.mo16088f() != JsonToken.NULL) {
                    return C6715r.this.read(aVar);
                }
                aVar.mo16092j();
                return null;
            }

            public final void write(C6720b bVar, T t) throws IOException {
                if (t == null) {
                    bVar.mo16115f();
                } else {
                    C6715r.this.write(bVar, t);
                }
            }
        };
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new C6718a(reader));
    }

    public final T fromJson(String str) throws IOException {
        return fromJson((Reader) new StringReader(str));
    }

    public final T fromJsonTree(C6709k kVar) {
        try {
            return read(new C6639c(kVar));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final C6709k toJsonTree(T t) {
        try {
            C6641d dVar = new C6641d();
            write(dVar, t);
            return dVar.mo16102a();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    public final void toJson(Writer writer, T t) throws IOException {
        write(new C6720b(writer), t);
    }
}
