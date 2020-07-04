package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.android.live.broadcast.model.C2755e;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.android.livesdk.utils.C9083u;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

public final class PreviewSelectTitleWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9433a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewSelectTitleWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewSelectTitleWidget.class), "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;"))};

    /* renamed from: d */
    public static final C3035a f9434d = new C3035a(null);

    /* renamed from: b */
    public int f9435b;

    /* renamed from: c */
    public String f9436c = "";

    /* renamed from: e */
    private final C7541d f9437e = C7546e.m23569a(new C3041g(this));

    /* renamed from: f */
    private final C7541d f9438f = C7546e.m23569a(new C3036b(this));

    /* renamed from: g */
    private C0053p<Integer> f9439g = new C3042h(this);

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$a */
    public static final class C3035a {
        private C3035a() {
        }

        public /* synthetic */ C3035a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$b */
    static final class C3036b extends Lambda implements C7561a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f9440a;

        C3036b(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f9440a = previewSelectTitleWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveEventViewModel invoke() {
            Context context = this.f9440a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveEventViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$c */
    static final class C3037c<T> implements C0053p<C2755e> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f9441a;

        C3037c(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f9441a = previewSelectTitleWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C2755e eVar) {
            if (eVar != null && !TextUtils.isEmpty(eVar.f8730c)) {
                View view = this.f9441a.contentView;
                C7573i.m23582a((Object) view, "contentView");
                LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.dor);
                C7573i.m23582a((Object) liveEditText, "contentView.ttlive_preview_title");
                liveEditText.setHint("");
                View view2 = this.f9441a.contentView;
                C7573i.m23582a((Object) view2, "contentView");
                ((LiveEditText) view2.findViewById(R.id.dor)).setText(eVar.f8730c);
                View view3 = this.f9441a.contentView;
                C7573i.m23582a((Object) view3, "contentView");
                LiveEditText liveEditText2 = (LiveEditText) view3.findViewById(R.id.dor);
                C7573i.m23582a((Object) liveEditText2, "contentView.ttlive_preview_title");
                if (!TextUtils.isEmpty(liveEditText2.getText())) {
                    View view4 = this.f9441a.contentView;
                    C7573i.m23582a((Object) view4, "contentView");
                    LiveEditText liveEditText3 = (LiveEditText) view4.findViewById(R.id.dor);
                    View view5 = this.f9441a.contentView;
                    C7573i.m23582a((Object) view5, "contentView");
                    LiveEditText liveEditText4 = (LiveEditText) view5.findViewById(R.id.dor);
                    C7573i.m23582a((Object) liveEditText4, "contentView.ttlive_preview_title");
                    Editable text = liveEditText4.getText();
                    if (text == null) {
                        C7573i.m23580a();
                    }
                    liveEditText3.setSelection(text.length());
                }
                PreviewSelectTitleWidget previewSelectTitleWidget = this.f9441a;
                String str = eVar.f8730c;
                C7573i.m23582a((Object) str, "it.mTitle");
                previewSelectTitleWidget.f9436c = str;
                this.f9441a.mo9843a().mo9600g().postValue(Integer.valueOf(0));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$d */
    static final class C3038d<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f9442a;

        C3038d(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f9442a = previewSelectTitleWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null && num.intValue() == 1) {
                C0052o h = this.f9442a.mo9843a().mo9601h();
                View view = this.f9442a.contentView;
                C7573i.m23582a((Object) view, "contentView");
                LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.dor);
                C7573i.m23582a((Object) liveEditText, "contentView.ttlive_preview_title");
                h.setValue(String.valueOf(liveEditText.getText()));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$e */
    public static final class C3039e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f9443a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C3039e(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f9443a = previewSelectTitleWidget;
        }

        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(String.valueOf(editable))) {
                View view = this.f9443a.contentView;
                C7573i.m23582a((Object) view, "contentView");
                LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.dor);
                C7573i.m23582a((Object) liveEditText, "contentView.ttlive_preview_title");
                Context context = this.f9443a.context;
                C7573i.m23582a((Object) context, "context");
                liveEditText.setHint(context.getResources().getString(R.string.eku));
                this.f9443a.mo9843a().mo9600g().postValue(Integer.valueOf(2));
            } else {
                View view2 = this.f9443a.contentView;
                C7573i.m23582a((Object) view2, "contentView");
                LiveEditText liveEditText2 = (LiveEditText) view2.findViewById(R.id.dor);
                C7573i.m23582a((Object) liveEditText2, "contentView.ttlive_preview_title");
                liveEditText2.setHint("");
                if (!C7573i.m23585a((Object) this.f9443a.f9436c, (Object) String.valueOf(editable))) {
                    this.f9443a.mo9843a().mo9600g().postValue(Integer.valueOf(1));
                }
            }
            this.f9443a.mo9843a().mo9601h().setValue(String.valueOf(editable));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$f */
    static final class C3040f implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f9444a;

        /* renamed from: b */
        final /* synthetic */ View f9445b;

        C3040f(PreviewSelectTitleWidget previewSelectTitleWidget, View view) {
            this.f9444a = previewSelectTitleWidget;
            this.f9445b = view;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f9444a.context != null) {
                Context context = this.f9444a.context;
                View view2 = this.f9444a.contentView;
                C7573i.m23582a((Object) view2, "contentView");
                C9083u.m27121b(context, (LiveEditText) view2.findViewById(R.id.dor));
            }
            this.f9445b.setFocusable(true);
            this.f9445b.setFocusableInTouchMode(true);
            this.f9445b.requestFocus();
            return false;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$g */
    static final class C3041g extends Lambda implements C7561a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f9446a;

        C3041g(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f9446a = previewSelectTitleWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveViewModel invoke() {
            Context context = this.f9446a.context;
            if (context != null) {
                return (StartLiveViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$h */
    static final class C3042h<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f9447a;

        C3042h(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f9447a = previewSelectTitleWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                this.f9447a.f9435b = num.intValue();
                this.f9447a.mo9844a(this.f9447a.f9435b);
            }
        }
    }

    /* renamed from: b */
    private final StartLiveEventViewModel m11666b() {
        return (StartLiveEventViewModel) this.f9438f.getValue();
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9843a() {
        return (StartLiveViewModel) this.f9437e.getValue();
    }

    public final int getLayoutId() {
        return R.layout.alv;
    }

    public final void onDestroy() {
        mo9843a().mo9596c().removeObserver(this.f9439g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r6 = this;
            super.onCreate()
            int r0 = r6.f9435b
            if (r0 == 0) goto L_0x000d
            int r0 = r6.f9435b
            r6.mo9844a(r0)
            goto L_0x0012
        L_0x000d:
            r0 = 11
            r6.mo9844a(r0)
        L_0x0012:
            android.view.View r0 = r6.contentView
            java.lang.String r1 = "contentView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 2131302305(0x7f0917a1, float:1.8222692E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r0 = (com.bytedance.android.live.core.widget.LiveEditText) r0
            java.lang.String r2 = "contentView.ttlive_preview_title"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            android.content.Context r2 = r6.context
            java.lang.String r3 = "context"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131827836(0x7f111c7c, float:1.9288596E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setHint(r2)
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r6.mo9843a()
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo9596c()
            r2 = r6
            android.arch.lifecycle.i r2 = (android.arch.lifecycle.C0043i) r2
            android.arch.lifecycle.p<java.lang.Integer> r3 = r6.f9439g
            r0.observe(r2, r3)
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r6.mo9843a()
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo9592a()
            com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$c r3 = new com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$c
            r3.<init>(r6)
            android.arch.lifecycle.p r3 = (android.arch.lifecycle.C0053p) r3
            r0.observe(r2, r3)
            com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel r0 = r6.m11666b()
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo9470d()
            com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$d r3 = new com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$d
            r3.<init>(r6)
            android.arch.lifecycle.p r3 = (android.arch.lifecycle.C0053p) r3
            r0.observe(r2, r3)
            java.lang.Class<com.bytedance.android.live.user.a> r0 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            com.bytedance.android.live.user.a r0 = (com.bytedance.android.live.user.C3592a) r0
            if (r0 == 0) goto L_0x0087
            com.bytedance.android.livesdk.user.e r0 = r0.user()
            if (r0 == 0) goto L_0x0087
            com.bytedance.android.live.base.model.user.IUser r0 = r0.mo22165a()
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            boolean r2 = r0 instanceof com.bytedance.android.live.base.model.user.User
            if (r2 == 0) goto L_0x016d
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            java.lang.String r0 = r0.getNickName()
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x016d
            int r2 = r0.length()
            r3 = 4
            r4 = 0
            if (r2 <= r3) goto L_0x00dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "title"
            kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = r0.substring(r4, r3)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r2.append(r0)
            android.content.Context r0 = r6.context
            java.lang.String r3 = "context"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131827567(0x7f111b6f, float:1.928805E38)
            java.lang.String r0 = r0.getString(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x00dd
        L_0x00d5:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            android.content.Context r2 = r6.context
            java.lang.String r3 = "context"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828835(0x7f112063, float:1.9290622E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            java.lang.String r0 = r2.getString(r3, r5)
            android.view.View r2 = r6.contentView
            java.lang.String r3 = "contentView"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.view.View r2 = r2.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r2 = (com.bytedance.android.live.core.widget.LiveEditText) r2
            java.lang.String r3 = "contentView.ttlive_preview_title"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r3 = ""
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setHint(r3)
            android.view.View r2 = r6.contentView
            java.lang.String r3 = "contentView"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.view.View r2 = r2.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r2 = (com.bytedance.android.live.core.widget.LiveEditText) r2
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            android.view.View r2 = r6.contentView
            java.lang.String r3 = "contentView"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.view.View r2 = r2.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r2 = (com.bytedance.android.live.core.widget.LiveEditText) r2
            java.lang.String r3 = "contentView.ttlive_preview_title"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L_0x014c
            android.view.View r3 = r6.contentView
            java.lang.String r5 = "contentView"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            android.view.View r3 = r3.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r3 = (com.bytedance.android.live.core.widget.LiveEditText) r3
            int r2 = r2.length()
            r3.setSelection(r2)
        L_0x014c:
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r2 = r6.mo9843a()
            android.arch.lifecycle.o r2 = r2.mo9601h()
            r2.setValue(r0)
            java.lang.String r2 = "title"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            r6.f9436c = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r6.mo9843a()
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo9600g()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.postValue(r2)
        L_0x016d:
            android.view.View r0 = r6.contentView
            java.lang.String r2 = "contentView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r0 = (com.bytedance.android.live.core.widget.LiveEditText) r0
            com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$e r1 = new com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$e
            r1.<init>(r6)
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            r0.addTextChangedListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget.onCreate():void");
    }

    /* renamed from: a */
    public final void mo9845a(View view) {
        if (view != null) {
            view.setOnTouchListener(new C3040f(this, view));
        }
    }

    /* renamed from: a */
    public final void mo9844a(int i) {
        InputFilter[] inputFilterArr = {new LengthFilter(i)};
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.dor);
        C7573i.m23582a((Object) liveEditText, "contentView.ttlive_preview_title");
        liveEditText.setFilters(inputFilterArr);
    }
}
