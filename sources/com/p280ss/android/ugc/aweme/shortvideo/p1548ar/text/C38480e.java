package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.EffectTextInputView.C38474a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.e */
public final class C38480e extends C38490n {
    /* renamed from: a */
    public final void mo96441a() {
        m123017f();
    }

    /* renamed from: f */
    private void m123017f() {
        if (!TextUtils.isEmpty(this.f100090j) && this.f100083c != null && this.f100084d != null) {
            this.f100083c.mo56225a(this.f100090j, this.f100084d.f100078b, this.f100084d.f100079c, this.f100084d.f100080d);
            this.f100083c.mo56250e(true);
        }
    }

    /* renamed from: a */
    public final C38490n mo96437a(EffectTextInputView effectTextInputView) {
        effectTextInputView.setEffectTextChangeListener(new C38474a() {
            /* renamed from: a */
            public final void mo96434a(String str) {
                if (C38480e.this.f100087g) {
                    C38480e.this.mo96452a(str);
                }
            }

            /* renamed from: b */
            public final void mo96435b(String str) {
                C38480e.this.f100090j = str;
                C38480e.this.f100083c.mo56250e(true);
                C38480e.this.f100083c.mo56225a(str, C38480e.this.f100084d.f100078b, C38480e.this.f100084d.f100079c, C38480e.this.f100084d.f100080d);
            }
        });
        return super.mo96437a(effectTextInputView);
    }

    public C38480e(FragmentActivity fragmentActivity, ASCameraView aSCameraView) {
        super(fragmentActivity, aSCameraView);
    }

    /* renamed from: a */
    public final int mo96436a(int i, String str) {
        this.f100083c.mo56218a((OnARTextCountCallback) new C38482f(this, i, str));
        return this.f100089i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96442a(int i, int i2, String str) {
        this.f100089i = i;
        if (this.f100089i > 0 || i2 != 1) {
            if (!TextUtils.isEmpty(str)) {
                this.f100089i += str.length();
            }
            if (this.f100081a != null) {
                this.f100081a.setMaxTextCount(this.f100089i);
            }
            return;
        }
        C10761a.m31410e((Context) this.f100086f, this.f100086f.getResources().getString(R.string.dca)).mo25750a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96443a(int i, String str, int i2) {
        this.f100086f.runOnUiThread(new C38483g(this, i2, i, str));
    }
}
