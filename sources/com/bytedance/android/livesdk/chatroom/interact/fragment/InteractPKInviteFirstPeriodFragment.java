package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract.C4509a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract.View;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
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

public class InteractPKInviteFirstPeriodFragment extends View implements OnClickListener {

    /* renamed from: e */
    private TextView f13601e;

    /* renamed from: f */
    private User f13602f;

    /* renamed from: g */
    private User f13603g;

    /* renamed from: h */
    private int f13604h;

    /* renamed from: i */
    private long f13605i;

    /* renamed from: j */
    private long f13606j;

    /* renamed from: k */
    private String f13607k;

    /* renamed from: l */
    private long f13608l;

    /* renamed from: m */
    private TextView f13609m;

    /* renamed from: q */
    private ConstraintLayout f13610q;

    /* renamed from: r */
    private LinearLayout f13611r;

    /* renamed from: s */
    private String f13612s;

    /* renamed from: t */
    private Room f13613t;

    /* renamed from: u */
    private String[] f13614u = {"mutual_follow", "recommend", "recent", "other_follow"};

    /* renamed from: v */
    private int f13615v;

    /* renamed from: w */
    private RivalExtraInfo f13616w;

    /* renamed from: x */
    private android.view.View f13617x;

    /* renamed from: b */
    public final String mo12279b() {
        return this.f13607k;
    }

    /* renamed from: c */
    public final float mo12280c() {
        return 216.0f;
    }

    /* renamed from: d */
    public final android.view.View mo12281d() {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f13116a.setCancelable(true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        ((C4509a) this.f13118c).mo12293c();
    }

    /* renamed from: a */
    public final void mo12740a() {
        if (this.f13603g != null) {
            ((C4509a) this.f13118c).mo12291a(2, this.f13605i, this.f13606j, this.f13603g);
        }
        this.f13119d.mo11450c();
        ((C4509a) this.f13118c).mo12293c();
    }

    /* renamed from: e */
    public final android.view.View mo12282e() {
        if (this.f13604h == 0) {
            return null;
        }
        int i = 0;
        android.view.View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awy, (ViewGroup) getView(), false);
        android.view.View findViewById = inflate.findViewById(R.id.bc5);
        if (!((Boolean) C8946b.f24393aR.mo22117a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C4798b(this));
        return inflate;
    }

    /* renamed from: a */
    public final void mo12289a(boolean z) {
        this.f13116a.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12741a(android.view.View view) {
        C8946b.f24393aR.mo22118a(Boolean.valueOf(false));
        this.f13116a.mo12147a(InteractSettingsFragment.m15828a(this.f13116a));
    }

    /* renamed from: a */
    public final void mo12288a(int i) {
        String str;
        if (this.f10103o) {
            if (this.f13604h != 0) {
                this.f13601e.setText(C9078p.m27100a(getString(R.string.eo7), Integer.valueOf(i)));
            }
            if (i == 0) {
                if (this.f13604h == 1) {
                    if (this.f13603g != null) {
                        ((C4509a) this.f13118c).mo12291a(5, this.f13605i, this.f13606j, this.f13603g);
                    }
                    this.f13116a.setCancelable(false);
                } else if (this.f13604h == 0) {
                    mo12289a(false);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_page", "live_detail");
                hashMap.put("room_id", String.valueOf(this.f13116a.mo12151c().getId()));
                if (this.f13603g != null) {
                    hashMap.put("inviter_id", String.valueOf(this.f13603g.getId()));
                }
                if (this.f13602f != null) {
                    hashMap.put("invitee_id", String.valueOf(this.f13602f.getId()));
                }
                if (this.f13119d.f11680r == 1) {
                    HashMap hashMap2 = new HashMap(hashMap);
                    hashMap2.put("theme", this.f13119d.f11673k);
                    hashMap2.put("pk_time", String.valueOf(this.f13119d.f11672j));
                    C8443c.m25663a().mo21606a("random_match_cancel", hashMap2, new C8438j().mo21599b("live").mo21603f("other"));
                }
                String str2 = "match_type";
                if (this.f13119d.f11680r == 1) {
                    str = "random";
                } else {
                    str = "manual";
                }
                hashMap.put(str2, str);
                if (this.f13119d.f11672j == 0) {
                    hashMap.put("connection_type", "anchor");
                } else {
                    hashMap.put("connection_type", "pk");
                    hashMap.put("theme", this.f13119d.f11673k);
                    hashMap.put("pk_time", String.valueOf(this.f13119d.f11672j));
                }
                hashMap.put("is_oncemore", "0");
                hashMap.put("selection", "reject");
                C8435g gVar = new C8435g();
                if (this.f13119d.f11672j > 0 && this.f13119d.f11680r == 0) {
                    gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
                }
                C8443c.m25663a().mo21606a("connection_invited", hashMap, new C8438j().mo21599b("live").mo21603f("other"), gVar, Room.class);
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
        if (this.f13603g != null) {
            hashMap.put("inviter_id", String.valueOf(this.f13603g.getId()));
        }
        if (this.f13602f != null) {
            hashMap.put("invitee_id", String.valueOf(this.f13602f.getId()));
        }
        if ((id == R.id.p9 || id == R.id.pi) && this.f13119d.f11680r == 1) {
            HashMap hashMap2 = new HashMap(hashMap);
            hashMap2.put("theme", this.f13119d.f11673k);
            hashMap2.put("pk_time", String.valueOf(this.f13119d.f11672j));
            C8443c.m25663a().mo21606a("random_match_cancel", hashMap2, new C8438j().mo21599b("live").mo21603f("other"));
        }
        if (id == R.id.p9 && this.f13119d.f11680r == 0) {
            HashMap hashMap3 = new HashMap();
            Room c = this.f13116a.mo12151c();
            if (c != null) {
                hashMap3.put("room_id", String.valueOf(c.getId()));
                hashMap3.put("anchor_id", String.valueOf(c.getOwnerUserId()));
            }
            if (this.f13602f != null) {
                hashMap3.put("invitee_id", String.valueOf(this.f13602f.getId()));
            }
            C8443c.m25663a().mo21606a("livesdk_manual_match_cancel", hashMap3, new Object[0]);
        }
        if (id == R.id.pi || id == R.id.p7) {
            if (this.f13119d.f11672j == 0) {
                hashMap.put("connection_type", "anchor");
            } else {
                hashMap.put("connection_type", "pk");
                hashMap.put("theme", this.f13119d.f11673k);
                hashMap.put("pk_time", String.valueOf(this.f13119d.f11672j));
            }
            hashMap.put("is_oncemore", "0");
            String str2 = "selection";
            if (id == R.id.pi) {
                str = "reject";
            } else {
                str = "accept";
            }
            hashMap.put(str2, str);
            C8435g gVar = new C8435g();
            if (this.f13119d.f11672j > 0 && this.f13119d.f11680r == 0) {
                gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
            }
            C8443c.m25663a().mo21606a("connection_invited", hashMap, new C8438j().mo21599b("live").mo21603f("other"), Room.class);
        }
        if (id == R.id.p9) {
            if (this.f13602f != null) {
                ((C4509a) this.f13118c).mo12292a(this.f13605i, this.f13606j, this.f13602f.getId(), this.f13608l);
            }
            this.f13119d.f11667e = 0;
            this.f13116a.dismiss();
        } else if (id == R.id.p7 || id == R.id.pi) {
            if (this.f13603g != null) {
                C4509a aVar = (C4509a) this.f13118c;
                if (id == R.id.pi) {
                    i = 2;
                } else {
                    i = 1;
                }
                aVar.mo12291a(i, this.f13605i, this.f13606j, this.f13603g);
            }
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
        android.view.View inflate = layoutInflater.inflate(R.layout.aq7, viewGroup, false);
        this.f13601e = (TextView) inflate.findViewById(R.id.pi);
        this.f13609m = (TextView) inflate.findViewById(R.id.p7);
        this.f13617x = inflate.findViewById(R.id.doj);
        VHeadView vHeadView = (VHeadView) inflate.findViewById(R.id.doa);
        TextView textView = (TextView) inflate.findViewById(R.id.dnv);
        VHeadView vHeadView2 = (VHeadView) inflate.findViewById(R.id.b2z);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dwd);
        TextView textView3 = (TextView) inflate.findViewById(R.id.do_);
        TextView textView4 = (TextView) inflate.findViewById(R.id.dwc);
        this.f13610q = (ConstraintLayout) inflate.findViewById(R.id.dnu);
        this.f13611r = (LinearLayout) inflate.findViewById(R.id.dof);
        inflate.findViewById(R.id.lw);
        this.f13601e.setOnClickListener(this);
        this.f13609m.setOnClickListener(this);
        if (this.f13604h == 0) {
            this.f13601e.setVisibility(8);
            this.f13609m.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.f13610q.setVisibility(0);
            textView.setText(this.f13612s);
            if (this.f13603g != null) {
                C5343e.m17045b(vHeadView, this.f13603g.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), R.drawable.c4_);
                textView2.setText(this.f13603g.getNickName());
                textView4.setText(getContext().getResources().getString(R.string.enz, new Object[]{C3517a.m12958a(this.f13603g.getFanTicketCount())}));
                vHeadView2.setVisibility(0);
                if (this.f13603g.getGender() == 1) {
                    vHeadView2.setImageResource(R.drawable.c1m);
                } else {
                    vHeadView2.setImageResource(R.drawable.c1k);
                }
            }
            if (this.f13613t != null && LinkCrossRoomDataHolder.m13782a().f11672j > 0) {
                textView3.setVisibility(0);
                textView3.setText(getContext().getResources().getString(R.string.eny, new Object[]{C3517a.m12958a((long) this.f13613t.getUserCount())}));
            }
        }
        this.f13116a.setCancelable(false);
        C4509a aVar = (C4509a) this.f13118c;
        if (this.f13604h == 0) {
            i = 12;
        } else {
            i = 10;
        }
        aVar.mo12290a(i);
        return inflate;
    }

    /* renamed from: a */
    public static View m15739a(C4522b bVar, int i, String str, Room room, String str2, long j, long j2, DataCenter dataCenter, int i2, RivalExtraInfo rivalExtraInfo) {
        InteractPKInviteFirstPeriodFragment interactPKInviteFirstPeriodFragment = new InteractPKInviteFirstPeriodFragment();
        interactPKInviteFirstPeriodFragment.f13118c = new C4746n(interactPKInviteFirstPeriodFragment, dataCenter);
        interactPKInviteFirstPeriodFragment.f13116a = bVar;
        if (TextUtils.isEmpty(str)) {
            interactPKInviteFirstPeriodFragment.f13607k = C3358ac.m12528e().getString(R.string.eou);
        } else {
            interactPKInviteFirstPeriodFragment.f13607k = C3358ac.m12528e().getString(R.string.ez1);
        }
        if (room != null) {
            interactPKInviteFirstPeriodFragment.f13603g = room.getOwner();
        }
        interactPKInviteFirstPeriodFragment.f13602f = bVar.mo12151c().getOwner();
        interactPKInviteFirstPeriodFragment.f13606j = bVar.mo12151c().getId();
        interactPKInviteFirstPeriodFragment.f13605i = j;
        interactPKInviteFirstPeriodFragment.f13604h = 1;
        interactPKInviteFirstPeriodFragment.f13608l = 0;
        interactPKInviteFirstPeriodFragment.f13612s = str2;
        interactPKInviteFirstPeriodFragment.f13613t = room;
        interactPKInviteFirstPeriodFragment.f13615v = i2;
        interactPKInviteFirstPeriodFragment.f13616w = rivalExtraInfo;
        return interactPKInviteFirstPeriodFragment;
    }
}
