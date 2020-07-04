package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.StickerPoi */
public final class StickerPoi implements Serializable {
    private final String doorplateLevelId;

    /* renamed from: id */
    public final String f107130id;
    private final boolean isDoorplateLevel;
    private final boolean isPoi;

    public static /* synthetic */ StickerPoi copy$default(StickerPoi stickerPoi, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickerPoi.f107130id;
        }
        if ((i & 2) != 0) {
            z = stickerPoi.isPoi;
        }
        return stickerPoi.copy(str, z);
    }

    public final boolean component2() {
        return this.isPoi;
    }

    public final StickerPoi copy(String str, boolean z) {
        C7573i.m23587b(str, "id");
        return new StickerPoi(str, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StickerPoi) {
                StickerPoi stickerPoi = (StickerPoi) obj;
                if (C7573i.m23585a((Object) this.f107130id, (Object) stickerPoi.f107130id)) {
                    if (this.isPoi == stickerPoi.isPoi) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getDoorplateLevelId() {
        return this.doorplateLevelId;
    }

    public final int hashCode() {
        String str = this.f107130id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isPoi;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isDoorplateLevel() {
        return this.isDoorplateLevel;
    }

    public final boolean isPoi() {
        return this.isPoi;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPoi(id=");
        sb.append(this.f107130id);
        sb.append(", isPoi=");
        sb.append(this.isPoi);
        sb.append(")");
        return sb.toString();
    }

    public StickerPoi(String str, boolean z) {
        String str2;
        boolean z2;
        C7573i.m23587b(str, "id");
        this.f107130id = str;
        this.isPoi = z;
        boolean z3 = false;
        if (this.isPoi) {
            if (this.f107130id.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (!C7573i.m23585a((Object) this.f107130id, (Object) "0"))) {
                z3 = true;
            }
        }
        this.isDoorplateLevel = z3;
        if (this.isDoorplateLevel) {
            str2 = this.f107130id;
        } else {
            str2 = null;
        }
        this.doorplateLevelId = str2;
    }
}
