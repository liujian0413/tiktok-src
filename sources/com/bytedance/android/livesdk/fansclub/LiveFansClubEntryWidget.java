package com.bytedance.android.livesdk.fansclub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.C3916b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3915g;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3975b;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.fans.FansService;
import com.bytedance.android.livesdk.fansclub.C5897b.C5899a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8478af;
import com.bytedance.android.livesdk.message.model.C8480ag;
import com.bytedance.android.livesdk.message.model.FansclubStatisticMessage;
import com.bytedance.android.livesdk.p414p.C8748a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Locale;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class LiveFansClubEntryWidget extends LiveRecyclableWidget implements C3915g<KVData>, C5899a {

    /* renamed from: a */
    private TextView f17456a;

    /* renamed from: b */
    private ImageView f17457b;

    /* renamed from: c */
    private BaseDialogFragment f17458c;

    /* renamed from: d */
    private C7321c f17459d;

    /* renamed from: e */
    private Room f17460e;

    /* renamed from: f */
    private User f17461f;

    /* renamed from: g */
    private C5897b f17462g;

    /* renamed from: h */
    private String f17463h = "";

    /* renamed from: i */
    private long f17464i;

    /* renamed from: j */
    private int f17465j;

    /* renamed from: k */
    private boolean f17466k;

    /* renamed from: l */
    private C7321c f17467l;

    /* renamed from: m */
    private boolean f17468m;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.apj;
    }

    public void onUnload() {
        this.f17462g.mo8963a();
        if (this.f17459d != null && !this.f17459d.isDisposed()) {
            this.f17459d.dispose();
        }
        if (this.f17467l != null && !this.f17467l.isDisposed()) {
            this.f17467l.dispose();
        }
        this.f17461f = null;
        this.dataCenter.removeObserver(new C5910m(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14432a(C5896a aVar) throws Exception {
        if (aVar != null) {
            this.f17465j = aVar.f17470a;
        }
    }

    /* renamed from: a */
    public final void mo14435a(C8478af afVar) {
        User user = afVar.f23211c;
        if (TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            IUser a = TTLiveSDKContext.getHostService().mo22367h().mo22165a();
            if (!(user == null || a == null || a.getId() != user.getId())) {
                if (this.f17458c != null) {
                    this.f17458c.dismissAllowingStateLoss();
                    this.f17458c = null;
                }
                this.f17466k = true;
            }
        }
    }

    public void onInit(Object[] objArr) {
        this.f17456a = (TextView) this.contentView.findViewById(R.id.due);
        this.f17457b = (ImageView) this.contentView.findViewById(R.id.duf);
        C8748a aVar = (C8748a) C9178j.m27302j().mo22378g().mo22355a(C8748a.class);
        if (aVar != null) {
            this.f17457b.setImageResource(aVar.mo21752a());
        }
        this.f17462g = new C5897b();
    }

    /* renamed from: a */
    public final void mo14434a(FansclubStatisticMessage fansclubStatisticMessage) {
        if (fansclubStatisticMessage != null) {
            if (!TextUtils.isEmpty(fansclubStatisticMessage.name)) {
                this.f17463h = fansclubStatisticMessage.name;
            }
            if (fansclubStatisticMessage.fansCount >= 0) {
                this.f17464i = fansclubStatisticMessage.fansCount;
            }
            if (!TextUtils.isEmpty(this.f17463h) && this.f17464i >= 0) {
                C9738o.m28712b(this.contentView, 0);
                this.f17456a.setText(getContext().getResources().getString(R.string.ejy, new Object[]{this.f17463h, C3517a.m12959a(this.f17464i, "w")}));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo14433a(C5904g gVar) {
        if (gVar == null || gVar.f17475b != 0) {
            C9738o.m28712b(this.contentView, 8);
            return;
        }
        C5911n nVar = gVar.f17474a;
        if (nVar != null) {
            if (!TextUtils.isEmpty(nVar.f17483a)) {
                this.f17463h = nVar.f17483a;
            }
            if (nVar.f17484b >= 0) {
                this.f17464i = (long) nVar.f17484b;
            }
            this.f17465j = nVar.f17485c;
            C9738o.m28712b(this.contentView, 0);
            if (!TextUtils.isEmpty(nVar.f17483a) && nVar.f17484b >= 0) {
                this.f17456a.setText(getContext().getResources().getString(R.string.ejy, new Object[]{this.f17463h, C3517a.m12959a(this.f17464i, "w")}));
            } else if (this.f17468m) {
                this.f17456a.setText(getContext().getResources().getString(R.string.ejv));
            } else {
                this.f17456a.setText(getContext().getResources().getString(R.string.eju));
            }
            this.f17466k = nVar.f17486d;
        }
    }

    /* renamed from: a */
    public final void mo14436a(C8480ag agVar) {
        if (agVar.f23216a == 1) {
            this.f17463h = agVar.f23217b;
            this.f17456a.setText(getContext().getResources().getString(R.string.ejy, new Object[]{this.f17463h, C3517a.m12959a(this.f17464i, "w")}));
            this.f17465j = 3;
        }
    }

    public void onLoad(Object[] objArr) {
        this.f17460e = (Room) this.dataCenter.get("data_room");
        if (this.f17460e != null && this.f17460e.getOwner() != null) {
            this.f17467l = C9097a.m27146a().mo22266a(C5896a.class).mo19325f((C7326g<? super T>) new C5905h<Object>(this));
            String str = (String) this.dataCenter.get("log_enter_live_source");
            this.dataCenter.observeForever("data_user_in_room", new C5906i(this));
            C8748a aVar = (C8748a) C9178j.m27302j().mo22378g().mo22355a(C8748a.class);
            if (aVar != null) {
                this.f17459d = ((LiveFansClubApi) C9178j.m27302j().mo22373b().mo10440a(LiveFansClubApi.class)).queryFansClubInfo(aVar.mo21753b(), this.f17460e.getOwner().getId()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C5907j<Object>(this), C5908k.f17479a);
                this.f17462g.mo9142a((C5899a) this);
                this.containerView.setOnClickListener(new C5909l(this, str));
            }
        }
    }

    /* renamed from: a */
    public final void mo9832a(KVData kVData) {
        if (kVData != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -1741164106 && key.equals("data_user_in_room")) {
                c = 0;
            }
            if (c == 0) {
                Object data = kVData.getData();
                if (data instanceof User) {
                    this.f17461f = (User) data;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14438a(String str, View view) {
        String str2;
        int i;
        int i2;
        int i3;
        if (TTLiveSDKContext.getHostService().mo22360a().isNeedProtectUnderage()) {
            C9049ap.m27022a((int) R.string.f0i);
            return;
        }
        if (this.f17461f == null || this.f17461f.getFansClub() == null) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        if (a instanceof C8420k) {
            C8420k kVar = (C8420k) a;
            if (kVar.mo21568a().containsKey("enter_from")) {
                kVar.mo21568a().get("enter_from");
            }
            if (kVar.mo21568a().containsKey("source")) {
                kVar.mo21568a().get("source");
            }
            HashMap hashMap = new HashMap();
            String str3 = (String) hashMap.get("enter_from_merge");
            String str4 = (String) hashMap.get("enter_method");
            if (TextUtils.isEmpty(str3) && kVar.mo21568a().containsKey("enter_from_merge")) {
                str3 = (String) kVar.mo21568a().get("enter_from_merge");
                if (str3 == null) {
                    str3 = "";
                }
            }
            if (TextUtils.isEmpty(str4) && kVar.mo21568a().containsKey("enter_method")) {
                str4 = (String) kVar.mo21568a().get("enter_method");
                if (str4 == null) {
                    str4 = "";
                }
            }
            this.f17468m = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
            String str5 = C5901d.f17472a;
            if (C5900c.m18433a(this.f17468m)) {
                str5 = C5901d.f17473b;
            }
            int i4 = 8;
            String a2 = C1642a.m8035a(Locale.US, str5, new Object[]{Long.valueOf(this.f17460e.getId()), Long.valueOf(this.f17460e.getOwner().getId()), Long.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()), str, str3, str4, "top", str2});
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("&request_page=fans_club_entrance");
            String sb2 = sb.toString();
            if (C5900c.m18433a(this.f17468m)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("&web_bg_color=%2300000000");
                sb2 = sb3.toString();
            }
            boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
            DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
            int i5 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
            int i6 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
            if (!booleanValue) {
                i5 = C9738o.m28714c(getContext(), (float) C9051ar.m27033a(getContext()));
            } else if (C5900c.m18433a(this.f17468m)) {
                i6 = (int) (((float) i6) * 0.85f);
            } else {
                i6 = FansService.FANS_GROUP_DIALOG_HEIGHT;
            }
            if (this.f17458c != null) {
                this.f17458c.dismissAllowingStateLoss();
                this.f17458c = null;
            }
            C3975b a3 = C3979c.m13951a(sb2).mo11555a(i5).mo11560b(i6).mo11558a("live_fans_club");
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C3975b b = a3.mo11556a(8, 8, i, i2).mo11561b(!booleanValue);
            if (booleanValue) {
                i4 = 0;
            }
            C3975b c = b.mo11562c(i4);
            if (booleanValue) {
                i3 = 80;
            } else {
                i3 = 8388613;
            }
            C3975b d = c.mo11566e(i3).mo11565d(false);
            if (C5900c.m18433a(this.f17468m)) {
                d.mo11568f(0);
            }
            this.f17458c = C9178j.m27302j().mo22374c().mo11533a(d);
            if (this.f17458c != null) {
                C3916b.m13813a().mo11465b();
                BaseDialogFragment.m12686a((FragmentActivity) this.context, (DialogFragment) this.f17458c);
                this.f17458c.f10227d = new OnDismissListener() {
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C3916b.m13813a().mo11466c();
                    }
                };
            }
        }
    }
}
