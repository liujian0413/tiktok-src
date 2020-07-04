package com.p280ss.avframework.livestreamv2.effectcamera.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.model.ComposerNodes */
public class ComposerNodes {
    private List<String> mAppendedNodes = new ArrayList();
    private final Object mAppendedNodesFence = new Object();
    private int mMode;
    private int mNodeNum;
    private String[] mNodePaths;
    private Map<String, ComposerNode> mNodes = new HashMap();
    private int mOrderType;

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.model.ComposerNodes$ComposerNode */
    public class ComposerNode {
        public String nodePath = "";
        public String nodeTag = "";
        public float nodeValue;

        public ComposerNode() {
        }
    }

    public int getComposerMode() {
        return this.mMode;
    }

    public Map<String, ComposerNode> getComposerNodes() {
        return this.mNodes;
    }

    public int getComposerNodesNum() {
        return this.mNodeNum;
    }

    public String[] getComposerNodesPaths() {
        return this.mNodePaths;
    }

    public int getComposerOrderType() {
        return this.mOrderType;
    }

    public String[] getComposerAppendedNodes() {
        synchronized (this.mAppendedNodesFence) {
            if (this.mAppendedNodes.isEmpty()) {
                return null;
            }
            String[] strArr = new String[this.mAppendedNodes.size()];
            int i = 0;
            for (String str : this.mAppendedNodes) {
                int i2 = i + 1;
                strArr[i] = str;
                i = i2;
            }
            return strArr;
        }
    }

    public void setComposerAppendNodes(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            synchronized (this.mAppendedNodesFence) {
                for (String str : strArr) {
                    if (!this.mAppendedNodes.contains(str)) {
                        this.mAppendedNodes.add(str);
                    }
                }
            }
        }
    }

    public void setComposerRemoveNodes(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            synchronized (this.mAppendedNodesFence) {
                for (String str : strArr) {
                    int i = 0;
                    while (i < this.mAppendedNodes.size()) {
                        String str2 = (String) this.mAppendedNodes.get(i);
                        if (!str2.equals(str)) {
                            if (!str2.contains(str)) {
                                i++;
                            }
                        }
                        this.mAppendedNodes.remove(i);
                    }
                }
            }
        }
    }

    public void setComposerMode(int i, int i2) {
        this.mMode = i;
        this.mOrderType = i2;
    }

    public void setComposerNodes(String[] strArr, int i) {
        this.mNodePaths = strArr;
        this.mNodeNum = i;
    }

    public void setComposerUpdateNodes(String str, String str2, float f) {
        ComposerNode composerNode = new ComposerNode();
        composerNode.nodePath = str;
        composerNode.nodeTag = str2;
        composerNode.nodeValue = f;
        this.mNodes.put(str2, composerNode);
    }
}
