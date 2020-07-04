package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.setting.C3332f;
import com.bytedance.android.live.core.utils.C3360ae;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.api.C4253a;
import com.bytedance.android.livesdk.chatroom.end.C4400h.C4402a;
import com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar.C4386a;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.utils.C5357o;
import com.bytedance.android.livesdk.live.p402a.C8384a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.rank.C8804a;
import com.bytedance.android.livesdk.schema.interfaces.C8932b.C8933a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p438a.C9297a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.imagepipeline.request.C13842b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class LiveAudienceEndFragment extends LiveEndFragment implements C4402a, C9297a, C6310a {

    /* renamed from: a */
    public View f12669a;

    /* renamed from: b */
    public List<Room> f12670b;

    /* renamed from: c */
    public DataCenter f12671c;

    /* renamed from: d */
    private C9297a f12672d;

    /* renamed from: e */
    private Activity f12673e;

    /* renamed from: f */
    private C6309f f12674f = new C6309f(this);

    /* renamed from: g */
    private VHeadView f12675g;

    /* renamed from: h */
    private TextView f12676h;

    /* renamed from: i */
    private HSImageView f12677i;

    /* renamed from: j */
    private TopFansLayout f12678j;

    /* renamed from: k */
    private View f12679k;

    /* renamed from: l */
    private View f12680l;

    /* renamed from: m */
    private LinearLayout f12681m;

    /* renamed from: q */
    private View f12682q;

    /* renamed from: r */
    private List<LiveRecommendBar> f12683r = new ArrayList();

    /* renamed from: s */
    private boolean f12684s = false;

    /* renamed from: t */
    private C4400h f12685t;

    /* renamed from: u */
    private OnClickListener f12686u = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            if (view.getTag() != null && (view.getTag() instanceof Room)) {
                Room room = (Room) view.getTag();
                Bundle bundle = new Bundle();
                String str2 = "enter_from";
                if (LiveAudienceEndFragment.this.f12763z) {
                    str = "anchor_live_ending";
                } else {
                    str = "live_end";
                }
                bundle.putString(str2, str);
                bundle.putString("log_pb", room.getLog_pb());
                bundle.putString("request_id", room.getRequestId());
                bundle.putString("enter_from_merge", "live_end");
                bundle.putString("live.intent.extra.LOG_PB", room.getLog_pb());
                bundle.putString("live.intent.extra.REQUEST_ID", room.getRequestId());
                bundle.putString("enter_method", "live_cover");
                C5357o.m17085b(bundle, LiveAudienceEndFragment.this.f12671c);
                C9178j.m27302j().mo22380i().openRoom(LiveAudienceEndFragment.this.getContext(), new C8933a().mo22054a(room.getId()).mo22073i(room.getRequestId()).mo22067c("live_end").mo22076l("live_cover").mo22074j(room.getLog_pb()).mo22062b(room.getUserFrom()).mo22053a(room.getOrientation()).mo22075k("live_end").mo22063b(bundle).mo22056a(room));
                C9178j.m27302j().mo22376e().f23036a = new C8384a("live_end");
                if (!(LiveAudienceEndFragment.this.f12671c == null || !((Boolean) LiveAudienceEndFragment.this.f12671c.get("is_embedded_live_room", Boolean.valueOf(false))).booleanValue() || LiveAudienceEndFragment.this.getActivity() == null)) {
                    LiveAudienceEndFragment.this.getActivity().finish();
                }
            }
        }
    };

    /* renamed from: v */
    private OnClickListener f12687v = new OnClickListener() {
        public final void onClick(View view) {
            int id = view.getId();
            if (id == R.id.anj) {
                LiveAudienceEndFragment.this.mo12089b();
            } else if (id == R.id.k2 || id == R.id.bl0) {
                LiveAudienceEndFragment.this.mo12107d();
            } else {
                if (id == R.id.dkq) {
                    LiveAudienceEndFragment.this.mo12106c();
                }
            }
        }
    };

    /* renamed from: w */
    private C4386a f12688w = new C4386a() {
        /* renamed from: a */
        public final void mo12092a() {
            if (LiveAudienceEndFragment.this.mUserVisibleHint && LiveAudienceEndFragment.this.f12670b.size() >= 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(LiveAudienceEndFragment.this.f12670b.get(0));
                arrayList.add(LiveAudienceEndFragment.this.f12670b.get(1));
                LiveAudienceEndFragment.this.f12670b.removeAll(arrayList);
                LiveAudienceEndFragment.this.mo12088a((List<Room>) arrayList);
            }
        }
    };

    /* renamed from: a */
    public final boolean mo9067a() {
        return this.f12672d != null && this.f12672d.mo9067a();
    }

    /* renamed from: a */
    public final void mo12087a(Throwable th) {
        if (this.f12673e != null && th != null) {
            C9738o.m28712b(this.f12679k, 0);
            if (th instanceof ApiServerException) {
                C3517a.m12962a((Context) this.f12673e, ((ApiServerException) th).getPrompt());
            } else {
                C3517a.m12960a((Context) this.f12673e, (int) R.string.esb);
            }
        }
    }

    /* renamed from: a */
    public final void mo12088a(List<Room> list) {
        if (this.f12681m.getChildCount() >= 2) {
            int i = 0;
            while (i < list.size() && i < 2) {
                Room room = (Room) list.get(i);
                if (Room.isValid(room)) {
                    m14763a(room, this.f12681m.getChildAt(i), i == 0);
                }
                i++;
            }
            if (this.f12670b.size() <= 4) {
                C4253a.m14398b(this.f12674f, this.f12762y.getId());
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f12674f != null) {
            this.f12674f.removeCallbacks(null);
        }
    }

    /* renamed from: e */
    private void m14767e() {
        C9738o.m28712b((View) this.f12678j, 8);
        if (getContext() != null && this.f12682q != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f12682q.getLayoutParams();
            marginLayoutParams.topMargin = (int) C9738o.m28708b(getContext(), 100.0f);
            this.f12682q.setLayoutParams(marginLayoutParams);
        }
    }

    public void onPause() {
        super.onPause();
        if (!C6307b.m19566a((Collection<T>) this.f12683r)) {
            for (LiveRecommendBar liveRecommendBar : this.f12683r) {
                if (liveRecommendBar != null) {
                    liveRecommendBar.mo12108a();
                }
            }
        }
    }

    public void onResume() {
        C4386a aVar;
        super.onResume();
        if (!C6307b.m19566a((Collection<T>) this.f12683r)) {
            for (LiveRecommendBar liveRecommendBar : this.f12683r) {
                if (liveRecommendBar != null && this.mUserVisibleHint) {
                    if (this.f12683r.indexOf(liveRecommendBar) == 0) {
                        aVar = this.f12688w;
                    } else {
                        aVar = null;
                    }
                    liveRecommendBar.mo12109a(aVar);
                }
            }
        }
    }

    /* renamed from: f */
    private void m14768f() {
        this.f12675g = (VHeadView) mo12105a(R.id.dkq);
        this.f12676h = (TextView) mo12105a(R.id.dkr);
        this.f12677i = (HSImageView) mo12105a(R.id.bor);
        this.f12678j = (TopFansLayout) mo12105a(R.id.dmy);
        this.f12679k = mo12105a(R.id.anj);
        this.f12680l = mo12105a(R.id.cpg);
        this.f12682q = mo12105a(R.id.title);
        this.f12669a = mo12105a(R.id.k2);
        this.f12669a.setOnClickListener(this.f12687v);
        this.f12675g.setOnClickListener(this.f12687v);
        this.f12679k.setOnClickListener(this.f12687v);
        C9738o.m28712b(mo12105a(R.id.bop), 8);
        C5357o.m17077a(getView(), this.f12687v, this.f12671c);
    }

    /* renamed from: g */
    private static void m14769g() {
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        C8416g a2 = C8443c.m25663a().mo21605a(Room.class);
        C8443c.m25663a().mo21606a("livesdk_finish_show", C8446a.m25675a().mo21608a(a, "enter_from_merge", "enter_method", "enter_from", "source", "action_type", "video_id").mo21608a(a2, "anchor_id", "room_id", "log_pb", "request_id").f23108a, new Object[0]);
    }

    /* renamed from: b */
    public final void mo12089b() {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "follow");
            bundle.putString("source", "live");
            bundle.putString("v1_source", "follow");
            TTLiveSDKContext.getHostService().mo22367h().mo22167a(getContext(), C8987h.m26865a().mo22189a(C3332f.m12427a()).mo22191b(C3332f.m12428b()).mo22188a(-1).mo22193d("live_detail").mo22194e("follow").mo22192c("live").mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
        } else if (this.f12762y != null) {
            User owner = this.f12762y.getOwner();
            if (owner != null) {
                this.f12685t.mo12127a(owner.getId(), this.f12762y, this.f12761B, this);
            }
            if (C9074l.m27086b(this.f12671c) && this.f12762y.author() != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("anchor_id", String.valueOf(this.f12762y.author().getId()));
                    jSONObject.put("room_id", String.valueOf(this.f12762y.getId()));
                } catch (JSONException unused) {
                }
                C3596c.m13172a(C9295a.class);
                C8446a.m25675a().mo21611a(jSONObject).mo21610a(C9074l.m27087c(this.f12671c));
            }
            if (C9074l.m27089d(this.f12671c) && this.f12762y.author() != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("anchor_id", String.valueOf(this.f12762y.author().getId()));
                    jSONObject2.put("room_id", String.valueOf(this.f12762y.getId()));
                } catch (JSONException unused2) {
                }
                C3596c.m13172a(C9295a.class);
                C8446a.m25675a().mo21611a(jSONObject2).mo21610a(C9074l.m27090e(this.f12671c));
            }
        }
    }

    /* renamed from: a */
    public final void mo12085a(FollowPair followPair) {
        if (this.f12673e != null) {
            if (this.f12679k != null && this.f12679k.getVisibility() == 0) {
                this.f12679k.setVisibility(8);
            }
            C3517a.m12960a((Context) this.f12673e, (int) R.string.esc);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f12762y != null) {
            C4275g.m14434a().mo11967a((Handler) this.f12674f, false, this.f12762y.getId(), 4, 12);
            this.f12685t = new C4400h();
        }
    }

    public void setUserVisibleHint(boolean z) {
        C4386a aVar;
        super.setUserVisibleHint(z);
        if (!C6307b.m19566a((Collection<T>) this.f12683r)) {
            for (LiveRecommendBar liveRecommendBar : this.f12683r) {
                if (liveRecommendBar != null) {
                    if (z) {
                        if (this.f12683r.indexOf(liveRecommendBar) == 0) {
                            aVar = this.f12688w;
                        } else {
                            aVar = null;
                        }
                        liveRecommendBar.mo12109a(aVar);
                    } else {
                        liveRecommendBar.mo12108a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Map m14760a(C9380q qVar) throws Exception {
        HashMap hashMap = new HashMap();
        if (qVar.f25763c == null || qVar.f25763c.f25650b == 0) {
            hashMap.put("channel_id", String.valueOf(qVar.f25761a));
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("channel_id", String.valueOf(qVar.f25761a));
            hashMap.put("pk_id", String.valueOf(qVar.f25763c.f25653e));
            hashMap.put("connection_type", "pk");
            hashMap.put("theme", qVar.f25763c.f25651c);
            hashMap.put("pk_time", String.valueOf(qVar.f25763c.f25650b));
        }
        return hashMap;
    }

    public void handleMsg(Message message) {
        if (this.f12673e != null && !this.f12673e.isFinishing()) {
            int i = message.what;
            if (message.obj instanceof Exception) {
                if ((!C9290a.f25466a || !(i == 21 || i == 22)) && (message.obj instanceof ApiServerException)) {
                    C3517a.m12962a((Context) this.f12673e, ((ApiServerException) message.obj).getPrompt());
                }
                return;
            }
            if (12 == i && (message.obj instanceof Room)) {
                m14762a((Room) message.obj);
            }
            if (22 == i && (message.obj instanceof List)) {
                try {
                    List list = (List) message.obj;
                    if (this.f12680l.getVisibility() == 0) {
                        this.f12670b.addAll(list);
                    } else {
                        m14766b(list);
                    }
                } catch (Throwable th) {
                    C3166a.m11963b("LiveEnd", th);
                }
            }
        }
    }

    /* renamed from: a */
    private void m14761a(RoomStats roomStats) {
        View a = mo12105a(R.id.b28);
        if (roomStats != null && mo8989l()) {
            C9738o.m28712b(a, 0);
            TextView textView = (TextView) mo12105a(R.id.b2d);
            if (textView != null) {
                C9738o.m28704a(textView, (CharSequence) C3385e.m12591a(roomStats.getTicket()));
                String a2 = C3385e.m12591a(roomStats.getTicket());
                if (C3385e.m12595e(roomStats.getTicket())) {
                    textView.setText(C3360ae.m12531a(a2, 0.6777f, a2.length() - 1, a2.length()));
                } else {
                    textView.setText(a2);
                }
            }
        }
    }

    /* renamed from: b */
    private void m14765b(Room room) {
        String str;
        String str2;
        if (room != null) {
            if (this.f12763z) {
                str = "anchor_live_ending";
            } else {
                str = "live_end";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_view");
            hashMap.put("action_type", "click");
            hashMap.put("event_page", str);
            hashMap.put("enter_from", "live_detail");
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("room_id", String.valueOf(room.getId()));
            String str3 = "live_type";
            if (room.isLiveTypeAudio()) {
                str2 = "voice_live";
            } else {
                str2 = "video_live";
            }
            hashMap.put(str3, str2);
            hashMap.put("enter_from_merge", "live_end");
            hashMap.put("enter_method", "live_cover");
            if (room.getLinkMicInfo() == null) {
                C8443c.m25663a().mo21606a("live_show", hashMap, new C8438j());
                return;
            }
            C7492s.m23301b(room.getLinkMicInfo()).mo19317d(C4393a.f12799a).mo19304b(C7333a.m23044b()).mo19294a(C7333a.m23044b()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4394b<Object>(hashMap), C4395c.f12801a);
        }
    }

    /* renamed from: a */
    private void m14762a(Room room) {
        if (room != null && room.getStats() != null) {
            User owner = this.f12762y.getOwner();
            if (owner != null && owner.isFollowing()) {
                this.f12760A = true;
                C9738o.m28712b(this.f12679k, 8);
            }
            if (C6311g.m19573a(room.getTopFanTickets())) {
                C9738o.m28712b((View) this.f12678j, 8);
                return;
            }
            this.f12678j.setFollowVisible(false);
            this.f12678j.setDataCenter(this.f12671c);
            this.f12678j.mo12117a(this.f12673e, this, room, this.f12761B);
            m14761a(room.getStats());
        }
    }

    /* renamed from: b */
    private void m14766b(List<Room> list) {
        boolean z;
        if (mo8989l() && list != null && !list.isEmpty() && list.size() >= 2) {
            this.f12680l.setVisibility(0);
            int b = (int) C9738o.m28708b(getContext(), 8.0f);
            int a = (int) (((((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), 32.0f)) - ((float) b)) / 2.0f);
            this.f12681m = (LinearLayout) this.f12680l.findViewById(R.id.bnx);
            this.f12681m.setLayoutParams(this.f12681m.getLayoutParams());
            LayoutInflater from = LayoutInflater.from(getContext());
            for (int i = 0; i < 2; i++) {
                Room room = (Room) list.get(i);
                if (Room.isValid(room)) {
                    View inflate = from.inflate(R.layout.awd, null);
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m14763a(room, inflate, z);
                    LayoutParams layoutParams = new LayoutParams(a, a);
                    if (i == 0) {
                        layoutParams.rightMargin = b;
                    }
                    inflate.setLayoutParams(layoutParams);
                    inflate.setOnClickListener(this.f12686u);
                    this.f12681m.addView(inflate);
                }
            }
            this.f12670b = list;
            if (this.f12670b.size() > 2) {
                this.f12670b.remove(0);
                this.f12670b.remove(0);
                return;
            }
            C4253a.m14398b(this.f12674f, this.f12762y.getId());
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m14764a(Map map, Map map2) throws Exception {
        map.putAll(map2);
        C8443c.m25663a().mo21606a("live_show", map, new Object[0]);
    }

    public void onViewCreated(View view, Bundle bundle) {
        User user;
        super.onViewCreated(view, bundle);
        m14768f();
        if (this.f12762y != null) {
            user = this.f12762y.getOwner();
        } else {
            user = null;
        }
        if (user != null) {
            C5343e.m17031a((ImageView) this.f12675g, user.getAvatarThumb(), (int) R.drawable.c4_);
            this.f12676h.setText(user.getNickName());
        }
        if (this.f12762y != null) {
            C4253a.m14398b(this.f12674f, this.f12762y.getId());
            m14761a(this.f12762y.getStats());
        }
        if (user != null && user.isFollowing()) {
            C9738o.m28712b(this.f12679k, 8);
        }
        if (user != null && user.getId() == TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
            TTLiveSDKContext.getHostService().mo22367h().mo22177a(true);
        }
        float a = ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext()));
        if (user != null) {
            C5343e.m17039a(this.f12677i, user.getAvatarLarge(), (C13842b) new C9092w(8, a, null));
        }
        m14767e();
        C8448g.m25682a((Context) this.f12673e);
        if (this.f12762y != null) {
            this.f12762y.getId();
        }
        m14769g();
        C3913e.m13800a().mo11452a(Integer.valueOf(0));
        C3596c.m13172a(C9295a.class);
    }

    /* renamed from: a */
    public final void mo12086a(DataCenter dataCenter, Bundle bundle) {
        this.f12671c = dataCenter;
        this.f12684s = C8804a.m26395a(dataCenter, bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.apx, viewGroup, false);
    }

    /* renamed from: a */
    private void m14763a(Room room, View view, boolean z) {
        C4386a aVar;
        HSImageView hSImageView = (HSImageView) view.findViewById(R.id.a4g);
        TextView textView = (TextView) view.findViewById(R.id.aet);
        LiveRecommendBar liveRecommendBar = (LiveRecommendBar) view.findViewById(R.id.aes);
        if (!this.f12683r.contains(liveRecommendBar)) {
            this.f12683r.add(liveRecommendBar);
        }
        if (room.getOwner() != null && !TextUtils.isEmpty(room.getOwner().getNickName())) {
            C9738o.m28704a(textView, (CharSequence) room.getOwner().getNickName());
        }
        ImageModel imageModel = null;
        if (z) {
            aVar = this.f12688w;
        } else {
            aVar = null;
        }
        liveRecommendBar.mo12109a(aVar);
        if (room.getOwner() != null) {
            imageModel = room.getOwner().getAvatarMedium();
        }
        if (imageModel != null) {
            C5343e.m17038a(hSImageView, imageModel);
        }
        view.setTag(room);
        m14765b(room);
    }

    /* renamed from: a */
    public final void mo12084a(Activity activity, Room room, C9297a aVar, String str) {
        this.f12673e = activity;
        this.f12762y = room;
        this.f12672d = aVar;
        this.f12761B = str;
        this.f12763z = false;
    }
}
