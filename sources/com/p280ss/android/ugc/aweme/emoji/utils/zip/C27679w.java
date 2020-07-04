package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.w */
public final class C27679w implements Cloneable {

    /* renamed from: a */
    public final int f72965a;

    public final int hashCode() {
        return this.f72965a;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZipShort value: ");
        sb.append(this.f72965a);
        return sb.toString();
    }

    /* renamed from: a */
    public final byte[] mo71107a() {
        byte[] bArr = new byte[2];
        m90806a(this.f72965a, bArr, 0);
        return bArr;
    }

    public C27679w(int i) {
        this.f72965a = i;
    }

    /* renamed from: a */
    public static int m90804a(byte[] bArr) {
        return m90805a(bArr, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C27679w) || this.f72965a != ((C27679w) obj).f72965a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m90807a(int i) {
        return new byte[]{(byte) (i & NormalGiftView.ALPHA_255), (byte) ((i & 65280) >> 8)};
    }

    public C27679w(byte[] bArr, int i) {
        this.f72965a = m90805a(bArr, i);
    }

    /* renamed from: a */
    public static int m90805a(byte[] bArr, int i) {
        return ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    /* renamed from: a */
    public static void m90806a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & NormalGiftView.ALPHA_255);
        bArr[i2 + 1] = (byte) ((i & 65280) >> 8);
    }
}
