package com.p280ss.android.ugc.aweme.photo.edit.p1452a;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.medialib.image.ImageRenderView.C19741a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29238ba;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29297h;
import com.p280ss.android.ugc.aweme.p1001al.C22488a;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photo.PhotoView;
import com.p280ss.android.ugc.aweme.photo.edit.p1453b.C34750a;
import com.p280ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity;
import com.p280ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39677l;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39677l.C39680a;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photo.edit.a.a */
public final class C34745a implements C19741a, C39680a {

    /* renamed from: a */
    public C34750a f90573a;

    /* renamed from: b */
    public PhotoContext f90574b;

    /* renamed from: c */
    public C29230az f90575c;

    /* renamed from: d */
    private C39677l f90576d;

    /* renamed from: e */
    private boolean f90577e;

    /* renamed from: f */
    private C29238ba f90578f;

    /* renamed from: g */
    private Boolean f90579g = Boolean.valueOf(C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust));

    /* renamed from: h */
    private C29296g f90580h;

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo88192f() {
        this.f90573a.mo88175e();
    }

    /* renamed from: c */
    public final boolean mo88189c() {
        if (this.f90574b.mPhotoFrom == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final int mo88190d() {
        if (this.f90574b == null) {
            return 720;
        }
        return this.f90574b.mWidth;
    }

    /* renamed from: e */
    public final int mo88191e() {
        if (this.f90574b == null) {
            return 1280;
        }
        return this.f90574b.mHeight;
    }

    /* renamed from: g */
    private void m112099g() {
        this.f90576d = new C39677l(this.f90573a.mo88173c(), (Context) this.f90573a, (C0043i) this.f90573a, C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90574b.mFilterIndex));
        this.f90576d.mo98957a(1);
        this.f90576d.f103168b = this;
    }

    /* renamed from: h */
    private JSONObject m112100h() {
        String str = "upload";
        if (this.f90574b.mPhotoFrom == 1) {
            str = "direct_shoot";
        }
        return new C6909j().mo16966a("is_photo", "1").mo16966a("shoot_way", str).mo16966a("position", "mid_page").mo16967a();
    }

    /* renamed from: a */
    public final void mo88182a() {
        C6907h.m21521a((Context) (Activity) this.f90573a, "next", "mid_page", "0", "0", m112100h());
        this.f90573a.mo88174d();
        this.f90573a.mo88170a(this.f90574b.getTmpPhotoPath(C35563c.f93238a), this);
    }

    /* renamed from: b */
    public final void mo88188b() {
        C6907h.m21521a((Context) (Activity) this.f90573a, "add_filter", "mid_page", "0", "0", m112100h());
        if (C6399b.m19946v()) {
            PhotoSetFilterActivity.m112266a((Activity) this.f90573a, this.f90574b, this.f90577e, this.f90573a.mo88172b(), 1);
        } else {
            EffectPhotoSetFilterActivity.m112194a((Activity) this.f90573a, this.f90574b, this.f90577e, this.f90573a.mo88172b(), 1);
        }
    }

    public C34745a(C34750a aVar) {
        this.f90573a = aVar;
    }

    /* renamed from: a */
    public final void mo88186a(PhotoContext photoContext) {
        this.f90574b.mText = photoContext.mText;
        this.f90574b.mExtras = photoContext.mExtras;
        this.f90574b.mIsPrivate = photoContext.mIsPrivate;
        this.f90574b.mPoiId = photoContext.mPoiId;
        this.f90574b.defaultSelectStickerPoi = photoContext.defaultSelectStickerPoi;
    }

    /* renamed from: b */
    private void m112098b(C29296g gVar) {
        if (this.f90580h != null) {
            C6907h.m21524a("adjust_filter_complete", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("creation_id", this.f90574b.creationId).mo59973a("shoot_way", this.f90574b.mShootWay).mo59970a("draft_id", this.f90574b.draftId).mo59970a("filter_id", this.f90580h.f77266a).mo59973a("filter_name", this.f90580h.f77267b).mo59972a("value", (Object) Float.valueOf(C29297h.m96116a(this.f90580h, this.f90575c, this.f90578f))).f60753a);
        }
        this.f90580h = gVar;
    }

    /* renamed from: a */
    public final void mo88183a(Intent intent) {
        this.f90574b = (PhotoContext) intent.getSerializableExtra("photo_model");
        this.f90573a.mo88171a(true);
        this.f90573a.mo88172b().mo88157a((C0043i) this.f90573a, this.f90574b);
        m112099g();
        PhotoView b = this.f90573a.mo88172b();
        b.getClass();
        this.f90578f = C34747b.m112113a(b);
        this.f90577e = true;
    }

    /* renamed from: a */
    public final void mo88184a(C29296g gVar) {
        String str;
        this.f90577e = false;
        this.f90574b.mFilterName = gVar.f77268c;
        this.f90574b.mFilterId = gVar.f77266a;
        this.f90574b.mFilterIndex = gVar.f77270e;
        if (this.f90579g.booleanValue()) {
            this.f90574b.mFilterRate = C29297h.m96116a(gVar, this.f90575c, this.f90578f);
        }
        this.f90573a.mo88172b().mo88158a(this.f90574b);
        C6907h.onEvent(MobClick.obtain().setEventName("filter_slide").setLabelName("slide").setJsonObject(m112100h()));
        EffectCategoryResponse b = C35563c.m114837d().mo74825b(gVar);
        if (b == null) {
            str = "";
        } else {
            str = b.name;
        }
        C6907h.m21524a("select_filter", (Map) C22984d.m75611a().mo59973a("creation_id", this.f90574b.creationId).mo59973a("shoot_way", this.f90574b.mShootWay).mo59970a("draft_id", this.f90574b.draftId).mo59973a("enter_method", "slide").mo59973a("enter_from", "video_shoot_page").mo59973a("filter_name", gVar.f77268c).mo59970a("filter_id", gVar.f77266a).mo59973a("tab_name", str).f60753a);
        m112098b(gVar);
    }

    /* renamed from: a */
    public final void mo52500a(boolean z) {
        C6726a.m20844b(new C34748c(this));
        C42311e.m134571a(C40005j.m127913b(this.f90574b), C40005j.m127908a(this.f90574b), Scene.EDIT, Scene.PUBLISH);
        if (z) {
            C22488a.m74376a().mo59048a((Activity) this.f90573a, this.f90574b, 1);
        } else {
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    if (C34745a.this.f90573a != null) {
                        C10761a.m31392b((Context) (Activity) C34745a.this.f90573a, (int) R.string.bst, 0).mo25750a();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo88187a(PhotoContext photoContext, int i) {
        this.f90574b = photoContext;
        C29296g a = C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f90574b.mFilterIndex);
        this.f90576d.mo98959a(a, false);
        this.f90574b.mFilterId = a.f77266a;
        this.f90574b.mFilterName = a.f77268c;
        this.f90574b.defaultSelectStickerPoi = photoContext.defaultSelectStickerPoi;
        if (this.f90577e && i == 1) {
            this.f90577e = false;
        }
        if (!this.f90577e) {
            this.f90573a.mo88172b().mo88158a(photoContext);
        }
    }

    /* renamed from: a */
    public final void mo88185a(C29296g gVar, C29296g gVar2, float f) {
        if (this.f90579g.booleanValue()) {
            this.f90573a.mo88172b().mo52492a(gVar.mo74978b(), gVar2.mo74978b(), f, C29297h.m96116a(gVar, this.f90575c, this.f90578f), C29297h.m96116a(gVar2, this.f90575c, this.f90578f));
            return;
        }
        this.f90573a.mo88172b().mo52491a(gVar.mo74978b(), gVar2.mo74978b(), f);
    }
}
