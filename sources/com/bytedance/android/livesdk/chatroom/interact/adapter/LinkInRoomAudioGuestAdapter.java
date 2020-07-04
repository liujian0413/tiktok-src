package com.bytedance.android.livesdk.chatroom.interact.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

public class LinkInRoomAudioGuestAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public List<C4854e> f13017a;

    /* renamed from: b */
    public C4470a f13018b;

    /* renamed from: c */
    private List<C4854e> f13019c;

    public class AudioGuestViewHolder extends C1293v {

        /* renamed from: b */
        private ImageView f13021b;

        /* renamed from: c */
        private TextView f13022c;

        /* renamed from: d */
        private TextView f13023d;

        /* renamed from: e */
        private TextView f13024e;

        /* renamed from: f */
        private View f13025f;

        /* renamed from: g */
        private View f13026g;

        /* renamed from: h */
        private LottieAnimationView f13027h;

        /* renamed from: i */
        private C4854e f13028i;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12228a(View view) {
            LinkInRoomAudioGuestAdapter.this.f13018b.mo12234a(this.f13028i);
        }

        /* renamed from: a */
        public final void mo12230a(boolean z) {
            if (!z || this.f13028i.f13879l != 0) {
                this.f13027h.setVisibility(4);
                if (this.f13027h.mo7084e()) {
                    this.f13027h.mo7085f();
                }
                return;
            }
            this.f13027h.setVisibility(0);
            this.f13027h.mo7078b();
        }

        AudioGuestViewHolder(View view) {
            super(view);
            this.f13021b = (ImageView) view.findViewById(R.id.at9);
            this.f13022c = (TextView) view.findViewById(R.id.atb);
            this.f13023d = (TextView) view.findViewById(R.id.at_);
            this.f13024e = (TextView) view.findViewById(R.id.ata);
            this.f13025f = view.findViewById(R.id.atc);
            this.f13026g = view.findViewById(R.id.atd);
            this.f13027h = (LottieAnimationView) view.findViewById(R.id.cmw);
            this.f13027h.setAnimation("audio_interact_effect.json");
            this.f13027h.mo7082c(true);
            view.setOnClickListener(new C4477a(this));
        }

        /* renamed from: a */
        public final void mo12229a(C4854e eVar, int i) {
            this.f13028i = eVar;
            C5343e.m17043b(this.f13021b, eVar.f13871d.getAvatarMedium());
            this.f13022c.setText(String.valueOf(i + 1));
            if (eVar.f13871d.getGender() == 1) {
                this.f13022c.setBackgroundResource(R.drawable.bvu);
            } else if (eVar.f13871d.getGender() == 2) {
                this.f13022c.setBackgroundResource(R.drawable.bvt);
            } else {
                this.f13022c.setBackgroundResource(R.drawable.bvv);
            }
            this.f13023d.setText(C3385e.m12593c(eVar.f13869b));
            this.f13024e.setText(eVar.f13871d.getNickName());
            if (eVar.f13879l != 0) {
                this.f13025f.setVisibility(0);
                this.f13026g.setVisibility(0);
                this.f13027h.setVisibility(4);
                if (this.f13027h.mo7084e()) {
                    this.f13027h.mo7085f();
                }
            } else {
                this.f13025f.setVisibility(8);
                this.f13026g.setVisibility(8);
            }
        }
    }

    public class EmptyStubViewHolder extends C1293v {

        /* renamed from: b */
        private TextView f13030b;

        /* renamed from: c */
        private int f13031c;

        /* renamed from: a */
        public final void mo12231a(int i) {
            this.f13031c = i;
            this.f13030b.setText(String.valueOf(this.f13031c + 1));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12232a(View view) {
            if (LinkInRoomAudioGuestAdapter.this.f13017a == null || LinkInRoomAudioGuestAdapter.this.f13017a.size() == 0) {
                LinkInRoomAudioGuestAdapter.this.f13018b.mo12235b(this.f13031c);
                return;
            }
            long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
            for (C4854e eVar : LinkInRoomAudioGuestAdapter.this.f13017a) {
                if (b == eVar.f13871d.getId()) {
                    return;
                }
            }
            LinkInRoomAudioGuestAdapter.this.f13018b.mo12235b(this.f13031c);
        }

        EmptyStubViewHolder(View view) {
            super(view);
            this.f13030b = (TextView) view.findViewById(R.id.aea);
            view.setOnClickListener(new C4478b(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioGuestAdapter$a */
    public interface C4470a {
        /* renamed from: a */
        void mo12233a(int i, boolean z);

        /* renamed from: a */
        void mo12234a(C4854e eVar);

        /* renamed from: b */
        void mo12235b(int i);
    }

    public int getItemCount() {
        return this.f13019c.size();
    }

    /* renamed from: a */
    public final void mo12226a(List<C4854e> list) {
        this.f13019c = list;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        if (((C4854e) this.f13019c.get(i)).f13870c < 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo12227a(Map<String, Boolean> map) {
        for (int i = 0; i < this.f13019c.size(); i++) {
            C4854e eVar = (C4854e) this.f13019c.get(i);
            Boolean bool = (Boolean) map.get(String.valueOf(eVar.f13870c));
            if (!(eVar.f13870c <= 0 || bool == null || bool.booleanValue() == eVar.f13881n)) {
                eVar.f13881n = bool.booleanValue();
                this.f13018b.mo12233a(i, eVar.f13881n);
            }
        }
    }

    public LinkInRoomAudioGuestAdapter(List<C4854e> list, C4470a aVar) {
        this.f13019c = list;
        this.f13018b = aVar;
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (vVar instanceof EmptyStubViewHolder) {
            ((EmptyStubViewHolder) vVar).mo12231a(i);
            return;
        }
        if (vVar instanceof AudioGuestViewHolder) {
            ((AudioGuestViewHolder) vVar).mo12229a((C4854e) this.f13019c.get(i), i);
        }
    }

    /* renamed from: a */
    public final void mo12225a(long j, long j2) {
        int i = -1;
        for (int i2 = 0; i2 < this.f13019c.size(); i2++) {
            C4854e eVar = (C4854e) this.f13019c.get(i2);
            if (eVar.f13870c > 0 && eVar.f13871d.getId() == j) {
                ((C4854e) this.f13019c.get(i2)).f13869b = j2;
                i = i2;
            }
        }
        if (i >= 0) {
            notifyItemChanged(i);
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new EmptyStubViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.at2, viewGroup, false));
        }
        return new AudioGuestViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.at3, viewGroup, false));
    }
}
