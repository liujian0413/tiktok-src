package com.p280ss.android.vesdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.VEConfigCenter */
public class VEConfigCenter {

    /* renamed from: b */
    private static VEConfigCenter f116146b;

    /* renamed from: a */
    public Map<String, C45182a> f116147a = new HashMap();

    /* renamed from: com.ss.android.vesdk.VEConfigCenter$ConfigType */
    public enum ConfigType {
        CONFIG_TYPE_AB,
        CONFIG_TYPE_SETTINGS
    }

    /* renamed from: com.ss.android.vesdk.VEConfigCenter$DataType */
    public enum DataType {
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        STRING
    }

    /* renamed from: com.ss.android.vesdk.VEConfigCenter$a */
    public static class C45182a {

        /* renamed from: a */
        public DataType f116148a;

        /* renamed from: b */
        public Object f116149b;

        /* renamed from: c */
        public ConfigType f116150c;

        /* renamed from: d */
        public String f116151d;

        public final String toString() {
            if (this.f116149b != null) {
                return this.f116149b.toString();
            }
            return "";
        }

        /* renamed from: a */
        public final C45182a mo107839a(Object obj) {
            this.f116149b = obj;
            return this;
        }

        public C45182a(DataType dataType, Object obj, ConfigType configType, String str) {
            this.f116149b = obj;
            this.f116148a = dataType;
            this.f116150c = configType;
            this.f116151d = str;
        }
    }

    private VEConfigCenter() {
        m142459b();
    }

    /* renamed from: a */
    public static VEConfigCenter m142457a() {
        if (f116146b == null) {
            synchronized (VEConfigCenter.class) {
                if (f116146b == null) {
                    f116146b = new VEConfigCenter();
                }
            }
        }
        return f116146b;
    }

    /* renamed from: b */
    private void m142459b() {
        m142456a("wide_camera_id", new C45182a(DataType.STRING, "-1", ConfigType.CONFIG_TYPE_AB, "wide camera device id"));
    }

    /* renamed from: a */
    public final C45182a mo107838a(String str) {
        return (C45182a) this.f116147a.get(str);
    }

    /* renamed from: a */
    private int m142456a(String str, C45182a aVar) {
        if (this.f116147a.containsKey(str)) {
            StringBuilder sb = new StringBuilder("ConfigCenter has already contained ");
            sb.append(str);
            C45372t.m143407c("VEConfigCenter", sb.toString());
            return -100;
        }
        m142458b(str, aVar);
        return 0;
    }

    /* renamed from: b */
    private C45182a m142458b(String str, C45182a aVar) {
        C45182a aVar2 = (C45182a) this.f116147a.put(str, aVar);
        if (aVar2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": Previous ValuePkt is null");
            C45372t.m143405b("VEConfigCenter", sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(": ");
            sb2.append(aVar2);
            sb2.append(" ==> ");
            sb2.append(aVar);
            C45372t.m143403a("VEConfigCenter", sb2.toString());
        }
        return aVar2;
    }
}
