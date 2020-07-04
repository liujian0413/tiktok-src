package com.p280ss.android.ugc.aweme.shortvideo.videocategory;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PublishSettingItem;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui.ChooseVideoCategoryActivity.C41616a;
import com.p280ss.android.ugc.aweme.utils.C42993bx;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.b */
public final class C41593b implements C41589a {

    /* renamed from: d */
    public static final C41595a f108092d = new C41595a(null);

    /* renamed from: a */
    public VideoCategoryParam f108093a;

    /* renamed from: b */
    public final Activity f108094b;

    /* renamed from: c */
    public final AVETParameter f108095c;

    /* renamed from: e */
    private final PublishSettingItem f108096e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.b$a */
    public static final class C41595a {
        private C41595a() {
        }

        public /* synthetic */ C41595a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m132441a(VideoPublishEditModel videoPublishEditModel) {
            C7573i.m23587b(videoPublishEditModel, "model");
            if (!C6399b.m19945u() || videoPublishEditModel.getVideoLength() < 61000) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final boolean m132438a(VideoPublishEditModel videoPublishEditModel) {
        return C41595a.m132441a(videoPublishEditModel);
    }

    /* renamed from: a */
    private String m132437a() {
        VideoCategoryParam videoCategoryParam = this.f108093a;
        if (videoCategoryParam != null) {
            String categoryName = videoCategoryParam.getCategoryName();
            if (categoryName != null) {
                return categoryName;
            }
        }
        String string = this.f108094b.getString(R.string.a46);
        C7573i.m23582a((Object) string, "host.getString(R.string.classify_choose)");
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3 == null) goto L_0x000c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102218a(com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam r3) {
        /*
            r2 = this;
            r2.f108093a = r3
            com.ss.android.ugc.aweme.shortvideo.ui.PublishSettingItem r0 = r2.f108096e
            if (r3 == 0) goto L_0x000c
            java.lang.String r3 = r3.getCategoryName()
            if (r3 != 0) goto L_0x0015
        L_0x000c:
            android.app.Activity r3 = r2.f108094b
            r1 = 2131821685(0x7f110475, float:1.927612E38)
            java.lang.String r3 = r3.getString(r1)
        L_0x0015:
            r0.setSubtitle(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.videocategory.C41593b.mo102218a(com.ss.android.ugc.aweme.draft.model.VideoCategoryParam):void");
    }

    public C41593b(Activity activity, VideoCategoryParam videoCategoryParam, AVETParameter aVETParameter, View view) {
        C7573i.m23587b(activity, "host");
        C7573i.m23587b(aVETParameter, "mobParam");
        C7573i.m23587b(view, "rootView");
        this.f108094b = activity;
        this.f108095c = aVETParameter;
        View findViewById = view.findViewById(R.id.eaa);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.id.video_category_item)");
        this.f108096e = (PublishSettingItem) findViewById;
        this.f108093a = videoCategoryParam;
        String string = view.getResources().getString(R.string.a4y);
        String string2 = view.getResources().getString(R.string.a4z);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("（");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(string2);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("）");
        String sb6 = sb5.toString();
        SpannableString spannableString = new SpannableString(sb6);
        spannableString.setSpan(new TextAppearanceSpan(view.getContext(), R.style.w8), 0, string.length(), 17);
        spannableString.setSpan(new TextAppearanceSpan(view.getContext(), R.style.w7), string.length(), sb6.length(), 17);
        this.f108096e.setBackground(C10774c.m31449e(this.f108094b));
        this.f108096e.setDrawableLeft((int) R.drawable.fe);
        this.f108096e.setTitleSpannable(spannableString);
        this.f108096e.setSubtitle(m132437a());
        this.f108096e.setVisibility(0);
        this.f108096e.setOnClickListener(new C42993bx(this, 600) {

            /* renamed from: a */
            final /* synthetic */ C41593b f108097a;

            /* renamed from: a */
            public final void mo101783a(View view) {
                C7573i.m23587b(view, "v");
                C41616a.m132500a(this.f108097a.f108094b, this.f108097a.f108093a, this.f108097a.f108095c, 6);
                C6907h.m21524a("enter_type_selection", (Map) C38511bc.m123103a().mo96485a("enter_from", "video_post_page").mo96485a("shoot_way", this.f108097a.f108095c.getShootWay()).mo96485a("creation_id", this.f108097a.f108095c.getCreationId()).mo96485a("content_source", "upload").mo96485a("content_type", "video").f100112a);
            }

            {
                this.f108097a = r3;
            }
        });
    }
}
