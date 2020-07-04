package com.p280ss.android.ugc.aweme.shortvideo.sticker.multiSticker;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.ViewStubCompat;
import android.view.View;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater.MultiStickerAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurChildStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.c */
public final class C40829c implements C40825a {

    /* renamed from: a */
    private RecyclerView f106177a;

    /* renamed from: b */
    private MultiStickerAdapter f106178b;

    /* renamed from: c */
    private AppCompatActivity f106179c;

    /* renamed from: d */
    private C40831e f106180d;

    /* renamed from: e */
    private LinearLayoutManager f106181e = new LinearLayoutManager(this.f106177a.getContext(), 0, false);

    /* renamed from: f */
    private List<Effect> f106182f;

    /* renamed from: c */
    public final void mo100568c() {
    }

    /* renamed from: a */
    public final void mo100564a() {
        this.f106177a.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo100567b() {
        this.f106177a.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo101097a(List<Effect> list) {
        this.f106182f = list;
        this.f106178b.mo101090a(list);
    }

    /* renamed from: a */
    private void m130470a(int i) {
        int j = this.f106181e.mo5445j();
        int l = this.f106181e.mo5447l();
        if (i <= j || i > l) {
            this.f106177a.mo5541b(i);
            return;
        }
        this.f106177a.scrollBy(0, this.f106177a.getChildAt(i - j).getTop());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101095a(C0902i iVar) {
        int i;
        Object obj;
        if (iVar != null) {
            int i2 = -1;
            if (iVar.f3154a == null) {
                i = -1;
            } else {
                i = ((Integer) iVar.f3154a).intValue();
            }
            if (iVar.f3155b != null) {
                i2 = ((Integer) iVar.f3155b).intValue();
            }
            if (i >= 0 && i2 != i) {
                this.f106178b.f106168a = i2;
                MultiStickerAdapter multiStickerAdapter = this.f106178b;
                if (C6311g.m19573a(this.f106182f)) {
                    obj = null;
                } else {
                    obj = this.f106182f.get(i);
                }
                multiStickerAdapter.notifyItemChanged(i, obj);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo101096a(FaceStickerBean faceStickerBean, int i) {
        this.f106178b.f106168a = i;
        m130470a(i);
    }

    public C40829c(AppCompatActivity appCompatActivity, String str, View view, C40831e eVar, EffectStickerManager effectStickerManager) {
        this.f106179c = appCompatActivity;
        this.f106177a = (RecyclerView) ((ViewStubCompat) view.findViewById(R.id.dci)).mo6224a();
        this.f106180d = eVar;
        this.f106178b = new MultiStickerAdapter(str, effectStickerManager);
        ((CurChildStickerViewModel) C0069x.m159a((FragmentActivity) this.f106179c).mo147a(CurChildStickerViewModel.class)).f106504a.observe(this.f106179c, new C40830d(this));
        this.f106177a.setLayoutManager(this.f106181e);
        this.f106177a.setAdapter(this.f106178b);
    }
}
