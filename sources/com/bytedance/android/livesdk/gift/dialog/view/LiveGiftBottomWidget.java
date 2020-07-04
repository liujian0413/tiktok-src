package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.C8284u;
import com.bytedance.android.livesdk.gift.dialog.C7897b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7938a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class LiveGiftBottomWidget extends LiveRecyclableWidget implements OnClickListener {

    /* renamed from: a */
    public final List<C7899a> f21327a = new ArrayList();

    /* renamed from: b */
    public RecyclerView f21328b;

    /* renamed from: c */
    public GiftViewModel f21329c;

    /* renamed from: d */
    public int f21330d;

    /* renamed from: e */
    public View f21331e;

    /* renamed from: f */
    public View f21332f;

    /* renamed from: g */
    private C7900b f21333g;

    /* renamed from: h */
    private TextView f21334h;

    /* renamed from: i */
    private View f21335i;

    /* renamed from: j */
    private View f21336j;

    /* renamed from: k */
    private View f21337k;

    /* renamed from: l */
    private boolean f21338l;

    /* renamed from: m */
    private boolean f21339m;

    /* renamed from: n */
    private boolean f21340n;

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.LiveGiftBottomWidget$a */
    class C7899a {

        /* renamed from: a */
        String f21342a;

        /* renamed from: b */
        int f21343b;

        /* renamed from: c */
        boolean f21344c;

        /* renamed from: d */
        boolean f21345d;

        private C7899a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.LiveGiftBottomWidget$b */
    class C7900b extends C1262a<C7901c> {
        public final int getItemCount() {
            return LiveGiftBottomWidget.this.f21327a.size();
        }

        private C7900b() {
        }

        public final int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            if (i == getItemCount() - 1) {
                return 2;
            }
            return 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C7901c cVar, int i) {
            cVar.mo20717a((C7899a) LiveGiftBottomWidget.this.f21327a.get(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7901c onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(LiveGiftBottomWidget.this.context).inflate(R.layout.aqz, null);
            View findViewById = inflate.findViewById(R.id.as_);
            if (findViewById.getLayoutParams() instanceof LayoutParams) {
                LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                if (i == 0) {
                    layoutParams.leftMargin = (int) C9738o.m28708b(LiveGiftBottomWidget.this.context, 16.0f);
                    layoutParams.setMarginStart((int) C9738o.m28708b(LiveGiftBottomWidget.this.context, 16.0f));
                } else if (i == 2) {
                    layoutParams.rightMargin = (int) C9738o.m28708b(LiveGiftBottomWidget.this.context, 50.0f);
                    layoutParams.setMarginEnd((int) C9738o.m28708b(LiveGiftBottomWidget.this.context, 50.0f));
                }
                findViewById.setLayoutParams(layoutParams);
            }
            return new C7901c(inflate);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.LiveGiftBottomWidget$c */
    class C7901c extends C1293v {

        /* renamed from: b */
        private GiftTabTextView f21349b;

        /* renamed from: a */
        public final void mo20717a(C7899a aVar) {
            int i;
            if (aVar != null) {
                this.f21349b.setGravity(48);
                this.f21349b.setText(aVar.f21342a);
                GiftTabTextView giftTabTextView = this.f21349b;
                if (aVar.f21345d) {
                    i = LiveGiftBottomWidget.this.context.getResources().getColor(R.color.ak4);
                } else {
                    i = LiveGiftBottomWidget.this.context.getResources().getColor(R.color.ak3);
                }
                giftTabTextView.setTextColor(i);
                this.f21349b.mo20703a(aVar.f21344c);
                this.f21349b.setTextSize(14.0f);
                this.itemView.setOnClickListener(new C7917e(this, aVar));
                if (aVar.f21344c) {
                    C8282s.m25321b(aVar.f21343b);
                }
            }
        }

        public C7901c(View view) {
            super(view);
            this.f21349b = (GiftTabTextView) view.findViewById(R.id.as_);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo20718a(C7899a aVar, View view) {
            int i = aVar.f21343b;
            if (i != LiveGiftBottomWidget.this.f21330d) {
                LiveGiftBottomWidget.this.f21329c.mo20792a(new C7938a(5, Integer.valueOf(i)));
            }
        }
    }

    public int getLayoutId() {
        return R.layout.alg;
    }

    public void onUnload() {
        this.f21329c.mo20783a((C0043i) this);
    }

    /* renamed from: a */
    private void m24217a() {
        if (((Boolean) C8946b.f24471by.mo22117a()).booleanValue()) {
            this.f21338l = true;
        }
    }

    public void onResume() {
        super.onResume();
        this.f21329c.mo20792a(new C7938a(9, null));
    }

    public LiveGiftBottomWidget(GiftViewModel giftViewModel) {
        this.f21329c = giftViewModel;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo20715a(C7939b bVar) {
        if (bVar != null) {
            if (bVar.f21493a == 1) {
                m24222d(bVar);
            }
            m24220b(bVar);
            m24219a(bVar.mo20804a());
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.v6 && !this.f21339m) {
            this.f21329c.mo20792a(new C7938a(8, null));
        }
    }

    /* renamed from: a */
    private void m24219a(boolean z) {
        if (z && !this.f21340n) {
            this.f21340n = true;
            C8284u.m25332a().mo21440b();
            if (C8284u.m25332a().mo21441c()) {
                for (C7899a aVar : this.f21327a) {
                    if (aVar.f21343b == 5) {
                        aVar.f21344c = true;
                        this.f21338l = true;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m24222d(C7939b bVar) {
        List<GiftPage> list = bVar.f21495c;
        GiftPage c = bVar.mo20807c();
        if (c != null && !TextUtils.isEmpty(c.eventName)) {
            C7897b.m24203a(c.eventName, (Room) this.dataCenter.get("data_room", null));
        }
        m24218a(list, c);
        this.f21333g.notifyDataSetChanged();
        m24220b(bVar);
    }

    public void onInit(Object[] objArr) {
        this.f21328b = (RecyclerView) findViewById(R.id.dfp);
        this.f21334h = (TextView) findViewById(R.id.coz);
        this.f21335i = findViewById(R.id.xv);
        this.f21336j = findViewById(R.id.v6);
        this.f21331e = findViewById(R.id.d_v);
        this.f21332f = findViewById(R.id.aep);
        this.f21337k = findViewById(R.id.cop);
    }

    public void onLoad(Object[] objArr) {
        this.f21333g = new C7900b();
        this.f21328b.setItemViewCacheSize(16);
        this.f21328b.setAdapter(this.f21333g);
        this.f21328b.setLayoutManager(new LinearLayoutManager(this.context, 0, false));
        m24220b(null);
        this.f21329c.mo20784a((C0043i) this, (C0053p<C7939b>) new C7916d<C7939b>(this));
        this.f21336j.setOnClickListener(this);
        this.f21328b.mo5528a((C1281m) new C1281m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int i3;
                super.onScrolled(recyclerView, i, i2);
                if (LiveGiftBottomWidget.this.f21328b.getLayoutManager() instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) LiveGiftBottomWidget.this.f21328b.getLayoutManager();
                    int k = linearLayoutManager.mo5446k();
                    int m = linearLayoutManager.mo5448m();
                    View view = LiveGiftBottomWidget.this.f21331e;
                    int i4 = 0;
                    if (k == 0) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                    View view2 = LiveGiftBottomWidget.this.f21332f;
                    if (m == LiveGiftBottomWidget.this.f21327a.size() - 1) {
                        i4 = 8;
                    }
                    view2.setVisibility(i4);
                }
            }
        });
        m24217a();
    }

    /* renamed from: b */
    private void m24220b(C7939b bVar) {
        long b = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b();
        boolean c = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c();
        this.f21339m = false;
        if (b <= 0 || !c) {
            this.f21334h.setText(R.string.fdw);
            this.f21334h.setTextColor(this.context.getResources().getColor(R.color.ak2));
            this.f21334h.setTextSize(1, 14.0f);
            this.f21335i.setVisibility(8);
            this.f21337k.setVisibility(0);
            return;
        }
        this.f21334h.setText(C3385e.m12596f(b));
        this.f21334h.setTextColor(this.context.getResources().getColor(R.color.ak1));
        this.f21334h.setTextSize(1, 16.0f);
        this.f21335i.setVisibility(0);
        this.f21335i.setBackgroundResource(R.drawable.c41);
        this.f21337k.setVisibility(0);
    }

    /* renamed from: a */
    private void m24218a(List<GiftPage> list, GiftPage giftPage) {
        boolean z;
        this.f21327a.clear();
        if (C6311g.m19573a(list)) {
            C7899a aVar = new C7899a();
            aVar.f21343b = 1;
            aVar.f21345d = true;
            aVar.f21342a = this.context.getString(R.string.ess);
            this.f21327a.add(aVar);
            return;
        }
        if (giftPage == null) {
            giftPage = (GiftPage) list.get(0);
        }
        this.f21330d = giftPage.pageType;
        for (GiftPage giftPage2 : list) {
            if (giftPage2 != null && giftPage2.display) {
                C7899a aVar2 = new C7899a();
                aVar2.f21342a = giftPage2.pageName;
                if (giftPage2.pageType == giftPage.pageType) {
                    z = true;
                } else {
                    z = false;
                }
                aVar2.f21345d = z;
                aVar2.f21343b = giftPage2.pageType;
                if (this.f21338l) {
                    if (this.f21330d == 5) {
                        C8284u.m25332a().mo21442d();
                        this.f21338l = false;
                    } else if (giftPage2.pageType == 5) {
                        aVar2.f21344c = true;
                    }
                }
                this.f21327a.add(aVar2);
            }
        }
    }
}
