package com.p280ss.android.ugc.asve.p754b;

import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.b.f */
public final class C15391f extends C15390e {

    /* renamed from: a */
    public int[] f39683a;

    /* renamed from: b */
    public int[] f39684b;

    /* renamed from: c */
    public String[] f39685c;

    /* renamed from: d */
    public String[] f39686d;

    /* renamed from: e */
    public int[] f39687e;

    /* renamed from: f */
    public int[] f39688f;

    /* renamed from: g */
    public float[] f39689g;

    /* renamed from: h */
    public ROTATE_DEGREE[] f39690h;

    /* renamed from: i */
    public VIDEO_RATIO f39691i = VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL;

    /* renamed from: j */
    public String[] f39692j;

    /* renamed from: a */
    public final void mo38887a(VIDEO_RATIO video_ratio) {
        C7573i.m23587b(video_ratio, "<set-?>");
        this.f39691i = video_ratio;
    }

    public C15391f(String[] strArr) {
        C7573i.m23587b(strArr, "videoFilePaths");
        this.f39692j = strArr;
    }

    /* renamed from: a */
    public final void mo38888a(String[] strArr) {
        C7573i.m23587b(strArr, "<set-?>");
        this.f39692j = strArr;
    }

    /* renamed from: a */
    public final int mo38886a(VEEditor vEEditor, boolean z) {
        C7573i.m23587b(vEEditor, "editor");
        if (this.f39683a == null || this.f39684b == null) {
            return vEEditor.mo107906a(this.f39692j, this.f39685c, this.f39686d, this.f39691i);
        }
        return vEEditor.mo107904a(this.f39692j, this.f39683a, this.f39684b, this.f39685c, this.f39686d, this.f39687e, this.f39688f, this.f39689g, this.f39689g, this.f39690h, this.f39691i);
    }
}
