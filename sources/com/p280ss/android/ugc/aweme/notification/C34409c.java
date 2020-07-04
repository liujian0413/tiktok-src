package com.p280ss.android.ugc.aweme.notification;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.ILegacyService;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34306a;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.view.C34641a.C34642a;
import com.p280ss.android.ugc.aweme.notification.widget.BadgeView;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.c */
public final class C34409c implements C34423d {

    /* renamed from: a */
    private C34410a f89837a;

    /* renamed from: b */
    private C34406b f89838b = new C34406b();

    /* renamed from: com.ss.android.ugc.aweme.notification.c$a */
    static class C34410a extends C1262a<C34413a> {

        /* renamed from: a */
        public final List<C34306a> f89839a;

        /* renamed from: b */
        private final Context f89840b;

        /* renamed from: c */
        private final C34406b f89841c;

        /* renamed from: com.ss.android.ugc.aweme.notification.c$a$a */
        static class C34413a extends C1293v {

            /* renamed from: a */
            public TextView f89848a;

            /* renamed from: b */
            public ImageView f89849b;

            /* renamed from: c */
            public ConstraintLayout f89850c;

            /* renamed from: d */
            public final BadgeView f89851d;

            /* renamed from: e */
            private TextView f89852e;

            C34413a(View view) {
                super(view);
                this.f89849b = (ImageView) view.findViewById(R.id.eq);
                this.f89848a = (TextView) view.findViewById(R.id.er);
                this.f89852e = (TextView) view.findViewById(R.id.e47);
                this.f89850c = (ConstraintLayout) view.findViewById(R.id.bw7);
                this.f89851d = new BadgeView(view.getContext());
                this.f89851d.setTargetView(this.f89852e);
                this.f89851d.mo87943a(35, view.getContext().getResources().getColor(R.color.a1d));
                this.f89851d.setBadgeGravity(17);
                if (this.f89849b != null) {
                    C34626j.m111880c(this.f89849b);
                }
            }
        }

        /* renamed from: c */
        private static String m111302c(int i) {
            switch (i) {
                case 0:
                    return "fans";
                case 1:
                    return "like";
                case 2:
                    return "at";
                case 3:
                    return "comment";
                default:
                    switch (i) {
                        case 12:
                            return "commentandat";
                        case 13:
                            return "story";
                        default:
                            return null;
                    }
            }
        }

        public final int getItemCount() {
            return this.f89839a.size();
        }

        /* renamed from: a */
        public final C34306a mo87732a(int i) {
            return (C34306a) this.f89839a.get(i);
        }

        /* renamed from: b */
        private static Drawable m111301b(int i) {
            int i2;
            switch (i) {
                case 0:
                    return C6399b.m19921a().getResources().getDrawable(R.drawable.ax6);
                case 1:
                    return C6399b.m19921a().getResources().getDrawable(R.drawable.ax8);
                case 2:
                    return C6399b.m19921a().getResources().getDrawable(R.drawable.axa);
                case 3:
                    Resources resources = C6399b.m19921a().getResources();
                    if (C6399b.m19944t()) {
                        i2 = R.drawable.ax5;
                    } else {
                        i2 = R.drawable.ax4;
                    }
                    return resources.getDrawable(i2);
                default:
                    switch (i) {
                        case 12:
                            return C6399b.m19921a().getResources().getDrawable(R.drawable.ax7);
                        case 13:
                            return C6399b.m19921a().getResources().getDrawable(R.drawable.axb);
                        default:
                            return null;
                    }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C34413a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C34413a(LayoutInflater.from(this.f89840b).inflate(R.layout.fo, viewGroup, false));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(final C34413a aVar, int i) {
            final C34306a aVar2 = (C34306a) this.f89839a.get(i);
            aVar.f89849b.setImageDrawable(m111301b(aVar2.f89447c));
            aVar.f89848a.setText(aVar2.f89448d);
            aVar.f89851d.setBadgeCount(aVar2.f89445a);
            aVar.f89849b.setContentDescription(aVar2.f89448d);
            aVar.f89849b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C34410a.this.mo87733a(view, aVar2, aVar.getAdapterPosition());
                }
            });
            aVar.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C34410a.this.mo87733a(view, aVar2, aVar.getAdapterPosition());
                }
            });
            aVar.itemView.setContentDescription(aVar2.f89448d);
            if (C6399b.m19944t()) {
                aVar.f89850c.setBackground(this.f89840b.getResources().getDrawable(R.drawable.ug));
                LayoutParams layoutParams = (LayoutParams) aVar.f89849b.getLayoutParams();
                layoutParams.topMargin = (int) C9738o.m28708b(aVar.f89849b.getContext(), 22.0f);
                aVar.f89849b.setLayoutParams(layoutParams);
            }
            m111300a(m111302c(aVar2.f89447c), "show", aVar2.f89445a);
        }

        C34410a(Context context, List<C34306a> list, C34406b bVar) {
            this.f89840b = context;
            this.f89839a = list;
            this.f89841c = bVar;
        }

        /* renamed from: a */
        private static void m111300a(String str, String str2, int i) {
            if (i > 0 && !TextUtils.isEmpty(str)) {
                C6907h.m21524a("notification_notice", (Map) C22984d.m75611a().mo59973a("notice_type", "number_dot").mo59973a("account_type", str).mo59973a("action_type", str2).mo59970a("show_cnt", i).f60753a);
            }
        }

        /* renamed from: a */
        public final void mo87733a(View view, C34306a aVar, int i) {
            if (!C27326a.m89578a(view)) {
                NotificationDetailActivity.m111097a(this.f89840b, aVar.f89447c, aVar.f89445a);
                m111300a(m111302c(aVar.f89447c), "click", aVar.f89445a);
                if (TextUtils.equals(m111302c(aVar.f89447c), "like")) {
                    ((ILegacyService) ServiceManager.get().getService(ILegacyService.class)).getUgAllService().mo57938b(aVar.f89445a);
                }
                if (this.f89841c != null) {
                    this.f89841c.mo87699a(1, i);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c$b */
    static class C34414b extends GridLayoutManager {

        /* renamed from: K */
        public boolean f89853K = true;

        /* renamed from: e */
        public final boolean mo5438e() {
            if (!this.f89853K || !super.mo5438e()) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo5441f() {
            if (!this.f89853K || !super.mo5441f()) {
                return false;
            }
            return true;
        }

        C34414b(Context context, int i) {
            super(context, 4);
        }
    }

    /* renamed from: a */
    public final void mo87726a() {
        if (this.f89838b != null) {
            this.f89838b.mo87698a();
        }
        this.f89838b = null;
    }

    /* renamed from: b */
    public final void mo87731b() {
        if (this.f89837a != null) {
            this.f89837a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo87727a(int i) {
        if (this.f89837a != null && i < this.f89837a.getItemCount() && i >= 0) {
            this.f89837a.mo87732a(i).mo87141a();
            this.f89837a.notifyItemChanged(i);
        }
    }

    C34409c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C34306a(0, 0, context.getString(R.string.b94)));
        if (C6399b.m19944t() && !C27688b.m90837a()) {
            arrayList.add(new C34306a(1, 1, context.getString(R.string.cp8)));
            arrayList.add(new C34306a(2, 2, context.getString(R.string.cp4)));
            arrayList.add(new C34306a(3, 3, context.getString(R.string.cp5)));
        } else if (C6399b.m19945u()) {
            arrayList.add(new C34306a(1, 1, context.getString(R.string.biq)));
            arrayList.add(new C34306a(2, 2, context.getString(R.string.bno)));
            arrayList.add(new C34306a(3, 3, context.getString(R.string.bhx)));
        }
        this.f89837a = new C34410a(context, arrayList, this.f89838b);
    }

    /* renamed from: a */
    public final void mo87730a(List<C34642a> list) {
        if (this.f89837a != null && list != null && list.size() != 0) {
            int i = 0;
            for (C34642a aVar : list) {
                int i2 = i + 1;
                C34306a aVar2 = (C34306a) this.f89837a.f89839a.get(i);
                aVar2.f89445a = aVar.f90398b;
                i = i2;
            }
            this.f89837a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo87728a(int i, int i2) {
        if (this.f89837a != null) {
            for (C34306a aVar : this.f89837a.f89839a) {
                if (i == aVar.f89447c) {
                    aVar.f89445a = i2;
                    this.f89837a.notifyItemChanged(aVar.f89446b);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87729a(RecyclerView recyclerView, Context context) {
        C34414b bVar = new C34414b(context, 4);
        bVar.f89853K = false;
        recyclerView.setLayoutManager(bVar);
        this.f89838b.f89818a = this;
        recyclerView.setAdapter(this.f89837a);
    }
}
