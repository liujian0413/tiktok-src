package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40913s;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurVideoRecordModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ad */
public final class C41243ad implements C40913s {

    /* renamed from: a */
    private FragmentActivity f107474a;

    /* renamed from: d */
    public final ShortVideoContext mo101195d() {
        return m131842i().f99791a;
    }

    /* renamed from: i */
    private ShortVideoContextViewModel m131842i() {
        return (ShortVideoContextViewModel) C0069x.m159a(this.f107474a).mo147a(ShortVideoContextViewModel.class);
    }

    /* renamed from: a */
    public final LiveData<Boolean> mo101191a() {
        return m131842i().mo96181j();
    }

    /* renamed from: b */
    public final boolean mo101193b() {
        return m131842i().mo96171d();
    }

    /* renamed from: c */
    public final LiveData<Boolean> mo101194c() {
        return m131842i().mo96182k();
    }

    /* renamed from: e */
    public final boolean mo101196e() {
        return m131842i().mo96184m();
    }

    /* renamed from: f */
    public final AVMusic mo101197f() {
        return C39360dw.m125725a().mo97931b();
    }

    /* renamed from: h */
    public final LiveData<Double> mo101199h() {
        return m131842i().mo96178h();
    }

    /* renamed from: g */
    public final int mo101198g() {
        return ((CurVideoRecordModel) C0069x.m159a(this.f107474a).mo147a(CurVideoRecordModel.class)).f106507a;
    }

    public C41243ad(FragmentActivity fragmentActivity) {
        this.f107474a = fragmentActivity;
    }

    /* renamed from: a */
    public final void mo101192a(List<String> list) {
        if (this.f107474a instanceof VideoRecordNewActivity) {
            ((VideoRecordNewActivity) this.f107474a).f107273N = list;
        }
    }
}
