package com.p280ss.android.ugc.aweme.p993ae;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.p1001al.C22490b;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photo.publish.PhotoPublishActivity;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMoviePublishActivity;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPublishActivity;
import com.p280ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ae.a */
public final class C22469a implements C22490b {
    /* renamed from: a */
    public final void mo59046a(Activity activity, Intent intent) {
        C7573i.m23587b(activity, "context");
        C7573i.m23587b(intent, "intent");
        intent.setClass(activity, DraftBoxActivity.class);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo59050a(Context context, Intent intent) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(intent, "intent");
        intent.setClass(context, VideoPublishActivity.class);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo59048a(Activity activity, PhotoContext photoContext, int i) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(photoContext, "model");
        PhotoPublishActivity.m112171a(activity, photoContext, 1);
    }

    /* renamed from: a */
    public final void mo59047a(Activity activity, Intent intent, int i) {
        C7573i.m23587b(activity, "context");
        C7573i.m23587b(intent, "intent");
        intent.setClass(activity, VideoPublishActivity.class);
        activity.startActivityForResult(intent, 1002);
    }

    /* renamed from: a */
    public final void mo59049a(Activity activity, PhotoMovieContext photoMovieContext, int i) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(photoMovieContext, "model");
        PhotoMoviePublishActivity.m112334a(activity, photoMovieContext, 1);
    }

    /* renamed from: a */
    public final void mo59051a(Context context, PhotoMovieContext photoMovieContext, List<? extends AVMusic> list) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(photoMovieContext, "model");
        C7573i.m23587b(list, "musicList");
        PhotoMoviePublishActivity.m112335a(context, photoMovieContext, list);
    }
}
