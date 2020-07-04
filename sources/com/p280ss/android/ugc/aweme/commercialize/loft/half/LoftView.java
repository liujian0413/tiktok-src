package com.p280ss.android.ugc.aweme.commercialize.loft.half;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftView */
public final class LoftView extends ViewGroup {

    /* renamed from: a */
    public LoftListAdapter f65578a;

    /* renamed from: b */
    private String f65579b;

    /* renamed from: c */
    private String f65580c;

    /* renamed from: d */
    private C7561a<C7581n> f65581d;

    /* renamed from: e */
    private HashMap f65582e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftView$a */
    static final class C24870a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoftView f65583a;

        C24870a(LoftView loftView) {
            this.f65583a = loftView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f65583a.mo65025b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftView$b */
    static final class C24871b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoftView f65584a;

        C24871b(LoftView loftView) {
            this.f65584a = loftView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f65584a.mo65025b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftView$c */
    static final class C24872c<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ LoftView f65585a;

        C24872c(LoftView loftView) {
            this.f65585a = loftView;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f != null) {
                View a = this.f65585a.mo65021a((int) R.id.o0);
                C7573i.m23582a((Object) a, "bottom_mask");
                C7573i.m23582a((Object) f, "v");
                a.setAlpha(1.0f - f.floatValue());
                View a2 = this.f65585a.mo65021a((int) R.id.bv5);
                C7573i.m23582a((Object) a2, "loft_bg_mask");
                a2.setAlpha((f.floatValue() + 0.1f) * 0.85f);
                FrameLayout frameLayout = (FrameLayout) this.f65585a.mo65021a((int) R.id.dm5);
                C7573i.m23582a((Object) frameLayout, "top_header");
                frameLayout.setAlpha(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.half.LoftView$d */
    static final class C24873d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoftView f65586a;

        /* renamed from: b */
        final /* synthetic */ String f65587b;

        C24873d(LoftView loftView, String str) {
            this.f65586a = loftView;
            this.f65587b = str;
        }

        public final void run() {
            LoftView.m81612a(this.f65586a).f65550b = this.f65587b;
            LoftView.m81612a(this.f65586a).notifyDataSetChanged();
            this.f65586a.setTranslationY((float) this.f65586a.getHeight());
        }
    }

    public LoftView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LoftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo65021a(int i) {
        if (this.f65582e == null) {
            this.f65582e = new HashMap();
        }
        View view = (View) this.f65582e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f65582e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C7561a<C7581n> getDismissListener() {
        return this.f65581d;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42961az.m136382c(this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42961az.m136383d(this);
    }

    /* renamed from: b */
    public final void mo65025b() {
        ((LoftMaskViewParent) mo65021a((int) R.id.bv6)).setExpand(false);
    }

    /* renamed from: c */
    private final void m81614c() {
        ((LoftMaskViewParent) mo65021a((int) R.id.bv6)).getTotalMoveRate().observeForever(new C24872c(this));
    }

    /* renamed from: d */
    private final void m81615d() {
        LoftMaskViewParent loftMaskViewParent = (LoftMaskViewParent) mo65021a((int) R.id.bv6);
        View a = mo65021a((int) R.id.o0);
        C7573i.m23582a((Object) a, "bottom_mask");
        loftMaskViewParent.setBottomMask(a);
    }

    /* renamed from: e */
    private final void m81616e() {
        ((ImageView) mo65021a((int) R.id.ju)).setOnClickListener(new C24870a(this));
        mo65021a((int) R.id.bv5).setOnClickListener(new C24871b(this));
    }

    /* renamed from: f */
    private final void m81617f() {
        RecyclerView recyclerView = (RecyclerView) mo65021a((int) R.id.c3l);
        C7573i.m23582a((Object) recyclerView, "nested_list");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        this.f65578a = new LoftListAdapter(context);
        RecyclerView recyclerView2 = (RecyclerView) mo65021a((int) R.id.c3l);
        C7573i.m23582a((Object) recyclerView2, "nested_list");
        LoftListAdapter loftListAdapter = this.f65578a;
        if (loftListAdapter == null) {
            C7573i.m23583a("loftListAdapter");
        }
        recyclerView2.setAdapter(loftListAdapter);
    }

    /* renamed from: a */
    public final boolean mo65024a() {
        if (getTranslationY() == 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final /* synthetic */ LoftListAdapter m81612a(LoftView loftView) {
        LoftListAdapter loftListAdapter = loftView.f65578a;
        if (loftListAdapter == null) {
            C7573i.m23583a("loftListAdapter");
        }
        return loftListAdapter;
    }

    public final void setDismissListener(C7561a<C7581n> aVar) {
        this.f65581d = aVar;
        ((LoftMaskViewParent) mo65021a((int) R.id.bv6)).setDismissListener(aVar);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onJsBroacastReceiver(C27994k kVar) {
        C7573i.m23587b(kVar, "broadCastEvent");
        try {
            String string = kVar.f73730b.getString("eventName");
            if (string != null) {
                if (!C7573i.m23585a((Object) string, (Object) "second_floor_layout")) {
                    string = null;
                }
                if (string != null) {
                    if (!kVar.f73730b.has("data")) {
                        string = null;
                    }
                    if (string != null) {
                        JSONObject jSONObject = kVar.f73730b.getJSONObject("data");
                        if (jSONObject.has("width") && jSONObject.has("height") && jSONObject.has("loft_item_id") && !(!C7573i.m23585a((Object) this.f65579b, (Object) jSONObject.getString("loft_item_id")))) {
                            int a = C23486n.m77122a(jSONObject.getDouble("height"));
                            LoftListAdapter loftListAdapter = this.f65578a;
                            if (loftListAdapter == null) {
                                C7573i.m23583a("loftListAdapter");
                            }
                            loftListAdapter.f65551c = a;
                            LoftListAdapter loftListAdapter2 = this.f65578a;
                            if (loftListAdapter2 == null) {
                                C7573i.m23583a("loftListAdapter");
                            }
                            loftListAdapter2.notifyDataSetChanged();
                            LoftMaskViewParent loftMaskViewParent = (LoftMaskViewParent) mo65021a((int) R.id.bv6);
                            FrameLayout frameLayout = (FrameLayout) mo65021a((int) R.id.dm5);
                            C7573i.m23582a((Object) frameLayout, "top_header");
                            loftMaskViewParent.mo65000a(frameLayout, a);
                            if (mo65024a() && this.f65580c != null) {
                                LoftListAdapter loftListAdapter3 = this.f65578a;
                                if (loftListAdapter3 == null) {
                                    C7573i.m23583a("loftListAdapter");
                                }
                                CrossPlatformWebView crossPlatformWebView = loftListAdapter3.f65549a;
                                if (crossPlatformWebView != null) {
                                    String str = "second_floor_show";
                                    String str2 = this.f65580c;
                                    if (str2 == null) {
                                        C7573i.m23580a();
                                    }
                                    crossPlatformWebView.mo67473a(str, m81613a(str2, mo65024a(), this.f65579b), "");
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChildren(i, i2);
    }

    /* renamed from: a */
    public final void mo65022a(String str, String str2) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "itemId");
        if (!TextUtils.isEmpty(str)) {
            this.f65579b = str2;
            post(new C24873d(this, str));
        }
    }

    /* renamed from: a */
    public final void mo65023a(boolean z, String str) {
        C7573i.m23587b(str, "showType");
        setTranslationY(0.0f);
        this.f65580c = str;
        LoftListAdapter loftListAdapter = this.f65578a;
        if (loftListAdapter == null) {
            C7573i.m23583a("loftListAdapter");
        }
        CrossPlatformWebView crossPlatformWebView = loftListAdapter.f65549a;
        if (crossPlatformWebView != null) {
            String str2 = "second_floor_show";
            String str3 = this.f65580c;
            if (str3 == null) {
                C7573i.m23580a();
            }
            crossPlatformWebView.mo67473a(str2, m81613a(str3, mo65024a(), this.f65579b), "");
        }
        ((LoftMaskViewParent) mo65021a((int) R.id.bv6)).mo65001a(z);
    }

    /* renamed from: a */
    private static JSONObject m81613a(String str, boolean z, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("show_type", str);
        jSONObject.put("loft_item_id", str2);
        jSONObject.put("is_show", z);
        return jSONObject;
    }

    public LoftView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f65579b = "";
        LayoutInflater.from(context).inflate(R.layout.a8a, this, true);
        m81617f();
        m81616e();
        m81615d();
        m81614c();
    }

    public /* synthetic */ LoftView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C7573i.m23582a((Object) childAt, "view");
            int id = childAt.getId();
            if (id == R.id.bv5) {
                childAt.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else if (id == R.id.dm5) {
                childAt.layout(0, 0, getMeasuredWidth(), childAt.getMeasuredHeight());
            } else if (id == R.id.o0) {
                childAt.layout(0, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + childAt.getMeasuredHeight());
            } else if (id == R.id.bv6) {
                childAt.layout(0, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + childAt.getMeasuredHeight());
            }
        }
    }
}
