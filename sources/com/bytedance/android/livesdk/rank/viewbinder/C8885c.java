package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3409v;
import com.bytedance.android.livesdk.chatroom.event.C4434d;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.rank.model.C8854c;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.p420b.C8819c;
import com.bytedance.android.livesdk.rank.view.C8864e.C8868a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import p1886me.drakeet.multitype.C48226c;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.c */
public final class C8885c extends C48226c<C8854c, C8886a> {

    /* renamed from: a */
    private C8852a f24202a;

    /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.c$a */
    static class C8886a extends C1293v {

        /* renamed from: a */
        private TextView f24203a;

        /* renamed from: b */
        private TextView f24204b;

        /* renamed from: c */
        private View f24205c;

        /* renamed from: d */
        private ImageView f24206d;

        /* renamed from: e */
        private ImageView f24207e;

        /* renamed from: f */
        private TextView f24208f;

        /* renamed from: g */
        private View f24209g;

        /* renamed from: h */
        private ImageView f24210h;

        /* renamed from: i */
        private ImageView f24211i;

        /* renamed from: j */
        private TextView f24212j;

        /* renamed from: k */
        private View f24213k;

        /* renamed from: l */
        private ImageView f24214l;

        /* renamed from: m */
        private ImageView f24215m;

        /* renamed from: n */
        private TextView f24216n;

        /* renamed from: o */
        private int f24217o;

        /* renamed from: p */
        private List<C8857f> f24218p;

        /* renamed from: q */
        private C8868a f24219q;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo21975a(View view) {
            if (this.f24218p != null && this.f24218p.size() >= 3) {
                m26597a((C8857f) this.f24218p.get(2));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ void mo21977b(View view) {
            if (this.f24218p != null && this.f24218p.size() >= 3) {
                m26597a((C8857f) this.f24218p.get(1));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final /* synthetic */ void mo21978c(View view) {
            if (this.f24218p != null && this.f24218p.size() >= 3) {
                m26597a((C8857f) this.f24218p.get(0));
            }
        }

        /* renamed from: a */
        private void m26597a(C8857f fVar) {
            long[] a;
            User user = fVar.f24097a;
            if (user != null) {
                String str = "";
                if (this.f24217o == 1) {
                    str = "hourly_rank_last";
                } else if (this.f24217o == 2) {
                    str = "regional_rank_last";
                }
                String str2 = str;
                C9097a a2 = C9097a.m27146a();
                long a3 = fVar.mo21920a();
                if (this.f24219q == null) {
                    a = new long[0];
                } else {
                    a = this.f24219q.mo21959a();
                }
                C4434d dVar = new C4434d(user, a3, a, fVar.f24099c, str2);
                a2.mo22267a((Object) dVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final /* synthetic */ void mo21979d(View view) {
            C8819c cVar = new C8819c();
            cVar.f23967b = true;
            switch (this.f24217o) {
                case 1:
                    cVar.f23966a = 2;
                    break;
                case 2:
                    cVar.f23966a = 3;
                    break;
            }
            C9097a.m27146a().mo22267a((Object) cVar);
        }

        /* renamed from: a */
        public final void mo21976a(C8854c cVar) {
            if (cVar != null) {
                this.f24218p = cVar.f24091a;
                if (this.f24218p != null && this.f24218p.size() >= 3) {
                    String str = cVar.f24092b;
                    if (str == null || str.isEmpty()) {
                        this.f24203a.setVisibility(8);
                        this.f24204b.setVisibility(8);
                    } else {
                        this.f24203a.setText(this.itemView.getContext().getString(R.string.eoq, new Object[]{str}));
                        this.f24204b.setText(str);
                    }
                    this.f24217o = cVar.f24093c;
                    if (this.f24217o != 2) {
                        this.f24205c.setBackgroundResource(R.drawable.cdu);
                        this.f24209g.setBackgroundResource(R.drawable.cdv);
                        this.f24213k.setBackgroundResource(R.drawable.cdw);
                    } else {
                        this.f24205c.setBackgroundResource(R.drawable.cdz);
                        this.f24209g.setBackgroundResource(R.drawable.ce0);
                        this.f24213k.setBackgroundResource(R.drawable.ce1);
                    }
                    m26598a((C8857f) this.f24218p.get(0), this.f24206d, this.f24207e, this.f24208f);
                    m26598a((C8857f) this.f24218p.get(1), this.f24210h, this.f24211i, this.f24212j);
                    m26598a((C8857f) this.f24218p.get(2), this.f24214l, this.f24215m, this.f24216n);
                }
            }
        }

        C8886a(View view, C8868a aVar) {
            super(view);
            this.f24219q = aVar;
            this.f24203a = (TextView) view.findViewById(R.id.bg3);
            this.f24204b = (TextView) view.findViewById(R.id.bg4);
            this.f24205c = view.findViewById(R.id.c4h);
            this.f24206d = (ImageView) view.findViewById(R.id.e8t);
            this.f24207e = (ImageView) view.findViewById(R.id.b66);
            this.f24208f = (TextView) view.findViewById(R.id.e9q);
            this.f24209g = view.findViewById(R.id.c4i);
            this.f24210h = (ImageView) view.findViewById(R.id.e8u);
            this.f24211i = (ImageView) view.findViewById(R.id.b67);
            this.f24212j = (TextView) view.findViewById(R.id.e9r);
            this.f24213k = view.findViewById(R.id.c4j);
            this.f24214l = (ImageView) view.findViewById(R.id.e8v);
            this.f24215m = (ImageView) view.findViewById(R.id.b68);
            this.f24216n = (TextView) view.findViewById(R.id.e9s);
            this.f24204b.setOnClickListener(new C8888e(this));
            this.f24206d.setOnClickListener(new C8889f(this));
            this.f24210h.setOnClickListener(new C8890g(this));
            this.f24214l.setOnClickListener(new C8891h(this));
        }

        /* renamed from: a */
        private static void m26598a(C8857f fVar, ImageView imageView, ImageView imageView2, TextView textView) {
            ImageModel imageModel;
            String str;
            if (fVar != null && imageView != null && imageView2 != null && textView != null) {
                User user = fVar.f24097a;
                if (user != null) {
                    imageModel = user.getAvatarThumb();
                } else {
                    imageModel = null;
                }
                C5343e.m17045b(imageView, imageModel, imageView.getWidth(), imageView.getHeight(), R.drawable.c4_);
                if (user != null) {
                    str = user.getNickName();
                } else {
                    str = "";
                }
                textView.setText(str);
                if (fVar.mo21920a() > 0) {
                    imageView2.setImageResource(R.drawable.cey);
                    imageView2.setVisibility(0);
                    return;
                }
                imageView2.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public long[] mo21974a() {
        if ((!((Boolean) LiveSettingKeys.ENABLE_SLIDE_FROM_DAILY_RANK_NORMAL.mo10240a()).booleanValue() && !((Boolean) LiveSettingKeys.ENABLE_SLIDE_FROM_DAILY_RANK_FEED_DRAWER.mo10240a()).booleanValue()) || this.f24202a == null || C3409v.m12670a(this.f24202a.f24068a)) {
            return new long[0];
        }
        ArrayList arrayList = new ArrayList();
        for (C8857f a : this.f24202a.f24068a) {
            long a2 = a.mo21920a();
            if (a2 != 0) {
                arrayList.add(Long.valueOf(a2));
            }
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        return jArr;
    }

    public C8885c(C8852a aVar) {
        this.f24202a = aVar;
    }

    /* renamed from: a */
    private static void m26591a(C8886a aVar, C8854c cVar) {
        aVar.mo21976a(cVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26591a((C8886a) vVar, (C8854c) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8886a mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8886a(layoutInflater.inflate(R.layout.amd, viewGroup, false), new C8887d(this));
    }
}
