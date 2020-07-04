package com.p280ss.android.ugc.aweme.p984ad.comment;

import android.arch.lifecycle.C0053p;
import android.view.View;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7573i;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.BaseAdCommentWidget */
public abstract class BaseAdCommentWidget extends Widget implements C0053p<KVData> {

    /* renamed from: a */
    protected Aweme f59724a;

    /* renamed from: b */
    protected VideoCommentPageParam f59725b;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.BaseAdCommentWidget$a */
    protected static final class C22390a<T extends View> {

        /* renamed from: a */
        public T f59726a;

        /* renamed from: b */
        public final int f59727b;

        public C22390a(int i) {
            this.f59727b = i;
        }

        /* renamed from: a */
        public final T mo58891a(BaseAdCommentWidget baseAdCommentWidget, C7595j<?> jVar) {
            C7573i.m23587b(baseAdCommentWidget, "thisRef");
            C7573i.m23587b(jVar, "property");
            if (this.f59726a == null) {
                T findViewById = baseAdCommentWidget.contentView.findViewById(this.f59727b);
                if (findViewById == null) {
                    C7573i.m23580a();
                }
                this.f59726a = findViewById;
            }
            T t = this.f59726a;
            if (t == null) {
                C7573i.m23583a("_value");
            }
            return t;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo58890d() {
    }

    /* renamed from: e */
    private boolean mo58892e() {
        if (this.f59725b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Aweme mo58886a() {
        Aweme aweme = this.f59724a;
        if (aweme == null) {
            C7573i.m23583a("aweme");
        }
        return aweme;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo58888b() {
        if (this.f59724a != null) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.dataCenter.removeObserver(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo58889c() {
        if (!mo58892e()) {
            return "";
        }
        VideoCommentPageParam videoCommentPageParam = this.f59725b;
        if (videoCommentPageParam == null) {
            C7573i.m23583a("params");
        }
        String eventType = videoCommentPageParam.getEventType();
        C7573i.m23582a((Object) eventType, "params.eventType");
        return eventType;
    }

    public void onCreate() {
        super.onCreate();
        mo58890d();
        C0053p pVar = this;
        this.dataCenter.observe("comment_aweme", pVar, true).observe("comment_params", pVar, true).observe("comment_visible", pVar, true);
    }

    /* renamed from: a */
    protected static <T extends View> C22390a<T> m74148a(int i) {
        return new C22390a<>(i);
    }

    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null) {
            String key = kVData.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -1122609433) {
                if (hashCode != -31658138) {
                    if (hashCode == 278836882 && key.equals("comment_visible")) {
                        Boolean bool = (Boolean) kVData.getData();
                        if (bool != null) {
                            C7573i.m23582a((Object) bool, "kvData.getData<Boolean>() ?: return");
                            bool.booleanValue();
                        }
                    }
                } else if (key.equals("comment_params")) {
                    VideoCommentPageParam videoCommentPageParam = (VideoCommentPageParam) kVData.getData();
                    if (videoCommentPageParam != null) {
                        this.f59725b = videoCommentPageParam;
                    }
                }
            } else if (key.equals("comment_aweme")) {
                Aweme aweme = (Aweme) kVData.getData();
                if (aweme != null) {
                    this.f59724a = aweme;
                }
            }
        }
    }
}
