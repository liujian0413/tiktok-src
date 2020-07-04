package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0043i;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3361af;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.C8284u;
import com.bytedance.android.livesdk.gift.dialog.view.GiftTabTextView;
import com.bytedance.android.livesdk.gift.model.GiftOperation;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.model.p390a.C8139f;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8294c;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.Widget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class GiftConfigurablePanelTabWidget extends Widget implements OnClickListener {

    /* renamed from: a */
    public final List<GiftPage> f22420a = new ArrayList();

    /* renamed from: b */
    public View f22421b;

    /* renamed from: c */
    public GiftTabTextView f22422c;

    /* renamed from: d */
    private final Map<View, Integer> f22423d = new HashMap();

    /* renamed from: e */
    private LinearLayout f22424e;

    /* renamed from: f */
    private View f22425f;

    /* renamed from: g */
    private ObjectAnimator f22426g;

    /* renamed from: h */
    private GiftDialogViewModel f22427h;

    /* renamed from: i */
    private boolean f22428i;

    /* renamed from: j */
    private boolean f22429j;

    /* renamed from: k */
    private boolean f22430k;

    /* renamed from: l */
    private HSImageView f22431l;

    /* renamed from: m */
    private TextView f22432m;

    /* renamed from: n */
    private HSImageView f22433n;

    /* renamed from: o */
    private GiftOperation f22434o;

    /* renamed from: p */
    private GiftOperation f22435p;

    /* renamed from: q */
    private C7321c f22436q;

    public int getLayoutId() {
        return R.layout.an4;
    }

    public void onClick(View view) {
    }

    /* renamed from: b */
    private void m25096b() {
        if (this.f22428i) {
            C8284u.m25332a().mo21442d();
            return;
        }
        if (((Boolean) C8946b.f24471by.mo22117a()).booleanValue()) {
            this.f22429j = true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f22427h != null) {
            this.f22427h.mo21338a((C0043i) this);
        }
        if (this.f22436q != null && !this.f22436q.isDisposed()) {
            this.f22436q.dispose();
        }
        if (this.f22426g != null) {
            this.f22426g.cancel();
            this.f22426g.removeAllListeners();
        }
        this.f22425f = null;
        this.f22422c = null;
        this.f22429j = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo21325a() {
        if (this.f22425f != null) {
            int width = this.f22421b.getWidth();
            float x = this.f22425f.getX();
            int width2 = this.f22425f.getWidth();
            if ((this.f22425f instanceof GiftTabTextView) && ((GiftTabTextView) this.f22425f).mo20704a()) {
                width2 -= C3358ac.m12510a(8.0f);
            }
            if (width > 0 && width2 > 0) {
                int i = (width2 - width) / 2;
                if (i < 0) {
                    i = 0;
                }
                float f = x + ((float) i);
                float x2 = this.f22421b.getX();
                if (this.f22426g != null) {
                    this.f22426g.cancel();
                    this.f22426g.removeAllListeners();
                }
                this.f22426g = ObjectAnimator.ofFloat(this.f22421b, "x", new float[]{x2, f});
                this.f22426g.setDuration(200);
                this.f22426g.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (GiftConfigurablePanelTabWidget.this.f22421b.getVisibility() != 0) {
                            GiftConfigurablePanelTabWidget.this.f22421b.setVisibility(0);
                        }
                    }
                });
                this.f22426g.start();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25100c() {
        /*
            r10 = this;
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> r0 = r10.f22420a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r10.containerView
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x0010:
            android.view.ViewGroup r0 = r10.containerView
            r1 = 0
            r0.setVisibility(r1)
            java.util.Map<android.view.View, java.lang.Integer> r0 = r10.f22423d
            r0.clear()
            r0 = 0
            r10.f22425f = r0
            android.widget.LinearLayout r0 = r10.f22424e
            r0.removeAllViews()
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> r0 = r10.f22420a
            java.util.Iterator r0 = r0.iterator()
        L_0x0029:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00f2
            java.lang.Object r2 = r0.next()
            com.bytedance.android.livesdk.gift.model.GiftPage r2 = (com.bytedance.android.livesdk.gift.model.GiftPage) r2
            boolean r3 = r2.display
            if (r3 == 0) goto L_0x0029
            int r3 = r2.pageType
            r4 = 1096810496(0x41600000, float:14.0)
            r5 = 2131101542(0x7f060766, float:1.7815497E38)
            r6 = 5
            r7 = 17
            if (r3 != r6) goto L_0x006f
            com.bytedance.android.livesdk.gift.dialog.view.GiftTabTextView r8 = new com.bytedance.android.livesdk.gift.dialog.view.GiftTabTextView
            android.content.Context r9 = r10.context
            r8.<init>(r9)
            java.lang.String r9 = r2.pageName
            r8.setText(r9)
            android.content.Context r9 = r10.context
            android.content.res.Resources r9 = r9.getResources()
            int r5 = r9.getColor(r5)
            r8.setTextColor(r5)
            r8.setTextSize(r4)
            r8.setGravity(r7)
            r10.f22422c = r8
            boolean r4 = r10.f22429j
            if (r4 == 0) goto L_0x0095
            r4 = 1
            r10.mo21332a(r4)
            goto L_0x0095
        L_0x006f:
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r9 = r10.context
            r8.<init>(r9)
            java.lang.String r9 = r2.pageName
            r8.setText(r9)
            android.content.Context r9 = r10.context
            android.content.res.Resources r9 = r9.getResources()
            int r5 = r9.getColor(r5)
            r8.setTextColor(r5)
            r8.setTextSize(r4)
            r8.setGravity(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r8.setTag(r4)
        L_0x0095:
            android.widget.LinearLayout r4 = r10.f22424e
            r4.addView(r8)
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            boolean r4 = r4 instanceof android.widget.LinearLayout.LayoutParams
            if (r4 == 0) goto L_0x00ca
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            r5 = -2
            r4.width = r5
            r5 = -1
            r4.height = r5
            android.content.Context r5 = r10.context
            r9 = 1098907648(0x41800000, float:16.0)
            float r5 = com.bytedance.android.livesdk.utils.C9051ar.m27035b(r5, r9)
            int r5 = (int) r5
            r4.leftMargin = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r7) goto L_0x00c7
            android.content.Context r5 = r10.context
            float r5 = com.bytedance.android.livesdk.utils.C9051ar.m27035b(r5, r9)
            int r5 = (int) r5
            r4.setMarginStart(r5)
        L_0x00c7:
            r8.setLayoutParams(r4)
        L_0x00ca:
            java.util.Map<android.view.View, java.lang.Integer> r4 = r10.f22423d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.put(r8, r5)
            com.bytedance.android.livesdk.gift.panel.widget.f r4 = new com.bytedance.android.livesdk.gift.panel.widget.f
            r4.<init>(r10, r8, r2)
            r8.setOnClickListener(r4)
            android.view.View r4 = r10.f22425f
            if (r4 != 0) goto L_0x0029
            boolean r4 = r10.f22428i
            if (r4 == 0) goto L_0x00e5
            if (r3 != r6) goto L_0x0029
        L_0x00e5:
            r10.mo21327a(r8, r1, r2)
            com.bytedance.android.livesdk.gift.panel.widget.g r2 = new com.bytedance.android.livesdk.gift.panel.widget.g
            r2.<init>(r10)
            r8.post(r2)
            goto L_0x0029
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.GiftConfigurablePanelTabWidget.m25100c():void");
    }

    public void onCreate() {
        boolean z;
        super.onCreate();
        this.f22424e = (LinearLayout) this.contentView.findViewById(R.id.dfq);
        this.f22421b = this.contentView.findViewById(R.id.a5l);
        this.f22431l = (HSImageView) this.contentView.findViewById(R.id.c90);
        this.f22432m = (TextView) this.contentView.findViewById(R.id.c94);
        this.f22433n = (HSImageView) this.contentView.findViewById(R.id.c93);
        if (this.dataCenter != null) {
            this.f22427h = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model", null);
        }
        if (this.f22427h != null) {
            this.f22427h.f22443E.observe(this, new C8218a(this));
            this.f22427h.f22445G.observe(this, new C8234b(this));
            this.f22427h.f22470r.observe(this, new C8235c(this));
            this.f22427h.f22462j.observe(this, new C8236d(this));
            this.f22427h.f22463k.observe(this, new C8237e(this));
            if (this.f22427h.f22459g == PanelType.PROP) {
                z = true;
            } else {
                z = false;
            }
            this.f22428i = z;
        }
        if (this.f22436q != null && !this.f22436q.isDisposed()) {
            this.f22436q.dispose();
        }
        this.f22436q = C9097a.m27146a().mo22266a(C8294c.class).mo19325f((C7326g<? super T>) new C7326g<C8294c>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C8294c cVar) throws Exception {
                GiftPage giftPage = null;
                for (GiftPage giftPage2 : GiftConfigurablePanelTabWidget.this.f22420a) {
                    if (giftPage2.pageType == 5) {
                        giftPage = giftPage2;
                    }
                }
                if (giftPage != null) {
                    GiftConfigurablePanelTabWidget.this.mo21327a((View) GiftConfigurablePanelTabWidget.this.f22422c, true, giftPage);
                }
            }
        });
        m25096b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21328a(GiftOperation giftOperation) {
        m25094a(giftOperation, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21331a(List<GiftPage> list) {
        this.f22420a.clear();
        this.f22420a.addAll(list);
        m25100c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21329a(C8134a aVar) {
        if (!(aVar instanceof C8139f) || !aVar.mo21262c()) {
            if (this.f22430k) {
                this.f22430k = false;
                m25094a(this.f22435p, 1);
            }
            return;
        }
        this.f22430k = true;
        this.f22431l.setVisibility(8);
        this.f22433n.setVisibility(8);
        this.f22432m.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21332a(boolean z) {
        this.f22429j = z;
        if (this.f22422c != null) {
            if (z) {
                C8282s.m25321b(5);
            }
            this.f22422c.mo20703a(z);
        }
    }

    /* renamed from: a */
    private void m25094a(GiftOperation giftOperation, int i) {
        int i2;
        int i3;
        if (!this.f22430k || i != 1) {
            this.f22435p = null;
            if (i == 0) {
                this.f22434o = giftOperation;
            } else if (giftOperation == null) {
                giftOperation = this.f22434o;
            }
            int i4 = 8;
            if (giftOperation == null) {
                this.f22431l.setVisibility(8);
                this.f22433n.setVisibility(8);
                this.f22432m.setVisibility(8);
                return;
            }
            ImageModel imageModel = giftOperation.leftImage;
            ImageModel imageModel2 = giftOperation.rightImage;
            String str = giftOperation.title;
            String str2 = giftOperation.titleColor;
            int i5 = giftOperation.titleSize;
            String str3 = giftOperation.schemeUrl;
            C5343e.m17038a(this.f22431l, imageModel);
            C5343e.m17038a(this.f22433n, imageModel2);
            this.f22432m.setText(str);
            try {
                this.f22432m.setTextColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
            }
            this.f22432m.setTextSize((float) i5);
            this.f22432m.setOnClickListener(new C8240h(this, str3, giftOperation));
            HSImageView hSImageView = this.f22431l;
            if (imageModel != null) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            hSImageView.setVisibility(i2);
            TextView textView = this.f22432m;
            if (TextUtils.isEmpty(str)) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            textView.setVisibility(i3);
            HSImageView hSImageView2 = this.f22433n;
            if (imageModel2 != null) {
                i4 = 0;
            }
            hSImageView2.setVisibility(i4);
            return;
        }
        this.f22435p = giftOperation;
    }

    /* renamed from: a */
    private void m25095a(String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str)) {
            ((C8931a) C3596c.m13172a(C8931a.class)).handle(this.context, Uri.parse(str).buildUpon().appendQueryParameter("status_bar_height", String.valueOf((int) C3358ac.m12527e(C3361af.m12532a(this.context)))).build());
            if (!TextUtils.isEmpty(str2)) {
                if (((C3592a) C3596c.m13172a(C3592a.class)).user() != null) {
                    str3 = String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
                } else {
                    str3 = "";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("user_id", str3);
                hashMap.put("type", "gift");
                C8443c.m25663a().mo21606a(str2, hashMap, new C8438j(), Room.class);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21326a(View view, GiftPage giftPage, View view2) {
        mo21327a(view, true, giftPage);
        if (giftPage.pageType == 5) {
            mo21332a(false);
            C8284u.m25332a().mo21442d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21330a(String str, GiftOperation giftOperation, View view) {
        m25095a(str, giftOperation.eventName);
    }

    /* renamed from: a */
    public final void mo21327a(View view, boolean z, GiftPage giftPage) {
        String str;
        if (view != null && giftPage != null) {
            if (this.f22425f instanceof TextView) {
                ((TextView) this.f22425f).setTextColor(this.context.getResources().getColor(R.color.anh));
            } else if (this.f22425f instanceof GiftTabTextView) {
                ((GiftTabTextView) this.f22425f).setTextColor(this.context.getResources().getColor(R.color.anh));
            }
            this.f22425f = view;
            if (this.f22425f instanceof TextView) {
                ((TextView) this.f22425f).setTextColor(this.context.getResources().getColor(R.color.as5));
            } else if (this.f22425f instanceof GiftTabTextView) {
                ((GiftTabTextView) this.f22425f).setTextColor(this.context.getResources().getColor(R.color.as5));
            }
            if (z) {
                mo21325a();
            }
            m25094a(giftPage.operation, 0);
            if (this.f22427h != null) {
                this.f22427h.f22470r.postValue(null);
                this.f22427h.f22471s.postValue(null);
                this.f22427h.f22465m.postValue(Boolean.valueOf(false));
            }
            Integer num = (Integer) this.f22423d.get(this.f22425f);
            if (num != null) {
                this.f22427h.f22444F.postValue(num);
            }
            if (!TextUtils.isEmpty(giftPage.eventName)) {
                if (((C3592a) C3596c.m13172a(C3592a.class)).user() != null) {
                    str = String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
                } else {
                    str = "";
                }
                HashMap hashMap = new HashMap();
                Room room = (Room) this.dataCenter.get("data_room", null);
                if (room != null) {
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    hashMap.put("room_id", String.valueOf(room.getId()));
                    hashMap.put("orientation", String.valueOf(room.getOrientation()));
                }
                hashMap.put("user_id", str);
                C8443c.m25663a().mo21606a(giftPage.eventName, hashMap, new C8438j(), Room.class);
            }
        }
    }
}
