package com.p280ss.android.medialib;

import com.p280ss.android.medialib.model.CoverInfo;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;

/* renamed from: com.ss.android.medialib.FFMpegManager */
public class FFMpegManager {

    /* renamed from: a */
    private static volatile FFMpegManager f53050a;

    /* renamed from: b */
    private FFMpegInvoker f53051b = new FFMpegInvoker();

    /* renamed from: com.ss.android.medialib.FFMpegManager$EncoderListener */
    public interface EncoderListener {
        void onChooseEncoder(int i);
    }

    /* renamed from: com.ss.android.medialib.FFMpegManager$a */
    public static class C19611a {

        /* renamed from: a */
        public String f53052a = "";

        /* renamed from: b */
        public String f53053b = "";

        /* renamed from: c */
        public String f53054c = "";

        /* renamed from: d */
        public long f53055d;

        /* renamed from: e */
        public long f53056e;

        /* renamed from: f */
        public int f53057f;

        /* renamed from: g */
        public boolean f53058g;

        /* renamed from: h */
        public int f53059h;

        /* renamed from: i */
        public String f53060i = "";

        /* renamed from: j */
        public int f53061j;

        /* renamed from: k */
        public String f53062k = "";

        /* renamed from: l */
        public float f53063l = 1.0f;

        /* renamed from: m */
        public boolean f53064m;

        /* renamed from: n */
        public int f53065n = 3000;

        /* renamed from: o */
        public int f53066o = -1;

        /* renamed from: p */
        public int f53067p = -1;

        /* renamed from: q */
        public int f53068q = -1;

        /* renamed from: r */
        public int f53069r = -1;

        /* renamed from: s */
        public int f53070s = -1;

        /* renamed from: t */
        public int f53071t = -1;

        /* renamed from: u */
        public boolean f53072u = true;

        /* renamed from: v */
        public EncoderListener f53073v;
    }

    /* renamed from: b */
    public final int mo51829b() {
        return this.f53051b.uninitVideoToGraph();
    }

    /* renamed from: c */
    public final void mo51832c() {
        this.f53051b.stopGetFrameThumbnail();
    }

    /* renamed from: a */
    public static FFMpegManager m64569a() {
        synchronized (FFMpegManager.class) {
            if (f53050a == null) {
                synchronized (FFMpegManager.class) {
                    if (f53050a == null) {
                        f53050a = new FFMpegManager();
                    }
                }
            }
        }
        return f53050a;
    }

    /* renamed from: a */
    public final int[] mo51828a(String str) {
        return this.f53051b.initVideoToGraph(str, -1, -1);
    }

    /* renamed from: c */
    public final int mo51831c(String str) {
        return this.f53051b.checkAudioFile(str);
    }

    /* renamed from: b */
    public final int mo51830b(String str) {
        return this.f53051b.checkMp3File(str);
    }

    /* renamed from: a */
    public final int mo51824a(C19611a aVar) {
        C19611a aVar2 = aVar;
        C19615a.m64588a(0);
        FFMpegInvoker fFMpegInvoker = this.f53051b;
        String str = aVar2.f53052a;
        String str2 = aVar2.f53053b;
        String str3 = aVar2.f53054c;
        long j = aVar2.f53055d;
        long j2 = aVar2.f53056e;
        int i = aVar2.f53057f;
        boolean z = aVar2.f53058g;
        int rencodeAndSplitFile = fFMpegInvoker.rencodeAndSplitFile(str, str2, str3, j, j2, i, z ? 1 : 0, aVar2.f53059h, aVar2.f53060i, aVar2.f53061j, aVar2.f53062k, aVar2.f53063l, aVar2.f53064m, aVar2.f53072u, aVar2.f53065n, aVar2.f53066o, aVar2.f53067p, aVar2.f53068q, aVar2.f53069r, aVar2.f53070s, aVar2.f53071t, aVar2.f53073v);
        C19615a.m64588a((int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        return rencodeAndSplitFile;
    }

    /* renamed from: a */
    public final int mo51825a(String str, long j, long j2) {
        return this.f53051b.isCanImport(str, j, j2);
    }

    /* renamed from: a */
    public final int mo51826a(String str, String str2, long j, long j2) {
        return this.f53051b.resampleCycleAudioToWav(str, str2, 0, j2);
    }

    /* renamed from: a */
    public final CoverInfo mo51827a(String str, int i, int i2, int i3) {
        return this.f53051b.getFrameCover(str, 256, 256, i3, 1);
    }
}
