package com.p280ss.android.ugc.aweme.shortvideo.sticker.composer;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.c */
public final class C40529c {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.composer.c$a */
    public static final class C40530a implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C7562b f105331a;

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }

        public C40530a(C7562b bVar) {
            this.f105331a = bVar;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f105331a.invoke(Integer.valueOf(i));
        }
    }
}
