package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import android.support.p022v4.media.AudioAttributesImplApi21;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.mAudioAttributes = (AudioAttributes) versionedParcel.mo6652b(audioAttributesImplApi21.mAudioAttributes, 1);
        audioAttributesImplApi21.mLegacyStreamType = versionedParcel.mo6651b(audioAttributesImplApi21.mLegacyStreamType, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.mo6644a((Parcelable) audioAttributesImplApi21.mAudioAttributes, 1);
        versionedParcel.mo6642a(audioAttributesImplApi21.mLegacyStreamType, 2);
    }
}
