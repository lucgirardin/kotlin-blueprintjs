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

external interface IInputGroupProps : IControlledProps, IIntentProps, IProps {
    var asyncControl: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: dynamic /* IRefObject<HTMLInputElement>? | IRefCallback<HTMLInputElement>? */
        get() = definedExternally
        set(value) = definedExternally
    var leftElement: Element?
        get() = definedExternally
        set(value) = definedExternally
    var leftIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var rightElement: Element?
        get() = definedExternally
        set(value) = definedExternally
    var round: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IInputGroupState {
    var leftElementWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rightElementWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class InputGroup(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<IInputGroupProps /* IInputGroupProps & HTMLInputProps */, IInputGroupState> {
    open var leftElement: Any
    open var rightElement: Any
    open var refHandlers: Any
    override fun render(): Element
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate(prevProps: IInputGroupProps /* IInputGroupProps & HTMLInputProps */)
    override fun validateProps(props: IInputGroupProps)
    open var maybeRenderLeftElement: Any
    open var maybeRenderRightElement: Any
    open var updateInputWidth: Any

    companion object {
        var displayName: String
    }
}