package com.bytedance.android.livesdk.p424u;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.uikit.recyclerview.LoadMoreRecyclerViewAdapter.C3553a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.livesdk.admin.p183a.C3886a;
import com.bytedance.android.livesdk.admin.p184b.C3890c;
import com.bytedance.android.livesdk.admin.p185c.C3892a;
import com.bytedance.android.livesdk.admin.p186d.C3897a;
import com.bytedance.android.livesdk.admin.p187ui.AdminListAdapter;
import com.bytedance.android.livesdk.chatroom.p220ui.C5247cn.C5249b;
import com.bytedance.android.livesdk.chatroom.p220ui.LoadingEmptyView;
import com.bytedance.android.livesdk.chatroom.p220ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.kickout.C8363a;
import com.bytedance.android.livesdk.kickout.C8370b;
import com.bytedance.android.livesdk.kickout.p398a.C8368a;
import com.bytedance.android.livesdk.kickout.p398a.C8369b;
import com.bytedance.android.livesdk.kickout.p399b.C8371a;
import com.bytedance.android.livesdk.kickout.p400ui.BannedListAdapter;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.u.c */
public final class C8962c extends FrameLayout {

    /* renamed from: j */
    public static final C8964a f24537j = new C8964a(null);

    /* renamed from: a */
    public boolean f24538a;

    /* renamed from: b */
    public AdminListAdapter f24539b;

    /* renamed from: c */
    public int f24540c = 10;

    /* renamed from: d */
    public String f24541d;

    /* renamed from: e */
    public int f24542e;

    /* renamed from: f */
    public boolean f24543f;

    /* renamed from: g */
    public long f24544g;

    /* renamed from: h */
    public C8363a f24545h;

    /* renamed from: i */
    public BannedListAdapter f24546i;

    /* renamed from: k */
    private int f24547k;

    /* renamed from: l */
    private int f24548l;

    /* renamed from: m */
    private String f24549m;

    /* renamed from: n */
    private C5249b f24550n;

    /* renamed from: o */
    private final C47562b f24551o = new C47562b();

    /* renamed from: p */
    private C3892a f24552p;

    /* renamed from: q */
    private final C3897a f24553q = new C8966c(this);

    /* renamed from: r */
    private final C8370b f24554r = new C8967d(this);

    /* renamed from: s */
    private final C3553a f24555s = new C8968e(this);

    /* renamed from: t */
    private final Long f24556t;

    /* renamed from: u */
    private final Long f24557u;

    /* renamed from: v */
    private HashMap f24558v;

    /* renamed from: com.bytedance.android.livesdk.u.c$a */
    public static final class C8964a {
        private C8964a() {
        }

        public /* synthetic */ C8964a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.u.c$b */
    static final class C8965b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8962c f24560a;

        /* renamed from: b */
        final /* synthetic */ int f24561b;

        C8965b(C8962c cVar, int i) {
            this.f24560a = cVar;
            this.f24561b = i;
        }

        public final void onClick(View view) {
            if (1 == this.f24561b) {
                this.f24560a.mo22133a();
            } else {
                this.f24560a.mo22136b();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.u.c$c */
    public static final class C8966c implements C3897a {

        /* renamed from: a */
        final /* synthetic */ C8962c f24562a;

        /* renamed from: a */
        public final void mo11434a(boolean z, User user) {
            C7573i.m23587b(user, "user");
        }

        /* renamed from: a */
        public final void mo11435a(boolean z, Exception exc) {
        }

        C8966c(C8962c cVar) {
            this.f24562a = cVar;
        }

        /* renamed from: a */
        public final void mo11433a(C3890c cVar, Exception exc) {
            if (!this.f24562a.f24538a || this.f24562a.f24539b == null) {
                return;
            }
            if (exc != null || cVar == null) {
                AdminListAdapter adminListAdapter = this.f24562a.f24539b;
                if (adminListAdapter == null) {
                    C7573i.m23580a();
                }
                if (adminListAdapter.getItemCount() == 0) {
                    ((LoadingStatusView) this.f24562a.mo22135b(R.id.cw9)).mo10832e();
                }
                C9076n.m27095a(this.f24562a.getContext(), exc);
            } else if (!C6307b.m19566a((Collection<T>) cVar.f11618a)) {
                ((LoadingStatusView) this.f24562a.mo22135b(R.id.cw9)).mo10828a();
                this.f24562a.f24540c = cVar.f11619b;
                AdminListAdapter adminListAdapter2 = this.f24562a.f24539b;
                if (adminListAdapter2 == null) {
                    C7573i.m23580a();
                }
                adminListAdapter2.mo11437a(cVar);
            } else {
                LoadingStatusView loadingStatusView = (LoadingStatusView) this.f24562a.mo22135b(R.id.cw9);
                if (loadingStatusView == null) {
                    C7573i.m23580a();
                }
                loadingStatusView.mo10831d();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.u.c$d */
    public static final class C8967d implements C8370b {

        /* renamed from: a */
        final /* synthetic */ C8962c f24563a;

        /* renamed from: a */
        public final void mo21519a(boolean z, Exception exc) {
        }

        /* renamed from: b */
        public final void mo21521b(boolean z) {
        }

        /* renamed from: a */
        public final void mo21517a() {
            if (this.f24563a.f24538a && this.f24563a.f24546i != null) {
                BannedListAdapter bannedListAdapter = this.f24563a.f24546i;
                if (bannedListAdapter == null) {
                    C7573i.m23580a();
                }
                if (bannedListAdapter.mo10843c() == 0) {
                    ((LoadingStatusView) this.f24563a.mo22135b(R.id.cw9)).mo10830c();
                    return;
                }
                BannedListAdapter bannedListAdapter2 = this.f24563a.f24546i;
                if (bannedListAdapter2 == null) {
                    C7573i.m23580a();
                }
                bannedListAdapter2.mo10820a();
            }
        }

        /* renamed from: b */
        public final void mo21520b() {
            if (this.f24563a.f24538a && this.f24563a.f24546i != null) {
                BannedListAdapter bannedListAdapter = this.f24563a.f24546i;
                if (bannedListAdapter == null) {
                    C7573i.m23580a();
                }
                if (bannedListAdapter.mo10843c() == 0) {
                    ((LoadingStatusView) this.f24563a.mo22135b(R.id.cw9)).mo10828a();
                    return;
                }
                BannedListAdapter bannedListAdapter2 = this.f24563a.f24546i;
                if (bannedListAdapter2 == null) {
                    C7573i.m23580a();
                }
                bannedListAdapter2.mo10822b();
            }
        }

        C8967d(C8962c cVar) {
            this.f24563a = cVar;
        }

        /* renamed from: a */
        public final void mo21518a(C8371a aVar, Exception exc) {
            if (!this.f24563a.f24538a || this.f24563a.f24546i == null) {
                return;
            }
            if (exc != null || aVar == null || aVar.f10296b == null) {
                BannedListAdapter bannedListAdapter = this.f24563a.f24546i;
                if (bannedListAdapter == null) {
                    C7573i.m23580a();
                }
                if (bannedListAdapter.getItemCount() == 0) {
                    ((LoadingStatusView) this.f24563a.mo22135b(R.id.cw9)).mo10832e();
                    this.f24563a.f24542e = 0;
                }
                C9076n.m27095a(this.f24563a.getContext(), exc);
                return;
            }
            this.f24563a.f24543f = aVar.f10297c.hasMore;
            if (!this.f24563a.f24543f) {
                BannedListAdapter bannedListAdapter2 = this.f24563a.f24546i;
                if (bannedListAdapter2 == null) {
                    C7573i.m23580a();
                }
                bannedListAdapter2.f22937c = false;
                BannedListAdapter bannedListAdapter3 = this.f24563a.f24546i;
                if (bannedListAdapter3 == null) {
                    C7573i.m23580a();
                }
                bannedListAdapter3.f10600b = false;
            }
            List list = aVar.f10296b;
            if (list == null || list.size() <= 0) {
                ((LoadingStatusView) this.f24563a.mo22135b(R.id.cw9)).mo10831d();
                return;
            }
            BannedListAdapter bannedListAdapter4 = this.f24563a.f24546i;
            if (bannedListAdapter4 == null) {
                C7573i.m23580a();
            }
            bannedListAdapter4.mo21523a((Collection<? extends User>) list);
            BannedListAdapter bannedListAdapter5 = this.f24563a.f24546i;
            if (bannedListAdapter5 == null) {
                C7573i.m23580a();
            }
            bannedListAdapter5.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.u.c$e */
    static final class C8968e implements C3553a {

        /* renamed from: a */
        final /* synthetic */ C8962c f24564a;

        C8968e(C8962c cVar) {
            this.f24564a = cVar;
        }

        /* renamed from: a */
        public final void mo10824a(boolean z) {
            if (this.f24564a.f24543f && this.f24564a.f24545h != null) {
                this.f24564a.f24542e++;
                C8363a aVar = this.f24564a.f24545h;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                aVar.mo21511a(this.f24564a.f24544g, this.f24564a.f24541d, this.f24564a.f24542e, 20);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.u.c$f */
    static final class C8969f<T> implements C7326g<T> {

        /* renamed from: a */
        final /* synthetic */ C8962c f24565a;

        C8969f(C8962c cVar) {
            this.f24565a = cVar;
        }

        public final void accept(T t) {
            if (t instanceof C3886a) {
                this.f24565a.onEvent((C3886a) t);
            } else if (t instanceof C8368a) {
                this.f24565a.onEvent((C8368a) t);
            } else {
                if (t instanceof C8369b) {
                    this.f24565a.onEvent((C8369b) t);
                }
            }
        }
    }

    /* renamed from: b */
    public final View mo22135b(int i) {
        if (this.f24558v == null) {
            this.f24558v = new HashMap();
        }
        View view = (View) this.f24558v.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f24558v.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C5249b getClickCallback() {
        return this.f24550n;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24538a = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24538a = false;
        this.f24551o.dispose();
    }

    private final Map<String, String> getCommonLogPara() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("anchor_id", String.valueOf(this.f24557u));
        hashMap.put("room_id", String.valueOf(this.f24556t));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo22133a() {
        if (!C8970d.m26814a(getContext())) {
            C3517a.m12960a(getContext(), (int) R.string.efp);
            return;
        }
        ((LoadingStatusView) mo22135b(R.id.cw9)).mo10830c();
        Long l = this.f24557u;
        if (l != null) {
            long longValue = l.longValue();
            C3892a aVar = this.f24552p;
            if (aVar != null) {
                aVar.mo11427a(longValue);
            }
        }
    }

    /* renamed from: b */
    public final void mo22136b() {
        if (!C8970d.m26814a(getContext())) {
            C3517a.m12960a(getContext(), (int) R.string.efp);
            ((LoadingStatusView) mo22135b(R.id.cw9)).mo10832e();
            return;
        }
        if (this.f24545h != null) {
            C8363a aVar = this.f24545h;
            if (aVar == null) {
                C7573i.m23580a();
            }
            aVar.mo21511a(this.f24544g, this.f24541d, this.f24542e, 20);
        }
    }

    public final void setClickCallback(C5249b bVar) {
        this.f24550n = bVar;
    }

    /* renamed from: a */
    private final <T> void m26799a(Class<T> cls) {
        this.f24551o.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C8969f<Object>(this)));
    }

    public final void onEvent(C3886a aVar) {
        if (this.f24538a && aVar != null && !aVar.f11612a && this.f24539b != null) {
            AdminListAdapter adminListAdapter = this.f24539b;
            if (adminListAdapter == null) {
                C7573i.m23580a();
            }
            adminListAdapter.mo11436a(aVar.f11613b);
            AdminListAdapter adminListAdapter2 = this.f24539b;
            if (adminListAdapter2 != null && adminListAdapter2.getItemCount() == 0) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) mo22135b(R.id.cw9);
                if (loadingStatusView == null) {
                    C7573i.m23580a();
                }
                loadingStatusView.mo10831d();
            }
        }
    }

    public final void onEvent(C8368a aVar) {
        if (this.f24538a && aVar != null && !aVar.f22933a && this.f24546i != null) {
            BannedListAdapter bannedListAdapter = this.f24546i;
            if (bannedListAdapter == null) {
                C7573i.m23580a();
            }
            bannedListAdapter.mo21522a(aVar.f22934b);
            BannedListAdapter bannedListAdapter2 = this.f24546i;
            if (bannedListAdapter2 != null && bannedListAdapter2.getItemCount() == 0) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) mo22135b(R.id.cw9);
                if (loadingStatusView == null) {
                    C7573i.m23580a();
                }
                loadingStatusView.mo10831d();
            }
        }
    }

    /* renamed from: c */
    private final void m26800c(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.acm, null);
        inflate.setOnClickListener(new C8965b(this, i));
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        LoadingEmptyView loadingEmptyView = new LoadingEmptyView(context, null, 0, 6, null);
        LoadingEmptyView b = loadingEmptyView.mo13379a(getContext().getString(this.f24548l)).mo13380b(getContext().getString(this.f24547k));
        b.setLayoutParams(new LayoutParams(-1, -1));
        LoadingStatusView loadingStatusView = (LoadingStatusView) mo22135b(R.id.cw9);
        C3555a c = C3555a.m13075a(getContext()).mo10838b((View) b).mo10839c(inflate);
        Context context2 = getContext();
        C7573i.m23582a((Object) context2, "context");
        loadingStatusView.setBuilder(c.mo10834a(context2.getResources().getDimensionPixelSize(R.dimen.oa)));
    }

    public final void onEvent(C8369b bVar) {
        if (this.f24538a && bVar != null && !bVar.f22935a && this.f24546i != null) {
            BannedListAdapter bannedListAdapter = this.f24546i;
            if (bannedListAdapter == null) {
                C7573i.m23580a();
            }
            bannedListAdapter.mo21522a(bVar.f22936b);
            BannedListAdapter bannedListAdapter2 = this.f24546i;
            if (bannedListAdapter2 != null && bannedListAdapter2.getItemCount() == 0) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) mo22135b(R.id.cw9);
                if (loadingStatusView == null) {
                    C7573i.m23580a();
                }
                loadingStatusView.mo10831d();
            }
        }
    }

    /* renamed from: a */
    public final void mo22134a(int i) {
        if (this.f24556t != null && this.f24557u != null) {
            RecyclerView recyclerView = (RecyclerView) mo22135b(R.id.cw8);
            C7573i.m23582a((Object) recyclerView, "room_manage_list_content");
            recyclerView.setLayoutManager(new SSLinearLayoutManager(getContext(), 1, false));
            this.f24548l = R.string.cw9;
            if (1 == i) {
                this.f24547k = R.string.eqp;
                this.f24549m = getContext().getString(R.string.eb5);
                this.f24552p = new C3892a(this.f24553q);
                AdminListAdapter adminListAdapter = new AdminListAdapter(getContext(), this.f24557u.longValue(), this.f24556t.longValue());
                this.f24539b = adminListAdapter;
                RecyclerView recyclerView2 = (RecyclerView) mo22135b(R.id.cw8);
                C7573i.m23582a((Object) recyclerView2, "room_manage_list_content");
                recyclerView2.setAdapter(this.f24539b);
                mo22133a();
                C8443c.m25663a().mo21606a("livesdk_anchor_admin_list_show", getCommonLogPara(), new Object[0]);
            } else {
                if (2 == i) {
                    this.f24541d = "activity_banned_talk";
                    this.f24547k = R.string.cwi;
                    this.f24549m = getContext().getString(R.string.ec3);
                    C8443c.m25663a().mo21606a("livesdk_anchor_mute_list_show", getCommonLogPara(), new Object[0]);
                } else if (3 == i) {
                    this.f24541d = "activity_kick_out";
                    this.f24547k = R.string.cwc;
                    this.f24549m = getContext().getString(R.string.fch);
                    C8443c.m25663a().mo21606a("livesdk_anchor_blacklist_show", getCommonLogPara(), new Object[0]);
                }
                this.f24545h = new C8363a();
                C8363a aVar = this.f24545h;
                if (aVar != null) {
                    aVar.f22924a = this.f24554r;
                }
                BannedListAdapter bannedListAdapter = new BannedListAdapter(getContext(), this.f24541d, this.f24556t.longValue(), this.f24557u.longValue());
                this.f24546i = bannedListAdapter;
                RecyclerView recyclerView3 = (RecyclerView) mo22135b(R.id.cw8);
                C7573i.m23582a((Object) recyclerView3, "room_manage_list_content");
                recyclerView3.setAdapter(this.f24546i);
                BannedListAdapter bannedListAdapter2 = this.f24546i;
                if (bannedListAdapter2 != null) {
                    bannedListAdapter2.f10589a = this.f24555s;
                }
                this.f24542e = 0;
                this.f24544g = this.f24556t.longValue();
                mo22136b();
            }
            ((TextView) mo22135b(R.id.cw_)).setText(this.f24549m);
            m26800c(i);
        }
    }

    public C8962c(Context context, Long l, Long l2) {
        C7573i.m23587b(context, "context");
        super(context);
        this.f24556t = l;
        this.f24557u = l2;
        LayoutInflater.from(context).inflate(R.layout.aoz, this, true);
        ((LinearLayout) mo22135b(R.id.cwb)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C8962c f24559a;

            {
                this.f24559a = r1;
            }

            public final void onClick(View view) {
                C5249b clickCallback = this.f24559a.getClickCallback();
                if (clickCallback != null) {
                    clickCallback.mo13515a(3);
                }
            }
        });
        m26799a(C3886a.class);
        m26799a(C8368a.class);
        m26799a(C8369b.class);
    }
}
