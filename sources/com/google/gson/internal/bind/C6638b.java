package com.google.gson.internal.bind;

import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C6695d;
import com.google.gson.internal.C6698g;
import com.google.gson.internal.bind.p279a.C6637a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.internal.bind.b */
public final class C6638b extends C6715r<Date> {

    /* renamed from: a */
    public static final C6717s f19049a = new DateTypeAdapter$1();

    /* renamed from: b */
    private final List<DateFormat> f19050b = new ArrayList();

    public C6638b() {
        this.f19050b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f19050b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C6695d.m20714b()) {
            this.f19050b.add(C6698g.m20720a(2, 2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Date read(C6718a aVar) throws IOException {
        if (aVar.mo16088f() != JsonToken.NULL) {
            return m20586a(aVar.mo16090h());
        }
        aVar.mo16092j();
        return null;
    }

    /* renamed from: a */
    private synchronized Date m20586a(String str) {
        for (DateFormat parse : this.f19050b) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C6637a.m20583a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void write(C6720b bVar, Date date) throws IOException {
        if (date == null) {
            bVar.mo16115f();
        } else {
            bVar.mo16110b(((DateFormat) this.f19050b.get(0)).format(date));
        }
    }
}
