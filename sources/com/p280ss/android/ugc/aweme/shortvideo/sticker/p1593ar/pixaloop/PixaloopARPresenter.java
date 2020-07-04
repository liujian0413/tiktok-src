package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.ViewStubCompat;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40491bc;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40934t;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.MediaRecordPresenterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.adapter.C40436a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40429b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40431c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40431c.C40432a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1597c.C40451a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1597c.C40452b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1597c.C40453c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1598d.C40457c;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter */
public final class PixaloopARPresenter extends C40436a implements C0042h, C40934t {

    /* renamed from: a */
    public FaceStickerBean f105066a = FaceStickerBean.NONE;

    /* renamed from: b */
    public final C40457c f105067b;

    /* renamed from: c */
    public final ArrayList<String> f105068c = new ArrayList<>();

    /* renamed from: d */
    public String f105069d;

    /* renamed from: e */
    public final C40437b f105070e = new C40437b();

    /* renamed from: f */
    public long f105071f = System.currentTimeMillis();

    /* renamed from: g */
    public int f105072g;

    /* renamed from: h */
    private C40429b f105073h = new C40429b();

    /* renamed from: i */
    private boolean f105074i;

    /* renamed from: j */
    private ShortVideoContext f105075j;

    /* renamed from: k */
    private C40451a f105076k;

    /* renamed from: l */
    private boolean f105077l;

    /* renamed from: m */
    private boolean f105078m;

    /* renamed from: n */
    private final AppCompatActivity f105079n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter$a */
    static final class C40423a<T> implements C0053p<C40431c> {

        /* renamed from: a */
        final /* synthetic */ PixaloopARPresenter f105082a;

        C40423a(PixaloopARPresenter pixaloopARPresenter) {
            this.f105082a = pixaloopARPresenter;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C40431c cVar) {
            if (cVar != null) {
                if (cVar.f105114a == C40432a.m129294a()) {
                    this.f105082a.f105071f = System.currentTimeMillis();
                    this.f105082a.f105067b.mo100494a(this.f105082a.f105070e.f105133a);
                    this.f105082a.f105069d = cVar.f105117d;
                    this.f105082a.mo100435a(true);
                }
                if (cVar.f105114a != C40432a.m129295b()) {
                    return;
                }
                if (TextUtils.isEmpty(this.f105082a.f105069d) || C7573i.m23585a((Object) this.f105082a.f105069d, (Object) cVar.f105117d)) {
                    this.f105082a.f105067b.mo100505h();
                    this.f105082a.mo100433a(Long.valueOf(System.currentTimeMillis() - this.f105082a.f105071f));
                    this.f105082a.mo100435a(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter$b */
    static final class C40424b implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PixaloopARPresenter f105083a;

        C40424b(PixaloopARPresenter pixaloopARPresenter) {
            this.f105083a = pixaloopARPresenter;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f105083a.mo100437d();
        }
    }

    /* renamed from: a */
    public final boolean mo100381a() {
        return this.f105077l;
    }

    /* renamed from: c */
    public final void mo100339c(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
    }

    /* renamed from: h */
    private final void m129247h() {
        this.f105077l = false;
        this.f105067b.mo100500c();
        m129248i();
    }

    /* renamed from: b */
    public final void mo100382b() {
        this.f105077l = true;
        this.f105067b.mo100499b();
    }

    /* renamed from: c */
    public final void mo100383c() {
        this.f105077l = false;
        this.f105067b.mo100500c();
    }

    /* renamed from: f */
    public final void mo100439f() {
        this.f105074i = true;
        this.f105067b.mo100502e();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        this.f105067b.mo100505h();
        this.f105067b.mo100501d();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m129248i();
        this.f105068c.clear();
        this.f105070e.mo100464a();
        C40426a.m129278a(false);
        C40426a.m129282b(true);
    }

    /* renamed from: g */
    private final void m129246g() {
        if (C40426a.m129286e()) {
            ((PixaloopMessageModule) C0069x.m159a((FragmentActivity) this.f105079n).mo147a(PixaloopMessageModule.class)).mo100446a().observe(this.f105079n, new C40423a(this));
        }
    }

    /* renamed from: d */
    public final void mo100437d() {
        this.f105077l = true;
        this.f105067b.mo100499b();
        if (C23477d.m77081a((Collection<T>) this.f105068c)) {
            this.f105070e.mo100471b();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f105068c);
        mo100434a((List<String>) arrayList);
    }

    /* renamed from: e */
    public final void mo100438e() {
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 3);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("upload_photo_min_height", 480);
        bundle.putInt("upload_photo_min_width", 360);
        bundle.putInt("key_support_flag", 1);
        C40491bc.m129422a().mo59052a(this.f105079n, bundle, C40426a.m129281b(), C40426a.m129281b());
    }

    /* renamed from: i */
    private final void m129248i() {
        String str;
        String str2;
        C40437b bVar = this.f105070e;
        FaceStickerBean faceStickerBean = this.f105066a;
        if (faceStickerBean == null) {
            C7573i.m23580a();
        }
        bVar.mo100465a(faceStickerBean.getStickerId());
        this.f105070e.mo100472c();
        C40429b bVar2 = this.f105073h;
        if (bVar2 != null) {
            str = bVar2.mo100451c();
        } else {
            str = null;
        }
        if (str != null) {
            C40437b bVar3 = this.f105070e;
            C40429b bVar4 = this.f105073h;
            if (bVar4 != null) {
                str2 = bVar4.mo100451c();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                C7573i.m23580a();
            }
            bVar3.mo100469a(str2, "");
        }
        this.f105074i = false;
        this.f105067b.mo100502e();
        this.f105067b.mo100504g();
        this.f105073h = null;
        ShortVideoContext shortVideoContext = this.f105075j;
        if (shortVideoContext != null) {
            shortVideoContext.f99737aO = 0;
        }
    }

    /* renamed from: j */
    private final void m129249j() {
        if (!C23477d.m77081a((Collection<T>) this.f105068c)) {
            ArrayList arrayList = new ArrayList(this.f105068c.size());
            Iterator it = this.f105068c.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C7573i.m23582a((Object) str, "path");
                arrayList.add(new C40429b(str, "", true));
            }
            this.f105067b.mo100497a((List<C40429b>) arrayList);
        }
    }

    /* renamed from: k */
    private final C22984d m129250k() {
        String str;
        String str2;
        Object obj;
        String str3;
        C22984d a = C22984d.m75611a();
        String str4 = "creation_id";
        if (this.f105075j == null) {
            str = "";
        } else {
            ShortVideoContext shortVideoContext = this.f105075j;
            if (shortVideoContext == null) {
                C7573i.m23580a();
            }
            str = shortVideoContext.f99787w;
        }
        C22984d a2 = a.mo59973a(str4, str).mo59973a("enter_from", "video_shoot_page");
        String str5 = "tab_name";
        if (this.f105066a == null) {
            str2 = "";
        } else {
            FaceStickerBean faceStickerBean = this.f105066a;
            if (faceStickerBean == null) {
                C7573i.m23580a();
            }
            str2 = faceStickerBean.getPropSource();
        }
        C22984d a3 = a2.mo59973a(str5, str2);
        String str6 = "prop_id";
        if (this.f105066a == null) {
            obj = "";
        } else {
            FaceStickerBean faceStickerBean2 = this.f105066a;
            if (faceStickerBean2 == null) {
                C7573i.m23580a();
            }
            obj = Long.valueOf(faceStickerBean2.getStickerId());
        }
        C22984d a4 = a3.mo59972a(str6, obj);
        String str7 = "shoot_way";
        if (this.f105075j == null) {
            str3 = "";
        } else {
            ShortVideoContext shortVideoContext2 = this.f105075j;
            if (shortVideoContext2 == null) {
                C7573i.m23580a();
            }
            str3 = shortVideoContext2.f99788x;
        }
        a4.mo59973a(str7, str3);
        switch (this.f105072g) {
            case 0:
                a.mo59973a("click_content", "click");
                break;
            case 1:
                a.mo59973a("click_content", "album");
                break;
            case 2:
                a.mo59973a("click_content", "photo");
                break;
        }
        if (this.f105078m) {
            ShortVideoContext shortVideoContext3 = this.f105075j;
            if (shortVideoContext3 != null) {
                shortVideoContext3.f99737aO = 1;
            }
            a.mo59973a("picture_source", "upload");
        } else {
            ShortVideoContext shortVideoContext4 = this.f105075j;
            if (shortVideoContext4 != null) {
                shortVideoContext4.f99737aO = 2;
            }
            a.mo59973a("picture_source", "shoot");
        }
        C7573i.m23582a((Object) a, "eventMapBuilder");
        return a;
    }

    /* renamed from: a */
    public final void mo100431a(ShortVideoContext shortVideoContext) {
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        this.f105075j = shortVideoContext;
    }

    /* renamed from: a */
    public final void mo100430a(C20749b bVar) {
        C7573i.m23587b(bVar, "effectController");
        this.f105070e.mo100466a(bVar);
    }

    /* renamed from: e */
    private final boolean m129245e(FaceStickerBean faceStickerBean) {
        if (!(faceStickerBean == null || this.f105066a == null)) {
            FaceStickerBean faceStickerBean2 = this.f105066a;
            if (faceStickerBean2 == null) {
                C7573i.m23580a();
            }
            if (faceStickerBean2.getStickerId() == faceStickerBean.getStickerId()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo100432a(C40451a aVar) {
        C7573i.m23587b(aVar, "pixaloopListener");
        this.f105076k = aVar;
    }

    /* renamed from: b */
    public final void mo100337b(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
        this.f105067b.mo100501d();
        m129247h();
    }

    /* renamed from: a */
    public static boolean m129243a(String str) {
        int[] imageWidthHeight = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().getImageWidthHeight(str);
        int i = imageWidthHeight[0];
        int i2 = imageWidthHeight[1];
        if (i < 360 || i2 < 480) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo100436b(String str) {
        String str2;
        String str3;
        String str4;
        if (C7276d.m22812b(str) && this.f105073h != null) {
            if (this.f105076k != null) {
                C40451a aVar = this.f105076k;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                if (str == null) {
                    str4 = "";
                } else {
                    str4 = str;
                }
                aVar.mo100487a(str4);
            }
            C40437b bVar = this.f105070e;
            C40429b bVar2 = this.f105073h;
            if (bVar2 != null) {
                str2 = bVar2.mo100451c();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            bVar.mo100469a(str2, str3);
            ((MediaRecordPresenterViewModel) C0069x.m159a((FragmentActivity) this.f105079n).mo147a(MediaRecordPresenterViewModel.class)).mo100398b(str);
            this.f105078m = true;
        }
    }

    /* renamed from: d */
    private final void m129244d(FaceStickerBean faceStickerBean) {
        C40426a.m129278a(false);
        if (faceStickerBean != null) {
            if (!C40426a.m129279a(faceStickerBean)) {
                m129247h();
            } else if (C35574k.m114859a().mo70088c().mo90360c(this.f105079n) != 0) {
                C10761a.m31383a((Context) this.f105079n, (int) R.string.ct5).mo25750a();
            } else {
                if (!m129245e(faceStickerBean)) {
                    m129248i();
                }
                if (this.f105073h == null) {
                    this.f105073h = new C40429b();
                }
                C40429b bVar = this.f105073h;
                if (bVar == null) {
                    C7573i.m23580a();
                }
                if (!bVar.mo100449a()) {
                    C40429b bVar2 = this.f105073h;
                    if (bVar2 == null) {
                        C7573i.m23580a();
                    }
                    String sdkExtra = faceStickerBean.getSdkExtra();
                    C7573i.m23582a((Object) sdkExtra, "faceSticker.sdkExtra");
                    bVar2.mo100448a(sdkExtra);
                    C40429b bVar3 = this.f105073h;
                    if (bVar3 == null) {
                        C7573i.m23580a();
                    }
                    Boolean bool = bVar3.f105106e;
                    if (bool == null) {
                        C7573i.m23580a();
                    }
                    C40426a.m129284c(bool.booleanValue());
                    C40429b bVar4 = this.f105073h;
                    if (bVar4 == null) {
                        C7573i.m23580a();
                    }
                    Boolean bool2 = bVar4.f105107f;
                    if (bool2 == null) {
                        C7573i.m23580a();
                    }
                    C40426a.m129282b(bool2.booleanValue());
                }
                C40426a.m129278a(true);
                C40429b bVar5 = this.f105073h;
                if (bVar5 == null) {
                    C7573i.m23580a();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(faceStickerBean.getStickerId()));
                bVar5.f105105d = sb.toString();
                this.f105066a = faceStickerBean;
                if (this.f105075j != null) {
                    String str = "direct_shoot";
                    ShortVideoContext shortVideoContext = this.f105075j;
                    if (shortVideoContext == null) {
                        C7573i.m23580a();
                    }
                    if (C7573i.m23585a((Object) str, (Object) shortVideoContext.f99788x)) {
                        C40457c cVar = this.f105067b;
                        FaceStickerBean faceStickerBean2 = this.f105066a;
                        if (faceStickerBean2 == null) {
                            C7573i.m23580a();
                        }
                        OnDismissListener bVar6 = new C40424b(this);
                        Handler handler = this.f105070e.f105133a;
                        if (handler == null) {
                            C7573i.m23580a();
                        }
                        if (cVar.mo100498a(faceStickerBean2, bVar6, handler)) {
                            this.f105067b.mo100500c();
                        } else {
                            mo100437d();
                        }
                    } else {
                        mo100437d();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100333a(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
        m129244d(faceStickerBean);
    }

    /* renamed from: a */
    public final void mo100433a(Long l) {
        Long l2;
        String str = "pixaloop_loading_time";
        C38510bb a = C38510bb.m123095a().mo96480a("duration", l);
        String str2 = "stickid";
        FaceStickerBean faceStickerBean = this.f105066a;
        if (faceStickerBean != null) {
            l2 = Long.valueOf(faceStickerBean.getStickerId());
        } else {
            l2 = null;
        }
        C6893q.m21444a(str, 0, a.mo96480a(str2, l2).mo96482b());
    }

    /* renamed from: a */
    public final void mo100434a(List<String> list) {
        if (!this.f105074i && !C23477d.m77081a((Collection<T>) list) && this.f105073h != null) {
            C40429b bVar = this.f105073h;
            if (bVar == null) {
                C7573i.m23580a();
            }
            if (C23477d.m77081a((Collection<T>) bVar.mo100450b())) {
                if (this.f105067b.mo100492a() == 0) {
                    m129249j();
                }
                mo100439f();
                return;
            }
            this.f105067b.mo100503f();
            this.f105070e.mo100470a(list, this.f105073h);
        }
    }

    /* renamed from: a */
    public final void mo100435a(boolean z) {
        Object obj;
        C22984d k = m129250k();
        if (z) {
            String str = "draft_id";
            if (this.f105075j == null) {
                obj = "";
            } else {
                ShortVideoContext shortVideoContext = this.f105075j;
                if (shortVideoContext == null) {
                    C7573i.m23580a();
                }
                obj = Integer.valueOf(shortVideoContext.f99790z);
            }
            k.mo59972a(str, obj);
            C6907h.m21524a("prop_customized_click", (Map) k.f60753a);
            return;
        }
        C6907h.m21524a("prop_customized_complete", (Map) k.f60753a);
        this.f105078m = false;
        this.f105072g = 0;
    }

    public PixaloopARPresenter(AppCompatActivity appCompatActivity, ViewStubCompat viewStubCompat, String str) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(viewStubCompat, "stub");
        C7573i.m23587b(str, "panel");
        this.f105079n = appCompatActivity;
        this.f105079n.getLifecycle().mo55a(this);
        this.f105067b = new C40457c(viewStubCompat, this.f105079n, str, new C40452b(this) {

            /* renamed from: a */
            final /* synthetic */ PixaloopARPresenter f105080a;

            /* renamed from: a */
            public final void mo100414a() {
                this.f105080a.f105072g = 1;
                this.f105080a.mo100438e();
            }

            {
                this.f105080a = r1;
            }

            /* renamed from: a */
            public final void mo100415a(C40429b bVar) {
                String str;
                if (bVar != null) {
                    str = bVar.f105102a;
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f105080a.mo100436b(bVar.f105102a);
                    this.f105080a.f105072g = 2;
                }
            }
        });
        this.f105070e.mo100468a((C40453c) new C40453c(this) {

            /* renamed from: a */
            final /* synthetic */ PixaloopARPresenter f105081a;

            {
                this.f105081a = r1;
            }

            /* renamed from: b */
            public final void mo100444b(List<C40429b> list) {
                C7573i.m23587b(list, "dataList");
                this.f105081a.mo100439f();
            }

            /* renamed from: a */
            public final void mo100442a(C40429b bVar) {
                String str;
                if (bVar != null && bVar.f105104c) {
                    if (this.f105081a.f105066a == null) {
                        str = "";
                    } else {
                        FaceStickerBean faceStickerBean = this.f105081a.f105066a;
                        if (faceStickerBean == null) {
                            C7573i.m23580a();
                        }
                        str = String.valueOf(faceStickerBean.getStickerId());
                    }
                    if (!TextUtils.isEmpty(bVar.f105105d) && C7573i.m23585a((Object) bVar.f105105d, (Object) str)) {
                        this.f105081a.f105067b.mo100495a(bVar);
                    }
                }
            }

            /* renamed from: a */
            public final void mo100443a(List<String> list) {
                List list2;
                C7573i.m23587b(list, "imgList");
                Collection collection = list;
                if (!collection.isEmpty()) {
                    if (!(!collection.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        Iterable iterable = list;
                        Collection arrayList = new ArrayList();
                        for (Object next : iterable) {
                            if (PixaloopARPresenter.m129243a((String) next)) {
                                arrayList.add(next);
                            }
                        }
                        list2 = (List) arrayList;
                    } else {
                        list2 = new ArrayList();
                    }
                    this.f105081a.f105068c.addAll(list2);
                    this.f105081a.mo100434a(list2);
                    return;
                }
                this.f105081a.mo100439f();
            }
        });
        m129246g();
    }

    /* renamed from: a */
    public final void mo100406a(int i, int i2, Intent intent) {
        if (i == C40426a.m129281b() && intent != null && i2 == -1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C7573i.m23582a((Object) parcelableArrayListExtra, "selectMediaList");
            if (!parcelableArrayListExtra.isEmpty()) {
                MediaModel mediaModel = (MediaModel) parcelableArrayListExtra.get(0);
                C7573i.m23582a((Object) mediaModel, "mediaModel");
                String str = mediaModel.f88156b;
                mo100436b(str);
                this.f105067b.mo100501d();
                this.f105067b.mo100496a(str);
            }
        }
    }
}
