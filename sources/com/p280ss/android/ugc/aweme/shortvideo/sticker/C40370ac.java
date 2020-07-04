package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ac */
public final class C40370ac implements OnClickListener {

    /* renamed from: a */
    public AvatarImageView f104946a;

    /* renamed from: b */
    public DmtTextView f104947b;

    /* renamed from: c */
    public DmtTextView f104948c;

    /* renamed from: d */
    public Context f104949d;

    /* renamed from: e */
    private LinearLayout f104950e;

    /* renamed from: f */
    private HashMap<String, C22200c> f104951f = new HashMap<>();

    /* renamed from: g */
    private Effect f104952g;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    C40370ac(LinearLayout linearLayout, Context context) {
        this.f104950e = linearLayout;
        this.f104949d = context;
        this.f104946a = (AvatarImageView) linearLayout.findViewById(R.id.bjw);
        this.f104947b = (DmtTextView) linearLayout.findViewById(R.id.bjx);
        this.f104948c = (DmtTextView) linearLayout.findViewById(R.id.bjv);
        this.f104950e.setOnClickListener(this);
        this.f104950e.post(new Runnable() {
            public final void run() {
                C40370ac.this.f104948c.measure(MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
                int i = C40370ac.this.f104946a.getLayoutParams().width;
                C40370ac.this.f104947b.setMaxWidth((int) (((float) ((C23482j.m77098b(C40370ac.this.f104949d) - i) - C40370ac.this.f104948c.getMeasuredWidth())) - C9738o.m28708b(C40370ac.this.f104949d, 106.0f)));
            }
        });
    }

    /* renamed from: a */
    public final void mo100368a(Effect effect, C40971v vVar) {
        if (effect != null) {
            this.f104952g = effect;
        }
        if (C40496bh.m129452c(effect)) {
            C1592h.m7853a((Callable<TResult>) new C40372ad<TResult>(effect)).mo6876a((C1591g<TResult, TContinuationResult>) new C40373ae<TResult,TContinuationResult>(this, effect, null), C1592h.f5958b);
        } else {
            this.f104950e.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo100367a(Effect effect, C40971v vVar, C1592h hVar) throws Exception {
        C22200c cVar;
        if (hVar.mo6887c() || hVar.mo6889d()) {
            cVar = (C22200c) this.f104951f.get(effect.getDesignerId());
        } else {
            cVar = (C22200c) hVar.mo6890e();
        }
        if (vVar != null && !vVar.mo101268a()) {
            return null;
        }
        if (effect.equals(this.f104952g)) {
            if (cVar == null) {
                this.f104950e.setVisibility(8);
                return null;
            }
            this.f104950e.setVisibility(0);
            C23323e.m76524b(this.f104946a, cVar.mo58562e());
            this.f104947b.setText(cVar.mo58564g());
        }
        this.f104951f.put(effect.getDesignerId(), cVar);
        return null;
    }
}
