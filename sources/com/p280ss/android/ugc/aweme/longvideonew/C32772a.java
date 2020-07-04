package com.p280ss.android.ugc.aweme.longvideonew;

import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.setting.C37649i;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.a */
public final class C32772a {

    /* renamed from: a */
    public final TextView f85476a;

    /* renamed from: b */
    public final Aweme f85477b;

    /* renamed from: a */
    public final void mo84279a() {
        C42961az.m136383d(this);
    }

    /* renamed from: b */
    private final int m106070b() {
        if (this.f85477b == null) {
            return 0;
        }
        AwemeStatistics statistics = this.f85477b.getStatistics();
        if (statistics == null) {
            return 0;
        }
        int commentCount = statistics.getCommentCount();
        if (this.f85477b.getAdCommentStruct() != null && commentCount > 0) {
            commentCount++;
        }
        return commentCount;
    }

    /* renamed from: c */
    private void m106071c() {
        if (this.f85476a != null) {
            if (C37649i.m120472b(this.f85477b) || C32698a.m105818a(this.f85477b)) {
                this.f85476a.setText("0");
            } else {
                this.f85476a.setText(C30537o.m99738a((long) m106070b()));
            }
        }
    }

    @C7709l
    public final void onCommentEvent(C24029a aVar) {
        C7573i.m23587b(aVar, "event");
        int i = aVar.f63539a;
        if (i == 3 || i == 4 || i == 8) {
            Object obj = aVar.f63540b;
            if (obj != null) {
                Object[] objArr = (Object[]) obj;
                if (objArr != null && objArr.length == 2) {
                    if (objArr[0] != null) {
                        m106071c();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
            }
        }
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        String str;
        if (anVar != null && 14 == anVar.f74631a) {
            Object obj = anVar.f74632b;
            if (obj != null) {
                String str2 = (String) obj;
                Aweme aweme = this.f85477b;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (C6319n.m19594a(str, str2)) {
                    m106071c();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        }
    }

    public C32772a(TextView textView, Aweme aweme) {
        AwemeStatistics awemeStatistics;
        C7573i.m23587b(textView, "mCommentCountView");
        this.f85476a = textView;
        this.f85477b = aweme;
        C42961az.m136382c(this);
        this.f85476a.setVisibility(0);
        Aweme aweme2 = this.f85477b;
        if (aweme2 != null) {
            awemeStatistics = aweme2.getStatistics();
        } else {
            awemeStatistics = null;
        }
        if (awemeStatistics == null) {
            this.f85476a.setText("0");
        } else if (C37649i.m120472b(this.f85477b) || C32698a.m105818a(this.f85477b)) {
            this.f85476a.setText("0");
        } else {
            try {
                this.f85476a.setText(C30537o.m99738a((long) m106070b()));
            } catch (Exception unused) {
                this.f85476a.setText("0");
            }
        }
    }
}
