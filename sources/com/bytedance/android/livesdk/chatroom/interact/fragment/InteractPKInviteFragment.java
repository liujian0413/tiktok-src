package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract.C4509a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract.View;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4746n;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

public class InteractPKInviteFragment extends View implements OnClickListener {

    /* renamed from: e */
    private TextView f13618e;

    /* renamed from: f */
    private TextView f13619f;

    /* renamed from: g */
    private TextView f13620g;

    /* renamed from: h */
    private TextView f13621h;

    /* renamed from: i */
    private User f13622i;

    /* renamed from: j */
    private User f13623j;

    /* renamed from: k */
    private int f13624k;

    /* renamed from: l */
    private long f13625l;

    /* renamed from: m */
    private long f13626m;

    /* renamed from: q */
    private String f13627q;

    /* renamed from: r */
    private long f13628r;

    /* renamed from: s */
    private TextView f13629s;

    /* renamed from: t */
    private int f13630t;

    /* renamed from: u */
    private String[] f13631u = {"mutual_follow", "recommend", "recent", "other_follow"};

    /* renamed from: b */
    public final String mo12279b() {
        return this.f13627q;
    }

    /* renamed from: c */
    public final float mo12280c() {
        return 216.0f;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f13116a.setCancelable(true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        ((C4509a) this.f13118c).mo12293c();
    }

    /* renamed from: d */
    public final android.view.View mo12281d() {
        if (this.f13624k == 1) {
            return null;
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
        autoRTLImageView.setLayoutParams(new LayoutParams(C3358ac.m12510a(32.0f), C3358ac.m12510a(32.0f)));
        autoRTLImageView.setImageDrawable(C3358ac.m12524c(R.drawable.c3l));
        autoRTLImageView.setOnClickListener(new C4800d(this));
        return autoRTLImageView;
    }

    /* renamed from: e */
    public final android.view.View mo12282e() {
        if (this.f13624k == 0) {
            return null;
        }
        int i = 0;
        android.view.View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awy, (ViewGroup) getView(), false);
        android.view.View findViewById = inflate.findViewById(R.id.bc5);
        if (!((Boolean) C8946b.f24393aR.mo22117a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C4799c(this));
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12743a(android.view.View view) {
        ((C4509a) this.f13118c).mo12292a(this.f13625l, this.f13626m, this.f13622i.getId(), this.f13628r);
        this.f13119d.f11667e = 0;
        this.f13116a.mo12143a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12744b(android.view.View view) {
        C8946b.f24393aR.mo22118a(Boolean.valueOf(false));
        this.f13116a.mo12147a(InteractSettingsFragment.m15828a(this.f13116a));
    }

    /* renamed from: a */
    public final void mo12289a(boolean z) {
        if (z) {
            this.f13618e.setVisibility(8);
            this.f13629s.setVisibility(8);
            this.f13620g.setVisibility(0);
            this.f13621h.setVisibility(0);
            return;
        }
        this.f13116a.dismiss();
    }

    /* renamed from: a */
    public final void mo12288a(int i) {
        if (this.f10103o) {
            if (this.f13624k == 0) {
                this.f13619f.setText(C9078p.m27100a(getString(R.string.evp), Integer.valueOf(i)));
            } else {
                this.f13618e.setText(C9078p.m27100a(getString(R.string.eo7), Integer.valueOf(i)));
            }
            if (i == 0) {
                if (this.f13624k == 1) {
                    ((C4509a) this.f13118c).mo12291a(5, this.f13625l, this.f13626m, this.f13623j);
                    this.f13116a.setCancelable(false);
                } else if (this.f13624k == 0) {
                    mo12289a(false);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_page", "live_detail");
                hashMap.put("room_id", String.valueOf(this.f13116a.mo12151c().getId()));
                hashMap.put("inviter_id", String.valueOf(this.f13623j.getId()));
                hashMap.put("invitee_id", String.valueOf(this.f13622i.getId()));
                if (this.f13119d.f11672j > 0) {
                    hashMap.put("theme", this.f13119d.f11673k);
                    hashMap.put("pk_time", String.valueOf(this.f13119d.f11672j));
                }
                hashMap.put("selection", "reject");
                C8443c.m25663a().mo21606a("connection_invited", hashMap, new C8438j().mo21599b("live").mo21603f("other"), new C8435g().mo21591a(this.f13119d.f11669g), this.f13119d.mo11449b(), Room.class);
            }
        }
    }

    public void onClick(android.view.View view) {
        int i;
        String str;
        int id = view.getId();
        HashMap hashMap = new HashMap();
        hashMap.put("event_page", "live_detail");
        hashMap.put("room_id", String.valueOf(this.f13116a.mo12151c().getId()));
        hashMap.put("inviter_id", String.valueOf(this.f13623j.getId()));
        hashMap.put("invitee_id", String.valueOf(this.f13622i.getId()));
        if (id == R.id.pi || id == R.id.p7) {
            if (this.f13119d.f11672j > 0) {
                hashMap.put("theme", this.f13119d.f11673k);
                hashMap.put("pk_time", String.valueOf(this.f13119d.f11672j));
            }
            String str2 = "selection";
            if (id == R.id.pi) {
                str = "reject";
            } else {
                str = "accept";
            }
            hashMap.put(str2, str);
            C8443c.m25663a().mo21606a("connection_invited", hashMap, new C8438j().mo21599b("live").mo21603f("other"), this.f13119d.mo11449b(), new C8435g().mo21591a(this.f13119d.f11669g), Room.class);
        }
        if (id == R.id.p9) {
            ((C4509a) this.f13118c).mo12292a(this.f13625l, this.f13626m, this.f13622i.getId(), this.f13628r);
            this.f13119d.f11667e = 0;
            this.f13116a.dismiss();
        } else if (id == R.id.p7 || id == R.id.pi) {
            C4509a aVar = (C4509a) this.f13118c;
            if (id == R.id.pi) {
                i = 2;
            } else {
                i = 1;
            }
            aVar.mo12291a(i, this.f13625l, this.f13626m, this.f13623j);
            if (id == R.id.pi) {
                this.f13119d.mo11450c();
            }
            ((C4509a) this.f13118c).mo12293c();
        } else if (id == R.id.ps) {
            this.f13116a.dismiss();
        } else {
            if (id == R.id.ru) {
                ((C4509a) this.f13118c).mo12294d();
            }
        }
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        android.view.View inflate = layoutInflater.inflate(R.layout.aq6, viewGroup, false);
        this.f13619f = (TextView) inflate.findViewById(R.id.p9);
        this.f13618e = (TextView) inflate.findViewById(R.id.pi);
        this.f13629s = (TextView) inflate.findViewById(R.id.p7);
        this.f13620g = (TextView) inflate.findViewById(R.id.ru);
        this.f13621h = (TextView) inflate.findViewById(R.id.ps);
        VHeadView vHeadView = (VHeadView) inflate.findViewById(R.id.auo);
        TextView textView = (TextView) inflate.findViewById(R.id.dyj);
        VHeadView vHeadView2 = (VHeadView) inflate.findViewById(R.id.aun);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dyi);
        this.f13619f.setOnClickListener(this);
        this.f13618e.setOnClickListener(this);
        this.f13629s.setOnClickListener(this);
        this.f13620g.setOnClickListener(this);
        this.f13621h.setOnClickListener(this);
        if (this.f13623j != null) {
            C5343e.m17045b(vHeadView, this.f13623j.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), R.drawable.c4_);
        }
        if (this.f13622i != null) {
            C5343e.m17045b(vHeadView2, this.f13622i.getAvatarThumb(), vHeadView2.getWidth(), vHeadView2.getHeight(), R.drawable.c4_);
        }
        if (this.f13623j != null) {
            textView.setText(this.f13623j.getNickName());
        }
        if (this.f13622i != null) {
            textView2.setText(this.f13622i.getNickName());
        }
        if (this.f13624k == 0) {
            this.f13618e.setVisibility(8);
            this.f13629s.setVisibility(8);
        } else {
            this.f13619f.setVisibility(8);
        }
        this.f13116a.setCancelable(false);
        C4509a aVar = (C4509a) this.f13118c;
        if (this.f13624k == 0) {
            i = 12;
        } else {
            i = 10;
        }
        aVar.mo12290a(i);
        return inflate;
    }

    /* renamed from: a */
    public static InteractPKInviteFragment m15748a(C4522b bVar, int i, String str, User user, long j, long j2, DataCenter dataCenter) {
        InteractPKInviteFragment interactPKInviteFragment = new InteractPKInviteFragment();
        interactPKInviteFragment.f13118c = new C4746n(interactPKInviteFragment, dataCenter);
        interactPKInviteFragment.f13116a = bVar;
        if (TextUtils.isEmpty(str)) {
            interactPKInviteFragment.f13627q = C3358ac.m12528e().getString(R.string.eou);
        } else {
            interactPKInviteFragment.f13627q = str;
        }
        interactPKInviteFragment.f13622i = user;
        interactPKInviteFragment.f13623j = bVar.mo12151c().getOwner();
        interactPKInviteFragment.f13626m = bVar.mo12151c().getId();
        interactPKInviteFragment.f13625l = j;
        interactPKInviteFragment.f13624k = 0;
        interactPKInviteFragment.f13628r = j2;
        return interactPKInviteFragment;
    }

    /* renamed from: a */
    public static InteractPKInviteFragment m15749a(C4522b bVar, int i, String str, User user, long j, long j2, DataCenter dataCenter, int i2) {
        InteractPKInviteFragment interactPKInviteFragment = new InteractPKInviteFragment();
        interactPKInviteFragment.f13118c = new C4746n(interactPKInviteFragment, dataCenter);
        interactPKInviteFragment.f13116a = bVar;
        if (LinkCrossRoomDataHolder.m13782a().f11672j == 0) {
            interactPKInviteFragment.f13627q = C3358ac.m12528e().getString(R.string.eou);
        } else {
            interactPKInviteFragment.f13627q = C3358ac.m12528e().getString(R.string.ez1);
        }
        Room c = bVar.mo12151c();
        interactPKInviteFragment.f13623j = user;
        interactPKInviteFragment.f13622i = c.getOwner();
        interactPKInviteFragment.f13626m = c.getId();
        interactPKInviteFragment.f13625l = j;
        interactPKInviteFragment.f13624k = 1;
        interactPKInviteFragment.f13628r = 0;
        interactPKInviteFragment.f13630t = i2;
        return interactPKInviteFragment;
    }
}
