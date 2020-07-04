package com.p280ss.android.medialib;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.VideoProbe */
public final class VideoProbe {

    /* renamed from: com.ss.android.medialib.VideoProbe$VideoInfo */
    public static class VideoInfo {

        /* renamed from: a */
        public long f53077a;

        /* renamed from: b */
        public String f53078b;

        /* renamed from: c */
        public long f53079c;

        /* renamed from: d */
        public long f53080d;

        /* renamed from: e */
        public int f53081e;

        /* renamed from: f */
        public int f53082f;

        /* renamed from: g */
        public float f53083g;

        /* renamed from: h */
        public int f53084h;

        public String toString() {
            StringBuilder sb = new StringBuilder("VideoInfo{duration=");
            sb.append(this.f53077a);
            sb.append(", videoCodec='");
            sb.append(this.f53078b);
            sb.append('\'');
            sb.append(", nbFrames=");
            sb.append(this.f53079c);
            sb.append(", videoBitRate=");
            sb.append(this.f53080d);
            sb.append(", width=");
            sb.append(this.f53081e);
            sb.append(", height=");
            sb.append(this.f53082f);
            sb.append(", frameRate=");
            sb.append(this.f53083g);
            sb.append(", rotate=");
            sb.append(this.f53084h);
            sb.append('}');
            return sb.toString();
        }
    }

    static {
        TENativeLibsLoader.m67988e();
    }

    private VideoProbe() {
    }

    private static native VideoInfo nativeProbe(String str);
}
