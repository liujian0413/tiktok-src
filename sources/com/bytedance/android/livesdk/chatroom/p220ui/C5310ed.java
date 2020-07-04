package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.event.C4455y;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ed */
public final class C5310ed extends Dialog implements OnClickListener {

    /* renamed from: a */
    private final Room f15540a;

    /* renamed from: b */
    private String f15541b;

    /* renamed from: c */
    private List<Button> f15542c = new ArrayList();

    /* renamed from: d */
    private LinearLayout f15543d;

    /* renamed from: a */
    private void m16979a() {
        if (this.f15540a.isMultiPullDataValid()) {
            for (Quality quality : this.f15540a.getStreamUrl().qualityList) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.atc, null);
                LayoutParams layoutParams = new LayoutParams(-1, 0);
                layoutParams.weight = 1.0f;
                inflate.setLayoutParams(layoutParams);
                Button button = (Button) inflate.findViewById(R.id.pk);
                button.setText(quality.name);
                button.setTag(R.id.dp8, quality);
                button.setOnClickListener(this);
                this.f15542c.add(button);
                this.f15543d.addView(inflate);
                if (quality.name.equals(this.f15541b)) {
                    m16980a(button, quality.name);
                }
                if (this.f15542c.size() > 5) {
                    break;
                }
            }
            return;
        }
        for (String str : this.f15540a.getStreamUrl().mo23054e()) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.atc, null);
            LayoutParams layoutParams2 = new LayoutParams(-1, 0);
            layoutParams2.weight = 1.0f;
            inflate2.setLayoutParams(layoutParams2);
            Button button2 = (Button) inflate2.findViewById(R.id.pk);
            button2.setText(str);
            button2.setTag(R.id.dp9, str);
            button2.setTag(R.id.dpa, this.f15540a.buildPullUrl(str));
            button2.setTag(R.id.dp_, this.f15540a.getSdkParams(str));
            button2.setOnClickListener(this);
            this.f15542c.add(button2);
            this.f15543d.addView(inflate2);
            if (str.equals(this.f15541b)) {
                m16980a(button2, str);
            }
            if (this.f15542c.size() > 5) {
                break;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ap6, null);
        setContentView(inflate);
        this.f15543d = (LinearLayout) inflate.findViewById(R.id.bme);
        if (getWindow() != null) {
            if (getContext().getResources().getConfiguration().orientation == 2) {
                getWindow().setLayout(C3358ac.m12510a(376.0f), C3358ac.m12510a(104.0f));
                getWindow().setGravity(8388693);
            } else {
                getWindow().setLayout(-1, (int) C9738o.m28708b(getContext(), 80.0f));
                getWindow().setGravity(80);
            }
        }
        m16979a();
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.pk) {
            HashMap hashMap = new HashMap();
            if (view.getTag(R.id.dp8) != null) {
                m16980a((Button) view, ((Quality) view.getTag(R.id.dp8)).name);
                C9097a.m27146a().mo22267a((Object) new C4455y((String) view.getTag(R.id.dp9), (String) view.getTag(R.id.dpa), (String) view.getTag(R.id.dp_), (Quality) view.getTag(R.id.dp8)));
                hashMap.put("definition", ((Quality) view.getTag(R.id.dp8)).name);
            } else {
                m16980a((Button) view, (String) view.getTag(R.id.dp9));
                C9097a.m27146a().mo22267a((Object) new C4455y((String) view.getTag(R.id.dp9), (String) view.getTag(R.id.dpa), (String) view.getTag(R.id.dp_), null));
                hashMap.put("definition", (String) view.getTag(R.id.dp9));
            }
            C8443c.m25663a().mo21606a("definition_setting", hashMap, Room.class, new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("other"));
            dismiss();
        }
    }

    public C5310ed(Context context, Room room) {
        super(context, R.style.ze);
        this.f15540a = room;
        if (room.isMultiPullDataValid()) {
            this.f15541b = room.getStreamUrl().mo23056g();
        } else {
            this.f15541b = room.getStreamUrl().f25619r;
        }
    }

    /* renamed from: a */
    private void m16980a(Button button, String str) {
        this.f15541b = str;
        for (Button button2 : this.f15542c) {
            if (C3358ac.m12529f()) {
                button2.setBackgroundResource(R.drawable.bse);
            }
            button2.setTextColor(getContext().getResources().getColor(R.color.aer));
        }
        if (C3358ac.m12529f()) {
            button.setBackgroundResource(R.drawable.bsf);
            button.setTextColor(getContext().getResources().getColor(R.color.az3));
            return;
        }
        button.setTextColor(getContext().getResources().getColor(R.color.aq4));
    }
}
