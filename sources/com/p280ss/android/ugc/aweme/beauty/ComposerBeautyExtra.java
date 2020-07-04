package com.p280ss.android.ugc.aweme.beauty;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra */
public final class ComposerBeautyExtra {
    @C6593c(mo15949a = "ab_group")
    private final int abGroup;
    @C6593c(mo15949a = "beautify")
    private String beautify;
    @C6593c(mo15949a = "blush_default")
    private final Float blushDefault;
    @C6593c(mo15949a = "blush_max")
    private final Float blushMax;
    @C6593c(mo15949a = "default")

    /* renamed from: default reason: not valid java name */
    private final boolean f124304default;
    @C6593c(mo15949a = "disable_cache")
    private boolean disableCache;
    @C6593c(mo15949a = "eye_default")
    private final Float eyeDefault;
    @C6593c(mo15949a = "eye_max")
    private final Float eyeMax;
    @C6593c(mo15949a = "face_default")
    private final Float faceDefault;
    @C6593c(mo15949a = "face_max")
    private final Float faceMax;
    private final String gender;
    @C6593c(mo15949a = "is_none")
    private boolean isNone;
    @C6593c(mo15949a = "lipstick_default")
    private final Float lipstickDefault;
    @C6593c(mo15949a = "lipstick_max")
    private final Float lipstickMax;
    private String resourceType;
    @C6593c(mo15949a = "sharp_default")
    private final Float sharpDefault;
    @C6593c(mo15949a = "sharp_max")
    private final Float sharpMax;
    @C6593c(mo15949a = "skin_default")
    private final Float skinDefault;
    @C6593c(mo15949a = "skin_max")
    private final Float skinMax;

    public ComposerBeautyExtra() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, false, false, 524287, null);
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final String getBeautify() {
        return this.beautify;
    }

    public final Float getBlushDefault() {
        return this.blushDefault;
    }

    public final Float getBlushMax() {
        return this.blushMax;
    }

    public final boolean getDefault() {
        return this.f124304default;
    }

    public final boolean getDisableCache() {
        return this.disableCache;
    }

    public final Float getEyeDefault() {
        return this.eyeDefault;
    }

    public final Float getEyeMax() {
        return this.eyeMax;
    }

    public final Float getFaceDefault() {
        return this.faceDefault;
    }

    public final Float getFaceMax() {
        return this.faceMax;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Float getLipstickDefault() {
        return this.lipstickDefault;
    }

    public final Float getLipstickMax() {
        return this.lipstickMax;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final Float getSharpDefault() {
        return this.sharpDefault;
    }

    public final Float getSharpMax() {
        return this.sharpMax;
    }

    public final Float getSkinDefault() {
        return this.skinDefault;
    }

    public final Float getSkinMax() {
        return this.skinMax;
    }

    public final boolean isNone() {
        return this.isNone;
    }

    public final void setBeautify(String str) {
        this.beautify = str;
    }

    public final void setDisableCache(boolean z) {
        this.disableCache = z;
    }

    public final void setNone(boolean z) {
        this.isNone = z;
    }

    public final void setResourceType(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.resourceType = str;
    }

    public ComposerBeautyExtra(String str, String str2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, int i, boolean z, String str3, boolean z2, boolean z3) {
        String str4 = str;
        String str5 = str2;
        C7573i.m23587b(str, "resourceType");
        C7573i.m23587b(str2, "gender");
        this.resourceType = str4;
        this.gender = str5;
        this.lipstickDefault = f;
        this.lipstickMax = f2;
        this.blushDefault = f3;
        this.blushMax = f4;
        this.eyeDefault = f5;
        this.eyeMax = f6;
        this.faceDefault = f7;
        this.faceMax = f8;
        this.skinDefault = f9;
        this.skinMax = f10;
        this.sharpDefault = f11;
        this.sharpMax = f12;
        this.abGroup = i;
        this.f124304default = z;
        this.beautify = str3;
        this.isNone = z2;
        this.disableCache = z3;
    }

    public /* synthetic */ ComposerBeautyExtra(String str, String str2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, int i, boolean z, String str3, boolean z2, boolean z3, int i2, C7571f fVar) {
        String str4;
        String str5;
        Float f13;
        Float f14;
        Float f15;
        Float f16;
        Float f17;
        Float f18;
        Float f19;
        Float f20;
        Float f21;
        Float f22;
        Float f23;
        Float f24;
        int i3;
        boolean z4;
        String str6;
        boolean z5;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            str4 = "0";
        } else {
            str4 = str;
        }
        if ((i4 & 2) != 0) {
            str5 = "0";
        } else {
            str5 = str2;
        }
        if ((i4 & 4) != 0) {
            f13 = null;
        } else {
            f13 = f;
        }
        if ((i4 & 8) != 0) {
            f14 = null;
        } else {
            f14 = f2;
        }
        if ((i4 & 16) != 0) {
            f15 = null;
        } else {
            f15 = f3;
        }
        if ((i4 & 32) != 0) {
            f16 = null;
        } else {
            f16 = f4;
        }
        if ((i4 & 64) != 0) {
            f17 = null;
        } else {
            f17 = f5;
        }
        if ((i4 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            f18 = null;
        } else {
            f18 = f6;
        }
        if ((i4 & 256) != 0) {
            f19 = null;
        } else {
            f19 = f7;
        }
        if ((i4 & 512) != 0) {
            f20 = null;
        } else {
            f20 = f8;
        }
        if ((i4 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            f21 = null;
        } else {
            f21 = f9;
        }
        if ((i4 & 2048) != 0) {
            f22 = null;
        } else {
            f22 = f10;
        }
        if ((i4 & 4096) != 0) {
            f23 = null;
        } else {
            f23 = f11;
        }
        if ((i4 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            f24 = null;
        } else {
            f24 = f12;
        }
        boolean z6 = false;
        if ((i4 & 16384) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i4 & 32768) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i4 & 65536) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i4 & 131072) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i4 & 262144) == 0) {
            z6 = z3;
        }
        this(str4, str5, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, i3, z4, str6, z5, z6);
    }
}
