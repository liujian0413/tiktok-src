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
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo */
public final class ProAccountEnableDetailInfo extends Message<ProAccountEnableDetailInfo, Builder> {
    public static final DefaultValueProtoAdapter<ProAccountEnableDetailInfo> ADAPTER = new ProtoAdapter_ProAccountEnableDetailInfo();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct#ADAPTER", label = 2, tag = 3)
    public final List<CategoryStruct> category_list;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryPageTextStruct#ADAPTER", tag = 2)
    public final CategoryPageTextStruct category_page_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer is_proaccount_display;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct#ADAPTER", label = 2, tag = 1)
    public final List<WelcomePageTextStruct> welcome_page_list;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ProAccountEnableDetailInfo, Builder> {
        public List<CategoryStruct> category_list = Internal.newMutableList();
        public CategoryPageTextStruct category_page_text;
        public Integer is_proaccount_display;
        public List<WelcomePageTextStruct> welcome_page_list = Internal.newMutableList();

        public final ProAccountEnableDetailInfo build() {
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = new ProAccountEnableDetailInfo(this.welcome_page_list, this.category_page_text, this.category_list, this.is_proaccount_display, super.buildUnknownFields());
            return proAccountEnableDetailInfo;
        }

        public final Builder category_page_text(CategoryPageTextStruct categoryPageTextStruct) {
            this.category_page_text = categoryPageTextStruct;
            return this;
        }

        public final Builder is_proaccount_display(Integer num) {
            this.is_proaccount_display = num;
            return this;
        }

        public final Builder category_list(List<CategoryStruct> list) {
            Internal.checkElementsNotNull(list);
            this.category_list = list;
            return this;
        }

        public final Builder welcome_page_list(List<WelcomePageTextStruct> list) {
            Internal.checkElementsNotNull(list);
            this.welcome_page_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo$ProtoAdapter_ProAccountEnableDetailInfo */
    static final class ProtoAdapter_ProAccountEnableDetailInfo extends DefaultValueProtoAdapter<ProAccountEnableDetailInfo> {
        public final ProAccountEnableDetailInfo redact(ProAccountEnableDetailInfo proAccountEnableDetailInfo) {
            return proAccountEnableDetailInfo;
        }

        public ProtoAdapter_ProAccountEnableDetailInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ProAccountEnableDetailInfo.class);
        }

        public final ProAccountEnableDetailInfo decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ProAccountEnableDetailInfo) null);
        }

        public final int encodedSize(ProAccountEnableDetailInfo proAccountEnableDetailInfo) {
            return WelcomePageTextStruct.ADAPTER.asRepeated().encodedSizeWithTag(1, proAccountEnableDetailInfo.welcome_page_list) + CategoryPageTextStruct.ADAPTER.encodedSizeWithTag(2, proAccountEnableDetailInfo.category_page_text) + CategoryStruct.ADAPTER.asRepeated().encodedSizeWithTag(3, proAccountEnableDetailInfo.category_list) + ProtoAdapter.INT32.encodedSizeWithTag(4, proAccountEnableDetailInfo.is_proaccount_display) + proAccountEnableDetailInfo.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ProAccountEnableDetailInfo proAccountEnableDetailInfo) throws IOException {
            WelcomePageTextStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, proAccountEnableDetailInfo.welcome_page_list);
            CategoryPageTextStruct.ADAPTER.encodeWithTag(protoWriter, 2, proAccountEnableDetailInfo.category_page_text);
            CategoryStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, proAccountEnableDetailInfo.category_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, proAccountEnableDetailInfo.is_proaccount_display);
            protoWriter.writeBytes(proAccountEnableDetailInfo.unknownFields());
        }

        public final ProAccountEnableDetailInfo decode(ProtoReader protoReader, ProAccountEnableDetailInfo proAccountEnableDetailInfo) throws IOException {
            Builder builder;
            ProAccountEnableDetailInfo proAccountEnableDetailInfo2 = (ProAccountEnableDetailInfo) C10938a.m32097a().mo26425a(ProAccountEnableDetailInfo.class, proAccountEnableDetailInfo);
            if (proAccountEnableDetailInfo2 != null) {
                builder = proAccountEnableDetailInfo2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<WelcomePageTextStruct> newMutableList = Internal.newMutableList();
            List<CategoryStruct> newMutableList2 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(WelcomePageTextStruct.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(WelcomePageTextStruct.class)));
                            break;
                        case 2:
                            builder.category_page_text((CategoryPageTextStruct) CategoryPageTextStruct.ADAPTER.decode(protoReader, builder.category_page_text));
                            break;
                        case 3:
                            newMutableList2.add(CategoryStruct.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(CategoryStruct.class)));
                            break;
                        case 4:
                            builder.is_proaccount_display((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (proAccountEnableDetailInfo2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.welcome_page_list = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.category_list = newMutableList2;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<CategoryStruct> getCategoryList() {
        return this.category_list;
    }

    public final List<WelcomePageTextStruct> getWelcomePageList() {
        return this.welcome_page_list;
    }

    public final CategoryPageTextStruct getCategoryPageText() throws NullValueException {
        if (this.category_page_text != null) {
            return this.category_page_text;
        }
        throw new NullValueException();
    }

    public final Integer getIsProaccountDisplay() throws NullValueException {
        if (this.is_proaccount_display != null) {
            return this.is_proaccount_display;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.welcome_page_list.hashCode()) * 37;
        int i3 = 0;
        if (this.category_page_text != null) {
            i = this.category_page_text.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 37) + this.category_list.hashCode()) * 37;
        if (this.is_proaccount_display != null) {
            i3 = this.is_proaccount_display.hashCode();
        }
        int i4 = hashCode2 + i3;
        this.hashCode = i4;
        return i4;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.welcome_page_list = Internal.copyOf("welcome_page_list", this.welcome_page_list);
        builder.category_page_text = this.category_page_text;
        builder.category_list = Internal.copyOf("category_list", this.category_list);
        builder.is_proaccount_display = this.is_proaccount_display;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.welcome_page_list.isEmpty()) {
            sb.append(", welcome_page_list=");
            sb.append(this.welcome_page_list);
        }
        if (this.category_page_text != null) {
            sb.append(", category_page_text=");
            sb.append(this.category_page_text);
        }
        if (!this.category_list.isEmpty()) {
            sb.append(", category_list=");
            sb.append(this.category_list);
        }
        if (this.is_proaccount_display != null) {
            sb.append(", is_proaccount_display=");
            sb.append(this.is_proaccount_display);
        }
        StringBuilder replace = sb.replace(0, 2, "ProAccountEnableDetailInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProAccountEnableDetailInfo)) {
            return false;
        }
        ProAccountEnableDetailInfo proAccountEnableDetailInfo = (ProAccountEnableDetailInfo) obj;
        if (!unknownFields().equals(proAccountEnableDetailInfo.unknownFields()) || !this.welcome_page_list.equals(proAccountEnableDetailInfo.welcome_page_list) || !Internal.equals(this.category_page_text, proAccountEnableDetailInfo.category_page_text) || !this.category_list.equals(proAccountEnableDetailInfo.category_list) || !Internal.equals(this.is_proaccount_display, proAccountEnableDetailInfo.is_proaccount_display)) {
            return false;
        }
        return true;
    }

    public ProAccountEnableDetailInfo(List<WelcomePageTextStruct> list, CategoryPageTextStruct categoryPageTextStruct, List<CategoryStruct> list2, Integer num) {
        this(list, categoryPageTextStruct, list2, num, ByteString.EMPTY);
    }

    public ProAccountEnableDetailInfo(List<WelcomePageTextStruct> list, CategoryPageTextStruct categoryPageTextStruct, List<CategoryStruct> list2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.welcome_page_list = Internal.immutableCopyOf("welcome_page_list", list);
        this.category_page_text = categoryPageTextStruct;
        this.category_list = Internal.immutableCopyOf("category_list", list2);
        this.is_proaccount_display = num;
    }
}
