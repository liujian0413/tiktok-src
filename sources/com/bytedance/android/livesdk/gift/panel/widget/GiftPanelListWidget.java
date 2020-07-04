package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.gift.C3435e;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4416ah;
import com.bytedance.android.livesdk.chatroom.p210c.C4298a;
import com.bytedance.android.livesdk.chatroom.p220ui.RtlViewPagerShower;
import com.bytedance.android.livesdk.chatroom.p220ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8262q;
import com.bytedance.android.livesdk.gift.C8284u;
import com.bytedance.android.livesdk.gift.C8284u.C8285a;
import com.bytedance.android.livesdk.gift.C8289y;
import com.bytedance.android.livesdk.gift.C8289y.C8290a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.combo.DouyinGiftCombHelper;
import com.bytedance.android.livesdk.gift.holder.BaseGiftPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;
import com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter;
import com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter.C8111a;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.model.p390a.C8136c;
import com.bytedance.android.livesdk.gift.model.p390a.C8138e;
import com.bytedance.android.livesdk.gift.model.p390a.C8139f;
import com.bytedance.android.livesdk.gift.model.p390a.C8140g;
import com.bytedance.android.livesdk.gift.model.p390a.C8141h;
import com.bytedance.android.livesdk.gift.model.p390a.C8142i;
import com.bytedance.android.livesdk.gift.model.p390a.C8143j;
import com.bytedance.android.livesdk.gift.model.p390a.C8144k;
import com.bytedance.android.livesdk.gift.panel.p391a.C8168a;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.gift.panel.p391a.C8170c;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.SendGiftType;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.SendToType;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.model.C8549ck;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdk.widget.SendGiftAnimationView.C9216a;
import com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p458j.p459a.C9494e;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.Widget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class GiftPanelListWidget extends Widget implements C8111a, C8285a, C8290a, C6310a {

    /* renamed from: A */
    private final List<GiftPage> f22525A = new ArrayList();

    /* renamed from: B */
    private final Map<GiftPage, List<C8135b>> f22526B = new HashMap();

    /* renamed from: C */
    private int f22527C = 1;

    /* renamed from: D */
    private int f22528D = -1;

    /* renamed from: E */
    private boolean f22529E;

    /* renamed from: F */
    private C3435e f22530F = new C3435e() {
        /* renamed from: a */
        public final void mo8799a(List<C8149d> list) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                if (GiftPanelListWidget.this.f22534a.f22455c == SendToType.GUEST) {
                    GiftManager.filterInteractNotSupportGift(arrayList, GiftPanelListWidget.this.f22535b);
                } else {
                    GiftManager.filterNotSupportGift(arrayList, GiftPanelListWidget.this.f22535b);
                }
                GiftManager.filterNotDisplayedOnPanel(arrayList);
                GiftPanelListWidget.this.mo21378d((List<C8149d>) arrayList);
            }
        }
    };

    /* renamed from: G */
    private SparseArray<C8136c> f22531G = new SparseArray<>();

    /* renamed from: H */
    private C8149d f22532H;

    /* renamed from: I */
    private C7321c f22533I;

    /* renamed from: a */
    public GiftDialogViewModel f22534a;

    /* renamed from: b */
    public boolean f22535b;

    /* renamed from: c */
    public int f22536c;

    /* renamed from: d */
    private LoadingStatusView f22537d;

    /* renamed from: e */
    private RecyclerView f22538e;

    /* renamed from: f */
    private AbsGiftAdapter f22539f;

    /* renamed from: g */
    private RtlViewPagerShower f22540g;

    /* renamed from: h */
    private DouyinGiftCombHelper f22541h;

    /* renamed from: i */
    private Handler f22542i = new C6309f(this);

    /* renamed from: j */
    private Room f22543j;

    /* renamed from: k */
    private boolean f22544k;

    /* renamed from: l */
    private boolean f22545l;

    /* renamed from: m */
    private PanelType f22546m = PanelType.GIFT;

    /* renamed from: n */
    private int f22547n;

    /* renamed from: o */
    private int f22548o;

    /* renamed from: p */
    private int f22549p = ((Integer) C5864b.f17252G.mo10240a()).intValue();

    /* renamed from: q */
    private C8135b f22550q;

    /* renamed from: r */
    private List<C8135b> f22551r = new ArrayList();

    /* renamed from: s */
    private View f22552s;

    /* renamed from: t */
    private boolean f22553t;

    /* renamed from: u */
    private String f22554u;

    /* renamed from: v */
    private List<C8139f> f22555v = new ArrayList();

    /* renamed from: w */
    private List<C8139f> f22556w = new ArrayList();

    /* renamed from: x */
    private List<C8139f> f22557x = new ArrayList();

    /* renamed from: y */
    private List<C8141h> f22558y = new ArrayList();

    /* renamed from: z */
    private List<C8139f> f22559z = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$a */
    enum C8215a {
        DATA_TYPE_GIFT,
        DATA_TYPE_PROP,
        DATA_TYPE_BANNER
    }

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$b */
    class C8216b extends SSGridLayoutManager {

        /* renamed from: K */
        public boolean f22570K = true;

        /* renamed from: e */
        public final boolean mo5438e() {
            if (!super.mo5438e() || !this.f22570K) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo5441f() {
            if (!super.mo5441f() || !this.f22570K) {
                return false;
            }
            return true;
        }

        public C8216b(Context context, int i, int i2, boolean z) {
            super(context, 2, 0, false);
        }
    }

    public int getLayoutId() {
        return R.layout.ang;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21368a(C8169b bVar) {
        m25177b(bVar != null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21369a(PanelType panelType) {
        switch (panelType) {
            case GIFT:
            case FANS_CLUB_GIFT:
            case HONOR_LEVEL_GIFT:
                if (this.f22528D == 0 || this.f22528D == -1) {
                    m25173a(C8215a.DATA_TYPE_GIFT);
                    return;
                } else if (this.f22528D == 1) {
                    m25185d(0);
                    return;
                }
                break;
            case PROP:
                if (this.f22528D != 0 && this.f22528D != -1) {
                    if (this.f22528D == 1) {
                        m25185d(1);
                        break;
                    }
                } else {
                    m25173a(C8215a.DATA_TYPE_PROP);
                    return;
                }
                break;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21370a(C9216a aVar) throws Exception {
        if (this.f22534a != null) {
            this.f22534a.mo21344c();
            this.f22534a.f22446H.postValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public final void mo20800a(List<Prop> list) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            Prop prop = (Prop) list.get(0);
            if (!(prop == null || prop.banner == null)) {
                this.f22554u = prop.banner.f25628f;
            }
            m25194h(list);
        }
        View view = this.f22552s;
        if (this.f22553t) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: e */
    private List<C8135b> m25187e() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f22556w);
        return arrayList;
    }

    /* renamed from: f */
    private List<C8135b> m25189f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f22557x);
        return arrayList;
    }

    /* renamed from: g */
    private List<C8135b> m25191g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f22559z);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo20799a() {
        int i;
        View view = this.f22552s;
        if (this.f22553t) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: i */
    private void m25195i() {
        C82112 r0 = new GridPagerSnapHelper() {
            /* renamed from: a */
            public final View mo20745a(C1273i iVar) {
                View a = super.mo20745a(iVar);
                if (a == null) {
                    return null;
                }
                GiftPanelListWidget.this.f22536c = C1273i.m6060c(a);
                GiftPanelListWidget.this.mo21367a(GiftPanelListWidget.this.f22536c);
                return a;
            }

            /* renamed from: a */
            public final int mo20744a(C1273i iVar, int i, int i2) {
                GiftPanelListWidget.this.f22536c = super.mo20744a(iVar, i, i2);
                GiftPanelListWidget.this.mo21367a(GiftPanelListWidget.this.f22536c);
                return GiftPanelListWidget.this.f22536c;
            }
        };
        r0.mo22743a(2).mo22746b(4);
        r0.mo22748a(this.f22538e);
        this.f22538e.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    GiftPanelListWidget.this.mo21367a(GiftPanelListWidget.this.f22536c);
                    super.onScrollStateChanged(recyclerView, i);
                }
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f22534a != null) {
            this.f22534a.mo21338a((C0043i) this);
        }
        C8284u.m25332a().mo21439b((C8285a) this);
        this.f22529E = false;
        C8289y.m25347a().mo21446b(this);
        if (this.f22533I != null && !this.f22533I.isDisposed()) {
            this.f22533I.dispose();
        }
    }

    /* renamed from: c */
    private void m25178c() {
        if (C8262q.m25255d(this.f22543j, this.f22535b) && ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            C8284u.m25332a().mo21438b(this.f22543j.getId());
        }
        if (C8262q.m25254c(this.f22543j, this.f22535b) && GiftManager.inst().isGiftListLoaded()) {
            this.f22528D = GiftManager.inst().getCurrentStrategyByLiveType();
            if (this.f22528D == 0) {
                mo21376b(GiftManager.inst().getGiftList());
            } else if (this.f22528D == 1) {
                mo21377c(GiftManager.inst().getGiftPageList());
            }
        }
        if (LiveSettingKeys.LIVE_GIFT_PANEL_BANNER_LIST.mo10240a() != null) {
            m25192g(((C8168a) LiveSettingKeys.LIVE_GIFT_PANEL_BANNER_LIST.mo10240a()).f22361a);
        }
    }

    /* renamed from: d */
    private List<C8135b> m25184d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f22555v);
        for (int i = 0; i < this.f22531G.size(); i++) {
            if (!arrayList.contains(this.f22531G.valueAt(i))) {
                if (this.f22531G.keyAt(i) < 0) {
                    arrayList.add(0, this.f22531G.valueAt(i));
                } else {
                    arrayList.add(Math.min(arrayList.size(), this.f22531G.keyAt(i)), this.f22531G.valueAt(i));
                }
            }
        }
        LongSparseArray<Integer> longSparseArray = new LongSparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8135b bVar = (C8135b) arrayList.get(i2);
            if (bVar.f22203a == 1) {
                longSparseArray.append(bVar.mo21275p(), Integer.valueOf(i2 + 1));
            }
        }
        this.f22534a.f22447I = longSparseArray;
        return arrayList;
    }

    /* renamed from: h */
    private List<C8135b> m25193h() {
        ArrayList arrayList = new ArrayList();
        if (this.f22532H != null) {
            arrayList.add(new C8143j(this.f22532H));
        }
        arrayList.addAll(this.f22558y);
        if (this.f22550q != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8135b bVar = (C8135b) it.next();
                if (bVar.f22203a == this.f22550q.f22203a && bVar.mo21275p() == this.f22550q.mo21275p()) {
                    bVar.f22204b = true;
                    this.f22550q = bVar;
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [android.support.v7.widget.RecyclerView$i] */
    /* JADX WARNING: type inference failed for: r0v28, types: [com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25175b() {
        /*
            r9 = this;
            android.view.View r0 = r9.contentView
            r1 = 2131301788(0x7f09159c, float:1.8221644E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView r0 = (com.bytedance.android.live.uikit.recyclerview.LoadingStatusView) r0
            r9.f22537d = r0
            android.view.View r0 = r9.contentView
            r1 = 2131299501(0x7f090cad, float:1.8217005E38)
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.p029v7.widget.RecyclerView) r0
            r9.f22538e = r0
            boolean r0 = r9.f22544k
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002a
            com.bytedance.android.livesdk.gift.impl.GiftAdapter r0 = new com.bytedance.android.livesdk.gift.impl.GiftAdapter
            android.content.Context r3 = r9.context
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.f22543j
            r0.<init>(r3, r4, r9, r1)
            goto L_0x0033
        L_0x002a:
            com.bytedance.android.livesdk.gift.impl.LandGiftAdapter r0 = new com.bytedance.android.livesdk.gift.impl.LandGiftAdapter
            android.content.Context r3 = r9.context
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.f22543j
            r0.<init>(r3, r4, r9, r2)
        L_0x0033:
            r9.f22539f = r0
            com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter r0 = r9.f22539f
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r3 = r9.f22534a
            boolean r3 = r3.f22460h
            r0.f22128c = r3
            com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter r0 = r9.f22539f
            com.bytedance.android.livesdk.gift.panel.widget.ac r3 = new com.bytedance.android.livesdk.gift.panel.widget.ac
            r3.<init>(r9)
            r0.mo21224a(r3)
            com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter r0 = r9.f22539f
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r3 = r9.f22534a
            r0.f22129d = r3
            android.support.v7.widget.RecyclerView r0 = r9.f22538e
            com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter r3 = r9.f22539f
            r0.setAdapter(r3)
            boolean r0 = r9.f22544k
            if (r0 == 0) goto L_0x0065
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$b r0 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$b
            android.content.Context r5 = r9.context
            r6 = 2
            r7 = 0
            r8 = 0
            r3 = r0
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            goto L_0x006c
        L_0x0065:
            com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager r0 = new com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager
            android.content.Context r3 = r9.context
            r0.<init>(r3, r2, r2)
        L_0x006c:
            android.support.v7.widget.RecyclerView r3 = r9.f22538e
            r3.setLayoutManager(r0)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r3 = r9.f22534a
            boolean r3 = r3.f22460h
            if (r3 == 0) goto L_0x007f
            boolean r3 = r9.f22544k
            if (r3 == 0) goto L_0x007f
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$b r0 = (com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget.C8216b) r0
            r0.f22570K = r2
        L_0x007f:
            android.support.v7.widget.RecyclerView r0 = r9.f22538e
            r0.setHasFixedSize(r1)
            android.support.v7.widget.RecyclerView r0 = r9.f22538e
            r1 = 16
            r0.setItemViewCacheSize(r1)
            android.view.View r0 = r9.contentView
            r1 = 2131300150(0x7f090f36, float:1.8218322E38)
            android.view.View r0 = r0.findViewById(r1)
            r9.f22552s = r0
            boolean r0 = r9.f22544k
            if (r0 == 0) goto L_0x009d
            r9.m25195i()
        L_0x009d:
            boolean r0 = r9.f22545l
            if (r0 == 0) goto L_0x00d7
            android.view.View r0 = r9.contentView
            r1 = 2131300351(0x7f090fff, float:1.821873E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r0 = (com.bytedance.android.livesdk.chatroom.p220ui.RtlViewPagerShower) r0
            r9.f22540g = r0
            com.bytedance.android.livesdk.gift.c.c r0 = com.bytedance.android.livesdk.gift.p373c.C7885d.m24168a()
            int r0 = r0.mo20678h()
            com.bytedance.android.livesdk.gift.c.c r1 = com.bytedance.android.livesdk.gift.p373c.C7885d.m24168a()
            int r1 = r1.mo20679i()
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r2 = r9.f22540g
            android.content.Context r3 = r9.context
            android.content.res.Resources r3 = r3.getResources()
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            android.content.Context r3 = r9.context
            android.content.res.Resources r3 = r3.getResources()
            android.graphics.drawable.Drawable r1 = r3.getDrawable(r1)
            r2.mo13412a(r0, r1)
        L_0x00d7:
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView r0 = r9.f22537d
            android.content.Context r1 = r9.context
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView$a r1 = com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a.m13075a(r1)
            android.content.Context r2 = r9.context
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165739(0x7f07022b, float:1.7945704E38)
            int r2 = r2.getDimensionPixelSize(r3)
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView$a r1 = r1.mo10834a(r2)
            r0.setBuilder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget.m25175b():void");
    }

    public void onCreate() {
        super.onCreate();
        if (this.dataCenter != null) {
            this.f22534a = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
            if (this.f22534a != null) {
                this.f22543j = this.f22534a.f22457e;
                this.f22544k = this.f22534a.f22454b;
                this.f22545l = this.f22544k;
                this.f22535b = this.f22534a.f22453a;
                C8284u.m25332a().mo21435a((C8285a) this);
                C8289y.m25347a().mo21444a(this);
                m25175b();
                m25178c();
                this.f22534a.f22466n.observe(this, new C8254v(this));
                this.f22534a.f22461i.observe(this, new C8255w(this));
                this.f22534a.f22444F.observe(this, new C8256x(this));
                this.f22534a.f22471s.observe(this, new C8257y(this));
                this.f22534a.f22473u.observe(this, new C8258z(this));
                this.f22534a.f22442D.observe(this, new C8219aa(this));
                this.f22533I = C9097a.m27146a().mo22266a(C9216a.class).mo19325f((C7326g<? super T>) new C8220ab<Object>(this));
            }
        }
    }

    /* renamed from: b */
    private void m25176b(String str) {
        ((C8931a) C3596c.m13172a(C8931a.class)).handle(this.context, Uri.parse(new C9494e(str).mo23522a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo21372a(boolean z) {
        if (z) {
            C1293v a = m25169a(this.f22550q);
            if (((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo10240a()).intValue() == 1) {
                m25170a(a);
            }
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 1100) {
            this.f22534a.mo21344c();
            this.f22534a.mo21345d();
        }
    }

    /* renamed from: a */
    private C1293v m25169a(C8135b bVar) {
        if (this.f22538e == null || this.f22539f == null || bVar == null) {
            return null;
        }
        C8135b a = this.f22539f.mo21222a(bVar.mo21275p());
        if (a == null) {
            return null;
        }
        return this.f22538e.mo5575f(this.f22539f.mo21220a(a));
    }

    /* renamed from: b */
    private static SendGiftType m25174b(C8134a aVar) {
        switch (aVar.f22203a) {
            case 1:
                return SendGiftType.GIFT;
            case 2:
                return SendGiftType.PROP;
            case 4:
                return SendGiftType.TASK_GIFT;
            case 6:
                return SendGiftType.GIFT_AD;
            case 7:
                if (!(aVar.f22206d instanceof C8149d)) {
                    return SendGiftType.NORMAL;
                }
                if (((C8149d) aVar.f22206d).f22234e == 5) {
                    return SendGiftType.TASK_GIFT;
                }
                return SendGiftType.GIFT;
            default:
                return SendGiftType.NORMAL;
        }
    }

    /* renamed from: e */
    private void m25188e(List<C8135b> list) {
        LongSparseArray<Integer> longSparseArray = new LongSparseArray<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C8135b bVar = (C8135b) list.get(i);
            if (bVar.f22206d instanceof C8149d) {
                longSparseArray.append(bVar.mo21275p(), Integer.valueOf(i + 1));
            }
        }
        this.f22534a.f22447I = longSparseArray;
    }

    /* renamed from: g */
    private void m25192g(List<C9357a> list) {
        if (list != null && !list.isEmpty()) {
            this.f22531G.clear();
            for (C9357a aVar : list) {
                this.f22531G.put(aVar.f25631i, new C8136c(aVar));
            }
            m25173a(C8215a.DATA_TYPE_BANNER);
        }
    }

    /* renamed from: a */
    private void m25170a(C1293v vVar) {
        if (vVar != null) {
            if (this.f22541h == null) {
                this.f22541h = new DouyinGiftCombHelper();
            }
            this.f22541h.handleComboClick((BasePanelViewHolder) vVar);
            if (this.f22542i.hasMessages(1100)) {
                this.f22542i.removeMessages(1100);
            }
            this.f22542i.sendEmptyMessageDelayed(1100, ((long) this.f22549p) * 1000);
        }
    }

    /* renamed from: b */
    private void m25177b(boolean z) {
        for (C8135b bVar : this.f22551r) {
            bVar.f22205c = z;
        }
        this.f22539f.mo21225a(this.f22551r);
    }

    /* renamed from: i */
    private void m25196i(List<C8135b> list) {
        int i;
        int i2;
        int i3;
        if (list != null && this.f22539f != null) {
            this.f22551r = list;
            this.f22553t = !list.isEmpty();
            RecyclerView recyclerView = this.f22538e;
            if (this.f22553t) {
                i = 0;
            } else {
                i = 4;
            }
            recyclerView.setVisibility(i);
            if (this.f22545l) {
                RtlViewPagerShower rtlViewPagerShower = this.f22540g;
                if (this.f22553t) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                rtlViewPagerShower.setVisibility(i3);
            }
            this.f22539f.mo21225a(list);
            if (this.f22553t) {
                i2 = ((list.size() - 1) / 8) + 1;
            } else {
                i2 = 0;
            }
            this.f22548o = i2;
            if (!this.f22544k) {
                this.f22548o = 0;
            }
            this.f22534a.f22474v.postValue(Integer.valueOf(this.f22548o));
            if (this.f22545l) {
                this.f22540g.mo13411a(this.f22548o, this.f22547n);
            }
            if (this.f22550q != null) {
                this.f22550q = this.f22539f.mo21222a(this.f22550q.mo21275p());
            }
        }
    }

    /* renamed from: a */
    private void m25171a(C8134a aVar) {
        C8134a aVar2;
        C0052o<C8134a> oVar = this.f22534a.f22470r;
        if (aVar.f22204b) {
            aVar2 = aVar;
        } else {
            aVar2 = null;
        }
        oVar.postValue(aVar2);
        int i = 0;
        this.f22534a.f22465m.postValue(Boolean.valueOf(false));
        C0052o<Integer> oVar2 = this.f22534a.f22439A;
        if (aVar.f22204b) {
            i = aVar.mo21260a();
        }
        oVar2.postValue(Integer.valueOf(i));
        if (!aVar.f22204b || !aVar.mo21265f()) {
            if (aVar.f22204b && aVar.mo21267h()) {
                m25176b(aVar.mo21268i());
                Set set = (Set) C8946b.f24352D.mo22117a();
                set.add(String.valueOf(aVar.mo21275p()));
                C8946b.f24352D.mo22118a(set);
            }
            return;
        }
        new C9249a(this.context, 1).mo22727c((CharSequence) aVar.mo21266g()).mo22722b(2, (int) R.string.f96, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo22729d();
        Set set2 = (Set) C8946b.f24351C.mo22117a();
        set2.add(Long.valueOf(aVar.mo21275p()));
        C8946b.f24351C.mo22118a(set2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo21373b(int i) {
        GiftPage giftPage;
        if (this.f22527C != i) {
            Iterator it = this.f22525A.iterator();
            while (true) {
                if (!it.hasNext()) {
                    giftPage = null;
                    break;
                }
                giftPage = (GiftPage) it.next();
                if (giftPage != null && giftPage.pageType == i) {
                    break;
                }
            }
            if (giftPage != null) {
                this.f22527C = i;
                this.f22547n = 0;
                this.f22536c = 0;
                this.f22550q = null;
                if (this.f22539f != null) {
                    this.f22539f.mo21226b();
                    this.f22539f.mo21223a();
                }
                if (!this.f22544k) {
                    this.f22538e.mo5541b(0);
                }
                if (i == 5) {
                    m25196i(m25193h());
                    return;
                }
                List<C8135b> list = (List) this.f22526B.get(giftPage);
                if (list != null) {
                    for (C8135b bVar : list) {
                        if (bVar != null) {
                            bVar.f22204b = false;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    if (i == 1) {
                        m25188e(arrayList);
                    }
                    m25196i(arrayList);
                }
            }
        }
    }

    /* renamed from: d */
    private void m25185d(int i) {
        if (!this.f22526B.isEmpty() || (this.f22558y != null && !this.f22558y.isEmpty())) {
            this.f22537d.setVisibility(8);
            this.f22539f.mo21223a();
            switch (i) {
                case 0:
                    GiftPage giftPage = null;
                    Iterator it = this.f22525A.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            GiftPage giftPage2 = (GiftPage) it.next();
                            if (giftPage2 != null && giftPage2.display) {
                                giftPage = giftPage2;
                            }
                        }
                    }
                    if (!(giftPage == null || this.f22527C == 5)) {
                        List list = (List) this.f22526B.get(giftPage);
                        if (list != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(list);
                            if (giftPage.pageType == 1) {
                                m25188e(arrayList);
                            }
                            m25196i(arrayList);
                        }
                        return;
                    }
                    break;
                case 1:
                    if (this.f22527C == 5) {
                        m25196i(m25193h());
                    }
                    this.f22534a.f22462j.postValue(Boolean.valueOf(C8284u.m25332a().mo21441c()));
                    this.f22534a.f22463k.postValue(Boolean.valueOf(C8284u.m25332a().mo21440b()));
                    break;
            }
            return;
        }
        this.f22537d.mo10831d();
    }

    /* renamed from: f */
    private void m25190f(List<GiftPage> list) {
        if (list != null && !list.isEmpty()) {
            this.f22526B.clear();
            for (GiftPage giftPage : list) {
                if (giftPage.pageType != 5) {
                    ArrayList arrayList = new ArrayList();
                    for (C8149d dVar : giftPage.gifts) {
                        if (dVar.f22222A == 2) {
                            C9357a aVar = new C9357a();
                            aVar.f25628f = dVar.f22223B;
                            aVar.f25625c = dVar.f22231b;
                            aVar.f25629g = dVar.f22230a;
                            arrayList.add(new C8136c(aVar));
                        } else if (dVar.f22234e == 5) {
                            this.f22532H = dVar;
                        } else if (dVar.f22234e == 3) {
                            arrayList.add(new C8142i(dVar));
                        } else if (dVar.f22234e == 9) {
                            arrayList.add(new C8140g(dVar));
                        } else {
                            arrayList.add(new C8139f(dVar));
                        }
                    }
                    this.f22526B.put(giftPage, arrayList);
                }
            }
            m25185d(0);
        }
    }

    /* renamed from: h */
    private void m25194h(List<Prop> list) {
        if (list != null && !list.isEmpty()) {
            this.f22558y.clear();
            for (Prop hVar : list) {
                this.f22558y.add(new C8141h(hVar));
            }
            if (this.f22528D == 0 || this.f22528D == -1) {
                m25173a(C8215a.DATA_TYPE_PROP);
                return;
            }
            if (this.f22528D == 1) {
                m25185d(1);
            }
        }
    }

    /* renamed from: a */
    private void m25173a(C8215a aVar) {
        if ((this.f22555v == null || this.f22555v.isEmpty()) && (this.f22558y == null || this.f22558y.isEmpty())) {
            this.f22537d.mo10831d();
            return;
        }
        this.f22537d.setVisibility(8);
        switch (aVar) {
            case DATA_TYPE_BANNER:
            case DATA_TYPE_GIFT:
                if (this.f22546m == PanelType.GIFT) {
                    m25186d(PanelType.GIFT);
                    return;
                }
                break;
            case DATA_TYPE_PROP:
                if (this.f22546m == PanelType.PROP) {
                    m25186d(PanelType.PROP);
                }
                this.f22534a.f22462j.postValue(Boolean.valueOf(C8284u.m25332a().mo21441c()));
                this.f22534a.f22463k.postValue(Boolean.valueOf(C8284u.m25332a().mo21440b()));
                break;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo21375b(PanelType panelType) {
        if (this.f22546m != panelType) {
            this.f22546m = panelType;
            this.f22547n = 0;
            this.f22536c = 0;
            this.f22550q = null;
            if (this.f22539f != null) {
                this.f22539f.mo21226b();
            }
            if (!this.f22544k) {
                this.f22538e.mo5541b(0);
            }
            m25186d(panelType);
        }
    }

    /* renamed from: d */
    private void m25186d(PanelType panelType) {
        this.f22539f.mo21223a();
        switch (panelType) {
            case GIFT:
                m25196i(m25184d());
                return;
            case FANS_CLUB_GIFT:
                m25196i(m25187e());
                return;
            case PROP:
                m25196i(m25193h());
                return;
            case HONOR_LEVEL_GIFT:
                m25196i(m25189f());
                return;
            case NOBLE_GIFT:
                m25196i(m25191g());
                return;
            default:
                m25196i(m25184d());
                return;
        }
    }

    /* renamed from: b */
    public final void mo21376b(List<C8149d> list) {
        int i = 0;
        if (this.f22528D == -1) {
            this.f22528D = 0;
        }
        if (this.f22528D == 0 && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            if (this.f22534a.f22455c == SendToType.GUEST) {
                GiftManager.filterInteractNotSupportGift(arrayList, this.f22535b);
            } else {
                GiftManager.filterNotSupportGift(arrayList, this.f22535b);
            }
            GiftManager.filterNotDisplayedOnPanel(arrayList);
            mo21378d((List<C8149d>) arrayList);
            View view = this.f22552s;
            if (this.f22553t) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo21371a(String str) {
        if (this.f22554u != null && !this.f22554u.isEmpty()) {
            int c = C9051ar.m27037c(this.context, (float) C9051ar.m27033a(this.context));
            BaseDialogFragment a = ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11533a(C3979c.m13951a(this.f22554u).mo11555a(c).mo11560b((int) ((((float) c) / 375.0f) * 275.0f)).mo11568f(0).mo11556a(8, 8, 0, 0).mo11566e(80).mo11565d(false));
            this.f22534a.f22469q.postValue(Boolean.valueOf(true));
            if (this.context instanceof FragmentActivity) {
                BaseDialogFragment.m12686a((FragmentActivity) this.context, (DialogFragment) a);
                this.f22534a.mo21340a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo21367a(int i) {
        int i2 = i / 8;
        if (i2 >= 0 && i2 < this.f22548o) {
            this.f22547n = i2;
            if (this.f22545l) {
                this.f22540g.mo13410a(this.f22547n);
            }
            this.f22534a.f22475w.postValue(Integer.valueOf(this.f22547n));
        }
    }

    /* renamed from: d */
    public final void mo21378d(List<C8149d> list) {
        if (!list.isEmpty()) {
            this.f22556w.clear();
            this.f22557x.clear();
            this.f22559z.clear();
            this.f22555v.clear();
            ArrayList<C8149d> arrayList = new ArrayList<>(list);
            List<C8149d> filterFansClubGifts = GiftManager.inst().filterFansClubGifts(arrayList);
            List<C8149d> filterHonorLevelGifts = GiftManager.inst().filterHonorLevelGifts(arrayList);
            List<C8149d> filterNobleGifts = GiftManager.inst().filterNobleGifts(arrayList);
            if (!C6307b.m19566a((Collection<T>) filterFansClubGifts)) {
                for (C8149d fVar : filterFansClubGifts) {
                    this.f22556w.add(new C8139f(fVar));
                }
            }
            if (!C6307b.m19566a((Collection<T>) filterHonorLevelGifts)) {
                for (C8149d fVar2 : filterHonorLevelGifts) {
                    this.f22557x.add(new C8139f(fVar2));
                }
            }
            if (!C6307b.m19566a((Collection<T>) filterNobleGifts)) {
                for (C8149d fVar3 : filterNobleGifts) {
                    this.f22559z.add(new C8139f(fVar3));
                }
            }
            if (filterFansClubGifts != null) {
                arrayList.removeAll(filterFansClubGifts);
            }
            if (filterHonorLevelGifts != null) {
                arrayList.removeAll(filterHonorLevelGifts);
            }
            if (filterNobleGifts != null) {
                arrayList.removeAll(filterNobleGifts);
            }
            for (C8149d dVar : arrayList) {
                if (dVar.f22234e == 5) {
                    this.f22532H = dVar;
                } else if (dVar.f22234e == 3) {
                    this.f22555v.add(new C8142i(dVar));
                } else if (dVar.f22234e == 9) {
                    this.f22555v.add(new C8140g(dVar));
                } else {
                    this.f22555v.add(new C8139f(dVar));
                }
            }
            m25173a(C8215a.DATA_TYPE_GIFT);
        }
    }

    /* renamed from: c */
    public final void mo21377c(List<GiftPage> list) {
        int i;
        if (this.f22528D == -1) {
            this.f22528D = 1;
        }
        if (this.f22528D == 1 && list != null && !list.isEmpty()) {
            if (this.f22534a != null) {
                this.f22534a.f22443E.postValue(list);
            }
            this.f22525A.clear();
            this.f22525A.addAll(list);
            SendToType sendToType = this.f22534a.f22455c;
            for (GiftPage giftPage : this.f22525A) {
                if (sendToType == SendToType.GUEST) {
                    GiftManager.filterInteractNotSupportGift(giftPage.gifts, this.f22535b);
                } else {
                    GiftManager.filterNotSupportGift(giftPage.gifts, this.f22535b);
                }
                GiftManager.filterNotDisplayedOnPanel(giftPage.gifts);
                if (giftPage.pageType == 5 && !this.f22529E && ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
                    this.f22529E = true;
                    C8284u.m25332a().mo21438b(this.f22543j.getId());
                }
            }
            m25190f(list);
            View view = this.f22552s;
            if (this.f22553t) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m25172a(C8134a aVar, boolean z) {
        if (aVar != null) {
            this.f22550q = aVar;
            C8170c cVar = new C8170c(m25174b(aVar), aVar.mo21275p(), 1, z);
            this.f22534a.f22467o.postValue(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo21374b(C8135b bVar, boolean z) {
        if (bVar != null && bVar.f22204b != z) {
            bVar.f22204b = z;
            C1293v a = m25169a(bVar);
            if (a instanceof BaseGiftPanelViewHolder) {
                ((BaseGiftPanelViewHolder) a).mo21168a(z);
            } else {
                this.f22539f.notifyDataSetChanged();
            }
            ((Boolean) LiveSettingKeys.XT_DOODLE_GIFT_ENABLE.mo10240a()).booleanValue();
        }
    }

    /* renamed from: a */
    public final void mo21227a(C8135b bVar, boolean z) {
        boolean z2 = bVar instanceof C8134a;
        if (z2 && this.f22534a.mo21342a((C8134a) bVar)) {
            this.f22534a.mo21344c();
            this.f22534a.mo21345d();
        }
        boolean z3 = bVar instanceof C8141h;
        boolean z4 = true;
        if (z3) {
            C8141h hVar = (C8141h) bVar;
            if (((Prop) hVar.f22206d).propType == 4) {
                if (((Prop) hVar.f22206d).banner != null) {
                    HashMap hashMap = new HashMap();
                    if (((Prop) hVar.f22206d).count <= 0) {
                        hashMap.put("has_popularity_card", Boolean.valueOf(false));
                        ((Prop) hVar.f22206d).banner.f25626d = 306;
                    } else {
                        hashMap.put("has_popularity_card", Boolean.valueOf(true));
                        ((Prop) hVar.f22206d).banner.f25626d = 373;
                    }
                    ((Prop) hVar.f22206d).banner.f25627e = 280;
                    ((Prop) hVar.f22206d).banner.f25630h = 3;
                    hashMap.put("count", Integer.valueOf(1));
                    hashMap.put("room_id", Long.valueOf(this.f22543j.getId()));
                    hashMap.put("prop_def_id", Long.valueOf(hVar.mo21275p()));
                    hashMap.put("to_uid", Long.valueOf(this.f22543j.getOwnerUserId()));
                    hashMap.put("is_aweme_free_gift", Integer.valueOf(0));
                    hashMap.put("describe", hVar.mo21271l());
                    hashMap.put("next_expire", Long.valueOf(((Prop) hVar.f22206d).nextExpire));
                    C4298a.m14477a(this.context, ((Prop) hVar.f22206d).banner, hashMap);
                    this.f22534a.f22469q.postValue(Boolean.valueOf(true));
                    this.f22534a.mo21337a(((Prop) hVar.f22206d).count);
                    return;
                }
                return;
            }
        }
        if (bVar instanceof C8136c) {
            C4298a.m14476a(this.context, (C8136c) bVar);
            this.f22534a.f22469q.postValue(Boolean.valueOf(true));
        } else if (bVar instanceof C8142i) {
            C9097a.m27146a().mo22267a((Object) new C4416ah(0));
            this.f22534a.f22469q.postValue(Boolean.valueOf(true));
        } else {
            if (!(bVar instanceof C8138e)) {
                if (bVar instanceof C8144k) {
                    C8134a aVar = (C8134a) bVar;
                    m25172a(aVar, aVar.mo21264e());
                } else if (bVar instanceof C8140g) {
                    this.f22534a.f22470r.postValue(null);
                    if (this.f22544k) {
                        C8549ck ckVar = new C8549ck();
                        ckVar.f23549a = "gift_panel";
                        ckVar.f23550b = bVar.mo21275p();
                        this.dataCenter.lambda$put$1$DataCenter("cmd_show_gift_relay_dialog", ckVar);
                        return;
                    }
                    C8222ad.m25248a(Toast.makeText(this.context, this.context.getResources().getString(R.string.emn), 1));
                } else if (z2) {
                    if (!z3 || ((Prop) ((C8141h) bVar).f22206d).count > 0) {
                        this.f22550q = bVar;
                        if (((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo10240a()).intValue() == 1) {
                            if ((bVar.f22206d instanceof C8149d) && ((C8149d) bVar.f22206d).f22226E) {
                                if (!((Boolean) C8946b.f24436bH.mo22117a()).booleanValue()) {
                                    C8946b.f24436bH.mo22118a(Boolean.valueOf(true));
                                    try {
                                        ((C8931a) C3596c.m13172a(C8931a.class)).handle(this.context, Uri.parse((String) LiveConfigSettingKeys.PORTAL_INTRODUCTION_URI.mo10240a()));
                                    } catch (Throwable th) {
                                        C8444d.m25673b();
                                        C8444d.m11969a(5, th.getStackTrace());
                                    }
                                } else if (!((Boolean) this.dataCenter.get("data_allow_send_portal_gift", Boolean.valueOf(true))).booleanValue()) {
                                    C3517a.m12960a(this.context, (int) R.string.f_t);
                                }
                                z4 = false;
                            }
                            if (z4) {
                                m25172a((C8134a) bVar, false);
                            }
                        } else if (!(bVar.f22206d instanceof C8149d)) {
                            m25171a((C8134a) bVar);
                        } else if (((C8149d) bVar.f22206d).f22234e != 11 || this.f22544k) {
                            m25171a((C8134a) bVar);
                        } else {
                            this.f22534a.f22470r.postValue(null);
                            C9049ap.m27022a((int) R.string.emn);
                        }
                    } else {
                        this.f22534a.f22442D.postValue("grey_prop");
                    }
                }
            }
        }
    }
}
