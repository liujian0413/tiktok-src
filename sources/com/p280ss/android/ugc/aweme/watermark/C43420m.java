package com.p280ss.android.ugc.aweme.watermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.p720g.C13644b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.network.connectionclass.C14143b;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29965e;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41640a;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41641b;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41643c;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41644d;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.watermark.m */
public final class C43420m {

    /* renamed from: a */
    public static final String f112468a;

    /* renamed from: i */
    private static final String f112469i;

    /* renamed from: b */
    public Context f112470b = C35563c.f93238a.getApplicationContext();

    /* renamed from: c */
    public String f112471c;

    /* renamed from: d */
    public C43419l f112472d;

    /* renamed from: e */
    private long f112473e = -1;

    /* renamed from: f */
    private String f112474f;

    /* renamed from: g */
    private String f112475g;

    /* renamed from: h */
    private JSONObject f112476h;

    /* renamed from: j */
    private boolean f112477j;

    /* renamed from: k */
    private boolean f112478k;

    /* renamed from: l */
    private String f112479l;

    /* renamed from: m */
    private long f112480m;

    /* renamed from: n */
    private C41644d f112481n;

    /* renamed from: o */
    private C41640a f112482o;

    /* renamed from: a */
    public final void mo105343a(boolean z, int i, int i2, String str) {
        if (!this.f112478k) {
            this.f112478k = true;
            long currentTimeMillis = System.currentTimeMillis() - this.f112480m;
            File file = new File(this.f112472d.f112451a);
            long length = file.length();
            boolean equals = TextUtils.equals(C42973bg.m136432d(file.getPath()), "20");
            if (z) {
                C6893q.m21444a("save_video_success_rate", 0, new C6869c().mo16886a("watermark_duration", Long.valueOf(currentTimeMillis)).mo16886a("download_rate", Long.valueOf(this.f112472d.f112463m)).mo16886a("download_duration", Long.valueOf(this.f112472d.f112464n)).mo16882a("isInstagram", Boolean.valueOf(this.f112472d.f112458h)).mo16886a("file_size", Long.valueOf(length)).mo16887a("url", this.f112472d.f112462l).mo16882a("needWaterMark", Boolean.valueOf(true)).mo16887a("ret", TEVideoRecorder.FACE_BEAUTY_NULL).mo16887a("ext", TEVideoRecorder.FACE_BEAUTY_NULL).mo16887a("msg", TEVideoRecorder.FACE_BEAUTY_NULL).mo16882a("isMp4", Boolean.valueOf(equals)).mo16888b());
            } else {
                C6893q.m21444a("save_video_success_rate", 2, new C6869c().mo16886a("watermark_duration", Long.valueOf(currentTimeMillis)).mo16886a("download_rate", Long.valueOf(this.f112472d.f112463m)).mo16886a("download_duration", Long.valueOf(this.f112472d.f112464n)).mo16882a("isInstagram", Boolean.valueOf(this.f112472d.f112458h)).mo16886a("file_size", Long.valueOf(length)).mo16887a("url", this.f112472d.f112462l).mo16882a("needWaterMark", Boolean.valueOf(true)).mo16885a("ret", Integer.valueOf(i)).mo16885a("ext", Integer.valueOf(i2)).mo16887a("msg", str).mo16882a("isMp4", Boolean.valueOf(equals)).mo16888b());
            }
        }
    }

    /* renamed from: i */
    private void m137793i() {
        this.f112471c = null;
        this.f112479l = null;
        if (this.f112482o != null) {
            this.f112482o.mo102263b();
        }
    }

    protected C43420m() {
        C7276d.m22803a(f112468a, false);
    }

    /* renamed from: b */
    public final void mo105344b() {
        m137793i();
        if (this.f112481n != null) {
            this.f112481n.mo102265a();
        }
    }

    /* renamed from: c */
    public final void mo105345c() {
        m137793i();
        if (this.f112472d.f112457g != null) {
            this.f112472d.f112457g.mo105353a(this.f112472d.f112452b);
        }
        m137792h();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C39810eq.f103468d);
        sb.append("share/");
        f112469i = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f112469i);
        sb2.append("pic/");
        f112468a = sb2.toString();
    }

    /* renamed from: d */
    private void m137788d() {
        C6907h.onEvent(MobClick.obtain().setEventName(this.f112474f).setLabelName(this.f112475g).setValue(String.valueOf(System.currentTimeMillis() - this.f112473e)).setJsonObject(this.f112476h));
    }

    /* renamed from: f */
    private void m137790f() {
        if (this.f112471c == null || !C42973bg.m136427a(this.f112471c)) {
            final String g = this.f112472d.f112453c.mo58564g();
            try {
                C23323e.m76502a(this.f112472d.f112453c.mo58563f(), (C23328a) new C23328a() {
                    /* renamed from: a */
                    public final void mo60610a(Exception exc) {
                    }

                    /* renamed from: a */
                    public final void mo60609a(C13346c<C13326a<C13645c>> cVar) {
                        String str;
                        if (cVar.mo32639b()) {
                            C13326a aVar = (C13326a) cVar.mo32641d();
                            if (aVar != null && (aVar.mo32609a() instanceof C13644b)) {
                                Bitmap d = ((C13644b) aVar.mo32609a()).mo33265d();
                                if (d != null) {
                                    if (TextUtils.isEmpty(C43420m.this.f112472d.f112453c.mo58558a())) {
                                        str = C43420m.this.f112472d.f112453c.mo58559b();
                                    } else {
                                        str = C43420m.this.f112472d.f112453c.mo58558a();
                                    }
                                    if (C6399b.m19946v()) {
                                        StringBuilder sb = new StringBuilder("@");
                                        sb.append(str);
                                        str = sb.toString();
                                    } else if (C6399b.m19947w()) {
                                        StringBuilder sb2 = new StringBuilder("TikTok ID: ");
                                        sb2.append(str);
                                        str = sb2.toString();
                                    }
                                    String str2 = str;
                                    C43420m mVar = C43420m.this;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(C43420m.f112468a);
                                    sb3.append(File.separator);
                                    sb3.append("end.png");
                                    mVar.f112471c = sb3.toString();
                                    int width = C43420m.this.f112472d.f112454d.getWidth();
                                    int height = C43420m.this.f112472d.f112454d.getHeight();
                                    int[] iArr = new int[10];
                                    if (C42133c.m134093a(C43420m.this.f112472d.f112451a, iArr) == 0) {
                                        width = iArr[0];
                                        height = iArr[1];
                                    }
                                    new C43403c().mo105311a(C43420m.this.f112470b, width, height, g, str2, d, C43420m.this.f112472d.f112458h).mo105312a(C43420m.this.f112471c);
                                }
                            }
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    private static void m137792h() {
        if (C43424o.m137807a(C35563c.f93238a)) {
            C6893q.m21444a("aweme_download_synthesis_error_rate", 0, (JSONObject) null);
            C6907h.m21524a("add_watermark", (Map) C22984d.m75611a().mo59973a("enter_from", "download_video").f60753a);
        }
    }

    /* renamed from: a */
    public final void mo105340a() {
        if (this.f112472d != null) {
            if (this.f112472d.f112455e) {
                m137794j();
                this.f112482o.mo102262a(true, this.f112472d.f112453c);
                this.f112482o.mo102262a(false, this.f112472d.f112453c);
            }
            if (this.f112472d.f112458h && C35563c.f93247j.mo83119d()) {
                m137790f();
            }
        }
    }

    /* renamed from: g */
    private void m137791g() {
        if (this.f112479l == null || !C42973bg.m136427a(this.f112479l)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f112470b.getCacheDir());
            sb.append(File.separator);
            sb.append("watermark.mp3");
            this.f112479l = sb.toString();
            C7276d.m22803a(this.f112479l, true);
            try {
                C42973bg.m136426a(this.f112470b.getAssets().open("watermark_audio.mp3"), (OutputStream) new FileOutputStream(this.f112479l));
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: j */
    private void m137794j() {
        int i;
        if (!(this.f112472d == null || this.f112472d.f112454d == null || this.f112482o != null)) {
            if (this.f112472d.f112458h) {
                i = 2;
            } else {
                i = -1;
            }
            int width = this.f112472d.f112454d.getWidth();
            int height = this.f112472d.f112454d.getHeight();
            this.f112482o = C43416i.m137756a(i, this.f112472d.f112454d.getPlayAddrH264().getBitRatedRatioUri(), new int[]{width, height});
        }
    }

    /* renamed from: e */
    private void m137789e() {
        String g;
        String str;
        StringBuilder sb = new StringBuilder("@");
        sb.append(this.f112472d.f112453c);
        if (sb.toString() == null) {
            g = "";
        } else {
            g = this.f112472d.f112453c.mo58564g();
        }
        String str2 = g;
        if (TextUtils.isEmpty(this.f112472d.f112453c.mo58558a())) {
            str = this.f112472d.f112453c.mo58559b();
        } else {
            str = this.f112472d.f112453c.mo58558a();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f112468a);
        sb2.append("end.png");
        this.f112471c = sb2.toString();
        int width = this.f112472d.f112454d.getWidth();
        int height = this.f112472d.f112454d.getHeight();
        int[] a = FFMpegManager.m64569a().mo51828a(this.f112472d.f112451a);
        if (a[0] == 0) {
            width = a[2];
            height = a[3];
        }
        int i = width;
        int i2 = height;
        FFMpegManager.m64569a().mo51829b();
        new C43425p().mo105348a(this.f112470b, i, i2, str2, this.f112470b.getString(R.string.pc, new Object[]{str})).mo105351a(this.f112471c);
    }

    /* renamed from: a */
    private static String m137783a(String str) {
        String a = C6306c.m19561a(str);
        StringBuilder sb = new StringBuilder();
        sb.append(C39811er.f103469e);
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: a */
    private VIDEO_RATIO m137782a(int[] iArr) {
        VIDEO_RATIO video_ratio;
        if (C35563c.f93247j.mo83118c() == 0 && this.f112472d.f112458h) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(this.f112472d.f112451a);
                iArr[0] = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            } catch (Exception unused) {
                iArr[0] = 560;
            }
            video_ratio = VIDEO_RATIO.VIDEO_OUT_RATIO_1_1;
        } else if (C35563c.f93247j.mo83118c() != 1 || !this.f112472d.f112458h) {
            video_ratio = VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL;
        } else {
            video_ratio = VIDEO_RATIO.VIDEO_OUT_RATIO_16_9;
        }
        if (this.f112472d.f112460j) {
            return VIDEO_RATIO.VIDEO_OUT_RATIO_16_9;
        }
        return video_ratio;
    }

    /* renamed from: a */
    public final void mo105342a(C43419l lVar) {
        boolean z;
        boolean z2;
        this.f112472d = lVar;
        boolean z3 = false;
        C29965e.m98247a(this.f112472d.f112451a, "inputPath can't be null", new Object[0]);
        C29965e.m98247a(this.f112472d.f112452b, "outPath can't be null", new Object[0]);
        C29965e.m98247a(this.f112472d.f112453c, "author can't be null", new Object[0]);
        C29965e.m98247a(this.f112472d.f112454d, "video can't be null", new Object[0]);
        if (this.f112472d.f112455e || this.f112472d.f112456f || this.f112472d.f112465o) {
            z = true;
        } else {
            z = false;
        }
        C29965e.m98249a(z, "不需要添加水印为什么要调用该功能？？？", new Object[0]);
        File file = new File(this.f112472d.f112452b);
        File parentFile = file.getParentFile();
        if (parentFile.isDirectory() || parentFile.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder("输出文件夹创建失败 \noutPath = ");
        sb.append(this.f112472d.f112452b);
        sb.append("\noutPath isExist = ");
        sb.append(file.exists());
        sb.append("\noutPath isfile =  ");
        sb.append(file.isFile());
        sb.append("\noutDir  = ");
        sb.append(parentFile.getPath());
        sb.append("\noutDir.isDirectory() = ");
        sb.append(parentFile.isDirectory());
        sb.append("\noutDir.mkdirs() = ");
        sb.append(parentFile.mkdirs());
        C29965e.m98249a(z2, sb.toString(), new Object[0]);
        boolean z4 = this.f112472d.f112455e;
        if (!this.f112472d.f112461k) {
            z3 = this.f112472d.f112456f;
        } else if (this.f112472d.f112458h && C35563c.f93247j.mo83119d()) {
            z3 = true;
        }
        m137787b(z4, z3, this.f112472d.f112465o);
    }

    /* renamed from: a */
    private void m137784a(String str, String str2) {
        m137785a(str, str2, (JSONObject) null);
    }

    /* renamed from: a */
    private void m137785a(String str, String str2, JSONObject jSONObject) {
        this.f112473e = System.currentTimeMillis();
        this.f112474f = str;
        this.f112475g = str2;
        this.f112476h = null;
    }

    /* renamed from: b */
    private void m137787b(boolean z, boolean z2, boolean z3) {
        C1592h.m7855a((Callable<TResult>) new C43423n<TResult>(this, z, z3, z2), (Executor) C7258h.m22730c());
    }

    /* renamed from: b */
    private void m137786b(int i, int i2, String str) {
        if (!this.f112477j) {
            this.f112477j = true;
            C42880h.m136157a("mTmpPath", this.f112472d.f112451a);
            C42880h.m136157a("mOutPath", this.f112472d.f112452b);
            StringBuilder sb = new StringBuilder("WaterMarkComposer ret: ");
            sb.append(i);
            C6921a.m21559a((Throwable) new Exception(sb.toString()));
            if (C43424o.m137807a(C35563c.f93238a)) {
                C6893q.m21444a("aweme_download_synthesis_error_rate", 1, (JSONObject) null);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netWorkQuality", C14143b.m41756a().mo33901b().toString());
                jSONObject.put("netWorkSpeed", (int) C14143b.m41756a().mo33902c());
                jSONObject.put("ret", i);
                jSONObject.put("ext", i2);
                jSONObject.put("msg", str);
                C6893q.m21452b("aweme_movie_synthesis_log", "video_download_compose", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo105339a(boolean z, boolean z2, boolean z3) throws Exception {
        boolean z4;
        this.f112480m = System.currentTimeMillis();
        m137784a("download_time", "add_watermark");
        Video video = this.f112472d.f112454d;
        int width = video.getWidth();
        int height = video.getHeight();
        if (z || z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        C43418k a = m137781a(z4, z3, new int[]{width, height});
        if (a == null) {
            mo105341a(-1, 0, "create VideoWatermarkParam error");
            m137788d();
            return null;
        }
        if (this.f112481n == null) {
            this.f112481n = new C41641b(m137783a(this.f112472d.f112451a));
        }
        this.f112481n.mo102267a(a, new C41643c() {
            /* renamed from: a */
            public final void mo102268a() {
                C43420m.this.mo105343a(true, -1, -1, null);
                C43420m.this.mo105345c();
            }

            /* renamed from: a */
            public final void mo102269a(float f) {
                if (C43420m.this.f112472d.f112457g != null) {
                    C43420m.this.f112472d.f112457g.mo105352a((int) (f * 100.0f));
                }
            }

            /* renamed from: a */
            public final void mo102270a(int i, String str, int i2) {
                C43420m.this.mo105341a(i, i2, str);
                C43420m.this.mo105343a(false, i, i2, str);
            }
        });
        m137788d();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0125  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p280ss.android.ugc.aweme.watermark.C43418k m137781a(boolean r21, boolean r22, int[] r23) {
        /*
            r20 = this;
            r0 = r20
            r8 = r23
            r9 = 0
            r10 = 0
            r11 = 1
            if (r21 == 0) goto L_0x0080
            r20.m137794j()
            com.ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.a r2 = r0.f112482o
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f112472d
            com.ss.android.ugc.aweme.account.model.c r3 = r3.f112453c
            r5 = 0
            java.lang.String r6 = ""
            com.ss.android.ugc.aweme.watermark.l r4 = r0.f112472d
            boolean r7 = r4.f112458h
            r4 = r23
            com.ss.android.vesdk.VEWatermarkParam r2 = com.p280ss.android.ugc.aweme.watermark.C43416i.m137761a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x007e
            com.ss.android.vesdk.VEEditor$VIDEO_RATIO r3 = r0.m137782a(r8)
            com.ss.android.vesdk.VEEditor$VIDEO_RATIO r4 = com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO.VIDEO_OUT_RATIO_16_9
            if (r3 != r4) goto L_0x006a
            r3 = r8[r11]
            r4 = r8[r10]
            boolean r3 = com.p280ss.android.ugc.aweme.watermark.C43416i.m137764b(r3, r4)
            if (r3 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f112472d
            boolean r3 = r3.f112458h
            if (r3 == 0) goto L_0x0048
            r3 = r8[r11]
            r4 = r8[r10]
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x007e
            int r4 = r2.yOffset
            int r3 = r3 / 2
            int r4 = r4 + r3
            r2.yOffset = r4
            goto L_0x007e
        L_0x0048:
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f112472d
            boolean r3 = r3.f112465o
            if (r3 != 0) goto L_0x007e
            r3 = r8[r10]
            double r3 = (double) r3
            r5 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            int r3 = (int) r3
            r4 = r8[r11]
            int r4 = r3 - r4
            r8[r11] = r3
            int r3 = r2.yOffset
            int r4 = r4 / 2
            int r3 = r3 + r4
            r2.yOffset = r3
            goto L_0x007e
        L_0x006a:
            com.ss.android.ugc.aweme.watermark.l r3 = r0.f112472d
            boolean r3 = r3.f112458h
            if (r3 == 0) goto L_0x007e
            r3 = r8[r11]
            r4 = r8[r10]
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x007e
            int r4 = r2.yOffset
            int r3 = r3 / 2
            int r4 = r4 + r3
            r2.yOffset = r4
        L_0x007e:
            r4 = r2
            goto L_0x0081
        L_0x0080:
            r4 = r9
        L_0x0081:
            if (r22 == 0) goto L_0x00b3
            com.ss.android.ugc.aweme.watermark.l r2 = r0.f112472d
            boolean r2 = r2.f112461k
            if (r2 == 0) goto L_0x008d
            r20.m137790f()
            goto L_0x0090
        L_0x008d:
            r20.m137789e()
        L_0x0090:
            r20.m137791g()
            java.lang.String r2 = r0.f112471c
            boolean r2 = com.p280ss.android.ugc.aweme.utils.C42973bg.m136427a(r2)
            if (r2 == 0) goto L_0x00b3
            com.ss.android.ugc.aweme.watermark.j r2 = new com.ss.android.ugc.aweme.watermark.j
            java.lang.String r13 = r0.f112471c
            java.lang.String r14 = r0.f112479l
            r15 = 3000(0xbb8, float:4.204E-42)
            r16 = 0
            java.lang.String[] r3 = new java.lang.String[r11]
            java.lang.String r5 = "black"
            r3[r10] = r5
            r12 = r2
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17)
            r7 = r2
            goto L_0x00b4
        L_0x00b3:
            r7 = r9
        L_0x00b4:
            r2 = r8[r10]
            r3 = r8[r11]
            com.ss.android.vesdk.VEVideoEncodeSettings r5 = com.p280ss.android.ugc.aweme.watermark.C43416i.m137757a(r2, r3)
            if (r21 == 0) goto L_0x00c6
            if (r4 != 0) goto L_0x00c6
            java.lang.String r1 = "need interWatermark,but watermark param is null ,maybe the image data is invalid"
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132283b(r1)
            return r9
        L_0x00c6:
            com.ss.android.ugc.aweme.watermark.l r1 = r0.f112472d
            boolean r1 = r1.f112465o
            if (r1 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.watermark.l r1 = r0.f112472d
            java.lang.String r1 = r1.f112466p
            if (r1 == 0) goto L_0x010d
            r1 = 10
            int[] r1 = new int[r1]
            com.ss.android.ugc.aweme.watermark.l r2 = r0.f112472d
            java.lang.String r2 = r2.f112451a
            com.p280ss.android.vesdk.VEUtils.getVideoFileInfo(r2, r1)
            com.ss.android.ugc.aweme.watermark.l r2 = r0.f112472d
            java.lang.String r2 = r2.f112466p
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2)
            if (r2 == 0) goto L_0x0109
            com.ss.android.ugc.aweme.watermark.b r3 = new com.ss.android.ugc.aweme.watermark.b
            r6 = 3
            r13 = r1[r6]
            r14 = r8[r10]
            r15 = r8[r11]
            com.ss.android.ugc.aweme.watermark.l r1 = r0.f112472d
            java.lang.String r1 = r1.f112466p
            int r17 = r2.getHeight()
            int r18 = r2.getWidth()
            com.ss.android.ugc.aweme.watermark.l r2 = r0.f112472d
            boolean r2 = r2.f112467q
            r12 = r3
            r16 = r1
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9 = r3
        L_0x0109:
            com.ss.android.vesdk.VEWaterMarkPosition r1 = com.p280ss.android.vesdk.VEWaterMarkPosition.TL
            r4.position = r1
        L_0x010d:
            r6 = r9
            com.ss.android.ugc.aweme.watermark.k r8 = new com.ss.android.ugc.aweme.watermark.k
            com.ss.android.ugc.aweme.watermark.l r1 = r0.f112472d
            java.lang.String r2 = r1.f112451a
            com.ss.android.ugc.aweme.watermark.l r1 = r0.f112472d
            java.lang.String r3 = r1.f112452b
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r8.mo105323a(r7)
            com.ss.android.ugc.aweme.watermark.l r1 = r0.f112472d
            boolean r1 = r1.f112461k
            if (r1 == 0) goto L_0x0128
            r1 = -1
            r8.f112448d = r1
        L_0x0128:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.watermark.C43420m.m137781a(boolean, boolean, int[]):com.ss.android.ugc.aweme.watermark.k");
    }

    /* renamed from: a */
    public final void mo105341a(int i, int i2, String str) {
        m137793i();
        if (this.f112472d.f112457g != null) {
            this.f112472d.f112457g.mo105354b(i2);
        }
        m137786b(i, i2, str);
    }
}
