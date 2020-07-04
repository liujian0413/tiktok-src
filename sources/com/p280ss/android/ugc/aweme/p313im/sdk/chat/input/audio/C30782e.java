package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.p280ss.android.medialib.camera.ImageFrame;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.e */
public final class C30782e implements SensorEventListener, OnCompletionListener, OnErrorListener {

    /* renamed from: a */
    public MediaPlayer f80575a;

    /* renamed from: b */
    public C30794k f80576b;

    /* renamed from: c */
    public C30796m f80577c;

    /* renamed from: d */
    public ExecutorService f80578d;

    /* renamed from: e */
    public SensorManager f80579e;

    /* renamed from: f */
    public WakeLock f80580f;

    /* renamed from: g */
    public boolean f80581g;

    /* renamed from: h */
    public OnAudioFocusChangeListener f80582h;

    /* renamed from: i */
    private Context f80583i;

    /* renamed from: j */
    private File f80584j;

    /* renamed from: k */
    private long f80585k = 60000;

    /* renamed from: l */
    private volatile boolean f80586l = true;

    /* renamed from: m */
    private AudioManager f80587m;

    /* renamed from: n */
    private Sensor f80588n;

    /* renamed from: o */
    private PowerManager f80589o;

    /* renamed from: p */
    private int f80590p;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: g */
    private void m100275g() {
        this.f80582h = new OnAudioFocusChangeListener() {
            public final void onAudioFocusChange(int i) {
                switch (i) {
                    case ImageFrame.NV21 /*-3*/:
                        C30782e.this.f80581g = false;
                        C30782e.this.mo80610b();
                        break;
                    case -2:
                        C30782e.this.f80581g = false;
                        C30782e.this.mo80610b();
                        return;
                    case -1:
                        C30782e.this.f80581g = false;
                        C30782e.this.mo80610b();
                        return;
                    case 1:
                        C30782e.this.f80581g = true;
                        return;
                    case 2:
                        C30782e.this.f80581g = true;
                        return;
                    case 3:
                        C30782e.this.f80581g = true;
                        return;
                }
            }
        };
    }

    /* renamed from: b */
    public final void mo80610b() {
        mo80609a(false);
    }

    /* renamed from: d */
    public final void mo80612d() {
        m100274c(true);
    }

    /* renamed from: h */
    private boolean m100276h() {
        boolean z = false;
        try {
            if (this.f80575a != null && this.f80575a.isPlaying()) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo80611c() {
        if (!this.f80586l) {
            this.f80586l = true;
            if (this.f80580f != null) {
                this.f80580f.setReferenceCounted(false);
                this.f80580f.release();
            }
        }
        mo80614f();
    }

    /* renamed from: f */
    public final void mo80614f() {
        if (this.f80581g && this.f80587m != null) {
            this.f80587m.abandonAudioFocus(this.f80582h);
            this.f80581g = false;
        }
    }

    /* renamed from: e */
    public final void mo80613e() {
        if (this.f80587m == null) {
            this.f80587m = (AudioManager) this.f80583i.getSystemService("audio");
        }
        if (!this.f80581g && this.f80587m != null && this.f80587m.requestAudioFocus(this.f80582h, 3, 2) == 1) {
            this.f80581g = true;
        }
    }

    /* renamed from: a */
    public final void mo80607a() {
        if (this.f80587m == null) {
            this.f80587m = (AudioManager) this.f80583i.getSystemService("audio");
        }
        if (this.f80579e == null) {
            this.f80579e = (SensorManager) this.f80583i.getSystemService("sensor");
        }
        if (this.f80579e != null && this.f80588n == null) {
            this.f80588n = this.f80579e.getDefaultSensor(8);
        }
        if (this.f80589o == null) {
            this.f80589o = (PowerManager) this.f80583i.getSystemService("power");
        }
        if (this.f80589o != null && this.f80580f == null && VERSION.SDK_INT >= 21) {
            this.f80580f = this.f80589o.newWakeLock(32, "Aweme-IM:audio_player_lock");
        }
        if (!(this.f80579e == null || this.f80588n == null)) {
            this.f80579e.registerListener(this, this.f80588n, 3);
        }
        if (this.f80587m != null) {
            if (this.f80586l) {
                this.f80587m.setSpeakerphoneOn(true);
                this.f80587m.setMode(0);
            } else {
                this.f80587m.setSpeakerphoneOn(false);
                this.f80587m.setMode(2);
            }
        }
        if (this.f80575a == null) {
            this.f80575a = new MediaPlayer();
            this.f80575a.setVolume(1.0f, 1.0f);
            this.f80575a.setLooping(false);
            this.f80575a.setOnErrorListener(this);
            this.f80575a.setOnCompletionListener(this);
        } else {
            this.f80575a.reset();
        }
        try {
            this.f80575a.setDataSource(this.f80584j.getAbsolutePath());
            if (this.f80586l) {
                this.f80575a.setAudioStreamType(3);
            } else {
                this.f80575a.setAudioStreamType(0);
            }
            this.f80575a.prepare();
        } catch (Exception unused) {
            m100274c(false);
        }
    }

    /* renamed from: a */
    public final void mo80608a(File file) {
        this.f80590p = 0;
        m100272a(file, true);
    }

    /* renamed from: b */
    private void m100273b(boolean z) {
        if (z != this.f80586l) {
            this.f80586l = z;
            this.f80590p = 0;
            m100272a(this.f80584j, true);
        }
    }

    /* renamed from: c */
    private void m100274c(final boolean z) {
        this.f80578d.submit(new Runnable() {
            public final void run() {
                try {
                    if (C30782e.this.f80575a != null) {
                        C30782e.this.f80575a.reset();
                        C30782e.this.f80575a.release();
                        C30782e.this.f80575a = null;
                        C30782e.this.f80582h = null;
                    }
                } catch (Exception unused) {
                }
                if (z) {
                    if (C30782e.this.f80579e != null) {
                        C30782e.this.f80579e.unregisterListener(C30782e.this);
                    }
                    if (C30782e.this.f80580f != null && C30782e.this.f80580f.isHeld()) {
                        C30782e.this.f80580f.release();
                        C30782e.this.f80580f = null;
                    }
                    if (C30782e.this.f80578d != null) {
                        C30782e.this.f80578d.shutdown();
                        C30782e.this.f80578d = null;
                    }
                }
            }
        });
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f80577c != null) {
            this.f80577c.mo80603d();
        }
    }

    public C30782e(Context context) {
        this.f80583i = context;
        this.f80578d = C30787f.m100285a();
        m100275g();
    }

    /* renamed from: a */
    public final void mo80609a(boolean z) {
        if (!z || this.f80586l) {
            if (this.f80579e != null) {
                this.f80579e.unregisterListener(this);
            }
            if (!m100276h()) {
                mo80611c();
                return;
            }
            if (this.f80578d == null || this.f80578d.isShutdown() || this.f80578d.isTerminated()) {
                this.f80578d = C30787f.m100285a();
            }
            this.f80578d.submit(new Runnable() {
                public final void run() {
                    try {
                        C30782e.this.f80575a.stop();
                        C30782e.this.f80577c.mo80604e();
                        C30782e.this.mo80611c();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (m100276h()) {
            if (0.0f != sensorEvent.values[0]) {
                m100273b(true);
                if (this.f80580f != null) {
                    this.f80580f.setReferenceCounted(false);
                    this.f80580f.release();
                }
            } else if (this.f80587m == null || !this.f80587m.isWiredHeadsetOn()) {
                m100273b(false);
                if (this.f80580f != null && !this.f80580f.isHeld()) {
                    this.f80580f.acquire(this.f80585k);
                }
            }
        }
    }

    /* renamed from: a */
    private void m100272a(File file, boolean z) {
        m100276h();
        if (file == null || !file.exists() || !file.isFile()) {
            if (this.f80576b != null) {
                this.f80576b.mo80588a(-1);
            }
            return;
        }
        if (!file.equals(this.f80584j)) {
            this.f80590p = 0;
        }
        this.f80584j = file;
        if (this.f80576b != null) {
            this.f80576b.mo80587a();
        }
        if (this.f80578d == null || this.f80578d.isShutdown() || this.f80578d.isTerminated()) {
            this.f80578d = C30787f.m100285a();
        }
        this.f80578d.submit(new Runnable() {
            public final void run() {
                try {
                    C30782e.this.mo80607a();
                    C30782e.this.mo80613e();
                    C30782e.this.f80575a.start();
                } catch (Exception unused) {
                }
            }
        });
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f80590p++;
        if (this.f80590p > 5) {
            onCompletion(mediaPlayer);
        } else {
            mediaPlayer.release();
            this.f80575a = null;
            m100272a(this.f80584j, true);
        }
        return true;
    }
}
