package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.dialog.C7897b;
import com.bytedance.android.livesdk.gift.dialog.view.GradientStrokeView;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7938a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8151f;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class LiveGiftGroupView extends FrameLayout {

    /* renamed from: a */
    public RecyclerView f21426a;

    /* renamed from: b */
    public List<C8151f> f21427b;

    /* renamed from: c */
    public View f21428c;

    /* renamed from: d */
    public View f21429d;

    /* renamed from: e */
    public C8135b f21430e;

    /* renamed from: f */
    public GiftViewModel f21431f;

    /* renamed from: g */
    public Room f21432g;

    /* renamed from: h */
    private C7926a f21433h;

    /* renamed from: i */
    private boolean f21434i;

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftGroupView$a */
    class C7926a extends C1262a<C7927b> {
        public final int getItemCount() {
            if (LiveGiftGroupView.this.f21427b != null) {
                return LiveGiftGroupView.this.f21427b.size();
            }
            return 0;
        }

        private C7926a() {
        }

        public final int getItemViewType(int i) {
            if (LiveGiftGroupView.this.f21427b == null) {
                return 1;
            }
            if (i == 0) {
                return 0;
            }
            if (i == LiveGiftGroupView.this.f21427b.size() - 1) {
                return 2;
            }
            return 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C7927b bVar, int i) {
            if (LiveGiftGroupView.this.f21427b != null) {
                bVar.mo20766a((C8151f) LiveGiftGroupView.this.f21427b.get(i));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7927b onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(LiveGiftGroupView.this.getContext()).inflate(R.layout.alj, null);
            C7927b bVar = new C7927b(inflate);
            int b = (int) C9738o.m28708b(LiveGiftGroupView.this.getContext(), 114.0f);
            int b2 = (int) C9738o.m28708b(LiveGiftGroupView.this.getContext(), 106.0f);
            int b3 = (int) C9738o.m28708b(LiveGiftGroupView.this.getContext(), 34.0f);
            int b4 = (int) C9738o.m28708b(LiveGiftGroupView.this.getContext(), 16.0f);
            if (i != 1) {
                if (i == 0) {
                    bVar.itemView.setLayoutParams(new LayoutParams(b2, b3));
                } else if (i == 2) {
                    bVar.itemView.setLayoutParams(new LayoutParams(b, b3));
                }
                View findViewById = inflate.findViewById(R.id.aqv);
                if (findViewById.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) findViewById.getLayoutParams();
                    if (i == 0) {
                        layoutParams.leftMargin = b4;
                        layoutParams.setMarginStart(b4);
                    } else if (i == 2) {
                        layoutParams.rightMargin = b4;
                        layoutParams.setMarginEnd(b4);
                    }
                    findViewById.setLayoutParams(layoutParams);
                }
            }
            return bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftGroupView$b */
    class C7927b extends C1293v {

        /* renamed from: b */
        private GradientStrokeView f21438b;

        /* renamed from: c */
        private TextView f21439c;

        /* renamed from: d */
        private TextView f21440d;

        /* renamed from: a */
        public final void mo20766a(C8151f fVar) {
            if (fVar != null) {
                this.f21438b.setShowStroke(fVar.f22263c);
                int i = 0;
                this.f21439c.setText(LiveGiftGroupView.this.getContext().getString(R.string.et6, new Object[]{Integer.valueOf(fVar.f22261a)}));
                boolean z = !TextUtils.isEmpty(fVar.f22262b);
                if (z) {
                    this.f21440d.setVisibility(0);
                    this.f21440d.setText(String.valueOf(fVar.f22262b));
                } else {
                    this.f21440d.setVisibility(8);
                }
                if (this.f21439c.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f21439c.getLayoutParams();
                    layoutParams.f473h = 0;
                    if (z) {
                        i = -1;
                    }
                    layoutParams.f476k = i;
                    this.f21439c.setLayoutParams(layoutParams);
                }
                this.itemView.setOnClickListener(new C7928a(this, fVar));
            }
        }

        public C7927b(View view) {
            super(view);
            this.f21438b = (GradientStrokeView) view.findViewById(R.id.aqv);
            this.f21439c = (TextView) view.findViewById(R.id.aqx);
            this.f21440d = (TextView) view.findViewById(R.id.aqz);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo20767a(C8151f fVar, View view) {
            C7897b.m24200a(LiveGiftGroupView.this.f21432g, LiveGiftGroupView.this.f21430e, fVar.f22261a);
            if (LiveGiftGroupView.this.f21431f != null) {
                LiveGiftGroupView.this.f21431f.mo20792a(new C7938a(10, fVar));
            }
        }
    }

    /* renamed from: a */
    private void m24291a() {
        LayoutInflater.from(getContext()).inflate(R.layout.avm, this);
        this.f21426a = (RecyclerView) findViewById(R.id.aqy);
        this.f21428c = findViewById(R.id.d_v);
        this.f21429d = findViewById(R.id.aep);
        this.f21433h = new C7926a();
        boolean z = false;
        this.f21426a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f21426a.setAdapter(this.f21433h);
        this.f21426a.mo5528a((C1281m) new C1281m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int i3;
                super.onScrolled(recyclerView, i, i2);
                if (LiveGiftGroupView.this.f21426a.getLayoutManager() instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) LiveGiftGroupView.this.f21426a.getLayoutManager();
                    int k = linearLayoutManager.mo5446k();
                    int m = linearLayoutManager.mo5448m();
                    View view = LiveGiftGroupView.this.f21428c;
                    int i4 = 0;
                    if (k == 0) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                    View view2 = LiveGiftGroupView.this.f21429d;
                    if (m == LiveGiftGroupView.this.f21427b.size() - 1) {
                        i4 = 8;
                    }
                    view2.setVisibility(i4);
                }
            }
        });
        if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo10240a()).intValue() & 2) == 2) {
            z = true;
        }
        this.f21434i = z;
    }

    public LiveGiftGroupView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final boolean mo20765a(C7939b bVar) {
        int i = 0;
        if (!this.f21434i) {
            return false;
        }
        this.f21430e = bVar.f21494b;
        if (this.f21430e != null && (this.f21430e instanceof C8134a)) {
            C8149d dVar = null;
            if (this.f21430e.f22206d instanceof C8149d) {
                dVar = (C8149d) this.f21430e.f22206d;
            } else if (this.f21430e.f22206d instanceof Prop) {
                dVar = ((Prop) this.f21430e.f22206d).gift;
                if (dVar != null && dVar.f22228G) {
                    return false;
                }
            }
            this.f21427b = bVar.f21496d;
            if (dVar != null && dVar.f22236g && !C6311g.m19573a(this.f21427b) && dVar.f22234e != 5) {
                if (((C8151f) this.f21427b.get(0)).f22263c) {
                    this.f21428c.setVisibility(8);
                    this.f21429d.setVisibility(0);
                } else if (((C8151f) this.f21427b.get(this.f21427b.size() - 1)).f22263c) {
                    this.f21428c.setVisibility(0);
                    this.f21429d.setVisibility(8);
                } else {
                    this.f21428c.setVisibility(0);
                    this.f21429d.setVisibility(0);
                }
                while (true) {
                    if (i >= this.f21427b.size()) {
                        break;
                    }
                    C8151f fVar = (C8151f) this.f21427b.get(i);
                    if (fVar != null && fVar.f22263c) {
                        this.f21426a.mo5541b(i);
                        break;
                    }
                    i++;
                }
                this.f21433h.notifyDataSetChanged();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo20764a(GiftViewModel giftViewModel, Room room) {
        this.f21431f = giftViewModel;
        this.f21432g = room;
    }

    public LiveGiftGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveGiftGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24291a();
    }
}
