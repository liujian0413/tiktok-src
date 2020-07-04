package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C2378j;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.admin.p184b.C3890c;
import com.bytedance.android.livesdk.admin.p185c.C3892a;
import com.bytedance.android.livesdk.admin.p186d.C3897a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p188b.C3917a;
import com.bytedance.android.livesdk.p188b.C3922f;
import com.bytedance.android.livesdk.p418r.C8793a;
import com.bytedance.android.livesdk.p424u.C8955a;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cm */
public final class C5246cm extends Dialog implements OnClickListener, C3897a, C3922f {

    /* renamed from: a */
    private Room f15344a;

    /* renamed from: b */
    private User f15345b;

    /* renamed from: c */
    private boolean f15346c;

    /* renamed from: d */
    private C3917a f15347d = new C3917a();

    /* renamed from: e */
    private C3892a f15348e = new C3892a(this);

    /* renamed from: f */
    private TextView f15349f;

    /* renamed from: g */
    private TextView f15350g;

    /* renamed from: h */
    private boolean f15351h;

    /* renamed from: i */
    private boolean f15352i;

    /* renamed from: a */
    public final void mo11433a(C3890c cVar, Exception exc) {
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15346c = true;
    }

    public final void onDetachedFromWindow() {
        this.f15346c = false;
        this.f15347d.f11735a = null;
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo11472a(boolean z) {
        int i;
        if (this.f15346c) {
            if (this.f15345b.getUserAttr() == null) {
                this.f15345b.setUserAttr(new C2378j());
            }
            this.f15345b.getUserAttr().f7829a = z;
            TextView textView = this.f15350g;
            if (z) {
                i = R.string.ezy;
            } else {
                i = R.string.f01;
            }
            textView.setText(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ao_, null));
        if (window != null) {
            window.setLayout(-1, -2);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.a19);
        findViewById(R.id.sp).setOnClickListener(this);
        if (this.f15351h || this.f15345b == null || this.f15344a.getOwner().getId() == this.f15345b.getId()) {
            viewGroup.removeViews(5, 5);
            viewGroup.findViewById(R.id.bwu).setOnClickListener(this);
            viewGroup.findViewById(R.id.c2c).setOnClickListener(this);
            viewGroup.findViewById(R.id.bfq).setOnClickListener(this);
            viewGroup.findViewById(R.id.bwu).setVisibility(8);
            return;
        }
        viewGroup.removeViews(0, 5);
        this.f15349f = (TextView) viewGroup.findViewById(R.id.bws);
        this.f15349f.setOnClickListener(this);
        viewGroup.findViewById(R.id.bfp).setOnClickListener(this);
        this.f15350g = (TextView) viewGroup.findViewById(R.id.c2b);
        this.f15350g.setOnClickListener(this);
        C2378j userAttr = this.f15345b.getUserAttr();
        if (userAttr != null) {
            TextView textView = this.f15349f;
            if (userAttr.f7830b) {
                i = R.string.ezw;
            } else {
                i = R.string.f03;
            }
            textView.setText(i);
            TextView textView2 = this.f15350g;
            if (userAttr.f7829a) {
                i2 = R.string.ezy;
            } else {
                i2 = R.string.f01;
            }
            textView2.setText(i2);
        }
        this.f15349f.setVisibility(8);
    }

    public final void onClick(View view) {
        boolean z;
        boolean z2;
        long j;
        int id = view.getId();
        if (id == R.id.bws) {
            if (this.f15345b.getUserAttr() == null || !this.f15345b.getUserAttr().f7830b) {
                z2 = true;
            } else {
                z2 = false;
            }
            C3892a aVar = this.f15348e;
            long id2 = this.f15345b.getId();
            long j2 = 0;
            if (this.f15344a == null || this.f15344a.getOwner() == null) {
                j = 0;
            } else {
                j = this.f15344a.getOwner().getId();
            }
            if (this.f15344a != null) {
                j2 = this.f15344a.getId();
            }
            aVar.mo11431a(z2, id2, j, j2);
        } else if (id == R.id.bfp) {
            dismiss();
            C8793a aVar2 = new C8793a(getContext(), this.f15344a.getId(), this.f15344a.getOwnerUserId(), this.f15345b.getId());
            aVar2.show();
            C8443c.m25663a().mo21607a("blacklist_click", new C8438j().mo21599b("relation").mo21603f("click").mo21598a("live_detail"));
        } else if (id == R.id.c2b) {
            if (this.f15345b.getUserAttr() == null || !this.f15345b.getUserAttr().f7829a) {
                z = true;
            } else {
                z = false;
            }
            this.f15347d.mo11467a(z, this.f15344a.getId(), this.f15345b.getId());
        } else if (id == R.id.bwu) {
            C8955a aVar3 = new C8955a(getContext(), 1, this.f15344a.getId(), this.f15344a.getOwner().getId(), this.f15352i);
            aVar3.show();
            C8448g.m25682a(getContext());
            dismiss();
        } else if (id == R.id.c2c) {
            C8955a aVar4 = new C8955a(getContext(), 2, this.f15344a.getId(), this.f15344a.getOwner().getId(), this.f15352i);
            aVar4.show();
            dismiss();
        } else if (id == R.id.bfq) {
            C8955a aVar5 = new C8955a(getContext(), 3, this.f15344a.getId(), this.f15344a.getOwner().getId(), this.f15352i);
            aVar5.show();
            dismiss();
        } else {
            if (id == R.id.sp) {
                dismiss();
                C8448g.m25682a(getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo11435a(boolean z, Exception exc) {
        if (this.f15346c) {
            C9076n.m27096a(getContext(), (Throwable) exc, (int) R.string.ezj);
        }
    }

    /* renamed from: b */
    public final void mo11473b(boolean z, Exception exc) {
        if (this.f15346c) {
            C9076n.m27096a(getContext(), (Throwable) exc, (int) R.string.ezj);
        }
    }

    /* renamed from: a */
    public final void mo11434a(boolean z, User user) {
        int i;
        if (this.f15346c) {
            if (this.f15345b.getUserAttr() == null) {
                this.f15345b.setUserAttr(new C2378j());
            }
            this.f15345b.getUserAttr().f7830b = z;
            TextView textView = this.f15349f;
            if (z) {
                i = R.string.ezw;
            } else {
                i = R.string.f03;
            }
            textView.setText(i);
        }
    }

    public C5246cm(Context context, Room room, User user, boolean z, boolean z2) {
        super(context, R.style.y0);
        this.f15344a = room;
        this.f15345b = user;
        this.f15351h = z;
        this.f15352i = z2;
    }
}
