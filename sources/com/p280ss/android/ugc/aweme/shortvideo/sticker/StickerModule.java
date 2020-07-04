package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import bolts.C1592h;
import com.alibaba.fastjson.JSON;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.google.common.base.C17457s;
import com.google.gson.stream.C6718a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23321d;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27416b;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.game.C39934k;
import com.p280ss.android.ugc.aweme.shortvideo.game.GameResultViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.LandmarkARPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.senor.ARSenorPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.ARTextResultModule;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.C38489m;
import com.p280ss.android.ugc.aweme.shortvideo.scanface.C40322a;
import com.p280ss.android.ugc.aweme.shortvideo.scanface.C40323b;
import com.p280ss.android.ugc.aweme.shortvideo.scanface.ScanFaceViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.senor.ISenorPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.senor.defult.DefaultSenorPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w.C40995a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w.C40996b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w.C40997c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w.C40998d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41019y.C41020a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.FaceMattingPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.MediaRecordPresenterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.PixaloopMessageModule;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40431c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40504a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40505b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40506c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40507d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40508e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40517g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1604f.C40568a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1604f.C40569b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.C40900a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.C40901b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.C40909a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.StickerFetchViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.p1635c.C41848a;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.aweme.utils.C43055dg;
import com.p280ss.android.ugc.aweme.utils.C43058dj;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43758h;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43764n;
import com.p280ss.android.vesdk.C45336r;
import com.p280ss.android.vesdk.C45382z.C45404o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule */
public class StickerModule implements C0042h, C40994w {

    /* renamed from: A */
    private long f104831A;

    /* renamed from: B */
    private EffectPlatform f104832B;

    /* renamed from: C */
    private boolean f104833C = true;

    /* renamed from: D */
    private List<Effect> f104834D;

    /* renamed from: E */
    private boolean f104835E;

    /* renamed from: F */
    private Effect f104836F;

    /* renamed from: G */
    private Effect f104837G;

    /* renamed from: H */
    private C39934k f104838H;

    /* renamed from: I */
    private C17457s<C40832n> f104839I;

    /* renamed from: J */
    private C40996b f104840J;

    /* renamed from: K */
    private C40995a f104841K;

    /* renamed from: L */
    private C40378ah f104842L;

    /* renamed from: M */
    private C42320g f104843M;

    /* renamed from: N */
    private String f104844N;

    /* renamed from: O */
    private FaceStickerViewModel f104845O;

    /* renamed from: P */
    private C0043i f104846P;

    /* renamed from: Q */
    private int f104847Q;

    /* renamed from: R */
    private Random f104848R;

    /* renamed from: S */
    private boolean f104849S;

    /* renamed from: T */
    private FrameLayout f104850T;

    /* renamed from: U */
    private StickerWrapper f104851U;

    /* renamed from: V */
    private String f104852V;

    /* renamed from: W */
    private ArrayList<StickerWrapper> f104853W;

    /* renamed from: X */
    private C1944a f104854X;

    /* renamed from: Y */
    private C45404o f104855Y = new C45404o() {
        /* renamed from: a */
        public final void mo56377a(boolean z) {
            if (z && !(StickerModule.this.f104867j instanceof ARSenorPresenter)) {
                if (StickerModule.this.f104867j != null) {
                    StickerModule.this.f104867j.unRegister();
                }
                StickerModule stickerModule = StickerModule.this;
                ARSenorPresenter aRSenorPresenter = new ARSenorPresenter(StickerModule.this.f104857a, StickerModule.this.f104857a, StickerModule.this.f104862e, StickerModule.this.f104861d, StickerModule.this.f104869l);
                stickerModule.f104867j = aRSenorPresenter;
                StickerModule.this.f104867j.mo96375b();
            }
        }
    };

    /* renamed from: Z */
    private C45336r f104856Z = new C45336r() {
        /* renamed from: a */
        public final void mo56380a(boolean z, boolean z2) {
            if (z && !(StickerModule.this.f104867j instanceof LandmarkARPresenter)) {
                if (StickerModule.this.f104867j != null) {
                    StickerModule.this.f104867j.unRegister();
                }
                StickerModule stickerModule = StickerModule.this;
                LandmarkARPresenter landmarkARPresenter = new LandmarkARPresenter(StickerModule.this.f104857a, StickerModule.this.f104857a, StickerModule.this.f104860c, StickerModule.this.f104862e, StickerModule.this.f104869l, z2);
                stickerModule.f104867j = landmarkARPresenter;
                StickerModule.this.f104867j.mo96375b();
            }
        }
    };

    /* renamed from: a */
    public final AbsActivity f104857a;

    /* renamed from: aa */
    private AVChallenge f104858aa;

    /* renamed from: b */
    public final C23258e f104859b;

    /* renamed from: c */
    public final C20676a f104860c;

    /* renamed from: d */
    public final C20749b f104861d;

    /* renamed from: e */
    public final C20707b f104862e;

    /* renamed from: f */
    public List<C40998d> f104863f = new ArrayList();

    /* renamed from: g */
    public final C23321d<JSONObject> f104864g;

    /* renamed from: h */
    public FaceStickerBean f104865h;

    /* renamed from: i */
    public C41018x f104866i;

    /* renamed from: j */
    public ISenorPresenter f104867j;

    /* renamed from: k */
    public IStickerGuidePresenter f104868k;

    /* renamed from: l */
    public boolean f104869l;

    /* renamed from: m */
    public Handler f104870m;

    /* renamed from: n */
    public ShortVideoContext f104871n;

    /* renamed from: o */
    public C40323b f104872o;

    /* renamed from: p */
    public StickerWrapper f104873p;

    /* renamed from: q */
    public Map<String, List<StickerWrapper>> f104874q = new HashMap();

    /* renamed from: r */
    public List<StickerWrapper> f104875r;

    /* renamed from: s */
    public int f104876s = -1;

    /* renamed from: t */
    public String f104877t;

    /* renamed from: u */
    public boolean f104878u;

    /* renamed from: v */
    public String f104879v = "add";

    /* renamed from: w */
    public C23254a f104880w = new C23254a() {
        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4 || StickerModule.this.f104866i == null || !StickerModule.this.f104866i.mo100701e() || StickerModule.this.f104868k == null) {
                return false;
            }
            StickerModule.this.f104866i.mo100700d();
            StickerModule.this.f104868k.hide();
            return true;
        }
    };

    /* renamed from: x */
    private String[] f104881x;

    /* renamed from: y */
    private final C40997c f104882y;

    /* renamed from: z */
    private OnClickListener f104883z;

    /* renamed from: b */
    public final FaceStickerBean mo100301b() {
        return this.f104865h;
    }

    /* renamed from: d */
    public final AVChallenge mo100309d() {
        return this.f104858aa;
    }

    /* renamed from: k */
    public final C39934k mo100319k() {
        return this.f104838H;
    }

    /* renamed from: a */
    public final void mo100280a(C40998d dVar) {
        this.f104863f.add(dVar);
    }

    /* renamed from: a */
    public final void mo100277a(StickerWrapper stickerWrapper) {
        Effect effect = stickerWrapper.f104908a;
        if (effect != null) {
            if (mo100322n() || this.f104879v == null || this.f104879v.equals(effect.getEffectId())) {
                this.f104851U = stickerWrapper;
                for (String str : effect.getComposerPath()) {
                    StringBuilder sb = new StringBuilder("memoji: current Effect composer Path");
                    sb.append(str);
                    C41530am.m132280a(sb.toString());
                    if (!C38527bf.m123172a(str)) {
                        StringBuilder sb2 = new StringBuilder("memoji: current path not exist: ");
                        sb2.append(str);
                        C41530am.m132283b(sb2.toString());
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (this.f104865h != null) {
                    for (String composerInfo : effect.getComposerPath()) {
                        arrayList.add(new ComposerInfo(composerInfo, this.f104865h.getExtra()));
                    }
                }
                m128952b((List<ComposerInfo>) arrayList);
                String extra = effect.getExtra();
                if (extra == null) {
                    extra = "";
                }
                this.f104861d.mo56064a("MemojiMatchScanResult", extra);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100291a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            m128956e(m128966v().mo101285a().mo101193b());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100292a(Double d) {
        if (this.f104871n.f99782r != null && d != null && this.f104839I != null) {
            ((C40832n) this.f104839I.mo44946a()).mo100418a(d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100272a(LiveDataWrapper liveDataWrapper) {
        if (liveDataWrapper != null && liveDataWrapper.f88768b == STATUS.SUCCESS) {
            CategoryEffectModel categoryEffectModel = ((PanelInfoModel) liveDataWrapper.f88767a).category_effects;
            if (this.f104833C && m128950a(categoryEffectModel)) {
                this.f104840J.mo101315a(C40376ag.m129118a(categoryEffectModel.effects, this.f104842L));
            }
            if (this.f104836F == null && categoryEffectModel != null) {
                this.f104836F = C40376ag.m129118a(categoryEffectModel.effects, this.f104842L);
            }
            if (this.f104840J != null) {
                this.f104840J.mo101317b(this.f104836F);
            }
            m128958f(this.f104836F);
        }
    }

    /* renamed from: a */
    public final void mo100274a(C39934k kVar) {
        this.f104838H = kVar;
    }

    /* renamed from: a */
    public final void mo100281a(C41018x xVar) {
        if (this.f104866i != null) {
            this.f104866i.mo100681a((C20749b) null);
            this.f104866i.mo100680a(null);
            this.f104866i.mo100685a((C40369ab) null);
            this.f104866i.mo100684a((C40368aa) null);
        }
        this.f104866i = xVar;
        if (this.f104866i != null) {
            this.f104866i.mo100678a(this.f104883z);
            this.f104866i.mo100680a(this.f104839I);
            this.f104866i.mo100681a(this.f104861d);
            this.f104866i.mo100682a(this.f104871n);
            this.f104866i.mo100677a(this.f104857a, this.f104834D, this.f104835E, this.f104844N);
            this.f104866i.mo100685a((C40369ab) new C40369ab() {
                /* renamed from: a */
                public final void mo100344a() {
                    StickerModule.this.f104876s = -1;
                    StickerModule.this.f104879v = "add";
                    StickerModule.this.mo100323o();
                }

                /* renamed from: a */
                public final void mo100345a(int i) {
                    StickerModule.this.f104876s = i;
                    StickerModule.this.f104879v = "modify";
                    StickerModule.this.mo100323o();
                }
            });
            this.f104866i.mo100684a((C40368aa) new C40368aa() {
                /* renamed from: a */
                public final void mo100346a(StickerWrapper stickerWrapper) {
                    StickerModule.this.mo100277a(stickerWrapper);
                }

                /* renamed from: a */
                public final void mo100347a(final StickerWrapper stickerWrapper, ResourceListModel resourceListModel, int i, final C40906q qVar) {
                    StickerModule.this.f104876s = i;
                    StickerModule.this.f104879v = stickerWrapper.f104908a.getEffectId();
                    if (StickerModule.this.f104865h != null) {
                        C40569b.m129696a(StickerModule.this.f104865h.getId(), stickerWrapper.f104908a, StickerModule.this.f104875r, i, resourceListModel, (C40900a) new C40901b() {
                            /* renamed from: a */
                            public final void mo100342a(String str, List<StickerWrapper> list, StickerWrapper stickerWrapper, Exception exc) {
                                boolean z;
                                if (StickerModule.this.mo100322n() || StickerModule.this.f104879v == null || !StickerModule.this.f104879v.equals(stickerWrapper.f104908a.getEffectId())) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (stickerWrapper != null) {
                                    qVar.mo101178a(str, stickerWrapper, z);
                                } else {
                                    qVar.mo101177a(exc);
                                }
                                StickerModule.this.f104879v = null;
                            }
                        });
                    }
                }
            });
            m128965u();
        }
    }

    /* renamed from: a */
    public final void mo100279a(C40996b bVar) {
        this.f104840J = bVar;
    }

    /* renamed from: a */
    public final void mo100275a(IStickerGuidePresenter iStickerGuidePresenter) {
        this.f104868k = iStickerGuidePresenter;
    }

    /* renamed from: a */
    public final void mo100276a(IStickerTabGuidePresenter<C0902i<EffectCategoryModel, Object>> iStickerTabGuidePresenter) {
        if (this.f104866i != null) {
            this.f104866i.mo100683a(iStickerTabGuidePresenter);
        }
    }

    /* renamed from: a */
    public final void mo100278a(C40995a aVar) {
        this.f104841K = aVar;
    }

    /* renamed from: a */
    public final void mo100290a(ResourceListModel resourceListModel) {
        final FaceStickerBean b = mo100301b();
        if (b != null && String.valueOf(b.getStickerId()).equals(this.f104877t)) {
            final String id = b.getId();
            final String a = C40517g.m129524a(id);
            File file = new File(a);
            if (!file.exists()) {
                file.mkdirs();
            }
            List a2 = C40496bh.m129430a(a, resourceListModel);
            C40507d dVar = new C40507d();
            final ResourceListModel resourceListModel2 = resourceListModel;
            final List list = a2;
            C403577 r0 = new C40505b<C40506c, Void>() {

                /* renamed from: a */
                long f104899a;

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo100349a(Object obj) {
                    m129058a((Void) null);
                }

                /* renamed from: a */
                private void m129058a(Void voidR) {
                    if (StickerModule.this.f104865h != null && String.valueOf(StickerModule.this.f104865h.getStickerId()).equals(StickerModule.this.f104877t)) {
                        Effect a = C40517g.m129521a(resourceListModel2, list);
                        StickerModule.this.f104873p = StickerWrapper.m129065a(a, true);
                        if (StickerModule.this.f104875r == null) {
                            StickerModule.this.f104875r = new ArrayList();
                        }
                        if (StickerModule.this.f104876s != -1) {
                            C40517g.m129526a(StickerModule.this.f104876s, StickerModule.this.f104873p, StickerModule.this.f104875r, a);
                        } else {
                            StickerModule.this.f104875r.add(StickerModule.this.f104873p);
                        }
                        C40517g.m129530a(id, a, StickerModule.this.f104875r, StickerModule.this.f104873p);
                        StickerModule.this.f104874q.put(id, StickerModule.this.f104875r);
                        StickerModule.this.mo100277a(StickerModule.this.f104873p);
                        ((ScanFaceViewModel) C0069x.m159a((FragmentActivity) StickerModule.this.f104857a).mo147a(ScanFaceViewModel.class)).mo100143a().postValue(new Pair(Integer.valueOf(16), null));
                        StickerModule.this.mo100285a(b, a, this.f104899a);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo100350a(C40506c cVar, Integer num, String str, Exception exc) {
                    C10761a.m31392b((Context) StickerModule.this.f104857a, (int) R.string.aj2, 0).mo25750a();
                    StickerModule.this.f104872o.mo100148a(false, false);
                    C40568a.m129689a(cVar, num, str);
                    StickerModule.this.mo100283a(b, num.intValue(), str);
                }
            };
            C40508e eVar = new C40508e(dVar, r0, new C40504a<C40506c, Void>() {
                /* renamed from: b */
                public final void mo70508b(C27416b<C40506c, Void> bVar) {
                    C40568a.m129688a((C40506c) bVar.f72333e);
                    if (!C40517g.m129538c((C40506c) bVar.f72333e)) {
                        C40517g.m129528a((C40506c) bVar.f72333e);
                    }
                }
            });
            eVar.mo100559a(a2);
            eVar.mo100558a();
        }
    }

    /* renamed from: a */
    public final void mo100283a(FaceStickerBean faceStickerBean, int i, String str) {
        int i2;
        String str2;
        if (this.f104876s == -1) {
            i2 = this.f104875r.size() - 1;
            str2 = "add";
        } else {
            i2 = this.f104876s;
            str2 = "modify";
        }
        String str3 = str2;
        Effect effect = this.f104873p != null ? this.f104873p.f104908a : null;
        String id = faceStickerBean.getId();
        if (i2 < 0) {
            i2 = 0;
        }
        C40568a.m129691a(id, effect, str3, Integer.valueOf(i2), Integer.valueOf(i), str);
    }

    /* renamed from: a */
    public final void mo100285a(FaceStickerBean faceStickerBean, Effect effect, long j) {
        int i;
        String str;
        if (this.f104876s == -1) {
            i = this.f104875r.size() - 1;
            str = "add";
        } else {
            i = this.f104876s;
            str = "modify";
        }
        String str2 = str;
        String id = faceStickerBean.getId();
        if (i < 0) {
            i = 0;
        }
        C40568a.m129690a(id, effect, str2, Integer.valueOf(i), j);
    }

    /* renamed from: a */
    public final void mo100287a(C42320g gVar) {
        this.f104843M = gVar;
        ((MediaRecordPresenterViewModel) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(MediaRecordPresenterViewModel.class)).mo100395a(gVar);
    }

    /* renamed from: a */
    public final void mo100298a(List<Effect> list, boolean z) {
        this.f104834D = list;
        this.f104835E = z;
        if (this.f104834D != null && this.f104834D.size() > 0 && this.f104834D.get(0) != null && m128953b(list, z)) {
            this.f104836F = (Effect) this.f104834D.get(0);
            if (this.f104840J != null) {
                this.f104840J.mo101315a(this.f104836F);
                this.f104840J.mo101317b(this.f104836F);
            }
        }
        if (this.f104866i != null) {
            this.f104866i.mo100677a(this.f104857a, this.f104834D, z, this.f104844N);
        }
    }

    /* renamed from: a */
    public final void mo100296a(List<Effect> list) {
        if (this.f104866i != null) {
            this.f104866i.mo100690a(list);
        }
    }

    /* renamed from: a */
    public final void mo100282a(FaceStickerBean faceStickerBean) {
        this.f104870m.post(new C40470ax(this, faceStickerBean));
    }

    /* renamed from: a */
    public final void mo100288a(Effect effect) {
        this.f104866i.mo100695b(effect);
        if (effect != null) {
            this.f104837G = effect;
        }
        if (this.f104840J != null) {
            this.f104840J.mo101315a(effect);
        }
        mo100286a(C40376ag.m129117a(effect), Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo100294a(String str, Map<String, String> map, C43760j jVar) {
        ((StickerFetchViewModel) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(StickerFetchViewModel.class)).mo101304a(this.f104832B, new C40471ay(this)).observe(this.f104846P, new C40388am(str, map, jVar));
    }

    /* renamed from: a */
    public final void mo100293a(String str, C43764n nVar) {
        if (this.f104832B == null) {
            this.f104832B = new EffectPlatform(this.f104857a, C35574k.m114859a().mo70107v().mo83209c(), C35574k.m114859a().mo70078L().getOKHttpClient());
        }
        this.f104832B.mo70625a(str, nVar);
    }

    /* renamed from: a */
    public final void mo100295a(String str, Map<String, String> map, boolean z, C43759i iVar) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        m128948a((List<String>) arrayList, map, z, iVar);
    }

    /* renamed from: a */
    public final void mo100297a(List<String> list, Map<String, String> map, C43758h hVar) {
        this.f104832B.mo70638a(list, map, hVar);
    }

    /* renamed from: a */
    public final void mo100286a(FaceStickerBean faceStickerBean, Boolean bool) {
        if (this.f104866i != null) {
            if (faceStickerBean == null) {
                faceStickerBean = FaceStickerBean.NONE;
                this.f104866i.mo100695b(null);
            }
            if (faceStickerBean != FaceStickerBean.NONE) {
                this.f104845O.mo101294a(faceStickerBean);
            }
            this.f104882y.mo101318a(faceStickerBean);
            if (!m128968x() || faceStickerBean.getTypes().contains("Game2DV2")) {
                this.f104865h = faceStickerBean;
                if (faceStickerBean == FaceStickerBean.NONE || faceStickerBean.getEffectType() == 0) {
                    if (C40496bh.m129456e(faceStickerBean)) {
                        this.f104861d.mo56051a((Context) this.f104857a);
                    } else {
                        this.f104861d.mo56092c();
                    }
                    if (faceStickerBean.getTypes().contains("highRotationFreq")) {
                        this.f104849S = true;
                        m128949a(11, 15);
                    } else if (this.f104849S) {
                        this.f104849S = false;
                        m128970z();
                    }
                    if (this.f104872o != null) {
                        this.f104872o.mo100148a(false, true);
                    }
                    this.f104866i.mo100671a();
                    m128944A();
                    if (!String.valueOf(this.f104865h.getStickerId()).equals(this.f104877t)) {
                        this.f104851U = null;
                    }
                    this.f104831A = System.currentTimeMillis();
                    if (faceStickerBean != FaceStickerBean.NONE && faceStickerBean.getTypes().contains("AR")) {
                        m128957f(faceStickerBean);
                    } else if (faceStickerBean.getTags().contains("transfer_touch")) {
                        m128959g(faceStickerBean);
                    } else if (faceStickerBean.getTags().contains("hw_beauty")) {
                        m128961i(faceStickerBean);
                    } else if (C40496bh.m129451c(faceStickerBean)) {
                        this.f104875r = (List) this.f104874q.get(faceStickerBean.getId());
                        m128960h(faceStickerBean);
                    } else {
                        m128955e(faceStickerBean);
                    }
                    if (this.f104868k != null) {
                        this.f104868k.mo99410a(faceStickerBean);
                    }
                    m128962j(faceStickerBean);
                    if (!FaceMattingPresenter.m129140d(faceStickerBean) && this.f104843M != null) {
                        this.f104843M.mo103797d();
                    }
                    if (C40496bh.m129438a(faceStickerBean) && this.f104839I != null) {
                        ((C40832n) this.f104839I.mo44946a()).mo100417a(faceStickerBean);
                    }
                    if (faceStickerBean == FaceStickerBean.NONE || !faceStickerBean.getTypes().contains("AR")) {
                        this.f104866i.mo100692a(true);
                    } else {
                        this.f104866i.mo100692a(false);
                    }
                    StringBuilder sb = new StringBuilder("sticker_name: ");
                    sb.append(faceStickerBean.getName());
                    sb.append(", + sticker_id: ");
                    sb.append(faceStickerBean.getStickerId());
                    C42880h.m136156a(sb.toString());
                    if (this.f104871n != null && C43058dj.m136605a(String.valueOf(faceStickerBean.getStickerId()))) {
                        C43058dj.m136602a();
                        String str = this.f104871n.f99787w;
                        String str2 = this.f104871n.f99788x;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(faceStickerBean.getStickerId());
                        C43058dj.m136604a(str, str2, sb2.toString());
                        if (bool.booleanValue()) {
                            C42962b.f111525a.mo104671a("commerce_prop_click", C22984d.m75611a().mo59973a("enter_from", TextUtils.isEmpty(this.f104871n.f99789y) ? this.f104871n.f99788x : this.f104871n.f99789y).mo59971a("prop_id", faceStickerBean.getStickerId()).f60753a);
                        }
                    }
                    return;
                }
                return;
            }
            this.f104866i.mo100695b(null);
        }
    }

    /* renamed from: a */
    public final void mo100299a(boolean z) {
        if (this.f104865h != null && this.f104865h.getTags() != null && !TextUtils.isEmpty(this.f104871n.f99769e)) {
            String str = "";
            if (this.f104865h.getTags().contains("strong_beat")) {
                String a = C35574k.m114859a().mo70086a().mo103850a(this.f104871n.f99769e);
                if (new File(a).exists()) {
                    str = a;
                }
                this.f104861d.mo56062a(str);
                if (z && this.f104868k != null) {
                    this.f104868k.mo99410a(this.f104865h);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100289a(Effect effect, C40949u uVar) {
        if (uVar != null && effect != null) {
            uVar.mo100621a(StickerWrapper.m129064a(effect, (String) null, (C27481e) this.f104832B));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100273a(AVChallenge aVChallenge) {
        this.f104858aa = aVChallenge;
    }

    /* renamed from: a */
    public final void mo100271a(C17457s<C40832n> sVar) {
        this.f104839I = sVar;
        if (this.f104866i != null) {
            this.f104866i.mo100680a(sVar);
        }
    }

    /* renamed from: f */
    public final boolean mo100314f() {
        return this.f104866i.mo100701e();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        this.f104861d.mo56085b(this.f104856Z);
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        m128954d(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final /* synthetic */ void mo100331r() {
        mo100300b(this.f104865h);
    }

    /* renamed from: B */
    private static boolean m128945B() {
        if (VERSION.SDK_INT >= 18) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private void m128964t() {
        C1592h.m7853a((Callable<TResult>) new C40465as<TResult>(this));
    }

    /* renamed from: v */
    private EffectStickerViewModel m128966v() {
        return (EffectStickerViewModel) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(EffectStickerViewModel.class);
    }

    /* renamed from: x */
    private boolean m128968x() {
        if (this.f104838H == null || !this.f104838H.mo99344c()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void mo100321m() {
        if (this.f104867j != null) {
            this.f104867j.mo100155a(false);
            this.f104867j.unRegister();
        }
    }

    /* renamed from: A */
    private void m128944A() {
        if (this.f104881x != null) {
            this.f104861d.mo56102d().mo56138a(20000).mo56144a();
            this.f104881x = null;
        }
    }

    /* renamed from: u */
    private void m128965u() {
        boolean z;
        GameDuetResource gameDuetResource = m128966v().mo101285a().mo101195d().f99753an;
        if (gameDuetResource == null || gameDuetResource.gameSticker == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            mo100282a(gameDuetResource.gameSticker);
        }
    }

    /* renamed from: z */
    private void m128970z() {
        if (this.f104867j != null) {
            this.f104867j.unRegister();
        }
        this.f104867j = new DefaultSenorPresenter(this.f104857a, this.f104857a, this.f104862e, this.f104869l);
        this.f104867j.mo96375b();
    }

    /* renamed from: c */
    public final String mo100305c() {
        if (this.f104851U == null || this.f104851U.f104908a == null) {
            return null;
        }
        return this.f104851U.f104908a.getExtra();
    }

    /* renamed from: h */
    public final void mo100316h() {
        m128966v().mo101285a().mo101191a().observe(this.f104857a, new C40386ak(this));
    }

    /* renamed from: i */
    public final void mo100317i() {
        m128966v().mo101285a().mo101194c().observe(this.f104857a, new C40387al(this));
    }

    /* renamed from: n */
    public final boolean mo100322n() {
        if ("modify".equals(this.f104879v) || "add".equals(this.f104879v)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void mo100323o() {
        m128944A();
        this.f104870m.post(new C40466at(this));
        this.f104866i.mo100671a();
        this.f104872o.mo100146a();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f104870m.removeCallbacksAndMessages(null);
        this.f104861d.mo56059a(this.f104856Z);
        this.f104861d.mo56061a(this.f104855Y);
        if (this.f104872o != null) {
            this.f104872o.mo100149b();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        m128954d(true);
        if (this.f104867j != null && !this.f104867j.mo100157c()) {
            this.f104867j.mo96375b();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        if (this.f104867j != null && this.f104867j.mo100157c()) {
            this.f104867j.unRegister();
        }
    }

    /* renamed from: p */
    public final void mo100329p() {
        if (this.f104865h != null) {
            this.f104845O.mo101295b(this.f104865h);
            this.f104865h = null;
            mo100286a(FaceStickerBean.NONE, Boolean.valueOf(false));
        }
    }

    /* renamed from: q */
    public final JSONObject mo100330q() {
        if (this.f104864g == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = (JSONObject) this.f104864g.mo60607a();
        try {
            jSONObject.put("position", "shoot_page");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: w */
    private void m128967w() {
        boolean z;
        if (this.f104850T != null) {
            z = true;
        } else {
            z = false;
        }
        C43055dg.m136599a(z, "call initFaceScanContainer first", new Object[0]);
        if (this.f104872o == null) {
            this.f104872o = new C40323b(this.f104857a, this.f104850T, new C40322a() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo100348a() {
                    StickerModule.this.mo100300b(FaceStickerBean.NONE);
                }

                /* renamed from: a */
                public final void mo100144a(String str) {
                    StickerModule.this.mo100293a(str, (C43764n) new C43764n() {
                        /* renamed from: a */
                        public final void mo100238a(ResourceListModel resourceListModel) {
                            StickerModule.this.mo100290a(resourceListModel);
                        }

                        /* renamed from: a */
                        public final void mo100237a(C43726c cVar) {
                            C10761a.m31392b((Context) StickerModule.this.f104857a, (int) R.string.aj2, 0).mo25750a();
                            StickerModule.this.f104872o.mo100148a(false, false);
                        }
                    });
                }

                /* renamed from: a */
                public final void mo100145a(boolean z, boolean z2) {
                    int i;
                    String str;
                    String str2;
                    int i2;
                    String str3;
                    if (z2 || StickerModule.this.f104865h == null || !String.valueOf(StickerModule.this.f104865h.getStickerId()).equals(StickerModule.this.f104877t)) {
                        StickerModule.this.f104866i.mo100671a();
                        return;
                    }
                    StickerModule.this.f104870m.post(new C40472az(this));
                    if (StickerModule.this.f104875r == null) {
                        StickerModule.this.f104875r = new ArrayList();
                    }
                    if (z) {
                        C0052o<String> oVar = ((TabSelectViewModel) C0069x.m159a((FragmentActivity) StickerModule.this.f104857a).mo147a(TabSelectViewModel.class)).f106557b;
                        C42962b bVar = C42962b.f111525a;
                        String str4 = "create_moji_prop_complete";
                        C22984d a = C22984d.m75611a().mo59973a("enter_method", "click_banner").mo59973a("enter_from", "video_shoot_page").mo59970a("draft_id", StickerModule.this.f104871n.f99790z).mo59973a("creation_id", StickerModule.this.f104871n.f99787w).mo59973a("shoot_way", StickerModule.this.f104871n.f99788x);
                        String str5 = "tab_name";
                        if (oVar.getValue() == null) {
                            str = "";
                        } else {
                            str = (String) oVar.getValue();
                        }
                        C22984d a2 = a.mo59973a(str5, str);
                        String str6 = "prop_id";
                        if (StickerModule.this.f104865h == null) {
                            str2 = "";
                        } else {
                            str2 = String.valueOf(StickerModule.this.f104865h.getStickerId());
                        }
                        C22984d a3 = a2.mo59973a(str6, str2);
                        String str7 = "ttl_count";
                        if (StickerModule.this.f104876s == -1) {
                            i2 = StickerModule.this.f104875r.size() - 1;
                        } else {
                            i2 = StickerModule.this.f104876s;
                        }
                        C22984d a4 = a3.mo59970a(str7, i2);
                        String str8 = "id_map";
                        if (StickerModule.this.f104873p == null) {
                            str3 = "";
                        } else {
                            str3 = StickerModule.this.f104873p.f104908a.getExtra();
                        }
                        bVar.mo104671a(str4, a4.mo59973a(str8, str3).f60753a);
                    }
                    StickerModule.this.f104875r = (List) StickerModule.this.f104874q.get(StickerModule.this.f104865h.getId());
                    if (!C6311g.m19573a(StickerModule.this.f104875r)) {
                        C41018x xVar = StickerModule.this.f104866i;
                        List<StickerWrapper> list = StickerModule.this.f104875r;
                        if (StickerModule.this.f104876s == -1) {
                            i = StickerModule.this.f104875r.size() - 1;
                        } else {
                            i = StickerModule.this.f104876s;
                        }
                        xVar.mo100691a(list, i);
                    }
                }
            });
        }
    }

    /* renamed from: y */
    private void m128969y() {
        if (!(this.f104865h == null || this.f104865h == FaceStickerBean.NONE)) {
            this.f104870m.post(new C40389an(this, this.f104865h));
        }
        if (this.f104841K != null) {
            this.f104841K.mo101313b();
        }
        mo100308c(true);
    }

    /* renamed from: e */
    public final void mo100312e() {
        ((EffectStickerViewModel) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(EffectStickerViewModel.class)).mo101283a(this.f104832B, this.f104844N).observe(this.f104857a, new C40467au(this));
    }

    /* renamed from: j */
    public final void mo100318j() {
        m128966v().mo101285a().mo101199h().observe(this.f104857a, new C40393ar(this));
    }

    /* renamed from: g */
    public final void mo100315g() {
        boolean z;
        Object obj;
        if (this.f104866i != null) {
            z = this.f104866i.mo100698b();
        } else {
            z = false;
        }
        if (!z) {
            CurParentStickerViewModel curParentStickerViewModel = (CurParentStickerViewModel) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(CurParentStickerViewModel.class);
            if (curParentStickerViewModel.mo101270a().getValue() == null) {
                obj = null;
            } else {
                obj = (Effect) ((C0902i) curParentStickerViewModel.mo101270a().getValue()).f3155b;
            }
            curParentStickerViewModel.mo101272a(new C0902i<>(obj, null));
            mo100329p();
        }
    }

    /* renamed from: a */
    public final void mo100266a() {
        this.f104861d.mo56062a((String) null);
    }

    /* renamed from: l */
    public final void mo100320l() {
        if (!m128945B()) {
            C10761a.m31399c((Context) this.f104857a, (int) R.string.cvd).mo25750a();
        } else if (this.f104866i != null) {
            C42962b.f111525a.mo104671a("click_prop_entrance", C22984d.m75611a().mo59973a("creation_id", this.f104871n.f99787w).mo59973a("shoot_way", this.f104871n.f99788x).mo59970a("draft_id", this.f104871n.f99790z).mo59973a("enter_from", "video_shoot_page").mo59973a("content_type", this.f104871n.mo96148i().getContentType()).mo59973a("content_source", this.f104871n.mo96148i().getContentSource()).f60753a);
            this.f104866i.mo100675a(this.f104857a, this.f104846P, this.f104844N, this.f104866i.mo100699c(), new C41020a() {
                /* renamed from: a */
                public final void mo100333a(FaceStickerBean faceStickerBean) {
                    if (StickerModule.this.f104857a.isViewValid()) {
                        StickerModule.this.mo100286a(faceStickerBean, Boolean.valueOf(false));
                    }
                }

                /* renamed from: b */
                public final void mo100337b(FaceStickerBean faceStickerBean) {
                    if (StickerModule.this.f104865h != null) {
                        C42962b.f111525a.onEvent(MobClick.obtain().setEventName("remove_prop").setLabelName("shoot_page").setValue(String.valueOf(StickerModule.this.f104865h.getStickerId())).setJsonObject(StickerModule.this.mo100330q()));
                    }
                    StickerModule.this.mo100329p();
                }

                /* renamed from: c */
                public final void mo100339c(FaceStickerBean faceStickerBean) {
                    if (StickerModule.this.f104866i.mo100701e()) {
                        if (StickerModule.this.f104871n == null || StickerModule.this.f104871n.f99776l.isEmpty()) {
                            StickerModule.this.mo100286a(faceStickerBean, Boolean.valueOf(true));
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("prop_id", String.valueOf(faceStickerBean.getStickerId()));
                            hashMap.put("creation_id", StickerModule.this.f104871n.f99787w);
                            hashMap.put("shoot_way", StickerModule.this.f104871n.f99788x);
                            new C10741a(StickerModule.this.f104857a).mo25649a((int) R.string.flh).mo25657b((int) R.string.flg).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) new C40489ba(this, hashMap)).mo25650a((int) R.string.ag4, (DialogInterface.OnClickListener) new C40490bb(this, hashMap, faceStickerBean)).mo25656a().mo25637a();
                        }
                    }
                }

                /* renamed from: a */
                public final void mo100334a(FaceStickerBean faceStickerBean, String str) {
                    for (C40998d b : StickerModule.this.f104863f) {
                        b.mo100602b();
                    }
                    StickerModule.this.f104859b.mo60525a(StickerModule.this.f104880w);
                }

                /* renamed from: b */
                public final void mo100338b(FaceStickerBean faceStickerBean, String str) {
                    Object obj;
                    for (C40998d a : StickerModule.this.f104863f) {
                        a.mo100600a();
                    }
                    StickerModule.this.f104859b.mo60526b(StickerModule.this.f104880w);
                    C42962b bVar = C42962b.f111525a;
                    MobClick labelName = MobClick.obtain().setEventName("confirm_prop_setting").setLabelName("shoot_page");
                    if (StickerModule.this.f104865h == null) {
                        obj = "";
                    } else {
                        obj = Long.valueOf(StickerModule.this.f104865h.getStickerId());
                    }
                    bVar.onEvent(labelName.setValue(String.valueOf(obj)).setJsonObject((JSONObject) StickerModule.this.f104864g.mo60607a()));
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo100335a(Map map, DialogInterface dialogInterface, int i) {
                    map.put("to_status", "cancel");
                    C42962b.f111525a.mo104671a("shoot_video_delete_confirm", map);
                    if (StickerModule.this.f104866i != null) {
                        StickerModule.this.f104866i.mo100695b(null);
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo100336a(Map map, FaceStickerBean faceStickerBean, DialogInterface dialogInterface, int i) {
                    map.put("to_status", "confirm");
                    C42962b.f111525a.mo104671a("shoot_video_delete_confirm", map);
                    StickerModule.this.mo100286a(faceStickerBean, Boolean.valueOf(true));
                }
            });
            this.f104866i.mo100686a((C40907r) new C40469aw(this));
            if (this.f104840J != null) {
                this.f104840J.mo101314a();
            }
            C42962b.f111525a.mo104670a(this.f104857a, "click_prop", "shoot_page", 0, 0, (JSONObject) this.f104864g.mo60607a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final /* synthetic */ Void mo100332s() throws Exception {
        for (Entry entry : C40517g.m129534b().entrySet()) {
            if (TextUtils.isEmpty(this.f104852V) || !this.f104852V.equals(entry.getKey()) || !C6311g.m19574b(this.f104853W)) {
                ArrayList arrayList = new ArrayList();
                for (String fileInputStream : (List) entry.getValue()) {
                    try {
                        C6718a aVar = new C6718a(new InputStreamReader(new FileInputStream(fileInputStream)));
                        Effect effect = (Effect) C35574k.m114859a().mo70085S().mo15972a(aVar, (Type) Effect.class);
                        aVar.close();
                        if (effect != null) {
                            StickerWrapper a = StickerWrapper.m129064a(effect, (String) null, (C27481e) null);
                            a.f104910c = 1;
                            arrayList.add(a);
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f104874q.put(entry.getKey(), arrayList);
            } else {
                this.f104874q.put(entry.getKey(), this.f104853W);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo100270a(FrameLayout frameLayout) {
        this.f104850T = frameLayout;
    }

    /* renamed from: b */
    public final void mo100302b(Effect effect) {
        this.f104866i.mo100687a(effect);
    }

    /* renamed from: a */
    private static String m128946a(UrlModel urlModel) {
        if (urlModel == null) {
            return "";
        }
        return JSON.toJSONString(urlModel);
    }

    /* renamed from: g */
    private void m128959g(FaceStickerBean faceStickerBean) {
        mo100300b(faceStickerBean);
        this.f104882y.mo101323f(faceStickerBean);
    }

    /* renamed from: b */
    public final void mo100304b(boolean z) {
        if (this.f104840J != null) {
            this.f104840J.mo101316a(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo100306c(FaceStickerBean faceStickerBean) {
        mo100286a(faceStickerBean, Boolean.valueOf(false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo100310d(FaceStickerBean faceStickerBean) {
        mo100286a(faceStickerBean, Boolean.valueOf(true));
    }

    /* renamed from: d */
    private void m128954d(boolean z) {
        if (z) {
            if (this.f104854X == null) {
                this.f104854X = new C40468av(this);
            }
            this.f104861d.mo56053a(this.f104854X);
            return;
        }
        this.f104861d.mo56053a((C1944a) null);
    }

    /* renamed from: e */
    private void m128956e(boolean z) {
        if (this.f104867j != null) {
            this.f104867j.unRegister();
        }
        this.f104867j = new DefaultSenorPresenter(this.f104857a, this.f104857a, this.f104862e, z);
        this.f104867j.mo96375b();
    }

    /* renamed from: j */
    private void m128962j(FaceStickerBean faceStickerBean) {
        this.f104858aa = null;
        String k = m128963k(faceStickerBean);
        if (k != null) {
            C35574k.m114859a().mo70103r().mo83166a(k, null, 0, 0, new C40392aq(this));
        }
    }

    /* renamed from: a */
    private void m128949a(int... iArr) {
        if (this.f104867j != null) {
            this.f104867j.unRegister();
        }
        this.f104867j = new DefaultSenorPresenter(this.f104857a, this.f104857a, this.f104862e, this.f104869l);
        for (int i = 0; i < 2; i++) {
            this.f104867j.mo100153a(iArr[i], 0);
        }
        this.f104867j.mo96375b();
    }

    /* renamed from: b */
    private void m128952b(List<ComposerInfo> list) {
        if (!C6311g.m19573a(list)) {
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = ((ComposerInfo) list.get(i)).f56036a;
            }
            this.f104881x = strArr;
            this.f104861d.mo56102d().mo56138a(20000).mo56143a(list, 20000).mo56144a();
        }
    }

    /* renamed from: f */
    private void m128958f(Effect effect) {
        ((StickerFetchViewModel) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(StickerFetchViewModel.class)).mo101304a(this.f104832B, new C40390ao(this)).observe(this.f104857a, new C40391ap(this, effect));
    }

    /* renamed from: k */
    private static String m128963k(FaceStickerBean faceStickerBean) {
        List<String> tags = faceStickerBean.getTags();
        if (C6311g.m19573a(tags)) {
            return null;
        }
        for (String str : tags) {
            if (str.startsWith("challenge:")) {
                return str.substring(10);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo100307c(Effect effect) {
        if (effect != null) {
            if (this.f104866i != null) {
                this.f104866i.mo100676a(this.f104857a, effect, this.f104844N);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(effect);
            this.f104834D = arrayList;
            if (this.f104840J != null) {
                this.f104840J.mo101315a(effect);
                this.f104840J.mo101317b(effect);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ boolean mo100311d(Effect effect) {
        if (this.f104871n == null) {
            return false;
        }
        if (this.f104871n.mo96142d() || this.f104871n.mo96144e()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m128950a(CategoryEffectModel categoryEffectModel) {
        if (categoryEffectModel == null || this.f104837G != null || this.f104840J == null || m128953b(this.f104834D, this.f104835E)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m128957f(FaceStickerBean faceStickerBean) {
        this.f104861d.mo56121h(true);
        this.f104861d.mo56036a((Bitmap) null);
        int b = mo100300b(faceStickerBean);
        this.f104882y.mo101319b(faceStickerBean);
        this.f104861d.mo56086b(this.f104855Y);
        C42962b.f111525a.mo104670a(this.f104857a, "prop", "click", faceStickerBean.getStickerId(), (long) b, mo100330q());
        C42962b.f111525a.onEvent(MobClick.obtain().setEventName("ar_prop_rear").setLabelName("shoot_page").setExtValueLong(faceStickerBean.getStickerId()));
    }

    /* renamed from: h */
    private void m128960h(FaceStickerBean faceStickerBean) {
        m128967w();
        this.f104882y.mo101320c(faceStickerBean);
        this.f104877t = String.valueOf(faceStickerBean.getStickerId());
        this.f104876s = -1;
        if (C6311g.m19574b(this.f104875r)) {
            int indexOf = this.f104875r.indexOf(this.f104851U);
            if (indexOf == -1) {
                indexOf = 0;
            }
            this.f104866i.mo100691a(this.f104875r, indexOf);
            mo100300b(FaceStickerBean.NONE);
            mo100277a((StickerWrapper) this.f104875r.get(indexOf));
            return;
        }
        this.f104872o.mo100146a();
        mo100300b(faceStickerBean);
    }

    /* renamed from: i */
    private void m128961i(FaceStickerBean faceStickerBean) {
        boolean z;
        if (C6399b.m19944t()) {
            C20749b bVar = this.f104861d;
            String str = "";
            int stickerId = (int) faceStickerBean.getStickerId();
            if (!C35574k.m114859a().mo70096k().mo93305a(Property.EnableEffectNewEngine) || !C40496bh.m129454d(faceStickerBean)) {
                z = false;
            } else {
                z = true;
            }
            bVar.mo56039a(str, stickerId, 0, z);
        } else {
            this.f104861d.mo56077b("", (int) faceStickerBean.getStickerId(), 0, faceStickerBean.getExtra());
        }
        this.f104882y.mo101324g(faceStickerBean);
    }

    /* renamed from: c */
    public final void mo100308c(boolean z) {
        this.f104869l = z;
        if (this.f104867j != null) {
            this.f104867j.mo100155a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ boolean mo100313e(Effect effect) {
        if (this.f104871n == null) {
            return false;
        }
        if (this.f104871n.mo96142d() || this.f104871n.mo96144e()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m128955e(FaceStickerBean faceStickerBean) {
        int b = mo100300b(faceStickerBean);
        if (faceStickerBean != FaceStickerBean.NONE) {
            C42962b.f111525a.mo104670a(this.f104857a, "prop", "click", faceStickerBean.getStickerId(), (long) b, mo100330q());
        }
        if (!(this.f104867j instanceof DefaultSenorPresenter)) {
            if (this.f104867j != null) {
                this.f104867j.unRegister();
            }
            this.f104867j = new DefaultSenorPresenter(this.f104857a, this.f104857a, this.f104862e, this.f104869l);
            this.f104867j.mo96375b();
            this.f104861d.mo56061a(this.f104855Y);
            this.f104861d.mo56121h(false);
        }
        mo100299a(false);
        if (faceStickerBean != FaceStickerBean.NONE && faceStickerBean.getTypes().contains("Game2DV2")) {
            this.f104882y.mo101322e(faceStickerBean);
        } else if (faceStickerBean == FaceStickerBean.NONE || !faceStickerBean.getTypes().contains("FaceReplace3D")) {
            this.f104882y.mo101320c(faceStickerBean);
        } else {
            this.f104882y.mo101321d(faceStickerBean);
        }
    }

    /* renamed from: b */
    public final int mo100300b(FaceStickerBean faceStickerBean) {
        boolean z;
        StringBuilder sb = new StringBuilder("sdk setStickerPath = ");
        sb.append(faceStickerBean.getName());
        sb.append(" fileUrl ");
        sb.append(m128946a(faceStickerBean.getFileUrl()));
        C41530am.m132280a(sb.toString());
        this.f104847Q = this.f104848R.nextInt();
        if (!C6399b.m19944t()) {
            return this.f104861d.mo56077b(faceStickerBean.getLocalPath(), (int) faceStickerBean.getStickerId(), this.f104847Q, faceStickerBean.getExtra());
        }
        C20749b bVar = this.f104861d;
        String localPath = faceStickerBean.getLocalPath();
        int stickerId = (int) faceStickerBean.getStickerId();
        int i = this.f104847Q;
        if (!C35574k.m114859a().mo70096k().mo93305a(Property.EnableEffectNewEngine) || !C40496bh.m129454d(faceStickerBean)) {
            z = false;
        } else {
            z = true;
        }
        return bVar.mo56039a(localPath, stickerId, i, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo100303b(Boolean bool) {
        if (bool != null) {
            if (bool.booleanValue()) {
                m128969y();
            } else {
                mo100308c(false);
                mo100321m();
            }
        }
    }

    /* renamed from: a */
    public final void mo100269a(OnClickListener onClickListener) {
        this.f104883z = onClickListener;
        if (this.f104866i != null) {
            this.f104866i.mo100678a(onClickListener);
        }
    }

    /* renamed from: b */
    private static boolean m128953b(List<Effect> list, boolean z) {
        if (list == null) {
            return false;
        }
        if (!z && C35574k.m114859a().mo70072F().mo83153b() && C40909a.m130725a((Collection<? extends Effect>) list)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo100284a(final FaceStickerBean faceStickerBean, final C43764n nVar) {
        if (nVar != null && faceStickerBean != null) {
            this.f104865h = faceStickerBean;
            this.f104877t = String.valueOf(faceStickerBean.getStickerId());
            final List list = (List) this.f104874q.get(faceStickerBean.getId());
            if (C6311g.m19573a(list)) {
                nVar.mo100237a((C43726c) null);
            } else if (!this.f104878u) {
                C403513 r7 = new C40901b() {
                    /* renamed from: a */
                    public final void mo100340a(C43726c cVar) {
                        nVar.mo100237a((C43726c) null);
                        StickerModule.this.f104878u = false;
                    }

                    /* renamed from: a */
                    public final void mo100343a(List<StickerWrapper> list, ResourceListModel resourceListModel) {
                        nVar.mo100238a(resourceListModel);
                        StickerModule.this.f104878u = false;
                    }

                    /* renamed from: a */
                    public final void mo100341a(String str, Effect effect, ResourceListModel resourceListModel) {
                        StickerModule.this.f104876s = 0;
                        C40569b.m129696a(faceStickerBean.getId(), effect, list, StickerModule.this.f104876s, resourceListModel, (C40900a) this);
                    }

                    /* renamed from: a */
                    public final void mo100342a(String str, List<StickerWrapper> list, StickerWrapper stickerWrapper, Exception exc) {
                        nVar.mo100238a((ResourceListModel) null);
                        StickerModule.this.f104878u = false;
                    }
                };
                this.f104878u = true;
                C40569b.m129693a();
                for (int i = 0; i < list.size(); i++) {
                    C40569b.m129694a(this.f104832B, faceStickerBean.getId(), (StickerWrapper) list.get(i), i, list, (C40900a) r7);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100268a(int i, int i2, Intent intent) {
        if (this.f104866i != null) {
            this.f104866i.mo100672a(i, i2, intent);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m128947a(String str, Map map, C43760j jVar, C40949u uVar) {
        if (uVar != null) {
            uVar.mo100632a(str, map, jVar);
        }
    }

    /* renamed from: a */
    private void m128948a(List<String> list, Map<String, String> map, boolean z, C43759i iVar) {
        this.f104832B.mo70639a(list, map, z, iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100267a(int i, int i2, int i3, String str) {
        this.f104845O.mo101293a(i, i2, i3, str);
        if (i == 4099) {
            ((GameResultViewModel) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(GameResultViewModel.class)).mo99323a().postValue(new Pair(Boolean.valueOf(true), Integer.valueOf(i2)));
        }
        if (i == 4104) {
            ((GameResultViewModel) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(GameResultViewModel.class)).mo99324b().postValue(Integer.valueOf(i));
        }
        if (i == 8192) {
            ((ScanFaceViewModel) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(ScanFaceViewModel.class)).mo100143a().postValue(new Pair(Integer.valueOf(i2), str));
        }
        if (i == 32 || i == 33) {
            if (!mo100314f()) {
                ((ARTextResultModule) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(ARTextResultModule.class)).mo96414a().postValue(new C38489m(i, i2, i3, str));
            } else {
                ((ARTextResultModule) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(ARTextResultModule.class)).mo96415b().postValue(new C38489m(i, i2, i3, str));
            }
        }
        if (C40431c.f105113g.mo100452a(i)) {
            ((PixaloopMessageModule) C0069x.m159a((FragmentActivity) this.f104857a).mo147a(PixaloopMessageModule.class)).mo100446a().postValue(new C40431c(i, i2, i3, str));
        }
        if (i == 17) {
            if (this.f104841K != null) {
                this.f104841K.mo101312a();
            }
            switch (i2) {
                case 3:
                    if (this.f104865h != null && this.f104865h.getType() == 10) {
                        C42962b.f111525a.onEvent(MobClick.obtain().setEventName("ar_prop_success").setLabelName("shoot_page").setExtValueLong(this.f104865h.getStickerId()));
                    }
                    if (this.f104865h != null) {
                        StringBuilder sb = new StringBuilder("sticker_id: ");
                        sb.append(this.f104865h.getStickerId());
                        C42880h.m136156a(sb.toString());
                    }
                    C6893q.m21447a("type_av_sticker_show_time", C6869c.m21381a().mo16886a("duration", Long.valueOf(System.currentTimeMillis() - this.f104831A)).mo16888b());
                    C6893q.m21444a("3d_sticker_show_rate", 0, (JSONObject) null);
                    this.f104831A = 0;
                    return;
                case 4:
                    if (this.f104865h != null && !TextUtils.isEmpty(this.f104865h.mLocalPath)) {
                        C6726a.m20842a(new Runnable() {
                            public final void run() {
                                try {
                                    if (StickerModule.this.f104865h != null && !TextUtils.isEmpty(StickerModule.this.f104865h.mLocalPath)) {
                                        C41848a.m133098a(new File(StickerModule.this.f104865h.mLocalPath));
                                    }
                                } catch (Exception unused) {
                                    C42880h.m136156a("delete failed");
                                }
                            }
                        });
                        break;
                    }
            }
            C10761a.m31399c((Context) this.f104857a, (int) R.string.bv0).mo25750a();
            C6893q.m21444a("3d_sticker_show_rate", i2, new C6909j().mo16966a("resource_name", str).mo16967a());
            this.f104831A = 0;
        }
    }

    public StickerModule(AbsActivity absActivity, C0043i iVar, C23258e eVar, String str, C20676a aVar, C20749b bVar, C20707b bVar2, C40913s sVar, C40997c cVar, C23321d<JSONObject> dVar, String str2, ArrayList<StickerWrapper> arrayList) {
        this.f104857a = absActivity;
        this.f104859b = eVar;
        this.f104844N = str;
        this.f104846P = iVar;
        this.f104860c = aVar;
        this.f104861d = bVar;
        this.f104862e = bVar2;
        this.f104882y = cVar;
        this.f104864g = dVar;
        this.f104852V = str2;
        this.f104853W = arrayList;
        m128964t();
        ((EffectStickerViewModel) C0069x.m159a((FragmentActivity) absActivity).mo147a(EffectStickerViewModel.class)).f106522c = sVar;
        this.f104871n = sVar.mo101195d();
        this.f104845O = (FaceStickerViewModel) C0069x.m159a((FragmentActivity) absActivity).mo147a(FaceStickerViewModel.class);
        iVar.getLifecycle().mo55a(this);
        this.f104870m = new SafeHandler(absActivity);
        this.f104848R = new Random();
        this.f104832B = new EffectPlatform(absActivity, C35574k.m114859a().mo70107v().mo83209c(), C35574k.m114859a().mo70078L().getOKHttpClient());
        this.f104832B.mo70619a((C0043i) absActivity);
        m128965u();
        ((MediaRecordPresenterViewModel) C0069x.m159a((FragmentActivity) absActivity).mo147a(MediaRecordPresenterViewModel.class)).f105003a = bVar;
    }
}
