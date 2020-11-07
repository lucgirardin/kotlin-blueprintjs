@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")


@file:JsModule("@blueprintjs/core")
package com.palantir.blueprintjs

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import global.JSX.Element

external interface IEditableTextProps : IIntentProps, IProps {
    var alwaysRenderInput: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var confirmOnEnterKey: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isEditing: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var multiline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxLines: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minLines: Number?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var selectAllOnFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
    val onCancel: ((value: String) -> Unit)?
    val onChange: ((value: String) -> Unit)?
    val onConfirm: ((value: String) -> Unit)?
    val onEdit: ((value: String?) -> Unit)?
}

external interface IEditableTextState {
    var inputHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inputWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var isEditing: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lastValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class EditableText(props: IEditableTextProps, context: Any = definedExternally) : AbstractPureComponent2__2<IEditableTextProps, IEditableTextState> {
    open var inputElement: Any
    open var valueElement: Any
    open var refHandlers: Any
    override fun render(): Element
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate(prevProps: IEditableTextProps, prevState: IEditableTextState)
    open var cancelEditing: () -> Unit
    open var toggleEditing: () -> Unit
    open var handleFocus: Any
    open var handleTextChange: Any
    open var handleKeyEvent: Any
    open var renderInput: Any
    open var updateInputDimensions: Any

    companion object {
        var displayName: String
        var defaultProps: IEditableTextProps
    }
}