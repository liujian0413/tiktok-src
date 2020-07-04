package com.google.gson.internal.bind;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters$26 implements C6717s {
    TypeAdapters$26() {
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        if (aVar.rawType != Timestamp.class) {
            return null;
        }
        final C6715r a = eVar.mo15967a(Date.class);
        return new C6715r<Timestamp>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Timestamp read(C6718a aVar) throws IOException {
                Date date = (Date) a.read(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void write(C6720b bVar, Timestamp timestamp) throws IOException {
                a.write(bVar, timestamp);
            }
        };
    }
}
