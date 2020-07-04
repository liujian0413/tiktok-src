package com.bytedance.android.livesdk.gift.holder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.p373c.C7885d;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public abstract class BasePanelViewHolder<T extends C8135b> extends C1293v {

    /* renamed from: e */
    protected final Context f22035e;

    /* renamed from: f */
    TextView f22036f;

    /* renamed from: g */
    HSImageView f22037g;

    /* renamed from: h */
    View f22038h;

    /* renamed from: i */
    TextView f22039i;

    /* renamed from: j */
    ImageView f22040j;

    /* renamed from: k */
    ImageView f22041k;

    /* renamed from: l */
    public C8082a f22042l;

    /* renamed from: m */
    public final float f22043m = C9738o.m28708b(this.f22035e, 13.0f);

    /* renamed from: com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder$a */
    public interface C8082a {
        /* renamed from: a */
        void mo21171a(BasePanelViewHolder basePanelViewHolder, C8135b bVar);
    }

    /* renamed from: a */
    public abstract ComboTarget mo21165a();

    public BasePanelViewHolder(View view) {
        super(view);
        this.f22035e = view.getContext();
        this.f22038h = view;
        this.f22036f = (TextView) view.findViewById(R.id.c33);
        this.f22037g = (HSImageView) view.findViewById(R.id.a4g);
        this.f22039i = (TextView) view.findViewById(R.id.a8j);
        this.f22040j = (ImageView) view.findViewById(R.id.a8k);
        this.f22041k = (ImageView) view.findViewById(R.id.bl9);
    }

    /* renamed from: a */
    public void mo21167a(final T t) {
        this.f22040j.setVisibility(8);
        if (t.mo21270k() == -1) {
            this.f22036f.setTextColor(this.f22035e.getResources().getColor(C7885d.m24168a().mo20673c()));
        } else if (t.mo21270k() != 0) {
            this.f22036f.setTextColor(t.mo21270k());
        } else {
            this.f22036f.setTextColor(this.f22035e.getResources().getColor(R.color.aft));
        }
        this.f22036f.setText(t.mo21269j());
        if (t.mo21272m() == -1711276033) {
            this.f22039i.setTextColor(this.f22035e.getResources().getColor(C7885d.m24168a().mo20674d()));
        } else if (t.mo21272m() != 0) {
            this.f22039i.setTextColor(t.mo21272m());
        } else {
            this.f22039i.setTextColor(this.f22035e.getResources().getColor(R.color.am7));
        }
        if (t != null && !TextUtils.isEmpty(t.mo21271l())) {
            this.f22039i.setText(t.mo21271l());
        }
        if (t.mo21273n() == null || TextUtils.isEmpty(t.mo21273n().getUri())) {
            this.f22041k.setVisibility(8);
        } else {
            this.f22041k.setVisibility(0);
            C5343e.m17035a(this.f22041k, t.mo21273n(), (C3405a) new C3405a() {
                /* renamed from: a */
                public final void mo10308a(ImageModel imageModel) {
                }

                /* renamed from: a */
                public final void mo10310a(ImageModel imageModel, Exception exc) {
                }

                /* renamed from: a */
                public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                    if (i != 0 && i2 != 0) {
                        LayoutParams layoutParams = BasePanelViewHolder.this.f22041k.getLayoutParams();
                        layoutParams.width = (int) (((float) i) * (BasePanelViewHolder.this.f22043m / ((float) i2)));
                        BasePanelViewHolder.this.f22041k.setLayoutParams(layoutParams);
                    }
                }
            });
        }
        C3393m.m12621a(this.f22037g, t.mo21274o(), (C3405a) new C3405a() {
            /* renamed from: a */
            public final void mo10308a(ImageModel imageModel) {
            }

            /* renamed from: a */
            public final void mo10310a(ImageModel imageModel, Exception exc) {
                if (t.f22203a == 1) {
                    C8282s.m25317a(t.mo21275p(), imageModel.getUri(), exc.getMessage());
                }
            }

            /* renamed from: a */
            public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                if (t.f22203a == 1) {
                    C8282s.m25316a(t.mo21275p(), imageModel.getUri());
                }
            }
        });
        if (t.f22205c) {
            this.f22038h.setAlpha(0.32f);
        } else {
            this.f22038h.setAlpha(1.0f);
        }
        this.f22038h.setOnClickListener(new C8084a(this, t));
    }

    /* renamed from: a */
    public void mo21170a(T t, List<Object> list) {
        mo21167a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21169a(C8135b bVar, View view) {
        if (this.f22042l != null) {
            this.f22042l.mo21171a(this, bVar);
        }
    }
}
