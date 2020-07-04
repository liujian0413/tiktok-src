package com.bytedance.android.livesdk.chatroom.event;

public interface ISendCommentEvent {

    public enum Sender {
        Unknown,
        CommentWidget,
        Lottery
    }
}
