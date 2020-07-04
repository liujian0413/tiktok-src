package com.google.android.gms.internal.ads;

public enum zzcdz {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzcce.class, zzcce.class, zzcce.zzfuo),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzgal;
    private final Class<?> zzgam;
    private final Object zzgan;

    private zzcdz(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzgal = cls;
        this.zzgam = cls2;
        this.zzgan = obj;
    }

    public final Class<?> zzauc() {
        return this.zzgam;
    }
}
