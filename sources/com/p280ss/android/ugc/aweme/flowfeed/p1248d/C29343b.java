package com.p280ss.android.ugc.aweme.flowfeed.p1248d;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.abmock.C6384b;
import com.facebook.drawee.p694b.C13364a.C13365a;
import com.p280ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.detail.p1167ui.LiveDetailActivity;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.C28230c;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28458l;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28460m;
import com.p280ss.android.ugc.aweme.feed.p1238ui.HotListBarViewHolder;
import com.p280ss.android.ugc.aweme.feed.p1238ui.HotSpotBarViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29361b;
import com.p280ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p280ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.AbsFollowFeedDetailActivity;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.shortvideo.CurPlayVideoRecord;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.d.b */
public final class C29343b implements C29361b {
    /* renamed from: a */
    public final void mo75041a(TextView textView, int i, int i2, String str, C13365a aVar) {
        C30357c.m99190a(textView, i, 4, str, aVar);
    }

    /* renamed from: a */
    public final void mo75043a(String str) {
        CurPlayVideoRecord.INSTANCE.setVideoId(str);
    }

    /* renamed from: a */
    public final void mo75042a(Aweme aweme, Activity activity, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "eventType");
        C37950a.m121238a().showReportDialog(aweme, str, activity, "");
    }

    /* renamed from: a */
    public final AbsInteractStickerWidget mo75033a() {
        return new InteractStickerWidget();
    }

    /* renamed from: a */
    public final void mo75040a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C27608b.m90502a(textView);
    }

    /* renamed from: a */
    public final void mo75036a(Context context, Aweme aweme) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C28460m mVar = new C28460m(context);
        mVar.mo66536a(new C28458l());
        mVar.mo72198a(aweme, 2);
        mVar.mo56976a(aweme.getAid(), Integer.valueOf(3));
    }

    /* renamed from: a */
    public final C28230c mo75032a(String str, int i, C28343z<C28318an> zVar, C28519d dVar) {
        C7573i.m23587b(zVar, "onInternalEventListener");
        C7573i.m23587b(dVar, "getEnterFromListener");
        return new C28297e(str, i, zVar, dVar);
    }

    /* renamed from: b */
    public final void mo75044b(View view, String str, boolean z, Aweme aweme) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(str, "eventType");
        C7573i.m23587b(aweme, "aweme");
        HotListBarViewHolder hotListBarViewHolder = new HotListBarViewHolder(view, str, false, 4, null);
        hotListBarViewHolder.mo73888a(aweme);
    }

    /* renamed from: a */
    public final void mo75039a(View view, String str, boolean z, Aweme aweme) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(str, "eventType");
        C7573i.m23587b(aweme, "aweme");
        new HotSpotBarViewHolder(view, str, true).mo73893b(aweme);
    }

    /* renamed from: a */
    public final void mo75035a(Context context, IViewInfo iViewInfo, Aweme aweme, String str, String str2) {
        C7573i.m23587b(context, "context");
        AbsFollowFeedDetailActivity.m110065a(context, iViewInfo, aweme, str, str2);
    }

    /* renamed from: a */
    public final void mo75037a(Context context, Aweme aweme, String str, String str2, String str3) {
        C7573i.m23587b(context, "context");
        OriginDetailActivity.m98170a(context, aweme, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo75034a(Context context, IViewInfo iViewInfo, Aweme aweme, int i, String str, String str2, boolean z, boolean z2) {
        Context context2 = context;
        C7573i.m23587b(context, "context");
        AbsFollowFeedDetailActivity.m110064a(context2, iViewInfo, aweme, i, str, str2, false, z2);
    }

    /* renamed from: a */
    public final void mo75038a(Context context, String str, String str2, String str3, int i, int i2, String str4, View view) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(view, "anchorView");
        if (C6384b.m19835a().mo15292a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", C6384b.m19835a().mo15295d().enable_live_in_follow_feed_full_screen, false)) {
            LiveDetailActivity.m86174b(context, str, str2, str3, i, i2, str4, view);
        } else {
            DetailActivity.m86053a(context, str, str2, str3, i, i2, str4, view);
        }
    }
}
