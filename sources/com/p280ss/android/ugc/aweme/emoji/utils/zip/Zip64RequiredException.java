package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.Zip64RequiredException */
public class Zip64RequiredException extends ZipException {
    private static final long serialVersionUID = 20110809;

    public Zip64RequiredException(String str) {
        super(str);
    }

    static String getEntryTooBigMessage(C27667r rVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(rVar.getName());
        sb.append("'s size exceeds the limit of 4GByte.");
        return sb.toString();
    }
}
