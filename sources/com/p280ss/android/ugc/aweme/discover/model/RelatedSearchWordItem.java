package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.utils.C23480h;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem */
public class RelatedSearchWordItem implements Serializable {
    public boolean isMobShow;
    @C6593c(mo15949a = "related_img")
    private String relatedImg;
    @C6593c(mo15949a = "related_word")
    private String relatedWord;
    @C6593c(mo15949a = "word_record")
    private Word word;

    public String getRelatedImg() {
        return this.relatedImg;
    }

    public String getRelatedWord() {
        return this.relatedWord;
    }

    public Word getWord() {
        return this.word;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.relatedWord != null) {
            i = this.relatedWord.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 31) * 31;
        if (this.relatedImg != null) {
            i2 = this.relatedImg.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (this.word != null) {
            i3 = this.word.hashCode();
        }
        return i5 + i3;
    }

    public void setRelatedImg(String str) {
        this.relatedImg = str;
    }

    public void setRelatedWord(String str) {
        this.relatedWord = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedSearchWordItem)) {
            return false;
        }
        RelatedSearchWordItem relatedSearchWordItem = (RelatedSearchWordItem) obj;
        if (C23480h.m77087a(this.relatedWord, relatedSearchWordItem.relatedWord) && C23480h.m77087a(this.relatedImg, relatedSearchWordItem.relatedImg)) {
            return C23480h.m77087a(this.word, relatedSearchWordItem.word);
        }
        return false;
    }
}
