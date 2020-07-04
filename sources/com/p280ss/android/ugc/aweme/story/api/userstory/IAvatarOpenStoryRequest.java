package com.p280ss.android.ugc.aweme.story.api.userstory;

/* renamed from: com.ss.android.ugc.aweme.story.api.userstory.IAvatarOpenStoryRequest */
public interface IAvatarOpenStoryRequest {

    /* renamed from: com.ss.android.ugc.aweme.story.api.userstory.IAvatarOpenStoryRequest$ErrorType */
    public enum ErrorType {
        EMPTY,
        NET_ERROR,
        TIME_OUT,
        OTHER_ERROR
    }

    /* renamed from: com.ss.android.ugc.aweme.story.api.userstory.IAvatarOpenStoryRequest$State */
    public enum State {
        READY,
        IN_PROGRESS,
        CANCELED,
        FINISHED
    }
}
