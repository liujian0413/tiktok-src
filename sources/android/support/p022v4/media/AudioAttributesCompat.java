package android.support.p022v4.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.C1447b;

/* renamed from: android.support.v4.media.AudioAttributesCompat */
public class AudioAttributesCompat implements C1447b {

    /* renamed from: b */
    private static final SparseIntArray f2776b;

    /* renamed from: c */
    private static final int[] f2777c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: a */
    AudioAttributesImpl f2778a;

    AudioAttributesCompat() {
    }

    /* renamed from: a */
    static int m3174a(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return 7;
        }
        if ((i & 4) == 4) {
            return 6;
        }
        switch (i2) {
            case 0:
                return 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                return 3;
        }
    }

    public int hashCode() {
        return this.f2778a.hashCode();
    }

    public String toString() {
        return this.f2778a.toString();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2776b = sparseIntArray;
        sparseIntArray.put(5, 1);
        f2776b.put(6, 2);
        f2776b.put(7, 2);
        f2776b.put(8, 1);
        f2776b.put(9, 1);
        f2776b.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        if (this.f2778a != null) {
            return this.f2778a.equals(audioAttributesCompat.f2778a);
        }
        if (audioAttributesCompat.f2778a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static String m3175a(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                StringBuilder sb = new StringBuilder("unknown usage ");
                sb.append(i);
                return sb.toString();
        }
    }
}
