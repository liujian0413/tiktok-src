package com.bytedance.android.livesdk.gift.dialog.view;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4416ah;
import com.bytedance.android.livesdk.chatroom.p210c.C4298a;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.dialog.C7897b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7938a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.model.p390a.C8136c;
import com.bytedance.android.livesdk.gift.model.p390a.C8141h;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.widget.CountDownTextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveGiftViewHolder extends C1293v {

    /* renamed from: a */
    public HSImageView f21386a;

    /* renamed from: b */
    public HSImageView f21387b;

    /* renamed from: c */
    public final float f21388c;

    /* renamed from: d */
    private final GiftViewModel f21389d;

    /* renamed from: e */
    private int f21390e;

    /* renamed from: f */
    private HSImageView f21391f;

    /* renamed from: g */
    private View f21392g;

    /* renamed from: h */
    private TextView f21393h;

    /* renamed from: i */
    private TextView f21394i;

    /* renamed from: j */
    private TextView f21395j;

    /* renamed from: k */
    private LiveSendGiftAnimationView f21396k;

    /* renamed from: l */
    private C8135b f21397l;

    /* renamed from: m */
    private View f21398m;

    /* renamed from: n */
    private LiveGiftComboView f21399n;

    /* renamed from: o */
    private CountDownTextView f21400o;

    /* renamed from: p */
    private boolean f21401p = true;

    /* renamed from: b */
    private void m24263b() {
        C9097a.m27146a().mo22267a((Object) new C4416ah(0));
        this.f21389d.mo20792a(new C7938a(1, null));
    }

    /* renamed from: c */
    private void m24264c() {
        C4298a.m14476a(this.itemView.getContext(), (C8136c) this.f21397l);
        this.f21389d.mo20792a(new C7938a(1, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo20746a() {
        this.f21399n.setVisibility(8);
        this.f21396k.setVisibility(0);
        this.f21389d.mo20792a(new C7938a(13, null));
    }

    /* renamed from: d */
    private void m24265d() {
        this.f21399n.mo20719a();
        this.f21399n.setVisibility(8);
        this.f21389d.mo20792a(new C7938a(6, this.f21397l));
        if (this.f21397l != null && (this.f21397l.f22206d instanceof C8149d)) {
            C7897b.m24201a(((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom(), (C8149d) this.f21397l.f22206d);
        }
    }

    /* renamed from: f */
    private void m24269f() {
        boolean z;
        if (this.f21397l.f22206d instanceof Prop) {
            Prop prop = (Prop) this.f21397l.f22206d;
            int a = this.f21389d.mo20779a();
            if (prop.gift != null && prop.gift.f22228G) {
                a = 10;
            }
            if (prop.count - a >= 0) {
                prop.count -= a;
            }
            if (prop.propType == 4) {
                z = true;
            } else {
                z = false;
            }
            m24261a(prop, z);
        }
    }

    /* renamed from: a */
    private void m24262a(boolean z) {
        this.f21399n.mo20719a();
        this.f21399n.setVisibility(8);
        if (z) {
            this.f21396k.setVisibility(0);
            this.f21396k.mo20752a(1.08f);
            this.f21398m.setVisibility(8);
            return;
        }
        this.f21396k.setVisibility(8);
        this.f21398m.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo20748a(View view) {
        if (this.f21397l != null && !this.f21397l.f22204b && this.f21401p) {
            if (this.f21390e == 5) {
                m24263b();
            } else if (this.f21390e == 3) {
                m24264c();
            } else {
                m24265d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo20751c(View view) {
        if (!(this.f21397l instanceof C8141h) || !(this.f21397l.f22206d instanceof Prop) || ((Prop) this.f21397l.f22206d).propType != 4) {
            if (this.f21389d.mo20792a(new C7938a(7, null))) {
                this.f21396k.setVisibility(8);
                this.f21399n.setVisibility(0);
                this.f21399n.mo20720a(new C7923k(this));
                m24269f();
            }
            return;
        }
        this.f21389d.mo20792a(new C7938a(14, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void mo20750b(View view) {
        if (this.f21389d.mo20792a(new C7938a(7, null))) {
            this.f21399n.mo20721b(new C7924l(this));
            this.f21396k.setVisibility(8);
            this.f21399n.setVisibility(0);
            m24269f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20747a(int i) {
        Context context = this.itemView.getContext();
        if (context != null && this.f21396k != null) {
            if (this.f21399n != null && this.f21399n.getVisibility() == 0) {
                this.f21399n.setVisibility(8);
                this.f21396k.setVisibility(0);
            }
            this.f21396k.mo20754a(context.getResources().getString(R.string.ehc, new Object[]{String.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public final void mo20749a(final C8135b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        if (bVar != null) {
            this.f21397l = bVar;
            if (!(this.f21397l instanceof C8141h) || !(this.f21397l.f22206d instanceof Prop) || ((Prop) this.f21397l.f22206d).propType != 4) {
                z = false;
            } else {
                z = true;
            }
            C3393m.m12621a(this.f21391f, bVar.mo21274o(), (C3405a) new C3405a() {
                /* renamed from: a */
                public final void mo10308a(ImageModel imageModel) {
                }

                /* renamed from: a */
                public final void mo10310a(ImageModel imageModel, Exception exc) {
                    if (bVar.f22203a == 1) {
                        C8282s.m25317a(bVar.mo21275p(), imageModel.getUri(), exc.getMessage());
                    }
                }

                /* renamed from: a */
                public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                    if (bVar.f22203a == 1) {
                        C8282s.m25316a(bVar.mo21275p(), imageModel.getUri());
                    }
                }
            });
            if (this.f21390e == 5 || this.f21390e == 3) {
                this.f21393h.setText(bVar.mo21271l());
                return;
            }
            if (bVar.mo21276q() != null) {
                this.f21387b.setVisibility(0);
                C3393m.m12621a(this.f21387b, bVar.mo21276q(), (C3405a) new C3405a() {
                    /* renamed from: a */
                    public final void mo10308a(ImageModel imageModel) {
                    }

                    /* renamed from: a */
                    public final void mo10310a(ImageModel imageModel, Exception exc) {
                        LiveGiftViewHolder.this.f21387b.setVisibility(8);
                    }

                    /* renamed from: a */
                    public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                        LayoutParams layoutParams = LiveGiftViewHolder.this.f21387b.getLayoutParams();
                        layoutParams.width = (int) (((float) layoutParams.height) * (((float) i) / ((float) i2)));
                        LiveGiftViewHolder.this.f21387b.setLayoutParams(layoutParams);
                        LiveGiftViewHolder.this.f21387b.setVisibility(0);
                    }
                });
            } else {
                this.f21387b.setVisibility(8);
            }
            this.f21393h.setText(bVar.mo21269j());
            Context context = this.itemView.getContext();
            if (context != null) {
                if (bVar.f22206d instanceof C8149d) {
                    C8149d dVar = (C8149d) bVar.f22206d;
                    int i3 = dVar.f22235f;
                    boolean z3 = dVar.f22236g;
                    this.f21395j.setVisibility(8);
                    if (TextUtils.isEmpty(dVar.f22227F)) {
                        this.f21400o.setVisibility(8);
                    } else {
                        this.f21400o.setText(dVar.f22227F);
                        this.f21400o.setVisibility(0);
                    }
                    i = i3;
                    z2 = z3;
                } else if (bVar.f22206d instanceof Prop) {
                    Prop prop = (Prop) bVar.f22206d;
                    if (prop.gift == null || !prop.gift.f22236g) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    m24261a(prop, z);
                    i = prop.diamond;
                } else {
                    i = 0;
                    z2 = false;
                }
                if (z2) {
                    i2 = this.f21389d.mo20779a() * i;
                } else {
                    i2 = i;
                }
                if (i > 0) {
                    this.f21394i.setText(context.getString(R.string.ehc, new Object[]{String.valueOf(i)}));
                    this.f21394i.setTextColor(context.getResources().getColor(R.color.acp));
                    this.f21396k.mo20753a(bVar.mo21274o(), context.getString(R.string.ehc, new Object[]{String.valueOf(i2)}), context.getResources().getColor(R.color.acp), context.getString(R.string.fc6));
                } else if (z) {
                    String str = "";
                    int color = context.getResources().getColor(R.color.acp);
                    if (bVar.f22206d instanceof Prop) {
                        Prop prop2 = (Prop) bVar.f22206d;
                        if (prop2.count <= 0) {
                            str = context.getString(R.string.fe8);
                            color = context.getResources().getColor(R.color.apg);
                        } else {
                            str = prop2.description;
                            color = context.getResources().getColor(R.color.acp);
                        }
                    }
                    this.f21394i.setText(str);
                    this.f21394i.setTextColor(color);
                    this.f21396k.mo20753a(bVar.mo21274o(), str, color, context.getString(R.string.fej));
                } else {
                    String string = context.getString(R.string.ese);
                    this.f21394i.setText(string);
                    this.f21394i.setTextColor(context.getResources().getColor(R.color.acp));
                    this.f21396k.mo20753a(bVar.mo21274o(), string, context.getResources().getColor(R.color.acp), context.getString(R.string.fc6));
                }
                if (bVar.mo21273n() != null) {
                    this.f21386a.setVisibility(0);
                    this.f21392g.setVisibility(8);
                    C3393m.m12621a(this.f21386a, bVar.mo21273n(), (C3405a) new C3405a() {
                        /* renamed from: a */
                        public final void mo10308a(ImageModel imageModel) {
                        }

                        /* renamed from: a */
                        public final void mo10310a(ImageModel imageModel, Exception exc) {
                        }

                        /* renamed from: a */
                        public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                            if (i != 0 && i2 != 0) {
                                LayoutParams layoutParams = LiveGiftViewHolder.this.f21386a.getLayoutParams();
                                layoutParams.width = (int) (((float) i) * (LiveGiftViewHolder.this.f21388c / ((float) i2)));
                                LiveGiftViewHolder.this.f21386a.setLayoutParams(layoutParams);
                            }
                        }
                    });
                } else if (z2) {
                    this.f21386a.setVisibility(8);
                    this.f21392g.setVisibility(0);
                } else {
                    this.f21386a.setVisibility(8);
                    this.f21392g.setVisibility(8);
                }
                m24262a(bVar.f22204b);
            }
        }
    }

    /* renamed from: a */
    private void m24261a(Prop prop, boolean z) {
        boolean z2;
        String str;
        Prop prop2 = prop;
        this.f21395j.setText(this.itemView.getContext().getString(R.string.et6, new Object[]{Integer.valueOf(prop2.count)}));
        this.f21395j.setVisibility(0);
        Context context = this.itemView.getContext();
        if (context != null) {
            if (prop2.nextExpire > 0) {
                long currentTimeMillis = prop2.nextExpire - ((System.currentTimeMillis() / 1000) + prop.getNowTimeDiff());
                if (currentTimeMillis <= 0) {
                    str = context.getResources().getString(R.string.et7, new Object[]{"00:00"});
                    z2 = true;
                } else {
                    if (currentTimeMillis < 3600) {
                        str = context.getResources().getString(R.string.et7, new Object[]{C9048ao.m27017a(currentTimeMillis)});
                        this.f21400o.mo22433a(R.string.et7, currentTimeMillis, 0);
                    } else if (currentTimeMillis < 86400) {
                        int i = (int) (currentTimeMillis / 3600);
                        str = context.getResources().getQuantityString(R.plurals.a6, i, new Object[]{Integer.valueOf(i)});
                    } else {
                        int i2 = (int) (currentTimeMillis / 86400);
                        str = context.getResources().getQuantityString(R.plurals.a5, i2, new Object[]{Integer.valueOf(i2)});
                    }
                    z2 = false;
                }
                this.f21400o.setText(str);
                this.f21400o.setVisibility(0);
            } else {
                this.f21400o.setVisibility(8);
                z2 = false;
            }
            if (z || (prop2.count > 0 && !z2)) {
                this.f21398m.setAlpha(1.0f);
                this.f21401p = true;
                return;
            }
            this.f21398m.setAlpha(0.32f);
            this.f21401p = false;
        }
    }

    public LiveGiftViewHolder(View view, int i, GiftViewModel giftViewModel) {
        super(view);
        this.f21390e = i;
        this.f21389d = giftViewModel;
        this.f21391f = (HSImageView) view.findViewById(R.id.ar5);
        this.f21386a = (HSImageView) view.findViewById(R.id.bl9);
        this.f21387b = (HSImageView) view.findViewById(R.id.a8o);
        this.f21392g = view.findViewById(R.id.d25);
        this.f21393h = (TextView) view.findViewById(R.id.arb);
        this.f21394i = (TextView) view.findViewById(R.id.a8j);
        this.f21395j = (TextView) view.findViewById(R.id.clk);
        this.f21398m = view.findViewById(R.id.a1p);
        this.f21396k = (LiveSendGiftAnimationView) view.findViewById(R.id.d32);
        this.f21399n = (LiveGiftComboView) view.findViewById(R.id.d34);
        this.f21396k.setViewModel(this.f21389d);
        this.f21400o = (CountDownTextView) view.findViewById(R.id.arc);
        view.setOnClickListener(new C7920h(this));
        this.f21396k.setOnClickListener(new C7921i(this));
        this.f21399n.setOnClickListener(new C7922j(this));
        this.f21388c = C9738o.m28708b(view.getContext(), 13.0f);
    }
}
