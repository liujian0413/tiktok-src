package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.ViewStubCompat;
import com.google.common.base.C17457s;
import com.p280ss.android.chooser.C19256e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.SafeHandler;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.mediachoose.C33176h;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40491bc;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40832n;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40934t;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40426a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.adapter.C40436a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40429b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1597c.C40451a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1597c.C40452b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1598d.C40457c;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.BackgroundVideoStickerPresenter */
public final class BackgroundVideoStickerPresenter extends C40436a implements C0042h, C33176h, C40934t {

    /* renamed from: c */
    public static final C40404a f105014c = new C40404a(null);

    /* renamed from: a */
    public int f105015a;

    /* renamed from: b */
    public final AppCompatActivity f105016b;

    /* renamed from: d */
    private String f105017d = "";

    /* renamed from: e */
    private final C40457c f105018e;

    /* renamed from: f */
    private boolean f105019f;

    /* renamed from: g */
    private final SafeHandler f105020g = new SafeHandler(this.f105016b);

    /* renamed from: h */
    private FaceStickerBean f105021h;

    /* renamed from: i */
    private ShortVideoContext f105022i;

    /* renamed from: j */
    private C40451a f105023j;

    /* renamed from: k */
    private final List<String> f105024k = new ArrayList();

    /* renamed from: l */
    private final String f105025l;

    /* renamed from: m */
    private final C17457s<C40832n> f105026m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.BackgroundVideoStickerPresenter$a */
    public static final class C40404a {
        private C40404a() {
        }

        public /* synthetic */ C40404a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m129197a(FaceStickerBean faceStickerBean) {
            C7573i.m23587b(faceStickerBean, "bean");
            String sdkExtra = faceStickerBean.getSdkExtra();
            if (sdkExtra != null) {
                try {
                    return new JSONObject(sdkExtra).optJSONObject("vl").optString("imgK");
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.BackgroundVideoStickerPresenter$b */
    static final class C40405b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ BackgroundVideoStickerPresenter f105028a;

        /* renamed from: b */
        final /* synthetic */ String f105029b;

        C40405b(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, String str) {
            this.f105028a = backgroundVideoStickerPresenter;
            this.f105029b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129198a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129198a() {
            Intent intent = new Intent();
            intent.putExtra("file_path", this.f105029b);
            intent.putExtra("from_background_video", true);
            intent.putExtra("background_video_max_length", this.f105028a.mo100412e());
            ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivityForResult(this.f105028a.f105016b, intent, C40426a.m129283c());
        }
    }

    /* renamed from: a */
    public final boolean mo100381a() {
        return this.f105019f;
    }

    /* renamed from: g */
    private final void m129180g() {
        this.f105018e.mo100501d();
        mo100383c();
    }

    /* renamed from: c */
    public final void mo100383c() {
        this.f105019f = false;
        this.f105018e.mo100500c();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        ((C40832n) this.f105026m.mo44946a()).mo100420b();
    }

    /* renamed from: b */
    public final void mo100382b() {
        this.f105019f = true;
        this.f105018e.mo100499b();
        if (true ^ this.f105024k.isEmpty()) {
            this.f105018e.mo100493a(0);
        }
    }

    /* renamed from: e */
    public final long mo100412e() {
        ShortVideoContext shortVideoContext = this.f105022i;
        if (shortVideoContext == null || !shortVideoContext.f99745af) {
            return C40413c.f105051b;
        }
        return C35574k.m114859a().mo70091f().mo93344c(Property.LongVideoThreshold);
    }

    /* renamed from: f */
    private final void m129179f() {
        mo100382b();
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
        ((IAVService) service).getMediaChooseService().mo84896a(4, 100, 0, this);
    }

    /* renamed from: d */
    public final void mo100411d() {
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 4);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", 1);
        bundle.putInt("key_support_flag", 4);
        bundle.putParcelable("key_short_video_context", this.f105022i);
        C40491bc.m129422a().mo59052a(this.f105016b, bundle, C40426a.m129283c(), C40426a.m129283c());
    }

    /* renamed from: h */
    private final C22984d m129181h() {
        String str;
        String str2;
        Object obj;
        String str3;
        C22984d a = C22984d.m75611a();
        String str4 = "creation_id";
        if (this.f105022i == null) {
            str = "";
        } else {
            ShortVideoContext shortVideoContext = this.f105022i;
            if (shortVideoContext == null) {
                C7573i.m23580a();
            }
            str = shortVideoContext.f99787w;
        }
        C22984d a2 = a.mo59973a(str4, str).mo59973a("enter_from", "video_shoot_page").mo59973a("video_source", "upload");
        String str5 = "tab_name";
        if (this.f105021h == null) {
            str2 = "";
        } else {
            FaceStickerBean faceStickerBean = this.f105021h;
            if (faceStickerBean == null) {
                C7573i.m23580a();
            }
            str2 = faceStickerBean.getPropSource();
        }
        C22984d a3 = a2.mo59973a(str5, str2);
        String str6 = "prop_id";
        if (this.f105021h == null) {
            obj = "";
        } else {
            FaceStickerBean faceStickerBean2 = this.f105021h;
            if (faceStickerBean2 == null) {
                C7573i.m23580a();
            }
            obj = Long.valueOf(faceStickerBean2.getStickerId());
        }
        C22984d a4 = a3.mo59972a(str6, obj);
        String str7 = "shoot_way";
        if (this.f105022i == null) {
            str3 = "";
        } else {
            ShortVideoContext shortVideoContext2 = this.f105022i;
            if (shortVideoContext2 == null) {
                C7573i.m23580a();
            }
            str3 = shortVideoContext2.f99788x;
        }
        a4.mo59973a(str7, str3);
        switch (this.f105015a) {
            case 0:
                a.mo59973a("click_content", "video");
                break;
            case 1:
                a.mo59973a("click_content", "album");
                break;
        }
        C7573i.m23582a((Object) a, "eventMapBuilder");
        return a;
    }

    /* renamed from: a */
    public final void mo100407a(ShortVideoContext shortVideoContext) {
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        this.f105022i = shortVideoContext;
    }

    /* renamed from: a */
    public final void mo100408a(C40451a aVar) {
        C7573i.m23587b(aVar, "pixaloopListener");
        this.f105023j = aVar;
    }

    /* renamed from: d */
    private final boolean m129178d(FaceStickerBean faceStickerBean) {
        if (this.f105021h != null) {
            FaceStickerBean faceStickerBean2 = this.f105021h;
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
    public final void mo100333a(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
        if (!C40496bh.m129438a(faceStickerBean) || m129178d(faceStickerBean)) {
            this.f105021h = null;
            ((C40832n) this.f105026m.mo44946a()).mo100422c();
            m129180g();
            return;
        }
        this.f105021h = faceStickerBean;
        m129179f();
    }

    /* renamed from: b */
    public final void mo100337b(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceSticker");
        this.f105021h = null;
        ((C40832n) this.f105026m.mo44946a()).mo100422c();
        m129180g();
    }

    /* renamed from: a */
    public final void mo100409a(String str) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoLegalCheckerAndToastService(this.f105016b).isVideoLengthOrTypeSupportedAndShowErrToast(str, true, 3600000, new C40405b(this, str));
    }

    /* renamed from: a */
    public final void mo100410a(boolean z) {
        Object obj;
        C22984d h = m129181h();
        if (z) {
            String str = "draft_id";
            if (this.f105022i == null) {
                obj = "";
            } else {
                ShortVideoContext shortVideoContext = this.f105022i;
                if (shortVideoContext == null) {
                    C7573i.m23580a();
                }
                obj = Integer.valueOf(shortVideoContext.f99790z);
            }
            h.mo59972a(str, obj);
            C6907h.m21524a("prop_customized_click", (Map) h.f60753a);
            return;
        }
        C6907h.m21524a("prop_customized_complete", (Map) h.f60753a);
        this.f105015a = 0;
    }

    /* renamed from: a */
    public final void mo100406a(int i, int i2, Intent intent) {
        if (i == C40426a.m129283c()) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("videoPath");
                String stringExtra2 = intent.getStringExtra("audioPath");
                C40832n nVar = (C40832n) this.f105026m.mo44946a();
                C7573i.m23582a((Object) stringExtra, "videoPath");
                C7573i.m23582a((Object) stringExtra2, "audioPath");
                nVar.mo100419a(stringExtra, stringExtra2);
                String stringExtra3 = intent.getStringExtra("videoOriginPath");
                C7573i.m23582a((Object) stringExtra3, "it.getStringExtra(\"videoOriginPath\")");
                this.f105017d = stringExtra3;
                C40451a aVar = this.f105023j;
                if (aVar != null) {
                    aVar.mo100487a(stringExtra);
                }
            }
            ((C40832n) this.f105026m.mo44946a()).mo100416a();
            if (this.f105024k.contains(this.f105017d)) {
                this.f105018e.mo100496a(this.f105017d);
            } else {
                this.f105018e.mo100501d();
            }
            mo100410a(false);
        }
    }

    /* renamed from: a */
    public final void mo84918a(boolean z, int i, List<MediaModel> list) {
        List list2;
        this.f105024k.clear();
        if (z) {
            if (list != null) {
                Iterable<MediaModel> iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (MediaModel mediaModel : iterable) {
                    List<String> list3 = this.f105024k;
                    String str = mediaModel.f88156b;
                    C7573i.m23582a((Object) str, "mediaModel.filePath");
                    list3.add(str);
                    String str2 = mediaModel.f88156b;
                    C7573i.m23582a((Object) str2, "mediaModel.filePath");
                    C40429b bVar = new C40429b(str2, mediaModel.f88159e);
                    bVar.f105110i = 2;
                    arrayList.add(bVar);
                }
                list2 = (List) arrayList;
            } else {
                list2 = C7525m.m23461a();
            }
            this.f105018e.mo100504g();
            this.f105018e.mo100497a(list2);
            if (list2.isEmpty()) {
                this.f105018e.mo100502e();
            }
        }
    }

    public BackgroundVideoStickerPresenter(AppCompatActivity appCompatActivity, String str, ViewStubCompat viewStubCompat, C17457s<C40832n> sVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(viewStubCompat, "stub");
        C7573i.m23587b(sVar, "bgvProcessorSupplier");
        this.f105016b = appCompatActivity;
        this.f105025l = str;
        this.f105026m = sVar;
        C19256e.m63106a(this.f105016b.getApplicationContext());
        this.f105016b.getLifecycle().mo55a(this);
        this.f105018e = new C40457c(viewStubCompat, this.f105016b, this.f105025l, new C40452b(this) {

            /* renamed from: a */
            final /* synthetic */ BackgroundVideoStickerPresenter f105027a;

            /* renamed from: a */
            public final void mo100414a() {
                this.f105027a.mo100411d();
                this.f105027a.f105015a = 1;
                this.f105027a.mo100410a(true);
            }

            {
                this.f105027a = r1;
            }

            /* renamed from: a */
            public final void mo100415a(C40429b bVar) {
                if (bVar != null) {
                    String str = bVar.f105102a;
                    if (str != null) {
                        this.f105027a.mo100409a(str);
                        this.f105027a.f105015a = 0;
                        this.f105027a.mo100410a(true);
                    }
                }
            }
        });
    }
}
