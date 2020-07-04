package com.p280ss.android.ugc.aweme.account.login.viewmodel;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.lobby.internal.C12226d;
import com.p280ss.android.ugc.aweme.account.login.LoginType;
import com.p280ss.android.ugc.aweme.account.login.view.LoginItemView;
import com.p280ss.android.ugc.aweme.account.p951l.C21243f;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.C23362b;
import com.p280ss.android.ugc.aweme.base.p1056b.C23275a;
import com.p280ss.android.ugc.aweme.base.p1056b.C23278c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.login.viewmodel.a */
public class C22162a extends C23362b<LoginItemView> {

    /* renamed from: a */
    public int f59214a;

    /* renamed from: b */
    public OnClickListener f59215b;

    /* renamed from: c */
    public int f59216c;

    /* renamed from: com.ss.android.ugc.aweme.account.login.viewmodel.a$a */
    public static class C22164a {
        /* renamed from: a */
        public static C23275a m73599a(String str) {
            return C23275a.m76430a("login", str);
        }

        /* renamed from: a */
        private static boolean m73602a(LoginType loginType) {
            if (loginType == LoginType.GOOGLE) {
                return C12226d.m35546a().mo29969c("google");
            }
            return true;
        }

        /* renamed from: a */
        public static List<C22162a> m73600a(final C23278c cVar, Boolean bool) {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            LoginType[] a = C21243f.m71502a();
            ArrayList arrayList = new ArrayList(a.length);
            C22162a aVar = null;
            for (LoginType loginType : a) {
                if (m73602a(loginType)) {
                    switch (loginType) {
                        case FACEBOOK:
                            C221651 r7 = new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    cVar.mo57183a(C22164a.m73599a("facebook"));
                                }
                            };
                            if (z) {
                                i = R.string.acy;
                            } else {
                                i = R.string.ab9;
                            }
                            aVar = new C22162a(R.drawable.wb, r7, i);
                            break;
                        case TWITTER:
                            C221662 r72 = new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    cVar.mo57183a(C22164a.m73599a("twitter"));
                                }
                            };
                            if (z) {
                                i2 = R.string.ad5;
                            } else {
                                i2 = R.string.abf;
                            }
                            aVar = new C22162a(R.drawable.wg, r72, i2);
                            break;
                        case GOOGLE:
                            if (bool != null) {
                                i3 = R.drawable.wa;
                            } else {
                                i3 = R.drawable.wc;
                            }
                            C221673 r73 = new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    cVar.mo57183a(C22164a.m73599a("google"));
                                }
                            };
                            if (z) {
                                i4 = R.string.acz;
                            } else {
                                i4 = R.string.ab_;
                            }
                            aVar = new C22162a(i3, r73, i4);
                            break;
                        case LINE:
                            C221684 r74 = new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    cVar.mo57183a(C22164a.m73599a("line"));
                                }
                            };
                            if (z) {
                                i5 = R.string.ad2;
                            } else {
                                i5 = R.string.abc;
                            }
                            aVar = new C22162a(R.drawable.wf, r74, i5);
                            break;
                        case KAKAOTALK:
                            C221695 r75 = new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    cVar.mo57183a(C22164a.m73599a("kakaotalk"));
                                }
                            };
                            if (z) {
                                i6 = R.string.ad1;
                            } else {
                                i6 = R.string.abb;
                            }
                            aVar = new C22162a(R.drawable.we, r75, i6);
                            break;
                        case INSTAGRAM:
                            C221706 r76 = new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    cVar.mo57183a(C22164a.m73599a("instagram"));
                                }
                            };
                            if (z) {
                                i7 = R.string.ad0;
                            } else {
                                i7 = R.string.aba;
                            }
                            aVar = new C22162a(R.drawable.wd, r76, i7);
                            break;
                        case VK:
                            C22171b bVar = new C22171b(cVar);
                            if (z) {
                                i8 = R.string.ad6;
                            } else {
                                i8 = R.string.abg;
                            }
                            aVar = new C22162a(R.drawable.wh, bVar, i8);
                            break;
                    }
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
    }

    public C22162a(int i, OnClickListener onClickListener, int i2) {
        this.f59214a = i;
        this.f59215b = onClickListener;
        this.f59216c = i2;
    }
}
