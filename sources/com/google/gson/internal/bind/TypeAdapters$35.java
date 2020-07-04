package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;

class TypeAdapters$35 implements C6717s {

    /* renamed from: a */
    final /* synthetic */ Class f19041a;

    /* renamed from: b */
    final /* synthetic */ C6715r f19042b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
        sb.append(this.f19041a.getName());
        sb.append(",adapter=");
        sb.append(this.f19042b);
        sb.append("]");
        return sb.toString();
    }

    TypeAdapters$35(Class cls, C6715r rVar) {
        this.f19041a = cls;
        this.f19042b = rVar;
    }

    public final <T2> C6715r<T2> create(C6600e eVar, C6597a<T2> aVar) {
        final Class<? super T> cls = aVar.rawType;
        if (!this.f19041a.isAssignableFrom(cls)) {
            return null;
        }
        return new C6715r<T1>() {
            public final T1 read(C6718a aVar) throws IOException {
                T1 read = TypeAdapters$35.this.f19042b.read(aVar);
                if (read == null || cls.isInstance(read)) {
                    return read;
                }
                StringBuilder sb = new StringBuilder("Expected a ");
                sb.append(cls.getName());
                sb.append(" but was ");
                sb.append(read.getClass().getName());
                throw new JsonSyntaxException(sb.toString());
            }

            public final void write(C6720b bVar, T1 t1) throws IOException {
                TypeAdapters$35.this.f19042b.write(bVar, t1);
            }
        };
    }
}
