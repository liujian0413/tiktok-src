package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40696e.C40697a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40698f.C40699a;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.n */
public final class C40805n implements C40696e {

    /* renamed from: a */
    protected FragmentActivity f106120a;

    /* renamed from: b */
    protected FrameLayout f106121b;

    /* renamed from: c */
    protected VideoPublishEditModel f106122c;

    /* renamed from: d */
    protected C40698f f106123d;

    /* renamed from: e */
    protected C40697a f106124e;

    /* renamed from: f */
    protected C23258e f106125f;

    /* renamed from: g */
    public C23254a f106126g = new C40807o(this);

    /* renamed from: h */
    public boolean f106127h;

    /* renamed from: b */
    public final void mo101079b() {
        if (this.f106123d != null) {
            this.f106123d.mo100803b();
        }
    }

    /* renamed from: c */
    public final void mo101080c() {
        C40815u.m130430a(this.f106120a.getApplication());
        C40815u.m130431a();
    }

    /* renamed from: a */
    public final void mo101076a() {
        String str;
        if (this.f106123d == null) {
            m130407a(this.f106120a).f105747b = this.f106122c;
            this.f106123d = new InfoStickerViewImpl(this.f106120a, this.f106121b, this.f106122c, new C40699a() {
                /* renamed from: a */
                public final void mo100878a() {
                    if (C40805n.this.f106124e != null) {
                        C40805n.this.f106124e.mo100877f();
                    }
                    if (C40805n.this.f106125f != null) {
                        C40805n.this.f106125f.mo60525a(C40805n.this.f106126g);
                    }
                }

                /* renamed from: b */
                public final void mo100880b() {
                    if (C40805n.this.f106124e != null) {
                        C40805n.this.f106124e.bU_();
                    }
                    if (C40805n.this.f106125f != null) {
                        C40805n.this.f106125f.mo60526b(C40805n.this.f106126g);
                    }
                }

                /* renamed from: a */
                public final void mo100879a(Effect effect, String str) {
                    if (C40805n.this.f106124e != null) {
                        C40805n.this.f106124e.mo100875a(effect, str);
                    }
                    if (!C40814t.m130427c(effect)) {
                        C40805n.this.mo101079b();
                    }
                }
            });
            ((InfoStickerViewImpl) this.f106123d).f105728e = this.f106127h;
        }
        C42962b bVar = C42962b.f111525a;
        String str2 = "click_prop_entrance";
        C22984d a = C22984d.m75611a().mo59970a("scene_id", 1002).mo59973a("creation_id", this.f106122c.creationId).mo59973a("shoot_way", this.f106122c.mShootWay).mo59970a("draft_id", this.f106122c.draftId);
        String str3 = "enter_from";
        if (this.f106127h) {
            str = "edit_post_page";
        } else {
            str = "video_edit_page";
        }
        bVar.mo104671a(str2, a.mo59973a(str3, str).mo59973a("content_type", this.f106122c.getAvetParameter().getContentType()).mo59973a("content_source", this.f106122c.getAvetParameter().getContentSource()).f60753a);
        this.f106123d.mo100801a();
    }

    /* renamed from: a */
    public final void mo101077a(C40697a aVar) {
        this.f106124e = aVar;
    }

    /* renamed from: a */
    public static InfoStickerViewModel m130407a(FragmentActivity fragmentActivity) {
        return (InfoStickerViewModel) C0069x.m160a(fragmentActivity, (C0067b) C40815u.m130430a(fragmentActivity.getApplication())).mo147a(InfoStickerViewModel.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo101078a(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        mo101079b();
        return true;
    }

    public C40805n(FragmentActivity fragmentActivity, C23258e eVar, FrameLayout frameLayout, VideoPublishEditModel videoPublishEditModel) {
        this.f106120a = fragmentActivity;
        this.f106125f = eVar;
        this.f106121b = frameLayout;
        this.f106122c = videoPublishEditModel;
        m130407a(fragmentActivity).mo100811a("infostickerv2");
    }
}
