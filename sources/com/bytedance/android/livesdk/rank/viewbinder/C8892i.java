package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.core.utils.C3409v;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.event.C4434d;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.view.C8864e.C8868a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import p1886me.drakeet.multitype.C48226c;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.i */
public final class C8892i extends C48226c<C8857f, C8893a> {

    /* renamed from: a */
    private int f24225a;

    /* renamed from: b */
    private boolean f24226b;

    /* renamed from: c */
    private boolean f24227c;

    /* renamed from: d */
    private C8852a f24228d;

    /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.i$a */
    static class C8893a extends C1293v {

        /* renamed from: a */
        private int f24229a;

        /* renamed from: b */
        private boolean f24230b;

        /* renamed from: c */
        private boolean f24231c;

        /* renamed from: d */
        private ImageView f24232d;

        /* renamed from: e */
        private TextView f24233e;

        /* renamed from: f */
        private ImageView f24234f;

        /* renamed from: g */
        private TextView f24235g;

        /* renamed from: h */
        private ImageView f24236h;

        /* renamed from: i */
        private View f24237i;

        /* renamed from: j */
        private TextView f24238j;

        /* renamed from: k */
        private C8868a f24239k;

        /* renamed from: l */
        private LottieAnimationView f24240l;

        /* renamed from: m */
        private boolean f24241m;

        /* renamed from: a */
        public final void mo21985a(C8857f fVar) {
            m26612c(fVar);
            this.f24233e.setText(String.valueOf(fVar.f24099c));
            C5343e.m17045b(this.f24234f, fVar.f24097a.getAvatarThumb(), this.f24234f.getWidth(), this.f24234f.getHeight(), R.drawable.c4_);
            this.f24235g.setText(fVar.f24097a.getNickName());
            if (fVar.mo21920a() > 0) {
                this.f24241m = true;
                C9738o.m28712b(this.f24237i, 8);
                C8448g.m25683a(this.f24237i);
                m26611b(fVar);
            } else {
                this.f24241m = false;
                C9738o.m28712b((View) this.f24240l, 8);
                C9738o.m28712b(this.f24237i, 8);
            }
            if (C9290a.f25466a) {
                this.f24238j.setText(C3385e.m12593c(fVar.f24098b));
            } else {
                this.f24238j.setText(fVar.f24100d);
            }
            this.itemView.setOnClickListener(new C8895k(this, fVar));
        }

        /* renamed from: c */
        private void m26612c(C8857f fVar) {
            if (fVar != null) {
                if (this.f24231c) {
                    this.f24232d.setVisibility(8);
                    this.f24233e.setVisibility(0);
                    if (fVar.f24099c <= 0 || fVar.f24099c > 10) {
                        this.f24233e.setTextColor(this.itemView.getResources().getColor(R.color.ahv));
                    } else {
                        this.f24233e.setTextColor(this.itemView.getResources().getColor(R.color.akz));
                    }
                } else if (fVar.f24099c == 1) {
                    this.f24232d.setImageResource(R.drawable.cby);
                    this.f24232d.setVisibility(0);
                    this.f24233e.setVisibility(8);
                } else if (fVar.f24099c == 2) {
                    this.f24232d.setImageResource(R.drawable.cbz);
                    this.f24232d.setVisibility(0);
                    this.f24233e.setVisibility(8);
                } else if (fVar.f24099c == 3) {
                    this.f24232d.setImageResource(R.drawable.cc0);
                    this.f24232d.setVisibility(0);
                    this.f24233e.setVisibility(8);
                } else {
                    this.f24232d.setVisibility(8);
                    this.f24233e.setVisibility(0);
                }
            }
        }

        /* renamed from: b */
        private void m26611b(C8857f fVar) {
            long j;
            String str;
            String str2;
            if (fVar != null) {
                HashMap hashMap = new HashMap();
                if (fVar.f24097a != null && fVar.f24097a.getId() > 0) {
                    hashMap.put("anchor_id", String.valueOf(fVar.f24097a.getId()));
                }
                hashMap.put("room_id", String.valueOf(fVar.mo21920a()));
                String str3 = "anchor_id";
                if (fVar.f24097a == null) {
                    j = 0;
                } else {
                    j = fVar.f24097a.getId();
                }
                hashMap.put(str3, String.valueOf(j));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live_detail");
                hashMap.put("enter_from", "live_detail");
                hashMap.put("action_type", "click");
                String str4 = "event_module";
                if (this.f24229a == 1) {
                    str = "hourly_rank";
                } else {
                    str = "regional_rank";
                }
                hashMap.put(str4, str);
                if (LinkCrossRoomDataHolder.m13782a().f11665c > 0) {
                    hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11665c));
                    hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11666d));
                    String str5 = "connection_type";
                    if (LinkCrossRoomDataHolder.m13782a().f11672j == 0) {
                        str2 = "anchor";
                    } else {
                        str2 = "pk";
                    }
                    hashMap.put(str5, str2);
                }
                hashMap.put("enter_from_merge", "live_detail");
                hashMap.put("enter_method", "hourly_rank");
                C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
                if (a instanceof C8420k) {
                    C8420k kVar = (C8420k) a;
                    if (kVar.mo21568a().containsKey("enter_from_merge")) {
                        hashMap.put("previous_page", (String) kVar.mo21568a().get("enter_from_merge"));
                    }
                }
                C8443c.m25663a().mo21606a("live_show", hashMap, new C8438j(), Room.class);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo21986a(C8857f fVar, View view) {
            long[] a;
            if (fVar.f24097a != null) {
                String str = "";
                if (this.f24229a == 1) {
                    if (this.f24230b) {
                        str = "last_hourly_rank";
                    } else {
                        str = "hourly_rank";
                    }
                } else if (this.f24229a == 2) {
                    if (this.f24230b) {
                        str = "last_regional_rank";
                    } else {
                        str = "regional_rank";
                    }
                }
                String str2 = str;
                C9097a a2 = C9097a.m27146a();
                User user = fVar.f24097a;
                long a3 = fVar.mo21920a();
                if (this.f24239k == null) {
                    a = new long[0];
                } else {
                    a = this.f24239k.mo21959a();
                }
                C4434d dVar = new C4434d(user, a3, a, fVar.f24099c, str2);
                a2.mo22267a((Object) dVar);
            }
        }

        public C8893a(View view, int i, boolean z, boolean z2, C8868a aVar) {
            super(view);
            this.f24229a = i;
            this.f24230b = z;
            this.f24232d = (ImageView) view.findViewById(R.id.cnb);
            this.f24233e = (TextView) view.findViewById(R.id.cnf);
            this.f24234f = (ImageView) view.findViewById(R.id.e8m);
            this.f24235g = (TextView) view.findViewById(R.id.e9m);
            this.f24236h = (ImageView) view.findViewById(R.id.b65);
            this.f24237i = view.findViewById(R.id.bp5);
            this.f24238j = (TextView) view.findViewById(R.id.dj0);
            this.f24240l = (LottieAnimationView) view.findViewById(R.id.bnj);
            this.f24231c = z2;
            this.f24239k = aVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public long[] mo21984a() {
        if ((!((Boolean) LiveSettingKeys.ENABLE_SLIDE_FROM_DAILY_RANK_NORMAL.mo10240a()).booleanValue() && !((Boolean) LiveSettingKeys.ENABLE_SLIDE_FROM_DAILY_RANK_FEED_DRAWER.mo10240a()).booleanValue()) || this.f24228d == null || C3409v.m12670a(this.f24228d.f24068a)) {
            return new long[0];
        }
        ArrayList arrayList = new ArrayList();
        for (C8857f a : this.f24228d.f24068a) {
            long a2 = a.mo21920a();
            if (a2 != 0) {
                arrayList.add(Long.valueOf(a2));
            }
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        return jArr;
    }

    /* renamed from: a */
    private static void m26605a(C8893a aVar, C8857f fVar) {
        aVar.mo21985a(fVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26605a((C8893a) vVar, (C8857f) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8893a mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C8893a aVar = new C8893a(layoutInflater.inflate(R.layout.ate, viewGroup, false), this.f24225a, this.f24226b, this.f24227c, new C8894j(this));
        return aVar;
    }

    public C8892i(int i, boolean z, boolean z2, C8852a aVar) {
        this.f24225a = i;
        this.f24226b = z;
        this.f24227c = z2;
        this.f24228d = aVar;
    }
}
