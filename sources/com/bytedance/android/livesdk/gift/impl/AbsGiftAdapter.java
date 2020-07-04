package com.bytedance.android.livesdk.gift.impl;

import android.content.Context;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.model.C4886as;
import com.bytedance.android.livesdk.gift.C8289y;
import com.bytedance.android.livesdk.gift.holder.BannerPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder.C8082a;
import com.bytedance.android.livesdk.gift.holder.GiftAdViewHolder;
import com.bytedance.android.livesdk.gift.holder.GiftPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.PropPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.RedPacketPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.TaskGiftPanelViewHolder;
import com.bytedance.android.livesdk.gift.holder.XgPanelViewHolder;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.model.p390a.C8136c;
import com.bytedance.android.livesdk.gift.model.p390a.C8138e;
import com.bytedance.android.livesdk.gift.model.p390a.C8141h;
import com.bytedance.android.livesdk.gift.model.p390a.C8142i;
import com.bytedance.android.livesdk.gift.model.p390a.C8143j;
import com.bytedance.android.livesdk.gift.model.p390a.C8144k;
import com.bytedance.android.livesdk.gift.p371a.C7861b;
import com.bytedance.android.livesdk.gift.panel.GiftListDiffUtilCallback;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9075m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7498y;

public abstract class AbsGiftAdapter extends C1262a<BasePanelViewHolder> implements C8082a {

    /* renamed from: a */
    public final Context f22126a;

    /* renamed from: b */
    public final List<C8135b> f22127b = new ArrayList();

    /* renamed from: c */
    public boolean f22128c;

    /* renamed from: d */
    public GiftDialogViewModel f22129d;

    /* renamed from: e */
    private final LayoutInflater f22130e;

    /* renamed from: f */
    private Room f22131f;

    /* renamed from: g */
    private C8135b f22132g;

    /* renamed from: h */
    private C8111a f22133h;

    /* renamed from: i */
    private final C8113c f22134i = new C8113c();

    /* renamed from: j */
    private final int f22135j = 1000;

    /* renamed from: k */
    private boolean f22136k;

    /* renamed from: l */
    private boolean f22137l;

    /* renamed from: com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter$a */
    public interface C8111a {
        /* renamed from: a */
        void mo21227a(C8135b bVar, boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter$b */
    public interface C8112b {
        /* renamed from: a */
        void mo21228a(C8135b bVar, boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter$c */
    class C8113c implements C8112b {

        /* renamed from: a */
        C8112b f22138a;

        private C8113c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo21229a(List<C8135b> list) {
            for (C8135b bVar : list) {
                if (bVar != null) {
                    mo21228a(bVar, false);
                }
            }
        }

        /* renamed from: a */
        public final void mo21228a(C8135b bVar, boolean z) {
            if (this.f22138a != null) {
                this.f22138a.mo21228a(bVar, z);
            }
        }
    }

    /* renamed from: a */
    public BasePanelViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
            case 8:
                return new GiftPanelViewHolder(this.f22130e.inflate(R.layout.asv, null));
            case 2:
                return new PropPanelViewHolder(this.f22130e.inflate(R.layout.asx, null));
            case 4:
                return new TaskGiftPanelViewHolder(this.f22130e.inflate(R.layout.asv, null));
            case 5:
                return new RedPacketPanelViewHolder(this.f22130e.inflate(R.layout.asv, null));
            case 6:
                return new GiftAdViewHolder(this.f22130e.inflate(R.layout.asw, null));
            case 7:
                return new XgPanelViewHolder(this.f22130e.inflate(R.layout.asv, null), this.f22128c);
            default:
                return new BannerPanelViewHolder(this.f22130e.inflate(R.layout.ast, null));
        }
    }

    /* renamed from: a */
    public final C8135b mo21222a(long j) {
        for (C8135b bVar : this.f22127b) {
            if (bVar != null && bVar.mo21275p() == j) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo21223a() {
        this.f22134i.mo21229a(this.f22127b);
        this.f22132g = null;
    }

    /* renamed from: a */
    public void mo21225a(List<C8135b> list) {
        C1143a.m5066a(new GiftListDiffUtilCallback(this.f22127b, list, this.f22136k)).mo4548a((C1262a) this);
        this.f22127b.clear();
        this.f22127b.addAll(list);
    }

    /* renamed from: a */
    public final void mo21171a(BasePanelViewHolder basePanelViewHolder, C8135b bVar) {
        if (basePanelViewHolder instanceof BannerPanelViewHolder) {
            m24867a((C8136c) bVar);
        } else if (basePanelViewHolder instanceof RedPacketPanelViewHolder) {
            m24869a((C8142i) bVar);
        } else if (basePanelViewHolder instanceof TaskGiftPanelViewHolder) {
            m24870a((C8143j) bVar);
        } else if (basePanelViewHolder instanceof GiftAdViewHolder) {
            m24865a(basePanelViewHolder, (C8138e) bVar);
        } else if (basePanelViewHolder instanceof XgPanelViewHolder) {
            m24866a((C8134a) (C8144k) bVar);
        } else if (basePanelViewHolder instanceof PropPanelViewHolder) {
            m24868a((C8141h) bVar);
        } else {
            m24866a((C8134a) bVar);
        }
    }

    /* renamed from: b */
    public final void mo21226b() {
        this.f22127b.clear();
    }

    public int getItemCount() {
        return this.f22127b.size();
    }

    /* renamed from: a */
    private void m24868a(C8141h hVar) {
        m24866a((C8134a) hVar);
    }

    /* renamed from: a */
    public final void mo21224a(C8112b bVar) {
        this.f22134i.f22138a = bVar;
    }

    /* renamed from: a */
    private void m24866a(C8134a aVar) {
        if (this.f22136k) {
            m24871b(aVar);
        } else {
            m24871b(aVar);
        }
    }

    /* renamed from: b */
    private void m24871b(C8134a aVar) {
        if (this.f22133h != null) {
            this.f22133h.mo21227a(aVar, true);
        }
    }

    public long getItemId(int i) {
        return ((C8135b) this.f22127b.get(i)).mo21275p();
    }

    public int getItemViewType(int i) {
        return ((C8135b) this.f22127b.get(i)).f22203a;
    }

    /* renamed from: a */
    private void m24867a(C8136c cVar) {
        if (this.f22133h != null) {
            this.f22133h.mo21227a(cVar, true);
        }
    }

    /* renamed from: a */
    private void m24869a(C8142i iVar) {
        if ((!iVar.f22205c || iVar.mo21262c()) && this.f22133h != null) {
            this.f22133h.mo21227a(iVar, true);
        }
    }

    /* renamed from: a */
    private void m24870a(C8143j jVar) {
        if (jVar.f22205c && !jVar.mo21262c()) {
            return;
        }
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(this.f22126a, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f68)).mo22193d("live_detail").mo22194e("gift_send").mo22192c("gift").mo22188a(1003).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
        } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.TASK_GIFT)) {
            if (C8289y.m25347a().mo21445b() <= 0) {
                C9097a.m27146a().mo22267a((Object) new C4886as());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("log_pb", this.f22131f.getLog_pb());
                    jSONObject.put("request_id", this.f22131f.getRequestId());
                    jSONObject.put("source", this.f22131f.getUserFrom());
                    C8448g.m25682a(this.f22126a);
                    ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b();
                    this.f22131f.getId();
                } catch (JSONException unused) {
                }
            } else {
                m24866a((C8134a) jVar);
            }
        }
    }

    /* renamed from: a */
    public final int mo21220a(C8135b bVar) {
        for (int i = 0; i < this.f22127b.size(); i++) {
            if (((C8135b) this.f22127b.get(i)).equals(bVar)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(BasePanelViewHolder basePanelViewHolder, int i) {
        C8135b bVar = (C8135b) this.f22127b.get(i);
        if (bVar != null) {
            if (bVar.f22203a == 0) {
                basePanelViewHolder.itemView.setVisibility(4);
                return;
            }
            basePanelViewHolder.mo21167a(bVar);
            basePanelViewHolder.f22042l = this;
        }
    }

    /* renamed from: a */
    private void m24865a(BasePanelViewHolder basePanelViewHolder, C8138e eVar) {
        mo21223a();
        C9097a.m27146a().mo22267a((Object) new C7861b(false));
        if (basePanelViewHolder != null && basePanelViewHolder.itemView != null && !C9075m.m27092a(basePanelViewHolder.itemView.getId(), 1000) && this.f22133h != null) {
            this.f22133h.mo21227a(eVar, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(BasePanelViewHolder basePanelViewHolder, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(basePanelViewHolder, i);
            return;
        }
        C8135b bVar = (C8135b) this.f22127b.get(i);
        if (bVar != null) {
            if (bVar.f22203a == 0) {
                basePanelViewHolder.itemView.setVisibility(4);
                return;
            }
            basePanelViewHolder.mo21170a(bVar, list);
            basePanelViewHolder.f22042l = this;
        }
    }

    public AbsGiftAdapter(Context context, Room room, C8111a aVar, boolean z) {
        this.f22126a = context;
        this.f22131f = room;
        this.f22130e = LayoutInflater.from(this.f22126a);
        this.f22133h = aVar;
        this.f22136k = false;
        this.f22137l = z;
    }
}
