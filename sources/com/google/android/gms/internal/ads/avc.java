package com.google.android.gms.internal.ads;

import com.C1642a;
import com.google.android.gms.internal.ads.avd;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class avc<T_WRAPPER extends avd<T_ENGINE>, T_ENGINE> {

    /* renamed from: a */
    public static final avc<ave, Cipher> f41094a = new avc<>(new ave());

    /* renamed from: b */
    public static final avc<avi, Mac> f41095b = new avc<>(new avi());

    /* renamed from: c */
    public static final avc<avk, Signature> f41096c = new avc<>(new avk());

    /* renamed from: d */
    public static final avc<avj, MessageDigest> f41097d = new avc<>(new avj());

    /* renamed from: e */
    public static final avc<avf, KeyAgreement> f41098e = new avc<>(new avf());

    /* renamed from: f */
    public static final avc<avh, KeyPairGenerator> f41099f = new avc<>(new avh());

    /* renamed from: g */
    public static final avc<avg, KeyFactory> f41100g = new avc<>(new avg());

    /* renamed from: h */
    private static final Logger f41101h = Logger.getLogger(avc.class.getName());

    /* renamed from: i */
    private static final List<Provider> f41102i;

    /* renamed from: j */
    private T_WRAPPER f41103j;

    /* renamed from: k */
    private List<Provider> f41104k = f41102i;

    /* renamed from: l */
    private boolean f41105l = true;

    private avc(T_WRAPPER t_wrapper) {
        this.f41103j = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE mo40070a(String str) throws GeneralSecurityException {
        for (Provider provider : this.f41104k) {
            if (m47363a(str, provider)) {
                return this.f41103j.mo40071a(str, provider);
            }
        }
        if (this.f41105l) {
            return this.f41103j.mo40071a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }

    /* renamed from: a */
    private final boolean m47363a(String str, Provider provider) {
        try {
            this.f41103j.mo40071a(str, provider);
            return true;
        } catch (Exception e) {
            avv.m47392a(e);
            return false;
        }
    }

    static {
        if (avr.m47384a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f41101h.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", C1642a.m8034a("Provider %s not available", new Object[]{str}));
                }
            }
            f41102i = arrayList;
        } else {
            f41102i = new ArrayList();
        }
    }
}
