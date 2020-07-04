package com.bytedance.android.livesdk.gift.holder;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.C8284u;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.model.p390a.C8141h;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.widget.CountDownTextView;
import com.bytedance.android.livesdk.widget.CountDownTextView.C9192a;
import com.bytedance.android.livesdk.widget.SendGiftAnimationView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;

public class PropPanelViewHolder extends BaseGiftPanelViewHolder<C8141h> implements OnClickListener {

    /* renamed from: n */
    private final CountDownTextView f22049n;

    /* renamed from: o */
    private final TextView f22050o;

    /* renamed from: p */
    private View f22051p;

    /* renamed from: q */
    private C8134a f22052q;

    /* renamed from: r */
    private SendGiftAnimationView f22053r;

    /* renamed from: a */
    public final void mo21168a(boolean z) {
    }

    public PropPanelViewHolder(View view) {
        super(view);
        this.f22050o = (TextView) view.findViewById(R.id.dv5);
        this.f22049n = (CountDownTextView) view.findViewById(R.id.e3b);
        this.f22049n.setCountDownListener(new C9192a() {
            /* renamed from: a */
            public final void mo21173a(TextView textView) {
                long j;
                Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
                C8284u a = C8284u.m25332a();
                if (currentRoom != null) {
                    j = currentRoom.getId();
                } else {
                    j = 0;
                }
                a.mo21438b(j);
            }
        });
    }

    /* renamed from: b */
    private static void m24801b(C8141h hVar) {
        if (((Prop) hVar.f22206d).propType == 4) {
            HashMap hashMap = new HashMap();
            hashMap.put("cards_left", String.valueOf(((Prop) hVar.f22206d).count));
            C8443c.m25663a().mo21606a("popular_card_show", hashMap, Room.class);
        }
    }

    public void onClick(View view) {
        Prop prop;
        if (view.getId() == R.id.gf && (view instanceof SendGiftAnimationView)) {
            if (this.f22052q == null || !(this.f22052q.f22206d instanceof Prop)) {
                prop = null;
            } else {
                prop = (Prop) this.f22052q.f22206d;
            }
            if (prop != null && prop.count > 0) {
                ((SendGiftAnimationView) view).mo22588a(0.7f);
                if (this.f22042l != null) {
                    this.f22042l.mo21171a(this, this.f22052q);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21167a(C8141h hVar) {
        String str;
        C8141h hVar2 = hVar;
        super.mo21167a(hVar);
        this.f22052q = hVar2;
        this.f22051p = this.f22038h.findViewById(R.id.a20);
        this.f22053r = (SendGiftAnimationView) this.f22038h.findViewById(R.id.gf);
        boolean z = true;
        if (((Prop) hVar2.f22206d).count <= 0) {
            this.f22050o.setVisibility(8);
        } else {
            this.f22050o.setVisibility(0);
            this.f22050o.setText(C3358ac.m12517a((int) R.string.et6, Integer.valueOf(((Prop) hVar2.f22206d).count)));
        }
        if (((Prop) hVar2.f22206d).nextExpire > 0) {
            long currentTimeMillis = ((Prop) hVar2.f22206d).nextExpire - ((System.currentTimeMillis() / 1000) + ((Prop) hVar2.f22206d).getNowTimeDiff());
            if (currentTimeMillis <= 0) {
                str = this.f22035e.getResources().getString(R.string.et7, new Object[]{"00:00"});
            } else {
                if (currentTimeMillis < 3600) {
                    str = this.f22035e.getResources().getString(R.string.et7, new Object[]{C9048ao.m27017a(currentTimeMillis)});
                    this.f22049n.mo22433a(R.string.et7, currentTimeMillis, 0);
                } else if (currentTimeMillis < 86400) {
                    int i = (int) (currentTimeMillis / 3600);
                    str = this.f22035e.getResources().getQuantityString(R.plurals.a6, i, new Object[]{Integer.valueOf(i)});
                } else {
                    int i2 = (int) (currentTimeMillis / 86400);
                    str = this.f22035e.getResources().getQuantityString(R.plurals.a5, i2, new Object[]{Integer.valueOf(i2)});
                }
                z = false;
            }
            this.f22049n.setText(str);
            this.f22049n.setVisibility(0);
        } else {
            this.f22049n.setVisibility(4);
            z = false;
        }
        this.f22039i.setVisibility(4);
        this.f22040j.setVisibility(4);
        if (((Prop) hVar2.f22206d).propType != 4 || ((Prop) hVar2.f22206d).count > 0) {
            this.f22039i.setTextColor(C3358ac.m12521b((int) R.color.am7));
        } else {
            this.f22039i.setText(R.string.fe8);
            this.f22039i.setTextColor(C3358ac.m12521b((int) R.color.apg));
            this.f22040j.setVisibility(8);
        }
        if (hVar2.f22205c || ((Prop) hVar2.f22206d).count <= 0 || z) {
            this.f22051p.setAlpha(0.32f);
        } else {
            this.f22051p.setAlpha(1.0f);
        }
        m24801b(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21170a(C8141h hVar, List<Object> list) {
        for (String str : ((Bundle) list.get(0)).keySet()) {
            char c = 65535;
            if (str.hashCode() == 586503955 && str.equals("key_prop_count")) {
                c = 0;
            }
            if (c == 0) {
                this.f22050o.setText(C3358ac.m12517a((int) R.string.et6, Integer.valueOf(((Prop) hVar.f22206d).count)));
                if (((Prop) hVar.f22206d).count <= 0) {
                    hVar.f22204b = false;
                    this.f22051p.setAlpha(0.32f);
                } else {
                    hVar.f22204b = true;
                    this.f22051p.setAlpha(1.0f);
                }
                mo21168a(hVar.f22204b);
            }
        }
    }
}
