package androidx.media;

import android.support.p022v4.media.AudioAttributesCompat;
import android.support.p022v4.media.AudioAttributesImpl;
import androidx.versionedparcelable.C1447b;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.mImpl = (AudioAttributesImpl) versionedParcel.mo6654b(audioAttributesCompat.mImpl, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo6646a((C1447b) audioAttributesCompat.mImpl, 1);
    }
}
