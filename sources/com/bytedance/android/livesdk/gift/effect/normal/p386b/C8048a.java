package com.bytedance.android.livesdk.gift.effect.normal.p386b;

import android.content.Context;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdk.gift.effect.entry.p382d.C8025a;
import com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage;
import com.bytedance.android.livesdk.gift.effect.normal.p387c.C8050a;
import com.bytedance.android.livesdk.gift.effect.normal.p387c.C8051b;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.gift.effect.normal.b.a */
public class C8048a {

    /* renamed from: j */
    private static final String f21893j = "com.bytedance.android.livesdk.gift.effect.normal.b.a";

    /* renamed from: a */
    public NormalGiftMessage f21894a;

    /* renamed from: b */
    public boolean f21895b = true;

    /* renamed from: c */
    public boolean f21896c;

    /* renamed from: d */
    public boolean f21897d;

    /* renamed from: e */
    public NormalGiftAnimationView f21898e;

    /* renamed from: f */
    public NormalGiftCombView f21899f;

    /* renamed from: g */
    public C8051b f21900g;

    /* renamed from: h */
    public C8025a f21901h;

    /* renamed from: i */
    public int f21902i;

    /* renamed from: k */
    private int f21903k;

    /* renamed from: l */
    private int f21904l;

    /* renamed from: m */
    private int f21905m;

    /* renamed from: n */
    private Context f21906n;

    /* renamed from: o */
    private Map<String, Object> f21907o = new HashMap();

    /* renamed from: p */
    private final List<Integer> f21908p = new ArrayList();

    /* renamed from: q */
    private C8050a f21909q = new C8050a() {
        /* renamed from: b */
        public final void mo21004b() {
            C8048a.this.f21896c = false;
        }

        /* renamed from: a */
        public final void mo21003a() {
            if (C8048a.this.f21894a.f21914d > 0) {
                C8048a.this.f21894a.mo21009b();
                C8048a.this.f21899f.mo21031b();
                C8048a.this.mo21001d();
                return;
            }
            C8048a.this.f21896c = true;
        }

        /* renamed from: c */
        public final void mo21005c() {
            C8048a.this.f21898e.removeView(C8048a.this.f21899f);
            C8048a.this.f21899f.mo21032c();
            C8048a.this.f21899f = null;
            if (C8048a.this.f21894a.f21914d > 0) {
                C8048a.this.f21894a.mo21009b();
                C8048a.this.mo21000c();
                return;
            }
            if (C8048a.this.f21894a.f21916f) {
                C8048a.this.mo20998b();
            }
            C8048a.this.f21896c = false;
            C8048a.this.f21895b = true;
            if (C8048a.this.f21900g != null) {
                C8048a.this.f21900g.mo21006a();
            }
        }
    };

    /* renamed from: a */
    public final void mo20996a() {
        if (this.f21900g != null) {
            this.f21900g = null;
        }
        if (this.f21901h != null) {
            this.f21901h = null;
        }
    }

    /* renamed from: b */
    public final void mo20998b() {
        if (this.f21901h != null && this.f21894a != null) {
            this.f21901h.mo13962a(this.f21894a.f21926l, this.f21894a.f21917g, this.f21894a.f21924j, this.f21894a.f21920q);
        }
    }

    /* renamed from: e */
    public final void mo21002e() {
        if (this.f21899f != null) {
            this.f21898e.removeView(this.f21899f);
            this.f21899f.mo21032c();
            this.f21899f = null;
        }
        this.f21895b = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r2.f22234e == 11) goto L_0x0033;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21000c() {
        /*
            r5 = this;
            r0 = 0
            r5.f21895b = r0
            r5.f21896c = r0
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = r5.f21899f
            if (r1 != 0) goto L_0x0013
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = new com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView
            android.content.Context r2 = r5.f21906n
            r1.<init>(r2)
            r5.f21899f = r1
            goto L_0x0018
        L_0x0013:
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = r5.f21899f
            r1.mo21027a()
        L_0x0018:
            r1 = 1
            com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage r2 = r5.f21894a
            if (r2 == 0) goto L_0x0032
            com.bytedance.android.livesdk.gift.GiftManager r2 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage r3 = r5.f21894a
            long r3 = r3.f21924j
            com.bytedance.android.livesdk.gift.model.d r2 = r2.findGiftById(r3)
            if (r2 == 0) goto L_0x0032
            int r2 = r2.f22234e
            r3 = 11
            if (r2 != r3) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = r5.f21899f
            r1.setShowCombo(r0)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f21899f
            int r1 = r5.f21902i
            r0.setOrientation(r1)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f21899f
            com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage r1 = r5.f21894a
            boolean r2 = r5.f21897d
            r0.mo21030a(r1, r2)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f21899f
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView r1 = r5.f21898e
            int r1 = r1.getWidth()
            int r1 = -r1
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView r2 = r5.f21898e
            int r2 = r2.getHeight()
            int r3 = r5.f21905m
            int r2 = r2 - r3
            int r3 = r5.f21903k
            int r4 = r5.f21904l
            int r3 = r3 * r4
            int r2 = r2 - r3
            r0.mo21028a(r1, r2)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f21899f
            com.bytedance.android.livesdk.gift.effect.entry.d.a r1 = r5.f21901h
            r0.setClickListener(r1)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView r0 = r5.f21898e
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r1 = r5.f21899f
            r0.addView(r1)
            com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftCombView r0 = r5.f21899f
            com.bytedance.android.livesdk.gift.effect.normal.c.a r1 = r5.f21909q
            boolean r2 = r5.f21897d
            r0.mo21029a(r1, r2)
            r5.mo21001d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.normal.p386b.C8048a.mo21000c():void");
    }

    /* renamed from: d */
    public final void mo21001d() {
        boolean z;
        C8489ao aoVar = this.f21894a.f21920q;
        if (aoVar == null || !aoVar.f23265n) {
            z = false;
        } else {
            z = true;
        }
        Map<String, Integer> map = this.f21894a.f21919p;
        int i = this.f21894a.f21913c * this.f21894a.f21911a;
        if (z && map != null) {
            Set<String> keySet = map.keySet();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String parseInt : keySet) {
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException unused) {
                }
            }
            Collections.sort(arrayList);
            int i2 = -1;
            for (Integer intValue : arrayList) {
                int intValue2 = intValue.intValue();
                boolean z2 = false;
                for (Integer intValue3 : this.f21908p) {
                    if (intValue3.intValue() == intValue2) {
                        z2 = true;
                    }
                }
                if (i >= intValue2 && !z2) {
                    this.f21908p.add(Integer.valueOf(intValue2));
                    Integer num = (Integer) map.get(String.valueOf(intValue2));
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                }
            }
            if (i2 != -1) {
                String str = f21893j;
                StringBuilder sb = new StringBuilder("触发连发特效， 原giftId=");
                sb.append(this.f21894a.f21924j);
                sb.append(", 触发giftId=");
                sb.append(i2);
                C3166a.m11964c(str, sb.toString());
                C8489ao aoVar2 = new C8489ao();
                aoVar2.baseMessage = this.f21894a.f21920q.baseMessage;
                aoVar2.f23252a = this.f21894a.f21920q.f23252a;
                aoVar2.f23253b = this.f21894a.f21920q.f23253b;
                aoVar2.f23254c = (long) i2;
                if (this.f21901h != null) {
                    this.f21901h.mo13964b(aoVar2);
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m24660c(NormalGiftMessage normalGiftMessage) {
        if (!this.f21895b && this.f21894a.mo21007a().equals(normalGiftMessage.mo21007a()) && !this.f21894a.f21916f && this.f21894a.mo21008a(normalGiftMessage) && !normalGiftMessage.f21916f) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m24661d(NormalGiftMessage normalGiftMessage) {
        if (!this.f21895b && this.f21894a.mo21007a().equals(normalGiftMessage.mo21007a()) && !this.f21894a.f21916f && normalGiftMessage.f21916f && this.f21894a.f21913c + this.f21894a.f21914d == normalGiftMessage.f21913c) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo20999b(NormalGiftMessage normalGiftMessage) {
        this.f21894a = normalGiftMessage;
        mo21000c();
        this.f21907o.put("gift_msg_id", String.valueOf(this.f21894a.f21923i));
        this.f21907o.put("gift_id", String.valueOf(this.f21894a.f21924j));
        C8444d.m25673b().mo9999a("ttlive_gift", this.f21907o);
    }

    /* renamed from: a */
    public final boolean mo20997a(NormalGiftMessage normalGiftMessage) {
        if (!(this.f21894a == null || normalGiftMessage == null || (this.f21894a.mo21007a().equals(normalGiftMessage.mo21007a()) && normalGiftMessage.f21913c != 1))) {
            this.f21908p.clear();
        }
        if (m24660c(normalGiftMessage)) {
            this.f21894a.mo21010b(normalGiftMessage);
        } else if (!m24661d(normalGiftMessage)) {
            return false;
        } else {
            this.f21894a.f21916f = true;
            this.f21894a.f21917g = normalGiftMessage.f21917g;
            this.f21894a.f21920q = normalGiftMessage.f21920q;
        }
        if (this.f21896c && this.f21894a.f21914d > 0) {
            this.f21894a.mo21009b();
            this.f21899f.mo21031b();
            mo21001d();
            this.f21896c = false;
        }
        return true;
    }

    public C8048a(Context context, NormalGiftAnimationView normalGiftAnimationView, int i) {
        this.f21906n = context;
        this.f21898e = normalGiftAnimationView;
        this.f21903k = i;
        this.f21907o.put("desc", "播放小礼物动画");
        this.f21904l = (int) (context.getResources().getDimension(R.dimen.pe) + context.getResources().getDimension(R.dimen.pk));
        this.f21905m = (int) context.getResources().getDimension(R.dimen.pl);
    }
}
