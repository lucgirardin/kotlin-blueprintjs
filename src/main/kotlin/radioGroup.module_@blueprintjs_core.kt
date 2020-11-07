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
import React.FormEvent
import global.JSX.Element

external interface IRadioGroupProps : IProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: (event: FormEvent<HTMLInputElement>) -> Unit
    var options: Array<IOptionProps>?
        get() = definedExternally
        set(value) = definedExternally
    var selectedValue: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external open class RadioGroup(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IRadioGroupProps> {
    open var autoGroupName: Any
    override fun render(): Element
    open fun validateProps()
    open var renderChildren: Any
    open var renderOptions: Any
    open var getRadioProps: Any

    companion object {
        var displayName: String
    }
}