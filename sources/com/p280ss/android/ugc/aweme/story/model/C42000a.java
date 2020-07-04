package com.p280ss.android.ugc.aweme.story.model;

/* renamed from: com.ss.android.ugc.aweme.story.model.a */
public final class C42000a {

    /* renamed from: a */
    public Story f109095a;

    /* renamed from: b */
    public StoryDetail f109096b;

    /* renamed from: b */
    private boolean m133535b() {
        if (this.f109096b == null || !this.f109096b.needDownloadFirstCover()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo103175a() {
        if (this.f109096b == null || m133535b()) {
            return false;
        }
        return true;
    }

    public C42000a(Story story, StoryDetail storyDetail) {
        this.f109095a = story;
        this.f109096b = storyDetail;
    }
}
