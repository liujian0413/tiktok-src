package androidx.media;

import android.support.p022v4.media.AudioAttributesImplBase;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.mUsage = versionedParcel.mo6651b(audioAttributesImplBase.mUsage, 1);
        audioAttributesImplBase.mContentType = versionedParcel.mo6651b(audioAttributesImplBase.mContentType, 2);
        audioAttributesImplBase.mFlags = versionedParcel.mo6651b(audioAttributesImplBase.mFlags, 3);
        audioAttributesImplBase.mLegacyStream = versionedParcel.mo6651b(audioAttributesImplBase.mLegacyStream, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.mo6642a(audioAttributesImplBase.mUsage, 1);
        versionedParcel.mo6642a(audioAttributesImplBase.mContentType, 2);
        versionedParcel.mo6642a(audioAttributesImplBase.mFlags, 3);
        versionedParcel.mo6642a(audioAttributesImplBase.mLegacyStream, 4);
    }
}
