package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackOptions */
public final class SearchPullFeedbackOptions extends Message<SearchPullFeedbackOptions, Builder> {
    public static final DefaultValueProtoAdapter<SearchPullFeedbackOptions> ADAPTER = new ProtoAdapter_SearchPullFeedbackOptions();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 4)
    public final List<String> hashtag_tab;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 3)
    public final List<String> sound_tab;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 1)
    public final List<String> top_tab;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 2)
    public final List<String> user_tab;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 5)
    public final List<String> video_tab;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackOptions$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SearchPullFeedbackOptions, Builder> {
        public List<String> hashtag_tab = Internal.newMutableList();
        public List<String> sound_tab = Internal.newMutableList();
        public List<String> top_tab = Internal.newMutableList();
        public List<String> user_tab = Internal.newMutableList();
        public List<String> video_tab = Internal.newMutableList();

        public final SearchPullFeedbackOptions build() {
            SearchPullFeedbackOptions searchPullFeedbackOptions = new SearchPullFeedbackOptions(this.top_tab, this.user_tab, this.sound_tab, this.hashtag_tab, this.video_tab, super.buildUnknownFields());
            return searchPullFeedbackOptions;
        }

        public final Builder hashtag_tab(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.hashtag_tab = list;
            return this;
        }

        public final Builder sound_tab(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.sound_tab = list;
            return this;
        }

        public final Builder top_tab(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.top_tab = list;
            return this;
        }

        public final Builder user_tab(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.user_tab = list;
            return this;
        }

        public final Builder video_tab(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.video_tab = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackOptions$ProtoAdapter_SearchPullFeedbackOptions */
    static final class ProtoAdapter_SearchPullFeedbackOptions extends DefaultValueProtoAdapter<SearchPullFeedbackOptions> {
        public final SearchPullFeedbackOptions redact(SearchPullFeedbackOptions searchPullFeedbackOptions) {
            return searchPullFeedbackOptions;
        }

        public ProtoAdapter_SearchPullFeedbackOptions() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchPullFeedbackOptions.class);
        }

        public final SearchPullFeedbackOptions decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (SearchPullFeedbackOptions) null);
        }

        public final int encodedSize(SearchPullFeedbackOptions searchPullFeedbackOptions) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, searchPullFeedbackOptions.top_tab) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, searchPullFeedbackOptions.user_tab) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, searchPullFeedbackOptions.sound_tab) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, searchPullFeedbackOptions.hashtag_tab) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, searchPullFeedbackOptions.video_tab) + searchPullFeedbackOptions.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, SearchPullFeedbackOptions searchPullFeedbackOptions) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, searchPullFeedbackOptions.top_tab);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, searchPullFeedbackOptions.user_tab);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, searchPullFeedbackOptions.sound_tab);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, searchPullFeedbackOptions.hashtag_tab);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, searchPullFeedbackOptions.video_tab);
            protoWriter.writeBytes(searchPullFeedbackOptions.unknownFields());
        }

        public final SearchPullFeedbackOptions decode(ProtoReader protoReader, SearchPullFeedbackOptions searchPullFeedbackOptions) throws IOException {
            Builder builder;
            SearchPullFeedbackOptions searchPullFeedbackOptions2 = (SearchPullFeedbackOptions) C10938a.m32097a().mo26425a(SearchPullFeedbackOptions.class, searchPullFeedbackOptions);
            if (searchPullFeedbackOptions2 != null) {
                builder = searchPullFeedbackOptions2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            List<String> newMutableList3 = Internal.newMutableList();
            List<String> newMutableList4 = Internal.newMutableList();
            List<String> newMutableList5 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            newMutableList3.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            newMutableList4.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            newMutableList5.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (searchPullFeedbackOptions2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.top_tab = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.user_tab = newMutableList2;
                    }
                    if (!newMutableList3.isEmpty()) {
                        builder.sound_tab = newMutableList3;
                    }
                    if (!newMutableList4.isEmpty()) {
                        builder.hashtag_tab = newMutableList4;
                    }
                    if (!newMutableList5.isEmpty()) {
                        builder.video_tab = newMutableList5;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getHashtagTab() {
        return this.hashtag_tab;
    }

    public final List<String> getSoundTab() {
        return this.sound_tab;
    }

    public final List<String> getTopTab() {
        return this.top_tab;
    }

    public final List<String> getUserTab() {
        return this.user_tab;
    }

    public final List<String> getVideoTab() {
        return this.video_tab;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((unknownFields().hashCode() * 37) + this.top_tab.hashCode()) * 37) + this.user_tab.hashCode()) * 37) + this.sound_tab.hashCode()) * 37) + this.hashtag_tab.hashCode()) * 37) + this.video_tab.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.top_tab = Internal.copyOf("top_tab", this.top_tab);
        builder.user_tab = Internal.copyOf("user_tab", this.user_tab);
        builder.sound_tab = Internal.copyOf("sound_tab", this.sound_tab);
        builder.hashtag_tab = Internal.copyOf("hashtag_tab", this.hashtag_tab);
        builder.video_tab = Internal.copyOf("video_tab", this.video_tab);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.top_tab.isEmpty()) {
            sb.append(", top_tab=");
            sb.append(this.top_tab);
        }
        if (!this.user_tab.isEmpty()) {
            sb.append(", user_tab=");
            sb.append(this.user_tab);
        }
        if (!this.sound_tab.isEmpty()) {
            sb.append(", sound_tab=");
            sb.append(this.sound_tab);
        }
        if (!this.hashtag_tab.isEmpty()) {
            sb.append(", hashtag_tab=");
            sb.append(this.hashtag_tab);
        }
        if (!this.video_tab.isEmpty()) {
            sb.append(", video_tab=");
            sb.append(this.video_tab);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchPullFeedbackOptions{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchPullFeedbackOptions)) {
            return false;
        }
        SearchPullFeedbackOptions searchPullFeedbackOptions = (SearchPullFeedbackOptions) obj;
        if (!unknownFields().equals(searchPullFeedbackOptions.unknownFields()) || !this.top_tab.equals(searchPullFeedbackOptions.top_tab) || !this.user_tab.equals(searchPullFeedbackOptions.user_tab) || !this.sound_tab.equals(searchPullFeedbackOptions.sound_tab) || !this.hashtag_tab.equals(searchPullFeedbackOptions.hashtag_tab) || !this.video_tab.equals(searchPullFeedbackOptions.video_tab)) {
            return false;
        }
        return true;
    }

    public SearchPullFeedbackOptions(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this(list, list2, list3, list4, list5, ByteString.EMPTY);
    }

    public SearchPullFeedbackOptions(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.top_tab = Internal.immutableCopyOf("top_tab", list);
        this.user_tab = Internal.immutableCopyOf("user_tab", list2);
        this.sound_tab = Internal.immutableCopyOf("sound_tab", list3);
        this.hashtag_tab = Internal.immutableCopyOf("hashtag_tab", list4);
        this.video_tab = Internal.immutableCopyOf("video_tab", list5);
    }
}
