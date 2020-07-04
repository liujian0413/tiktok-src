package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPhotoSize */
public class VKApiPhotoSize extends VKApiModel implements Parcelable, C47207a, Comparable<VKApiPhotoSize> {
    public static Creator<VKApiPhotoSize> CREATOR = new Creator<VKApiPhotoSize>() {
        /* renamed from: a */
        private static VKApiPhotoSize[] m147529a(int i) {
            return new VKApiPhotoSize[i];
        }

        /* renamed from: a */
        private static VKApiPhotoSize m147528a(Parcel parcel) {
            return new VKApiPhotoSize(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147528a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147529a(i);
        }
    };

    /* renamed from: a */
    public String f121135a;

    /* renamed from: b */
    public int f121136b;

    /* renamed from: c */
    public int f121137c;

    /* renamed from: d */
    public char f121138d;

    private VKApiPhotoSize() {
    }

    public int describeContents() {
        return 0;
    }

    private VKApiPhotoSize(Parcel parcel) {
        this.f121135a = parcel.readString();
        this.f121136b = parcel.readInt();
        this.f121137c = parcel.readInt();
        this.f121138d = (char) parcel.readInt();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(VKApiPhotoSize vKApiPhotoSize) {
        if (this.f121136b < vKApiPhotoSize.f121136b) {
            return -1;
        }
        if (this.f121136b == vKApiPhotoSize.f121136b) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static VKApiPhotoSize m147521a(String str, int i) {
        return m147522a(str, i, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121135a);
        parcel.writeInt(this.f121136b);
        parcel.writeInt(this.f121137c);
        parcel.writeInt(this.f121138d);
    }

    /* renamed from: b */
    private static void m147527b(VKApiPhotoSize vKApiPhotoSize, float f, int i) {
        m147524a(vKApiPhotoSize, Math.min(1.5f, f), i);
    }

    /* renamed from: a */
    public static VKApiPhotoSize m147523a(JSONObject jSONObject, int i, int i2) {
        VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
        vKApiPhotoSize.f121135a = jSONObject.optString("src");
        vKApiPhotoSize.f121136b = jSONObject.optInt("width");
        vKApiPhotoSize.f121137c = jSONObject.optInt("height");
        String optString = jSONObject.optString("type");
        if (!TextUtils.isEmpty(optString)) {
            vKApiPhotoSize.f121138d = optString.charAt(0);
        }
        if (vKApiPhotoSize.f121136b == 0 || vKApiPhotoSize.f121137c == 0) {
            m147526a(vKApiPhotoSize, i, i2);
        }
        return vKApiPhotoSize;
    }

    /* renamed from: a */
    public static VKApiPhotoSize m147522a(String str, int i, int i2) {
        char c;
        VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
        vKApiPhotoSize.f121135a = str;
        vKApiPhotoSize.f121136b = i;
        vKApiPhotoSize.f121137c = i2;
        float f = ((float) i) / ((float) i2);
        if (i <= 75) {
            vKApiPhotoSize.f121138d = 's';
        } else if (i <= 130) {
            if (f <= 1.5f) {
                c = 'o';
            } else {
                c = 'm';
            }
            vKApiPhotoSize.f121138d = c;
        } else if (i <= 200 && f <= 1.5f) {
            vKApiPhotoSize.f121138d = 'p';
        } else if (i <= 320 && f <= 1.5f) {
            vKApiPhotoSize.f121138d = 'q';
        } else if (i <= 604) {
            vKApiPhotoSize.f121138d = 'x';
        } else if (i <= 807) {
            vKApiPhotoSize.f121138d = 'y';
        } else if (i <= 1280 && i2 <= 1024) {
            vKApiPhotoSize.f121138d = 'z';
        } else if (i <= 2560 && i2 <= 2048) {
            vKApiPhotoSize.f121138d = 'w';
        }
        return vKApiPhotoSize;
    }

    /* renamed from: a */
    private static void m147524a(VKApiPhotoSize vKApiPhotoSize, float f, int i) {
        vKApiPhotoSize.f121136b = i;
        vKApiPhotoSize.f121137c = (int) Math.ceil((double) (((float) vKApiPhotoSize.f121136b) / f));
    }

    /* renamed from: a */
    private static void m147526a(VKApiPhotoSize vKApiPhotoSize, int i, int i2) {
        float f = ((float) i) / ((float) i2);
        switch (vKApiPhotoSize.f121138d) {
            case 'm':
                m147524a(vKApiPhotoSize, f, Math.min(i, 130));
                return;
            case 'o':
                m147527b(vKApiPhotoSize, f, Math.min(i, 130));
                return;
            case 'p':
                m147527b(vKApiPhotoSize, f, Math.min(i, C34943c.f91127w));
                return;
            case 'q':
                m147527b(vKApiPhotoSize, f, Math.min(i, 320));
                return;
            case 's':
                m147524a(vKApiPhotoSize, f, Math.min(i, 75));
                return;
            case 'w':
                m147525a(vKApiPhotoSize, f, Math.min(i, 2560), Math.min(i2, 2048));
                break;
            case 'x':
                m147524a(vKApiPhotoSize, f, Math.min(i, 604));
                return;
            case 'y':
                m147524a(vKApiPhotoSize, f, Math.min(i, 807));
                return;
            case 'z':
                m147525a(vKApiPhotoSize, f, Math.min(i, 1280), Math.min(i2, PreloadTask.BYTE_UNIT_NUMBER));
                return;
        }
    }

    /* renamed from: a */
    public static VKApiPhotoSize m147520a(String str, char c, int i, int i2) {
        VKApiPhotoSize vKApiPhotoSize = new VKApiPhotoSize();
        vKApiPhotoSize.f121135a = str;
        vKApiPhotoSize.f121138d = c;
        m147526a(vKApiPhotoSize, i, i2);
        return vKApiPhotoSize;
    }

    /* renamed from: a */
    private static void m147525a(VKApiPhotoSize vKApiPhotoSize, float f, int i, int i2) {
        if (f > 1.0f) {
            vKApiPhotoSize.f121136b = i;
            vKApiPhotoSize.f121137c = (int) (((float) vKApiPhotoSize.f121136b) / f);
            return;
        }
        vKApiPhotoSize.f121137c = i2;
        vKApiPhotoSize.f121136b = (int) (((float) vKApiPhotoSize.f121137c) * f);
    }
}
