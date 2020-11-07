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
import React.FormEventHandler
import React.KeyboardEvent
import global.JSX.Element
import tsstdlib.Readonly

external interface ITagInputProps : IIntentProps, IProps {
    var addOnBlur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var addOnPaste: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: HTMLInputProps?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: ((input: HTMLInputElement?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var inputValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var leftIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var onAdd: ((values: Array<String>, method: String? /* "default" | "blur" | "paste" */) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((values: Array<dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */>) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var onInputChange: FormEventHandler<HTMLInputElement>?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyDown: ((event: KeyboardEvent<HTMLElement>, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyUp: ((event: KeyboardEvent<HTMLElement>, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onRemove: ((value: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var rightElement: Element?
        get() = definedExternally
        set(value) = definedExternally
    var separator: dynamic /* String? | RegExp? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var tagProps: dynamic /* ITagProps? | ((value: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */, index: Number) -> ITagProps)? */
        get() = definedExternally
        set(value) = definedExternally
    var values: Array<dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */>
}

external interface ITagInputPropsPartial : IIntentProps, IProps {
    var addOnBlur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var addOnPaste: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputProps: HTMLInputProps?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: ((input: HTMLInputElement?) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var inputValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var leftIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var onAdd: ((values: Array<String>, method: String? /* "default" | "blur" | "paste" */) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((values: Array<dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */>) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var onInputChange: FormEventHandler<HTMLInputElement>?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyDown: ((event: KeyboardEvent<HTMLElement>, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onKeyUp: ((event: KeyboardEvent<HTMLElement>, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onRemove: ((value: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */, index: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var rightElement: Element?
        get() = definedExternally
        set(value) = definedExternally
    var separator: dynamic /* String? | RegExp? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var tagProps: dynamic /* ITagProps? | ((value: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */, index: Number) -> ITagProps)? */
        get() = definedExternally
        set(value) = definedExternally
    var values: Array<dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITagInputState {
    var activeIndex: Number
    var inputValue: String
    var isInputFocused: Boolean
    var prevInputValueProp: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITagInputStatePartial {
    var activeIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inputValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var isInputFocused: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var prevInputValueProp: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TagInput(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<ITagInputProps, ITagInputState> {
    open var inputElement: Any
    open var refHandlers: Any
    override fun render(): Element
    open var addTags: Any
    open var maybeRenderTag: Any
    open var getNextActiveIndex: Any
    open var findNextIndex: Any
    open var getValues: Any
    open var handleContainerClick: Any
    open var handleContainerBlur: Any
    open var handleInputFocus: Any
    open var handleInputChange: Any
    open var handleInputKeyDown: Any
    open var handleInputKeyUp: Any
    open var handleInputPaste: Any
    open var handleRemoveTag: Any
    open var handleBackspaceToRemove: Any
    open var handleDeleteToRemove: Any
    open var removeIndexFromValues: Any
    open var invokeKeyPressCallback: Any
    open var isValidIndex: Any

    companion object {
        var displayName: String
        var defaultProps: ITagInputPropsPartial
        fun getDerivedStateFromProps(props: Readonly<ITagInputProps>, state: Readonly<ITagInputState>): ITagInputStatePartial?
    }
}