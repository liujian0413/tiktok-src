package com.p280ss.android.ugc.aweme.longvideo;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32727e.C32728a;
import com.p280ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.k */
public final class C32750k implements C32732c {

    /* renamed from: a */
    public OnSeekBarChangeListener f85388a;

    /* renamed from: b */
    public boolean f85389b;

    /* renamed from: c */
    public VideoPlaySeekBar f85390c;

    /* renamed from: d */
    public C32717b f85391d;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.k$a */
    public static final class C32751a implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C32750k f85392a;

        C32751a(C32750k kVar) {
            this.f85392a = kVar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            this.f85392a.f85389b = true;
            C32716a aVar = new C32716a();
            aVar.f85292a = true;
            C42961az.m136380a(aVar);
            OnSeekBarChangeListener onSeekBarChangeListener = this.f85392a.f85388a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            this.f85392a.f85389b = false;
            if (seekBar != null) {
                int progress = seekBar.getProgress();
                C32717b bVar = this.f85392a.f85391d;
                if (bVar != null) {
                    bVar.mo64937a(((float) progress) / 100.0f);
                }
            }
            C32716a aVar = new C32716a();
            aVar.f85293b = true;
            C42961az.m136380a(aVar);
            OnSeekBarChangeListener onSeekBarChangeListener = this.f85392a.f85388a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            OnSeekBarChangeListener onSeekBarChangeListener = this.f85392a.f85388a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo84207a(int i) {
        this.f85390c.setSecondaryProgress(i);
    }

    /* renamed from: a */
    public final void mo84206a(float f) {
        if (!this.f85389b) {
            this.f85390c.setProgress(f);
        }
    }

    /* renamed from: a */
    public final void mo84243a(OnSeekBarChangeListener onSeekBarChangeListener) {
        C7573i.m23587b(onSeekBarChangeListener, "seekBarChangeListener");
        this.f85388a = onSeekBarChangeListener;
    }

    /* renamed from: b */
    public final void mo84244b(int i) {
        this.f85390c.setTotalTime(C32728a.m105939b(i));
        this.f85390c.setProgress(0.0f);
        this.f85390c.setOnSeekBarChangeListener(new C32751a(this));
    }

    public C32750k(VideoPlaySeekBar videoPlaySeekBar, C32717b bVar) {
        C7573i.m23587b(videoPlaySeekBar, "seekBar");
        this.f85390c = videoPlaySeekBar;
        this.f85391d = bVar;
    }
}
