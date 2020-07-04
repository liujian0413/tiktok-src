package com.p280ss.android.ugc.aweme.shortvideo.cut;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_STANDARD;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.d */
public final class C38748d {

    /* renamed from: a */
    public final List<VideoSegment> f100691a;

    /* renamed from: b */
    public final String f100692b;

    /* renamed from: c */
    public final String f100693c;

    /* renamed from: d */
    public final int f100694d;

    /* renamed from: e */
    public final int f100695e;

    /* renamed from: f */
    public final int f100696f;

    /* renamed from: g */
    public final boolean f100697g;

    /* renamed from: h */
    public final ENCODE_STANDARD f100698h;

    /* renamed from: i */
    public final ENCODE_PROFILE f100699i;

    /* renamed from: j */
    public final ENCODE_BITRATE_MODE f100700j;

    /* renamed from: k */
    public final int f100701k;

    /* renamed from: l */
    public final int f100702l;

    /* renamed from: m */
    public final int f100703m;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38748d) {
                C38748d dVar = (C38748d) obj;
                if (C7573i.m23585a((Object) this.f100691a, (Object) dVar.f100691a) && C7573i.m23585a((Object) this.f100692b, (Object) dVar.f100692b) && C7573i.m23585a((Object) this.f100693c, (Object) dVar.f100693c)) {
                    if (this.f100694d == dVar.f100694d) {
                        if (this.f100695e == dVar.f100695e) {
                            if (this.f100696f == dVar.f100696f) {
                                if ((this.f100697g == dVar.f100697g) && C7573i.m23585a((Object) this.f100698h, (Object) dVar.f100698h) && C7573i.m23585a((Object) this.f100699i, (Object) dVar.f100699i) && C7573i.m23585a((Object) this.f100700j, (Object) dVar.f100700j)) {
                                    if (this.f100701k == dVar.f100701k) {
                                        if (this.f100702l == dVar.f100702l) {
                                            if (this.f100703m == dVar.f100703m) {
                                                return true;
                                            }
                                        }
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
        List<VideoSegment> list = this.f100691a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f100692b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f100693c;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f100694d) * 31) + this.f100695e) * 31) + this.f100696f) * 31;
        boolean z = this.f100697g;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        ENCODE_STANDARD encode_standard = this.f100698h;
        int hashCode4 = (i2 + (encode_standard != null ? encode_standard.hashCode() : 0)) * 31;
        ENCODE_PROFILE encode_profile = this.f100699i;
        int hashCode5 = (hashCode4 + (encode_profile != null ? encode_profile.hashCode() : 0)) * 31;
        ENCODE_BITRATE_MODE encode_bitrate_mode = this.f100700j;
        if (encode_bitrate_mode != null) {
            i = encode_bitrate_mode.hashCode();
        }
        return ((((((hashCode5 + i) * 31) + this.f100701k) * 31) + this.f100702l) * 31) + this.f100703m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutVideoCompileSettings(segments=");
        sb.append(this.f100691a);
        sb.append(", videoOutputPath=");
        sb.append(this.f100692b);
        sb.append(", audioOutputPath=");
        sb.append(this.f100693c);
        sb.append(", videoWidth=");
        sb.append(this.f100694d);
        sb.append(", videoHeight=");
        sb.append(this.f100695e);
        sb.append(", fps=");
        sb.append(this.f100696f);
        sb.append(", isHWEncode=");
        sb.append(this.f100697g);
        sb.append(", encodeStandard=");
        sb.append(this.f100698h);
        sb.append(", encodeProfile=");
        sb.append(this.f100699i);
        sb.append(", videoEncodeBitrateMode=");
        sb.append(this.f100700j);
        sb.append(", videoBitrate=");
        sb.append(this.f100701k);
        sb.append(", resizeMode=");
        sb.append(this.f100702l);
        sb.append(", rotate=");
        sb.append(this.f100703m);
        sb.append(")");
        return sb.toString();
    }

    private C38748d(List<? extends VideoSegment> list, String str, String str2, int i, int i2, int i3, boolean z, ENCODE_STANDARD encode_standard, ENCODE_PROFILE encode_profile, ENCODE_BITRATE_MODE encode_bitrate_mode, int i4, int i5, int i6) {
        C7573i.m23587b(list, "segments");
        C7573i.m23587b(str, "videoOutputPath");
        C7573i.m23587b(encode_standard, "encodeStandard");
        C7573i.m23587b(encode_profile, "encodeProfile");
        C7573i.m23587b(encode_bitrate_mode, "videoEncodeBitrateMode");
        this.f100691a = list;
        this.f100692b = str;
        this.f100693c = str2;
        this.f100694d = i;
        this.f100695e = i2;
        this.f100696f = i3;
        this.f100697g = z;
        this.f100698h = encode_standard;
        this.f100699i = encode_profile;
        this.f100700j = encode_bitrate_mode;
        this.f100701k = i4;
        this.f100702l = i5;
        this.f100703m = i6;
    }

    public /* synthetic */ C38748d(List list, String str, String str2, int i, int i2, int i3, boolean z, ENCODE_STANDARD encode_standard, ENCODE_PROFILE encode_profile, ENCODE_BITRATE_MODE encode_bitrate_mode, int i4, int i5, int i6, int i7, C7571f fVar) {
        int i8;
        int i9;
        int i10;
        ENCODE_STANDARD encode_standard2;
        ENCODE_PROFILE encode_profile2;
        ENCODE_BITRATE_MODE encode_bitrate_mode2;
        int i11;
        int i12;
        int i13 = i7;
        if ((i13 & 8) != 0) {
            i8 = 720;
        } else {
            i8 = i;
        }
        if ((i13 & 16) != 0) {
            i9 = 1280;
        } else {
            i9 = i2;
        }
        if ((i13 & 32) != 0) {
            i10 = 30;
        } else {
            i10 = i3;
        }
        if ((i13 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            encode_standard2 = ENCODE_STANDARD.ENCODE_STANDARD_H264;
        } else {
            encode_standard2 = encode_standard;
        }
        if ((i13 & 256) != 0) {
            encode_profile2 = ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        } else {
            encode_profile2 = encode_profile;
        }
        if ((i13 & 512) != 0) {
            encode_bitrate_mode2 = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        } else {
            encode_bitrate_mode2 = encode_bitrate_mode;
        }
        if ((i13 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            i11 = 15;
        } else {
            i11 = i4;
        }
        if ((i13 & 2048) != 0) {
            i12 = 1;
        } else {
            i12 = i5;
        }
        this(list, str, str2, i8, i9, i10, false, encode_standard2, encode_profile2, encode_bitrate_mode2, i11, i12, 0);
    }
}
