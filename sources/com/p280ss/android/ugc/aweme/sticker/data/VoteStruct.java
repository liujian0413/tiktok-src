package com.p280ss.android.ugc.aweme.sticker.data;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.VoteStruct */
public class VoteStruct implements Serializable {
    public List<OptionsBean> options;
    public String question;
    @C6593c(mo15949a = "ref_id")
    public long refId;
    @C6593c(mo15949a = "ref_type")
    public int refType;
    @C6593c(mo15949a = "select_option_id")
    public long selectOptionId;
    @C6593c(mo15949a = "vote_id")
    public long voteId;

    /* renamed from: com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean */
    public static class OptionsBean implements Serializable {
        @C6593c(mo15949a = "option_id")
        public long optionId;
        @C6593c(mo15949a = "option_text")
        public String optionText;
        @C6593c(mo15949a = "option")
        public String postOption;
        @C6593c(mo15949a = "vote_count")
        public long voteCount;

        public long getOptionId() {
            return this.optionId;
        }

        public String getOptionText() {
            return this.optionText;
        }

        public String getPostOption() {
            return this.postOption;
        }

        public long getVoteCount() {
            return this.voteCount;
        }

        public int hashCode() {
            return ((int) this.optionId) * 31;
        }

        public void setOptionId(long j) {
            this.optionId = j;
        }

        public void setOptionText(String str) {
            this.optionText = str;
        }

        public void setPostOption(String str) {
            this.postOption = str;
        }

        public void setVoteCount(long j) {
            this.voteCount = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OptionsBean optionsBean = (OptionsBean) obj;
            if (this.optionText == null ? optionsBean.optionText != null : !this.optionText.equals(optionsBean.optionText)) {
                return false;
            }
            if (this.optionId != optionsBean.optionId || this.voteCount != optionsBean.voteCount) {
                return false;
            }
            if (this.postOption != null) {
                return this.postOption.equals(optionsBean.postOption);
            }
            if (optionsBean.postOption == null) {
                return true;
            }
            return false;
        }
    }

    public List<OptionsBean> getOptions() {
        return this.options;
    }

    public String getQuestion() {
        return this.question;
    }

    public long getRefId() {
        return this.refId;
    }

    public int getRefType() {
        return this.refType;
    }

    public long getSelectOptionId() {
        return this.selectOptionId;
    }

    public long getVoteId() {
        return this.voteId;
    }

    public int hashCode() {
        return ((int) this.voteId) * 31;
    }

    public void setOptions(List<OptionsBean> list) {
        this.options = list;
    }

    public void setQuestion(String str) {
        this.question = str;
    }

    public void setRefId(long j) {
        this.refId = j;
    }

    public void setRefType(int i) {
        this.refType = i;
    }

    public void setSelectOptionId(long j) {
        this.selectOptionId = j;
    }

    public void setVoteId(long j) {
        this.voteId = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoteStruct voteStruct = (VoteStruct) obj;
        if (this.question == null ? voteStruct.question != null : !this.question.equals(voteStruct.question)) {
            return false;
        }
        if (this.voteId != voteStruct.voteId || this.selectOptionId != voteStruct.selectOptionId) {
            return false;
        }
        if (this.options != null) {
            return this.options.equals(voteStruct.options);
        }
        if (voteStruct.options == null) {
            return true;
        }
        return false;
    }
}
