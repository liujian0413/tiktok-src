package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList */
public final class PopupBlackList extends Message<PopupBlackList, Builder> {
    public static final DefaultValueProtoAdapter<PopupBlackList> ADAPTER = new ProtoAdapter_PopupBlackList();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer dimensional;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 2)
    public final List<String> keyword_list;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PopupBlackList, Builder> {
        public Integer dimensional;
        public List<String> keyword_list = Internal.newMutableList();

        public final PopupBlackList build() {
            if (this.dimensional != null) {
                return new PopupBlackList(this.dimensional, this.keyword_list, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.dimensional, "dimensional");
        }

        public final Builder dimensional(Integer num) {
            this.dimensional = num;
            return this;
        }

        public final Builder keyword_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.keyword_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList$ProtoAdapter_PopupBlackList */
    static final class ProtoAdapter_PopupBlackList extends DefaultValueProtoAdapter<PopupBlackList> {
        public final PopupBlackList redact(PopupBlackList popupBlackList) {
            return popupBlackList;
        }

        public ProtoAdapter_PopupBlackList() {
            super(FieldEncoding.LENGTH_DELIMITED, PopupBlackList.class);
        }

        public final PopupBlackList decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (PopupBlackList) null);
        }

        public final int encodedSize(PopupBlackList popupBlackList) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, popupBlackList.dimensional) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, popupBlackList.keyword_list) + popupBlackList.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, PopupBlackList popupBlackList) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, popupBlackList.dimensional);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, popupBlackList.keyword_list);
            protoWriter.writeBytes(popupBlackList.unknownFields());
        }

        public final PopupBlackList decode(ProtoReader protoReader, PopupBlackList popupBlackList) throws IOException {
            Builder builder;
            PopupBlackList popupBlackList2 = (PopupBlackList) C10938a.m32097a().mo26425a(PopupBlackList.class, popupBlackList);
            if (popupBlackList2 != null) {
                builder = popupBlackList2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.dimensional((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (popupBlackList2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.keyword_list = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final Integer getDimensional() {
        return this.dimensional;
    }

    public final List<String> getKeywordList() {
        return this.keyword_list;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.dimensional = this.dimensional;
        builder.keyword_list = Internal.copyOf("keyword_list", this.keyword_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((unknownFields().hashCode() * 37) + this.dimensional.hashCode()) * 37) + this.keyword_list.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", dimensional=");
        sb.append(this.dimensional);
        if (!this.keyword_list.isEmpty()) {
            sb.append(", keyword_list=");
            sb.append(this.keyword_list);
        }
        StringBuilder replace = sb.replace(0, 2, "PopupBlackList{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PopupBlackList)) {
            return false;
        }
        PopupBlackList popupBlackList = (PopupBlackList) obj;
        if (!unknownFields().equals(popupBlackList.unknownFields()) || !this.dimensional.equals(popupBlackList.dimensional) || !this.keyword_list.equals(popupBlackList.keyword_list)) {
            return false;
        }
        return true;
    }

    public PopupBlackList(Integer num, List<String> list) {
        this(num, list, ByteString.EMPTY);
    }

    public PopupBlackList(Integer num, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.dimensional = num;
        this.keyword_list = Internal.immutableCopyOf("keyword_list", list);
    }
}
