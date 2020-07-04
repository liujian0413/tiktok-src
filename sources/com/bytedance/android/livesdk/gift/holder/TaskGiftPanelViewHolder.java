package com.bytedance.android.livesdk.gift.holder;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.C8289y;
import com.bytedance.android.livesdk.gift.model.p390a.C8143j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class TaskGiftPanelViewHolder extends BaseGiftPanelViewHolder<C8143j> {

    /* renamed from: n */
    private final TextView f22056n;

    public TaskGiftPanelViewHolder(View view) {
        super(view);
        this.f22056n = (TextView) view.findViewById(R.id.dv5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21167a(C8143j jVar) {
        long j;
        super.mo21167a(jVar);
        if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            j = C8289y.m25347a().mo21445b();
        } else {
            j = 0;
        }
        this.f22056n.setText(C3358ac.m12517a((int) R.string.et6, Long.valueOf(j)));
        this.f22056n.setVisibility(0);
        this.f22029c.setVisibility(8);
        this.f22039i.setVisibility(4);
        if (j <= 0) {
            jVar.f22204b = false;
            this.f22038h.setAlpha(0.32f);
            this.f22030d.setBackgroundResource(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21170a(C8143j jVar, List<Object> list) {
        long j;
        Bundle bundle = (Bundle) list.get(0);
        if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            j = C8289y.m25347a().mo21445b();
        } else {
            j = 0;
        }
        for (String str : bundle.keySet()) {
            char c = 65535;
            if (str.hashCode() == 1611446874 && str.equals("key_task_gift_count")) {
                c = 0;
            }
            if (c == 0) {
                this.f22056n.setText(C3358ac.m12517a((int) R.string.et6, Long.valueOf(j)));
                mo21168a(jVar.f22204b);
                if (j <= 0) {
                    jVar.f22204b = false;
                    this.f22038h.setAlpha(0.32f);
                    this.f22030d.setBackgroundResource(0);
                }
            }
        }
    }
}
