package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class bdu {

    /* renamed from: a */
    private static Cipher f41737a;

    /* renamed from: b */
    private static final Object f41738b = new Object();

    /* renamed from: c */
    private static final Object f41739c = new Object();

    public bdu(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    public final byte[] mo40539a(String str) throws zzdj {
        try {
            byte[] a = azd.m47845a(str, false);
            if (a.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new zzdj(this);
        } catch (IllegalArgumentException e) {
            throw new zzdj(this, e);
        }
    }

    /* renamed from: a */
    public final String mo40538a(byte[] bArr, byte[] bArr2) throws zzdj {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f41738b) {
                    m48510a().init(1, secretKeySpec, null);
                    doFinal = m48510a().doFinal(bArr2);
                    iv = m48510a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return azd.m47844a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new zzdj(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzdj(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzdj(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzdj(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzdj(this, e5);
            }
        } else {
            throw new zzdj(this);
        }
    }

    /* renamed from: a */
    public final byte[] mo40540a(byte[] bArr, String str) throws zzdj {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a = azd.m47845a(str, false);
                if (a.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a.length);
                    allocate.put(a);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f41738b) {
                        m48510a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = m48510a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new zzdj(this);
            } catch (NoSuchAlgorithmException e) {
                throw new zzdj(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzdj(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzdj(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzdj(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzdj(this, e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new zzdj(this, e6);
            } catch (IllegalArgumentException e7) {
                throw new zzdj(this, e7);
            }
        } else {
            throw new zzdj(this);
        }
    }

    /* renamed from: a */
    private static Cipher m48510a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f41739c) {
            if (f41737a == null) {
                f41737a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f41737a;
        }
        return cipher;
    }
}
