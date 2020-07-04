package com.p280ss.android.ugc.aweme.shortvideo.countdown;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.media.SoundPool.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.a */
public final class C38591a implements C38621g {

    /* renamed from: a */
    public final SoundPool f100251a;

    /* renamed from: b */
    public Integer f100252b;

    /* renamed from: c */
    public final Context f100253c;

    /* renamed from: d */
    private final int f100254d;

    /* renamed from: e */
    private final int f100255e;

    /* renamed from: f */
    private final int f100256f;

    /* renamed from: g */
    private final Handler f100257g = new Handler();

    /* renamed from: h */
    private LinkedList<Integer> f100258h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.a$a */
    static final class C38592a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38591a f100259a;

        C38592a(C38591a aVar) {
            this.f100259a = aVar;
        }

        public final void run() {
            Integer num = this.f100259a.f100252b;
            if (num != null) {
                this.f100259a.f100251a.stop(num.intValue());
                this.f100259a.mo96592a();
            }
        }
    }

    /* renamed from: b */
    public final void mo96594b() {
        this.f100257g.removeCallbacksAndMessages(null);
        this.f100251a.release();
        this.f100252b = null;
        this.f100258h.clear();
    }

    /* renamed from: a */
    public final void mo96592a() {
        this.f100252b = (Integer) this.f100258h.poll();
        Integer num = this.f100252b;
        if (num != null) {
            this.f100251a.play(num.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            this.f100257g.postDelayed(new C38592a(this), 1000);
        }
    }

    public C38591a(Context context) {
        SoundPool soundPool;
        C7573i.m23587b(context, "context");
        this.f100253c = context;
        if (VERSION.SDK_INT >= 21) {
            soundPool = new Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
            C7573i.m23582a((Object) soundPool, "SoundPool.Builder().setM…(audioAttributes).build()");
        } else {
            soundPool = new SoundPool(3, 3, 0);
        }
        this.f100251a = soundPool;
        this.f100254d = this.f100251a.load(this.f100253c, R.raw.shot_count_down_a, 1);
        this.f100255e = this.f100251a.load(this.f100253c, R.raw.shot_count_down_b, 1);
        this.f100256f = this.f100251a.load(this.f100253c, R.raw.shot_count_down_c, 1);
        this.f100258h = new LinkedList<>();
    }

    /* renamed from: a */
    public final void mo96593a(int i) {
        if (i == 10) {
            for (int i2 = 0; i2 < 7; i2++) {
                this.f100258h.offer(Integer.valueOf(this.f100254d));
            }
        }
        this.f100258h.offer(Integer.valueOf(this.f100255e));
        this.f100258h.offer(Integer.valueOf(this.f100255e));
        this.f100258h.offer(Integer.valueOf(this.f100256f));
        mo96592a();
    }
}
