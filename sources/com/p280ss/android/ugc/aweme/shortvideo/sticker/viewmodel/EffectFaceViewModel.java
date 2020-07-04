package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.LiveData;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.shortvideo.model.Face;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1602d.C40536c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1602d.C40536c.C40541a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectFaceViewModel */
public class EffectFaceViewModel extends C0063u {

    /* renamed from: a */
    public C0052o<List<Face>> f106508a;

    /* renamed from: b */
    public C0052o<List<Face>> f106509b;

    /* renamed from: c */
    public C0052o<Boolean> f106510c;

    /* renamed from: d */
    public C40536c f106511d;

    /* renamed from: e */
    private HandlerThread f106512e = new HandlerThread("checkFaces");

    /* renamed from: f */
    private Handler f106513f;

    /* renamed from: b */
    public final void mo101278b() {
        this.f106513f.post(new Runnable() {
            public final void run() {
                EffectFaceViewModel.this.f106511d.mo100612c();
                EffectFaceViewModel.this.f106511d.mo100613d();
            }
        });
    }

    /* renamed from: c */
    public final LiveData<Boolean> mo101279c() {
        if (this.f106510c == null) {
            this.f106510c = new C0052o<>();
        }
        return this.f106510c;
    }

    /* renamed from: d */
    public final LiveData<List<Face>> mo101280d() {
        if (this.f106509b == null) {
            this.f106509b = new C0052o<>();
        }
        return this.f106509b;
    }

    public void onCleared() {
        super.onCleared();
        this.f106511d.mo100614e();
        this.f106513f.removeCallbacksAndMessages(null);
        if (VERSION.SDK_INT >= 18) {
            this.f106512e.quitSafely();
        } else {
            this.f106512e.quit();
        }
    }

    /* renamed from: a */
    public final C0052o<List<Face>> mo101277a() {
        if (this.f106508a == null) {
            this.f106512e.start();
            this.f106513f = new Handler(this.f106512e.getLooper());
            this.f106508a = new C0052o<>();
            if (this.f106510c == null) {
                this.f106510c = new C0052o<>();
            }
            if (this.f106509b == null) {
                this.f106509b = new C0052o<>();
            }
            this.f106511d = new C40536c();
            this.f106511d.f105342b = new C40541a() {
                /* renamed from: a */
                public final void mo100618a(final List<Face> list, final List<Face> list2, final boolean z) {
                    int i;
                    StringBuilder sb = new StringBuilder("EffectFaceViewModel onFaceChanged  ");
                    if (list == null) {
                        i = 0;
                    } else {
                        i = list.size();
                    }
                    sb.append(i);
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            if (list != null) {
                                EffectFaceViewModel.this.f106508a.setValue(list);
                            }
                            if (list2 != null) {
                                EffectFaceViewModel.this.f106509b.setValue(list2);
                            }
                            EffectFaceViewModel.this.f106510c.setValue(Boolean.valueOf(z));
                        }
                    });
                }
            };
            this.f106511d.mo100611b();
        }
        return this.f106508a;
    }
}
