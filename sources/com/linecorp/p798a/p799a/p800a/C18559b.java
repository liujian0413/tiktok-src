package com.linecorp.p798a.p799a.p800a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Base64;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.linecorp.a.a.a.b */
public final class C18559b {

    /* renamed from: a */
    private final Object f50164a = new Object();

    /* renamed from: b */
    private final String f50165b;

    /* renamed from: c */
    private final int f50166c;

    /* renamed from: d */
    private final SecureRandom f50167d;

    /* renamed from: e */
    private final SecretKeyFactory f50168e;

    /* renamed from: f */
    private final Cipher f50169f;

    /* renamed from: g */
    private final Mac f50170g;

    /* renamed from: h */
    private C18560a f50171h;

    /* renamed from: com.linecorp.a.a.a.b$a */
    static class C18560a {

        /* renamed from: a */
        final SecretKey f50172a;

        /* renamed from: b */
        final SecretKey f50173b;

        C18560a(SecretKey secretKey, SecretKey secretKey2) {
            this.f50172a = secretKey;
            this.f50173b = secretKey2;
        }
    }

    /* renamed from: a */
    public final void mo48694a(Context context) {
        synchronized (this.f50164a) {
            if (this.f50171h == null) {
                this.f50171h = m60966b(context);
            }
        }
    }

    public C18559b(String str) {
        this.f50165b = str;
        this.f50166c = 5000;
        try {
            this.f50167d = new SecureRandom();
            this.f50168e = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            this.f50169f = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f50170g = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private C18560a m60966b(Context context) {
        byte[] bArr;
        String string = Secure.getString(context.getContentResolver(), "android_id");
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MODEL);
        sb.append(Build.MANUFACTURER);
        sb.append(Build.SERIAL);
        sb.append(string);
        sb.append(context.getPackageName());
        String sb2 = sb.toString();
        SharedPreferences a = C7285c.m22838a(context, this.f50165b, 0);
        String string2 = a.getString("salt", null);
        if (!TextUtils.isEmpty(string2)) {
            bArr = Base64.decode(string2, 0);
        } else {
            byte[] bArr2 = new byte[16];
            this.f50167d.nextBytes(bArr2);
            a.edit().putString("salt", Base64.encodeToString(bArr2, 0)).apply();
            bArr = bArr2;
        }
        try {
            byte[] encoded = this.f50168e.generateSecret(new PBEKeySpec(sb2.toCharArray(), bArr, this.f50166c, 512)).getEncoded();
            return new C18560a(new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), "AES"), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final String mo48693a(Context context, String str) {
        String encodeToString;
        synchronized (this.f50164a) {
            mo48694a(context);
            try {
                byte[] bArr = new byte[this.f50169f.getBlockSize()];
                this.f50167d.nextBytes(bArr);
                this.f50169f.init(1, this.f50171h.f50172a, new IvParameterSpec(bArr));
                byte[] doFinal = this.f50169f.doFinal(str.getBytes("UTF-8"));
                byte[] bArr2 = new byte[(bArr.length + doFinal.length + 32)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                int length = bArr.length + 0;
                System.arraycopy(doFinal, 0, bArr2, length, doFinal.length);
                this.f50170g.init(this.f50171h.f50173b);
                this.f50170g.update(bArr2, 0, bArr.length + doFinal.length);
                byte[] doFinal2 = this.f50170g.doFinal();
                System.arraycopy(doFinal2, 0, bArr2, length + doFinal.length, doFinal2.length);
                encodeToString = Base64.encodeToString(bArr2, 0);
            } catch (BadPaddingException e) {
                throw new C18558a((Throwable) e);
            } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | IllegalBlockSizeException e2) {
                throw new RuntimeException(e2);
            }
        }
        return encodeToString;
    }
}
