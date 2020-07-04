package com.p280ss.android.ugc.aweme.tools.mvtemplate;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.ViewStubCompat;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.common.internal.C13315l;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41494t;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42347l;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1675a.C42500c;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1676b.C42515a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42537b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b */
public final class C42508b implements C42515a {

    /* renamed from: a */
    public String f110531a;

    /* renamed from: b */
    public int f110532b;

    /* renamed from: c */
    public int f110533c;

    /* renamed from: d */
    public String f110534d;

    /* renamed from: e */
    public boolean f110535e = true;

    /* renamed from: f */
    public boolean f110536f;

    /* renamed from: g */
    public volatile boolean f110537g;

    /* renamed from: h */
    private FragmentActivity f110538h;

    /* renamed from: i */
    private ViewStubCompat f110539i;

    /* renamed from: j */
    private MvTemplateView f110540j;

    /* renamed from: k */
    private EffectPlatform f110541k;

    /* renamed from: l */
    private Effect f110542l;

    /* renamed from: m */
    private ShortVideoContext f110543m;

    /* renamed from: n */
    private String f110544n;

    /* renamed from: o */
    private boolean f110545o;

    /* renamed from: p */
    private String f110546p;

    /* renamed from: q */
    private int f110547q;

    /* renamed from: r */
    private String f110548r;

    /* renamed from: s */
    private final int f110549s = 20;

    /* renamed from: t */
    private boolean f110550t = true;

    /* renamed from: u */
    private boolean f110551u;

    /* renamed from: v */
    private boolean f110552v;

    /* renamed from: w */
    private boolean f110553w;

    /* renamed from: a */
    public final void mo104092a(final boolean z) {
        this.f110541k.mo70623a("mv", (C43757g) new C43757g() {
            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
                if (!z) {
                    C42508b.this.mo104091a(C42508b.this.f110531a);
                }
            }

            /* renamed from: a */
            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                C42508b.this.mo104095a(effectChannelResponse, z, true);
            }
        });
    }

    /* renamed from: a */
    public final boolean mo104095a(EffectChannelResponse effectChannelResponse, boolean z, boolean z2) {
        if (effectChannelResponse == null || C23477d.m77081a((Collection<T>) effectChannelResponse.allCategoryEffects)) {
            if (!z && z2) {
                mo104091a(this.f110531a);
            }
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect : effectChannelResponse.allCategoryEffects) {
            MvThemeData mvThemeData = new MvThemeData();
            mvThemeData.mo104045a(effect);
            mvThemeData.f110496b = effectChannelResponse.urlPrefix;
            arrayList.add(mvThemeData);
        }
        if (arrayList.size() <= 0) {
            if (!z && z2) {
                mo104091a(this.f110544n);
            }
            return false;
        }
        if (this.f110542l != null && !TextUtils.isEmpty(this.f110542l.getEffectId())) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                } else if (this.f110542l.getEffectId().equals(((MvThemeData) arrayList.get(i2)).mo104044a())) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                MvThemeData mvThemeData2 = (MvThemeData) arrayList.remove(i);
                mvThemeData2.mo104045a(this.f110542l);
                arrayList.add(0, mvThemeData2);
            }
        }
        if (m135086f()) {
            C42500c.m135067a().mo104080a((List<MvThemeData>) arrayList);
            this.f110540j.mo104020a((List<MvThemeData>) arrayList);
            if (!z) {
                this.f110540j.mo104023c();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo104094a(CategoryPageModel categoryPageModel, boolean z, boolean z2) {
        if (categoryPageModel == null || C23477d.m77081a((Collection<T>) categoryPageModel.category_effects.effects)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect : categoryPageModel.category_effects.effects) {
            MvThemeData mvThemeData = new MvThemeData();
            mvThemeData.mo104045a(effect);
            mvThemeData.f110496b = categoryPageModel.url_prefix;
            arrayList.add(mvThemeData);
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        if (this.f110542l != null && !TextUtils.isEmpty(this.f110542l.getEffectId())) {
            if (!this.f110552v) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (this.f110542l.getEffectId().equals(((MvThemeData) arrayList.get(i)).mo104044a())) {
                        arrayList.remove(i);
                        this.f110552v = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (this.f110540j.getDataCount() == 0) {
                MvThemeData mvThemeData2 = new MvThemeData();
                mvThemeData2.mo104045a(this.f110542l);
                mvThemeData2.f110496b = categoryPageModel.url_prefix;
                arrayList.add(0, mvThemeData2);
            }
        }
        if (!this.f110550t) {
            C42500c.m135067a().mo104081b((List<MvThemeData>) arrayList);
            this.f110540j.mo104020a((List<MvThemeData>) arrayList);
        } else if (m135086f()) {
            C42500c.m135067a().mo104080a((List<MvThemeData>) arrayList);
            this.f110540j.mo104020a((List<MvThemeData>) arrayList);
            this.f110540j.mo104023c();
            this.f110550t = false;
        }
        if (!this.f110535e) {
            this.f110540j.mo104035k();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo104091a(String str) {
        if (m135086f()) {
            C10761a.m31403c(this.f110540j.getContext(), str).mo25750a();
            if (this.f110540j.getDataCount() == 0) {
                this.f110540j.mo104024d();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo104093a(MvThemeData mvThemeData, int i) {
        if (mvThemeData.f110495a == null || mvThemeData.f110495a.getTags() == null || !mvThemeData.f110495a.getTags().contains("NeedServerAlgorithm")) {
            this.f110553w = false;
            return true;
        }
        this.f110553w = true;
        m135084b(mvThemeData, i);
        return false;
    }

    /* renamed from: i */
    private void m135089i() {
        if (this.f110551u) {
            m135090j();
        } else {
            m135085c(false);
        }
    }

    /* renamed from: l */
    private void m135092l() {
        if (m135086f()) {
            this.f110540j.mo104034j();
        }
    }

    /* renamed from: c */
    public final void mo104098c() {
        if (m135086f()) {
            this.f110540j.mo104032h();
        }
    }

    public final void dismiss() {
        if (this.f110540j != null) {
            this.f110540j.dismiss();
            C42961az.m136383d(this.f110540j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void mo104101e() {
        if (this.f110535e && !this.f110537g) {
            if (this.f110536f) {
                mo104097b(false);
                return;
            }
            m135090j();
        }
    }

    /* renamed from: b */
    public final void mo104096b() {
        if (this.f110540j != null && this.f110540j.getVisibility() == 0) {
            this.f110540j.mo104029g();
        }
    }

    /* renamed from: d */
    public final void mo104099d() {
        C42500c.m135067a().mo104078a((Context) this.f110538h);
        if (this.f110540j != null) {
            C42961az.m136383d(this.f110540j);
            MvTemplateView.m135008i();
        }
    }

    /* renamed from: g */
    private void m135087g() {
        if (this.f110538h != null && !this.f110538h.isFinishing() && C42543f.m135195a(this.f110538h)) {
            if (this.f110541k == null) {
                this.f110541k = new EffectPlatform(this.f110538h, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
            }
            this.f110541k.mo70641b("mv", false, new C43757g() {
                /* renamed from: a */
                public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                    C42508b.m135081a(true, 0, (Exception) null);
                }

                /* renamed from: a */
                public final void mo9274a(C43726c cVar) {
                    if (cVar == null) {
                        C42508b.m135081a(false, 1, (Exception) null);
                    } else {
                        C42508b.m135081a(false, cVar.f113220a, cVar.f113222c);
                    }
                }
            });
        }
    }

    /* renamed from: k */
    private C22984d m135091k() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f110547q);
        return C22984d.m75611a().mo59973a("shoot_way", this.f110548r).mo59973a("creation_id", this.f110546p).mo59973a("draft_id", sb.toString());
    }

    /* renamed from: f */
    private boolean m135086f() {
        if (this.f110540j != null) {
            return true;
        }
        if (this.f110539i == null || this.f110539i.getParent() == null) {
            return false;
        }
        this.f110540j = (MvTemplateView) this.f110539i.mo6224a();
        this.f110540j.setOnClickListener(C42516c.f110563a);
        this.f110540j.setMvThemeClickListener(this);
        this.f110540j.setMoreDataFetcher(new C42535d(this));
        if (C39805en.m127445a()) {
            m135092l();
        }
        if (this.f110545o) {
            mo104090a(Boolean.valueOf(true));
        }
        return true;
    }

    /* renamed from: h */
    private void m135088h() {
        if (this.f110538h != null && !this.f110538h.isFinishing() && C42543f.m135195a(this.f110538h)) {
            if (this.f110541k == null) {
                this.f110541k = new EffectPlatform(this.f110538h, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
            }
            this.f110541k.mo70632a("mv", "all", false, 20, this.f110532b, this.f110533c, this.f110534d, new C43756f() {
                /* renamed from: a */
                public final void mo70687a(CategoryPageModel categoryPageModel) {
                    C42508b.m135081a(true, 0, (Exception) null);
                }

                /* renamed from: a */
                public final void mo70686a(C43726c cVar) {
                    if (cVar == null) {
                        C42508b.m135081a(false, 1, (Exception) null);
                    } else {
                        C42508b.m135081a(false, cVar.f113220a, cVar.f113222c);
                    }
                }
            });
        }
    }

    /* renamed from: j */
    private void m135090j() {
        if (this.f110538h != null && !this.f110538h.isFinishing()) {
            if (this.f110541k == null) {
                this.f110541k = new EffectPlatform(this.f110538h, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
            }
            this.f110537g = true;
            this.f110541k.mo70632a("mv", "all", false, 20, this.f110532b, this.f110533c, this.f110534d, new C43756f() {
                /* renamed from: a */
                public final void mo70686a(C43726c cVar) {
                    C42508b.this.mo104097b(false);
                    if (cVar == null) {
                        C42508b.m135081a(false, 1, (Exception) null);
                    } else {
                        C42508b.m135081a(false, cVar.f113220a, cVar.f113222c);
                    }
                }

                /* renamed from: a */
                public final void mo70687a(CategoryPageModel categoryPageModel) {
                    if (TextUtils.isEmpty(C42508b.this.f110534d)) {
                        C42508b.this.f110534d = categoryPageModel.category_effects.version;
                    }
                    C42508b.this.f110532b = categoryPageModel.category_effects.cursor;
                    C42508b.this.f110533c = categoryPageModel.category_effects.sorting_position;
                    C42508b.this.f110535e = categoryPageModel.category_effects.has_more;
                    if (!C42508b.this.mo104094a(categoryPageModel, false, false)) {
                        C42508b.this.mo104097b(false);
                    }
                    if (C42508b.this.f110537g) {
                        C42508b.this.f110537g = false;
                    }
                    C42508b.m135081a(true, 0, (Exception) null);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo104084a() {
        if (m135086f()) {
            C42961az.m136382c(this.f110540j);
            this.f110540j.mo104016a();
            if (this.f110540j.getDataCount() == 0) {
                this.f110540j.mo104022b();
                m135089i();
            } else if (this.f110540j.f110464f) {
                m135089i();
            } else {
                this.f110540j.mo104023c();
            }
        }
        C6907h.m21524a("enter_mv_shoot_page", (Map) m135091k().mo59973a("content_source", "upload").mo59973a("content_type", "mv").mo59973a("enter_method", C42537b.m135190c()).f60753a);
        C42537b.m135192d("change_mode");
    }

    /* renamed from: a */
    public final void mo104086a(MvThemeData mvThemeData) {
        m135080a("mv_show", mvThemeData, 0);
    }

    /* renamed from: a */
    public final void mo104085a(ShortVideoContext shortVideoContext) {
        this.f110543m = shortVideoContext;
        if (this.f110543m != null) {
            this.f110546p = this.f110543m.f99787w;
            this.f110548r = this.f110543m.f99788x;
            this.f110547q = this.f110543m.f99790z;
        }
    }

    /* renamed from: b */
    private static String m135082b(Effect effect) {
        if (effect == null) {
            return null;
        }
        List<String> tags = effect.getTags();
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
    private void m135085c(boolean z) {
        if (this.f110538h != null && !this.f110538h.isFinishing()) {
            if (this.f110541k == null) {
                this.f110541k = new EffectPlatform(this.f110538h, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
            }
            this.f110541k.mo70641b("mv", false, new C43757g(false) {
                /* renamed from: a */
                public final void mo9274a(C43726c cVar) {
                    C42508b.this.mo104092a(false);
                    if (cVar == null) {
                        C42508b.m135081a(false, 1, (Exception) null);
                    } else {
                        C42508b.m135081a(false, cVar.f113220a, cVar.f113222c);
                    }
                }

                /* renamed from: a */
                public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                    if (!C42508b.this.mo104095a(effectChannelResponse, false, false)) {
                        C42508b.this.mo104092a(false);
                    }
                    C42508b.m135081a(true, 0, (Exception) null);
                }
            });
        }
    }

    /* renamed from: b */
    private void m135083b(MvThemeData mvThemeData) {
        if (mvThemeData != null && mvThemeData.f110497c > 0) {
            String e = mvThemeData.mo104050e();
            if (C7276d.m22812b(e)) {
                mvThemeData.f110506l = this.f110553w;
                Bundle bundle = new Bundle();
                bundle.putInt("key_photo_select_min_count", mvThemeData.f110497c);
                bundle.putInt("key_photo_select_max_count", mvThemeData.f110498d);
                bundle.putString("key_mv_hint_text", mvThemeData.mo104055j());
                bundle.putString("key_mv_resource_zip_path", e);
                bundle.putParcelable("key_select_mv_data", mvThemeData);
                bundle.putParcelable("key_short_video_context", this.f110543m);
                bundle.putInt("key_support_flag", 3);
                String b = m135082b(mvThemeData.f110495a);
                if (b != null) {
                    bundle.putString("Key_challenge_id", b);
                }
                if (mvThemeData.f110495a != null) {
                    bundle.putString("key_sdk_extra_data", mvThemeData.f110495a.getSdkExtra());
                }
                bundle.putString("key_mv_algorithm_hint", mvThemeData.mo104057l());
                bundle.putInt("key_choose_scene", 2);
                MvChoosePhotoActivity.m128154a(this.f110538h, bundle, 10001);
            }
        }
    }

    /* renamed from: b */
    public final void mo104097b(boolean z) {
        this.f110537g = true;
        this.f110541k.mo70632a("mv", "all", true, 20, this.f110532b, this.f110533c, this.f110534d, new C43756f(false) {
            /* renamed from: a */
            public final void mo70686a(C43726c cVar) {
                if (!false) {
                    C42508b.this.mo104091a(C42508b.this.f110531a);
                }
                if (C42508b.this.f110537g) {
                    C42508b.this.f110537g = false;
                }
            }

            /* renamed from: a */
            public final void mo70687a(CategoryPageModel categoryPageModel) {
                if (TextUtils.isEmpty(C42508b.this.f110534d)) {
                    C42508b.this.f110534d = categoryPageModel.category_effects.version;
                }
                C42508b.this.f110532b = categoryPageModel.category_effects.cursor;
                C42508b.this.f110533c = categoryPageModel.category_effects.sorting_position;
                C42508b.this.f110535e = categoryPageModel.category_effects.has_more;
                if (C42508b.this.mo104094a(categoryPageModel, false, false)) {
                    C42508b.this.f110536f = true;
                }
                if (C42508b.this.f110537g) {
                    C42508b.this.f110537g = false;
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo104089a(Effect effect) {
        this.f110542l = effect;
        if (effect == null) {
            if (this.f110551u) {
                m135088h();
                return;
            }
            m135087g();
        }
    }

    /* renamed from: a */
    public final void mo104090a(Boolean bool) {
        this.f110545o = bool.booleanValue();
        if (this.f110540j != null) {
            this.f110540j.mo104019a(bool);
        }
    }

    public C42508b(FragmentActivity fragmentActivity, ViewStubCompat viewStubCompat) {
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            this.f110538h = fragmentActivity;
            this.f110539i = viewStubCompat;
            this.f110541k = new EffectPlatform(fragmentActivity, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
            this.f110531a = this.f110538h.getResources().getString(R.string.b23);
            this.f110544n = this.f110538h.getResources().getString(R.string.btr);
            this.f110551u = C35563c.f93231M.mo93305a(Property.UseNewMvStruct);
        }
    }

    /* renamed from: b */
    private void m135084b(MvThemeData mvThemeData, int i) {
        if (!C42544g.m135197a(mvThemeData.f110495a.getId())) {
            new C10741a(this.f110538h).mo25653a(this.f110538h.getResources().getString(R.string.e9k)).mo25660b(this.f110538h.getResources().getString(R.string.x)).mo25661b(this.f110538h.getResources().getString(R.string.u), (OnClickListener) null).mo25654a(this.f110538h.getResources().getString(R.string.t), (OnClickListener) new C42542e(this, mvThemeData)).mo25656a().mo25638b().show();
        } else if (!C7276d.m22812b(mvThemeData.mo104050e())) {
            this.f110540j.mo104028f();
        } else {
            m135083b(mvThemeData);
            m135080a("select_mv", mvThemeData, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo104088a(MvThemeData mvThemeData, DialogInterface dialogInterface, int i) {
        C42544g.m135196a(mvThemeData.f110495a.getId(), true);
        this.f110540j.mo104028f();
    }

    /* renamed from: a */
    private void m135080a(String str, MvThemeData mvThemeData, int i) {
        if (mvThemeData != null) {
            C6907h.m21524a(str, (Map) m135091k().mo59973a("mv_id", mvThemeData.mo104044a()).mo59973a("mv_name", mvThemeData.mo104053h()).mo59970a("impr_position", i + 1).f60753a);
        }
    }

    /* renamed from: a */
    public static void m135081a(boolean z, int i, Exception exc) {
        JSONObject jSONObject = null;
        if (z) {
            C6893q.m21444a("mv_resource_list_download_error_state", 0, (JSONObject) null);
            return;
        }
        if (exc != null) {
            jSONObject = C38510bb.m123095a().mo96481a("exception", C13315l.m38963c(exc)).mo96481a("event", C41494t.m132184a().mo102150b().toString()).mo96482b();
        }
        C6893q.m21444a("mv_resource_list_download_error_state", i, jSONObject);
    }

    /* renamed from: a */
    public final void mo104087a(MvThemeData mvThemeData, int i, int i2) {
        if (i == 2) {
            dismiss();
            if (this.f110538h instanceof VideoRecordNewActivity) {
                ((VideoRecordNewActivity) this.f110538h).f107267H.mo97896J().mo103594a((Object) this.f110540j.getCloseView(), (C42155av) new C42347l("close_view"));
            }
        } else if (i == 1) {
            if (!m135086f() || this.f110540j.getVisibility() == 0) {
                m135083b(mvThemeData);
                m135080a("select_mv", mvThemeData, i2);
            }
        } else if (i == 3) {
            m135080a("mv_show", mvThemeData, i2);
        }
    }
}
