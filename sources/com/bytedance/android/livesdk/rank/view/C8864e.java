package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.adapter.LiveMultiTypeAdapter;
import com.bytedance.android.livesdk.chatroom.p220ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.p414p.C8750c;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.rank.C8843g;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.rank.model.C8853b;
import com.bytedance.android.livesdk.rank.model.C8854c;
import com.bytedance.android.livesdk.rank.model.C8855d;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.p419a.C8808b.C8809a;
import com.bytedance.android.livesdk.rank.p419a.C8808b.C8810b;
import com.bytedance.android.livesdk.rank.p421c.C8838r;
import com.bytedance.android.livesdk.rank.viewbinder.C8881a;
import com.bytedance.android.livesdk.rank.viewbinder.C8883b;
import com.bytedance.android.livesdk.rank.viewbinder.C8885c;
import com.bytedance.android.livesdk.rank.viewbinder.C8892i;
import com.bytedance.android.livesdk.rank.viewbinder.C8899n;
import com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder;
import com.bytedance.android.livesdk.rank.viewbinder.DailyRankTextViewBinder;
import com.bytedance.android.livesdk.rank.viewbinder.DailyRankTimeViewBinder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.livesdk.rank.view.e */
public class C8864e extends RelativeLayout implements C8810b {

    /* renamed from: a */
    public String f24163a;

    /* renamed from: b */
    public C8852a f24164b;

    /* renamed from: c */
    public Room f24165c;

    /* renamed from: d */
    public LiveMultiTypeAdapter f24166d;

    /* renamed from: e */
    public int f24167e;

    /* renamed from: f */
    public DataCenter f24168f;

    /* renamed from: g */
    public boolean f24169g;

    /* renamed from: h */
    private View f24170h;

    /* renamed from: i */
    private RecyclerView f24171i;

    /* renamed from: j */
    private TopRankListAnchorView f24172j;

    /* renamed from: k */
    private LoadingStatusView f24173k;

    /* renamed from: l */
    private C8809a f24174l;

    /* renamed from: m */
    private List<Object> f24175m = new ArrayList();

    /* renamed from: n */
    private boolean f24176n;

    /* renamed from: o */
    private int f24177o;

    /* renamed from: p */
    private C8843g f24178p;

    /* renamed from: q */
    private boolean f24179q;

    /* renamed from: r */
    private OnClickListener f24180r = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            User user;
            if (C8864e.this.f24164b != null) {
                str = C8864e.this.f24164b.mo21919a();
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                C8448g.m25682a(C8864e.this.getContext());
            } else {
                C8448g.m25682a(C8864e.this.getContext());
            }
            Bundle bundle = new Bundle();
            String str2 = "";
            if (C8864e.this.f24167e == 1) {
                if (C8864e.this.f24169g) {
                    str2 = "last_hourly";
                } else {
                    str2 = "hourly";
                }
            } else if (C8864e.this.f24167e == 2) {
                if (C8864e.this.f24169g) {
                    str2 = "last_regional";
                } else {
                    str2 = "regional";
                }
            }
            bundle.putString("type", str2);
            if (C8864e.this.f24168f != null) {
                C8864e.this.f24168f.lambda$put$1$DataCenter("data_gift_log_extra", bundle);
                DataCenter dataCenter = C8864e.this.f24168f;
                String str3 = "cmd_send_gift";
                if (C8864e.this.f24165c != null) {
                    user = C8864e.this.f24165c.getOwner();
                } else {
                    user = null;
                }
                dataCenter.lambda$put$1$DataCenter(str3, user);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.rank.view.e$a */
    public interface C8868a {
        /* renamed from: a */
        long[] mo21959a();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m26548b();
    }

    /* renamed from: c */
    private void m26551c() {
        this.f24171i.mo5525a((C1272h) new C1272h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                super.getItemOffsets(rect, view, recyclerView, sVar);
                int f = RecyclerView.m5892f(view);
                int itemCount = C8864e.this.f24166d.getItemCount();
                if (f == itemCount - 1) {
                    rect.bottom = (int) C9738o.m28708b(C8864e.this.getContext(), 16.0f);
                    return;
                }
                if (f == itemCount - 2) {
                    rect.top = (int) C9738o.m28708b(C8864e.this.getContext(), 16.0f);
                    rect.bottom = (int) C9738o.m28708b(C8864e.this.getContext(), 4.0f);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24174l != null) {
            this.f24174l.mo21887b();
        }
    }

    /* renamed from: d */
    private void m26552d() {
        C8750c cVar = (C8750c) C9178j.m27302j().mo22378g().mo22355a(C8750c.class);
        if (cVar != null) {
            this.f24178p = cVar.mo21755a(getContext());
        }
        if (this.f24178p == null) {
            this.f24178p = new C8843g() {
            };
        }
    }

    /* renamed from: a */
    private void m26546a() {
        int i;
        this.f24170h = inflate(getContext(), R.layout.ayo, this);
        this.f24171i = (RecyclerView) this.f24170h.findViewById(R.id.dmm);
        this.f24171i.setLayoutManager(new SSLinearLayoutManager(getContext()));
        m26551c();
        this.f24172j = (TopRankListAnchorView) this.f24170h.findViewById(R.id.dmi);
        if (this.f24169g) {
            this.f24172j.setVisibility(8);
        } else {
            TopRankListAnchorView topRankListAnchorView = this.f24172j;
            if (this.f24168f == null || ((Boolean) this.f24168f.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
                i = R.drawable.bol;
            } else {
                i = R.drawable.bs5;
            }
            topRankListAnchorView.setBackgroundResource(i);
        }
        this.f24173k = (LoadingStatusView) this.f24170h.findViewById(R.id.a62);
        m26552d();
        this.f24173k.setTag(Boolean.valueOf(this.f24176n));
    }

    /* renamed from: b */
    private void m26548b() {
        if (this.f24164b == null || C6307b.m19566a((Collection<T>) this.f24164b.f24068a) || this.f24172j == null) {
            C9738o.m28712b((View) this.f24173k, 8);
            return;
        }
        C9738o.m28712b((View) this.f24173k, 8);
        ((C3247af) C7492s.m23300b((Iterable<? extends T>) this.f24164b.f24068a).mo19291a(C8869f.f24184a).mo19334m().mo19131a((C47555ab<T, ? extends R>) C3255e.m12296a((View) this))).mo10187a(new C8870g(this), C8871h.f24186a);
        this.f24175m.clear();
        if (this.f24179q) {
            if (this.f24169g && this.f24167e == 2) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                String format = simpleDateFormat.format(new Date(this.f24164b.f24075h * 1000));
                String format2 = simpleDateFormat.format(new Date((this.f24164b.f24075h + 3600) * 1000));
                List<Object> list = this.f24175m;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f24164b.f24077j);
                sb.append(" ");
                sb.append(format);
                sb.append("-");
                sb.append(format2);
                list.add(sb.toString());
            } else if (!this.f24169g) {
                C8854c a = C8854c.m26483a(this.f24164b);
                if (a != null) {
                    a.f24093c = this.f24167e;
                    this.f24175m.add(a);
                    this.f24177o = 1;
                } else {
                    this.f24177o = 0;
                }
                this.f24175m.add(C8853b.m26482a(this.f24164b, this.f24167e));
            }
            this.f24175m.addAll(this.f24164b.f24068a);
        }
        if (!this.f24179q) {
            this.f24175m.addAll(this.f24164b.f24068a);
            this.f24175m.add(this.f24164b.f24072e);
            List<Object> list2 = this.f24175m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f24164b.f24073f);
            sb2.append("00:00:00");
            list2.add(sb2.toString());
            this.f24177o = this.f24175m.size() - 1;
        }
        if (this.f24166d == null) {
            this.f24166d = new LiveMultiTypeAdapter();
            if (this.f24179q) {
                if (this.f24169g && this.f24167e == 2) {
                    this.f24166d.mo120457a(String.class, new C8883b());
                } else if (!this.f24169g) {
                    this.f24166d.mo120457a(C8854c.class, new C8885c(this.f24164b));
                    this.f24166d.mo120457a(C8853b.class, new C8881a());
                }
            }
            this.f24166d.mo120457a(C8855d.class, new C8899n());
            this.f24166d.mo120456a(C8857f.class).mo120465a(new DailyRankContributorViewBinder(), new C8892i(this.f24167e, this.f24169g, false, this.f24164b)).mo120466a(C8872i.f24187a);
            if (!this.f24179q) {
                this.f24166d.mo120456a(String.class).mo120465a(new DailyRankTextViewBinder(), new DailyRankTimeViewBinder()).mo120466a(new C8873j(this));
                this.f24166d.mo120457a(C8853b.class, new C8881a());
            }
            this.f24171i.setAdapter(this.f24166d);
        }
        try {
            this.f24166d.mo11418a(this.f24175m);
        } catch (Exception unused) {
            this.f24171i.getRecycledViewPool().mo5820a();
            this.f24166d.notifyDataSetChanged();
        }
        if (!this.f24169g) {
            this.f24174l.mo21885a();
        }
        this.f24172j.mo21936a(this.f24164b.f24069b, this.f24180r, this.f24176n);
    }

    public void setPresenter(C8809a aVar) {
        this.f24174l = aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ int m26544a(C8857f fVar) {
        if (fVar.f24105i) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m26549b(C8857f fVar) throws Exception {
        if (fVar.f24097a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ int mo21954b(String str) {
        if (str.equals(this.f24164b.f24072e)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: c */
    private String m26550c(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f24164b == null) {
            str2 = "";
        } else {
            str2 = this.f24164b.f24073f;
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo21888a(C8852a aVar) {
        if (aVar != null) {
            this.f24164b = aVar;
            this.f24174l.mo21886a(aVar);
            m26548b();
        }
    }

    /* renamed from: a */
    public final void mo21889a(String str) {
        String c = m26550c(str);
        if (this.f24166d != null && this.f24175m.size() > this.f24177o) {
            if (this.f24175m.get(this.f24177o) instanceof C8853b) {
                ((C8853b) this.f24175m.get(this.f24177o)).f24088c = str;
            } else {
                this.f24175m.set(this.f24177o, c);
            }
            this.f24166d.notifyItemChanged(this.f24177o);
        }
        if (TextUtils.equals(str, "00:00:01")) {
            C8448g.m25682a(getContext());
            this.f24165c.getId();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21953a(List list) throws Exception {
        this.f24164b.f24068a = list;
    }

    private C8864e(Context context, DataCenter dataCenter) {
        super(context);
        this.f24168f = dataCenter;
        m26546a();
    }

    /* renamed from: a */
    public static C8864e m26545a(C8852a aVar, Room room, boolean z, String str, int i, DataCenter dataCenter, Context context, boolean z2) {
        C8864e eVar = new C8864e(context, dataCenter);
        eVar.f24164b = aVar;
        eVar.f24165c = room;
        eVar.f24176n = z;
        eVar.f24163a = str;
        eVar.f24167e = i;
        eVar.f24168f = dataCenter;
        eVar.f24169g = z2;
        eVar.f24179q = false;
        eVar.setPresenter(new C8838r(eVar, aVar, i));
        return eVar;
    }
}
