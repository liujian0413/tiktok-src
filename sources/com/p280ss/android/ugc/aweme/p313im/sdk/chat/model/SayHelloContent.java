package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SayHelloContent */
public class SayHelloContent extends BaseContent {
    @C6593c(mo15949a = "stickers")
    private List<Emoji> emoji;
    @C6593c(mo15949a = "hello_text")
    private String helloText;
    @C6593c(mo15949a = "joker_stickers")
    private List<Emoji> jokerEmojis;
    @C6593c(mo15949a = "nickname")
    private String nickname;

    public List<Emoji> getEmoji() {
        return this.emoji;
    }

    public String getHelloText() {
        return this.helloText;
    }

    public List<Emoji> getJokerEmojis() {
        return this.jokerEmojis;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setEmoji(List<Emoji> list) {
        this.emoji = list;
    }

    public void setMsgHint(String str) {
        this.msgHint = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }
}
