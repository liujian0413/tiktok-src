package com.p280ss.android.ugc.aweme.comment.widgets;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.comment.param.VideoCommentPageParam;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget */
public abstract class BaseCommentWidget extends Widget implements C0053p<C23083a> {

    /* renamed from: a */
    protected Aweme f64345a;

    /* renamed from: i */
    protected VideoCommentPageParam f64346i;

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget$a */
    protected static final class C24378a<T extends View> {

        /* renamed from: a */
        public T f64347a;

        /* renamed from: b */
        public final int f64348b;

        public C24378a(int i) {
            this.f64348b = i;
        }

        /* renamed from: a */
        public final T mo63309a(BaseCommentWidget baseCommentWidget, C7595j<?> jVar) {
            C7573i.m23587b(baseCommentWidget, "thisRef");
            C7573i.m23587b(jVar, "property");
            if (this.f64347a == null) {
                T findViewById = baseCommentWidget.f60921d.findViewById(this.f64348b);
                if (findViewById == null) {
                    C7573i.m23580a();
                }
                this.f64347a = findViewById;
            }
            T t = this.f64347a;
            if (t == null) {
                C7573i.m23583a("_value");
            }
            return t;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo63308h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Aweme mo63302a() {
        Aweme aweme = this.f64345a;
        if (aweme == null) {
            C7573i.m23583a("aweme");
        }
        return aweme;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo63304d() {
        if (this.f64345a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo63305e() {
        if (this.f64346i != null) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f60922e.mo60131a((C0053p<C23083a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo63306f() {
        if (!mo63305e()) {
            return "";
        }
        VideoCommentPageParam videoCommentPageParam = this.f64346i;
        if (videoCommentPageParam == null) {
            C7573i.m23583a("params");
        }
        String eventType = videoCommentPageParam.getEventType();
        C7573i.m23582a((Object) eventType, "params.eventType");
        return eventType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo63307g() {
        if (!mo63305e()) {
            return "";
        }
        VideoCommentPageParam videoCommentPageParam = this.f64346i;
        if (videoCommentPageParam == null) {
            C7573i.m23583a("params");
        }
        String enterFrom = videoCommentPageParam.getEnterFrom();
        C7573i.m23582a((Object) enterFrom, "params.enterFrom");
        return enterFrom;
    }

    public void onCreate() {
        super.onCreate();
        mo63308h();
        C0053p pVar = this;
        this.f60922e.mo60133a("comment_visible", pVar, true).mo60133a("comment_aweme_and_params", pVar, true);
    }

    /* renamed from: a */
    protected static <T extends View> C24378a<T> m80119a(int i) {
        return new C24378a<>(i);
    }

    /* renamed from: a */
    protected static void m80120a(View... viewArr) {
        C7573i.m23587b(viewArr, "views");
        for (View visibility : viewArr) {
            visibility.setVisibility(0);
        }
    }

    /* renamed from: b */
    protected static void m80121b(View... viewArr) {
        C7573i.m23587b(viewArr, "views");
        for (View visibility : viewArr) {
            visibility.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            int hashCode = str.hashCode();
            if (hashCode != 278836882) {
                if (hashCode == 2016314694 && str.equals("comment_aweme_and_params")) {
                    Pair pair = (Pair) aVar.mo60161a();
                    if (pair != null) {
                        Aweme aweme = (Aweme) pair.getFirst();
                        if (aweme != null) {
                            this.f64345a = aweme;
                            Pair pair2 = (Pair) aVar.mo60161a();
                            if (pair2 != null) {
                                VideoCommentPageParam videoCommentPageParam = (VideoCommentPageParam) pair2.getSecond();
                                if (videoCommentPageParam != null) {
                                    this.f64346i = videoCommentPageParam;
                                }
                            }
                        }
                    }
                }
            } else if (str.equals("comment_visible")) {
                Boolean bool = (Boolean) aVar.mo60161a();
                if (bool != null) {
                    bool.booleanValue();
                }
            }
        }
    }
}
