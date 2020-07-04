package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.feed.model.MixStatusStruct */
public final class MixStatusStruct implements Serializable {
    public static final Companion Companion = new Companion(null);
    @C6593c(mo15949a = "is_collected")
    public int isCollected;
    @C6593c(mo15949a = "status")
    public int status;
    @C6593c(mo15949a = "viewed_in_mix")
    public int viewedInMix;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.MixStatusStruct$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public MixStatusStruct() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ MixStatusStruct copy$default(MixStatusStruct mixStatusStruct, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mixStatusStruct.status;
        }
        if ((i4 & 2) != 0) {
            i2 = mixStatusStruct.isCollected;
        }
        if ((i4 & 4) != 0) {
            i3 = mixStatusStruct.viewedInMix;
        }
        return mixStatusStruct.copy(i, i2, i3);
    }

    public final int component1() {
        return this.status;
    }

    public final int component2() {
        return this.isCollected;
    }

    public final int component3() {
        return this.viewedInMix;
    }

    public final MixStatusStruct copy(int i, int i2, int i3) {
        return new MixStatusStruct(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MixStatusStruct) {
                MixStatusStruct mixStatusStruct = (MixStatusStruct) obj;
                if (this.status == mixStatusStruct.status) {
                    if (this.isCollected == mixStatusStruct.isCollected) {
                        if (this.viewedInMix == mixStatusStruct.viewedInMix) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getViewedInMix() {
        return this.viewedInMix;
    }

    public final int hashCode() {
        return (((this.status * 31) + this.isCollected) * 31) + this.viewedInMix;
    }

    public final int isCollected() {
        return this.isCollected;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixStatusStruct(status=");
        sb.append(this.status);
        sb.append(", isCollected=");
        sb.append(this.isCollected);
        sb.append(", viewedInMix=");
        sb.append(this.viewedInMix);
        sb.append(")");
        return sb.toString();
    }

    public final void setCollected(int i) {
        this.isCollected = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setViewedInMix(int i) {
        this.viewedInMix = i;
    }

    public MixStatusStruct(int i, int i2, int i3) {
        this.status = i;
        this.isCollected = i2;
        this.viewedInMix = i3;
    }

    public /* synthetic */ MixStatusStruct(int i, int i2, int i3, int i4, C7571f fVar) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        this(i, i2, i3);
    }
}
