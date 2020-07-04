package com.p280ss.android.ugc.aweme.feed.event;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.event.FeedToResumePlayEvent */
public final class FeedToResumePlayEvent {

    /* renamed from: a */
    public EventType f74605a;

    /* renamed from: b */
    public String f74606b;

    /* renamed from: c */
    public long f74607c;

    /* renamed from: d */
    public Context f74608d;

    /* renamed from: e */
    public Aweme f74609e;

    /* renamed from: com.ss.android.ugc.aweme.feed.event.FeedToResumePlayEvent$EventType */
    public enum EventType {
        PUT_VIDEO_POSITION,
        TRY_SHOW_TOAST
    }

    public FeedToResumePlayEvent(EventType eventType, Context context, Aweme aweme) {
        this.f74605a = eventType;
        this.f74608d = context;
        this.f74609e = aweme;
    }

    public FeedToResumePlayEvent(EventType eventType, String str, long j) {
        this.f74605a = eventType;
        this.f74606b = str;
        this.f74607c = j;
    }
}
