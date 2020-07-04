package com.google.android.gms.internal.measurement;

public enum zzux {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzte.class, zzte.class, zzte.zzbtq),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzbzo;
    private final Class<?> zzbzp;
    private final Object zzbzq;

    private zzux(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzbzo = cls;
        this.zzbzp = cls2;
        this.zzbzq = obj;
    }

    public final Class<?> zzwy() {
        return this.zzbzp;
    }
}
