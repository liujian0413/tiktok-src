package com.google.gson.internal.bind;

import com.google.gson.C6609h;
import com.google.gson.C6709k;
import com.google.gson.C6710l;
import com.google.gson.C6711m;
import com.google.gson.C6712o;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.p276a.C6593c;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.gson.internal.bind.j */
public final class C6649j {

    /* renamed from: A */
    public static final C6715r<String> f19072A = new C6715r<String>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20687a(aVar);
        }

        /* renamed from: a */
        private static String m20687a(C6718a aVar) throws IOException {
            JsonToken f = aVar.mo16088f();
            if (f == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            } else if (f == JsonToken.BOOLEAN) {
                return Boolean.toString(aVar.mo16091i());
            } else {
                return aVar.mo16090h();
            }
        }

        /* renamed from: a */
        private static void m20688a(C6720b bVar, String str) throws IOException {
            bVar.mo16110b(str);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20688a(bVar, (String) obj);
        }
    };

    /* renamed from: B */
    public static final C6715r<BigDecimal> f19073B = new C6715r<BigDecimal>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20689a(aVar);
        }

        /* renamed from: a */
        private static BigDecimal m20689a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo16090h());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        private static void m20690a(C6720b bVar, BigDecimal bigDecimal) throws IOException {
            bVar.mo16106a((Number) bigDecimal);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20690a(bVar, (BigDecimal) obj);
        }
    };

    /* renamed from: C */
    public static final C6715r<BigInteger> f19074C = new C6715r<BigInteger>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20637a(aVar);
        }

        /* renamed from: a */
        private static BigInteger m20637a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            try {
                return new BigInteger(aVar.mo16090h());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        private static void m20638a(C6720b bVar, BigInteger bigInteger) throws IOException {
            bVar.mo16106a((Number) bigInteger);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20638a(bVar, (BigInteger) obj);
        }
    };

    /* renamed from: D */
    public static final C6717s f19075D = m20631a(String.class, f19072A);

    /* renamed from: E */
    public static final C6715r<StringBuilder> f19076E = new C6715r<StringBuilder>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20639a(aVar);
        }

        /* renamed from: a */
        private static StringBuilder m20639a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() != JsonToken.NULL) {
                return new StringBuilder(aVar.mo16090h());
            }
            aVar.mo16092j();
            return null;
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20640a(bVar, (StringBuilder) obj);
        }

        /* renamed from: a */
        private static void m20640a(C6720b bVar, StringBuilder sb) throws IOException {
            String str;
            if (sb == null) {
                str = null;
            } else {
                str = sb.toString();
            }
            bVar.mo16110b(str);
        }
    };

    /* renamed from: F */
    public static final C6717s f19077F = m20631a(StringBuilder.class, f19076E);

    /* renamed from: G */
    public static final C6715r<StringBuffer> f19078G = new C6715r<StringBuffer>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20643a(aVar);
        }

        /* renamed from: a */
        private static StringBuffer m20643a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() != JsonToken.NULL) {
                return new StringBuffer(aVar.mo16090h());
            }
            aVar.mo16092j();
            return null;
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20644a(bVar, (StringBuffer) obj);
        }

        /* renamed from: a */
        private static void m20644a(C6720b bVar, StringBuffer stringBuffer) throws IOException {
            String str;
            if (stringBuffer == null) {
                str = null;
            } else {
                str = stringBuffer.toString();
            }
            bVar.mo16110b(str);
        }
    };

    /* renamed from: H */
    public static final C6717s f19079H = m20631a(StringBuffer.class, f19078G);

    /* renamed from: I */
    public static final C6715r<URL> f19080I = new C6715r<URL>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20645a(aVar);
        }

        /* renamed from: a */
        private static URL m20645a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            String h = aVar.mo16090h();
            if (TEVideoRecorder.FACE_BEAUTY_NULL.equals(h)) {
                return null;
            }
            return new URL(h);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20646a(bVar, (URL) obj);
        }

        /* renamed from: a */
        private static void m20646a(C6720b bVar, URL url) throws IOException {
            String str;
            if (url == null) {
                str = null;
            } else {
                str = url.toExternalForm();
            }
            bVar.mo16110b(str);
        }
    };

    /* renamed from: J */
    public static final C6717s f19081J = m20631a(URL.class, f19080I);

    /* renamed from: K */
    public static final C6715r<URI> f19082K = new C6715r<URI>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20647a(aVar);
        }

        /* renamed from: a */
        private static URI m20647a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            try {
                String h = aVar.mo16090h();
                if (TEVideoRecorder.FACE_BEAUTY_NULL.equals(h)) {
                    return null;
                }
                return new URI(h);
            } catch (URISyntaxException e) {
                throw new JsonIOException((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20648a(bVar, (URI) obj);
        }

        /* renamed from: a */
        private static void m20648a(C6720b bVar, URI uri) throws IOException {
            String str;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toASCIIString();
            }
            bVar.mo16110b(str);
        }
    };

    /* renamed from: L */
    public static final C6717s f19083L = m20631a(URI.class, f19082K);

    /* renamed from: M */
    public static final C6715r<InetAddress> f19084M = new C6715r<InetAddress>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20649a(aVar);
        }

        /* renamed from: a */
        private static InetAddress m20649a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() != JsonToken.NULL) {
                return InetAddress.getByName(aVar.mo16090h());
            }
            aVar.mo16092j();
            return null;
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20650a(bVar, (InetAddress) obj);
        }

        /* renamed from: a */
        private static void m20650a(C6720b bVar, InetAddress inetAddress) throws IOException {
            String str;
            if (inetAddress == null) {
                str = null;
            } else {
                str = inetAddress.getHostAddress();
            }
            bVar.mo16110b(str);
        }
    };

    /* renamed from: N */
    public static final C6717s f19085N = m20633b(InetAddress.class, f19084M);

    /* renamed from: O */
    public static final C6715r<UUID> f19086O = new C6715r<UUID>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20651a(aVar);
        }

        /* renamed from: a */
        private static UUID m20651a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() != JsonToken.NULL) {
                return UUID.fromString(aVar.mo16090h());
            }
            aVar.mo16092j();
            return null;
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20652a(bVar, (UUID) obj);
        }

        /* renamed from: a */
        private static void m20652a(C6720b bVar, UUID uuid) throws IOException {
            String str;
            if (uuid == null) {
                str = null;
            } else {
                str = uuid.toString();
            }
            bVar.mo16110b(str);
        }
    };

    /* renamed from: P */
    public static final C6717s f19087P = m20631a(UUID.class, f19086O);

    /* renamed from: Q */
    public static final C6715r<Currency> f19088Q = new C6715r<Currency>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20653a(aVar);
        }

        /* renamed from: a */
        private static Currency m20653a(C6718a aVar) throws IOException {
            return Currency.getInstance(aVar.mo16090h());
        }

        /* renamed from: a */
        private static void m20654a(C6720b bVar, Currency currency) throws IOException {
            bVar.mo16110b(currency.getCurrencyCode());
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20654a(bVar, (Currency) obj);
        }
    }.nullSafe();

    /* renamed from: R */
    public static final C6717s f19089R = m20631a(Currency.class, f19088Q);

    /* renamed from: S */
    public static final C6717s f19090S = new TypeAdapters$26();

    /* renamed from: T */
    public static final C6715r<Calendar> f19091T = new C6715r<Calendar>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20655a(aVar);
        }

        /* renamed from: a */
        private static Calendar m20655a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            aVar.mo16084c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.mo16088f() != JsonToken.END_OBJECT) {
                String g = aVar.mo16089g();
                int m = aVar.mo16095m();
                if ("year".equals(g)) {
                    i = m;
                } else if ("month".equals(g)) {
                    i2 = m;
                } else if ("dayOfMonth".equals(g)) {
                    i3 = m;
                } else if ("hourOfDay".equals(g)) {
                    i4 = m;
                } else if ("minute".equals(g)) {
                    i5 = m;
                } else if ("second".equals(g)) {
                    i6 = m;
                }
            }
            aVar.mo16086d();
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
            return gregorianCalendar;
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20656a(bVar, (Calendar) obj);
        }

        /* renamed from: a */
        private static void m20656a(C6720b bVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                bVar.mo16115f();
                return;
            }
            bVar.mo16113d();
            bVar.mo16107a("year");
            bVar.mo16104a((long) calendar.get(1));
            bVar.mo16107a("month");
            bVar.mo16104a((long) calendar.get(2));
            bVar.mo16107a("dayOfMonth");
            bVar.mo16104a((long) calendar.get(5));
            bVar.mo16107a("hourOfDay");
            bVar.mo16104a((long) calendar.get(11));
            bVar.mo16107a("minute");
            bVar.mo16104a((long) calendar.get(12));
            bVar.mo16107a("second");
            bVar.mo16104a((long) calendar.get(13));
            bVar.mo16114e();
        }
    };

    /* renamed from: U */
    public static final C6717s f19092U = m20634b(Calendar.class, GregorianCalendar.class, f19091T);

    /* renamed from: V */
    public static final C6715r<Locale> f19093V = new C6715r<Locale>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20659a(aVar);
        }

        /* renamed from: a */
        private static Locale m20659a(C6718a aVar) throws IOException {
            String str;
            String str2;
            String str3 = null;
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo16090h(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20660a(bVar, (Locale) obj);
        }

        /* renamed from: a */
        private static void m20660a(C6720b bVar, Locale locale) throws IOException {
            String str;
            if (locale == null) {
                str = null;
            } else {
                str = locale.toString();
            }
            bVar.mo16110b(str);
        }
    };

    /* renamed from: W */
    public static final C6717s f19094W = m20631a(Locale.class, f19093V);

    /* renamed from: X */
    public static final C6715r<C6709k> f19095X = new C6715r<C6709k>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C6709k read(C6718a aVar) throws IOException {
            switch (C666523.f19124a[aVar.mo16088f().ordinal()]) {
                case 1:
                    return new C6712o((Number) new LazilyParsedNumber(aVar.mo16090h()));
                case 2:
                    return new C6712o(Boolean.valueOf(aVar.mo16091i()));
                case 3:
                    return new C6712o(aVar.mo16090h());
                case 4:
                    aVar.mo16092j();
                    return C6710l.f19164a;
                case 5:
                    C6609h hVar = new C6609h();
                    aVar.mo16082a();
                    while (aVar.mo16087e()) {
                        hVar.mo15996a(read(aVar));
                    }
                    aVar.mo16083b();
                    return hVar;
                case 6:
                    C6711m mVar = new C6711m();
                    aVar.mo16084c();
                    while (aVar.mo16087e()) {
                        mVar.mo16144a(aVar.mo16089g(), read(aVar));
                    }
                    aVar.mo16086d();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void write(C6720b bVar, C6709k kVar) throws IOException {
            if (kVar == null || kVar.mo16135l()) {
                bVar.mo16115f();
            } else if (kVar.mo16134k()) {
                C6712o o = kVar.mo16138o();
                if (o.mo16159q()) {
                    bVar.mo16106a(o.mo15997b());
                } else if (o.mo16156a()) {
                    bVar.mo16108a(o.mo16004h());
                } else {
                    bVar.mo16110b(o.mo15998c());
                }
            } else if (kVar.mo16132i()) {
                bVar.mo16109b();
                Iterator it = kVar.mo16137n().iterator();
                while (it.hasNext()) {
                    write(bVar, (C6709k) it.next());
                }
                bVar.mo16111c();
            } else if (kVar.mo16133j()) {
                bVar.mo16113d();
                for (Entry entry : kVar.mo16136m().mo16143a()) {
                    bVar.mo16107a((String) entry.getKey());
                    write(bVar, (C6709k) entry.getValue());
                }
                bVar.mo16114e();
            } else {
                StringBuilder sb = new StringBuilder("Couldn't write ");
                sb.append(kVar.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    };

    /* renamed from: Y */
    public static final C6717s f19096Y = m20633b(C6709k.class, f19095X);

    /* renamed from: Z */
    public static final C6717s f19097Z = new TypeAdapters$30();

    /* renamed from: a */
    public static final C6715r<Class> f19098a = new C6715r<Class>() {
        /* renamed from: a */
        private static Class m20635a(C6718a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20635a(aVar);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20636a(bVar, (Class) obj);
        }

        /* renamed from: a */
        private static void m20636a(C6720b bVar, Class cls) throws IOException {
            StringBuilder sb = new StringBuilder("Attempted to serialize java.lang.Class: ");
            sb.append(cls.getName());
            sb.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sb.toString());
        }
    }.nullSafe();

    /* renamed from: b */
    public static final C6717s f19099b = m20631a(Class.class, f19098a);

    /* renamed from: c */
    public static final C6715r<BitSet> f19100c = new C6715r<BitSet>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20641a(aVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            if (r6.mo16095m() != 0) goto L_0x005e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.BitSet m20641a(com.google.gson.stream.C6718a r6) throws java.io.IOException {
            /*
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r6.mo16082a()
                com.google.gson.stream.JsonToken r1 = r6.mo16088f()
                r2 = 0
                r3 = 0
            L_0x000e:
                com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r4) goto L_0x006a
                int[] r4 = com.google.gson.internal.bind.C6649j.C666523.f19124a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                switch(r4) {
                    case 1: goto L_0x0058;
                    case 2: goto L_0x0053;
                    case 3: goto L_0x0032;
                    default: goto L_0x001e;
                }
            L_0x001e:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid bitset value type: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L_0x0032:
                java.lang.String r1 = r6.mo16090h()
                int r4 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x003f }
                if (r4 == 0) goto L_0x003d
                goto L_0x005e
            L_0x003d:
                r5 = 0
                goto L_0x005e
            L_0x003f:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L_0x0053:
                boolean r5 = r6.mo16091i()
                goto L_0x005e
            L_0x0058:
                int r1 = r6.mo16095m()
                if (r1 == 0) goto L_0x003d
            L_0x005e:
                if (r5 == 0) goto L_0x0063
                r0.set(r3)
            L_0x0063:
                int r3 = r3 + 1
                com.google.gson.stream.JsonToken r1 = r6.mo16088f()
                goto L_0x000e
            L_0x006a:
                r6.mo16083b()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.C6649j.C665312.m20641a(com.google.gson.stream.a):java.util.BitSet");
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20642a(bVar, (BitSet) obj);
        }

        /* renamed from: a */
        private static void m20642a(C6720b bVar, BitSet bitSet) throws IOException {
            bVar.mo16109b();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                bVar.mo16104a(bitSet.get(i) ? 1 : 0);
            }
            bVar.mo16111c();
        }
    }.nullSafe();

    /* renamed from: d */
    public static final C6717s f19101d = m20631a(BitSet.class, f19100c);

    /* renamed from: e */
    public static final C6715r<Boolean> f19102e = new C6715r<Boolean>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20663a(aVar);
        }

        /* renamed from: a */
        private static Boolean m20663a(C6718a aVar) throws IOException {
            JsonToken f = aVar.mo16088f();
            if (f == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            } else if (f == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.mo16090h()));
            } else {
                return Boolean.valueOf(aVar.mo16091i());
            }
        }

        /* renamed from: a */
        private static void m20664a(C6720b bVar, Boolean bool) throws IOException {
            bVar.mo16105a(bool);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20664a(bVar, (Boolean) obj);
        }
    };

    /* renamed from: f */
    public static final C6715r<Boolean> f19103f = new C6715r<Boolean>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20665a(aVar);
        }

        /* renamed from: a */
        private static Boolean m20665a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() != JsonToken.NULL) {
                return Boolean.valueOf(aVar.mo16090h());
            }
            aVar.mo16092j();
            return null;
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20666a(bVar, (Boolean) obj);
        }

        /* renamed from: a */
        private static void m20666a(C6720b bVar, Boolean bool) throws IOException {
            String str;
            if (bool == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str = bool.toString();
            }
            bVar.mo16110b(str);
        }
    };

    /* renamed from: g */
    public static final C6717s f19104g = m20632a(Boolean.TYPE, Boolean.class, f19102e);

    /* renamed from: h */
    public static final C6715r<Number> f19105h = new C6715r<Number>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20667a(aVar);
        }

        /* renamed from: a */
        private static Number m20667a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo16095m());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        private static void m20668a(C6720b bVar, Number number) throws IOException {
            bVar.mo16106a(number);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20668a(bVar, (Number) obj);
        }
    };

    /* renamed from: i */
    public static final C6717s f19106i = m20632a(Byte.TYPE, Byte.class, f19105h);

    /* renamed from: j */
    public static final C6715r<Number> f19107j = new C6715r<Number>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20669a(aVar);
        }

        /* renamed from: a */
        private static Number m20669a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo16095m());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        private static void m20670a(C6720b bVar, Number number) throws IOException {
            bVar.mo16106a(number);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20670a(bVar, (Number) obj);
        }
    };

    /* renamed from: k */
    public static final C6717s f19108k = m20632a(Short.TYPE, Short.class, f19107j);

    /* renamed from: l */
    public static final C6715r<Number> f19109l = new C6715r<Number>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20671a(aVar);
        }

        /* renamed from: a */
        private static Number m20671a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo16095m());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        private static void m20672a(C6720b bVar, Number number) throws IOException {
            bVar.mo16106a(number);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20672a(bVar, (Number) obj);
        }
    };

    /* renamed from: m */
    public static final C6717s f19110m = m20632a(Integer.TYPE, Integer.class, f19109l);

    /* renamed from: n */
    public static final C6715r<AtomicInteger> f19111n = new C6715r<AtomicInteger>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20673a(aVar);
        }

        /* renamed from: a */
        private static AtomicInteger m20673a(C6718a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.mo16095m());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20674a(bVar, (AtomicInteger) obj);
        }

        /* renamed from: a */
        private static void m20674a(C6720b bVar, AtomicInteger atomicInteger) throws IOException {
            bVar.mo16104a((long) atomicInteger.get());
        }
    }.nullSafe();

    /* renamed from: o */
    public static final C6717s f19112o = m20631a(AtomicInteger.class, f19111n);

    /* renamed from: p */
    public static final C6715r<AtomicBoolean> f19113p = new C6715r<AtomicBoolean>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20675a(aVar);
        }

        /* renamed from: a */
        private static AtomicBoolean m20675a(C6718a aVar) throws IOException {
            return new AtomicBoolean(aVar.mo16091i());
        }

        /* renamed from: a */
        private static void m20676a(C6720b bVar, AtomicBoolean atomicBoolean) throws IOException {
            bVar.mo16108a(atomicBoolean.get());
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20676a(bVar, (AtomicBoolean) obj);
        }
    }.nullSafe();

    /* renamed from: q */
    public static final C6717s f19114q = m20631a(AtomicBoolean.class, f19113p);

    /* renamed from: r */
    public static final C6715r<AtomicIntegerArray> f19115r = new C6715r<AtomicIntegerArray>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20657a(aVar);
        }

        /* renamed from: a */
        private static AtomicIntegerArray m20657a(C6718a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo16082a();
            while (aVar.mo16087e()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.mo16095m()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
            aVar.mo16083b();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20658a(bVar, (AtomicIntegerArray) obj);
        }

        /* renamed from: a */
        private static void m20658a(C6720b bVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            bVar.mo16109b();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                bVar.mo16104a((long) atomicIntegerArray.get(i));
            }
            bVar.mo16111c();
        }
    }.nullSafe();

    /* renamed from: s */
    public static final C6717s f19116s = m20631a(AtomicIntegerArray.class, f19115r);

    /* renamed from: t */
    public static final C6715r<Number> f19117t = new C6715r<Number>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20677a(aVar);
        }

        /* renamed from: a */
        private static Number m20677a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo16094l());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }

        /* renamed from: a */
        private static void m20678a(C6720b bVar, Number number) throws IOException {
            bVar.mo16106a(number);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20678a(bVar, (Number) obj);
        }
    };

    /* renamed from: u */
    public static final C6715r<Number> f19118u = new C6715r<Number>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20679a(aVar);
        }

        /* renamed from: a */
        private static Number m20679a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() != JsonToken.NULL) {
                return Float.valueOf((float) aVar.mo16093k());
            }
            aVar.mo16092j();
            return null;
        }

        /* renamed from: a */
        private static void m20680a(C6720b bVar, Number number) throws IOException {
            bVar.mo16106a(number);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20680a(bVar, (Number) obj);
        }
    };

    /* renamed from: v */
    public static final C6715r<Number> f19119v = new C6715r<Number>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20681a(aVar);
        }

        /* renamed from: a */
        private static Number m20681a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() != JsonToken.NULL) {
                return Double.valueOf(aVar.mo16093k());
            }
            aVar.mo16092j();
            return null;
        }

        /* renamed from: a */
        private static void m20682a(C6720b bVar, Number number) throws IOException {
            bVar.mo16106a(number);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20682a(bVar, (Number) obj);
        }
    };

    /* renamed from: w */
    public static final C6715r<Number> f19120w = new C6715r<Number>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20683a(aVar);
        }

        /* renamed from: a */
        private static Number m20683a(C6718a aVar) throws IOException {
            JsonToken f = aVar.mo16088f();
            int i = C666523.f19124a[f.ordinal()];
            if (i != 1) {
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        aVar.mo16092j();
                        return null;
                    default:
                        StringBuilder sb = new StringBuilder("Expecting number, got: ");
                        sb.append(f);
                        throw new JsonSyntaxException(sb.toString());
                }
            }
            return new LazilyParsedNumber(aVar.mo16090h());
        }

        /* renamed from: a */
        private static void m20684a(C6720b bVar, Number number) throws IOException {
            bVar.mo16106a(number);
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20684a(bVar, (Number) obj);
        }
    };

    /* renamed from: x */
    public static final C6717s f19121x = m20631a(Number.class, f19120w);

    /* renamed from: y */
    public static final C6715r<Character> f19122y = new C6715r<Character>() {
        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m20685a(aVar);
        }

        /* renamed from: a */
        private static Character m20685a(C6718a aVar) throws IOException {
            if (aVar.mo16088f() == JsonToken.NULL) {
                aVar.mo16092j();
                return null;
            }
            String h = aVar.mo16090h();
            if (h.length() == 1) {
                return Character.valueOf(h.charAt(0));
            }
            StringBuilder sb = new StringBuilder("Expecting character, got: ");
            sb.append(h);
            throw new JsonSyntaxException(sb.toString());
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m20686a(bVar, (Character) obj);
        }

        /* renamed from: a */
        private static void m20686a(C6720b bVar, Character ch) throws IOException {
            String str;
            if (ch == null) {
                str = null;
            } else {
                str = String.valueOf(ch);
            }
            bVar.mo16110b(str);
        }
    };

    /* renamed from: z */
    public static final C6717s f19123z = m20632a(Character.TYPE, Character.class, f19122y);

    /* renamed from: com.google.gson.internal.bind.j$23 */
    static /* synthetic */ class C666523 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19124a = new int[JsonToken.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19124a = r0
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f19124a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.C6649j.C666523.<clinit>():void");
        }
    }

    /* renamed from: com.google.gson.internal.bind.j$a */
    static final class C6679a<T extends Enum<T>> extends C6715r<T> {

        /* renamed from: a */
        private final Map<String, T> f19125a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f19126b = new HashMap();

        /* access modifiers changed from: private */
        /* renamed from: a */
        public T read(C6718a aVar) throws IOException {
            if (aVar.mo16088f() != JsonToken.NULL) {
                return (Enum) this.f19125a.get(aVar.mo16090h());
            }
            aVar.mo16092j();
            return null;
        }

        public C6679a(Class<T> cls) {
            Enum[] enumArr;
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C6593c cVar = (C6593c) cls.getField(name).getAnnotation(C6593c.class);
                    if (cVar != null) {
                        name = cVar.mo15949a();
                        for (String put : cVar.mo15950b()) {
                            this.f19125a.put(put, enumR);
                        }
                    }
                    this.f19125a.put(name, enumR);
                    this.f19126b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void write(C6720b bVar, T t) throws IOException {
            String str;
            if (t == null) {
                str = null;
            } else {
                str = (String) this.f19126b.get(t);
            }
            bVar.mo16110b(str);
        }
    }

    /* renamed from: a */
    public static <TT> C6717s m20630a(C6597a<TT> aVar, C6715r<TT> rVar) {
        return new TypeAdapters$31(aVar, rVar);
    }

    /* renamed from: b */
    private static <T1> C6717s m20633b(Class<T1> cls, C6715r<T1> rVar) {
        return new TypeAdapters$35(cls, rVar);
    }

    /* renamed from: a */
    public static <TT> C6717s m20631a(Class<TT> cls, C6715r<TT> rVar) {
        return new TypeAdapters$32(cls, rVar);
    }

    /* renamed from: b */
    private static <TT> C6717s m20634b(Class<TT> cls, Class<? extends TT> cls2, C6715r<? super TT> rVar) {
        return new TypeAdapters$34(cls, cls2, rVar);
    }

    /* renamed from: a */
    public static <TT> C6717s m20632a(Class<TT> cls, Class<TT> cls2, C6715r<? super TT> rVar) {
        return new TypeAdapters$33(cls, cls2, rVar);
    }
}
