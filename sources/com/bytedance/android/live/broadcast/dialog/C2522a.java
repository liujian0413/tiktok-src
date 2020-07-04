package com.bytedance.android.live.broadcast.dialog;

import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.bytedance.android.live.broadcast.api.AutoReplyApi;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.widget.C9239c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.dialog.a */
public final class C2522a extends C9239c {

    /* renamed from: a */
    public static boolean f8131a;

    /* renamed from: com.bytedance.android.live.broadcast.dialog.a$a */
    static class C2524a implements C7326g<Object> {

        /* renamed from: a */
        private boolean f8132a;

        private C2524a(boolean z) {
            this.f8132a = z;
        }

        public final void accept(Object obj) {
            if (this.f8132a) {
                C9049ap.m27022a((int) R.string.f9a);
            }
            C8946b.f24374Z.mo22118a(Boolean.valueOf(this.f8132a));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.dialog.a$b */
    static class C2525b implements C7326g<Throwable> {

        /* renamed from: a */
        private WeakReference<ToggleButton> f8133a;

        private C2525b(ToggleButton toggleButton) {
            this.f8133a = new WeakReference<>(toggleButton);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            if (this.f8133a.get() != null) {
                C2522a.f8131a = true;
                ((ToggleButton) this.f8133a.get()).setChecked(false);
                C2522a.f8131a = false;
            }
        }
    }

    /* renamed from: a */
    public final int mo9100a() {
        return R.layout.amm;
    }

    public C2522a(Context context) {
        super(context);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.dl0);
        toggleButton.setChecked(((Boolean) C8946b.f24374Z.mo22117a()).booleanValue());
        toggleButton.setOnCheckedChangeListener(new C2526b(toggleButton));
    }

    /* renamed from: a */
    static final /* synthetic */ void m10446a(ToggleButton toggleButton, CompoundButton compoundButton, boolean z) {
        String str;
        if (!f8131a) {
            AutoReplyApi a = C2515f.m10417f().mo9076c().mo9166a();
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            a.enableAutoReply(str).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2524a<Object>(z), (C7326g<? super Throwable>) new C2525b<Object>(toggleButton));
        }
    }
}
