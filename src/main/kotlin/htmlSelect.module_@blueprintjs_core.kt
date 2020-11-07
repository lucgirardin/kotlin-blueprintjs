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
import React.ChangeEventHandler
import React.SelectHTMLAttributes
import global.JSX.Element

external interface IHTMLSelectProps : IElementRefProps<HTMLSelectElement>, SelectHTMLAttributes<HTMLSelectElement> {
    override var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var iconProps: Any?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minimal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var onChange: ChangeEventHandler<HTMLSelectElement>?
        get() = definedExternally
        set(value) = definedExternally
    var options: Array<dynamic /* String | Number | IOptionProps */>?
        get() = definedExternally
        set(value) = definedExternally
    override var value: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external open class HTMLSelect(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IHTMLSelectProps> {
    override fun render(): Element
}