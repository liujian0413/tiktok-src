package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.event.C4414af;
import com.bytedance.android.livesdk.chatroom.model.C4874ai;
import com.bytedance.android.livesdk.chatroom.model.C4874ai.C4876b;
import com.bytedance.android.livesdk.chatroom.presenter.C4991br;
import com.bytedance.android.livesdk.chatroom.presenter.C4991br.C4992a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class PkPromotionWidget extends LiveRecyclableWidget implements C0053p<KVData>, OnClickListener, C4992a {

    /* renamed from: a */
    private ImageView f16315a;

    /* renamed from: b */
    private ViewGroup f16316b;

    /* renamed from: c */
    private ViewGroup f16317c;

    /* renamed from: d */
    private TextView f16318d;

    /* renamed from: e */
    private TextView f16319e;

    /* renamed from: f */
    private ForegroundColorSpan f16320f;

    /* renamed from: g */
    private Room f16321g;

    /* renamed from: h */
    private boolean f16322h;

    /* renamed from: i */
    private C4991br f16323i;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.ay6;
    }

    public void onUnload() {
        this.f16323i.mo8963a();
        this.dataCenter.removeObserver(this);
    }

    /* renamed from: a */
    private void m17744a(int i) {
        if (i != 1) {
            this.contentView.setVisibility(0);
        } else {
            this.contentView.setVisibility(8);
        }
    }

    public void onLoad(Object[] objArr) {
        this.f16321g = (Room) this.dataCenter.get("data_room");
        this.f16322h = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.dataCenter.observe("data_link_state", this);
        this.f16323i.mo9142a((C4992a) this);
    }

    /* renamed from: a */
    private void m17747a(C4876b bVar) {
        this.f16316b.setVisibility(8);
        this.f16317c.setVisibility(0);
        SpannableString spannableString = new SpannableString(C3358ac.m12517a((int) R.string.evz, Integer.valueOf(bVar.f13964b), Integer.valueOf(bVar.f13965c)));
        if (this.f16320f == null) {
            this.f16320f = new ForegroundColorSpan(Color.parseColor("#ffee00"));
        }
        spannableString.setSpan(this.f16320f, 0, String.valueOf(bVar.f13964b).length(), 33);
        this.f16319e.setText(spannableString);
    }

    public void onClick(View view) {
        String str;
        C9097a.m27146a().mo22267a((Object) new C4414af(Uri.parse("https://hotsoon.snssdk.com/hotsoon/in_app/common_live/pk_division/").buildUpon().appendQueryParameter("anchor_id", String.valueOf(this.f16321g.getOwner().getId())).appendQueryParameter("room_id", String.valueOf(this.f16321g.getId())).appendQueryParameter("is_anchor", String.valueOf(this.f16322h ? 1 : 0)).build().toString(), ""));
        C8443c a = C8443c.m25663a();
        String str2 = "medal_click";
        Object[] objArr = new Object[2];
        C8438j b = new C8438j().mo21599b("live_function");
        if (this.f16322h) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        objArr[0] = b.mo21598a(str);
        objArr[1] = Room.class;
        a.mo21607a(str2, objArr);
    }

    public void onInit(Object... objArr) {
        this.f16315a = (ImageView) this.contentView.findViewById(R.id.ba7);
        this.f16316b = (ViewGroup) this.contentView.findViewById(R.id.d_j);
        this.f16317c = (ViewGroup) this.contentView.findViewById(R.id.clh);
        this.f16318d = (TextView) this.contentView.findViewById(R.id.e26);
        this.f16319e = (TextView) this.contentView.findViewById(R.id.e01);
        this.contentView.setOnClickListener(this);
        this.f16323i = new C4991br();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            m17744a(((Integer) kVData.getData()).intValue());
        }
    }

    /* renamed from: a */
    private void m17745a(int i, int i2) {
        this.f16317c.setVisibility(8);
        this.f16316b.setVisibility(0);
        if (i2 < 100000000) {
            this.f16318d.setText(C3358ac.m12517a((int) R.string.evz, Integer.valueOf(i), Integer.valueOf(i2)));
            return;
        }
        this.f16318d.setText(String.valueOf(i));
    }

    /* renamed from: a */
    public final void mo12997a(C4874ai aiVar, long j, boolean z) {
        C5343e.m17030a(this.f16315a, aiVar.f13961l);
        if (aiVar.f13959j != null) {
            m17747a(aiVar.f13959j);
            if (this.f16322h && !((Boolean) C8946b.f24388aM.mo22117a()).booleanValue()) {
                new C9249a(this.context, 1).mo22723b(2, (CharSequence) C3358ac.m12515a((int) R.string.edq), C5688ee.f16779a).mo22718b((int) R.string.ez5).mo22729d();
                C8946b.f24388aM.mo22118a(Boolean.valueOf(true));
                C8946b.f24389aN.mo22118a(Long.valueOf(j));
            }
        } else {
            m17745a(aiVar.f13952c, aiVar.f13953d);
            if (this.f16322h) {
                if (((Boolean) C8946b.f24388aM.mo22117a()).booleanValue() && aiVar.f13960k != null && !TextUtils.isEmpty(aiVar.f13960k.f13962a) && j - ((Long) C8946b.f24389aN.mo22117a()).longValue() > 86400000) {
                    new C9249a(this.context, 1).mo22723b(2, (CharSequence) C3358ac.m12515a((int) R.string.edq), C5689ef.f16780a).mo22727c((CharSequence) aiVar.f13960k.f13962a).mo22729d();
                }
                C8946b.f24388aM.mo22118a(Boolean.valueOf(false));
            }
        }
        if (this.f16322h && z && aiVar.f13960k != null && !TextUtils.isEmpty(aiVar.f13960k.f13962a)) {
            new C9249a(this.context, 1).mo22723b(2, (CharSequence) C3358ac.m12515a((int) R.string.edq), C5690eg.f16781a).mo22727c((CharSequence) aiVar.f13960k.f13962a).mo22729d();
        }
    }
}
