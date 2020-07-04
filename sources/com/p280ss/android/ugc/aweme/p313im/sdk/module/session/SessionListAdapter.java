package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31256a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1336a.C31494a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31511a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.ChatSession;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListAdapter */
public class SessionListAdapter extends BaseAdapter<C7102a> implements C31494a {

    /* renamed from: b */
    private static final int f82439b = ((int) C9738o.m28708b(C6399b.m19921a(), 8.0f));

    /* renamed from: a */
    public boolean f82440a;

    /* renamed from: c */
    private View f82441c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.SessionListAdapter$HeaderViewHolder */
    public class HeaderViewHolder extends C1293v {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    /* renamed from: f */
    private int m102361f() {
        if (this.f82441c == null) {
            return 0;
        }
        return 1;
    }

    public SessionListAdapter() {
        mo66506d(R.string.bmh);
    }

    /* renamed from: c */
    public final int mo60557c() {
        return super.mo60557c() + m102361f();
    }

    /* renamed from: b */
    private boolean m102359b(int i) {
        if (i < m102361f()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m102360c(int i) {
        notifyItemChanged(i + m102361f());
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (m102359b(i)) {
            return C34943c.f91127w;
        }
        return super.mo58029a(i);
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof SessionListViewHolder) {
            ((SessionListViewHolder) vVar).mo82173a();
        }
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof SessionListViewHolder) {
            ((SessionListViewHolder) vVar).mo82175b();
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        int i2;
        int f = i - m102361f();
        ((SessionListViewHolder) vVar).mo82172a((C7102a) this.f67539l.get(f), f);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) vVar.itemView.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin;
        if (f == 0) {
            i2 = f82439b;
        } else {
            i2 = 0;
        }
        marginLayoutParams.setMargins(i3, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 200 && this.f82441c != null) {
            return new HeaderViewHolder(this.f82441c);
        }
        if (C6956a.m21632a().mo18009f().showNewStyle()) {
            return new SessionListNewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a33, viewGroup, false), this);
        }
        return new SessionListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2z, viewGroup, false), this);
    }

    /* renamed from: a */
    public final void mo82171a(Context context, int i, C7102a aVar, int i2) {
        if (i2 != 0) {
            if (aVar.f19949m == null) {
                aVar.f19949m = new HashMap<>();
            }
            aVar.f19949m.put("position", String.valueOf(i));
            boolean z = true;
            if (i2 == 2 && (aVar instanceof ChatSession)) {
                C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(aVar.bf_())));
                z = false;
            }
            if (aVar.f19952p != null) {
                aVar.f19952p.mo18117a(context, aVar, i2);
            }
            if (aVar.mo18115b() == 20 && C31256a.m101859a(aVar.bf_())) {
                z = false;
            }
            if (z && !(aVar instanceof C31511a)) {
                aVar.f19946j = 0;
            }
            m102360c(i);
        } else if (aVar.f19952p != null) {
            aVar.f19952p.mo18117a(context, aVar, 0);
        }
    }
}
