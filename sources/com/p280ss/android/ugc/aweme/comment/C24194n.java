package com.p280ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Paint;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.comment.abtest.C24034b;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentReplyViewHolder;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentViewHolderFollowFeed;
import com.p280ss.android.ugc.aweme.comment.api.C24084a;
import com.p280ss.android.ugc.aweme.comment.api.CommentApi;
import com.p280ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.p280ss.android.ugc.aweme.comment.list.C24175a;
import com.p280ss.android.ugc.aweme.comment.list.C24178d;
import com.p280ss.android.ugc.aweme.comment.list.C24180f;
import com.p280ss.android.ugc.aweme.comment.list.C24181g;
import com.p280ss.android.ugc.aweme.comment.list.C24183i;
import com.p280ss.android.ugc.aweme.comment.list.C24184j;
import com.p280ss.android.ugc.aweme.comment.list.C24186l;
import com.p280ss.android.ugc.aweme.comment.list.C24189o;
import com.p280ss.android.ugc.aweme.comment.list.C24190p;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24087a;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24088b;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24092c;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24103c;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24105d;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24106e;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24108f;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24109g;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24111h;
import com.p280ss.android.ugc.aweme.comment.p1098e.C24117n;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24130a;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24131b;
import com.p280ss.android.ugc.aweme.comment.p1100g.C24135a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24150f;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24151g;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24163l;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentInputFragment;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentListFragment;
import com.p280ss.android.ugc.aweme.comment.param.VideoCommentPageParam;
import com.p280ss.android.ugc.aweme.comment.services.C24221b;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import com.p280ss.android.ugc.aweme.comment.share.C24241b;
import com.p280ss.android.ugc.aweme.comment.share.C24242c.C24243a;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.comment.n */
public final class C24194n implements CommentService {

    /* renamed from: com.ss.android.ugc.aweme.comment.n$a */
    public static final class C24195a implements C0067b {
        C24195a() {
        }

        /* renamed from: a */
        public final <T extends C0063u> T mo149a(Class<T> cls) {
            C7573i.m23587b(cls, "modelClass");
            return (C0063u) new CommentViewModelImpl();
        }
    }

    public final int providerInputLayoutIdForPreLoad() {
        return R.layout.fragment_input_detail;
    }

    public final void sendCollectEmojiEvent() {
        C24130a.m79248a();
    }

    public final void setStartLoadTime() {
        CommentListFragment.m79769r();
    }

    public final boolean shouldAddShareCount() {
        return CommentListFragment.f64030m;
    }

    public final void clearAllTranslationCache() {
        C24135a.m79312a().mo62563b();
    }

    public final boolean isSupportReplyComment() {
        return C24148e.m79342a();
    }

    public final C24190p providerReplyCommentDataManager() {
        return new C24163l();
    }

    public final boolean publishSelfSeeComment() {
        return C24151g.m79362a();
    }

    public final C24175a providerCommentDeletePresenter() {
        C24105d dVar = new C24105d();
        dVar.mo66536a(new C24103c());
        return dVar;
    }

    public final C24178d providerCommentDiggPresenter() {
        C24108f fVar = new C24108f();
        fVar.mo66536a(new C24106e());
        return fVar;
    }

    public final C24180f providerCommentFetchPresenter() {
        C24111h hVar = new C24111h();
        hVar.mo66536a(new C24109g());
        return hVar;
    }

    public final void hideCommentList(Context context) {
        CommentListFragment.m79747b(context);
    }

    public final void hideCommentListImmediately(Context context) {
        CommentListFragment.m79753c(context);
    }

    public final void sendCloseCommentTabEvent(String str) {
        C24130a.m79252a(str);
    }

    public final void setShouldSetTopWhenOpen(boolean z) {
        CommentListFragment.m79735a(z);
    }

    public final File getCommentShareFile(Context context) {
        return C24241b.m79616a(context);
    }

    public final boolean isCommentListShowing(Context context) {
        return CommentListFragment.m79736a(context);
    }

    public final boolean isCommentShareActivity(Context context) {
        return C24241b.m79618b(context);
    }

    public final CommentStruct buildCommentStruct(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        return C24150f.m79358a(aweme);
    }

    public final String getCommentCategory(Comment comment) {
        String a = C24130a.m79247a(comment);
        C7573i.m23582a((Object) a, "CommentStatistics.getCommentCategory(replyComment)");
        return a;
    }

    public final List<TextExtraStruct> getDispalyTextExtraForMoment(Comment comment) {
        C7573i.m23587b(comment, "comment");
        return C24148e.m79348c(comment);
    }

    public final String getDisplayText(CommentStruct commentStruct) {
        C7573i.m23587b(commentStruct, "commentStruct");
        return C24148e.m79339a(commentStruct);
    }

    public final List<TextExtraStruct> getDisplayTextExtra(CommentStruct commentStruct) {
        C7573i.m23587b(commentStruct, "commentStruct");
        return C24148e.m79345b(commentStruct);
    }

    public final List<TextExtraStruct> getDisplayTextExtraForIns(Comment comment) {
        C7573i.m23587b(comment, "comment");
        return C24148e.m79350d(comment);
    }

    public final String getTextWithGifEmojiDetailTail(Comment comment) {
        C7573i.m23587b(comment, "comment");
        return C24148e.m79335a(comment, null, 1, null);
    }

    public final boolean hasTextExtra(Comment comment) {
        C7573i.m23587b(comment, "comment");
        return C24148e.m79352f(comment);
    }

    public final C24184j providerCommentReplyListPresenter(String str) {
        C7573i.m23587b(str, "itemId");
        return new C24117n(str);
    }

    public final CommentViewModel getCommentViewModel(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        C0063u a = C0069x.m160a(fragmentActivity, (C0067b) new C24195a()).mo147a(CommentViewModelImpl.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…iewModelImpl::class.java)");
        return (CommentViewModel) a;
    }

    public final void updateDigg(Comment comment, String str) {
        C24034b.m78869a(comment, str);
    }

    public final boolean getCommentShareis1To1(int i, int i2) {
        return C24243a.m79623a(i, i2);
    }

    public final List<TextExtraStruct> getSearchCommentTextExtra(CommentStruct commentStruct, C7561a<C7581n> aVar) {
        C7573i.m23587b(commentStruct, "commentStruct");
        C7573i.m23587b(aVar, "onLinkTagClick");
        return C24148e.m79341a(commentStruct, aVar);
    }

    public final String getTextWithGifEmojiDetailTail(Comment comment, String str) {
        C7573i.m23587b(comment, "comment");
        C7573i.m23587b(str, "text");
        return C24148e.m79334a(comment, str);
    }

    public final C24183i providerCommentReplyButtonViewHolder(ViewGroup viewGroup, C24090a aVar) {
        C7573i.m23587b(viewGroup, "itemView");
        C7573i.m23587b(aVar, "listener");
        return new CommentReplyButtonViewHolder(viewGroup, aVar);
    }

    public final C24186l providerCommentReplyViewHolder(ViewGroup viewGroup, C24090a aVar) {
        C7573i.m23587b(viewGroup, "itemView");
        C7573i.m23587b(aVar, "listener");
        return new CommentReplyViewHolder(viewGroup, aVar);
    }

    public final void handleCommentInputPublishSuccess(Context context, Comment comment) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(comment, "comment");
        CommentListFragment d = CommentListFragment.m79758d(context);
        if (d == null || !TextUtils.equals(comment.getAwemeId(), d.mo63083g())) {
            C42961az.m136380a(new C24029a(3, new Object[]{comment.getAwemeId(), comment.clone()}));
            return;
        }
        d.mo63086i(comment);
    }

    public final void sendHideAllReplyEvent(String str, String str2, String str3) {
        C24130a.m79277d(str, str2, str3);
    }

    public final void sendShowMoreReplyEvent(String str, String str2, String str3) {
        C24130a.m79278e(str, str2, str3);
    }

    public final String getDisplayTextForIns(Comment comment, Paint paint, int i) {
        C7573i.m23587b(comment, "comment");
        C7573i.m23587b(paint, "paint");
        return C24148e.m79343b(comment, paint, i);
    }

    public final String getDisplayTextForMoment(Comment comment, Paint paint, int i) {
        C7573i.m23587b(comment, "comment");
        C7573i.m23587b(paint, "paint");
        return C24148e.m79333a(comment, paint, i);
    }

    public final C24181g showCommentList(Activity activity, Aweme aweme, VideoCommentPageParam videoCommentPageParam) {
        C7573i.m23587b(videoCommentPageParam, "pageParam");
        return CommentListFragment.m79724a(activity, aweme, videoCommentPageParam);
    }

    public final List<TextExtraStruct> getDisplayLinkTextExtra(Context context, Aweme aweme, CommentStruct commentStruct) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(commentStruct, "commentStruct");
        return C24148e.m79340a(commentStruct, context, aweme);
    }

    public final C24088b providerCommentInputManager(Fragment fragment, int i, C24222c cVar) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(cVar, "service");
        return new C24093d(fragment, i, cVar);
    }

    public final C24189o providerCommentViewHolderFollowFeed(ViewGroup viewGroup, C24090a aVar, String str) {
        C7573i.m23587b(viewGroup, "itemView");
        C7573i.m23587b(aVar, "listener");
        C7573i.m23587b(str, "authorUid");
        return new CommentViewHolderFollowFeed(viewGroup, aVar, str);
    }

    public final void sendCloseTextEvent(String str, Aweme aweme, long j, String str2) {
        C24130a.m79254a(str, aweme, j, str2);
    }

    public final void sendCopyCommentEvent(String str, String str2, String str3, Aweme aweme) {
        C24130a.m79265a(str, str2, str3, aweme);
    }

    public final void sendEmojiToKeyboardEvent(String str, String str2, String str3, String str4) {
        C24130a.m79266a(str, str2, str3, str4);
    }

    public final void sendEnterTextEvent(String str, Aweme aweme, String str2, String str3) {
        C24130a.m79258a(str, aweme, str2, str3);
    }

    public final boolean handleException(Context context, Exception exc, int i, boolean z) {
        return C24084a.m79027a(context, exc, i, z);
    }

    public final void sendCommentEvent(String str, Aweme aweme, JSONObject jSONObject, boolean z, String str2) {
        C24130a.m79261a(str, aweme, jSONObject, z, str2);
    }

    public final void sendEmojiClickEvent(String str, int i, String str2, String str3, String str4) {
        C24130a.m79253a(str, i, str2, str3, str4);
    }

    public final void tryStartCommentShareActivity(Activity activity, Aweme aweme, Comment comment, int i, String str) {
        C24241b.m79617a(activity, aweme, comment, i, str);
    }

    public final void sendReportCommentEvent(String str, Aweme aweme, String str2, String str3, String str4) {
        C7573i.m23587b(aweme, "aweme");
        C24130a.m79259a(str, aweme, str2, str3, str4);
    }

    public final C24087a showInputFragment(View view, C0608j jVar, String str, C24221b bVar, C24092c cVar) {
        CommentInputFragment a = CommentInputFragment.m79656a(view, jVar);
        if (a != null) {
            a.f64011g = str;
            a.mo63063a(bVar);
            a.f64010f = cVar;
        }
        return a;
    }

    public final void sendEnterCommentEvent(String str, Aweme aweme, String str2, int i, String str3, String str4) {
        C24130a.m79256a(str, aweme, str2, i, str3, str4);
    }

    public final void sendLikeCommentResultEvent(String str, Aweme aweme, String str2, boolean z, String str3, String str4) {
        C24130a.m79260a(str, aweme, str2, z, str3, str4);
    }

    public final void sendPostCommentEvent(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        C24130a.m79250a(aweme, str, str2, str3, str4, str5, str6, i, str7);
    }

    public final void sendCommentDurationEvent(String str, String str2, String str3, int i, String str4, int i2, long j, String str5, String str6, String str7, String str8) {
        C24131b.m79283a(str, str2, str3, i, str4, i2, j, str5, str6, str7, str8);
    }

    public final void fetchPreloadCommentList(String str, long j, int i, int i2, String str2, String str3, int i3, int i4, boolean z, String str4, String str5) {
        CommentApi.m79013a(str, j, i, i2, str2, str3, i3, i4, str5);
    }
}
