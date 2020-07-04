package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.app.dataholder.C3915g;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

public final class PreviewDouPlusWidget extends LiveWidget {

    /* renamed from: a */
    public DouPlusEntry f9414a = DouPlusEntry.defaultOne();

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewDouPlusWidget$a */
    static final class C3024a<T> implements C3915g<DouPlusEntry> {

        /* renamed from: a */
        final /* synthetic */ PreviewDouPlusWidget f9415a;

        C3024a(PreviewDouPlusWidget previewDouPlusWidget) {
            this.f9415a = previewDouPlusWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo9832a(DouPlusEntry douPlusEntry) {
            int i;
            if (douPlusEntry != null) {
                this.f9415a.f9414a = douPlusEntry;
                if (this.f9415a.isViewValid()) {
                    View view = this.f9415a.contentView;
                    C7573i.m23582a((Object) view, "contentView");
                    ImageView imageView = (ImageView) view.findViewById(R.id.a_q);
                    C7573i.m23582a((Object) imageView, "contentView.dou_plus_entry");
                    if (this.f9415a.f9414a.hasDouPlusEntry) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    imageView.setVisibility(i);
                    this.f9415a.mo9830a();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewDouPlusWidget$b */
    static final class C3025b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewDouPlusWidget f9416a;

        C3025b(PreviewDouPlusWidget previewDouPlusWidget) {
            this.f9416a = previewDouPlusWidget;
        }

        public final void onClick(View view) {
            this.f9416a.mo9831b();
        }
    }

    public final int getLayoutId() {
        return R.layout.als;
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo9830a() {
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        ImageView imageView = (ImageView) view.findViewById(R.id.a_q);
        C7573i.m23582a((Object) imageView, "contentView.dou_plus_entry");
        if (imageView.getVisibility() == 0) {
            if (C3596c.m13172a(C9295a.class) == null) {
                C7573i.m23580a();
            }
            C8446a a = C8446a.m25675a().mo21609a("entrance_type", "live_before").mo21609a("pay_mode", "dou_not_iap").mo21609a("serving_type", "my_group");
            String str = "anchor_id";
            C2324b a2 = C3596c.m13172a(C3592a.class);
            if (a2 == null) {
                C7573i.m23580a();
            }
            C8984e user = ((C3592a) a2).user();
            C7573i.m23582a((Object) user, "ServiceManager.getServic…ice::class.java)!!.user()");
            a.mo21609a(str, String.valueOf(user.mo22179b()));
        }
    }

    public final void onCreate() {
        super.onCreate();
        C2324b a = C3596c.m13172a(C3592a.class);
        if (a == null) {
            C7573i.m23580a();
        }
        C8984e user = ((C3592a) a).user();
        C7573i.m23582a((Object) user, "ServiceManager.getServic…ice::class.java)!!.user()");
        IUser a2 = user.mo22165a();
        C7573i.m23582a((Object) a2, "ServiceManager.getServic…ava)!!.user().currentUser");
        a2.getSecUid();
        if (C3596c.m13172a(C9295a.class) == null) {
            C7573i.m23580a();
        }
        new C3024a(this);
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        ((ImageView) view.findViewById(R.id.a_q)).setOnClickListener(new C3025b(this));
    }

    /* renamed from: b */
    public final void mo9831b() {
        if (isViewValid()) {
            C2324b a = C3596c.m13172a(C3592a.class);
            if (a == null) {
                C7573i.m23580a();
            }
            C8984e user = ((C3592a) a).user();
            C7573i.m23582a((Object) user, "ServiceManager.getServic…ice::class.java)!!.user()");
            IUser a2 = user.mo22165a();
            C7573i.m23582a((Object) a2, "ServiceManager.getServic…ava)!!.user().currentUser");
            a2.getSecUid();
            if (C3596c.m13172a(C9295a.class) == null) {
                C7573i.m23580a();
            }
            C8446a a3 = C8446a.m25675a().mo21609a("entrance_type", "live_before").mo21609a("pay_mode", "dou_not_iap").mo21609a("serving_type", "my_group");
            String str = "anchor_id";
            C2324b a4 = C3596c.m13172a(C3592a.class);
            if (a4 == null) {
                C7573i.m23580a();
            }
            C8984e user2 = ((C3592a) a4).user();
            C7573i.m23582a((Object) user2, "ServiceManager.getServic…ice::class.java)!!.user()");
            IUser a5 = user2.mo22165a();
            C7573i.m23582a((Object) a5, "ServiceManager.getServic…ava)!!.user().currentUser");
            a3.mo21609a(str, String.valueOf(a5.getId()));
            if (C3596c.m13172a(C9295a.class) == null) {
                C7573i.m23580a();
            }
        }
    }
}
