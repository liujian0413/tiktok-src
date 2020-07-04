package com.bytedance.vast.model;

import com.bytedance.vast.C13016b;
import com.bytedance.vast.C13017c;
import com.bytedance.vast.C13018d;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Vast implements Serializable, Cloneable {
    public String adSystem;
    public String adTitle;
    public List<AdVerification> adVerificationList;
    public List<Creative> creativeList;
    public String description;
    public Set<String> errorSet;
    public Set<String> impressionSet;
    public Set<String> notViewableSet;
    public String version;
    public Set<String> viewUndeterminedSet;
    public Set<String> viewableSet;

    public Boolean parseContent(String str, int i) {
        return Boolean.valueOf(new C13018d(this).mo31552b(str, i));
    }

    public Boolean parseUri(String str, int i) {
        return Boolean.valueOf(new C13018d(this).mo31551a(str, i));
    }

    public Boolean parseContent(String str, int i, C13016b bVar) {
        return Boolean.valueOf(new C13018d(this, bVar).mo31552b(str, i));
    }

    public Boolean parseUri(String str, int i, C13016b bVar) {
        return Boolean.valueOf(new C13018d(this, bVar).mo31551a(str, i));
    }

    public Boolean parseContent(String str, int i, C13016b bVar, C13017c cVar) {
        return Boolean.valueOf(new C13018d(this, bVar, cVar).mo31552b(str, i));
    }

    public Boolean parseUri(String str, int i, C13016b bVar, C13017c cVar) {
        return Boolean.valueOf(new C13018d(this, bVar, cVar).mo31551a(str, i));
    }
}
