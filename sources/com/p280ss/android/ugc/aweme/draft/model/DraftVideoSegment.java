package com.p280ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftVideoSegment */
public final class DraftVideoSegment implements Parcelable {
    public static final Creator CREATOR = new C27307a();
    @C6593c(mo15949a = "width")

    /* renamed from: a */
    public int f71922a;
    @C6593c(mo15949a = "height")

    /* renamed from: b */
    public int f71923b;
    @C6593c(mo15949a = "start")

    /* renamed from: c */
    public int f71924c;
    @C6593c(mo15949a = "end")

    /* renamed from: d */
    public int f71925d;
    @C6593c(mo15949a = "duration")

    /* renamed from: e */
    public int f71926e;
    @C6593c(mo15949a = "speed")

    /* renamed from: f */
    public float f71927f;
    @C6593c(mo15949a = "roatete")

    /* renamed from: g */
    public int f71928g;
    @C6593c(mo15949a = "video_path")

    /* renamed from: h */
    public String f71929h;
    @C6593c(mo15949a = "audio_path")

    /* renamed from: i */
    public String f71930i;
    @C6593c(mo15949a = "reverse_path")

    /* renamed from: j */
    public String f71931j;
    @C6593c(mo15949a = "temp_path")

    /* renamed from: k */
    public String f71932k;

    /* renamed from: com.ss.android.ugc.aweme.draft.model.DraftVideoSegment$a */
    public static class C27307a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "in");
            DraftVideoSegment draftVideoSegment = new DraftVideoSegment(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            return draftVideoSegment;
        }

        public final Object[] newArray(int i) {
            return new DraftVideoSegment[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DraftVideoSegment) {
                DraftVideoSegment draftVideoSegment = (DraftVideoSegment) obj;
                if (this.f71922a == draftVideoSegment.f71922a) {
                    if (this.f71923b == draftVideoSegment.f71923b) {
                        if (this.f71924c == draftVideoSegment.f71924c) {
                            if (this.f71925d == draftVideoSegment.f71925d) {
                                if ((this.f71926e == draftVideoSegment.f71926e) && Float.compare(this.f71927f, draftVideoSegment.f71927f) == 0) {
                                    if (!(this.f71928g == draftVideoSegment.f71928g) || !C7573i.m23585a((Object) this.f71929h, (Object) draftVideoSegment.f71929h) || !C7573i.m23585a((Object) this.f71930i, (Object) draftVideoSegment.f71930i) || !C7573i.m23585a((Object) this.f71931j, (Object) draftVideoSegment.f71931j) || !C7573i.m23585a((Object) this.f71932k, (Object) draftVideoSegment.f71932k)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int floatToIntBits = ((((((((((((this.f71922a * 31) + this.f71923b) * 31) + this.f71924c) * 31) + this.f71925d) * 31) + this.f71926e) * 31) + Float.floatToIntBits(this.f71927f)) * 31) + this.f71928g) * 31;
        String str = this.f71929h;
        int i = 0;
        int hashCode = (floatToIntBits + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f71930i;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71931j;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f71932k;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftVideoSegment(width=");
        sb.append(this.f71922a);
        sb.append(", height=");
        sb.append(this.f71923b);
        sb.append(", start=");
        sb.append(this.f71924c);
        sb.append(", end=");
        sb.append(this.f71925d);
        sb.append(", duration=");
        sb.append(this.f71926e);
        sb.append(", speed=");
        sb.append(this.f71927f);
        sb.append(", rotate=");
        sb.append(this.f71928g);
        sb.append(", videoPath=");
        sb.append(this.f71929h);
        sb.append(", audioPath=");
        sb.append(this.f71930i);
        sb.append(", reversePath=");
        sb.append(this.f71931j);
        sb.append(", tempVideoPath=");
        sb.append(this.f71932k);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.f71922a);
        parcel.writeInt(this.f71923b);
        parcel.writeInt(this.f71924c);
        parcel.writeInt(this.f71925d);
        parcel.writeInt(this.f71926e);
        parcel.writeFloat(this.f71927f);
        parcel.writeInt(this.f71928g);
        parcel.writeString(this.f71929h);
        parcel.writeString(this.f71930i);
        parcel.writeString(this.f71931j);
        parcel.writeString(this.f71932k);
    }

    public DraftVideoSegment(int i, int i2, int i3, int i4, int i5, float f, int i6, String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "videoPath");
        this.f71922a = i;
        this.f71923b = i2;
        this.f71924c = i3;
        this.f71925d = i4;
        this.f71926e = i5;
        this.f71927f = f;
        this.f71928g = i6;
        this.f71929h = str;
        this.f71930i = str2;
        this.f71931j = str3;
        this.f71932k = str4;
    }
}
