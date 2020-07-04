package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.android.gms.internal.ads.zzbo.C16245e;
import com.google.android.gms.internal.ads.zzbo.C16245e.C16246a;
import com.google.android.gms.internal.ads.zzbo.zza;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import com.google.android.gms.internal.ads.zzbo.zza.zzd;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class bbd {

    /* renamed from: a */
    static CountDownLatch f41353a = new CountDownLatch(1);

    /* renamed from: b */
    private static boolean f41354b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static MessageDigest f41355c;

    /* renamed from: d */
    private static final Object f41356d = new Object();

    /* renamed from: e */
    private static final Object f41357e = new Object();

    /* renamed from: a */
    static void m48303a() {
        synchronized (f41357e) {
            if (!f41354b) {
                f41354b = true;
                new Thread(new bcw()).start();
            }
        }
    }

    /* renamed from: b */
    private static MessageDigest m48306b() {
        boolean z;
        m48303a();
        try {
            z = f41353a.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && f41355c != null) {
            return f41355c;
        }
        return null;
    }

    /* renamed from: a */
    static String m48300a(zza zza, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] g = zza.mo40082g();
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43808bB)).booleanValue()) {
            Vector a = m48302a(g, (int) NormalGiftView.ALPHA_255);
            if (a == null || a.size() == 0) {
                bArr = m48305a(m48299a(zzd.PSN_ENCODE_SIZE_FAIL).mo40082g(), str, true);
            } else {
                C16246a a2 = C16245e.m52702a();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    a2.mo42193a(zzcce.zzy(m48305a((byte[]) it.next(), str, false)));
                }
                a2.mo42194b(zzcce.zzy(m48304a(g)));
                bArr = ((C16245e) ((axu) a2.mo40293e())).mo40082g();
            }
        } else if (beo.f41788a != null) {
            bArr = ((C16245e) ((axu) C16245e.m52702a().mo42193a(zzcce.zzy(beo.f41788a.mo39929a(g, str != null ? str.getBytes() : new byte[0]))).mo42192a(zzbv.TINK_HYBRID).mo40293e())).mo40082g();
        } else {
            throw new GeneralSecurityException();
        }
        return azd.m47844a(bArr, true);
    }

    /* renamed from: a */
    private static Vector<byte[]> m48302a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + NormalGiftView.ALPHA_255) - 1) / NormalGiftView.ALPHA_255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * NormalGiftView.ALPHA_255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + NormalGiftView.ALPHA_255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: a */
    private static zza m48299a(zzd zzd) {
        C16247a d = zza.m52760d();
        d.mo42234j((long) zzd.zzac());
        return (zza) ((axu) d.mo40293e());
    }

    /* renamed from: a */
    private static byte[] m48305a(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = z ? 239 : NormalGiftView.ALPHA_255;
        if (bArr.length > i) {
            bArr = m48299a(zzd.PSN_ENCODE_SIZE_FAIL).mo40082g();
        }
        if (bArr.length < i) {
            byte[] bArr3 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(m48304a(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        for (bcz a : new bcx().f41629cN) {
            a.mo40515a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new awb(str.getBytes("UTF-8")).mo40079a(bArr4);
        }
        return bArr4;
    }

    /* renamed from: a */
    public static byte[] m48304a(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f41356d) {
            MessageDigest b = m48306b();
            if (b != null) {
                b.reset();
                b.update(bArr);
                digest = f41355c.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }
}
