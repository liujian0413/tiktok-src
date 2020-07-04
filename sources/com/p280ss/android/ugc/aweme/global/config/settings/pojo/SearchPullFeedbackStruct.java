package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
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
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackStruct */
public final class SearchPullFeedbackStruct extends Message<SearchPullFeedbackStruct, Builder> {
    public static final DefaultValueProtoAdapter<SearchPullFeedbackStruct> ADAPTER = new ProtoAdapter_SearchPullFeedbackStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackOptions#ADAPTER", tag = 4)
    public final SearchPullFeedbackOptions feedback_options;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer freq_per_day;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer freq_per_query;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean is_open_feedback;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SearchPullFeedbackStruct, Builder> {
        public SearchPullFeedbackOptions feedback_options;
        public Integer freq_per_day = Integer.valueOf(1000);
        public Integer freq_per_query = Integer.valueOf(2);
        public Boolean is_open_feedback = Boolean.valueOf(false);

        public final SearchPullFeedbackStruct build() {
            SearchPullFeedbackStruct searchPullFeedbackStruct = new SearchPullFeedbackStruct(this.is_open_feedback, this.freq_per_query, this.freq_per_day, this.feedback_options, super.buildUnknownFields());
            return searchPullFeedbackStruct;
        }

        public final Builder feedback_options(SearchPullFeedbackOptions searchPullFeedbackOptions) {
            this.feedback_options = searchPullFeedbackOptions;
            return this;
        }

        public final Builder freq_per_day(Integer num) {
            this.freq_per_day = num;
            return this;
        }

        public final Builder freq_per_query(Integer num) {
            this.freq_per_query = num;
            return this;
        }

        public final Builder is_open_feedback(Boolean bool) {
            this.is_open_feedback = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackStruct$ProtoAdapter_SearchPullFeedbackStruct */
    static final class ProtoAdapter_SearchPullFeedbackStruct extends DefaultValueProtoAdapter<SearchPullFeedbackStruct> {
        public final SearchPullFeedbackStruct redact(SearchPullFeedbackStruct searchPullFeedbackStruct) {
            return searchPullFeedbackStruct;
        }

        public ProtoAdapter_SearchPullFeedbackStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchPullFeedbackStruct.class);
        }

        public final SearchPullFeedbackStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (SearchPullFeedbackStruct) null);
        }

        public final int encodedSize(SearchPullFeedbackStruct searchPullFeedbackStruct) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, searchPullFeedbackStruct.is_open_feedback) + ProtoAdapter.INT32.encodedSizeWithTag(2, searchPullFeedbackStruct.freq_per_query) + ProtoAdapter.INT32.encodedSizeWithTag(3, searchPullFeedbackStruct.freq_per_day) + SearchPullFeedbackOptions.ADAPTER.encodedSizeWithTag(4, searchPullFeedbackStruct.feedback_options) + searchPullFeedbackStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, SearchPullFeedbackStruct searchPullFeedbackStruct) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, searchPullFeedbackStruct.is_open_feedback);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchPullFeedbackStruct.freq_per_query);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, searchPullFeedbackStruct.freq_per_day);
            SearchPullFeedbackOptions.ADAPTER.encodeWithTag(protoWriter, 4, searchPullFeedbackStruct.feedback_options);
            protoWriter.writeBytes(searchPullFeedbackStruct.unknownFields());
        }

        public final SearchPullFeedbackStruct decode(ProtoReader protoReader, SearchPullFeedbackStruct searchPullFeedbackStruct) throws IOException {
            Builder builder;
            SearchPullFeedbackStruct searchPullFeedbackStruct2 = (SearchPullFeedbackStruct) C10938a.m32097a().mo26425a(SearchPullFeedbackStruct.class, searchPullFeedbackStruct);
            if (searchPullFeedbackStruct2 != null) {
                builder = searchPullFeedbackStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.is_open_feedback((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.freq_per_query((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.freq_per_day((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.feedback_options((SearchPullFeedbackOptions) SearchPullFeedbackOptions.ADAPTER.decode(protoReader, builder.feedback_options));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (searchPullFeedbackStruct2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final SearchPullFeedbackOptions getFeedbackOptions() throws NullValueException {
        if (this.feedback_options != null) {
            return this.feedback_options;
        }
        throw new NullValueException();
    }

    public final Integer getFreqPerDay() throws NullValueException {
        if (this.freq_per_day != null) {
            return this.freq_per_day;
        }
        throw new NullValueException();
    }

    public final Integer getFreqPerQuery() throws NullValueException {
        if (this.freq_per_query != null) {
            return this.freq_per_query;
        }
        throw new NullValueException();
    }

    public final Boolean getIsOpenFeedback() throws NullValueException {
        if (this.is_open_feedback != null) {
            return this.is_open_feedback;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.is_open_feedback = this.is_open_feedback;
        builder.freq_per_query = this.freq_per_query;
        builder.freq_per_day = this.freq_per_day;
        builder.feedback_options = this.feedback_options;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.is_open_feedback != null) {
            i = this.is_open_feedback.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.freq_per_query != null) {
            i2 = this.freq_per_query.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.freq_per_day != null) {
            i3 = this.freq_per_day.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.feedback_options != null) {
            i5 = this.feedback_options.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_open_feedback != null) {
            sb.append(", is_open_feedback=");
            sb.append(this.is_open_feedback);
        }
        if (this.freq_per_query != null) {
            sb.append(", freq_per_query=");
            sb.append(this.freq_per_query);
        }
        if (this.freq_per_day != null) {
            sb.append(", freq_per_day=");
            sb.append(this.freq_per_day);
        }
        if (this.feedback_options != null) {
            sb.append(", feedback_options=");
            sb.append(this.feedback_options);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchPullFeedbackStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchPullFeedbackStruct)) {
            return false;
        }
        SearchPullFeedbackStruct searchPullFeedbackStruct = (SearchPullFeedbackStruct) obj;
        if (!unknownFields().equals(searchPullFeedbackStruct.unknownFields()) || !Internal.equals(this.is_open_feedback, searchPullFeedbackStruct.is_open_feedback) || !Internal.equals(this.freq_per_query, searchPullFeedbackStruct.freq_per_query) || !Internal.equals(this.freq_per_day, searchPullFeedbackStruct.freq_per_day) || !Internal.equals(this.feedback_options, searchPullFeedbackStruct.feedback_options)) {
            return false;
        }
        return true;
    }

    public SearchPullFeedbackStruct(Boolean bool, Integer num, Integer num2, SearchPullFeedbackOptions searchPullFeedbackOptions) {
        this(bool, num, num2, searchPullFeedbackOptions, ByteString.EMPTY);
    }

    public SearchPullFeedbackStruct(Boolean bool, Integer num, Integer num2, SearchPullFeedbackOptions searchPullFeedbackOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_open_feedback = bool;
        this.freq_per_query = num;
        this.freq_per_day = num2;
        this.feedback_options = searchPullFeedbackOptions;
    }
}
