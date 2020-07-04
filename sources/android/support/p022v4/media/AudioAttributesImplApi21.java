package android.support.p022v4.media;

import android.media.AudioAttributes;

/* renamed from: android.support.v4.media.AudioAttributesImplApi21 */
public final class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    AudioAttributes f2779a;

    /* renamed from: b */
    int f2780b = -1;

    AudioAttributesImplApi21() {
    }

    public final int hashCode() {
        return this.f2779a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        sb.append(this.f2779a);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2779a.equals(((AudioAttributesImplApi21) obj).f2779a);
    }
}
