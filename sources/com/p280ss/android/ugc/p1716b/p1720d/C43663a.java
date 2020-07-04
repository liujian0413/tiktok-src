package com.p280ss.android.ugc.p1716b.p1720d;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44851d;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.p280ss.android.ugc.p1716b.C43650a;
import com.p280ss.android.ugc.p1716b.C43659c;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import com.p280ss.android.ugc.p1716b.p1717a.C43652b;
import com.p280ss.android.ugc.p1716b.p1717a.C43653c;
import com.p280ss.android.ugc.p1716b.p1717a.C43654d;
import com.p280ss.android.ugc.p1716b.p1717a.C43655e;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;
import com.p280ss.android.ugc.p1716b.p1719c.C43661a;
import java.io.File;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.b.d.a */
public class C43663a implements OnCompletionListener, OnPreparedListener {

    /* renamed from: a */
    public C43654d f112997a;

    /* renamed from: b */
    public C43651a f112998b;

    /* renamed from: c */
    public C44849d f112999c;

    /* renamed from: d */
    public C43655e f113000d;

    /* renamed from: e */
    public C43652b f113001e;

    /* renamed from: f */
    public C43653c f113002f;

    /* renamed from: g */
    public String f113003g;

    /* renamed from: h */
    public int f113004h = 0;

    /* renamed from: i */
    public int f113005i = 0;

    /* renamed from: j */
    private MediaPlayer f113006j;

    /* renamed from: k */
    private C43661a f113007k;

    /* renamed from: l */
    private Context f113008l;

    /* renamed from: m */
    private String f113009m = C43663a.class.getName();

    /* renamed from: n */
    private ScheduledThreadPoolExecutor f113010n;

    /* renamed from: o */
    private boolean f113011o;

    /* renamed from: com.ss.android.ugc.b.d.a$a */
    class C43666a extends AbsDownloadListener {

        /* renamed from: b */
        private C43657a f113016b;

        public final void onCanceled(DownloadInfo downloadInfo) {
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59419g();
            }
        }

        public final void onPause(DownloadInfo downloadInfo) {
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59418f();
            }
        }

        public final void onStart(DownloadInfo downloadInfo) {
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59407a(downloadInfo.getId());
            }
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            if (downloadInfo.getTotalBytes() > 0) {
                int curBytes = (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes());
                if (C43663a.this.f112999c != null) {
                    C43663a.this.f112999c.mo59408a(curBytes, downloadInfo.getCurBytes(), downloadInfo.getTotalBytes());
                }
                C43663a.this.f113005i = curBytes;
                if (!(C43663a.this.f112998b == null || this.f113016b == null)) {
                    C43663a.this.f112998b.mo86592a(this.f113016b.f112968a, curBytes, 4);
                }
            }
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            if (downloadInfo.getSavePath().endsWith("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(downloadInfo.getSavePath());
                sb.append(downloadInfo.getName());
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(downloadInfo.getSavePath());
                sb2.append(File.separator);
                sb2.append(downloadInfo.getName());
                str = sb2.toString();
            }
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59412a(str);
            }
            if (C43663a.this.f112998b != null) {
                C43663a.this.f112998b.mo86591a(str, 4);
            }
        }

        public C43666a(C43657a aVar) {
            this.f113016b = aVar;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59411a(C44850c.m141527a().mo107289a(baseException.getErrorCode()).mo107290a(baseException.getMessage()));
            }
            if (C43663a.this.f112998b != null && this.f113016b != null) {
                C43663a.this.f112998b.mo86593a(this.f113016b.f112968a, 4, (Exception) baseException);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.b.d.a$b */
    class C43667b implements C44849d {

        /* renamed from: b */
        private C43657a f113018b;

        /* renamed from: c */
        private String f113019c;

        /* renamed from: f */
        public final void mo59418f() {
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59418f();
            }
        }

        /* renamed from: g */
        public final void mo59419g() {
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59419g();
            }
        }

        /* renamed from: a */
        public final void mo59407a(int i) {
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59407a(i);
            }
        }

        /* renamed from: a */
        public final void mo59412a(String str) {
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59412a(str);
            }
            if (C43663a.this.f112998b != null) {
                File file = new File(str);
                if (!file.exists() || file.length() == 0) {
                    mo59411a(C44850c.m141527a().mo107290a("file is not exist"));
                } else {
                    C43663a.this.f112998b.mo86591a(str, 4);
                }
            }
        }

        /* renamed from: a */
        public final void mo59411a(C44850c cVar) {
            if (cVar.f115334a == 8) {
                if (C43663a.this.f112999c != null) {
                    C43663a.this.f112999c.mo59411a(cVar);
                }
                if (!(C43663a.this.f112998b == null || this.f113018b == null)) {
                    C43651a aVar = C43663a.this.f112998b;
                    String str = this.f113018b.f112968a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(cVar.f115335b);
                    sb.append("       *** 重试次数 *** : ");
                    sb.append(C43663a.this.f113004h);
                    aVar.mo86593a(str, 4, new Exception(sb.toString()));
                }
            } else if (C43663a.this.f113004h < 3) {
                if (C43650a.m138299a(this.f113019c)) {
                    new File(this.f113019c).delete();
                }
                C44851d.m141532a().mo107292a(new C44856a().mo107294a(this.f113018b.f112968a).mo107298b(this.f113019c).mo107297a(), (C44849d) new C43667b(this.f113018b, this.f113019c));
                C43663a.this.f113004h++;
            } else {
                if (!(C43663a.this.f112998b == null || this.f113018b == null)) {
                    C43651a aVar2 = C43663a.this.f112998b;
                    String str2 = this.f113018b.f112968a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cVar.f115335b);
                    sb2.append("       *** 重试次数 *** : ");
                    sb2.append(C43663a.this.f113004h);
                    aVar2.mo86593a(str2, 4, new Exception(sb2.toString()));
                }
                if (C43663a.this.f112999c != null) {
                    C43663a.this.f112999c.mo59411a(cVar);
                }
            }
        }

        public C43667b(C43657a aVar, String str) {
            this.f113018b = aVar;
            this.f113019c = str;
        }

        /* renamed from: a */
        public final void mo59408a(int i, long j, long j2) {
            if (C43663a.this.f112999c != null) {
                C43663a.this.f112999c.mo59408a(i, j, j2);
            }
            C43663a.this.f113005i = i;
            if (C43663a.this.f112998b != null && this.f113018b != null) {
                C43663a.this.f112998b.mo86592a(this.f113018b.f112968a, i, 4);
            }
        }
    }

    /* renamed from: a */
    public final void mo105619a() {
        mo105626c();
    }

    /* renamed from: b */
    public final void mo105624b() {
        try {
            this.f113011o = true;
            if (this.f113006j != null && this.f113006j.isPlaying()) {
                this.f113006j.pause();
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: c */
    public final void mo105626c() {
        try {
            if (this.f113006j != null) {
                mo105624b();
                this.f113006j.release();
                this.f113006j = null;
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final void mo105620a(Context context) {
        this.f113008l = context;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f113001e != null) {
            this.f113001e.mo61979a();
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        try {
            if (!this.f113011o && this.f113006j != null) {
                this.f113006j.start();
                if (this.f112997a != null) {
                    this.f112997a.mo61985a(4, this.f113006j.getDuration());
                }
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final void mo105621a(final C43657a aVar) {
        String str;
        if (aVar != null && !TextUtils.isEmpty(this.f113003g)) {
            this.f113004h = 0;
            if (this.f113003g.endsWith("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f113003g);
                sb.append(C43650a.m138300b(aVar.f112968a));
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f113003g);
                sb2.append(File.separator);
                sb2.append(C43650a.m138300b(aVar.f112968a));
                str = sb2.toString();
            }
            File file = new File(str);
            if (!file.exists() || file.length() == 0 || this.f112998b == null) {
                C44851d.m141532a().mo107292a(new C44856a().mo107294a(aVar.f112968a).mo107298b(str).mo107295a(aVar.f112971d).mo107297a(), (C44849d) new C43667b(aVar, str));
                this.f113005i = 0;
                if (C43659c.m138324a().f112991e) {
                    try {
                        if (this.f113010n != null) {
                            this.f113010n.shutdown();
                            this.f113010n = null;
                            this.f113010n = new ScheduledThreadPoolExecutor(1);
                        } else {
                            this.f113010n = new ScheduledThreadPoolExecutor(1);
                        }
                        this.f113010n.schedule(new Runnable() {
                            public final void run() {
                                if (C43663a.this.f113005i == 0 && C43663a.this.f112998b != null) {
                                    C43663a.this.f112998b.mo86593a(aVar.f112968a, 4, new Exception("cancel by user because timeout"));
                                }
                            }
                        }, (long) C43659c.f112985f, TimeUnit.MILLISECONDS);
                        return;
                    } catch (Exception unused) {
                    }
                }
                return;
            }
            this.f112998b.mo86591a(str, 4);
        }
    }

    /* renamed from: b */
    public final void mo105625b(C43657a aVar) {
        String str;
        if (aVar != null) {
            if (this.f113003g.endsWith("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f113003g);
                sb.append(C43650a.m138300b(aVar.f112968a));
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f113003g);
                sb2.append(File.separator);
                sb2.append(C43650a.m138300b(aVar.f112968a));
                str = sb2.toString();
            }
            File file = new File(str);
            if (!file.exists() || file.length() <= 0 || this.f112998b == null) {
                Downloader.with(this.f113008l).url(aVar.f112968a).savePath(this.f113003g).name(C43650a.m138300b(aVar.f112968a)).retryCount(3).showNotification(false).mainThreadListener(new C43666a(aVar)).download();
            } else {
                this.f112998b.mo86591a(str, 4);
            }
        }
    }

    /* renamed from: a */
    public final void mo105622a(C43657a aVar, boolean z) {
        if (aVar != null) {
            this.f113011o = false;
            if (this.f113006j == null) {
                this.f113006j = new MediaPlayer();
                this.f113006j.setOnErrorListener(new OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (C43663a.this.f113002f != null) {
                            C43663a.this.f113002f.mo61980a(i, i2);
                        }
                        C43663a.this.mo105626c();
                        return false;
                    }
                });
            }
            Uri parse = Uri.parse(aVar.f112968a);
            try {
                this.f113006j.reset();
                this.f113006j.setAudioStreamType(3);
                if (aVar.f112971d != null) {
                    this.f113006j.setDataSource(this.f113008l, parse, aVar.f112971d);
                } else {
                    this.f113006j.setDataSource(this.f113008l, parse);
                }
                this.f113006j.setLooping(z);
                this.f113006j.prepareAsync();
                this.f113006j.setOnPreparedListener(this);
                this.f113006j.setOnCompletionListener(this);
            } catch (Exception unused) {
                mo105626c();
                if (this.f113002f != null) {
                    this.f113002f.mo61980a(0, 0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo105623a(String str, String str2, boolean z) {
        if (this.f113007k == null) {
            this.f113007k = new C43661a(this.f113000d);
        }
        this.f113007k.mo105616a(str2, z);
    }
}
