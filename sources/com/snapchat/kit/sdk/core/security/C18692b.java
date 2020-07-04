package com.snapchat.kit.sdk.core.security;

import android.util.Base64;
import com.google.gson.C6600e;
import com.google.gson.JsonParseException;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.snapchat.kit.sdk.core.security.b */
public final class C18692b implements EncryptDecryptAlgorithm {

    /* renamed from: a */
    private final SecretKey f50492a;

    /* renamed from: b */
    private final C6600e f50493b;

    /* renamed from: com.snapchat.kit.sdk.core.security.b$a */
    static class C18693a {

        /* renamed from: a */
        String f50494a;

        /* renamed from: b */
        String f50495b;

        C18693a(String str, String str2) {
            this.f50494a = str;
            this.f50495b = str2;
        }
    }

    public final String encrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.f50493b.mo15979b((Object) m61242a(str));
        } catch (JsonParseException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public final String decrypt(String str) {
        C18693a aVar;
        try {
            aVar = (C18693a) this.f50493b.mo15974a(str, C18693a.class);
        } catch (JsonParseException unused) {
            aVar = null;
        }
        if (aVar == null || aVar.f50495b == null || aVar.f50494a == null) {
            return null;
        }
        try {
            return m61243a(aVar);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private C18693a m61242a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, this.f50492a);
        return new C18693a(Base64.encodeToString(instance.getIV(), 0), Base64.encodeToString(instance.doFinal(str.getBytes()), 0));
    }

    /* renamed from: a */
    private String m61243a(C18693a aVar) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        byte[] decode = Base64.decode(aVar.f50494a, 0);
        byte[] decode2 = Base64.decode(aVar.f50495b, 0);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.f50492a, new GCMParameterSpec(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, decode));
        return new String(instance.doFinal(decode2));
    }

    public C18692b(SecretKey secretKey, C6600e eVar) {
        this.f50492a = secretKey;
        this.f50493b = eVar;
    }
}
