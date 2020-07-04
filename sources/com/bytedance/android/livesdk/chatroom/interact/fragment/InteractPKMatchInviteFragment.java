package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchInviteContract.C4511a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchInviteContract.View;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4756x;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class InteractPKMatchInviteFragment extends View implements OnClickListener {

    /* renamed from: e */
    private User f13646e;

    /* renamed from: f */
    private User f13647f;

    /* renamed from: g */
    private int f13648g;

    /* renamed from: h */
    private long f13649h;

    /* renamed from: i */
    private long f13650i;

    /* renamed from: j */
    private String f13651j;

    /* renamed from: k */
    private long f13652k;

    /* renamed from: l */
    private TextView f13653l;

    /* renamed from: m */
    private int f13654m;

    /* renamed from: b */
    public final String mo12279b() {
        return this.f13651j;
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
        ((C4511a) this.f13118c).mo12309c();
    }

    /* renamed from: e */
    public final android.view.View mo12282e() {
        if (this.f13648g == 0) {
            return null;
        }
        int i = 0;
        android.view.View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awy, (ViewGroup) getView(), false);
        android.view.View findViewById = inflate.findViewById(R.id.bc5);
        if (!((Boolean) C8946b.f24393aR.mo22117a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C4803g(this));
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12752a(android.view.View view) {
        C8946b.f24393aR.mo22118a(Boolean.valueOf(false));
        this.f13116a.mo12147a(InteractSettingsFragment.m15828a(this.f13116a));
    }

    /* renamed from: a */
    public final void mo12305a(int i) {
        if (this.f10103o) {
            this.f13653l.setText(C9078p.m27100a(getString(R.string.evp), Integer.valueOf(i)));
            if (i == 0) {
                if (this.f13648g == 1) {
                    ((C4511a) this.f13118c).mo12307a(1, this.f13649h, this.f13650i, this.f13647f.getId());
                }
                this.f13116a.dismiss();
            }
        }
    }

    public void onClick(android.view.View view) {
        if (view.getId() == R.id.p9) {
            if (this.f13648g == 1) {
                ((C4511a) this.f13118c).mo12307a(2, this.f13649h, this.f13650i, this.f13647f.getId());
                this.f13119d.mo11450c();
            } else {
                ((C4511a) this.f13118c).mo12308a(this.f13649h, this.f13650i, this.f13646e.getId(), this.f13652k);
                this.f13119d.f11667e = 0;
            }
            this.f13116a.dismiss();
        }
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        android.view.View inflate = layoutInflater.inflate(R.layout.aq9, viewGroup, false);
        this.f13653l = (TextView) inflate.findViewById(R.id.p9);
        VHeadView vHeadView = (VHeadView) inflate.findViewById(R.id.auo);
        TextView textView = (TextView) inflate.findViewById(R.id.dyj);
        VHeadView vHeadView2 = (VHeadView) inflate.findViewById(R.id.aun);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dyi);
        this.f13653l.setOnClickListener(this);
        if (this.f13647f != null) {
            C5343e.m17045b(vHeadView, this.f13647f.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), R.drawable.c4_);
            textView.setText(this.f13647f.getNickName());
        }
        if (this.f13646e != null) {
            C5343e.m17045b(vHeadView2, this.f13646e.getAvatarThumb(), vHeadView2.getWidth(), vHeadView2.getHeight(), R.drawable.c4_);
            textView2.setText(this.f13646e.getNickName());
        }
        this.f13116a.setCancelable(false);
        C4511a aVar = (C4511a) this.f13118c;
        if (this.f13648g == 0) {
            i = 5;
        } else {
            i = 3;
        }
        aVar.mo12306a(i);
        return inflate;
    }

    /* renamed from: a */
    public static InteractPKMatchInviteFragment m15783a(C4522b bVar, int i, String str, User user, long j, long j2, DataCenter dataCenter, int i2) {
        InteractPKMatchInviteFragment interactPKMatchInviteFragment = new InteractPKMatchInviteFragment();
        interactPKMatchInviteFragment.f13118c = new C4756x(interactPKMatchInviteFragment, dataCenter);
        interactPKMatchInviteFragment.f13116a = bVar;
        if (i == 0) {
            interactPKMatchInviteFragment.f13646e = user;
            interactPKMatchInviteFragment.f13647f = bVar.mo12151c().getOwner();
        } else {
            interactPKMatchInviteFragment.f13647f = user;
            interactPKMatchInviteFragment.f13646e = bVar.mo12151c().getOwner();
        }
        interactPKMatchInviteFragment.f13650i = bVar.mo12151c().getId();
        interactPKMatchInviteFragment.f13649h = j;
        interactPKMatchInviteFragment.f13648g = i;
        interactPKMatchInviteFragment.f13654m = i2;
        if (TextUtils.isEmpty(str)) {
            interactPKMatchInviteFragment.f13651j = C3358ac.m12515a((int) R.string.eou);
        } else {
            interactPKMatchInviteFragment.f13651j = str;
        }
        interactPKMatchInviteFragment.f13652k = j2;
        return interactPKMatchInviteFragment;
    }
}
