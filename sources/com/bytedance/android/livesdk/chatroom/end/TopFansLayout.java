package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.setting.C3332f;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.end.C4400h.C4402a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.utils.p426b.C9058c;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.C9385u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class TopFansLayout extends LinearLayout implements C0042h, C4402a {

    /* renamed from: a */
    public List<C4392b> f12775a = new ArrayList();

    /* renamed from: b */
    public final C47562b f12776b = new C47562b();

    /* renamed from: c */
    public Room f12777c;

    /* renamed from: d */
    public C4400h f12778d;

    /* renamed from: e */
    public String f12779e;

    /* renamed from: f */
    public View f12780f = null;

    /* renamed from: g */
    public boolean f12781g = true;

    /* renamed from: h */
    private List<C9385u> f12782h;

    /* renamed from: i */
    private C4391a f12783i;

    /* renamed from: j */
    private Activity f12784j;

    /* renamed from: k */
    private Fragment f12785k;

    /* renamed from: l */
    private OnClickListener f12786l;

    /* renamed from: m */
    private DataCenter f12787m;

    /* renamed from: n */
    private OnClickListener f12788n = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getId() == R.id.b9g) {
                C9385u uVar = (C9385u) view.getTag(R.id.dp3);
                User user = uVar.f25802b;
                if (user != null) {
                    TopFansLayout.this.f12780f = view;
                    if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                        TTLiveSDKContext.getHostService().mo22367h().mo22167a(TopFansLayout.this.getContext(), C8987h.m26865a().mo22189a(C3332f.m12427a()).mo22191b(C3332f.m12428b()).mo22193d("live_detail").mo22194e("follow").mo22192c("live").mo22188a(1).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<IUser>() {
                            public final void onSubscribe(C7321c cVar) {
                                super.onSubscribe(cVar);
                                TopFansLayout.this.f12776b.mo119661a(cVar);
                            }
                        });
                        return;
                    }
                    TopFansLayout.this.f12778d.mo12127a(user.getId(), TopFansLayout.this.f12777c, TopFansLayout.this.f12779e, TopFansLayout.this);
                    TopFansLayout.m14813a("pm_live_take_anchor_follow_audience", uVar);
                }
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.TopFansLayout$a */
    public interface C4391a {
        /* renamed from: a */
        void mo12097a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.TopFansLayout$b */
    static class C4392b {

        /* renamed from: a */
        public View f12794a;

        /* renamed from: b */
        public View f12795b;

        /* renamed from: c */
        public VHeadView f12796c;

        /* renamed from: d */
        public TextView f12797d;

        /* renamed from: e */
        public TextView f12798e;

        private C4392b(View view) {
            this.f12795b = view;
            this.f12794a = view.findViewById(R.id.b9g);
            this.f12796c = (VHeadView) view.findViewById(R.id.aum);
            this.f12797d = (TextView) view.findViewById(R.id.dn0);
            this.f12798e = (TextView) view.findViewById(R.id.dmz);
        }
    }

    /* renamed from: a */
    public final void mo12087a(Throwable th) {
        if (this.f12784j != null && th != null) {
            if (th instanceof ApiServerException) {
                C3517a.m12962a((Context) this.f12784j, ((ApiServerException) th).getPrompt());
            } else {
                C3517a.m12960a((Context) this.f12784j, (int) R.string.esb);
            }
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f12776b.mo119660a();
        this.f12778d.mo12126a();
    }

    /* renamed from: a */
    private void m14812a() {
        for (C4392b bVar : this.f12775a) {
            final User user = ((C9385u) bVar.f12796c.getTag(R.id.dp3)).f25802b;
            TTLiveSDKContext.getHostService().mo22367h().mo22180b(user.getId()).mo19137b((C47557ad<? super T>) new C47557ad<IUser>() {
                public final void onError(Throwable th) {
                }

                public final void onSubscribe(C7321c cVar) {
                    TopFansLayout.this.f12776b.mo119661a(cVar);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(IUser iUser) {
                    if (!TopFansLayout.this.f12775a.isEmpty()) {
                        for (C4392b bVar : TopFansLayout.this.f12775a) {
                            C9385u uVar = (C9385u) bVar.f12796c.getTag(R.id.dp3);
                            User user = uVar.f25802b;
                            if (user != null && user.getId() == user.getId()) {
                                uVar.f25802b = User.from(user);
                                bVar.f12796c.setTag(R.id.dp3, uVar);
                                bVar.f12794a.setTag(R.id.dp3, uVar);
                                if (user.getId() == TTLiveSDKContext.getHostService().mo22367h().mo22179b() || user.isFollowing() || !TopFansLayout.this.f12781g) {
                                    bVar.f12794a.setVisibility(8);
                                    return;
                                } else {
                                    bVar.f12794a.setVisibility(0);
                                    return;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.f12787m = dataCenter;
    }

    public void setFollowVisible(boolean z) {
        this.f12781g = z;
    }

    public void setTopFansCallBack(C4391a aVar) {
        this.f12783i = aVar;
    }

    public TopFansLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12118a(User user) {
        if (user != null) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("log_enter_live_source", this.f12779e);
            hashMap.put("sec_user_id", user.getSecUid());
            TTLiveSDKContext.getHostService().mo22365f().mo22043a(user.getId(), (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public final void mo12085a(FollowPair followPair) {
        if (this.f12784j != null) {
            if (this.f12780f != null && this.f12780f.getVisibility() == 0) {
                this.f12780f.setVisibility(8);
            }
            C3517a.m12960a((Context) this.f12784j, (int) R.string.esc);
        }
    }

    public TopFansLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static void m14813a(String str, C9385u uVar) {
        String str2;
        if (!TextUtils.isEmpty(str) && uVar != null) {
            if (uVar.f25803c == 1) {
                str2 = "no.1";
            } else if (uVar.f25803c == 2) {
                str2 = "no.2";
            } else {
                str2 = "no.3";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "anchor_live_ending");
            hashMap.put("people", str2);
            C8443c.m25663a().mo21606a(str, hashMap, new C8439k());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12119a(BaseFragment baseFragment, List list) throws Exception {
        if (baseFragment.mo8989l()) {
            if (!C6311g.m19573a(list)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C9385u uVar = (C9385u) it.next();
                    if (uVar == null || uVar.f25801a <= 0) {
                        it.remove();
                    }
                }
                if (C6311g.m19573a(list)) {
                    if (this.f12783i != null) {
                        this.f12783i.mo12097a();
                    }
                    return;
                }
                TypedArray obtainTypedArray = getContext().getResources().obtainTypedArray(R.array.ai);
                this.f12775a.clear();
                int i = 0;
                while (i < list.size()) {
                    if (i < obtainTypedArray.length()) {
                        User user = ((C9385u) list.get(i)).f25802b;
                        if (user != null) {
                            C4392b bVar = new C4392b(LayoutInflater.from(getContext()).inflate(R.layout.asb, null));
                            C5343e.m17031a((ImageView) bVar.f12796c, user.getAvatarThumb(), (int) R.drawable.c4_);
                            if (user.getId() == TTLiveSDKContext.getHostService().mo22367h().mo22179b() || user.isFollowing() || !this.f12781g) {
                                bVar.f12794a.setVisibility(8);
                            } else {
                                bVar.f12794a.setVisibility(0);
                            }
                            C9385u uVar2 = (C9385u) list.get(i);
                            uVar2.f25803c = i + 1;
                            bVar.f12794a.setTag(R.id.dp3, uVar2);
                            bVar.f12794a.setOnClickListener(this.f12788n);
                            bVar.f12796c.setBackgroundResource(obtainTypedArray.getResourceId(i, 0));
                            bVar.f12796c.setTag(R.id.dp3, uVar2);
                            bVar.f12796c.setOnClickListener(this.f12786l);
                            if (uVar2.f25802b != null) {
                                bVar.f12797d.setText(uVar2.f25802b.getNickName());
                                bVar.f12798e.setText(this.f12784j.getResources().getString(R.string.f7t, new Object[]{C3385e.m12591a(uVar2.f25801a)}));
                            }
                            LayoutParams layoutParams = new LayoutParams(0, -2);
                            layoutParams.weight = 1.0f;
                            bVar.f12795b.setLayoutParams(layoutParams);
                            this.f12775a.add(bVar);
                            addView(bVar.f12795b);
                            if (i != list.size() - 1) {
                                View view = new View(this.f12784j);
                                view.setBackgroundResource(R.drawable.c07);
                                LayoutParams layoutParams2 = new LayoutParams((int) C9738o.m28708b((Context) this.f12784j, 0.5f), -1);
                                layoutParams2.topMargin = (int) C9738o.m28708b((Context) this.f12784j, 20.0f);
                                layoutParams2.bottomMargin = (int) C9738o.m28708b((Context) this.f12784j, 20.0f);
                                addView(view, layoutParams2);
                            }
                            if (i == 0 && list.size() != 2) {
                                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) bVar.f12796c.getLayoutParams();
                                layoutParams3.topMargin = 0;
                                layoutParams3.width = (int) C9738o.m28708b((Context) this.f12784j, 56.0f);
                                layoutParams3.height = (int) C9738o.m28708b((Context) this.f12784j, 56.0f);
                                bVar.f12797d.setTextSize(2, 14.0f);
                                ((RelativeLayout.LayoutParams) bVar.f12797d.getLayoutParams()).topMargin = (int) C9738o.m28708b((Context) this.f12784j, 24.0f);
                            }
                        }
                        i++;
                    } else {
                        return;
                    }
                }
                if (list.size() == 3) {
                    int indexOfChild = indexOfChild(((C4392b) this.f12775a.get(1)).f12795b);
                    removeView(((C4392b) this.f12775a.get(0)).f12795b);
                    removeView(((C4392b) this.f12775a.get(1)).f12795b);
                    addView(((C4392b) this.f12775a.get(1)).f12795b, 0);
                    addView(((C4392b) this.f12775a.get(0)).f12795b, indexOfChild);
                }
                obtainTypedArray.recycle();
                postInvalidate();
                m14812a();
                return;
            }
            if (this.f12783i != null) {
                this.f12783i.mo12097a();
            }
        }
    }

    public TopFansLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TopFansLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo12117a(Activity activity, BaseFragment baseFragment, Room room, String str) {
        if (activity != null && room != null) {
            this.f12777c = room;
            this.f12782h = room.getTopFanTickets();
            this.f12784j = activity;
            this.f12785k = baseFragment;
            this.f12779e = str;
            ((C9057b) C7492s.m23300b((Iterable<? extends T>) this.f12782h).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22251b(C4405k.f12811a).mo19334m().mo19127a(C47549a.m148327a()).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4406l<Object>(this, baseFragment), C4407m.f12814a);
            this.f12786l = new OnClickListener() {
                public final void onClick(View view) {
                    if (view.getId() == R.id.aum) {
                        C9385u uVar = (C9385u) view.getTag(R.id.dp3);
                        if (uVar != null) {
                            TopFansLayout.this.mo12118a(uVar.f25802b);
                        }
                        TopFansLayout.m14813a("pm_live_take_audience_pic_click", uVar);
                    }
                }
            };
            this.f12785k.getLifecycle().mo55a(this);
            this.f12778d = new C4400h();
        }
    }
}
