package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.ViewStubCompat;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.medialib.C19722g;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.model.Face;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40934t;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41019y.C41020a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1594a.C40401a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectFaceViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.vesdk.C45382z.C45404o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.FaceMattingPresenter */
public class FaceMattingPresenter implements C0042h, C40934t, C41020a {

    /* renamed from: a */
    public C40419c f104988a;

    /* renamed from: b */
    public FaceStickerBean f104989b = FaceStickerBean.NONE;

    /* renamed from: c */
    public Face f104990c;

    /* renamed from: d */
    public List<Face> f104991d = new LinkedList();

    /* renamed from: e */
    private AppCompatActivity f104992e;

    /* renamed from: f */
    private boolean f104993f;

    /* renamed from: g */
    private boolean f104994g;

    /* renamed from: h */
    private boolean f104995h;

    /* renamed from: i */
    private boolean f104996i;

    /* renamed from: j */
    private C45404o f104997j = new C40400a(this);

    /* renamed from: a */
    public final void mo100334a(FaceStickerBean faceStickerBean, String str) {
    }

    /* renamed from: b */
    public final void mo100338b(FaceStickerBean faceStickerBean, String str) {
    }

    /* renamed from: c */
    public final void mo100339c(FaceStickerBean faceStickerBean) {
    }

    /* renamed from: e */
    public final void mo100385e() {
        this.f104994g = false;
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
    }

    /* renamed from: a */
    public final boolean mo100381a() {
        return this.f104996i;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f104988a.mo100405e();
    }

    /* renamed from: k */
    private EffectFaceViewModel m129143k() {
        return (EffectFaceViewModel) C0069x.m159a((FragmentActivity) this.f104992e).mo147a(EffectFaceViewModel.class);
    }

    /* renamed from: b */
    public final void mo100382b() {
        this.f104996i = true;
        this.f104988a.mo100400a();
    }

    /* renamed from: c */
    public final void mo100383c() {
        this.f104996i = false;
        this.f104988a.mo100402b();
    }

    /* renamed from: f */
    public final void mo100386f() {
        this.f104988a.mo100401a(new ArrayList(this.f104991d));
    }

    /* renamed from: g */
    public final MediaRecordPresenterViewModel mo100387g() {
        return (MediaRecordPresenterViewModel) C0069x.m159a((FragmentActivity) this.f104992e).mo147a(MediaRecordPresenterViewModel.class);
    }

    /* renamed from: h */
    public final void mo100388h() {
        mo100387g().f105003a.mo56061a(this.f104997j);
        mo100387g().f105003a.mo56036a((Bitmap) null);
    }

    /* renamed from: j */
    private void m129142j() {
        if (C35574k.m114859a().mo70088c().mo90360c(this.f104992e) == 0) {
            m129143k().mo101278b();
            return;
        }
        C35574k.m114859a().mo70088c().mo90356a(this.f104992e, new C40402b(this), "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: d */
    public final void mo100384d() {
        this.f104994g = true;
        if (m129140d(this.f104989b) && !this.f104991d.isEmpty()) {
            this.f104988a.mo100400a();
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        if (this.f104990c != null) {
            mo100387g().f105003a.mo56086b(this.f104997j);
        }
        if (this.f104995h && this.f104989b != FaceStickerBean.NONE) {
            this.f104988a.mo100400a();
            m129142j();
        }
    }

    /* renamed from: i */
    private void m129141i() {
        if (!this.f104995h) {
            m129143k().mo101277a().observe(this.f104992e, new C0053p<List<Face>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(List<Face> list) {
                    if (list != null && !list.isEmpty()) {
                        FaceMattingPresenter.this.f104991d.addAll(list);
                        FaceMattingPresenter.this.mo100386f();
                    }
                }
            });
            m129143k().mo101279c().observe(this.f104992e, new C0053p<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(Boolean bool) {
                    if (!bool.booleanValue()) {
                        FaceMattingPresenter.this.f104988a.mo100403c();
                    }
                }
            });
            m129143k().mo101280d().observe(this.f104992e, new C0053p<List<Face>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(List<Face> list) {
                    if (list != null && !list.isEmpty()) {
                        for (Face remove : list) {
                            FaceMattingPresenter.this.f104991d.remove(remove);
                        }
                        FaceMattingPresenter.this.mo100386f();
                    }
                }
            });
            mo100387g().mo100394a().observe(this.f104992e, new C0053p<Bitmap>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(Bitmap bitmap) {
                    FaceMattingPresenter.this.mo100387g().f105003a.mo56036a(bitmap);
                }
            });
            this.f104995h = true;
        }
    }

    /* renamed from: d */
    public static boolean m129140d(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == FaceStickerBean.NONE || !faceStickerBean.getTypes().contains("AR") || !faceStickerBean.getTypes().contains("PhotoFace")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo100333a(FaceStickerBean faceStickerBean) {
        this.f104988a.mo100404d();
        if (!m129140d(faceStickerBean)) {
            this.f104989b = FaceStickerBean.NONE;
            this.f104996i = false;
            this.f104988a.mo100402b();
            this.f104990c = null;
            return;
        }
        m129141i();
        if (!this.f104993f) {
            m129142j();
        }
        if (this.f104994g) {
            this.f104996i = true;
            this.f104988a.mo100400a();
        }
        this.f104989b = faceStickerBean;
    }

    /* renamed from: b */
    public final void mo100337b(FaceStickerBean faceStickerBean) {
        this.f104988a.mo100404d();
        if (faceStickerBean.getStickerId() == 0 || faceStickerBean.equals(this.f104989b)) {
            this.f104989b = FaceStickerBean.NONE;
        }
        mo100388h();
        this.f104988a.mo100402b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100379a(boolean z) {
        if (z && this.f104990c != null && C19722g.m65025a(this.f104990c.path) && C19722g.m65025a(this.f104990c.origin_path)) {
            mo100387g().mo100396a(this.f104990c.path);
        }
    }

    public FaceMattingPresenter(AppCompatActivity appCompatActivity, ViewStubCompat viewStubCompat) {
        this.f104988a = new C40401a(viewStubCompat, new C40420d() {
            /* renamed from: a */
            public final void mo100392a() {
                FaceMattingPresenter.this.mo100388h();
                FaceMattingPresenter.this.f104990c = null;
                FaceMattingPresenter.this.mo100387g().mo100397b();
            }

            /* renamed from: a */
            public final void mo100393a(Face face) {
                FaceMattingPresenter.this.mo100387g().mo100396a(face.path);
                FaceMattingPresenter.this.f104990c = face;
                C6907h.m21524a("click_prop_pic", (Map) C22984d.m75611a().mo59973a("prop_id", String.valueOf(FaceMattingPresenter.this.f104989b.getStickerId())).f60753a);
                FaceMattingPresenter.this.mo100387g().mo100398b(face.path);
            }
        });
        this.f104992e = appCompatActivity;
        appCompatActivity.getLifecycle().mo55a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100380a(String[] strArr, int[] iArr) {
        if (this.f104992e != null && !this.f104992e.isFinishing()) {
            if (iArr[0] == 0) {
                m129143k().mo101278b();
            } else {
                C9738o.m28693a((Context) this.f104992e, (int) R.string.ct5);
            }
        }
    }
}
