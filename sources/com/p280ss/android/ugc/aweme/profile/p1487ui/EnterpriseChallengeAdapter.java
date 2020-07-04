package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseChallengeAdapter */
public class EnterpriseChallengeAdapter extends C1262a<C36145a> {

    /* renamed from: a */
    private List<Challenge> f94604a;

    /* renamed from: b */
    private Activity f94605b;

    /* renamed from: c */
    private C36688z f94606c;

    /* renamed from: d */
    private SparseBooleanArray f94607d = new SparseBooleanArray();

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseChallengeAdapter$a */
    static class C36145a extends C1293v {

        /* renamed from: a */
        TextView f94608a;

        /* renamed from: b */
        TextView f94609b;

        /* renamed from: c */
        View f94610c;

        C36145a(View view) {
            super(view);
            this.f94610c = view.findViewById(R.id.ui);
            this.f94608a = (TextView) view.findViewById(R.id.up);
            this.f94609b = (TextView) view.findViewById(R.id.uk);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo91989a(Activity activity, Challenge challenge, C36688z zVar) {
            int i;
            Context context = this.f94608a.getContext();
            TextView textView = this.f94608a;
            StringBuilder sb = new StringBuilder("#");
            sb.append(challenge.getChallengeName());
            textView.setText(sb.toString());
            if (challenge.getViewCount() >= 0) {
                i = R.string.zb;
            } else {
                i = R.string.b1f;
            }
            this.f94609b.setText(context.getString(i, new Object[]{C30537o.m99738a(challenge.getDisplayCount())}));
            C43081e.m136670a(this.f94610c);
            this.f94610c.setOnClickListener(new C36687y(zVar, context, challenge, activity));
        }

        /* renamed from: a */
        static final /* synthetic */ void m116595a(C36688z zVar, Context context, Challenge challenge, Activity activity, View view) {
            zVar.mo91998b(context, challenge);
            zVar.mo91996a(activity, challenge);
        }
    }

    public int getItemCount() {
        if (this.f94604a == null) {
            return 0;
        }
        return this.f94604a.size();
    }

    /* renamed from: a */
    public final void mo91987a() {
        if (this.f94604a != null) {
            for (int i = 0; i < this.f94604a.size(); i++) {
                this.f94607d.put(i, false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onViewDetachedFromWindow(C36145a aVar) {
        super.onViewDetachedFromWindow(aVar);
    }

    /* renamed from: a */
    public final void mo91988a(int i) {
        this.f94607d.put(i, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onViewAttachedToWindow(C36145a aVar) {
        super.onViewAttachedToWindow(aVar);
        if (aVar != null && this.f94605b != null) {
            int i = 0;
            if (this.f94604a != null) {
                i = this.f94604a.size();
            }
            int adapterPosition = aVar.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < i) {
                Challenge challenge = (Challenge) this.f94604a.get(adapterPosition);
                if (challenge != null && !this.f94607d.get(adapterPosition)) {
                    this.f94606c.mo91997a((Context) this.f94605b, challenge);
                    this.f94607d.put(adapterPosition, true);
                }
            }
        }
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m116589a(viewGroup, i);
    }

    /* renamed from: a */
    private static C36145a m116589a(ViewGroup viewGroup, int i) {
        return new C36145a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v2, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C36145a aVar, int i) {
        if (!C6307b.m19566a((Collection<T>) this.f94604a) && aVar != null && this.f94605b != null && this.f94604a.size() > i && this.f94606c != null) {
            Challenge challenge = (Challenge) this.f94604a.get(i);
            if (challenge != null) {
                aVar.mo91989a(this.f94605b, challenge, this.f94606c);
            }
        }
    }

    public EnterpriseChallengeAdapter(Activity activity, List<Challenge> list, C36688z zVar) {
        this.f94605b = activity;
        this.f94604a = list;
        this.f94606c = zVar;
        mo91987a();
    }
}
