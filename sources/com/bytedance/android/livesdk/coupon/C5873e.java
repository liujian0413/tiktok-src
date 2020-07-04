package com.bytedance.android.livesdk.coupon;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.airbnb.lottie.C1757f;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.p118b.C2325a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.presenter.C5017ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.commerce.coupon.C5843a;
import com.bytedance.android.livesdk.coupon.LiveCouponView.C5866a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8510bf;
import com.bytedance.android.livesdk.p397k.C8346a;
import com.bytedance.android.livesdk.p397k.C8355g;
import com.bytedance.android.livesdk.p397k.C8355g.C8357a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6319n;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.coupon.e */
public final class C5873e extends C5017ci<C5874a> implements OnMessageListener {

    /* renamed from: a */
    public final String f17384a = "/live/coupon/getcurrent/";

    /* renamed from: b */
    public final String f17385b = "/live/coupon/apply/";

    /* renamed from: c */
    public long f17386c;

    /* renamed from: d */
    public C5843a f17387d = new C5843a();

    /* renamed from: e */
    public LiveCouponView f17388e;

    /* renamed from: f */
    public String f17389f = "";

    /* renamed from: i */
    public C5882f f17390i;

    /* renamed from: j */
    public boolean f17391j = true;

    /* renamed from: k */
    public Context f17392k;

    /* renamed from: l */
    public boolean f17393l = false;

    /* renamed from: m */
    private C7321c f17394m;

    /* renamed from: n */
    private C8355g f17395n = new C8355g();

    /* renamed from: o */
    private C5870b f17396o;

    /* renamed from: p */
    private C5877d f17397p = new C5877d(this);

    /* renamed from: com.bytedance.android.livesdk.coupon.e$a */
    public interface C5874a extends C5595at {
        /* renamed from: a */
        void mo14405a(C5882f fVar);

        /* renamed from: a */
        void mo14406a(boolean z);

        /* renamed from: b */
        void mo14407b(boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.coupon.e$b */
    public static final class C5875b extends C8986g<IUser> {

        /* renamed from: a */
        final /* synthetic */ C5873e f17398a;

        C5875b(C5873e eVar) {
            this.f17398a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(IUser iUser) {
            C7573i.m23587b(iUser, "t");
            super.onNext(iUser);
            this.f17398a.mo14413b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.coupon.e$c */
    public static final class C5876c implements C8357a {

        /* renamed from: a */
        final /* synthetic */ C5873e f17399a;

        C5876c(C5873e eVar) {
            this.f17399a = eVar;
        }

        /* renamed from: a */
        public final void mo14415a(C8346a aVar) {
            if (aVar instanceof C5882f) {
                C5882f fVar = (C5882f) aVar;
                this.f17399a.f17390i = fVar;
                LiveCouponView liveCouponView = this.f17399a.f17388e;
                if (liveCouponView != null) {
                    liveCouponView.mo14358a(fVar);
                }
                C5874a aVar2 = (C5874a) this.f17399a.mo9140c();
                if (aVar2 != null) {
                    aVar2.mo14405a(fVar);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.coupon.e$d */
    public static final class C5877d implements C5866a {

        /* renamed from: a */
        final /* synthetic */ C5873e f17400a;

        /* renamed from: a */
        public final void mo14398a() {
            this.f17400a.mo14414d();
        }

        /* renamed from: b */
        public final void mo14400b() {
            String a = C3358ac.m12515a((int) R.string.f54);
            C7573i.m23582a((Object) a, "ResUtil.getString(R.stri…live_live_try_show_goods)");
            C5873e.m18369a("livesdk_coupon_more", "coupon_result", "1", "button_info", a);
            this.f17400a.mo14414d();
        }

        C5877d(C5873e eVar) {
            this.f17400a = eVar;
        }

        /* renamed from: a */
        public final void mo14399a(String str) {
            C5873e.m18369a("livesdk_coupon_get", new String[0]);
            this.f17400a.mo14412a(str);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.coupon.e$e */
    static final class C5878e<T> implements C7326g<C5869a> {

        /* renamed from: a */
        final /* synthetic */ C5873e f17401a;

        /* renamed from: b */
        final /* synthetic */ String f17402b;

        C5878e(C5873e eVar, String str) {
            this.f17401a = eVar;
            this.f17402b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C5869a aVar) {
            this.f17401a.mo14410a(aVar, true);
            C5873e.m18367a(this.f17401a.f17385b, Integer.valueOf(0), "room_id", String.valueOf(this.f17401a.f17386c), "meta_id", String.valueOf(this.f17402b));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.coupon.e$f */
    static final class C5879f<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C5873e f17403a;

        /* renamed from: b */
        final /* synthetic */ String f17404b;

        C5879f(C5873e eVar, String str) {
            this.f17403a = eVar;
            this.f17404b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            this.f17403a.mo14410a((C5869a) null, false);
            C5873e.m18367a(this.f17403a.f17385b, Integer.valueOf(1), "room_id", String.valueOf(this.f17403a.f17386c), "meta_id", String.valueOf(this.f17404b));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.coupon.e$g */
    static final class C5880g<T> implements C7326g<C5872d> {

        /* renamed from: a */
        final /* synthetic */ C5873e f17405a;

        C5880g(C5873e eVar) {
            this.f17405a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C5872d dVar) {
            C5871c cVar;
            boolean z = false;
            C5873e.m18367a(this.f17405a.f17384a, Integer.valueOf(0), "room_id", String.valueOf(this.f17405a.f17386c));
            if (dVar.f17378a != 0) {
                C5874a aVar = (C5874a) this.f17405a.mo9140c();
                if (aVar != null) {
                    aVar.mo14406a(false);
                }
            } else {
                String str = null;
                if (dVar != null) {
                    cVar = dVar.f17380c;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    if (dVar.f17382e - dVar.f17381d >= 0 && dVar.f17382e - dVar.f17381d < dVar.f17383f) {
                        z = true;
                    }
                    if (z) {
                        this.f17405a.f17391j = true;
                        C5873e eVar = this.f17405a;
                        if (dVar != null) {
                            C5871c cVar2 = dVar.f17380c;
                            if (cVar2 != null) {
                                str = cVar2.f17352a;
                            }
                        }
                        eVar.f17389f = str;
                        C5874a aVar2 = (C5874a) this.f17405a.mo9140c();
                        if (aVar2 != null) {
                            aVar2.mo14406a(true);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.coupon.e$h */
    static final class C5881h<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C5873e f17406a;

        C5881h(C5873e eVar) {
            this.f17406a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C5873e.m18367a(this.f17406a.f17384a, Integer.valueOf(1), "room_id", String.valueOf(this.f17406a.f17386c));
            C5874a aVar = (C5874a) this.f17406a.mo9140c();
            if (aVar != null) {
                aVar.mo14406a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo9142a(C5874a aVar) {
        super.mo9142a(aVar);
        this.f14276h.addMessageListener(MessageType.LIVE_ECOM_MESSAGE.getIntType(), this);
        m18370e();
        m18365a(5);
    }

    /* renamed from: a */
    public final void mo14412a(String str) {
        if (TextUtils.isEmpty(str)) {
            m18368a(C3358ac.m12515a((int) R.string.esp), true);
            return;
        }
        Map hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f17386c));
        hashMap.put("meta_id", str == null ? "" : str);
        this.f17394m = ((LiveCouponApi) C9178j.m27302j().mo22373b().mo10440a(LiveCouponApi.class)).tryApplyCurCouponInfo(hashMap).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C5878e<Object>(this, str), (C7326g<? super Throwable>) new C5879f<Object>(this, str));
    }

    /* renamed from: e */
    private final void m18370e() {
        this.f17394m = ((LiveCouponApi) C9178j.m27302j().mo22373b().mo10440a(LiveCouponApi.class)).queryCurCouponInfo(this.f17386c).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C5880g<Object>(this), (C7326g<? super Throwable>) new C5881h<Object>(this));
    }

    /* renamed from: d */
    public final void mo14414d() {
        String str;
        String str2 = this.f17389f;
        LiveCouponView liveCouponView = this.f17388e;
        if (liveCouponView != null) {
            str = liveCouponView.getMMetaId();
        } else {
            str = null;
        }
        if (!C6319n.m19594a(str2, str)) {
            this.f17391j = true;
        }
        C5874a aVar = (C5874a) mo9140c();
        if (aVar != null) {
            aVar.mo14407b(this.f17391j);
        }
        C5870b bVar = this.f17396o;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.f17396o = null;
        this.f17388e = null;
    }

    /* renamed from: g */
    private final boolean m18371g() {
        C8984e h = TTLiveSDKContext.getHostService().mo22367h();
        C7573i.m23582a((Object) h, "TTLiveSDKContext.getHostService().user()");
        if (h.mo22182c()) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", "live_detail");
        bundle.putString("source", "live");
        TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.f17392k, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.efb)).mo22193d("live_detail").mo22192c("live").mo22190a()).mo19189a((C7498y<? super T>) new C5875b<Object>(this));
        return false;
    }

    /* renamed from: b */
    public final void mo14413b() {
        if (m18371g()) {
            m18369a("livesdk_coupon_click", new String[0]);
            C5870b bVar = this.f17396o;
            if (bVar == null || !bVar.isShowing()) {
                LiveCouponView liveCouponView = new LiveCouponView(this.f17392k, null, 0, 6, null);
                this.f17388e = liveCouponView;
                LiveCouponView liveCouponView2 = this.f17388e;
                if (liveCouponView2 != null) {
                    liveCouponView2.mo14358a(this.f17390i);
                }
                LiveCouponView liveCouponView3 = this.f17388e;
                if (liveCouponView3 != null) {
                    liveCouponView3.setMLottieHelper(this.f17387d);
                }
                LiveCouponView liveCouponView4 = this.f17388e;
                if (liveCouponView4 != null) {
                    liveCouponView4.setMMetaId(this.f17389f);
                }
                Context context = this.f17392k;
                LiveCouponView liveCouponView5 = this.f17388e;
                if (liveCouponView5 == null) {
                    C7573i.m23580a();
                }
                this.f17396o = new C5870b(context, liveCouponView5);
                LiveCouponView liveCouponView6 = this.f17388e;
                if (liveCouponView6 != null) {
                    liveCouponView6.setMCouponClick(this.f17397p);
                }
                LiveCouponView liveCouponView7 = this.f17388e;
                if (liveCouponView7 != null) {
                    liveCouponView7.setVisibility(0);
                }
                LiveCouponView liveCouponView8 = this.f17388e;
                if (liveCouponView8 != null) {
                    liveCouponView8.mo14356a();
                }
                C5870b bVar2 = this.f17396o;
                if (bVar2 != null) {
                    bVar2.show();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        mo14414d();
        C5843a aVar = this.f17387d;
        if (aVar != null) {
            Map<String, C1757f> map = aVar.f17202a;
            if (map != null) {
                map.clear();
            }
        }
        C7321c cVar = this.f17394m;
        if (cVar != null && cVar.isDisposed()) {
            C7321c cVar2 = this.f17394m;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C8510bf) {
            m18366a((C8510bf) iMessage);
        }
    }

    /* renamed from: a */
    private final void m18365a(int i) {
        C8355g gVar = this.f17395n;
        if (gVar != null) {
            gVar.mo21509a(this.f17392k, 5, (C8357a) new C5876c(this));
        }
    }

    /* renamed from: a */
    private final void m18366a(C8510bf bfVar) {
        if (bfVar != null) {
            if (bfVar.f23347a == 1) {
                this.f17391j = true;
                C5874a aVar = (C5874a) mo9140c();
                if (aVar != null) {
                    aVar.mo14406a(false);
                }
                this.f17389f = String.valueOf(bfVar.f23352f);
                C5874a aVar2 = (C5874a) mo9140c();
                if (aVar2 != null) {
                    aVar2.mo14406a(true);
                }
            } else if (bfVar.f23347a == 2 || bfVar.f23347a == 3) {
                this.f17391j = false;
                this.f17389f = "";
                C5874a aVar3 = (C5874a) mo9140c();
                if (aVar3 != null) {
                    aVar3.mo14406a(false);
                }
            }
        }
    }

    public C5873e(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        this.f17392k = context;
    }

    /* renamed from: a */
    private final void m18368a(String str, boolean z) {
        if (z) {
            mo14414d();
        }
        if (!TextUtils.isEmpty(str)) {
            C9049ap.m27026a(this.f17392k, str);
        } else {
            C9049ap.m27026a(this.f17392k, C3358ac.m12515a((int) R.string.esp));
        }
    }

    /* renamed from: a */
    public static void m18369a(String str, String... strArr) {
        boolean z;
        C7573i.m23587b(str, "event");
        C7573i.m23587b(strArr, "extras");
        try {
            HashMap hashMap = new HashMap();
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && strArr.length % 2 == 0) {
                for (int i = 0; i < strArr.length; i += 2) {
                    hashMap.put(strArr[i], strArr[i + 1]);
                }
            }
            C8443c.m25663a().mo21606a(str, hashMap, new C8438j(), Room.class);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r9 == null) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14410a(com.bytedance.android.livesdk.coupon.C5869a r9, boolean r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x000b
            if (r9 == 0) goto L_0x0009
            boolean r2 = r9.f17347d
            goto L_0x000c
        L_0x0009:
            r2 = 0
            goto L_0x000c
        L_0x000b:
            r2 = 1
        L_0x000c:
            r8.f17391j = r2
            r2 = 2
            if (r9 == 0) goto L_0x0034
            long r3 = r9.f17344a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0034
            if (r10 == 0) goto L_0x0034
            com.bytedance.android.livesdk.coupon.LiveCouponView r10 = r8.f17388e
            if (r10 == 0) goto L_0x0024
            com.bytedance.android.livesdk.coupon.c r9 = r9.f17346c
            r10.mo14357a(r9)
        L_0x0024:
            java.lang.String r9 = "livesdk_coupon_result"
            java.lang.String[] r10 = new java.lang.String[r2]
            java.lang.String r2 = "coupon_result"
            r10[r0] = r2
            java.lang.String r0 = "1"
            r10[r1] = r0
            m18369a(r9, r10)
            return
        L_0x0034:
            if (r10 == 0) goto L_0x004f
            if (r9 == 0) goto L_0x003c
            java.lang.String r9 = r9.f17345b
            if (r9 != 0) goto L_0x003e
        L_0x003c:
            java.lang.String r9 = ""
        L_0x003e:
            r3 = r9
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x005d
            r9 = 2131828133(0x7f111da5, float:1.9289198E38)
            java.lang.String r9 = com.bytedance.android.live.core.utils.C3358ac.m12515a(r9)
            goto L_0x005d
        L_0x004f:
            com.bytedance.android.livesdk.coupon.LiveCouponView r9 = r8.f17388e
            if (r9 == 0) goto L_0x0056
            r9.mo14360c()
        L_0x0056:
            r9 = 2131828134(0x7f111da6, float:1.92892E38)
            java.lang.String r9 = com.bytedance.android.live.core.utils.C3358ac.m12515a(r9)
        L_0x005d:
            r8.m18368a(r9, r10)
            java.lang.String r9 = "livesdk_coupon_result"
            java.lang.String[] r10 = new java.lang.String[r2]
            java.lang.String r2 = "coupon_result"
            r10[r0] = r2
            java.lang.String r0 = "0"
            r10[r1] = r0
            m18369a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.coupon.C5873e.mo14410a(com.bytedance.android.livesdk.coupon.a, boolean):void");
    }

    /* renamed from: a */
    public static void m18367a(String str, Integer num, String... strArr) {
        boolean z;
        C7573i.m23587b(strArr, "extras");
        try {
            JSONObject jSONObject = new JSONObject();
            int i = 1;
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && strArr.length % 2 == 0) {
                for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                    jSONObject.put(strArr[i2], strArr[i2 + 1]);
                }
            }
            C2325a d = C9469i.m27993e().mo14564d();
            if (num != null) {
                i = num.intValue();
            }
            d.mo8141a(str, i, jSONObject);
        } catch (Exception unused) {
        }
    }
}
