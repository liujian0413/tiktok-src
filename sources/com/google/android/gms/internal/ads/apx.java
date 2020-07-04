package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aza;
import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.security.GeneralSecurityException;

public abstract class apx<P, KeyProto extends aza, KeyFormatProto extends aza> implements apw<P> {

    /* renamed from: a */
    private final Class<P> f40899a;

    /* renamed from: b */
    private final Class<KeyProto> f40900b;

    /* renamed from: c */
    private final Class<KeyFormatProto> f40901c;

    /* renamed from: d */
    private final String f40902d;

    protected apx(Class<P> cls, Class<KeyProto> cls2, Class<KeyFormatProto> cls3, String str) {
        this.f40899a = cls;
        this.f40900b = cls2;
        this.f40901c = cls3;
        this.f40902d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract zzb mo39937c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract P mo39938c(KeyProto keyproto) throws GeneralSecurityException;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract KeyProto mo39939d(KeyFormatProto keyformatproto) throws GeneralSecurityException;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract KeyProto mo39940d(zzcce zzcce) throws zzcdx;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract KeyFormatProto mo39941e(zzcce zzcce) throws zzcdx;

    /* renamed from: a */
    private static <Casted> Casted m46875a(Object obj, String str, Class<Casted> cls) throws GeneralSecurityException {
        if (cls.isInstance(obj)) {
            return obj;
        }
        throw new GeneralSecurityException(str);
    }

    /* renamed from: a */
    public final P mo39931a(zzcce zzcce) throws GeneralSecurityException {
        try {
            return mo39938c((KeyProto) mo39940d(zzcce));
        } catch (zzcdx e) {
            String str = "Failures parsing proto of type ";
            String valueOf = String.valueOf(this.f40900b.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
        }
    }

    /* renamed from: a */
    public final P mo39930a(aza aza) throws GeneralSecurityException {
        String str = "Expected proto of type ";
        String valueOf = String.valueOf(this.f40900b.getName());
        return mo39938c((KeyProto) (aza) m46875a(aza, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), this.f40900b));
    }

    /* renamed from: b */
    public final aza mo39934b(zzcce zzcce) throws GeneralSecurityException {
        try {
            return mo39939d((KeyFormatProto) mo39941e(zzcce));
        } catch (zzcdx e) {
            String str = "Failures parsing proto of type ";
            String valueOf = String.valueOf(this.f40901c.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
        }
    }

    /* renamed from: b */
    public final aza mo39933b(aza aza) throws GeneralSecurityException {
        String str = "Expected proto of type ";
        String valueOf = String.valueOf(this.f40901c.getName());
        return mo39939d((KeyFormatProto) (aza) m46875a(aza, valueOf.length() != 0 ? str.concat(valueOf) : new String(str), this.f40901c));
    }

    /* renamed from: a */
    public final String mo39932a() {
        return this.f40902d;
    }

    /* renamed from: c */
    public final zzbwe mo39936c(zzcce zzcce) throws GeneralSecurityException {
        try {
            return (zzbwe) ((axu) zzbwe.m52987b().mo42287a(this.f40902d).mo42286a(mo39939d((KeyFormatProto) mo39941e(zzcce)).mo40081f()).mo42285a(mo39937c()).mo40293e());
        } catch (zzcdx e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: b */
    public final Class<P> mo39935b() {
        return this.f40899a;
    }
}
