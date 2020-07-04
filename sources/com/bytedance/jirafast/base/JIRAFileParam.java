package com.bytedance.jirafast.base;

import java.io.Serializable;

public class JIRAFileParam implements Serializable {
    public String content;
    public String name;
    public int type;

    public String getContent() {
        return this.content;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public static JIRAFileParam obtainImg(String str) {
        JIRAFileParam jIRAFileParam = new JIRAFileParam();
        jIRAFileParam.setContent(str);
        jIRAFileParam.setName("img");
        jIRAFileParam.setType(2);
        return jIRAFileParam;
    }

    public static JIRAFileParam obtainTxt(String str, String str2) {
        JIRAFileParam jIRAFileParam = new JIRAFileParam();
        jIRAFileParam.setContent(str);
        jIRAFileParam.setName(str2);
        jIRAFileParam.setType(1);
        return jIRAFileParam;
    }

    public static JIRAFileParam obtainTxtFile(String str, String str2) {
        JIRAFileParam jIRAFileParam = new JIRAFileParam();
        jIRAFileParam.setContent(str);
        jIRAFileParam.setName(str2);
        jIRAFileParam.setType(3);
        return jIRAFileParam;
    }

    public static JIRAFileParam obtain(String str, String str2, int i) {
        JIRAFileParam jIRAFileParam = new JIRAFileParam();
        jIRAFileParam.setContent(str2);
        jIRAFileParam.setName(str);
        jIRAFileParam.setType(i);
        return jIRAFileParam;
    }
}
