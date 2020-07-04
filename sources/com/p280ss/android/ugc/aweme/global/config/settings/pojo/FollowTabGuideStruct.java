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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FollowTabGuideStruct */
public final class FollowTabGuideStruct extends Message<FollowTabGuideStruct, Builder> {
    public static final DefaultValueProtoAdapter<FollowTabGuideStruct> ADAPTER = new ProtoAdapter_FollowTabGuideStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer follow_tab_guide_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String follow_tab_guide_word;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FollowTabGuideStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FollowTabGuideStruct, Builder> {
        public Integer follow_tab_guide_times;
        public String follow_tab_guide_word;

        public final FollowTabGuideStruct build() {
            return new FollowTabGuideStruct(this.follow_tab_guide_word, this.follow_tab_guide_times, super.buildUnknownFields());
        }

        public final Builder follow_tab_guide_times(Integer num) {
            this.follow_tab_guide_times = num;
            return this;
        }

        public final Builder follow_tab_guide_word(String str) {
            this.follow_tab_guide_word = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FollowTabGuideStruct$ProtoAdapter_FollowTabGuideStruct */
    static final class ProtoAdapter_FollowTabGuideStruct extends DefaultValueProtoAdapter<FollowTabGuideStruct> {
        public final FollowTabGuideStruct redact(FollowTabGuideStruct followTabGuideStruct) {
            return followTabGuideStruct;
        }

        public ProtoAdapter_FollowTabGuideStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowTabGuideStruct.class);
        }

        public final FollowTabGuideStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FollowTabGuideStruct) null);
        }

        public final int encodedSize(FollowTabGuideStruct followTabGuideStruct) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, followTabGuideStruct.follow_tab_guide_word) + ProtoAdapter.INT32.encodedSizeWithTag(2, followTabGuideStruct.follow_tab_guide_times) + followTabGuideStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FollowTabGuideStruct followTabGuideStruct) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followTabGuideStruct.follow_tab_guide_word);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, followTabGuideStruct.follow_tab_guide_times);
            protoWriter.writeBytes(followTabGuideStruct.unknownFields());
        }

        public final FollowTabGuideStruct decode(ProtoReader protoReader, FollowTabGuideStruct followTabGuideStruct) throws IOException {
            Builder builder;
            FollowTabGuideStruct followTabGuideStruct2 = (FollowTabGuideStruct) C10938a.m32097a().mo26425a(FollowTabGuideStruct.class, followTabGuideStruct);
            if (followTabGuideStruct2 != null) {
                builder = followTabGuideStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.follow_tab_guide_word((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.follow_tab_guide_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (followTabGuideStruct2 != null) {
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

    public final Integer getFollowTabGuideTimes() throws NullValueException {
        if (this.follow_tab_guide_times != null) {
            return this.follow_tab_guide_times;
        }
        throw new NullValueException();
    }

    public final String getFollowTabGuideWord() throws NullValueException {
        if (this.follow_tab_guide_word != null) {
            return this.follow_tab_guide_word;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.follow_tab_guide_word = this.follow_tab_guide_word;
        builder.follow_tab_guide_times = this.follow_tab_guide_times;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.follow_tab_guide_word != null) {
            i = this.follow_tab_guide_word.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.follow_tab_guide_times != null) {
            i3 = this.follow_tab_guide_times.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.follow_tab_guide_word != null) {
            sb.append(", follow_tab_guide_word=");
            sb.append(this.follow_tab_guide_word);
        }
        if (this.follow_tab_guide_times != null) {
            sb.append(", follow_tab_guide_times=");
            sb.append(this.follow_tab_guide_times);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowTabGuideStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FollowTabGuideStruct)) {
            return false;
        }
        FollowTabGuideStruct followTabGuideStruct = (FollowTabGuideStruct) obj;
        if (!unknownFields().equals(followTabGuideStruct.unknownFields()) || !Internal.equals(this.follow_tab_guide_word, followTabGuideStruct.follow_tab_guide_word) || !Internal.equals(this.follow_tab_guide_times, followTabGuideStruct.follow_tab_guide_times)) {
            return false;
        }
        return true;
    }

    public FollowTabGuideStruct(String str, Integer num) {
        this(str, num, ByteString.EMPTY);
    }

    public FollowTabGuideStruct(String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.follow_tab_guide_word = str;
        this.follow_tab_guide_times = num;
    }
}
