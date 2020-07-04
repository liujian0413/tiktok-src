package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import android.os.CountDownTimer;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.g */
public final class C30788g implements OnErrorListener {

    /* renamed from: a */
    public MediaRecorder f80596a;

    /* renamed from: b */
    public CountDownTimer f80597b;

    /* renamed from: c */
    public int f80598c = 1000;

    /* renamed from: d */
    public volatile boolean f80599d;

    /* renamed from: e */
    public C30794k f80600e;

    /* renamed from: f */
    public long f80601f;

    /* renamed from: g */
    public File f80602g;

    /* renamed from: h */
    public long f80603h;

    /* renamed from: i */
    private ExecutorService f80604i;

    /* renamed from: c */
    public final void mo80627c() {
        m100286b(true);
    }

    public C30788g() {
        try {
            this.f80604i = C30791h.m100292a();
            this.f80596a = new MediaRecorder();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo80626b() {
        if (!this.f80599d) {
            this.f80599d = true;
            if (this.f80600e != null) {
                this.f80600e.mo80587a();
            }
            if (this.f80604i == null || this.f80604i.isShutdown() || this.f80604i.isTerminated()) {
                this.f80604i = C30791h.m100292a();
            }
            this.f80604i.submit(new Runnable() {
                public final void run() {
                    try {
                        if (C30788g.this.f80596a != null) {
                            C30788g.this.f80596a.reset();
                        }
                        C30788g.this.mo80624a();
                        C30788g.this.f80601f = SystemClock.uptimeMillis();
                        C30788g.this.f80596a.start();
                        C30788g.this.f80597b.start();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo80624a() {
        try {
            if (this.f80596a == null) {
                this.f80596a = new MediaRecorder();
            }
            this.f80596a.setAudioSource(1);
            this.f80596a.setOutputFormat(2);
            this.f80596a.setAudioSamplingRate(44100);
            this.f80596a.setAudioEncoder(3);
            this.f80596a.setAudioEncodingBitRate(96000);
            this.f80596a.setOnErrorListener(this);
            File a = C30769b.m100229a().f80549a.mo80571a();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append(".m4a");
            this.f80602g = new File(a, sb.toString());
            if (!this.f80602g.getParentFile().exists()) {
                this.f80602g.getParentFile().mkdirs();
            }
            this.f80602g.createNewFile();
            this.f80596a.setOutputFile(this.f80602g.getPath());
            this.f80596a.prepare();
        } catch (Exception unused) {
            m100286b(false);
        }
    }

    /* renamed from: b */
    private void m100286b(boolean z) {
        try {
            if (this.f80596a != null) {
                this.f80596a.reset();
                this.f80596a.release();
                this.f80596a = null;
            }
        } catch (Exception unused) {
        }
        if (this.f80604i != null && z) {
            this.f80604i.shutdown();
            this.f80604i = null;
        }
    }

    /* renamed from: a */
    public final int mo80623a(int i) {
        int i2;
        int i3 = 0;
        if (this.f80596a == null) {
            i2 = 0;
        } else {
            i2 = this.f80596a.getMaxAmplitude() / 600;
        }
        if (i2 > 1) {
            i3 = (int) (Math.log10((double) i2) * 20.0d);
        }
        if (i3 == 0) {
            return 1;
        }
        return i3 / 5;
    }

    /* renamed from: a */
    public final void mo80625a(final boolean z) {
        if (this.f80599d) {
            if (this.f80604i == null || this.f80604i.isShutdown() || this.f80604i.isTerminated()) {
                this.f80604i = C30791h.m100292a();
            }
            this.f80604i.submit(new Runnable() {
                public final void run() {
                    C30788g.this.f80597b.cancel();
                    try {
                        C30788g.this.f80596a.stop();
                        C30788g.this.f80596a.reset();
                    } catch (Exception unused) {
                    }
                    C30788g.this.f80603h = SystemClock.uptimeMillis() - C30788g.this.f80601f;
                    C30788g.this.f80599d = false;
                    if (C30788g.this.f80603h < ((long) C30788g.this.f80598c)) {
                        if (C30788g.this.f80602g != null) {
                            C30788g.this.f80602g.delete();
                        }
                        if (C30788g.this.f80600e != null) {
                            C30788g.this.f80600e.mo80588a(-1);
                        }
                    } else if (z) {
                        if (C30788g.this.f80602g != null) {
                            C30788g.this.f80602g.delete();
                        }
                        if (C30788g.this.f80600e != null) {
                            C30788g.this.f80600e.mo80590c();
                        }
                    } else if (C30788g.this.f80600e != null) {
                        C30788g.this.f80600e.mo80589b();
                    }
                }
            });
        }
    }

    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        if (this.f80596a != null) {
            try {
                this.f80596a.reset();
            } catch (Exception unused) {
            }
        }
        if (this.f80602g != null) {
            this.f80602g.delete();
        }
        this.f80599d = false;
        if (this.f80600e != null) {
            this.f80600e.mo80588a(i);
        }
    }
}
