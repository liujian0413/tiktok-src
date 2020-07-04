package com.bytedance.android.livesdk.p424u;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3390j;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.uikit.recyclerview.LoadMoreRecyclerViewAdapter.C3553a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.livesdk.admin.p183a.C3886a;
import com.bytedance.android.livesdk.admin.p184b.C3890c;
import com.bytedance.android.livesdk.admin.p185c.C3892a;
import com.bytedance.android.livesdk.admin.p186d.C3897a;
import com.bytedance.android.livesdk.admin.p187ui.AdminListAdapter;
import com.bytedance.android.livesdk.chatroom.p220ui.LoadingEmptyView;
import com.bytedance.android.livesdk.chatroom.p220ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.kickout.C8363a;
import com.bytedance.android.livesdk.kickout.C8370b;
import com.bytedance.android.livesdk.kickout.p398a.C8368a;
import com.bytedance.android.livesdk.kickout.p398a.C8369b;
import com.bytedance.android.livesdk.kickout.p399b.C8371a;
import com.bytedance.android.livesdk.kickout.p400ui.BannedListAdapter;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.u.a */
public final class C8955a extends Dialog {

    /* renamed from: a */
    public int f24508a;

    /* renamed from: b */
    public boolean f24509b;

    /* renamed from: c */
    public TextView f24510c;

    /* renamed from: d */
    public LoadingStatusView f24511d;

    /* renamed from: e */
    public AdminListAdapter f24512e;

    /* renamed from: f */
    public int f24513f;

    /* renamed from: g */
    public String f24514g;

    /* renamed from: h */
    public int f24515h;

    /* renamed from: i */
    public boolean f24516i;

    /* renamed from: j */
    public long f24517j;

    /* renamed from: k */
    public C8363a f24518k;

    /* renamed from: l */
    public BannedListAdapter f24519l;

    /* renamed from: m */
    private long f24520m;

    /* renamed from: n */
    private long f24521n;

    /* renamed from: o */
    private int f24522o;

    /* renamed from: p */
    private String f24523p;

    /* renamed from: q */
    private TextView f24524q;

    /* renamed from: r */
    private RecyclerView f24525r;

    /* renamed from: s */
    private boolean f24526s;

    /* renamed from: t */
    private C47562b f24527t;

    /* renamed from: u */
    private C3892a f24528u;

    /* renamed from: v */
    private C3897a f24529v;

    /* renamed from: w */
    private C8370b f24530w;

    /* renamed from: x */
    private C3553a f24531x;

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24509b = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24509b = false;
        this.f24527t.dispose();
    }

    /* renamed from: a */
    public final void mo22123a() {
        if (!C8961b.m26798a(getContext())) {
            C3517a.m12960a(getContext(), (int) R.string.efp);
            return;
        }
        this.f24511d.mo10830c();
        this.f24528u.mo11427a(this.f24521n);
    }

    /* renamed from: b */
    public final void mo22124b() {
        if (!C8961b.m26798a(getContext())) {
            C3517a.m12960a(getContext(), (int) R.string.efp);
            this.f24511d.mo10832e();
            return;
        }
        if (this.f24518k != null) {
            this.f24518k.mo21511a(this.f24517j, this.f24514g, this.f24515h, 20);
        }
    }

    /* renamed from: d */
    private void m26786d() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.au2, null);
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (1 == C8955a.this.f24508a) {
                    C8955a.this.mo22123a();
                } else {
                    C8955a.this.mo22124b();
                }
            }
        });
        LoadingEmptyView a = new LoadingEmptyView(getContext()).mo13379a(getContext().getString(this.f24522o));
        a.setLayoutParams(new LayoutParams(-1, -1));
        this.f24511d.setBuilder(C3555a.m13075a(getContext()).mo10838b((View) a).mo10839c(inflate).mo10834a(getContext().getResources().getDimensionPixelSize(R.dimen.oa)));
    }

    /* renamed from: c */
    private void m26785c() {
        this.f24524q = (TextView) findViewById(R.id.cw_);
        this.f24510c = (TextView) findViewById(R.id.cwa);
        this.f24525r = (RecyclerView) findViewById(R.id.cw8);
        this.f24511d = (LoadingStatusView) findViewById(R.id.cw9);
        this.f24525r.setLayoutManager(new SSLinearLayoutManager(getContext(), 1, false));
        if (1 == this.f24508a) {
            this.f24522o = R.string.eqo;
            this.f24523p = getContext().getString(R.string.eb5);
            this.f24528u = new C3892a(this.f24529v);
            AdminListAdapter adminListAdapter = new AdminListAdapter(getContext(), this.f24521n, this.f24520m);
            this.f24512e = adminListAdapter;
            this.f24525r.setAdapter(this.f24512e);
            mo22123a();
        } else {
            if (2 == this.f24508a) {
                this.f24514g = "activity_banned_talk";
                this.f24522o = R.string.eqv;
                this.f24523p = getContext().getString(R.string.ec3);
            } else if (3 == this.f24508a) {
                this.f24514g = "activity_kick_out";
                this.f24522o = R.string.eqm;
                this.f24523p = getContext().getString(R.string.fch);
            }
            this.f24518k = new C8363a();
            this.f24518k.f22924a = this.f24530w;
            BannedListAdapter bannedListAdapter = new BannedListAdapter(getContext(), this.f24514g, this.f24520m, this.f24521n);
            this.f24519l = bannedListAdapter;
            this.f24525r.setAdapter(this.f24519l);
            this.f24519l.f10589a = this.f24531x;
            this.f24515h = 0;
            this.f24517j = this.f24520m;
            mo22124b();
        }
        this.f24524q.setText(this.f24523p);
        m26786d();
        m26784a(C3886a.class);
        m26784a(C8368a.class);
        m26784a(C8369b.class);
    }

    /* renamed from: a */
    private <T> void m26784a(Class<T> cls) {
        this.f24527t.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C3886a) {
                    C8955a.this.onEvent((C3886a) t);
                } else if (t instanceof C8368a) {
                    C8955a.this.onEvent((C8368a) t);
                } else {
                    if (t instanceof C8369b) {
                        C8955a.this.onEvent((C8369b) t);
                    }
                }
            }
        }));
    }

    public final void onEvent(C8368a aVar) {
        if (this.f24509b && aVar != null && !aVar.f22933a && this.f24519l != null) {
            this.f24519l.mo21522a(aVar.f22934b);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(R.layout.aoy);
            m26785c();
            if (this.f24526s) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            } else {
                window.setGravity(5);
                window.setLayout(-2, -1);
            }
            window.setBackgroundDrawableResource(17170445);
            window.setDimAmount(0.0f);
        }
    }

    public final void onEvent(C3886a aVar) {
        if (this.f24509b && aVar != null && !aVar.f11612a && this.f24512e != null) {
            this.f24512e.mo11436a(aVar.f11613b);
            this.f24510c.setText(getContext().getString(R.string.eb6, new Object[]{Integer.valueOf(this.f24512e.getItemCount()), Integer.valueOf(this.f24513f)}));
        }
    }

    public final void onEvent(C8369b bVar) {
        if (this.f24509b && bVar != null && !bVar.f22935a && this.f24519l != null) {
            this.f24519l.mo21522a(bVar.f22936b);
        }
    }

    public C8955a(Context context, int i, long j, long j2, boolean z) {
        int i2;
        if (z) {
            i2 = R.style.y0;
        } else {
            i2 = R.style.xw;
        }
        super(context, i2);
        this.f24527t = new C47562b();
        this.f24513f = 10;
        this.f24529v = new C3897a() {
            /* renamed from: a */
            public final void mo11434a(boolean z, User user) {
            }

            /* renamed from: a */
            public final void mo11435a(boolean z, Exception exc) {
            }

            /* renamed from: a */
            public final void mo11433a(C3890c cVar, Exception exc) {
                if (!C8955a.this.f24509b || C8955a.this.f24512e == null) {
                    return;
                }
                if (exc != null || cVar == null) {
                    if (C8955a.this.f24512e.getItemCount() == 0) {
                        C8955a.this.f24511d.mo10832e();
                    }
                    C9076n.m27095a(C8955a.this.getContext(), exc);
                } else if (!C6307b.m19566a((Collection<T>) cVar.f11618a)) {
                    C8955a.this.f24511d.mo10828a();
                    C8955a.this.f24513f = cVar.f11619b;
                    C8955a.this.f24510c.setText(C3390j.m12609a(C3358ac.m12515a((int) R.string.eb6), Integer.valueOf(cVar.f11620c), Integer.valueOf(C8955a.this.f24513f)));
                    C9738o.m28712b((View) C8955a.this.f24510c, 0);
                    C8955a.this.f24512e.mo11437a(cVar);
                } else {
                    C8955a.this.f24511d.mo10831d();
                }
            }
        };
        this.f24530w = new C8370b() {
            /* renamed from: a */
            public final void mo21519a(boolean z, Exception exc) {
            }

            /* renamed from: b */
            public final void mo21521b(boolean z) {
            }

            /* renamed from: a */
            public final void mo21517a() {
                if (!C8955a.this.f24509b || C8955a.this.f24519l == null) {
                    return;
                }
                if (C8955a.this.f24519l.mo10843c() == 0) {
                    C8955a.this.f24511d.mo10830c();
                } else {
                    C8955a.this.f24519l.mo10820a();
                }
            }

            /* renamed from: b */
            public final void mo21520b() {
                if (!C8955a.this.f24509b || C8955a.this.f24519l == null) {
                    return;
                }
                if (C8955a.this.f24519l.mo10843c() == 0) {
                    C8955a.this.f24511d.mo10828a();
                } else {
                    C8955a.this.f24519l.mo10822b();
                }
            }

            /* renamed from: a */
            public final void mo21518a(C8371a aVar, Exception exc) {
                if (!C8955a.this.f24509b || C8955a.this.f24519l == null) {
                    return;
                }
                if (exc != null || aVar == null || aVar.f10296b == null) {
                    if (C8955a.this.f24519l.getItemCount() == 0) {
                        C8955a.this.f24511d.mo10832e();
                        C8955a.this.f24515h = 0;
                    }
                    C9076n.m27095a(C8955a.this.getContext(), exc);
                    return;
                }
                C8955a.this.f24516i = aVar.f10297c.hasMore;
                if (!C8955a.this.f24516i) {
                    C8955a.this.f24519l.f22937c = true;
                    C8955a.this.f24519l.f10600b = false;
                }
                List list = aVar.f10296b;
                if (list == null || list.size() <= 0) {
                    C8955a.this.f24511d.mo10831d();
                    return;
                }
                C8955a.this.f24519l.mo21523a((Collection<? extends User>) list);
                C8955a.this.f24519l.notifyDataSetChanged();
            }
        };
        this.f24531x = new C3553a() {
            /* renamed from: a */
            public final void mo10824a(boolean z) {
                if (C8955a.this.f24516i && C8955a.this.f24518k != null) {
                    C8955a.this.f24515h++;
                    C8955a.this.f24518k.mo21511a(C8955a.this.f24517j, C8955a.this.f24514g, C8955a.this.f24515h, 20);
                }
            }
        };
        this.f24526s = z;
        this.f24508a = i;
        this.f24520m = j;
        this.f24521n = j2;
    }
}
