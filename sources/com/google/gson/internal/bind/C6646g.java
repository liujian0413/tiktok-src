package com.google.gson.internal.bind;

import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.bind.g */
public final class C6646g extends C6715r<Date> {

    /* renamed from: a */
    public static final C6717s f19065a = new SqlDateTypeAdapter$1();

    /* renamed from: b */
    private final DateFormat f19066b = new SimpleDateFormat("MMM d, yyyy");

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Date read(C6718a aVar) throws IOException {
        if (aVar.mo16088f() == JsonToken.NULL) {
            aVar.mo16092j();
            return null;
        }
        try {
            return new Date(this.f19066b.parse(aVar.mo16090h()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(C6720b bVar, Date date) throws IOException {
        String str;
        if (date == null) {
            str = null;
        } else {
            str = this.f19066b.format(date);
        }
        bVar.mo16110b(str);
    }
}
