package com.bytedance.android.livesdk.chatroom.widget;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.setting.C3332f;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.p116b.C2321a;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p220ui.AbsAudienceListAdapter;
import com.bytedance.android.livesdk.chatroom.p220ui.AudienceListAdapter;
import com.bytedance.android.livesdk.chatroom.p220ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.presenter.C5015ch;
import com.bytedance.android.livesdk.chatroom.utils.C5357o;
import com.bytedance.android.livesdk.chatroom.view.C5373c;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.C7849h;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.UserRankDialog2;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.p420b.C8818b;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9043ak;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9094x;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class LiveRoomWatchUserWidget extends LiveRecyclableWidget implements C0053p<KVData>, C5373c, C6310a {

    /* renamed from: c */
    private static final String f16995c = "com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget";

    /* renamed from: d */
    private static final int f16996d = C3358ac.m12510a(34.0f);

    /* renamed from: a */
    public C6309f f16997a;

    /* renamed from: b */
    public C5774a f16998b;

    /* renamed from: e */
    private final C47562b f16999e = new C47562b();

    /* renamed from: f */
    private Room f17000f;

    /* renamed from: g */
    private boolean f17001g;

    /* renamed from: h */
    private String f17002h;

    /* renamed from: i */
    private TextView f17003i;

    /* renamed from: j */
    private RecyclerView f17004j;

    /* renamed from: k */
    private AbsAudienceListAdapter f17005k;

    /* renamed from: l */
    private C5015ch f17006l;

    /* renamed from: m */
    private FragmentActivity f17007m;

    /* renamed from: n */
    private boolean f17008n = true;

    /* renamed from: o */
    private UserRankDialog2 f17009o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget$a */
    public interface C5774a {
        /* renamed from: a */
        void mo14229a(int i);

        /* renamed from: a */
        boolean mo14230a();
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.aup;
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
        if (C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW) == null) {
        }
    }

    public void onUnload() {
        this.f16999e.mo119660a();
        if (this.f17009o != null) {
            this.f17009o.dismiss();
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        this.f17006l.mo8963a();
        this.f17005k.mo13103a();
        this.f17009o = null;
    }

    /* renamed from: a */
    private void m18201a() {
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_member_count", Integer.valueOf(this.f17000f.getUserCount()));
            m18204b(this.f17000f.getUserCount());
            if (this.f17000f == null || this.f17000f.getRoomAuthStatus() == null || !this.f17000f.getRoomAuthStatus().isEnableRoomContributor()) {
                C9738o.m28712b((View) this.f17003i, 8);
                C9738o.m28712b((View) this.f17004j, 8);
                return;
            }
            C9738o.m28712b((View) this.f17003i, 0);
            C9738o.m28712b((View) this.f17004j, 0);
        }
    }

    /* renamed from: b */
    private void m18203b() {
        if (((Integer) LiveSettingKeys.LIVE_USER_RANK.mo10240a()).intValue() == 0) {
            C9049ap.m27024a((Context) this.f17007m, (int) R.string.en4);
            return;
        }
        if (this.f17009o != null && this.f17009o.mo11345g()) {
            this.f17009o.dismiss();
        }
        this.f17009o = null;
        this.f17009o = UserRankDialog2.m26382a(this.f17007m, this.f17000f, this.f17001g, this.f17008n, this.f17002h, this.dataCenter);
        this.f17009o.show(this.f17007m.getSupportFragmentManager(), "dialog2");
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "click");
        hashMap.put("event_page", "live_detail");
        hashMap.put("event_module", "top_tab");
        C8443c.m25663a().mo21607a("audience_list_click", new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_detail").mo21600c("top_tab"));
    }

    /* renamed from: b */
    private void m18204b(int i) {
        this.f17003i.setText(C9094x.m27135a((long) i));
    }

    /* renamed from: a */
    public final void mo14254a(long j) {
        if (this.f17005k != null) {
            this.f17005k.mo13104a(j);
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 0 && this.f17004j != null) {
            this.f17004j.mo5541b(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14255a(View view) {
        if (C9043ak.m27009a()) {
            m18203b();
        }
    }

    /* renamed from: a */
    public final void mo13663a(int i) {
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_member_count", Integer.valueOf(i));
            m18204b(i);
            if (i == 0 && this.f17005k != null) {
                this.f17005k.mo13103a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -774172322) {
                if (hashCode == 1433895618 && key.equals("cmd_send_gift")) {
                    c = 0;
                }
            } else if (key.equals("cmd_dismiss_dialog_end")) {
                c = 1;
            }
            switch (c) {
                case 0:
                case 1:
                    if (isViewValid() && this.f17009o != null) {
                        this.f17009o.dismiss();
                        break;
                    }
            }
        }
    }

    public void onInit(Object... objArr) {
        this.f17003i = (TextView) this.contentView.findViewById(R.id.c8k);
        this.f17004j = (RecyclerView) this.contentView.findViewById(R.id.efx);
        this.f17006l = new C5015ch();
        this.f17005k = new AudienceListAdapter(this.context, this.dataCenter);
        this.f17005k.setHasStableIds(true);
        this.f17004j.setLayoutManager(new SSLinearLayoutManager(this.context, 0, false));
        this.f17004j.setItemAnimator(null);
        this.f17004j.setAdapter(this.f17005k);
        C9738o.m28705a(true, (View) this.f17003i, (OnClickListener) new C5783af(this));
        this.f17004j.mo5528a((C1281m) new C1281m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            }

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    LiveRoomWatchUserWidget.this.f16997a.sendMessageDelayed(LiveRoomWatchUserWidget.this.f16997a.obtainMessage(0), DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                    return;
                }
                LiveRoomWatchUserWidget.this.f16997a.removeMessages(0);
            }
        });
        if (C5357o.m17082a(this.dataCenter)) {
            LayoutParams layoutParams = this.f17003i.getLayoutParams();
            layoutParams.width = (int) C9738o.m28708b(getContext(), 42.0f);
            this.f17003i.setLayoutParams(layoutParams);
            this.f17003i.setTextSize(1, 12.0f);
            this.f17003i.setPadding(0, -3, 0, -3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo14256a(C8818b bVar) {
        if (this.dataCenter != null) {
            boolean z = true;
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.context, C8987h.m26865a().mo22189a(C3332f.m12427a()).mo22191b(C3332f.m12428b()).mo22193d("live_detail").mo22192c("live").mo22188a(1).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
                return;
            }
            User user = (User) this.dataCenter.get("data_user_in_room");
            if (!(this.f17000f == null || user == null)) {
                if (user.getFansClub() == null || user.getFansClub().getData() == null || user.getFansClub().getData().anchorId != this.f17000f.getOwnerUserId()) {
                    z = false;
                }
                ((C2321a) C3596c.m13172a(C2321a.class)).showFansEntranceDialog(getContext(), this.f17000f, z, this.f17008n);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14257a(List list) {
        if (isViewValid() && (this.f17004j.getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f17004j.getLayoutManager();
            if (!C3519c.m12965a(this.context) || f16996d * list.size() <= this.f17004j.getWidth()) {
                if (((LinearLayoutManager) this.f17004j.getLayoutManager()).f4751m) {
                    linearLayoutManager.mo5379a(false);
                    this.f17004j.requestLayout();
                }
            } else if (!linearLayoutManager.f4751m) {
                linearLayoutManager.mo5379a(true);
                this.f17004j.requestLayout();
                this.f17004j.mo5541b(0);
            }
        }
    }

    public void onLoad(Object... objArr) {
        this.f17006l.mo9142a((C5373c) this);
        this.f17000f = (Room) this.dataCenter.get("data_room");
        this.f17001g = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17008n = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f17002h = (String) this.dataCenter.get("log_enter_live_source");
        this.f17005k.mo13107a(this.f17001g);
        this.f17005k.mo13105a(this.dataCenter);
        this.f17007m = (FragmentActivity) this.context;
        if (!this.f17001g) {
            try {
                String[] strArr = {"money", "fans", "nothing", "room_money"};
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f17000f.getOwnerUserId());
                hashMap.put("anchor_id", sb.toString());
                hashMap.put("room_id", this.f17000f.getIdStr());
                hashMap.put("rank_type", strArr[((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.mo10240a()).intValue()]);
                TTLiveSDKContext.getHostService().mo22363d().mo23269a("livesdk_live_room_info", hashMap);
            } catch (Exception e) {
                C6312h.m19577a((Throwable) e);
            }
        }
        m18201a();
        this.f16997a = new C6309f(this.context.getMainLooper(), this);
        this.dataCenter.observeForever("data_anchor_ticket_count", this).observeForever("data_current_room_ticket_count", this).observeForever("data_login_event", this).observe("cmd_send_gift", this).observeForever("data_keyboard_status", this).observe("data_user_in_room", this).observe("cmd_dismiss_dialog_end", this).observe("data_xt_followed_change", this).observe("cmd_wanna_follow_anchor", this);
        if (!(this.f17000f == null || this.f17000f.getOwner() == null)) {
            this.f17006l.mo13029a(this.f17000f.getId(), this.f17000f.getOwner().getId(), 18);
        }
        ((C3245ad) C9097a.m27146a().mo22266a(C8818b.class).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C5784ag<Object>(this));
    }

    /* renamed from: a */
    public final void mo13664a(List<C8857f> list, List<C8857f> list2) {
        if (isViewValid() && list2 != null) {
            if (this.f16998b == null || !this.f16998b.mo14230a()) {
                if (!C6307b.m19566a((Collection<T>) list)) {
                    for (int i = 0; i < list.size(); i++) {
                        ((C8857f) list.get(i)).f24106j = true;
                        list2.add(i, list.get(i));
                    }
                }
                this.f17005k.mo13106a(list2);
                this.f17004j.post(new C5785ah(this, list2));
                if (this.f16998b != null) {
                    this.f16998b.mo14229a(list2.size());
                }
            }
        }
    }
}
