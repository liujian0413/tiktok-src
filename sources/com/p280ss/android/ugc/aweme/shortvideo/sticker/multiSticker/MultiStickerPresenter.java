package com.p280ss.android.ugc.aweme.shortvideo.sticker.multiSticker;

import android.arch.lifecycle.C0042h;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40934t;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41019y.C41020a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.MultiStickerPresenter */
public class MultiStickerPresenter implements C0042h, C40934t, C41020a {

    /* renamed from: a */
    public boolean f106160a;

    /* renamed from: b */
    public Effect f106161b;

    /* renamed from: c */
    private C40829c f106162c;

    /* renamed from: d */
    private FaceStickerBean f106163d;

    /* renamed from: e */
    private EffectStickerManager f106164e;

    /* renamed from: f */
    private ShortVideoContext f106165f;

    /* renamed from: g */
    private boolean f106166g = true;

    /* renamed from: h */
    private boolean f106167h;

    /* renamed from: a */
    public final void mo100334a(FaceStickerBean faceStickerBean, String str) {
    }

    /* renamed from: b */
    public final void mo100338b(FaceStickerBean faceStickerBean, String str) {
    }

    /* renamed from: a */
    public final boolean mo100381a() {
        return this.f106167h;
    }

    /* renamed from: b */
    public final void mo100382b() {
        this.f106167h = true;
        this.f106162c.mo100564a();
    }

    /* renamed from: c */
    public final void mo100383c() {
        this.f106167h = false;
        this.f106162c.mo100567b();
    }

    /* renamed from: b */
    public final void mo100337b(FaceStickerBean faceStickerBean) {
        m130443e(faceStickerBean);
    }

    /* renamed from: c */
    public final void mo100339c(FaceStickerBean faceStickerBean) {
        m130443e(faceStickerBean);
    }

    /* renamed from: f */
    private static boolean m130444f(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == FaceStickerBean.NONE || faceStickerBean.getEffectType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m130443e(FaceStickerBean faceStickerBean) {
        this.f106162c.mo100568c();
        if (faceStickerBean.getStickerId() == 0) {
            this.f106163d = FaceStickerBean.NONE;
        }
        this.f106162c.mo100567b();
    }

    /* renamed from: g */
    private List<Effect> m130445g(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == FaceStickerBean.NONE) {
            return null;
        }
        List<Effect> b = m130441b(faceStickerBean.getChildren());
        this.f106162c.mo101097a(b);
        return b;
    }

    /* renamed from: a */
    private int m130440a(List<Effect> list) {
        if (C6311g.m19573a(list) || this.f106161b == null) {
            return 0;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(((Effect) list.get(i)).getId(), this.f106161b.getId())) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private List<Effect> m130441b(List<String> list) {
        Map map;
        if (list == null) {
            return null;
        }
        if (this.f106160a) {
            map = this.f106164e.mo100233e();
        } else {
            map = this.f106164e.f104785c;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Effect effect = (Effect) map.get(str);
            if (effect != null) {
                arrayList.add(effect);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private boolean m130442d(FaceStickerBean faceStickerBean) {
        if (this.f106163d == null || this.f106163d.getChildren() == null) {
            return false;
        }
        return this.f106163d.getChildren().contains(String.valueOf(faceStickerBean.getStickerId()));
    }

    /* renamed from: a */
    public final void mo100333a(FaceStickerBean faceStickerBean) {
        this.f106162c.mo100568c();
        if (!m130442d(faceStickerBean)) {
            if (!m130444f(faceStickerBean)) {
                this.f106163d = FaceStickerBean.NONE;
                this.f106167h = false;
                this.f106162c.mo100567b();
                return;
            }
            List g = m130445g(faceStickerBean);
            if (this.f106166g) {
                this.f106162c.mo101096a(faceStickerBean, m130440a(g));
                this.f106166g = false;
            } else {
                this.f106162c.mo101096a(faceStickerBean, 0);
            }
            this.f106167h = true;
            this.f106162c.mo100564a();
            C42962b.f111525a.mo104671a("prop_show", C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").mo59973a("tab_name", faceStickerBean.getPropSource()).mo59973a("enter_method", "click_banner").mo59973a("creation_id", this.f106165f.f99787w).mo59973a("shoot_way", this.f106165f.f99788x).mo59970a("draft_id", this.f106165f.f99790z).mo59971a("parent_pop_id", faceStickerBean.getStickerId()).mo59973a("prop_index", faceStickerBean.getGradeKey()).f60753a);
            this.f106163d = faceStickerBean;
        }
    }

    public MultiStickerPresenter(AppCompatActivity appCompatActivity, String str, View view, EffectStickerManager effectStickerManager, ShortVideoContext shortVideoContext) {
        C40831e eVar = C40828b.f106176a;
        this.f106164e = effectStickerManager;
        C40829c cVar = new C40829c(appCompatActivity, str, view, eVar, effectStickerManager);
        this.f106162c = cVar;
        appCompatActivity.getLifecycle().mo55a(this);
        this.f106165f = shortVideoContext;
    }
}
