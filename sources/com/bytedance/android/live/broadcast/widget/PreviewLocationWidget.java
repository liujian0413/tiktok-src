package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.broadcast.p134e.C2562b;
import com.bytedance.android.live.broadcast.p134e.C2567e.C2568a;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.p410o.C8732d;
import com.bytedance.android.livesdk.p410o.C8735f;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

public final class PreviewLocationWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9417a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewLocationWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;"))};

    /* renamed from: b */
    public boolean f9418b;

    /* renamed from: c */
    public boolean f9419c;

    /* renamed from: d */
    private final C7541d f9420d = C7546e.m23569a(new C3032b(this));

    /* renamed from: e */
    private String f9421e = "";

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewLocationWidget$a */
    static final class C3026a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewLocationWidget f9422a;

        C3026a(PreviewLocationWidget previewLocationWidget) {
            this.f9422a = previewLocationWidget;
        }

        public final void onClick(View view) {
            if (this.f9422a.f9419c) {
                C9049ap.m27022a((int) R.string.fa2);
            } else if (!this.f9422a.f9418b) {
                if (C8732d.m26098b(this.f9422a.context, "android.permission.ACCESS_FINE_LOCATION")) {
                    this.f9422a.f9418b = !this.f9422a.f9418b;
                    this.f9422a.mo9835a(this.f9422a.f9418b);
                    return;
                }
                C2324b a = C3596c.m13172a(C3592a.class);
                if (a == null) {
                    C7573i.m23580a();
                }
                C2562b.m10529a(((C3592a) a).user().mo22179b());
                Context context = this.f9422a.context;
                if (context != null) {
                    C8735f.m26105a((Activity) context).mo21742a(C30271.f9423a).mo21744b(C30282.f9424a).mo21743a(new C8721d(this) {

                        /* renamed from: a */
                        final /* synthetic */ C3026a f9425a;

                        {
                            this.f9425a = r1;
                        }

                        /* renamed from: b */
                        public final void mo9568b(String... strArr) {
                            C7573i.m23587b(strArr, "permissions");
                            C2324b a = C3596c.m13172a(C3592a.class);
                            if (a == null) {
                                C7573i.m23580a();
                            }
                            C2562b.m10534c(((C3592a) a).user().mo22179b());
                        }

                        /* renamed from: a */
                        public final void mo9567a(String... strArr) {
                            C7573i.m23587b(strArr, "permissions");
                            this.f9425a.f9422a.f9418b = !this.f9425a.f9422a.f9418b;
                            this.f9425a.f9422a.mo9835a(this.f9425a.f9422a.f9418b);
                            C2324b a = C3596c.m13172a(C3592a.class);
                            if (a == null) {
                                C7573i.m23580a();
                            }
                            C2562b.m10533b(((C3592a) a).user().mo22179b());
                        }
                    }, "android.permission.ACCESS_FINE_LOCATION");
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            } else {
                new C1081a(this.f9422a.context).mo4237b((int) R.string.fa0).mo4226a((int) R.string.ek4, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C3026a f9426a;

                    {
                        this.f9426a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        Map hashMap = new HashMap();
                        String str = "live_type";
                        Object value = this.f9426a.f9422a.mo9834a().mo9597d().getValue();
                        if (value == null) {
                            C7573i.m23580a();
                        }
                        C7573i.m23582a(value, "startLiveViewModel.liveMode.value!!");
                        hashMap.put(str, C2568a.m10552a((LiveMode) value));
                        hashMap.put("button", "keep_on");
                        C8443c.m25663a().mo21606a("location_cancel_page_button_click", hashMap, new Object[0]);
                    }
                }).mo4238b((int) R.string.ek3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C3026a f9427a;

                    {
                        this.f9427a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        this.f9427a.f9422a.f9418b = !this.f9427a.f9422a.f9418b;
                        this.f9427a.f9422a.mo9835a(this.f9427a.f9422a.f9418b);
                        Map hashMap = new HashMap();
                        String str = "live_type";
                        Object value = this.f9427a.f9422a.mo9834a().mo9597d().getValue();
                        if (value == null) {
                            C7573i.m23580a();
                        }
                        C7573i.m23582a(value, "startLiveViewModel.liveMode.value!!");
                        hashMap.put(str, C2568a.m10552a((LiveMode) value));
                        hashMap.put("button", "off");
                        C8443c.m25663a().mo21606a("location_cancel_page_button_click", hashMap, new Object[0]);
                    }
                }).mo4245c();
                Map hashMap = new HashMap();
                String str = "live_type";
                Object value = this.f9422a.mo9834a().mo9597d().getValue();
                if (value == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a(value, "startLiveViewModel.liveMode.value!!");
                hashMap.put(str, C2568a.m10552a((LiveMode) value));
                C8443c.m25663a().mo21606a("location_cancel_page_show", hashMap, new Object[0]);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewLocationWidget$b */
    static final class C3032b extends Lambda implements C7561a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewLocationWidget f9428a;

        C3032b(PreviewLocationWidget previewLocationWidget) {
            this.f9428a = previewLocationWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveViewModel invoke() {
            Context context = this.f9428a.context;
            if (context != null) {
                return (StartLiveViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9834a() {
        return (StartLiveViewModel) this.f9420d.getValue();
    }

    public final int getLayoutId() {
        return R.layout.alu;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r6 = this;
            super.onCreate()
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostContext> r0 = com.bytedance.android.livesdkapi.host.IHostContext.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            java.lang.String r1 = "ServiceManager.getServic…IHostContext::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.bytedance.android.livesdkapi.host.IHostContext r0 = (com.bytedance.android.livesdkapi.host.IHostContext) r0
            com.bytedance.android.livesdkapi.i.l r0 = r0.getCurrentLocation()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002e
            android.content.Context r3 = r6.context
            r4 = 2131827811(0x7f111c63, float:1.9288545E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r0 = r0.f25969a
            r5[r1] = r0
            java.lang.String r0 = r3.getString(r4, r5)
            java.lang.String r3 = "context.getString(R.stri…n_hint_template, it.city)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r6.f9421e = r0
        L_0x002e:
            java.lang.Class<com.bytedance.android.live.user.a> r0 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            com.bytedance.android.live.user.a r0 = (com.bytedance.android.live.user.C3592a) r0
            if (r0 == 0) goto L_0x003b
            r0.user()
        L_0x003b:
            r6.f9418b = r1
            android.content.Context r0 = r6.context
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            r3[r1] = r4
            boolean r0 = com.bytedance.android.livesdk.p410o.C8732d.m26098b(r0, r3)
            if (r0 == 0) goto L_0x006f
            com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r0 = com.bytedance.android.livesdk.sharedpref.C8946b.f24357I
            java.lang.String r3 = "LivePluginProperties.LIV…EVIEW_LOCATION_SHOW_STATE"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            java.lang.Object r0 = r0.mo22117a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x005b
            goto L_0x006f
        L_0x005b:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x006f
            boolean r0 = r6.f9419c
            if (r0 != 0) goto L_0x006b
            r6.mo9835a(r2)
            r6.f9418b = r2
            goto L_0x0072
        L_0x006b:
            r6.mo9835a(r1)
            goto L_0x0072
        L_0x006f:
            r6.mo9835a(r1)
        L_0x0072:
            boolean r0 = r6.f9419c
            if (r0 == 0) goto L_0x0083
            android.view.View r0 = r6.contentView
            java.lang.String r1 = "contentView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r1)
            goto L_0x008f
        L_0x0083:
            android.view.View r0 = r6.contentView
            java.lang.String r1 = "contentView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L_0x008f:
            android.view.View r0 = r6.contentView
            com.bytedance.android.live.broadcast.widget.PreviewLocationWidget$a r1 = new com.bytedance.android.live.broadcast.widget.PreviewLocationWidget$a
            r1.<init>(r6)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewLocationWidget.onCreate():void");
    }

    /* renamed from: a */
    public final void mo9835a(boolean z) {
        if (z) {
            View view = this.contentView;
            C7573i.m23582a((Object) view, "contentView");
            TextView textView = (TextView) view.findViewById(R.id.dpq);
            C7573i.m23582a((Object) textView, "contentView.turn_on_location");
            textView.setText(this.f9421e);
            View view2 = this.contentView;
            C7573i.m23582a((Object) view2, "contentView");
            ImageView imageView = (ImageView) view2.findViewById(R.id.bv2);
            C7573i.m23582a((Object) imageView, "contentView.location_state_image");
            Context context = this.context;
            C7573i.m23582a((Object) context, "context");
            imageView.setBackground(context.getResources().getDrawable(R.drawable.bz_));
        } else {
            View view3 = this.contentView;
            C7573i.m23582a((Object) view3, "contentView");
            TextView textView2 = (TextView) view3.findViewById(R.id.dpq);
            C7573i.m23582a((Object) textView2, "contentView.turn_on_location");
            Context context2 = this.context;
            C7573i.m23582a((Object) context2, "context");
            textView2.setText(context2.getResources().getString(R.string.ek5));
            View view4 = this.contentView;
            C7573i.m23582a((Object) view4, "contentView");
            ImageView imageView2 = (ImageView) view4.findViewById(R.id.bv2);
            C7573i.m23582a((Object) imageView2, "contentView.location_state_image");
            Context context3 = this.context;
            C7573i.m23582a((Object) context3, "context");
            imageView2.setBackground(context3.getResources().getDrawable(R.drawable.bza));
        }
        if (z) {
            C8947c<Integer> cVar = C8946b.f24357I;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.LIV…EVIEW_LOCATION_SHOW_STATE");
            cVar.mo22118a(Integer.valueOf(1));
        } else {
            C8947c<Integer> cVar2 = C8946b.f24357I;
            C7573i.m23582a((Object) cVar2, "LivePluginProperties.LIV…EVIEW_LOCATION_SHOW_STATE");
            cVar2.mo22118a(Integer.valueOf(0));
        }
        mo9834a().mo9595b().postValue(Boolean.valueOf(z));
    }
}
