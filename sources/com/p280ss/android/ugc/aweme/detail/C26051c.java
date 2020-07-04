package com.p280ss.android.ugc.aweme.detail;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;

/* renamed from: com.ss.android.ugc.aweme.detail.c */
public final class C26051c {

    /* renamed from: a */
    public static final C26051c f68856a = new C26051c();

    /* renamed from: com.ss.android.ugc.aweme.detail.c$a */
    static final class C26052a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f68857a;

        /* renamed from: b */
        final /* synthetic */ String f68858b;

        /* renamed from: c */
        final /* synthetic */ String f68859c;

        /* renamed from: d */
        final /* synthetic */ String f68860d;

        /* renamed from: e */
        final /* synthetic */ ObjectRef f68861e;

        /* renamed from: f */
        final /* synthetic */ boolean f68862f;

        /* renamed from: g */
        final /* synthetic */ View f68863g;

        C26052a(Activity activity, String str, String str2, String str3, ObjectRef objectRef, boolean z, View view) {
            this.f68857a = activity;
            this.f68858b = str;
            this.f68859c = str2;
            this.f68860d = str3;
            this.f68861e = objectRef;
            this.f68862f = z;
            this.f68863g = view;
        }

        public final void run() {
            Object systemService = this.f68857a.getApplicationContext().getSystemService("layout_inflater");
            if (systemService != null) {
                View inflate = ((LayoutInflater) systemService).inflate(R.layout.jo, null);
                View findViewById = inflate.findViewById(R.id.dh_);
                if (findViewById != null) {
                    ((DmtTextView) findViewById).setText(R.string.aog);
                    View findViewById2 = inflate.findViewById(R.id.dha);
                    if (findViewById2 != null) {
                        ((DmtTextView) findViewById2).setText(R.string.aoo);
                        View findViewById3 = inflate.findViewById(R.id.bqv);
                        if (findViewById3 != null) {
                            ((LinearLayout) findViewById3).setOnClickListener(new OnClickListener(this) {

                                /* renamed from: a */
                                final /* synthetic */ C26052a f68864a;

                                {
                                    this.f68864a = r1;
                                }

                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    C26051c.f68856a.mo67585a(this.f68864a.f68858b, this.f68864a.f68859c, this.f68864a.f68860d);
                                    ((C35481c) this.f68864a.f68861e.element).dismiss();
                                    C7195s a = C7195s.m22438a();
                                    StringBuilder sb = new StringBuilder("aweme://favorite?enter_from=");
                                    sb.append(this.f68864a.f68858b);
                                    sb.append("&enter_method");
                                    sb.append("=click_favourite_hint&tab_name=");
                                    sb.append(this.f68864a.f68859c);
                                    a.mo18682a(sb.toString());
                                }
                            });
                            LayoutParams layoutParams = new LayoutParams(-2, -2);
                            layoutParams.leftMargin = (int) C9738o.m28708b((Context) this.f68857a, 4.0f);
                            View findViewById4 = inflate.findViewById(R.id.dha);
                            C7573i.m23582a((Object) findViewById4, "contentView.findViewById<View>(R.id.text2)");
                            findViewById4.setLayoutParams(layoutParams);
                            ((C35481c) this.f68861e.element).mo90251a((int) C9738o.m28708b((Context) this.f68857a, 202.0f), (int) C9738o.m28708b((Context) this.f68857a, 50.0f));
                            ((C35481c) this.f68861e.element).mo90276f(Color.parseColor("#33FFFFFF"));
                            ((C35481c) this.f68861e.element).f93104l = 200;
                            ((C35481c) this.f68861e.element).f93105m = 300;
                            ((C35481c) this.f68861e.element).mo90254a(inflate);
                            ((C35481c) this.f68861e.element).f93102j = 3000;
                            if (!TextUtils.equals(this.f68859c, "compilation")) {
                                ((C35481c) this.f68861e.element).mo90257a(this.f68863g, 80, true, 0.0f);
                            } else if (this.f68862f) {
                                ((C35481c) this.f68861e.element).mo90257a(this.f68863g, 48, true, 0.0f);
                            } else {
                                ((C35481c) this.f68861e.element).mo90257a(this.f68863g, 80, true, 0.0f);
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
            }
        }
    }

    private C26051c() {
    }

    /* renamed from: a */
    private static String m85575a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -2076770877) {
            if (hashCode != 3449699) {
                if (hashCode != 104263205) {
                    if (hashCode == 1402633315 && str.equals("challenge")) {
                        return "challenge_id";
                    }
                } else if (str.equals("music")) {
                    return "music_id";
                }
            } else if (str.equals("prop")) {
                return "prop_id";
            }
        } else if (str.equals("compilation")) {
            return "compilation_id";
        }
        return "";
    }

    /* renamed from: a */
    public final void mo67585a(String str, String str2, String str3) {
        C6907h.m21524a("click_favourite_hint", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a(m85575a(str2), str3).f60753a);
    }

    /* renamed from: a */
    public static final C35481c m85573a(View view, Activity activity, String str, String str2, String str3, boolean z) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str2, "tabName");
        C7573i.m23587b(str3, "id");
        if (view == null) {
            return null;
        }
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = new C35481c(activity);
        C26052a aVar = new C26052a(activity, str, str2, str3, objectRef, z, view);
        view.post(aVar);
        return (C35481c) objectRef.element;
    }
}
