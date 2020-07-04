package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import bolts.C1606i;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40374af;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42594d;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dj */
final /* synthetic */ class C41338dj implements Callable {

    /* renamed from: a */
    private final Context f107600a;

    /* renamed from: b */
    private final String f107601b;

    /* renamed from: c */
    private final C41654d f107602c;

    /* renamed from: d */
    private final int f107603d;

    /* renamed from: e */
    private final C1606i f107604e;

    C41338dj(Context context, String str, C41654d dVar, int i, C1606i iVar) {
        this.f107600a = context;
        this.f107601b = str;
        this.f107602c = dVar;
        this.f107603d = i;
        this.f107604e = iVar;
    }

    public final Object call() {
        return C35563c.f93246i.mo103855a(this.f107600a, this.f107601b, 0, (ProgressDialog) this.f107602c, (C42594d) new C42594d(this.f107601b, this.f107603d, this.f107604e, this.f107602c) {
            /* renamed from: a */
            public final void mo101896a(Exception exc) {
                r8.dismiss();
                r10.mo6899a(exc);
            }

            /* renamed from: a */
            public final void mo101897a(String str, AVMusic aVMusic) {
                C40374af.m129114a(r7, str);
                aVMusic.setMusicPriority(r9);
                C39360dw.m125725a().mo97928a(aVMusic);
                Bundle bundle = new Bundle();
                bundle.putString("path", str);
                r10.mo6900a(bundle);
            }
        });
    }
}
