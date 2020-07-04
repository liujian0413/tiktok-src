package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.p164b.C3431b;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.common.C5857c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8292b;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.widget.C9238b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.y */
public final class C5332y extends C5857c implements OnClickListener {

    /* renamed from: a */
    public TextView f15589a;

    /* renamed from: b */
    private final String f15590b = "@";

    /* renamed from: c */
    private final User f15591c;

    /* renamed from: d */
    private final IUser f15592d;

    /* renamed from: e */
    private final Room f15593e;

    /* renamed from: g */
    private final long f15594g;

    /* renamed from: h */
    private String f15595h;

    /* renamed from: i */
    private final C3431b f15596i;

    /* renamed from: j */
    private final long f15597j;

    /* renamed from: k */
    private final String f15598k;

    /* renamed from: l */
    private HSImageView f15599l;

    /* renamed from: m */
    private TextView f15600m;

    /* renamed from: n */
    private TextView f15601n;

    /* renamed from: o */
    private View f15602o;

    /* renamed from: p */
    private boolean f15603p;

    /* renamed from: q */
    private DataCenter f15604q;

    /* renamed from: r */
    private C7321c f15605r;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13621a() throws Exception {
        this.f15603p = false;
    }

    public final void onStart() {
        super.onStart();
    }

    public final void show() {
        super.show();
    }

    /* renamed from: b */
    private boolean m17004b() {
        if (this.f15593e != null && this.f15593e.isOfficial()) {
            return false;
        }
        this.f15604q.get("data_user_in_room");
        LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.mo10240a();
        return false;
    }

    public final void dismiss() {
        super.dismiss();
        PlatformMessageHelper.INSTANCE.onMessageFinish();
        if (this.f15605r != null && !this.f15605r.isDisposed()) {
            this.f15605r.dispose();
        }
    }

    /* renamed from: d */
    private void m17006d() {
        if (this.f15600m != null) {
            if (this.f15592d == null || C6319n.m19593a(this.f15592d.getNickName())) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("@");
                stringBuffer.append(C3358ac.m12515a((int) R.string.et5));
                this.f15600m.setText(stringBuffer.toString());
                return;
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("@");
            stringBuffer2.append(this.f15592d.getNickName());
            this.f15600m.setText(stringBuffer2.toString());
        }
    }

    /* renamed from: c */
    private void m17005c() {
        if (((IHostContext) C3596c.m13172a(IHostContext.class)).isNeedProtectUnderage()) {
            C9049ap.m27022a((int) R.string.f0i);
            return;
        }
        C8149d findGiftById = GiftManager.inst().findGiftById(this.f15594g);
        if (findGiftById != null && !((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11156b((long) findGiftById.f22235f)) {
            String channel = ((IHostContext) C3596c.m13172a(IHostContext.class)).getChannel();
            if (!"test".equals(channel) && !"local_test".equals(channel)) {
                if (this.f15596i != null) {
                    this.f15596i.mo10394a();
                }
                return;
            }
        }
        if (!this.f15603p) {
            this.f15603p = true;
            ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).send(this.f15594g, this.f15593e.getId(), this.f15593e.getOwner().getId(), 1, 125).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19281a((C7326g<? super T>) new C5334z<Object>(this, SystemClock.uptimeMillis(), findGiftById), (C7326g<? super Throwable>) new C5175aa<Object>(this, findGiftById), (C7323a) new C5176ab(this));
        }
    }

    /* renamed from: a */
    private void m17003a(C8158m mVar) {
        if (!(mVar == null || this.f15593e == null || !this.f15593e.isStar())) {
            C8149d findGiftById = GiftManager.inst().findGiftById(mVar.f22301e);
            if (findGiftById != null && findGiftById.f22228G) {
                C9097a.m27146a().mo22267a((Object) new C8292b(1, "cny_send_gift", new JSONObject()));
            }
        }
    }

    public final void onClick(View view) {
        String str;
        if (view.getId() == R.id.a1d) {
            dismiss();
            return;
        }
        if (view.getId() == R.id.e1o) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f15593e.getId()));
            String str2 = "guide_style";
            if (this.f15597j == 3) {
                str = "charge";
            } else {
                str = "convenient_gift";
            }
            hashMap.put(str2, str);
            C8443c.m25663a().mo21606a("gift_guide_popup_click", hashMap, new C8438j().mo21599b("live_function").mo21603f("click").mo21598a("live_detail").mo21600c("gift_guide_popup"));
            if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
                ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(getContext(), C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f68)).mo22192c("gift_guide").mo22188a(-1).mo22190a()).mo19333l();
            } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22178a(LiveInteractFunction.GIFT)) {
                m17004b();
                m17005c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.anm);
        setCanceledOnTouchOutside(true);
        this.f15599l = (HSImageView) findViewById(R.id.b64);
        this.f15600m = (TextView) findViewById(R.id.dyh);
        this.f15589a = (TextView) findViewById(R.id.dt5);
        this.f15601n = (TextView) findViewById(R.id.e1o);
        this.f15602o = findViewById(R.id.a1d);
        C5343e.m17038a(this.f15599l, this.f15591c.getAvatarThumb());
        m17006d();
        C8149d findGiftById = GiftManager.inst().findGiftById(this.f15594g);
        if (TextUtils.isEmpty(this.f15595h) || findGiftById == null) {
            this.f15595h = getContext().getResources().getString(R.string.fcc);
            findGiftById = GiftManager.inst().getFastGift();
        }
        LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.mo10240a();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15595h);
            sb.append(" ");
            final SpannableString spannableString = new SpannableString(sb.toString());
            GiftManager.inst().getGiftIconBitmap(findGiftById.f22233d, new C9459c() {
                /* renamed from: a */
                public final void mo9922a(C9457a aVar) {
                    C3166a.m11963b("GiftGuideDialog", aVar.f25912a);
                    C5332y.this.f15589a.setText(spannableString);
                }

                /* renamed from: a */
                public final void mo9921a(Bitmap bitmap) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(C5332y.this.getContext().getResources(), bitmap);
                    int a = C3358ac.m12510a(16.0f);
                    bitmapDrawable.setBounds(0, 0, a, a);
                    spannableString.setSpan(new C9238b(bitmapDrawable), spannableString.length() - 1, spannableString.length(), 33);
                    C5332y.this.f15589a.setText(spannableString);
                }
            });
        } catch (Exception unused) {
        }
        this.f15601n.setOnClickListener(this);
        this.f15602o.setOnClickListener(this);
        m17004b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13623a(C8149d dVar, Throwable th) throws Exception {
        this.f15603p = false;
        C8282s.m25315a(this.f15594g, this.f15593e.getId(), th);
        if (dVar != null && dVar.f22228G) {
            C8282s.m25313a(this.f15594g, this.f15593e.getId(), 1, "gift_guide", th);
        }
        if (this.f15596i != null) {
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                if (40001 == apiServerException.getErrorCode()) {
                    this.f15596i.mo10394a();
                } else {
                    this.f15596i.mo10396a(apiServerException.getPrompt());
                }
            } else {
                this.f15596i.mo10397b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13622a(long j, C8149d dVar, C3479d dVar2) throws Exception {
        int i;
        C8158m mVar = (C8158m) dVar2.data;
        C8282s.m25314a(this.f15594g, this.f15593e.getId(), SystemClock.uptimeMillis() - j);
        if (dVar != null && dVar.f22228G) {
            C8282s.m25312a(this.f15594g, this.f15593e.getId(), 1, "gift_guide", SystemClock.uptimeMillis() - j);
        }
        if (this.f15596i != null) {
            this.f15596i.mo10395a(mVar);
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11154a(mVar.f22299c);
            int i2 = 0;
            if (C9074l.m27086b(this.f15604q) && this.f15593e.author() != null) {
                JSONObject jSONObject = new JSONObject();
                String str = "amount";
                if (dVar == null) {
                    i = 0;
                } else {
                    try {
                        i = dVar.f22235f;
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put(str, String.valueOf(i));
                jSONObject.put("anchor_id", String.valueOf(this.f15593e.author().getId()));
                jSONObject.put("room_id", String.valueOf(this.f15593e.getId()));
                C3596c.m13172a(C9295a.class);
                C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(this.f15604q));
            }
            if (C9074l.m27089d(this.f15604q) && this.f15593e.author() != null) {
                JSONObject jSONObject2 = new JSONObject();
                String str2 = "amount";
                if (dVar != null) {
                    try {
                        i2 = dVar.f22235f;
                    } catch (JSONException unused2) {
                    }
                }
                jSONObject2.put(str2, String.valueOf(i2));
                jSONObject2.put("anchor_id", String.valueOf(this.f15593e.author().getId()));
                jSONObject2.put("room_id", String.valueOf(this.f15593e.getId()));
                C3596c.m13172a(C9295a.class);
                C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(this.f15604q));
            }
            m17003a(mVar);
        }
    }

    public C5332y(Context context, Room room, IUser iUser, C3431b bVar, long j, String str, long j2, String str2, DataCenter dataCenter) {
        super(context, true);
        this.f15593e = room;
        this.f15591c = room.getOwner();
        this.f15592d = iUser;
        this.f15596i = bVar;
        this.f15594g = j;
        this.f15595h = str;
        this.f15597j = j2;
        this.f15598k = str2;
        this.f15604q = dataCenter;
    }
}
