package com.google.gson.internal.bind;

import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.bind.h */
public final class C6647h extends C6715r<Time> {

    /* renamed from: a */
    public static final C6717s f19067a = new TimeTypeAdapter$1();

    /* renamed from: b */
    private final DateFormat f19068b = new SimpleDateFormat("hh:mm:ss a");

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Time read(C6718a aVar) throws IOException {
        if (aVar.mo16088f() == JsonToken.NULL) {
            aVar.mo16092j();
            return null;
        }
        try {
            return new Time(this.f19068b.parse(aVar.mo16090h()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(C6720b bVar, Time time) throws IOException {
        String str;
        if (time == null) {
            str = null;
        } else {
            str = this.f19068b.format(time);
        }
        bVar.mo16110b(str);
    }
}
