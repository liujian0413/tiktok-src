package com.bytedance.android.livesdk.gift.effect.doodle.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.gift.effect.doodle.C7996n;
import com.bytedance.android.livesdk.gift.effect.doodle.C7997o;
import com.bytedance.android.livesdk.gift.effect.doodle.DoodleTemplateViewHolder;
import com.bytedance.android.livesdk.gift.model.DoodleTemplate;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class DoodleTemplateAdapter extends C1262a<DoodleTemplateViewHolder> implements C7996n {

    /* renamed from: a */
    public C7997o f21648a;

    /* renamed from: b */
    public DoodleTemplate f21649b;

    /* renamed from: c */
    private Context f21650c;

    /* renamed from: d */
    private LayoutInflater f21651d;

    /* renamed from: e */
    private List<DoodleTemplate> f21652e = new ArrayList();

    public int getItemCount() {
        return this.f21652e.size();
    }

    /* renamed from: a */
    public final void mo20882a() {
        if (this.f21649b != null) {
            this.f21648a.mo20851a(this.f21649b, false);
        }
        this.f21649b = null;
    }

    public DoodleTemplateAdapter(Context context) {
        this.f21650c = context;
        this.f21651d = LayoutInflater.from(context);
    }

    /* renamed from: a */
    private void m24494a(DoodleTemplate doodleTemplate) {
        if (!doodleTemplate.isSelected()) {
            if (this.f21649b != null) {
                this.f21648a.mo20851a(this.f21649b, false);
            }
            this.f21649b = doodleTemplate;
            this.f21648a.mo20851a(doodleTemplate, true);
        }
    }

    /* renamed from: a */
    public final int mo20881a(long j) {
        for (int i = 0; i < this.f21652e.size(); i++) {
            if (this.f21652e.get(i) != null && ((DoodleTemplate) this.f21652e.get(i)).getId() == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo20883a(List<DoodleTemplate> list) {
        if (list != null && !list.isEmpty()) {
            this.f21652e.clear();
            this.f21652e.addAll(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public DoodleTemplateViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DoodleTemplateViewHolder(this.f21651d.inflate(R.layout.arp, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(DoodleTemplateViewHolder doodleTemplateViewHolder, int i) {
        DoodleTemplate doodleTemplate = (DoodleTemplate) this.f21652e.get(i);
        if (doodleTemplate.f22200id != 0 && doodleTemplate.image != null && doodleTemplate.image.getUrls() != null && !doodleTemplate.image.getUrls().isEmpty()) {
            doodleTemplateViewHolder.mo20870a(doodleTemplate);
            doodleTemplateViewHolder.f21637a = this;
            doodleTemplateViewHolder.mo20871a(doodleTemplate.isSelected());
        }
    }

    /* renamed from: a */
    public final void mo20877a(C1293v vVar, Object obj) {
        if ((vVar instanceof DoodleTemplateViewHolder) && (obj instanceof DoodleTemplate)) {
            m24494a((DoodleTemplate) obj);
        }
    }
}
