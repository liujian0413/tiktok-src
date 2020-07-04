package android.support.p022v4.media;

import java.util.Arrays;

/* renamed from: android.support.v4.media.AudioAttributesImplBase */
public final class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f2781a;

    /* renamed from: b */
    int f2782b;

    /* renamed from: c */
    int f2783c;

    /* renamed from: d */
    int f2784d = -1;

    /* renamed from: b */
    private int m3177b() {
        return this.f2782b;
    }

    /* renamed from: c */
    private int m3178c() {
        return this.f2781a;
    }

    AudioAttributesImplBase() {
    }

    /* renamed from: a */
    private int m3176a() {
        if (this.f2784d != -1) {
            return this.f2784d;
        }
        return AudioAttributesCompat.m3174a(false, this.f2783c, this.f2781a);
    }

    /* renamed from: d */
    private int m3179d() {
        int i = this.f2783c;
        int a = m3176a();
        if (a == 6) {
            i |= 4;
        } else if (a == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2782b), Integer.valueOf(this.f2783c), Integer.valueOf(this.f2781a), Integer.valueOf(this.f2784d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2784d != -1) {
            sb.append(" stream=");
            sb.append(this.f2784d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m3175a(this.f2781a));
        sb.append(" content=");
        sb.append(this.f2782b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2783c).toUpperCase());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2782b == audioAttributesImplBase.m3177b() && this.f2783c == audioAttributesImplBase.m3179d() && this.f2781a == audioAttributesImplBase.m3178c() && this.f2784d == audioAttributesImplBase.f2784d) {
            return true;
        }
        return false;
    }
}
