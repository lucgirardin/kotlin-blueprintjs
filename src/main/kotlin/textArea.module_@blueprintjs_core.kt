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
import React.TextareaHTMLAttributes
import global.JSX.Element

external interface ITextAreaProps : IIntentProps, IProps, TextareaHTMLAttributes<HTMLTextAreaElement> {
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var growVertically: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: dynamic /* IRefObject<HTMLTextAreaElement>? | IRefCallback<HTMLTextAreaElement>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITextAreaState {
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TextArea(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<ITextAreaProps, ITextAreaState> {
    open var textareaRef: Any
    open var refHandlers: Any
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate(prevProps: ITextAreaProps)
    override fun render(): Element
    open var handleChange: Any

    companion object {
        var displayName: String
    }
}