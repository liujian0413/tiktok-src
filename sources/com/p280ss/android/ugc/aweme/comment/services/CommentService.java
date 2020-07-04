package com.p280ss.android.ugc.aweme.comment.services;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
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
import com.p280ss.android.ugc.aweme.comment.p1095b.C24087a;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24088b;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24092c;
import com.p280ss.android.ugc.aweme.comment.param.VideoCommentPageParam;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import java.io.File;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.comment.services.CommentService */
public interface CommentService {
    public static final C24217a Companion = C24217a.f63931a;

    /* renamed from: com.ss.android.ugc.aweme.comment.services.CommentService$a */
    public static final class C24217a {

        /* renamed from: a */
        static final /* synthetic */ C24217a f63931a = new C24217a();

        private C24217a() {
        }

        /* renamed from: a */
        public static CommentService m79549a() {
            return (CommentService) ServiceManager.get().getService(CommentService.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.services.CommentService$b */
    public static final class C24218b {
    }

    CommentStruct buildCommentStruct(Aweme aweme);

    void clearAllTranslationCache();

    void fetchPreloadCommentList(String str, long j, int i, int i2, String str2, String str3, int i3, int i4, boolean z, String str4, String str5) throws Exception;

    String getCommentCategory(Comment comment);

    File getCommentShareFile(Context context);

    boolean getCommentShareis1To1(int i, int i2);

    CommentViewModel getCommentViewModel(FragmentActivity fragmentActivity);

    List<TextExtraStruct> getDispalyTextExtraForMoment(Comment comment);

    List<TextExtraStruct> getDisplayLinkTextExtra(Context context, Aweme aweme, CommentStruct commentStruct);

    String getDisplayText(CommentStruct commentStruct);

    List<TextExtraStruct> getDisplayTextExtra(CommentStruct commentStruct);

    List<TextExtraStruct> getDisplayTextExtraForIns(Comment comment);

    String getDisplayTextForIns(Comment comment, Paint paint, int i);

    String getDisplayTextForMoment(Comment comment, Paint paint, int i);

    List<TextExtraStruct> getSearchCommentTextExtra(CommentStruct commentStruct, C7561a<C7581n> aVar);

    String getTextWithGifEmojiDetailTail(Comment comment);

    String getTextWithGifEmojiDetailTail(Comment comment, String str);

    void handleCommentInputPublishSuccess(Context context, Comment comment);

    boolean handleException(Context context, Exception exc, int i, boolean z);

    boolean hasTextExtra(Comment comment);

    void hideCommentList(Context context);

    void hideCommentListImmediately(Context context);

    boolean isCommentListShowing(Context context);

    boolean isCommentShareActivity(Context context);

    boolean isSupportReplyComment();

    C24175a providerCommentDeletePresenter();

    C24178d providerCommentDiggPresenter();

    C24180f providerCommentFetchPresenter();

    C24088b providerCommentInputManager(Fragment fragment, int i, C24222c cVar);

    C24183i providerCommentReplyButtonViewHolder(ViewGroup viewGroup, C24090a aVar);

    C24184j providerCommentReplyListPresenter(String str);

    C24186l providerCommentReplyViewHolder(ViewGroup viewGroup, C24090a aVar);

    C24189o providerCommentViewHolderFollowFeed(ViewGroup viewGroup, C24090a aVar, String str);

    int providerInputLayoutIdForPreLoad();

    C24190p providerReplyCommentDataManager();

    boolean publishSelfSeeComment();

    void sendCloseCommentTabEvent(String str);

    void sendCloseTextEvent(String str, Aweme aweme, long j, String str2);

    void sendCollectEmojiEvent();

    void sendCommentDurationEvent(String str, String str2, String str3, int i, String str4, int i2, long j, String str5, String str6, String str7, String str8);

    void sendCommentEvent(String str, Aweme aweme, JSONObject jSONObject, boolean z, String str2);

    void sendCopyCommentEvent(String str, String str2, String str3, Aweme aweme);

    void sendEmojiClickEvent(String str, int i, String str2, String str3, String str4);

    void sendEmojiToKeyboardEvent(String str, String str2, String str3, String str4);

    void sendEnterCommentEvent(String str, Aweme aweme, String str2, int i, String str3, String str4);

    void sendEnterTextEvent(String str, Aweme aweme, String str2, String str3);

    void sendHideAllReplyEvent(String str, String str2, String str3);

    void sendLikeCommentResultEvent(String str, Aweme aweme, String str2, boolean z, String str3, String str4);

    void sendPostCommentEvent(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7);

    void sendReportCommentEvent(String str, Aweme aweme, String str2, String str3, String str4);

    void sendShowMoreReplyEvent(String str, String str2, String str3);

    void setShouldSetTopWhenOpen(boolean z);

    void setStartLoadTime();

    boolean shouldAddShareCount();

    C24181g showCommentList(Activity activity, Aweme aweme, VideoCommentPageParam videoCommentPageParam);

    C24087a showInputFragment(View view, C0608j jVar, String str, C24221b bVar, C24092c cVar);

    void tryStartCommentShareActivity(Activity activity, Aweme aweme, Comment comment, int i, String str);

    void updateDigg(Comment comment, String str);
}
