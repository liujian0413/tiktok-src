package com.google.gson;

import com.google.gson.internal.C6695d;
import com.google.gson.internal.C6698g;
import com.google.gson.internal.bind.p279a.C6637a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.a */
final class C6590a extends C6715r<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f18902a;

    /* renamed from: b */
    private final List<DateFormat> f18903b = new ArrayList();

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f18903b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sb = new StringBuilder("DefaultDateTypeAdapter(");
            sb.append(((SimpleDateFormat) dateFormat).toPattern());
            sb.append(')');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("DefaultDateTypeAdapter(");
        sb2.append(dateFormat.getClass().getSimpleName());
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: a */
    private static Class<? extends Date> m20430a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        StringBuilder sb = new StringBuilder("Date type must be one of ");
        sb.append(Date.class);
        sb.append(", ");
        sb.append(Timestamp.class);
        sb.append(", or ");
        sb.append(java.sql.Date.class);
        sb.append(" but was ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Date read(C6718a aVar) throws IOException {
        if (aVar.mo16088f() == JsonToken.NULL) {
            aVar.mo16092j();
            return null;
        }
        Date a = m20432a(aVar.mo16090h());
        if (this.f18902a == Date.class) {
            return a;
        }
        if (this.f18902a == Timestamp.class) {
            return new Timestamp(a.getTime());
        }
        if (this.f18902a == java.sql.Date.class) {
            return new java.sql.Date(a.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private Date m20432a(String str) {
        synchronized (this.f18903b) {
            for (DateFormat parse : this.f18903b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date a = C6637a.m20583a(str, new ParsePosition(0));
                return a;
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void write(C6720b bVar, Date date) throws IOException {
        if (date == null) {
            bVar.mo16115f();
            return;
        }
        synchronized (this.f18903b) {
            bVar.mo16110b(((DateFormat) this.f18903b.get(0)).format(date));
        }
    }

    C6590a(Class<? extends Date> cls, String str) {
        this.f18902a = m20430a(cls);
        this.f18903b.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f18903b.add(new SimpleDateFormat(str));
        }
    }

    public C6590a(Class<? extends Date> cls, int i, int i2) {
        this.f18902a = m20430a(cls);
        this.f18903b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f18903b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C6695d.m20714b()) {
            this.f18903b.add(C6698g.m20720a(i, i2));
        }
    }
}
