package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10819b;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10820c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33766a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33768c;
import com.p280ss.android.ugc.aweme.music.p1408b.C33773h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicTabView */
public final class MusicTabView {

    /* renamed from: a */
    private int f88449a;

    /* renamed from: b */
    private final View f88450b;

    /* renamed from: c */
    private final boolean f88451c;
    public DmtTabLayout tabLayout;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicTabView$a */
    static final class C33892a implements C10819b {

        /* renamed from: a */
        public static final C33892a f88452a = new C33892a();

        C33892a() {
        }

        /* renamed from: a */
        public final void mo26115a(C10825f fVar) {
            fVar.mo26137a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicTabView$b */
    public static final class C33893b implements C10820c {

        /* renamed from: a */
        final /* synthetic */ MusicTabView f88453a;

        C33893b(MusicTabView musicTabView) {
            this.f88453a = musicTabView;
        }

        /* renamed from: b */
        public final void mo26116b(C10825f fVar) {
            if (fVar != null) {
                this.f88453a.mo86559a(fVar.f29291e);
            }
        }
    }

    /* renamed from: a */
    public final void mo86558a() {
        this.f88450b.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo86560b() {
        this.f88450b.setVisibility(8);
    }

    /* renamed from: h */
    private static boolean m109271h() {
        if (C33703a.m108720d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m109267d() {
        if (this.f88449a != 0) {
            mo86561b(0);
            C42961az.m136380a(new C33773h(0));
            C42961az.m136381b(new C33768c("popular_song"));
            C23888c.m78196b(0);
            C6907h.m21524a("change_music_tab", (Map) C22984d.m75611a().mo59973a("tab_name", "popular_song").f60753a);
        }
    }

    /* renamed from: f */
    private final void m109269f() {
        if (this.f88449a != 2) {
            mo86561b(2);
            C42961az.m136380a(new C33773h(2));
            C23888c.m78195b();
            C6907h.m21524a("change_music_tab", (Map) C22984d.m75611a().mo59973a("tab_name", "local_song").f60753a);
        }
    }

    /* renamed from: c */
    private final void m109266c() {
        m109270g();
        DmtTabLayout dmtTabLayout = this.tabLayout;
        if (dmtTabLayout == null) {
            C7573i.m23583a("tabLayout");
        }
        dmtTabLayout.setSelectedTabIndicatorHeight(C23486n.m77122a(2.0d));
        DmtTabLayout dmtTabLayout2 = this.tabLayout;
        if (dmtTabLayout2 == null) {
            C7573i.m23583a("tabLayout");
        }
        dmtTabLayout2.setTabMode(0);
        DmtTabLayout dmtTabLayout3 = this.tabLayout;
        if (dmtTabLayout3 == null) {
            C7573i.m23583a("tabLayout");
        }
        dmtTabLayout3.setAutoFillWhenScrollable(true);
        DmtTabLayout dmtTabLayout4 = this.tabLayout;
        if (dmtTabLayout4 == null) {
            C7573i.m23583a("tabLayout");
        }
        dmtTabLayout4.setOnTabClickListener(C33892a.f88452a);
        DmtTabLayout dmtTabLayout5 = this.tabLayout;
        if (dmtTabLayout5 == null) {
            C7573i.m23583a("tabLayout");
        }
        dmtTabLayout5.mo26058a((C10820c) new C33893b(this));
    }

    /* renamed from: e */
    private final void m109268e() {
        IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
        C7573i.m23582a((Object) userService, "ServiceManager.get().get…class.java).userService()");
        if (!userService.isLogin()) {
            C42961az.m136380a(new C33766a(true));
        } else if (this.f88449a != 1) {
            mo86561b(1);
            C42961az.m136380a(new C33773h(1));
            C42961az.m136381b(new C33768c("music_collection"));
            C23888c.m78196b(1);
            C6907h.m21524a("change_music_tab", (Map) C22984d.m75611a().mo59973a("tab_name", "favorite_song").f60753a);
        }
    }

    /* renamed from: g */
    private final void m109270g() {
        DmtTabLayout dmtTabLayout = this.tabLayout;
        if (dmtTabLayout == null) {
            C7573i.m23583a("tabLayout");
        }
        C10825f a = dmtTabLayout.mo26053a((int) R.layout.zp);
        C7573i.m23582a((Object) a, "tabLayout.newTab(R.layou…em_music_tab_layout_item)");
        a.mo26138b((int) R.string.chy);
        DmtTabLayout dmtTabLayout2 = this.tabLayout;
        if (dmtTabLayout2 == null) {
            C7573i.m23583a("tabLayout");
        }
        dmtTabLayout2.mo26059a(a);
        DmtTabLayout dmtTabLayout3 = this.tabLayout;
        if (dmtTabLayout3 == null) {
            C7573i.m23583a("tabLayout");
        }
        C10825f a2 = dmtTabLayout3.mo26053a((int) R.layout.zp);
        C7573i.m23582a((Object) a2, "tabLayout.newTab(R.layou…em_music_tab_layout_item)");
        a2.mo26138b((int) R.string.chu);
        DmtTabLayout dmtTabLayout4 = this.tabLayout;
        if (dmtTabLayout4 == null) {
            C7573i.m23583a("tabLayout");
        }
        dmtTabLayout4.mo26059a(a2);
        if (this.f88451c) {
            DmtTabLayout dmtTabLayout5 = this.tabLayout;
            if (dmtTabLayout5 == null) {
                C7573i.m23583a("tabLayout");
            }
            C10825f a3 = dmtTabLayout5.mo26053a((int) R.layout.zp);
            C7573i.m23582a((Object) a3, "tabLayout.newTab(R.layou…em_music_tab_layout_item)");
            if (m109271h()) {
                a3.mo26138b((int) R.string.chx);
            } else {
                a3.mo26138b((int) R.string.chw);
            }
            DmtTabLayout dmtTabLayout6 = this.tabLayout;
            if (dmtTabLayout6 == null) {
                C7573i.m23583a("tabLayout");
            }
            dmtTabLayout6.mo26059a(a3);
        }
    }

    /* renamed from: a */
    public final void mo86559a(int i) {
        switch (i) {
            case 0:
                m109267d();
                return;
            case 1:
                m109268e();
                return;
            case 2:
                m109269f();
                break;
        }
    }

    /* renamed from: b */
    public final void mo86561b(int i) {
        this.f88449a = i;
        DmtTabLayout dmtTabLayout = this.tabLayout;
        if (dmtTabLayout == null) {
            C7573i.m23583a("tabLayout");
        }
        C10825f b = dmtTabLayout.mo26066b(i);
        if (b != null) {
            b.mo26137a();
        }
    }

    public MusicTabView(View view, boolean z) {
        C7573i.m23587b(view, "view");
        this.f88450b = view;
        this.f88451c = z;
        ButterKnife.bind((Object) this, this.f88450b);
        m109266c();
    }
}
