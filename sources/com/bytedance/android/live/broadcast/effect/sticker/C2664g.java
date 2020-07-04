package com.bytedance.android.live.broadcast.effect.sticker;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.p125a.C2417b;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3388h;
import com.bytedance.android.live.gift.C3429b;
import com.bytedance.android.live.gift.GiftType;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.p209bl.C4267a;
import com.bytedance.android.livesdk.gift.assets.C7877j;
import com.bytedance.android.livesdk.gift.effect.p376b.C7963a;
import com.bytedance.android.livesdk.gift.effect.p376b.C7964b;
import com.bytedance.android.livesdk.gift.model.C8133a;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8156k;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.g */
public final class C2664g implements C2417b, C6310a {

    /* renamed from: a */
    public boolean f8483a;

    /* renamed from: b */
    public C6309f f8484b = new C6309f(this);

    /* renamed from: c */
    public C7964b f8485c;

    /* renamed from: d */
    public String f8486d;

    /* renamed from: e */
    private List<C7964b> f8487e = new LinkedList();

    /* renamed from: f */
    private C2659b f8488f;

    /* renamed from: g */
    private C3429b f8489g = new C3429b() {

        /* renamed from: b */
        private boolean f8491b;

        /* renamed from: a */
        public final void mo9340a() {
            this.f8491b = true;
            if (C2664g.this.f8484b.hasMessages(140001)) {
                C2664g.this.f8484b.removeMessages(140001);
            }
            C2664g.this.f8484b.sendMessage(C2664g.this.f8484b.obtainMessage(140001));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo9342a(Object obj) throws Exception {
            C2664g.this.mo8876a((C7964b) obj);
        }

        /* renamed from: a */
        public final void mo9341a(C8489ao aoVar) {
            if (!this.f8491b) {
                C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(aoVar.f23254c);
                if (findGiftById != null && 4 == findGiftById.f22234e) {
                    C7492s.m23282a((C7495v<T>) new C2669j<T>(aoVar)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2670k<Object>(this), C2671l.f8498a);
                }
            }
        }

        /* renamed from: a */
        static final /* synthetic */ void m10872a(C8489ao aoVar, C47870u uVar) throws Exception {
            uVar.mo19239a((Object) C2664g.m10859a(aoVar));
            uVar.mo19238a();
        }
    };

    /* renamed from: a */
    public final C7963a mo8875a() {
        return this.f8485c;
    }

    /* renamed from: b */
    public final void mo8877b() {
        if (this.f8483a) {
            this.f8484b.removeMessages(140001);
            this.f8484b.sendMessage(this.f8484b.obtainMessage(140001));
        }
    }

    /* renamed from: c */
    public final void mo9336c() {
        try {
            ((IGiftService) C3596c.m13172a(IGiftService.class)).setGiftAnimationEngine(GiftType.STICKER_GIFT, this.f8489g);
        } catch (Exception e) {
            C3166a.m11966e("StickerMessageManager", e.toString());
        }
    }

    /* renamed from: f */
    public final void mo9339f() {
        this.f8484b.removeCallbacksAndMessages(null);
        ((IGiftService) C3596c.m13172a(IGiftService.class)).removeAnimationEngine(GiftType.STICKER_GIFT);
    }

    /* renamed from: g */
    private void m10862g() {
        if (!this.f8483a && !this.f8487e.isEmpty()) {
            this.f8485c = (C7964b) this.f8487e.remove(0);
            C26662 r5 = new C7877j() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo9343a() {
                    C2664g.this.mo9337d();
                }

                /* renamed from: a */
                public final void mo9344a(long j) {
                    C2664g.this.f8483a = false;
                }

                /* renamed from: a */
                public final void mo9346a(Throwable th) {
                    C2664g.this.f8483a = false;
                }

                /* renamed from: a */
                public final void mo9345a(long j, String str) {
                    if (str.equals(C2664g.this.f8485c.f21554d)) {
                        if (!C2664g.this.f8485c.mo20839a() || TextUtils.isEmpty(C2664g.this.f8486d)) {
                            C2664g.this.f8484b.postDelayed(new C2672m(this), 1000);
                        } else {
                            C2664g.this.mo9338e();
                        }
                    }
                }
            };
            this.f8483a = true;
            ((IGiftService) C3596c.m13172a(IGiftService.class)).downloadAssets("effects", this.f8485c.f21552b, r5, 4);
        }
    }

    /* renamed from: d */
    public final void mo9337d() {
        if (this.f8488f != null && this.f8484b != null && this.f8485c != null) {
            this.f8488f.mo9323a(m10861b(this.f8485c), this.f8485c.f21566p);
            this.f8484b.sendMessageDelayed(this.f8484b.obtainMessage(140001), this.f8485c.f21565o);
        }
    }

    /* renamed from: e */
    public final void mo9338e() {
        String nickName = this.f8485c.f21557g.getNickName();
        C2515f.m10417f().mo9076c().mo9175j().checkUserNameLegality(nickName).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2667h<Object>(this, nickName), (C7326g<? super Throwable>) new C2668i<Object>(this));
    }

    /* renamed from: b */
    private static C9355c m10861b(C7964b bVar) {
        C9355c cVar = new C9355c();
        cVar.f25566e = bVar.f21560j;
        cVar.f25581t = bVar.f21554d;
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9335a(Throwable th) throws Exception {
        if (this.f8483a) {
            m10860a((String) null);
        }
    }

    /* renamed from: a */
    public final void mo8876a(C7964b bVar) {
        if (bVar != null) {
            if (bVar.f21555e) {
                this.f8487e.add(0, bVar);
            } else {
                this.f8487e.add(bVar);
            }
            m10862g();
        }
    }

    public final void handleMsg(Message message) {
        if (140001 == message.what) {
            this.f8488f.mo9325d();
            this.f8485c = null;
            this.f8483a = false;
            m10862g();
        }
    }

    public C2664g(C2659b bVar) {
        this.f8488f = bVar;
        this.f8486d = C2663f.m10855a(C3358ac.m12528e());
    }

    /* renamed from: a */
    private void m10860a(String str) {
        C8156k kVar = this.f8485c.f21567q;
        if (TextUtils.isEmpty(str)) {
            str = kVar.f22289d;
        }
        if (TextUtils.isEmpty(str)) {
            str = C3358ac.m12515a((int) R.string.eqc);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8486d);
        sb.append(File.separator);
        sb.append(C6306c.m19561a(str));
        sb.append(".png");
        String sb2 = sb.toString();
        String str2 = kVar.f22286a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f8485c.f21554d);
        sb3.append("font.ttf");
        String sb4 = sb3.toString();
        if (!C3388h.m12606a(sb2)) {
            StringBuilder sb5 = new StringBuilder("#");
            sb5.append(kVar.f22291f);
            kVar.f22291f = sb5.toString();
            kVar.f22295j = sb4;
            kVar.f22289d = str;
            kVar.f22294i = sb2;
            C4267a.m14417a(kVar);
        }
        this.f8488f.mo9324b(str2, sb2, this.f8485c.f21566p);
        mo9337d();
    }

    /* renamed from: a */
    public static C7964b m10859a(C8489ao aoVar) {
        if (aoVar == null || aoVar.getMessageId() == 0 || aoVar.f23252a == null) {
            return null;
        }
        C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(aoVar.f23254c);
        if (findGiftById == null) {
            return null;
        }
        String assetsPath = ((IGiftService) C3596c.m13172a(IGiftService.class)).getAssetsPath("effects", findGiftById.f22247r);
        if (C6319n.m19593a(assetsPath)) {
            return null;
        }
        return (C7964b) new C7964b().mo20841d((long) findGiftById.mo21279b()).mo20842d(true).mo20840c(findGiftById.f22250u).mo20826a(aoVar.getMessageId()).mo20837c(findGiftById.f22233d).mo20833b(findGiftById.f22247r).mo20825a(findGiftById.f22235f).mo20830a(assetsPath).mo20831a(aoVar.f23264m).mo20828a(aoVar.f23253b).mo20834b(aoVar.f23252a).mo20835b(findGiftById.f22232c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9334a(String str, C3479d dVar) throws Exception {
        if (this.f8483a) {
            if (((C8133a) dVar.data).f22202a) {
                str = null;
            }
            m10860a(str);
        }
    }
}
