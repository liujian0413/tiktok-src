package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.entry.p382d.C8025a;
import com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage;
import com.bytedance.android.livesdk.gift.effect.normal.p385a.C8047a;
import com.bytedance.android.livesdk.gift.effect.normal.p386b.C8048a;
import com.bytedance.android.livesdk.gift.effect.normal.p387c.C8051b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NormalGiftAnimationView extends FrameLayout {

    /* renamed from: a */
    private Context f21938a;

    /* renamed from: b */
    private List<C8048a> f21939b;

    /* renamed from: c */
    private Map<String, NormalGiftMessage> f21940c;

    /* renamed from: d */
    private List<NormalGiftMessage> f21941d;

    /* renamed from: e */
    private C8025a f21942e;

    /* renamed from: f */
    private int f21943f;

    /* renamed from: g */
    private C8051b f21944g;

    /* renamed from: a */
    public final void mo21020a() {
        for (C8048a aVar : this.f21939b) {
            aVar.f21897d = false;
        }
    }

    /* renamed from: c */
    public final void mo21023c() {
        if (this.f21940c != null) {
            this.f21940c.clear();
        }
        if (this.f21941d != null) {
            this.f21941d.clear();
        }
    }

    /* renamed from: d */
    private void m24694d() {
        this.f21939b = new ArrayList();
        int i = 0;
        while (i < 2) {
            i++;
            C8048a aVar = new C8048a(this.f21938a, this, i);
            aVar.f21900g = this.f21944g;
            this.f21939b.add(aVar);
        }
        this.f21940c = new LinkedHashMap();
        this.f21941d = new ArrayList();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21940c.clear();
        this.f21941d.clear();
        for (C8048a aVar : this.f21939b) {
            aVar.mo20996a();
            aVar.mo21002e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r0 = r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24695e() {
        /*
            r8 = this;
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage> r0 = r8.f21941d
            int r0 = r0.size()
            int r1 = r8.f21943f
            if (r0 <= r1) goto L_0x0045
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage> r0 = r8.f21941d
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage r0 = (com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage) r0
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage> r1 = r8.f21941d
            java.util.Iterator r1 = r1.iterator()
        L_0x0019:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r1.next()
            com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage r2 = (com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage) r2
            com.bytedance.android.live.base.model.user.User r3 = r2.f21926l
            if (r3 == 0) goto L_0x0043
            com.bytedance.android.live.base.model.user.User r3 = r2.f21926l
            long r3 = r3.getId()
            java.lang.Class<com.bytedance.android.live.user.a> r5 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r5 = com.bytedance.android.live.utility.C3596c.m13172a(r5)
            com.bytedance.android.live.user.a r5 = (com.bytedance.android.live.user.C3592a) r5
            com.bytedance.android.livesdk.user.e r5 = r5.user()
            long r5 = r5.mo22179b()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0019
        L_0x0043:
            r0 = r2
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x005e
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage> r1 = r8.f21941d
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x005e
            java.util.Map<java.lang.String, com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage> r1 = r8.f21940c
            java.lang.String r2 = r0.mo21007a()
            r1.remove(r2)
            java.util.List<com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage> r1 = r8.f21941d
            r1.remove(r0)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView.m24695e():void");
    }

    /* renamed from: b */
    public final void mo21022b() {
        if (this.f21941d.isEmpty()) {
            for (C8048a aVar : this.f21939b) {
                if (aVar.f21895b) {
                    aVar.mo21002e();
                }
            }
            return;
        }
        NormalGiftMessage normalGiftMessage = (NormalGiftMessage) this.f21941d.get(0);
        for (C8048a aVar2 : this.f21939b) {
            if (aVar2.f21895b) {
                this.f21941d.remove(normalGiftMessage);
                this.f21940c.remove(normalGiftMessage.mo21007a());
                aVar2.mo20999b(normalGiftMessage);
                return;
            }
        }
    }

    public NormalGiftAnimationView(Context context) {
        this(context, null);
    }

    public void setNormalGiftEventListener(C8025a aVar) {
        this.f21942e = aVar;
        for (C8048a aVar2 : this.f21939b) {
            aVar2.f21901h = aVar;
        }
    }

    public void setOrientation(int i) {
        for (C8048a aVar : this.f21939b) {
            if (aVar != null) {
                aVar.f21902i = i;
            }
        }
    }

    /* renamed from: a */
    private void m24693a(NormalGiftMessage normalGiftMessage) {
        if (!((Boolean) LiveSettingKeys.LIVE_ENABLE_NORMAL_GIFT_AND_BARRAGE_SELF_FIRSTLY.mo10240a()).booleanValue() || normalGiftMessage.f21926l == null || normalGiftMessage.f21926l.getId() != ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) {
            this.f21941d.add(normalGiftMessage);
        } else {
            this.f21941d.add(0, normalGiftMessage);
        }
        this.f21940c.put(normalGiftMessage.mo21007a(), normalGiftMessage);
        m24695e();
    }

    public NormalGiftAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo21021a(C8047a aVar, Object... objArr) {
        NormalGiftMessage a = aVar.mo20995a(objArr);
        for (C8048a a2 : this.f21939b) {
            if (a2.mo20997a(a)) {
                return;
            }
        }
        if (this.f21940c.containsKey(a.mo21007a())) {
            NormalGiftMessage normalGiftMessage = (NormalGiftMessage) this.f21940c.get(a.mo21007a());
            if (normalGiftMessage.f21916f) {
                this.f21940c.remove(normalGiftMessage.mo21007a());
                if (!a.f21916f && a.f21912b != normalGiftMessage.f21912b) {
                    m24693a(a);
                }
            } else if (a.f21916f) {
                normalGiftMessage.f21916f = true;
                normalGiftMessage.f21917g = a.f21917g;
                normalGiftMessage.f21920q = a.f21920q;
            } else {
                normalGiftMessage.mo21010b(a);
            }
        } else if (!a.f21916f) {
            m24693a(a);
        } else if (this.f21942e != null) {
            this.f21942e.mo13962a(a.f21926l, a.f21917g, a.f21924j, a.f21920q);
        }
        mo21022b();
    }

    public NormalGiftAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21943f = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.mo10240a()).intValue();
        this.f21944g = new C8051b() {
            /* renamed from: a */
            public final void mo21006a() {
                NormalGiftAnimationView.this.mo21022b();
            }
        };
        this.f21938a = context;
        m24694d();
    }
}
