package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.p1408b.C33772g;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35005a;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35005a.C35006a;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35007b;
import com.p280ss.android.ugc.aweme.poi.utils.C35444d;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.m */
public final class C35392m implements C27746c {

    /* renamed from: a */
    public PoiBundle f92845a;

    /* renamed from: b */
    private AbsFragment f92846b;

    /* renamed from: c */
    private CheckableImageView[] f92847c;

    /* renamed from: d */
    private C27743a f92848d = new C27743a();

    /* renamed from: e */
    private boolean f92849e;

    /* renamed from: f */
    private PoiStruct f92850f;

    /* renamed from: g */
    private C35481c f92851g;

    /* renamed from: h */
    private View f92852h;

    /* renamed from: i */
    private boolean f92853i;

    /* renamed from: e */
    private Activity m114335e() {
        return this.f92846b.getActivity();
    }

    /* renamed from: g */
    private void m114337g() {
        this.f92849e = !this.f92849e;
    }

    public C35392m() {
        this.f92848d.mo66537a(this);
    }

    /* renamed from: i */
    private void m114339i() {
        if (this.f92852h != null) {
            this.f92852h.post(new C35395o(this));
        }
    }

    /* renamed from: b */
    public final void mo90123b() {
        if (this.f92851g != null && this.f92851g.isShowing()) {
            this.f92851g.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void mo90125d() {
        CheckableImageView[] checkableImageViewArr;
        if (this.f92850f != null) {
            this.f92848d.mo56976a(Integer.valueOf(4), this.f92850f.getPoiId(), Integer.valueOf(true ^ this.f92849e ? 1 : 0));
            m114337g();
            if (this.f92847c != null) {
                for (CheckableImageView checkableImageView : this.f92847c) {
                    if (checkableImageView != null) {
                        checkableImageView.mo86445a(checkableImageView.getAlpha());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90117a() {
        CheckableImageView[] checkableImageViewArr;
        if (this.f92847c != null) {
            for (CheckableImageView checkableImageView : this.f92847c) {
                if (checkableImageView != null) {
                    Object tag = checkableImageView.getTag(R.id.axz);
                    int i = R.drawable.alg;
                    if (tag == null || !(tag instanceof Boolean) || !((Boolean) tag).booleanValue()) {
                        if (!this.f92849e) {
                            i = R.drawable.a5f;
                        }
                        checkableImageView.setImageResource(i);
                    } else {
                        if (!this.f92849e) {
                            i = R.drawable.b1o;
                        }
                        checkableImageView.setImageResource(i);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private void m114338h() {
        String str;
        String str2;
        if (this.f92850f != null) {
            C35006a c = new C35006a().mo88752a("poi_page").mo88754b(this.f92850f.getPoiId()).mo88755c(this.f92850f.getTypeCode());
            if (this.f92845a != null) {
                str = this.f92845a.awemeid;
            } else {
                str = "";
            }
            C35006a d = c.mo88756d(str);
            if (this.f92845a != null) {
                str2 = this.f92845a.from;
            } else {
                str2 = "";
            }
            C35005a a = d.mo88757e(str2).mo88751a(this.f92850f).mo88758f("click_button").mo88753a();
            if (this.f92849e) {
                C35007b.m113004b(a);
                C35444d.m114493c((Context) m114335e(), ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(this.f92845a.awemeid), this.f92850f.getPoiId());
            } else {
                C35007b.m113002a(a);
                C35444d.m114491b((Context) m114335e(), ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(this.f92845a.awemeid), this.f92850f.getPoiId());
            }
            if (this.f92845a != null && ((TextUtils.equals(this.f92845a.from, "search_result") || TextUtils.equals(this.f92845a.from, "general_search")) && !this.f92849e)) {
                C6903bc.m21496o().mo88914a("search_favourite", "poi_page", this.f92850f.getPoiId(), TextUtils.equals(this.f92845a.from, "search_result"));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo90124c() {
        int i;
        if (this.f92846b != null && this.f92846b.isViewValid() && m114335e() != null) {
            if (this.f92851g == null || !this.f92851g.isShowing()) {
                this.f92851g = new C35481c(m114335e());
                View inflate = ((LayoutInflater) m114335e().getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.b3r, null);
                ((DmtTextView) inflate.findViewById(R.id.dh_)).setText(R.string.cxr);
                ((DmtTextView) inflate.findViewById(R.id.dha)).setText(R.string.cyj);
                ((LinearLayout) inflate.findViewById(R.id.bqv)).setOnClickListener(new C35396p(this));
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.leftMargin = (int) C9738o.m28708b((Context) m114335e(), 4.0f);
                inflate.findViewById(R.id.dha).setLayoutParams(layoutParams);
                this.f92851g.mo90251a((int) C9738o.m28708b((Context) m114335e(), 202.0f), (int) C9738o.m28708b((Context) m114335e(), 50.0f));
                this.f92851g.mo90276f(Color.parseColor("#33FFFFFF"));
                this.f92851g.f93104l = 200;
                this.f92851g.f93105m = 200;
                this.f92851g.mo90254a(inflate);
                this.f92851g.f93102j = 3000;
                if (this.f92853i) {
                    i = -16;
                } else {
                    i = -4;
                }
                float width = (float) ((this.f92851g.getWidth() - this.f92852h.getWidth()) / 2);
                this.f92851g.f93096d = i;
                this.f92851g.mo90256a(this.f92852h, (int) width, (int) (-width));
            }
        }
    }

    /* renamed from: a */
    public final void mo61805a(Exception exc) {
        C6921a.m21559a((Throwable) exc);
        m114337g();
        mo90117a();
    }

    /* renamed from: a */
    public final void mo90118a(int i) {
        if (this.f92850f != null) {
            if (i == 0) {
                this.f92849e = false;
            } else {
                this.f92849e = true;
            }
            this.f92850f.setCollectStatus(i);
            mo90117a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90119a(View view) {
        C35454m.m114527a(this.f92850f, "click_favourite_hint", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("poi_id", this.f92850f.getPoiId()));
        this.f92851g.dismiss();
        C7195s.m22438a().mo18682a("aweme://favorite?enter_from=poi_page&enter_method=click_favourite_hint&tab_name=location");
    }

    /* renamed from: a */
    public final void mo61803a(BaseResponse baseResponse) {
        if (this.f92849e) {
            this.f92850f.setCollectStatus(1);
            C42961az.m136380a(new C33772g(1, this.f92850f));
            m114339i();
            Keva repo = Keva.getRepo("poi_repo");
            if (repo != null) {
                repo.storeLong("collect_action_latest_time", System.currentTimeMillis());
            }
            return;
        }
        this.f92850f.setCollectStatus(0);
        C42961az.m136380a(new C33772g(0, this.f92850f));
        mo90123b();
    }

    /* renamed from: a */
    public final void mo90121a(View view, boolean z) {
        m114338h();
        this.f92852h = view;
        if (!C6861a.m21337f().isLogin()) {
            C32656f.m105745a(m114335e(), "poi_page", "click_favorite_poi", (C23305g) new C35394n(this));
            return;
        }
        this.f92853i = z;
        mo90125d();
    }

    /* renamed from: a */
    public final void mo90122a(AbsFragment absFragment, CheckableImageView... checkableImageViewArr) {
        CheckableImageView[] checkableImageViewArr2;
        this.f92846b = absFragment;
        this.f92847c = checkableImageViewArr;
        if (this.f92847c != null) {
            for (CheckableImageView checkableImageView : this.f92847c) {
                if (checkableImageView != null) {
                    checkableImageView.setOnStateChangeListener(new C33833a() {
                        /* renamed from: a */
                        public final void mo61810a() {
                        }

                        /* renamed from: a */
                        public final void mo61811a(int i) {
                            if (i == 1) {
                                C35392m.this.mo90117a();
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90120a(View view, PoiDetail poiDetail, boolean z) {
        if (poiDetail != null) {
            this.f92850f = poiDetail.getPoiStruct();
            this.f92849e = poiDetail.isCollected();
            mo90117a();
        }
    }
}
