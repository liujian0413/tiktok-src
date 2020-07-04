package com.alibaba.fastjson;

import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.google.gson.C6715r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C6623b;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class JSON {
    private static final C6715r<Boolean> booleanAsIntAdapter = new C6715r<Boolean>() {
        public final Boolean read(C6718a aVar) throws IOException {
            boolean z;
            JsonToken f = aVar.mo16088f();
            switch (C18443.$SwitchMap$com$google$gson$stream$JsonToken[f.ordinal()]) {
                case 1:
                    return Boolean.valueOf(aVar.mo16091i());
                case 2:
                    aVar.mo16092j();
                    return null;
                case 3:
                    try {
                        if (aVar.mo16095m() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException((Throwable) e);
                    }
                case 4:
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.mo16090h()));
                default:
                    StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
                    sb.append(f);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final void write(C6720b bVar, Boolean bool) throws IOException {
            if (bool == null) {
                bVar.mo16115f();
            } else {
                bVar.mo16105a(bool);
            }
        }
    };
    private static final C6715r<Integer> intAsBooleanAdapter = new C6715r<Integer>() {
        public final Integer read(C6718a aVar) throws IOException {
            JsonToken f = aVar.mo16088f();
            switch (C18443.$SwitchMap$com$google$gson$stream$JsonToken[f.ordinal()]) {
                case 1:
                    return Integer.valueOf(aVar.mo16091i() ? 1 : 0);
                case 2:
                    aVar.mo16092j();
                    return null;
                case 3:
                    try {
                        return Integer.valueOf(aVar.mo16095m());
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException((Throwable) e);
                    }
                case 4:
                    return Integer.valueOf(Boolean.parseBoolean(aVar.mo16090h()) ? 1 : 0);
                default:
                    StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
                    sb.append(f);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final void write(C6720b bVar, Integer num) throws IOException {
            if (num == null) {
                bVar.mo16115f();
            } else {
                bVar.mo16106a((Number) num);
            }
        }
    };

    /* renamed from: com.alibaba.fastjson.JSON$3 */
    static /* synthetic */ class C18443 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = new int[JsonToken.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$gson$stream$JsonToken = r0
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$google$gson$stream$JsonToken     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.C18443.<clinit>():void");
        }
    }

    static C6600e createAdapterGson() {
        return createAdapterGsonBuilder().mo15992f();
    }

    public static C6607f createAdapterGsonBuilder() {
        return new C6607f().mo15986a(Boolean.class, booleanAsIntAdapter).mo15986a(Boolean.TYPE, booleanAsIntAdapter).mo15986a(Integer.class, intAsBooleanAdapter).mo15986a(Integer.TYPE, intAsBooleanAdapter).mo15990d();
    }

    public static C6600e createAdapterGsonFromGsonBuilder(C6607f fVar) {
        return fVar.mo15992f();
    }

    public static String toJSONString(Object obj) {
        return createAdapterGson().mo15979b(obj);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        try {
            return (List) createAdapterGson().mo15975a(str, (Type) C6623b.m20540a((Type) null, (Type) ArrayList.class, cls));
        } catch (NullPointerException unused) {
            return new ArrayList();
        }
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        C6600e createAdapterGson = createAdapterGson();
        if (cls == null) {
            return new JSONObject();
        }
        return createAdapterGson.mo15974a(str, cls);
    }
}
