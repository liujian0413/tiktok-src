package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractionCheckInfo */
public class InteractionCheckInfo {
    private List<String> options;
    private String question;

    public List<String> getOptions() {
        return this.options;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setOptions(List<String> list) {
        this.options = list;
    }

    public void setQuestion(String str) {
        this.question = str;
    }
}
