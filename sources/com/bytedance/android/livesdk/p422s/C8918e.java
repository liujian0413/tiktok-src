package com.bytedance.android.livesdk.p422s;

import android.support.p022v4.app.C0608j;
import android.support.p029v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.bytedance.android.live.room.C3496m;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b.C9175a;
import com.bytedance.android.livesdkapi.host.C9468j;

/* renamed from: com.bytedance.android.livesdk.s.e */
public final class C8918e implements C3496m {

    /* renamed from: com.bytedance.android.livesdk.s.e$a */
    public static final class C8919a implements C9174b<C3496m> {
        /* renamed from: a */
        public final C9175a<C3496m> mo11528a(C9175a<C3496m> aVar) {
            return aVar.mo22388a(new C8918e()).mo22387a();
        }
    }

    /* renamed from: a */
    public final void mo10527a() {
        TTLiveSDKContext.getHostService().mo22362c().hideStickerView();
    }

    /* renamed from: b */
    public final boolean mo10529b() {
        return TTLiveSDKContext.getHostService().mo22362c().isShowStickerView();
    }

    /* renamed from: a */
    public final void mo10528a(AppCompatActivity appCompatActivity, C0608j jVar, String str, FrameLayout frameLayout, C9468j jVar2) {
        TTLiveSDKContext.getHostService().mo22362c().showStickerView(appCompatActivity, jVar, str, frameLayout, jVar2);
    }
}
