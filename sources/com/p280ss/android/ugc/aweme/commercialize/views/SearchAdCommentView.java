package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24559a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.p984ad.common.C22437a;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a;
import com.p280ss.android.ugc.aweme.p984ad.p986b.C22385a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdCommentView */
public final class SearchAdCommentView extends AdCommentView {

    /* renamed from: e */
    private final int f67176e;

    /* renamed from: f */
    private final int f67177f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65959a() {
        C42961az.m136382c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo65963e() {
        return true;
    }

    public final String getEventType() {
        return "general_search";
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42961az.m136383d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65961c() {
        this.mContentView.setTextColor(this.f67177f);
        MentionTextView mentionTextView = this.mContentView;
        C7573i.m23582a((Object) mentionTextView, "mContentView");
        CommentStruct data = getData();
        C7573i.m23582a((Object) data, "data");
        mentionTextView.setText(data.getCommentInfo());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65960b() {
        super.mo65960b();
        TextView textView = this.mCommentTimeView;
        C7573i.m23582a((Object) textView, "mCommentTimeView");
        textView.setVisibility(8);
        View view = this.mReplyContainer;
        C7573i.m23582a((Object) view, "mReplyContainer");
        view.setVisibility(8);
        ImageView imageView = this.mMenuItem;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView2 = this.mCommentTimeView;
        C7573i.m23582a((Object) textView2, "mCommentTimeView");
        textView2.setVisibility(8);
        this.mTitleView.setTextColor(this.f67176e);
        CircleImageView circleImageView = this.mAvatarView;
        C7573i.m23582a((Object) circleImageView, "mAvatarView");
        LayoutParams layoutParams = circleImageView.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).leftMargin = 0;
            CircleImageView circleImageView2 = this.mAvatarView;
            C7573i.m23582a((Object) circleImageView2, "mAvatarView");
            circleImageView2.setLayoutParams(layoutParams);
        }
    }

    public SearchAdCommentView(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null);
    }

    @C7709l
    public final void onAdCommentDiggEvent(C24559a aVar) {
        C7573i.m23587b(aVar, "event");
        mo65962d();
    }

    public final void onClick(View view) {
        if (!(view == null || getData() == null || this.f66820b == null)) {
            Aweme aweme = this.f66820b;
            C7573i.m23582a((Object) aweme, "aweme");
            if (aweme.isAd()) {
                Aweme aweme2 = this.f66820b;
                C7573i.m23582a((Object) aweme2, "aweme");
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                if (awemeRawAd == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) awemeRawAd, "aweme.awemeRawAd!!");
                int id = view.getId();
                if (id == R.id.bh7) {
                    CommentStruct data = getData();
                    C7573i.m23582a((Object) data, "data");
                    CommentStruct data2 = getData();
                    C7573i.m23582a((Object) data2, "data");
                    int i = 1;
                    if (data2.getUserDigged() == 1) {
                        i = 0;
                    }
                    data.setUserDigged(i);
                    mo65962d();
                    C22437a a = C22437a.m74284a();
                    String diggSpKey = getDiggSpKey();
                    CommentStruct data3 = getData();
                    C7573i.m23582a((Object) data3, "data");
                    a.mo59002b(diggSpKey, data3.getUserDigged());
                } else if (id == R.id.title || id == R.id.ic) {
                    mo65964f();
                    Context context = view.getContext();
                    C7573i.m23582a((Object) context, "view.context");
                    m83866b(context, awemeRawAd);
                } else {
                    if (id == R.id.z5 || id == R.id.a29 || id == R.id.zt) {
                        if (!(this.f66821c == null || this.f66821c.get() == null)) {
                            Object obj = this.f66821c.get();
                            if (obj == null) {
                                C7573i.m23580a();
                            }
                            ((C22385a) obj).mo58877a(this, false, "search_ad_comment");
                        }
                        Context context2 = view.getContext();
                        C7573i.m23582a((Object) context2, "view.context");
                        m83865a(context2, awemeRawAd);
                    }
                }
            }
        }
    }

    public SearchAdCommentView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static void m83865a(Context context, AwemeRawAd awemeRawAd) {
        C22375a a = C22375a.m74074a();
        C7573i.m23582a((Object) a, "AdDependManager.inst()");
        a.f59713g.mo58845a(context, String.valueOf(awemeRawAd.getCreativeId().longValue()), "comment_sign", awemeRawAd.getLogExtra());
    }

    /* renamed from: b */
    private static void m83866b(Context context, AwemeRawAd awemeRawAd) {
        C22375a a = C22375a.m74074a();
        C7573i.m23582a((Object) a, "AdDependManager.inst()");
        a.f59713g.mo58851b(context, String.valueOf(awemeRawAd.getCreativeId().longValue()), "comment_sign", awemeRawAd.getLogExtra());
    }

    public SearchAdCommentView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f67176e = context.getResources().getColor(R.color.a5h);
        this.f67177f = context.getResources().getColor(R.color.a5e);
    }
}
