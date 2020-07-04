package com.p280ss.android.ugc.aweme.draft.model;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.draft.model.f */
public final class C27319f {
    @C6593c(mo15949a = "preview_width")

    /* renamed from: a */
    public int f72069a;
    @C6593c(mo15949a = "preview_height")

    /* renamed from: b */
    public int f72070b;
    @C6593c(mo15949a = "video_segment_list")

    /* renamed from: c */
    public List<DraftVideoSegment> f72071c;
    @C6593c(mo15949a = "volume")

    /* renamed from: d */
    public float f72072d;
    @C6593c(mo15949a = "fps")

    /* renamed from: e */
    public int f72073e;
    @C6593c(mo15949a = "scene_in")

    /* renamed from: f */
    public int f72074f;
    @C6593c(mo15949a = "scene_out")

    /* renamed from: g */
    public int f72075g;
    @C6593c(mo15949a = "draftDir")

    /* renamed from: h */
    public String f72076h;

    public C27319f() {
        this(0, 0, null, 0.0f, 0, 0, 0, null, NormalGiftView.ALPHA_255, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27319f) {
                C27319f fVar = (C27319f) obj;
                if (this.f72069a == fVar.f72069a) {
                    if ((this.f72070b == fVar.f72070b) && C7573i.m23585a((Object) this.f72071c, (Object) fVar.f72071c) && Float.compare(this.f72072d, fVar.f72072d) == 0) {
                        if (this.f72073e == fVar.f72073e) {
                            if (this.f72074f == fVar.f72074f) {
                                if (!(this.f72075g == fVar.f72075g) || !C7573i.m23585a((Object) this.f72076h, (Object) fVar.f72076h)) {
                                    return false;
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
        int i = ((this.f72069a * 31) + this.f72070b) * 31;
        List<DraftVideoSegment> list = this.f72071c;
        int i2 = 0;
        int hashCode = (((((((((i + (list != null ? list.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f72072d)) * 31) + this.f72073e) * 31) + this.f72074f) * 31) + this.f72075g) * 31;
        String str = this.f72076h;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftPreviewConfigure(previewWidth=");
        sb.append(this.f72069a);
        sb.append(", previewHeight=");
        sb.append(this.f72070b);
        sb.append(", videoSegments=");
        sb.append(this.f72071c);
        sb.append(", mVolume=");
        sb.append(this.f72072d);
        sb.append(", mFps=");
        sb.append(this.f72073e);
        sb.append(", sceneIn=");
        sb.append(this.f72074f);
        sb.append(", sceneOut=");
        sb.append(this.f72075g);
        sb.append(", draftDir=");
        sb.append(this.f72076h);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo70314a(List<DraftVideoSegment> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f72071c = list;
    }

    private C27319f(int i, int i2, List<DraftVideoSegment> list, float f, int i3, int i4, int i5, String str) {
        C7573i.m23587b(list, "videoSegments");
        this.f72069a = i;
        this.f72070b = i2;
        this.f72071c = list;
        this.f72072d = f;
        this.f72073e = i3;
        this.f72074f = i4;
        this.f72075g = i5;
        this.f72076h = str;
    }

    private /* synthetic */ C27319f(int i, int i2, List list, float f, int i3, int i4, int i5, String str, int i6, C7571f fVar) {
        this(576, PreloadTask.BYTE_UNIT_NUMBER, C7525m.m23461a(), 0.0f, -1, 0, 0, null);
    }
}
