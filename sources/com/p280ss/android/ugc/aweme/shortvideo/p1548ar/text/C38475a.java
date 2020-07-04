package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.EffectTextInputView.C38474a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.a */
public final class C38475a extends C38490n {
    /* renamed from: a */
    public final C38490n mo96437a(EffectTextInputView effectTextInputView) {
        this.f100081a = effectTextInputView;
        effectTextInputView.setEffectTextChangeListener(new C38474a() {
            /* renamed from: b */
            public final void mo96435b(String str) {
            }

            /* renamed from: a */
            public final void mo96434a(String str) {
                if (C38475a.this.f100087g) {
                    C38475a.this.mo96452a(str);
                }
            }
        });
        return this;
    }

    public C38475a(FragmentActivity fragmentActivity, ASCameraView aSCameraView) {
        super(fragmentActivity, aSCameraView);
    }

    /* renamed from: a */
    public final int mo96436a(int i, String str) {
        this.f100083c.mo56218a((OnARTextCountCallback) new C38477b(this, i, str));
        return this.f100089i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96438a(int i, int i2, String str) {
        this.f100089i = i;
        if (this.f100089i > 0 || i2 != 1) {
            if (!TextUtils.isEmpty(str)) {
                this.f100089i += str.length();
            }
            return;
        }
        C10761a.m31410e((Context) this.f100086f, this.f100086f.getResources().getString(R.string.dca)).mo25750a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96439a(int i, String str, int i2) {
        this.f100086f.runOnUiThread(new C38478c(this, i2, i, str));
    }
}
