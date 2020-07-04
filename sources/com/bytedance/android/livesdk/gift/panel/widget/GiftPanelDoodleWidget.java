package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0043i;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.gift.C8283t;
import com.bytedance.android.livesdk.gift.DoodleCanvasView;
import com.bytedance.android.livesdk.gift.DoodleCanvasView.C7856a;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.model.p390a.C8139f;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.Widget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class GiftPanelDoodleWidget extends Widget {

    /* renamed from: a */
    public GiftDialogViewModel f22509a;

    /* renamed from: b */
    private View f22510b;

    /* renamed from: c */
    private View f22511c;

    /* renamed from: d */
    private View f22512d;

    /* renamed from: e */
    private View f22513e;

    /* renamed from: f */
    private View f22514f;

    /* renamed from: g */
    private TextView f22515g;

    /* renamed from: h */
    private DoodleCanvasView f22516h;

    /* renamed from: i */
    private DoodleGiftView f22517i;

    public int getLayoutId() {
        return R.layout.ani;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f22509a != null) {
            this.f22509a.mo21338a((C0043i) this);
        }
    }

    public void onCreate() {
        super.onCreate();
        if (this.dataCenter != null) {
            this.f22509a = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
            if (this.f22509a != null) {
                m25153a();
                this.f22509a.f22471s.observe(this, new C8245m(this));
                this.f22509a.f22470r.observe(this, new C8246n(this));
                this.f22509a.f22472t.observe(this, new C8247o(this));
                this.f22509a.f22465m.observe(this, new C8248p(this));
            }
        }
    }

    /* renamed from: a */
    private void m25153a() {
        this.f22510b = this.contentView.findViewById(R.id.aqo);
        this.f22511c = this.contentView.findViewById(R.id.e7o);
        this.f22512d = this.contentView.findViewById(R.id.wp);
        this.f22513e = this.contentView.findViewById(R.id.xj);
        this.f22514f = this.contentView.findViewById(R.id.a_h);
        this.f22515g = (TextView) this.contentView.findViewById(R.id.d30);
        this.f22516h = (DoodleCanvasView) this.contentView.findViewById(R.id.aqr);
        this.f22517i = (DoodleGiftView) this.contentView.findViewById(R.id.abg);
        this.f22510b.setVisibility(8);
        this.f22516h.setDrawDoodleGiftView(this.f22517i);
        this.f22516h.setDoodleCanvasListener(new C7856a() {
            /* renamed from: a */
            public final void mo20592a(List<C8283t> list, int i, int i2, int i3) {
                if (GiftPanelDoodleWidget.this.f22509a != null) {
                    if (list == null || list.isEmpty()) {
                        GiftPanelDoodleWidget.this.f22509a.f22471s.postValue(null);
                        return;
                    }
                    GiftPanelDoodleWidget.this.f22509a.f22471s.postValue(new C8169b(list, i, i2, i3));
                }
            }
        });
        this.f22511c.setOnClickListener(new C8249q(this));
        this.f22512d.setOnClickListener(new C8250r(this));
        this.f22513e.setOnClickListener(new C8251s(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21357a(View view) {
        if (this.f22509a != null) {
            this.f22509a.f22471s.postValue(null);
            this.f22509a.f22469q.postValue(Boolean.valueOf(true));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21362b(View view) {
        this.f22516h.mo20579a();
        if (this.f22509a != null) {
            this.f22509a.f22471s.postValue(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21358a(C8134a aVar) {
        if (!(aVar instanceof C8139f) || !aVar.mo21262c()) {
            this.f22516h.mo20579a();
            if (this.f22509a != null) {
                this.f22509a.f22471s.postValue(null);
                this.f22510b.setVisibility(8);
                return;
            }
            return;
        }
        this.f22510b.setVisibility(0);
        C8149d r = ((C8139f) aVar).mo21277r();
        this.f22516h.mo20580a(r.f22233d, r.f22235f, r.f22231b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21360a(Boolean bool) {
        this.f22515g.setTextColor(this.context.getResources().getColor(R.color.ae4));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21361a(boolean z) {
        if (this.f22509a != null) {
            C8134a aVar = (C8134a) this.f22509a.f22470r.getValue();
            int i = 8;
            if (aVar == null) {
                this.f22510b.setVisibility(8);
            } else if (!aVar.mo21262c() || !((C9456c) C3596c.m13172a(C9456c.class)).mo23195a(aVar.mo21274o())) {
                this.f22510b.setVisibility(8);
            } else {
                View view = this.f22510b;
                if (!z) {
                    i = 0;
                }
                view.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo21363c(View view) {
        if (this.f22516h.mo20582c()) {
            this.f22516h.mo20581b();
            if (this.f22509a != null) {
                if (C6311g.m19573a(this.f22516h.getMoveActions())) {
                    this.f22509a.f22471s.postValue(null);
                } else {
                    this.f22509a.f22471s.postValue(new C8169b(this.f22516h.getMoveActions(), this.f22516h.getWidth(), this.f22516h.getHeight(), this.f22516h.getTotalCostDiamondCount()));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21359a(C8169b bVar) {
        if (bVar == null || bVar.f22362a.isEmpty()) {
            this.f22511c.setVisibility(8);
            this.f22512d.setVisibility(8);
            this.f22515g.setVisibility(8);
            this.f22514f.setVisibility(0);
            return;
        }
        this.f22511c.setVisibility(0);
        this.f22512d.setVisibility(0);
        this.f22515g.setVisibility(0);
        this.f22514f.setVisibility(8);
        if (bVar.f22362a.size() < ((Integer) C5864b.f17250E.mo10240a()).intValue()) {
            this.f22515g.setText(C9078p.m27100a(this.context.getString(R.string.em2), C5864b.f17250E.mo10240a()));
            return;
        }
        this.f22515g.setTextColor(this.context.getResources().getColor(R.color.aft));
        String a = C9078p.m27100a(this.context.getString(R.string.em4), Integer.valueOf(bVar.f22365d));
        String valueOf = String.valueOf(bVar.f22365d);
        int indexOf = a.indexOf(valueOf);
        int length = valueOf.length() + indexOf;
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(new ForegroundColorSpan(this.context.getResources().getColor(R.color.ag2)), indexOf, length, 18);
        this.f22515g.setText(spannableString);
    }
}
