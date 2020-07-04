package com.p280ss.android.ugc.asve.recorder.reaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo */
public final class ReactionWindowInfo implements Parcelable, Serializable {
    public static final C20791a CREATOR = new C20791a(null);
    @C6593c(mo15949a = "react_angle")
    private final float angle;
    @C6593c(mo15949a = "react_height")
    private final int height;
    @C6593c(mo15949a = "react_type")
    private final int type;
    @C6593c(mo15949a = "react_width")
    private final int width;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo$a */
    public static final class C20791a implements Creator<ReactionWindowInfo> {
        private C20791a() {
        }

        /* renamed from: a */
        private static ReactionWindowInfo[] m69415a(int i) {
            return new ReactionWindowInfo[i];
        }

        public /* synthetic */ C20791a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m69414a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m69415a(i);
        }

        /* renamed from: a */
        public static ReactionWindowInfo m69414a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new ReactionWindowInfo(parcel);
        }
    }

    public ReactionWindowInfo() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public static /* synthetic */ ReactionWindowInfo copy$default(ReactionWindowInfo reactionWindowInfo, int i, int i2, float f, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reactionWindowInfo.width;
        }
        if ((i4 & 2) != 0) {
            i2 = reactionWindowInfo.height;
        }
        if ((i4 & 4) != 0) {
            f = reactionWindowInfo.angle;
        }
        if ((i4 & 8) != 0) {
            i3 = reactionWindowInfo.type;
        }
        return reactionWindowInfo.copy(i, i2, f, i3);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final float component3() {
        return this.angle;
    }

    public final int component4() {
        return this.type;
    }

    public final ReactionWindowInfo copy(int i, int i2, float f, int i3) {
        return new ReactionWindowInfo(i, i2, f, i3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReactionWindowInfo) {
                ReactionWindowInfo reactionWindowInfo = (ReactionWindowInfo) obj;
                if (this.width == reactionWindowInfo.width) {
                    if ((this.height == reactionWindowInfo.height) && Float.compare(this.angle, reactionWindowInfo.angle) == 0) {
                        if (this.type == reactionWindowInfo.type) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final float getAngle() {
        return this.angle;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return (((((this.width * 31) + this.height) * 31) + Float.floatToIntBits(this.angle)) * 31) + this.type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionWindowInfo(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", angle=");
        sb.append(this.angle);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }

    public ReactionWindowInfo(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.angle);
        parcel.writeInt(this.type);
    }

    public ReactionWindowInfo(int i, int i2, float f, int i3) {
        this.width = i;
        this.height = i2;
        this.angle = f;
        this.type = i3;
    }

    public /* synthetic */ ReactionWindowInfo(int i, int i2, float f, int i3, int i4, C7571f fVar) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            f = 0.0f;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        this(i, i2, f, i3);
    }
}
