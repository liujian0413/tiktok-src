package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.AbsRelationListAdapter.ViewHolder;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter */
public class IndexerListAdapter extends AbsRelationListAdapter implements SectionIndexer {

    /* renamed from: m */
    public SectionIndexer f82980m;

    /* renamed from: n */
    private C31715a f82981n = new C31715a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter$HeaderViewHolder */
    public class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter$a */
    public static final class C31715a {

        /* renamed from: a */
        public int f82983a = -1;

        /* renamed from: b */
        public boolean f82984b;

        /* renamed from: c */
        public boolean f82985c;

        /* renamed from: d */
        public String f82986d;

        /* renamed from: a */
        public final void mo82506a() {
            this.f82983a = -1;
        }
    }

    public int getItemCount() {
        if (this.f82948c != null) {
            return this.f82948c.size() + mo82485c();
        }
        return mo82485c();
    }

    public Object[] getSections() {
        if (this.f82980m != null) {
            return this.f82980m.getSections();
        }
        return new String[]{" "};
    }

    /* renamed from: a */
    public final void mo82501a(SectionIndexer sectionIndexer) {
        this.f82980m = sectionIndexer;
        this.f82981n.mo82506a();
    }

    public int getPositionForSection(int i) {
        if (this.f82980m != null) {
            return this.f82980m.getPositionForSection(i);
        }
        return -1;
    }

    public int getSectionForPosition(int i) {
        if (this.f82980m != null) {
            return this.f82980m.getSectionForPosition(i);
        }
        return -1;
    }

    public int getItemViewType(int i) {
        if (mo82483b(i)) {
            return 1;
        }
        return super.getItemViewType(i - mo82485c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo82380a(IMContact iMContact) {
        IMUser a = C6961d.m21661a(iMContact);
        if (a == null) {
            return null;
        }
        if (TextUtils.isEmpty(a.getRemarkName()) || TextUtils.isEmpty(a.getNickName())) {
            return a.getSignature();
        }
        return C6399b.m19921a().getString(R.string.bnj, new Object[]{a.getNickName()});
    }

    /* renamed from: c */
    public final C31715a mo82502c(int i) {
        if (this.f82981n.f82983a == i) {
            return this.f82981n;
        }
        this.f82981n.f82983a = i;
        int sectionForPosition = getSectionForPosition(i);
        boolean z = false;
        if (sectionForPosition == -1 || getPositionForSection(sectionForPosition) != i) {
            this.f82981n.f82984b = false;
            this.f82981n.f82986d = null;
        } else {
            this.f82981n.f82984b = true;
            this.f82981n.f82986d = (String) getSections()[sectionForPosition];
        }
        C31715a aVar = this.f82981n;
        if (getPositionForSection(sectionForPosition + 1) - 1 == i) {
            z = true;
        }
        aVar.f82985c = z;
        return this.f82981n;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new HeaderViewHolder(this.f82952g);
    }

    /* renamed from: a */
    public final void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (!mo82483b(i)) {
            int c = i - mo82485c();
            viewHolder.mo80309a((IMContact) this.f82948c.get(c), c);
        }
    }
}
