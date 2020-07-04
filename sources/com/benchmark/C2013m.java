package com.benchmark;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.vesdk.VEBenchmark;

/* renamed from: com.benchmark.m */
public final class C2013m {

    /* renamed from: h */
    private static C2013m f7076h = new C2013m();

    /* renamed from: a */
    public String f7077a;

    /* renamed from: b */
    public String f7078b;

    /* renamed from: c */
    public String f7079c;

    /* renamed from: d */
    public String f7080d;

    /* renamed from: e */
    public String f7081e;

    /* renamed from: f */
    public String f7082f;

    /* renamed from: g */
    public String f7083g;

    /* renamed from: i */
    private int f7084i = -1;

    /* renamed from: a */
    public static C2013m m9071a() {
        return f7076h;
    }

    /* renamed from: c */
    public final void mo7659c() {
        if (this.f7084i == 0) {
            VEBenchmark.m142412a().mo107775b();
            this.f7084i = -1;
        }
    }

    /* renamed from: b */
    public final int mo7658b() {
        if (this.f7084i == 0) {
            return this.f7084i;
        }
        this.f7084i = VEBenchmark.m142412a().mo107772a(C6399b.m19921a(), this.f7078b);
        return this.f7084i;
    }

    private C2013m() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6399b.m19921a().getFilesDir().getPath());
        sb.append("/benchmark/");
        this.f7077a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7077a);
        sb2.append("image.png");
        this.f7078b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f7077a);
        sb3.append("h264_video.mp4");
        this.f7079c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f7077a);
        sb4.append("h265_video.mp4");
        this.f7080d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f7077a);
        sb5.append("h264_video.yuv");
        this.f7081e = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f7077a);
        sb6.append("h265_video.yuv");
        this.f7082f = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(this.f7077a);
        sb7.append("h264_encode_video.mp4");
        this.f7083g = sb7.toString();
    }
}
