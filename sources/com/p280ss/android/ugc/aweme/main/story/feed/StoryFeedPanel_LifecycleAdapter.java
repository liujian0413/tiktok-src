package com.p280ss.android.ugc.aweme.main.story.feed;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel_LifecycleAdapter */
public class StoryFeedPanel_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final StoryFeedPanel f86081a;

    StoryFeedPanel_LifecycleAdapter(StoryFeedPanel storyFeedPanel) {
        this.f86081a = storyFeedPanel;
    }

    /* renamed from: a */
    public final void mo108a(C0043i iVar, Event event, boolean z, C0051n nVar) {
        boolean z2;
        if (nVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && event == Event.ON_RESUME) {
            if (!z2 || nVar.mo124a("onResume", 2)) {
                this.f86081a.onResume(iVar);
            }
        }
    }
}
