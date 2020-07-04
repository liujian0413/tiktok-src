package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.MediaRecordPresenterViewModel */
public class MediaRecordPresenterViewModel extends C0063u {

    /* renamed from: a */
    public C20749b f105003a;

    /* renamed from: b */
    public C0052o<Bitmap> f105004b;

    /* renamed from: c */
    private C42320g f105005c;

    /* renamed from: a */
    public final C0052o<Bitmap> mo100394a() {
        if (this.f105004b == null) {
            this.f105004b = new C0052o<>();
        }
        return this.f105004b;
    }

    /* renamed from: b */
    public final void mo100397b() {
        if (this.f105005c != null) {
            this.f105005c.mo103797d();
        }
    }

    /* renamed from: a */
    public final MediaRecordPresenterViewModel mo100395a(C42320g gVar) {
        this.f105005c = gVar;
        return this;
    }

    /* renamed from: a */
    public final void mo100396a(final String str) {
        if (this.f105004b == null) {
            this.f105004b = new C0052o<>();
        }
        C6726a.m20842a(new Runnable() {
            public final void run() {
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                if (decodeFile != null) {
                    MediaRecordPresenterViewModel.this.f105004b.postValue(decodeFile);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo100398b(String str) {
        if (this.f105005c != null) {
            this.f105005c.mo103793a(str);
        }
    }
}
