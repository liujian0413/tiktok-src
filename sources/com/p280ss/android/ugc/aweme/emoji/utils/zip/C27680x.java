package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import com.p280ss.android.ugc.aweme.emoji.utils.zip.UnsupportedZipFeatureException.Feature;
import java.io.IOException;
import java.util.Calendar;
import java.util.zip.CRC32;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.x */
public abstract class C27680x {

    /* renamed from: a */
    private static final byte[] f72966a = C27676u.m90767a(8448);

    /* renamed from: a */
    static byte[] m90814a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    /* renamed from: b */
    private static boolean m90815b(C27667r rVar) {
        if (!rVar.f72894e.f72855c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static void m90811a(C27667r rVar) throws UnsupportedZipFeatureException {
        if (!m90815b(rVar)) {
            throw new UnsupportedZipFeatureException(Feature.ENCRYPTION, rVar);
        } else if (!m90816c(rVar)) {
            throw new UnsupportedZipFeatureException(Feature.METHOD, rVar);
        }
    }

    /* renamed from: c */
    private static boolean m90816c(C27667r rVar) {
        if (rVar.getMethod() == 0 || rVar.getMethod() == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static long m90809a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.set(1, ((int) ((j >> 25) & 127)) + 1980);
        instance.set(2, ((int) ((j >> 21) & 15)) - 1);
        instance.set(5, ((int) (j >> 16)) & 31);
        instance.set(11, ((int) (j >> 11)) & 31);
        instance.set(12, ((int) (j >> 5)) & 63);
        instance.set(13, ((int) (j << 1)) & 62);
        instance.set(14, 0);
        return instance.getTime().getTime();
    }

    /* renamed from: a */
    private static String m90810a(C27647a aVar, byte[] bArr) {
        if (aVar != null) {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            if (crc32.getValue() == aVar.f72837a) {
                try {
                    return C27665q.f72883a.mo71053a(aVar.aN_());
                } catch (IOException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    static void m90812a(C27667r rVar, byte[] bArr, byte[] bArr2) {
        C27659k kVar = (C27659k) rVar.mo71077b(C27659k.f72867b);
        String name = rVar.getName();
        String a = m90810a(kVar, bArr);
        if (a != null && !name.equals(a)) {
            rVar.mo71074a(a);
        }
        if (bArr2 != null && bArr2.length > 0) {
            String a2 = m90810a((C27658j) rVar.mo71077b(C27658j.f72866b), bArr2);
            if (a2 != null) {
                rVar.setComment(a2);
            }
        }
    }

    /* renamed from: a */
    static void m90813a(Calendar calendar, long j, byte[] bArr, int i) {
        calendar.setTimeInMillis(j);
        int i2 = calendar.get(1);
        if (i2 < 1980) {
            System.arraycopy(f72966a, 0, bArr, 12, f72966a.length);
            return;
        }
        C27676u.m90766a((long) ((calendar.get(13) >> 1) | ((i2 - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5)), bArr, 12);
    }
}
